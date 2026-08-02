package xsna;

/* compiled from: CancellableExtensions.kt */
/* loaded from: classes5.dex */
public final class frh0 implements nhl {
    public final /* synthetic */ f5z b;
    public final /* synthetic */ fq9 c;

    public frh0(f5z f5zVar, fq9 fq9Var) {
        this.b = f5zVar;
        this.c = fq9Var;
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        this.b.getLifecycle().removeObserver(this);
        this.c.cancel();
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
