package xsna;

import com.ironsource.X3;
import xsna.j11;
import xsna.kel0;
import xsna.ov50;
import xsna.ydl0;

/* compiled from: MyTargetStickyBannerAd.kt */
/* loaded from: classes6.dex */
public final class xs50 implements ov50.b {
    public final /* synthetic */ ys50 a;

    public xs50(ys50 ys50Var) {
        this.a = ys50Var;
    }

    @Override // xsna.ov50.b
    public final void a() {
        ydl0.a aVar = this.a.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // xsna.ov50.b
    public final void b() {
        ydl0.a aVar = this.a.b;
        if (aVar != null) {
            aVar.onClick();
        }
    }

    @Override // xsna.ov50.b
    public final void c(iaz0 iaz0Var) {
        ydl0.a aVar = this.a.b;
        if (aVar != null) {
            aVar.b(new j11.b(iaz0Var.a, iaz0Var.b));
        }
    }

    @Override // xsna.ov50.b
    public final void d(nv50 nv50Var) {
        String str = nv50Var.g;
        if (str == null) {
            str = "";
        }
        ydl0.b.AbstractC4094b.a aVar = new ydl0.b.AbstractC4094b.a(new kel0.a(str, nv50Var.i, nv50Var.j, nv50Var.n, nv50Var.h, nv50Var.o, nv50Var.l, epx.f(nv50Var.a, X3.i.U), nv50Var.c, nv50Var.d));
        ys50 ys50Var = this.a;
        ys50Var.d = aVar;
        ydl0.a aVar2 = ys50Var.b;
        if (aVar2 != null) {
            aVar2.c(ys50Var, aVar);
        }
    }
}
