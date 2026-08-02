package xsna;

import android.os.Bundle;

/* compiled from: CatalogRequestFactory.kt */
/* loaded from: classes16.dex */
public abstract class u96 implements gda {
    public Object b;

    public u96(Bundle bundle) {
        this.b = bundle;
    }

    @Override // xsna.gda
    public io.reactivex.rxjava3.core.q b() {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }

    @Override // xsna.gda
    public void c(Bundle bundle) {
        this.b = bundle;
    }

    public mw40 e(nw40 nw40Var) {
        long j = nw40Var.a;
        long j2 = nw40Var.b;
        long currentTimeMillis = System.currentTimeMillis();
        long a = qni0.a();
        int i = nw40Var.c;
        return new mw40(j, j2, currentTimeMillis, a, nw40Var.d, i == 26 || ((Boolean) f().invoke(Integer.valueOf(i))).booleanValue());
    }

    public izs f() {
        return (la2) this.b;
    }

    public u96() {
        this.b = new la2(21);
    }
}
