package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;

/* compiled from: EmailActualizationAnalyticsImpl.kt */
/* loaded from: classes5.dex */
public final class obp implements nbp {
    @Override // xsna.nbp
    public final void a(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CHANGE_ACTUAL_EMAIL_TAP, null, Long.valueOf(userId.b), null, null, null, null, 250);
    }

    @Override // xsna.nbp
    public final void b(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ADD_EMAIL_BY_USER_CLOSE_TAP, null, Long.valueOf(userId.b), null, null, null, null, 250);
    }

    @Override // xsna.nbp
    public final void c(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CONFIRM_ACTUAL_EMAIL_CLOSE_TAP, null, Long.valueOf(userId.b), null, null, null, null, 250);
    }

    @Override // xsna.nbp
    public final void d(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ACTUAL_EMAIL_CONFIRMATION_ERROR, null, Long.valueOf(userId.b), null, null, null, null, 250);
    }

    @Override // xsna.nbp
    public final void e(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.AGREE_ACTUAL_EMAIL_TAP, null, Long.valueOf(userId.b), null, null, null, null, 250);
    }

    @Override // xsna.nbp
    public final void f(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ADD_EMAIL_TAP, null, Long.valueOf(userId.b), null, null, null, null, 250);
    }

    @Override // xsna.nbp
    public final void g(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.f(null, SchemeStatSak$EventScreen.ADD_EMAIL_BY_USER, null, false, null, Long.valueOf(userId.b), 29);
    }

    @Override // xsna.nbp
    public final void h(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.g(null, null, null, Long.valueOf(userId.b), 7);
    }

    @Override // xsna.nbp
    public final void i(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ACTUAL_EMAIL_CONFIRMATION_SUCCESS, null, Long.valueOf(userId.b), null, null, null, null, 250);
    }

    @Override // xsna.nbp
    public final void j(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.f(null, SchemeStatSak$EventScreen.CONFIRM_ACTUAL_EMAIL_BY_USER, null, false, null, Long.valueOf(userId.b), 29);
    }
}
