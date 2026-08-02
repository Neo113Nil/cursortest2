package xsna;

/* loaded from: classes9.dex */
public final class x9y0 {
    public final String a;
    public final boolean b;

    public x9y0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9y0)) {
            return false;
        }
        x9y0 x9y0Var = (x9y0) obj;
        return epx.f(this.a, x9y0Var.a) && this.b == x9y0Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasterHostRequest(masterPackageName=");
        sb.append(this.a);
        sb.append(", isFromArbiter=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
