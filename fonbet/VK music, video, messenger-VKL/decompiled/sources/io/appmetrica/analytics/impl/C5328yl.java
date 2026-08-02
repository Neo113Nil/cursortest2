package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.dwm0;

@DoNotInline
@TargetApi(23)
/* renamed from: io.appmetrica.analytics.impl.yl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5328yl {
    public static final C5328yl a = new C5328yl();

    private C5328yl() {
    }

    public static final List<C5176sl> a(Context context) {
        List<SubscriptionInfo> list = (List) SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new dwm0(4));
        if (list == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer a2 = AndroidUtils.isApiAchieved(29) ? C5353zl.a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer b = AndroidUtils.isApiAchieved(29) ? C5353zl.b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C5176sl(a2, b, z, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }
}
