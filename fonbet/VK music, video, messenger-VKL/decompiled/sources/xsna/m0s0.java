package xsna;

/* compiled from: VideoAdsSuspendSnackbarVS.kt */
/* loaded from: classes6.dex */
public final class m0s0 {
    public final String a;
    public final String b;

    public m0s0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0s0)) {
            return false;
        }
        m0s0 m0s0Var = (m0s0) obj;
        return epx.f(this.a, m0s0Var.a) && epx.f(this.b, m0s0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAdsSuspendSnackbarVS(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        return ho8.a(sb, this.b, ')');
    }
}
