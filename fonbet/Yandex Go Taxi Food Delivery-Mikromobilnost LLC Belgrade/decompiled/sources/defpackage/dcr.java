package defpackage;

/* loaded from: classes.dex */
public final class dcr {
    public final String a;
    public final String b;

    public dcr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcr)) {
            return false;
        }
        dcr dcrVar = (dcr) obj;
        return jl40.l(this.a, dcrVar.a) && jl40.l(this.b, dcrVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.a);
        sb.append(", authToken=");
        return b64.p(sb, this.b, ')');
    }
}
