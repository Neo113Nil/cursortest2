package defpackage;

/* loaded from: classes2.dex */
public final class a4a0 {
    public final String a;
    public final String b;
    public final String c;

    public a4a0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4a0)) {
            return false;
        }
        a4a0 a4a0Var = (a4a0) obj;
        return this.a.equals(a4a0Var.a) && this.b.equals(a4a0Var.b) && this.c.equals(a4a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LightTheme(backgroundColor=");
        sb.append(this.a);
        sb.append(", iconUrl=");
        sb.append(this.b);
        sb.append(", textColor=");
        return b64.p(sb, this.c, ')');
    }
}
