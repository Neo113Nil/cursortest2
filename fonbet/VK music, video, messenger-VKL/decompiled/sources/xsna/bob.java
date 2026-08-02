package xsna;

/* compiled from: ChatClipsBottomBarDecorationView.kt */
/* loaded from: classes2.dex */
public final class bob implements nhl {
    public final /* synthetic */ ynb b;

    public bob(ynb ynbVar) {
        this.b = ynbVar;
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        ynb ynbVar = this.b;
        io.reactivex.rxjava3.disposables.c cVar = ynbVar.I;
        if (cVar != null) {
            cVar.dispose();
        }
        ynbVar.getViewOwner().getLifecycle().removeObserver(this);
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
