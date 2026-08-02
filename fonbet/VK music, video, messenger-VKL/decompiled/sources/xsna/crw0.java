package xsna;

/* compiled from: VoipInviteToScheduledCallView.kt */
/* loaded from: classes7.dex */
public final class crw0 implements nhl {
    public final /* synthetic */ drw0 b;

    public crw0(drw0 drw0Var) {
        this.b = drw0Var;
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        drw0 drw0Var = this.b;
        drw0Var.g.j.dispose();
        drw0Var.c.getLifecycle().removeObserver(drw0Var.m);
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
