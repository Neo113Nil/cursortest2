package xsna;

import java.lang.Comparable;

/* compiled from: Ranges.kt */
/* loaded from: classes8.dex */
public final class t6i<T extends Comparable<? super T>> implements ewf<T> {
    public final T b;
    public final T c;

    public t6i(gkx0 gkx0Var, gkx0 gkx0Var2) {
        this.b = gkx0Var;
        this.c = gkx0Var2;
    }

    @Override // xsna.ewf
    public final boolean b(T t) {
        return t.compareTo(getStart()) >= 0 && t.compareTo(c()) <= 0;
    }

    @Override // xsna.ewf
    public final T c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t6i)) {
            return false;
        }
        if (isEmpty() && ((t6i) obj).isEmpty()) {
            return true;
        }
        t6i t6iVar = (t6i) obj;
        return epx.f(this.b, t6iVar.b) && epx.f(this.c, t6iVar.c);
    }

    @Override // xsna.ewf
    public final T getStart() {
        return this.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // xsna.ewf
    public final boolean isEmpty() {
        return getStart().compareTo(c()) > 0;
    }

    public final String toString() {
        return this.b + ".." + this.c;
    }
}
