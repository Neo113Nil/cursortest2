package xsna;

/* compiled from: CompositionLocal.kt */
/* loaded from: classes11.dex */
public final class fwi<T> extends androidx.compose.runtime.e<T> {
    public final gwi<T> b;

    public fwi(izs<? super mvi, ? extends T> izsVar) {
        super(new lz2(8));
        this.b = new gwi<>(izsVar);
    }

    @Override // xsna.lvi
    public final xjr0 a() {
        return this.b;
    }

    @Override // androidx.compose.runtime.e
    public final c9e0<T> b(T t) {
        return new c9e0<>(this, t, t == null, null, true);
    }
}
