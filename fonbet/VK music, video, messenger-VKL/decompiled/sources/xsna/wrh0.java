package xsna;

/* compiled from: SearchFeatureQueryViewDelegateBinding.kt */
/* loaded from: classes5.dex */
public final class wrh0 implements nhl {
    public final /* synthetic */ zrh0 b;

    public wrh0(zrh0 zrh0Var) {
        this.b = zrh0Var;
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        f5zVar.getLifecycle().removeObserver(this);
        zrh0 zrh0Var = this.b;
        if (zrh0Var.f) {
            return;
        }
        zrh0Var.f = true;
        zrh0Var.b.a(null);
        owi.b(zrh0Var);
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
