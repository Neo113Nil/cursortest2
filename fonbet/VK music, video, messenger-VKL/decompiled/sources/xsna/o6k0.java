package xsna;

import android.os.Bundle;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.superapp.api.dto.auth.InitPasswordCheckAccessFactor;
import xsna.wen0;

/* compiled from: SmsCheckAccessPresenter.kt */
/* loaded from: classes15.dex */
public final class o6k0 extends com.vk.auth.verification.base.b<l6k0> implements m6k0 {
    public final String H;
    public final boolean I;

    public o6k0(CodeState codeState, Bundle bundle, CheckPresenterInfo checkPresenterInfo, String str, boolean z) {
        super(codeState, bundle, checkPresenterInfo);
        this.H = str;
        this.I = z;
    }

    @Override // com.vk.auth.verification.base.b
    public final void O0(String str) {
        super.O0(str);
        par0 par0Var = par0.a;
        StringBuilder sb = new StringBuilder("useCode, info=");
        CheckPresenterInfo checkPresenterInfo = this.x;
        sb.append(checkPresenterInfo);
        String sb2 = sb.toString();
        par0Var.getClass();
        par0.a(sb2);
        String str2 = checkPresenterInfo instanceof CheckPresenterInfo.Validation ? ((CheckPresenterInfo.Validation) checkPresenterInfo).d : null;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.t.b(mnh0.C(wen0.a.a(vdx0Var.a(), str, null, str2, 2), this.s, new nl30(this, 27), new ie90(this, 16), null));
    }

    @Override // com.vk.auth.verification.base.b, xsna.l0c
    public final void s(boolean z) {
        super.s(z);
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.t.b(mnh0.C(vdx0Var.a().a(this.H, this.I ? InitPasswordCheckAccessFactor.SMS_CODE : null), this.s, new lxh0(this, 3), new o440(this, 29), null));
    }
}
