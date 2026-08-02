package xsna;

/* compiled from: ParserStrategy.kt */
/* loaded from: classes.dex */
public final class qrj0<I, M, R> {
    public final gzs<I> a;
    public final izs<I, M> b;
    public final yzs<I, M, per0<R>, s3q0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public qrj0(gzs<? extends I> gzsVar, izs<? super I, ? extends M> izsVar, yzs<? super I, ? super M, ? super per0<R>, s3q0> yzsVar) {
        this.a = gzsVar;
        this.b = izsVar;
        this.c = yzsVar;
    }

    public final per0<R> a(izs<? super M, per0<R>> izsVar) {
        I invoke = this.a.invoke();
        M invoke2 = this.b.invoke(invoke);
        per0<R> invoke3 = izsVar.invoke(invoke2);
        this.c.invoke(invoke, invoke2, invoke3);
        return invoke3;
    }
}
