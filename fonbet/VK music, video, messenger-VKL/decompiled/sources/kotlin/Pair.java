package kotlin;

import java.io.Serializable;
import xsna.epx;
import xsna.k73;

/* compiled from: Tuples.kt */
/* loaded from: classes11.dex */
public final class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    public Pair(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public static Pair h(Pair pair, Object obj) {
        return new Pair(pair.first, obj);
    }

    public final A d() {
        return this.first;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return epx.f(this.first, pair.first) && epx.f(this.second, pair.second);
    }

    public final B g() {
        return this.second;
    }

    public final int hashCode() {
        A a = this.first;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.second;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public final A i() {
        return this.first;
    }

    public final B j() {
        return this.second;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.first);
        sb.append(", ");
        return k73.c(sb, this.second, ')');
    }
}
