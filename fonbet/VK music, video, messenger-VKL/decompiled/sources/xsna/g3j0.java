package xsna;

/* compiled from: CommunityManageFragment.kt */
/* loaded from: classes7.dex */
public final class g3j0 {
    public final String a;
    public final boolean b;

    public g3j0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3j0)) {
            return false;
        }
        g3j0 g3j0Var = (g3j0) obj;
        return epx.f(this.a, g3j0Var.a) && this.b == g3j0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultSnackBar(type=");
        sb.append(this.a);
        sb.append(", isSuccess=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
