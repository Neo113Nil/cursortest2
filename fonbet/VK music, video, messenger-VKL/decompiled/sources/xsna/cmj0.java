package xsna;

import com.vk.auth.main.AuthModel;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.signupagreement.SignUpAgreementInfo;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import xsna.p66;

/* compiled from: SignUpAgreementPresenter.kt */
/* loaded from: classes15.dex */
public final class cmj0 extends p66<Object> implements amj0, nao0 {
    @Override // xsna.nao0
    public final void U() {
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this.b, jeq0.g(AuthModel.a.b(this.c)));
    }

    @Override // xsna.amj0
    public final void a() {
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CONTINUE_REG_ADD_TAP, null, null, null, null, null, null, 254);
        com.vk.auth.main.e eVar = this.o;
        if (eVar == null) {
            eVar = null;
        }
        SignUpDataHolder signUpDataHolder = eVar.b;
        signUpDataHolder.F = true;
        SignUpAgreementInfo signUpAgreementInfo = signUpDataHolder.E;
        p66.c cVar = this.w;
        if (signUpAgreementInfo == null || !signUpAgreementInfo.c) {
            eVar.j(SignUpRouter.DataScreen.AGREEMENT, cVar);
        } else {
            eVar.b(signUpDataHolder, cVar);
        }
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.UNKNOWN;
    }

    @Override // xsna.nao0
    public final void j() {
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this.b, jeq0.g(AuthModel.a.a(this.c)));
    }
}
