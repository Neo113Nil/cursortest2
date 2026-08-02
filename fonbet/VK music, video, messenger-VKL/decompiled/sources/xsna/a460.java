package xsna;

/* compiled from: NetworkInitializationConfig.kt */
/* loaded from: classes.dex */
public final class a460 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public a460() {
        this(false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a460)) {
            return false;
        }
        a460 a460Var = (a460) obj;
        return this.a == a460Var.a && this.b == a460Var.b && this.c == a460Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkInitializationConfig(enableQuic=");
        sb.append(this.a);
        sb.append(", enableSse=");
        sb.append(this.b);
        sb.append(", enableGzip=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public a460(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
