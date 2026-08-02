package xsna;

/* compiled from: SystemIdInfo.kt */
/* loaded from: classes.dex */
public final class gqn0 {
    public final String a;
    public final int b;
    public final int c;

    public gqn0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqn0)) {
            return false;
        }
        gqn0 gqn0Var = (gqn0) obj;
        return epx.f(this.a, gqn0Var.a) && this.b == gqn0Var.b && this.c == gqn0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return vu5.b(sb, this.c, ')');
    }
}
