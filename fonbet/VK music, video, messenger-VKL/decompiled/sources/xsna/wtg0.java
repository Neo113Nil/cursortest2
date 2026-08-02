package xsna;

import xsna.c63;

/* compiled from: RxExt.kt */
/* loaded from: classes6.dex */
public final class wtg0 extends c63.b {
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c b;

    public wtg0(io.reactivex.rxjava3.disposables.c cVar) {
        this.b = cVar;
    }

    @Override // xsna.c63.b
    public final void w() {
        this.b.dispose();
    }
}
