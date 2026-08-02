package xsna;

import kotlin.LazyThreadSafetyMode;
import xsna.ly40;

/* compiled from: PlaybackAnalyticsPlayerListener.kt */
/* loaded from: classes3.dex */
public final class tva0 extends vtl {
    public final Object c;

    public tva0(ex40 ex40Var, uw1 uw1Var, px40 px40Var) {
        super(px40Var);
        this.c = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.tools.controls.seekbar.f(18, ex40Var, uw1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vtl, xsna.px40
    public final void D(v0q<? extends kw40> v0qVar) {
        vva0 vva0Var = (vva0) this.c.getValue();
        uva0 uva0Var = (uva0) vva0Var.f.getValue();
        uva0Var.getClass();
        iwa0 a = uva0Var.a(v0qVar.a(), ((ry40) v0qVar).c);
        asu0.a.getClass();
        asu0.x().execute(new g5m(vva0Var, a, true));
        ((nn40) vva0Var.e.getValue()).a(a);
        super.D(v0qVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vtl, xsna.px40
    public final void i(ly40 ly40Var) {
        vva0 vva0Var = (vva0) this.c.getValue();
        vva0Var.getClass();
        ly40.a aVar = ly40Var.c;
        aVar.getClass();
        if (!aVar.equals((ly40.a) ly40.a.c.getValue())) {
            uva0 uva0Var = (uva0) vva0Var.f.getValue();
            uva0Var.getClass();
            iwa0 a = uva0Var.a(aVar.b, aVar.a);
            asu0.a.getClass();
            asu0.x().execute(new g5m(vva0Var, a, false));
            ((nn40) vva0Var.e.getValue()).a(a);
        }
        super.i(ly40Var);
    }
}
