package xsna;

import com.vk.auth.main.AuthStatSender;
import com.vk.auth.validation.fullscreen.helper.PhoneValidationPendingEvent;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;

/* compiled from: PhoneValidationSuccessPresenter.kt */
/* loaded from: classes15.dex */
public final class f4a0 extends p66<Object> {
    public final PhoneValidationPendingEvent x;

    public f4a0(PhoneValidationPendingEvent phoneValidationPendingEvent) {
        this.x = phoneValidationPendingEvent;
        if (phoneValidationPendingEvent instanceof PhoneValidationPendingEvent.Success) {
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            bVar.getClass();
            com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.ALERT_PHONE_SUCCESS_VERIFICATION, null, null, null, 30);
        } else {
            com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
            bVar2.getClass();
            com.vk.registration.funnels.b.z(bVar2, SchemeStatSak$EventScreen.ALERT_SUCCESS_UNLINK_PHONE_NUMBER, null, null, null, 30);
        }
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return this.x instanceof PhoneValidationPendingEvent.Success ? AuthStatSender.Screen.SUCCESS_VALIDATE_PHONE : AuthStatSender.Screen.SUCCESS_UNLINK_PHONE;
    }
}
