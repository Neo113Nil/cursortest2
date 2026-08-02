package kotlin;

import java.io.Serializable;
import xsna.epx;
import xsna.k73;

/* compiled from: Tuples.kt */
/* loaded from: classes11.dex */
public final class Triple<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    public Triple(A a, B b, C c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public final A d() {
        return this.first;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return epx.f(this.first, triple.first) && epx.f(this.second, triple.second) && epx.f(this.third, triple.third);
    }

    public final B g() {
        return this.second;
    }

    public final C h() {
        return this.third;
    }

    public final int hashCode() {
        A a = this.first;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.second;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.third;
        return hashCode2 + (c != null ? c.hashCode() : 0);
    }

    public final A i() {
        return this.first;
    }

    public final B j() {
        return this.second;
    }

    public final C k() {
        return this.third;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.first);
        sb.append(", ");
        sb.append(this.second);
        sb.append(", ");
        return k73.c(sb, this.third, ')');
    }
}
