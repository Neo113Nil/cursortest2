package xsna;

import xsna.ufd;

/* compiled from: ClipVolumeAnalyticsUseCase.kt */
/* loaded from: classes17.dex */
public final class tfd implements nhl {
    public final /* synthetic */ ufd b;

    public tfd(ufd ufdVar) {
        this.b = ufdVar;
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
        e1j0 e1j0Var = e1j0.a;
        ufd.a aVar = (ufd.a) this.b.e.getValue();
        e1j0Var.getClass();
        e1j0.b.remove(aVar);
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
        e1j0 e1j0Var = e1j0.a;
        ufd.a aVar = (ufd.a) this.b.e.getValue();
        e1j0Var.getClass();
        e1j0.b.add(aVar);
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
    }
}
