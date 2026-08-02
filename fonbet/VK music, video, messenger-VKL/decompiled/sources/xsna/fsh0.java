package xsna;

import xsna.wqh0;

/* compiled from: CancellableExtensions.kt */
/* loaded from: classes5.dex */
public final class fsh0 implements nhl {
    public final /* synthetic */ f5z b;
    public final /* synthetic */ fq9 c;
    public final /* synthetic */ hsh0 d;

    public fsh0(f5z f5zVar, fq9 fq9Var, hsh0 hsh0Var) {
        this.b = f5zVar;
        this.c = fq9Var;
        this.d = hsh0Var;
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        this.b.getLifecycle().removeObserver(this);
        this.c.cancel();
        this.d.c.C(wqh0.d.b);
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
    }
}
