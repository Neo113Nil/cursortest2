package yads;

import android.view.View;
import android.widget.ProgressBar;

/* loaded from: classes10.dex */
public final class mk2 implements ew {
    public final View a;
    public final ProgressBar b;
    public final cw c;
    public final kw d;
    public final z30 e;
    public final tk2 f;
    public final long g;
    public final ad2 h = wc2.a(true);
    public final lk2 i;
    public final kk2 j;

    public mk2(View view, ProgressBar progressBar, bm0 bm0Var, kw kwVar, z30 z30Var, tk2 tk2Var, long j) {
        this.a = view;
        this.b = progressBar;
        this.c = bm0Var;
        this.d = kwVar;
        this.e = z30Var;
        this.f = tk2Var;
        this.g = j;
        this.i = new lk2(d(), bm0Var, z30Var);
        this.j = new kk2(progressBar, kwVar, j);
    }

    @Override // yads.ew
    public final void a() {
        this.h.d();
    }

    @Override // yads.ew
    public final void b() {
        this.h.b();
    }

    @Override // yads.ew
    public final void c() {
        kw kwVar = this.d;
        ProgressBar progressBar = this.b;
        int i = (int) this.g;
        int i2 = (int) this.f.a;
        kwVar.getClass();
        progressBar.setMax(i);
        progressBar.setVisibility(0);
        progressBar.setProgress(i2);
        long max = Math.max(0L, this.g - this.f.a);
        if (max != 0) {
            this.c.a(this.a);
            ad2 ad2Var = this.h;
            ad2Var.e = this.j;
            ad2Var.a(max, this.i);
            this.e.a(y30.d);
        }
    }

    public final View d() {
        return this.a;
    }

    @Override // yads.ew
    public final void invalidate() {
        this.h.a();
    }
}
