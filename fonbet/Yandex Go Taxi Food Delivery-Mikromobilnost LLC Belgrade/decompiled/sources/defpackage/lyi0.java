package defpackage;

/* loaded from: classes10.dex */
public final class lyi0 {
    public static final lyi0 c = new lyi0(0, false);
    public final int a;
    public final boolean b;

    public lyi0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lyi0.class != obj.getClass()) {
            return false;
        }
        lyi0 lyi0Var = (lyi0) obj;
        return this.a == lyi0Var.a && this.b == lyi0Var.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
