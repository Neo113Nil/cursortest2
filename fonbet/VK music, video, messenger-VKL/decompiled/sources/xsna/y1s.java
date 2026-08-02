package xsna;

import xsna.x1s;

/* compiled from: FoldersRecommendedListLoaderImpl.kt */
/* loaded from: classes18.dex */
public final class y1s implements g4z {
    public final a1w b;
    public final io.reactivex.rxjava3.subjects.d<x1s> c = io.reactivex.rxjava3.subjects.d.O0(x1s.b.a);
    public final io.reactivex.rxjava3.core.w d = asu0.a.c();
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();

    public y1s(a1w a1wVar) {
        this.b = a1wVar;
    }

    @Override // xsna.g4z
    public final void onDestroy() {
        this.e.e();
    }
}
