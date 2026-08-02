package xsna;

import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;

/* compiled from: SilentAuthByLoginAnalyticsImpl.kt */
/* loaded from: classes11.dex */
public final class vmj0 implements umj0 {
    @Override // xsna.umj0
    public final void a() {
        String str = RegistrationStatParamsFactory.b;
        RegistrationStatParamsFactory.AnalyticsFlowSource analyticsFlowSource = RegistrationStatParamsFactory.AnalyticsFlowSource.SILENT_AUTH_BY_LOGIN;
        String h = RegistrationStatParamsFactory.AnalyticsFlowSource.MULTIACCOUNT.h();
        if (h == null) {
            h = "";
        }
        if (str == null || drm0.N(str)) {
            RegistrationStatParamsFactory.a.a(analyticsFlowSource);
        } else if (drm0.D(str, h, false)) {
            RegistrationStatParamsFactory.a.a(analyticsFlowSource);
        } else {
            RegistrationStatParamsFactory.b = analyticsFlowSource.h();
        }
    }
}
