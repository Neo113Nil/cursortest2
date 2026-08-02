package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;

/* compiled from: OnePassPromoAnalyticsImpl.kt */
/* loaded from: classes5.dex */
public final class fj80 implements ej80 {
    @Override // xsna.ej80
    public final void a() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ONEPASS_CONNECT_CANCEL_TAP, null, null, null, null, null, null, 254);
    }

    @Override // xsna.ej80
    public final void b() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ONEPASS_CONNECT_AGREE_TAP, null, null, null, null, null, null, 254);
    }

    @Override // xsna.ej80
    public final void c() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.f(null, SchemeStatSak$EventScreen.PROMO_ONEPASS, null, false, null, null, 61);
    }
}
