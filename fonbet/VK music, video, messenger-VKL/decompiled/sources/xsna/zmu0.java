package xsna;

import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.b;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;

/* compiled from: VkConsciousRegistrationPresenter.kt */
/* loaded from: classes15.dex */
public final class zmu0 extends p66<Object> implements xmu0 {
    public final q1z x;

    public zmu0(q1z q1zVar) {
        this.x = q1zVar;
    }

    @Override // xsna.xmu0
    public final void a() {
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CONTINUE_TAP, null, null, null, null, null, null, 254);
        com.vk.auth.main.e eVar = this.o;
        if (eVar == null) {
            eVar = null;
        }
        eVar.h();
    }

    @Override // xsna.xmu0
    public final void e0() {
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CHOOSE_ANOTHER_ACCOUNT_TAP, null, null, null, null, null, null, 254);
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        if (signUpDataHolder.z) {
            com.vk.auth.main.b bVar = this.d;
            (bVar != null ? bVar : null).B0().finish();
        } else {
            com.vk.auth.main.b bVar2 = this.d;
            if (bVar2 == null) {
                bVar2 = null;
            }
            b.a.a(bVar2, false, false, null, 6);
        }
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.UNKNOWN;
    }

    @Override // xsna.xmu0
    public final void v(String str) {
        par0.a.getClass();
        par0.e("[VkConsciousRegistrationPresenter] show legal info url");
        this.x.a(str);
    }
}
