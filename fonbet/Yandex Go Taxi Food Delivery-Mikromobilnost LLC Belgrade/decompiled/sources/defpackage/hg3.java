package defpackage;

/* loaded from: classes10.dex */
public final class hg3 {
    public static final hg3 d = new gg3().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public hg3(gg3 gg3Var) {
        this.a = gg3Var.a;
        this.b = gg3Var.b;
        this.c = gg3Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hg3.class != obj.getClass()) {
            return false;
        }
        hg3 hg3Var = (hg3) obj;
        return this.a == hg3Var.a && this.b == hg3Var.b && this.c == hg3Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
