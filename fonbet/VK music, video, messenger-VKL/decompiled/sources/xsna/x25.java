package xsna;

/* compiled from: AuthData.kt */
/* loaded from: classes6.dex */
public final class x25 {
    public final String a;
    public final String b;

    public x25() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x25)) {
            return false;
        }
        x25 x25Var = (x25) obj;
        return epx.f(this.a, x25Var.a) && epx.f(this.b, x25Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthData(data=");
        sb.append(this.a);
        sb.append(", sign=");
        return ho8.a(sb, this.b, ')');
    }

    public /* synthetic */ x25(int i) {
        this("", "");
    }

    public x25(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
