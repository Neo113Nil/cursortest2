package xsna;

/* loaded from: classes8.dex */
public final class gm70 {
    public final int a;

    public gm70() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm70)) {
            return false;
        }
        gm70 gm70Var = (gm70) obj;
        gm70Var.getClass();
        return this.a == gm70Var.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return tgw.b(this.a, "NsConfig(enabled=false, version=", ")");
    }

    public gm70(int i) {
        this.a = 2;
    }
}
