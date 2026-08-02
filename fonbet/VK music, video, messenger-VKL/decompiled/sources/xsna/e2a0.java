package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;

/* compiled from: PhoneActualizationAnalyticsImpl.kt */
/* loaded from: classes5.dex */
public final class e2a0 implements d2a0 {
    @Override // xsna.d2a0
    public final void a(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CHANGE_ACTUAL_PHONE_TAP, null, Long.valueOf(userId.b), null, null, null, null, 250);
    }

    @Override // xsna.d2a0
    public final void b(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.AGREE_ACTUAL_PHONE_TAP, null, Long.valueOf(userId.b), null, null, null, null, 250);
    }

    @Override // xsna.d2a0
    public final void c(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.g(null, null, null, Long.valueOf(userId.b), 7);
    }

    @Override // xsna.d2a0
    public final void d(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.f(null, SchemeStatSak$EventScreen.CONFIRM_ACTUAL_PHONE_BY_USER, null, false, null, Long.valueOf(userId.b), 29);
    }

    @Override // xsna.d2a0
    public final void e(UserId userId) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CONFIRM_ACTUAL_PHONE_BY_USER_CLOSE_TAP, null, Long.valueOf(userId.b), null, null, null, null, 250);
    }
}
