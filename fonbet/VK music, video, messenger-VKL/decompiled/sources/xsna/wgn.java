package xsna;

import xsna.c63;

/* compiled from: VKRxExt.kt */
/* loaded from: classes.dex */
public final class wgn extends c63.b {
    public final io.reactivex.rxjava3.disposables.c b;

    public wgn(io.reactivex.rxjava3.disposables.c cVar) {
        this.b = cVar;
    }

    @Override // xsna.c63.b
    public final void w() {
        c63 c63Var = c63.a;
        c63.c(this);
        this.b.dispose();
    }
}
