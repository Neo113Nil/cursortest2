package defpackage;

/* loaded from: classes2.dex */
public final class b300 {
    public final String a;
    public final String b;
    public final String c;

    public b300(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b300)) {
            return false;
        }
        b300 b300Var = (b300) obj;
        return this.a.equals(b300Var.a) && this.b.equals(b300Var.b) && this.c.equals(b300Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDecoratedTextReferencePartHighlight(name=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", url=");
        return b64.p(sb, this.c, ')');
    }
}
