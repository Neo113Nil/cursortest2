package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;

/* compiled from: PasswordInputStatHandler.kt */
/* loaded from: classes5.dex */
public final class jm90 {
    public boolean a;
    public boolean b;

    public final void a() {
        if (this.b) {
            com.vk.registration.funnels.b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PASSWORD_AUTOFILL, null, null, null, null, null, null, 254);
            this.b = false;
            return;
        }
        if (this.a) {
            return;
        }
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INPUT_PASSWORD_INTERACTION, null, null, null, null, null, null, 254);
        this.a = true;
    }
}
