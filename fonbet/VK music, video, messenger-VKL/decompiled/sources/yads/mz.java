package yads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import xsna.epx;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class mz implements zf0 {
    public final v9 a;
    public final b2 b;
    public final z3 c;
    public final e52 d;
    public final o73 e;
    public final hi0 f;
    public final nz g;
    public final ig1 h;
    public by0 i;
    public lz j;

    public /* synthetic */ mz(v9 v9Var, b2 b2Var, z3 z3Var, e52 e52Var, o73 o73Var, hi0 hi0Var) {
        this(v9Var, b2Var, z3Var, e52Var, o73Var, hi0Var, new nz(), new ig1());
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        lz lzVar = new lz(this);
        this.b.b.add(lzVar);
        this.j = lzVar;
        ig1 ig1Var = this.h;
        ig1Var.a.getClass();
        View findViewWithTag = viewGroup.findViewWithTag("linear_progress_view");
        ProgressBar progressBar = findViewWithTag instanceof ProgressBar ? (ProgressBar) findViewWithTag : null;
        mn2 mn2Var = ig1Var.c;
        qcy qcyVar = ig1.d[0];
        mn2Var.getClass();
        mn2Var.a = new WeakReference(progressBar);
        nz nzVar = this.g;
        v9 v9Var = this.a;
        z3 z3Var = this.c;
        e52 e52Var = this.d;
        o73 o73Var = this.e;
        hi0 hi0Var = this.f;
        ig1 ig1Var2 = this.h;
        nzVar.getClass();
        f72 f72Var = e52Var.a;
        q82 q82Var = e52Var.b;
        String str = hi0Var != null ? hi0Var.a : null;
        fg0[] fg0VarArr = fg0.b;
        by0 f42Var = epx.f(str, "pack_shot") ? new f42(z3Var, o73Var, ig1Var2) : f72Var != null ? new e72(f72Var, z3Var, ig1Var2, v9Var.s) : q82Var != null ? new p82(q82Var, z3Var) : new f42(z3Var, o73Var, ig1Var2);
        f42Var.start();
        this.i = f42Var;
    }

    @Override // yads.zf0
    public final void c() {
        lz lzVar = this.j;
        if (lzVar != null) {
            this.b.b.remove(lzVar);
        }
        by0 by0Var = this.i;
        if (by0Var != null) {
            by0Var.invalidate();
        }
        mn2 mn2Var = this.h.c;
        qcy qcyVar = ig1.d[0];
        mn2Var.getClass();
        mn2Var.a = new WeakReference(null);
    }

    public mz(v9 v9Var, b2 b2Var, z3 z3Var, e52 e52Var, o73 o73Var, hi0 hi0Var, nz nzVar, ig1 ig1Var) {
        this.a = v9Var;
        this.b = b2Var;
        this.c = z3Var;
        this.d = e52Var;
        this.e = o73Var;
        this.f = hi0Var;
        this.g = nzVar;
        this.h = ig1Var;
    }
}
