package xsna;

import one.video.view.OneVideoPlayerView;

/* compiled from: Effects.kt */
/* loaded from: classes17.dex */
public final class l9d implements kgn {
    public final /* synthetic */ e3b0 a;
    public final /* synthetic */ o2b0 b;
    public final /* synthetic */ OneVideoPlayerView c;

    public l9d(e3b0 e3b0Var, o2b0 o2b0Var, OneVideoPlayerView oneVideoPlayerView) {
        this.a = e3b0Var;
        this.b = o2b0Var;
        this.c = oneVideoPlayerView;
    }

    @Override // xsna.kgn
    public final void dispose() {
        e3b0 e3b0Var = this.a;
        e3b0Var.c.release();
        cv10 cv10Var = e3b0Var.c;
        cv10Var.a().c0(this.b);
        cv10Var.a().release();
        this.c.setPlayer(null);
    }
}
