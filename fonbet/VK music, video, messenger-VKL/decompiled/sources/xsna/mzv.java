package xsna;

/* compiled from: ImCmdRxExecutorImpl.kt */
/* loaded from: classes.dex */
public final class mzv implements lzv {
    public final a1w a;

    public mzv(a1w a1wVar) {
        this.a = a1wVar;
    }

    @Override // xsna.lzv
    public final io.reactivex.rxjava3.disposables.c a(Object obj, le6 le6Var, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.f fVar2) {
        a1w a1wVar = this.a;
        return a1wVar.B(obj, le6Var, a1wVar.r().H, fVar, fVar2);
    }

    @Override // xsna.lzv
    public final <V> io.reactivex.rxjava3.core.x<V> b(Object obj, e1w<V> e1wVar) {
        return this.a.C(obj, e1wVar);
    }
}
