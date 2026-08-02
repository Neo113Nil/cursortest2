package xsna;

import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.verification.base.CheckPresenterInfo;
import io.reactivex.rxjava3.internal.functions.a;
import xsna.wfn0;

/* compiled from: EmailCheckPresenter.kt */
/* loaded from: classes15.dex */
public final class fcp extends com.vk.auth.verification.base.b<dcp> implements ccp {
    public String H;

    @Override // com.vk.auth.verification.base.b
    public final void H0(vbu0 vbu0Var) {
        super.H0(vbu0Var);
        CheckPresenterInfo checkPresenterInfo = this.x;
        CheckPresenterInfo.SignUp signUp = checkPresenterInfo instanceof CheckPresenterInfo.SignUp ? (CheckPresenterInfo.SignUp) checkPresenterInfo : null;
        q55 q55Var = q55.a;
        SignUpDataHolder signUpDataHolder = q55.c().a;
        VerificationScreenData verificationScreenData = signUp != null ? signUp.b : null;
        VerificationScreenData.Email email = verificationScreenData instanceof VerificationScreenData.Email ? (VerificationScreenData.Email) verificationScreenData : null;
        signUpDataHolder.d = email != null ? email.b : null;
        q55.c().a.J = vbu0Var.h;
    }

    @Override // com.vk.auth.verification.base.b
    public final void O0(String str) {
        super.O0(str);
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.t.b(mnh0.B(w0(vdx0Var.e().j(this.H, str), true), this.s, new wzf(this, 14), new bjk(this, 4), new ngl(null, null, null, null, new op0(this, 11), null, null, null, null, null, 1007)));
    }

    @Override // com.vk.auth.verification.base.b, xsna.l0c
    public final void s(boolean z) {
        super.s(z);
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        io.reactivex.rxjava3.core.q a = wfn0.a.a(vdx0Var.e(), this.H, null, 6);
        zl0 zl0Var = new zl0(new dxh(this, 11), 26);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.t.b(mnh0.B(w0(new io.reactivex.rxjava3.internal.operators.observable.p1(a.E(zl0Var, lVar, kVar, kVar).U(new c7(new d0k(7), 28)), new e7(new dkg(this, 13), 23)), true), this.s, new qpj(this, 8), new y90(28), null));
    }
}
