package xsna;

/* compiled from: SilentModeBannerState.kt */
/* loaded from: classes5.dex */
public final class fnj0 {
    public final String a;
    public final String b;

    public fnj0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnj0)) {
            return false;
        }
        fnj0 fnj0Var = (fnj0) obj;
        return epx.f(this.a, fnj0Var.a) && epx.f(this.b, fnj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SilentModeBannerState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        return ho8.a(sb, this.b, ')');
    }

    public /* synthetic */ fnj0(int i) {
        this("", "");
    }

    public fnj0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
