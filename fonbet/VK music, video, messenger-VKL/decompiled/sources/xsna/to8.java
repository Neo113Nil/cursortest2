package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.pushes.dto.BusinessNotifyNotificationInfo;
import com.vk.pushes.dto.PushBusinessNotify;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class to8 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ to8(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                BusinessNotifyNotificationInfo businessNotifyNotificationInfo = (BusinessNotifyNotificationInfo) obj;
                Iterable iterable = businessNotifyNotificationInfo.d;
                if (iterable == null) {
                    iterable = EmptyList.b;
                }
                Iterable<PushBusinessNotify> iterable2 = iterable;
                ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
                for (PushBusinessNotify pushBusinessNotify : iterable2) {
                    arrayList.add(new PushBusinessNotify(pushBusinessNotify.b, pushBusinessNotify.c, pushBusinessNotify.d, true));
                }
                BusinessNotifyNotificationInfo businessNotifyNotificationInfo2 = new BusinessNotifyNotificationInfo(businessNotifyNotificationInfo.b, businessNotifyNotificationInfo.c, arrayList);
                wmi0.a.a("push_business_notify_" + this.c, businessNotifyNotificationInfo2);
                break;
            default:
                oio.V1((oio) obj, this.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                break;
        }
        return s3q0.a;
    }
}
