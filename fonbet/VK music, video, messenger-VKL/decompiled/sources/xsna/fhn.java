package xsna;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes11.dex */
public final class fhn<T, K> implements uki0<T> {
    public final uki0<T> a;
    public final izs<T, K> b;

    /* JADX WARN: Multi-variable type inference failed */
    public fhn(uki0<? extends T> uki0Var, izs<? super T, ? extends K> izsVar) {
        this.a = uki0Var;
        this.b = izsVar;
    }

    @Override // xsna.uki0
    public final Iterator<T> iterator() {
        return new ehn(this.a.iterator(), this.b);
    }
}
