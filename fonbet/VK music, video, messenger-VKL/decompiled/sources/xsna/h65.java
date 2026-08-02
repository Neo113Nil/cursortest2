package xsna;

/* compiled from: AuthSilentTokenIndexedErrorModel.kt */
/* loaded from: classes6.dex */
public final class h65 {
    public final int a;
    public final String b;

    public h65(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h65)) {
            return false;
        }
        h65 h65Var = (h65) obj;
        return this.a == h65Var.a && epx.f(this.b, h65Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthSilentTokenIndexedErrorModel(index=");
        sb.append(this.a);
        sb.append(", description=");
        return ho8.a(sb, this.b, ')');
    }
}
