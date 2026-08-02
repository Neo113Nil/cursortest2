package yads;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class lr2 extends tb2 implements Serializable {
    private static final long serialVersionUID = 0;
    public final tb2 b;

    public lr2(tb2 tb2Var) {
        this.b = (tb2) oh2.a(tb2Var);
    }

    @Override // yads.tb2
    public final tb2 a() {
        return this.b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.b.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lr2) {
            return this.b.equals(((lr2) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.b.hashCode();
    }

    public final String toString() {
        return this.b + ".reverse()";
    }
}
