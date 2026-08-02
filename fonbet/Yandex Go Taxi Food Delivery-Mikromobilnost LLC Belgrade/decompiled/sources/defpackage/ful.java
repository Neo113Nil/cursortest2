package defpackage;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.x0;
import core.divkit.view.DivViewLayout;
import flex.engine.a;

/* loaded from: classes9.dex */
public final class ful extends v0x {
    public final b3k c;
    public final w0j d;
    public final eul e;
    public final vol f;
    public final rzl g;
    public final l3k h;

    public ful(b3k b3kVar, cyl cylVar, w0j w0jVar, eul eulVar, vol volVar, lb7 lb7Var, a851 a851Var) {
        this.c = b3kVar;
        this.d = w0jVar;
        this.e = eulVar;
        this.f = volVar;
        this.g = lb7Var;
        this.h = new l3k(cylVar, a851Var);
    }

    @Override // defpackage.v0x
    public final void b(x0 x0Var, u0x u0xVar) {
        cul culVar = (cul) x0Var;
        aul aulVar = (aul) u0xVar;
        xvl xvlVar = aulVar.a;
        bul bulVar = new bul(aulVar.k);
        mw5 mw5Var = aulVar.p;
        culVar.getClass();
        vol volVar = culVar.O;
        dee a = volVar != null ? volVar.a(culVar.N) : null;
        culVar.P = a;
        if (a != null) {
            a.c = mw5Var;
            a.b(xvlVar.b.a, xvlVar.c, new d8(17, bulVar));
        }
        culVar.R = aulVar.a.a;
    }

    @Override // defpackage.v0x
    public final x0 d(ViewGroup viewGroup) {
        cul c = this.e.c(l3k.b(this.h, this.c.a(viewGroup.getContext(), this.d), new ViewGroup.LayoutParams(-1, -2)));
        c.O = this.f;
        c.Q = this.g;
        return c;
    }

    @Override // defpackage.v0x
    public final void f(x0 x0Var) {
        cul culVar = (cul) x0Var;
        w0j w0jVar = this.d;
        ((a) w0jVar.b).m().a(culVar);
        a aVar = (a) w0jVar.b;
        if (aVar.m().w.a(Lifecycle.State.STARTED)) {
            culVar.onStart(w0jVar);
        }
        if (aVar.m().w.a(Lifecycle.State.RESUMED)) {
            culVar.onResume(w0jVar);
        }
    }

    @Override // defpackage.v0x
    public final void g(x0 x0Var) {
        ((a) this.d.b).m().d((cul) x0Var);
    }

    @Override // defpackage.v0x
    public final void h(x0 x0Var) {
        cul culVar = (cul) x0Var;
        DivViewLayout divViewLayout = culVar.N;
        dee deeVar = culVar.P;
        if (deeVar != null) {
            deeVar.a();
        }
        culVar.P = null;
        divViewLayout.getDivView().setActionHandler(null);
        divViewLayout.getDivView().releaseMedia();
        divViewLayout.getDivView().cleanup();
    }
}
