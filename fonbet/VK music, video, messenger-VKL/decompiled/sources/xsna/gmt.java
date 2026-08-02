package xsna;

/* compiled from: GeoPostsMviState.kt */
/* loaded from: classes4.dex */
public final class gmt implements tw60<gmt> {
    public final String b;
    public final String c;
    public final ur60 d;

    public gmt(String str, String str2, ur60 ur60Var) {
        this.b = str;
        this.c = str2;
        this.d = ur60Var;
    }

    public static gmt a(gmt gmtVar, String str, String str2, ur60 ur60Var, int i) {
        if ((i & 1) != 0) {
            str = gmtVar.b;
        }
        if ((i & 2) != 0) {
            str2 = gmtVar.c;
        }
        if ((i & 4) != 0) {
            ur60Var = gmtVar.d;
        }
        gmtVar.getClass();
        return new gmt(str, str2, ur60Var);
    }

    @Override // xsna.tw60
    public final gmt b(ur60 ur60Var) {
        return a(this, null, null, ur60Var, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmt)) {
            return false;
        }
        gmt gmtVar = (gmt) obj;
        return epx.f(this.b, gmtVar.b) && epx.f(this.c, gmtVar.c) && epx.f(this.d, gmtVar.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // xsna.tw60
    public final ur60 p() {
        return this.d;
    }

    public final String toString() {
        return "GeoPostsMviState(title=" + this.b + ", subtitle=" + this.c + ", listState=" + this.d + ')';
    }
}
