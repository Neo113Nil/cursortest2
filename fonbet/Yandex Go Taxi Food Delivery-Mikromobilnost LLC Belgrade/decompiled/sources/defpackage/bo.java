package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bo extends nr {
    public final String a;
    public final String b;
    public final String c;

    public bo(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.nr
    public final String b() {
        return this.c;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo)) {
            return false;
        }
        bo boVar = (bo) obj;
        return jl40.l(this.a, boVar.a) && jl40.l(this.b, boVar.b) && jl40.l(this.c, boVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("ActionShare(title=", this.a, ", sharingUrl=", this.b, ", metricaLabel="), this.c, Extension.C_BRAKE);
    }
}
