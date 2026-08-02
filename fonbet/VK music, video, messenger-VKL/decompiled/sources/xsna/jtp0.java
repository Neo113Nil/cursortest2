package xsna;

import xsna.wq2;

/* compiled from: VectorConverters.kt */
/* loaded from: classes11.dex */
public final class jtp0<T, V extends wq2> implements itp0<T, V> {
    public final izs<T, V> a;
    public final izs<V, T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public jtp0(izs<? super T, ? extends V> izsVar, izs<? super V, ? extends T> izsVar2) {
        this.a = izsVar;
        this.b = izsVar2;
    }

    @Override // xsna.itp0
    public final izs<T, V> a() {
        return this.a;
    }

    @Override // xsna.itp0
    public final izs<V, T> b() {
        return this.b;
    }
}
