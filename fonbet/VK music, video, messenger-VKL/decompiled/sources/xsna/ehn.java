package xsna;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes11.dex */
public final class ehn<T, K> extends we<T> {
    public final Iterator<T> b;
    public final izs<T, K> c;
    public final HashSet<K> d = new HashSet<>();

    /* JADX WARN: Multi-variable type inference failed */
    public ehn(Iterator<? extends T> it, izs<? super T, ? extends K> izsVar) {
        this.b = it;
        this.c = izsVar;
    }

    @Override // xsna.we
    public final void computeNext() {
        T next;
        do {
            Iterator<T> it = this.b;
            if (!it.hasNext()) {
                done();
                return;
            } else {
                next = it.next();
            }
        } while (!this.d.add(this.c.invoke(next)));
        setNext(next);
    }
}
