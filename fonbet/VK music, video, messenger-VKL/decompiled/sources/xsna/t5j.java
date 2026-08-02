package xsna;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequencesJVM.kt */
/* loaded from: classes11.dex */
public final class t5j<T> implements uki0<T> {
    public final AtomicReference<uki0<T>> a;

    public t5j(uki0<? extends T> uki0Var) {
        this.a = new AtomicReference<>(uki0Var);
    }

    @Override // xsna.uki0
    public final Iterator<T> iterator() {
        uki0<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
