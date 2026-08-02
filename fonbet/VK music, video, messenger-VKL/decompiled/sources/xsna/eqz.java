package xsna;

import xsna.qr60;

/* compiled from: Transformers.kt */
/* loaded from: classes4.dex */
public final class eqz<T> implements io.reactivex.rxjava3.core.c0<T, T> {
    public final qn60 b;
    public final pn60 c;
    public final izs<qr60.a, lm50> d;

    /* JADX WARN: Multi-variable type inference failed */
    public eqz(qn60 qn60Var, pn60 pn60Var, izs<? super qr60.a, ? extends lm50> izsVar) {
        this.b = qn60Var;
        this.c = pn60Var;
        this.d = izsVar;
    }

    @Override // io.reactivex.rxjava3.core.c0
    public final io.reactivex.rxjava3.core.b0<T> b(io.reactivex.rxjava3.core.x<T> xVar) {
        return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new hms(new s6k(this, 28), 9)), new pf1(new vam(this, 21), 27)).h(new kl6(new tcn(this, 14), 23));
    }
}
