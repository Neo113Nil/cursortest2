package xsna;

/* compiled from: SnackbarIcon.kt */
/* loaded from: classes18.dex */
public final class f8k0 {
    public final String a;
    public final String b;

    public f8k0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8k0)) {
            return false;
        }
        f8k0 f8k0Var = (f8k0) obj;
        return epx.f(this.a, f8k0Var.a) && epx.f(this.b, f8k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnackbarIcon(type=");
        sb.append(this.a);
        sb.append(", color=");
        return ho8.a(sb, this.b, ')');
    }
}
