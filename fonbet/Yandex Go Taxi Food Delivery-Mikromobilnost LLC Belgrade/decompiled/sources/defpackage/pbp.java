package defpackage;

/* loaded from: classes2.dex */
public final class pbp implements qbp {
    public final String a;
    public final String b;
    public final String c;

    public pbp(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbp)) {
            return false;
        }
        pbp pbpVar = (pbp) obj;
        return jl40.l(this.a, pbpVar.a) && jl40.l(this.b, pbpVar.b) && jl40.l(this.c, pbpVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareInvite(title=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", mimeType=");
        return b64.p(sb, this.c, ')');
    }
}
