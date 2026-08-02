package xsna;

import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import xsna.sl90;

/* compiled from: PasskeyCheckPresenter.kt */
/* loaded from: classes15.dex */
public final class xl90 extends p66<ul90>.a {
    public final /* synthetic */ wl90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl90(wl90 wl90Var) {
        super();
        this.n = wl90Var;
    }

    @Override // xsna.p66.a, xsna.ipj0, io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.CONFIRM_AUTH_FAILED, null, null, null, 30);
        wl90 wl90Var = this.n;
        sl90.a y0 = wl90Var.y0();
        ul90 ul90Var = (ul90) wl90Var.a;
        if (ul90Var != null) {
            ul90Var.Yl(y0);
        }
        super.onError(th);
    }
}
