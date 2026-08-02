package xsna;

/* compiled from: Data.kt */
/* loaded from: classes5.dex */
public final class ptk<T> {
    public final T a;
    public final boolean b;

    public ptk(T t, boolean z) {
        this.a = t;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptk)) {
            return false;
        }
        ptk ptkVar = (ptk) obj;
        return epx.f(this.a, ptkVar.a) && this.b == ptkVar.b;
    }

    public final int hashCode() {
        T t = this.a;
        return Boolean.hashCode(this.b) + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(value=");
        sb.append(this.a);
        sb.append(", fromCache=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
