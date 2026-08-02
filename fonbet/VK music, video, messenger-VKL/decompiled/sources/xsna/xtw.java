package xsna;

/* compiled from: IndexedValue.kt */
/* loaded from: classes11.dex */
public final class xtw<T> {
    public final int a;
    public final T b;

    public xtw(int i, T t) {
        this.a = i;
        this.b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtw)) {
            return false;
        }
        xtw xtwVar = (xtw) obj;
        return this.a == xtwVar.a && epx.f(this.b, xtwVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        T t = this.b;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexedValue(index=");
        sb.append(this.a);
        sb.append(", value=");
        return k73.c(sb, this.b, ')');
    }
}
