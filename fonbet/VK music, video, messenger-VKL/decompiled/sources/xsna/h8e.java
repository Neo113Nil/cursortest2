package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: ClipsFeedPaginationAnalyticsDelegate.kt */
/* loaded from: classes17.dex */
public final class h8e implements nhl {
    public final /* synthetic */ i8e b;
    public final /* synthetic */ Lifecycle c;

    public h8e(i8e i8eVar, Lifecycle lifecycle) {
        this.b = i8eVar;
        this.c = lifecycle;
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        this.c.removeObserver(this);
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
        i8e i8eVar = this.b;
        i8eVar.d = null;
        i8eVar.e = null;
        i8eVar.f = null;
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
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
