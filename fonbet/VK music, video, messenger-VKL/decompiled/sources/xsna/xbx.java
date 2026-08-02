package xsna;

/* compiled from: InteractiveStatisticController.kt */
/* loaded from: classes3.dex */
public final class xbx implements k2b0 {
    public final /* synthetic */ wbx b;

    public xbx(wbx wbxVar) {
        this.b = wbxVar;
    }

    @Override // xsna.k2b0
    public final void q(com.vk.movika.sdk.player.base.model.a aVar) {
        wbx wbxVar = this.b;
        lpt0 lpt0Var = wbxVar.f.get(aVar != null ? aVar.b : null);
        String str = lpt0Var != null ? lpt0Var.b : null;
        if (str == null || epx.f(wbxVar.e, str)) {
            return;
        }
        wbxVar.c();
        wbxVar.f(wbxVar.b, str);
    }

    @Override // xsna.k2b0
    public final void r(com.vk.movika.sdk.player.base.model.a aVar, long j) {
        wbx wbxVar = this.b;
        wbxVar.c();
        wbxVar.f(wbxVar.b, wbxVar.e);
        wbx.a(wbxVar);
    }

    @Override // xsna.k2b0
    public final void w(com.vk.movika.sdk.player.base.model.a aVar) {
        wbx wbxVar = this.b;
        lpt0 lpt0Var = wbxVar.f.get(aVar != null ? aVar.b : null);
        String str = lpt0Var != null ? lpt0Var.b : null;
        if (str == null || epx.f(wbxVar.e, str)) {
            return;
        }
        ybx ybxVar = wbxVar.g;
        if (ybxVar != null) {
            g4b0 g4b0Var = ybxVar.i;
            if (g4b0Var == null) {
                g4b0Var = ybxVar.j;
            }
            if (g4b0Var != null) {
                ybx.A("next_movie", g4b0Var).setCustom("param", str).log();
            }
        }
        wbxVar.e = str;
        wbx.a(wbxVar);
    }

    @Override // xsna.k2b0
    public final void t(com.vk.movika.sdk.player.base.model.a aVar) {
    }

    @Override // xsna.k2b0
    public final void v(com.vk.movika.sdk.player.base.model.a aVar) {
    }

    @Override // xsna.k2b0
    public final void d(com.vk.movika.sdk.player.base.model.a aVar, long j) {
    }
}
