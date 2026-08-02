package xsna;

/* compiled from: JoinedKey.kt */
/* loaded from: classes11.dex */
public final class u0y {
    public final Object a;
    public final Object b;

    public u0y(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0y)) {
            return false;
        }
        u0y u0yVar = (u0y) obj;
        return epx.f(this.a, u0yVar.a) && epx.f(this.b, u0yVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int ordinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        if (obj2 instanceof Enum) {
            i = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i + ordinal;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinedKey(left=");
        sb.append(this.a);
        sb.append(", right=");
        return k73.c(sb, this.b, ')');
    }
}
