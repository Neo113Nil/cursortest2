package xsna;

/* compiled from: LazyStaggeredGridIntervalContent.kt */
/* loaded from: classes11.dex */
public final class swy extends androidx.compose.foundation.lazy.layout.a<rwy> implements oxy {
    public final p8v a;
    public final b1y b;

    public swy(izs<? super oxy, s3q0> izsVar) {
        p8v p8vVar = new p8v(1);
        this.a = p8vVar;
        this.b = new b1y(p8vVar, 5);
        izsVar.invoke(this);
    }

    @Override // xsna.oxy
    public final void i(int i, rrv rrvVar, srv srvVar, jai jaiVar) {
        this.a.a(i, new rwy(rrvVar, srvVar, jaiVar));
    }

    @Override // androidx.compose.foundation.lazy.layout.a
    public final p8v l() {
        return this.a;
    }
}
