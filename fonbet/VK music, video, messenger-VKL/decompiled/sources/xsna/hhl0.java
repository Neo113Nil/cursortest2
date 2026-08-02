package xsna;

/* compiled from: StorageModelReplacement.kt */
/* loaded from: classes2.dex */
public final class hhl0<T> {
    public final T a;
    public final T b;

    public hhl0(T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhl0)) {
            return false;
        }
        hhl0 hhl0Var = (hhl0) obj;
        return epx.f(this.a, hhl0Var.a) && epx.f(this.b, hhl0Var.b);
    }

    public final int hashCode() {
        T t = this.a;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.b;
        return hashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorageModelReplacement(oldValue=");
        sb.append(this.a);
        sb.append(", newValue=");
        return k73.c(sb, this.b, ')');
    }
}
