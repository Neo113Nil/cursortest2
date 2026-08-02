package xsna;

/* compiled from: ScrollHelperConfig.kt */
/* loaded from: classes17.dex */
public final class nfh0 {
    public final boolean a;
    public final boolean b;

    public nfh0() {
        this(false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfh0)) {
            return false;
        }
        nfh0 nfh0Var = (nfh0) obj;
        return this.a == nfh0Var.a && this.b == nfh0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollHelperConfig(prepareEnabled=");
        sb.append(this.a);
        sb.append(", isPaused=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public nfh0(boolean z, int i) {
        z = (i & 2) != 0 ? false : z;
        this.a = true;
        this.b = z;
    }
}
