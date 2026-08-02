package defpackage;

import com.yandex.go.splash.preload.c;

/* loaded from: classes13.dex */
public final class jpe0 implements hpe0 {
    public final /* synthetic */ c a;

    public jpe0(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.hpe0
    public final void D9(boolean z) {
        yce yceVar = new yce(z, 25);
        gpe0 gpe0Var = this.a.b;
        gpe0Var.e.setEnabled(false);
        cma1.b(0.0f, gpe0Var.a).withEndAction(new yo90(16, gpe0Var, yceVar)).start();
    }

    @Override // defpackage.hpe0
    public final void close() {
        c cVar = this.a;
        if (cVar.c.getVisibility() == 0) {
            cma1.b(0.0f, cVar.b.a).withEndAction(new ipe0(cVar, 1)).start();
        } else {
            cVar.c.post(new ipe0(cVar, 0));
        }
    }

    @Override // defpackage.hpe0
    public final void showLoading() {
        vld0 vld0Var = new vld0(14);
        gpe0 gpe0Var = this.a.b;
        gpe0Var.e.setEnabled(false);
        cma1.b(0.0f, gpe0Var.a).withEndAction(new yo90(16, gpe0Var, vld0Var)).start();
    }
}
