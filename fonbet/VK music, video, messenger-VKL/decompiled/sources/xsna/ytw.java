package xsna;

import java.util.Iterator;

/* compiled from: Iterables.kt */
/* loaded from: classes8.dex */
public final class ytw<T> implements Iterable<xtw<? extends T>>, gcy {
    public final gzs<Iterator<T>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public ytw(gzs<? extends Iterator<? extends T>> gzsVar) {
        this.b = gzsVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<xtw<T>> iterator() {
        return new ztw(this.b.invoke());
    }
}
