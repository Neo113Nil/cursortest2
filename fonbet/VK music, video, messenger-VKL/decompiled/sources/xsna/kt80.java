package xsna;

import java.util.NoSuchElementException;

/* compiled from: Optional.java */
/* loaded from: classes13.dex */
public final class kt80<T> {
    public final T a;

    public kt80() {
        this.a = null;
    }

    public final T a() {
        T t = this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        return this.a != null;
    }

    public kt80(T t) {
        if (t != null) {
            this.a = t;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
