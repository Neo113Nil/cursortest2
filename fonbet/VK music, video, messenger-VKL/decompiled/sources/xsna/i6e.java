package xsna;

/* compiled from: ClipsFeedEngineImpl.kt */
/* loaded from: classes17.dex */
public final class i6e implements nhl {
    public final /* synthetic */ m6e<Object> b;

    public i6e(m6e<Object> m6eVar) {
        this.b = m6eVar;
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        m6e<Object> m6eVar = this.b;
        m6eVar.i.onDestroy();
        m6eVar.c.removeObserver(this);
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
        this.b.i.onPause();
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
        this.b.i.onResume();
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
    }
}
