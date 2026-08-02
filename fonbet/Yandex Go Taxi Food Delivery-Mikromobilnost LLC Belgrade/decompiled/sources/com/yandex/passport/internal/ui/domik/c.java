package com.yandex.passport.internal.ui.domik;

import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.properties.LoginProperties;

/* loaded from: classes2.dex */
public final class c {
    public static AuthTrack a(LoginProperties loginProperties) {
        AnalyticsFromValue analyticsFromValue;
        AnalyticsFromValue.Companion.getClass();
        analyticsFromValue = AnalyticsFromValue.LOGIN;
        return new AuthTrack(loginProperties, null, null, false, null, null, null, null, null, null, analyticsFromValue, null, true, null, null, null, null, UnsubscribeMailingStatus.NOT_SHOWED, false);
    }

    public static /* synthetic */ AuthTrack b(c cVar, LoginProperties loginProperties) {
        cVar.getClass();
        return a(loginProperties);
    }
}
