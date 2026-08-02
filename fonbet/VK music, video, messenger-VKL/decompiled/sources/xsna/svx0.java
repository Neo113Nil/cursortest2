package xsna;

/* compiled from: WorkSpec.kt */
/* loaded from: classes.dex */
public final class svx0 {
    public final String a;
    public final int b;

    public svx0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svx0)) {
            return false;
        }
        svx0 svx0Var = (svx0) obj;
        return epx.f(this.a, svx0Var.a) && this.b == svx0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return vu5.b(sb, this.b, ')');
    }
}
