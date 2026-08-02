package xsna;

/* compiled from: AuthData.kt */
/* loaded from: classes5.dex */
public final class y25 {
    public final String a;
    public final String b;

    public y25(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y25)) {
            return false;
        }
        y25 y25Var = (y25) obj;
        return epx.f(this.a, y25Var.a) && epx.f(this.b, y25Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthData(authType=");
        sb.append(this.a);
        sb.append(", authToken=");
        return ho8.a(sb, this.b, ')');
    }
}
