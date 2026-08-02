package defpackage;

/* loaded from: classes7.dex */
public final class ha71 {
    public final int a;
    public final boolean b;

    public ha71(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ha71.class != obj.getClass()) {
            return false;
        }
        ha71 ha71Var = (ha71) obj;
        return this.a == ha71Var.a && this.b == ha71Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
