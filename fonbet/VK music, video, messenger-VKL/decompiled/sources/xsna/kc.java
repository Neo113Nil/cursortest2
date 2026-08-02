package xsna;

import com.google.common.base.Optional;

/* compiled from: Absent.java */
/* loaded from: classes13.dex */
public final class kc<T> extends Optional<T> {
    public static final kc<Object> b = new kc<>();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return b;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
