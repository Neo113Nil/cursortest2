package xsna;

import com.vk.auth.main.AuthStatSender;
import com.vk.auth.restore.RestoreNavValue;
import com.vk.auth.restore.RestoreReason;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.states.VkAuthState;
import xsna.oou0;
import xsna.zi6;

/* compiled from: EnterLoginPasswordPresenter.kt */
/* loaded from: classes15.dex */
public final class qop extends zi6<o200> {
    public boolean B;
    public final oou0.a y;
    public String z = "";
    public String A = "";
    public final bpn0 C = new bpn0(new z0h(this, 10));

    public qop(oou0.a aVar) {
        this.y = aVar;
    }

    public final void A0(boolean z) {
        o200 o200Var;
        if (z && (o200Var = (o200) this.a) != null) {
            o200Var.w8(this.z, this.A);
        }
        o200 o200Var2 = (o200) this.a;
        if (o200Var2 != null) {
            o200Var2.i3(drm0.N(this.z) || drm0.N(this.A));
        }
    }

    public final void J1() {
        com.vk.auth.main.b bVar = this.d;
        if (bVar == null) {
            bVar = null;
        }
        bVar.S0(new RestoreReason.ForgetPassword(this.z, null, RestoreNavValue.LOGIN_PASSWORD_SCREEN));
        this.e.c(AuthStatSender.Screen.LOGIN_PASSWORD, AuthStatSender.Status.LOGIN, AuthStatSender.Element.FORGOT_PASSWORD_BUTTON);
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.LOGIN_PASSWORD;
    }

    @Override // xsna.zi6
    public final void y0() {
        o200 o200Var = (o200) this.a;
        if (o200Var != null) {
            o200Var.J1();
        }
    }

    public final void z0() {
        Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
        p66.j0(this, VkAuthState.a.b(this.z, this.A, null, true), new zi6.a(), null, new wze(this, 21), 12);
        this.e.c(AuthStatSender.Screen.LOGIN_PASSWORD, AuthStatSender.Status.LOGIN, AuthStatSender.Element.LOGIN_BUTTON);
    }
}
