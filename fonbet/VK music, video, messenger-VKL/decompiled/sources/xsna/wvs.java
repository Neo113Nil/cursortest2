package xsna;

import xsna.x6y;

/* compiled from: FullScreenLoaderDelegate.kt */
/* loaded from: classes6.dex */
public final class wvs {
    public x6y.c a;
    public io.reactivex.rxjava3.subjects.d<Boolean> b;

    public wvs() {
        throw null;
    }

    public final void a() {
        this.b.onComplete();
        this.b = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
    }
}
