package defpackage;

/* loaded from: classes2.dex */
public final class bcp implements gcp {
    public final String a;
    public final String b;
    public final String c;

    public bcp(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcp)) {
            return false;
        }
        bcp bcpVar = (bcp) obj;
        return jl40.l(this.a, bcpVar.a) && jl40.l(this.b, bcpVar.b) && jl40.l(this.c, bcpVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenNativeSharing(title=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", mimeType=");
        return b64.p(sb, this.c, ')');
    }
}
