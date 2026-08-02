package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class go extends nr {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public go(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.nr
    public final String b() {
        return this.d;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        return jl40.l(this.a, goVar.a) && this.b.equals(goVar.b) && jl40.l(this.c, goVar.c) && jl40.l(this.d, goVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("ActionShowSupportWeb(title=", this.a, ", url=", this.b, ", iconTag="), this.c, ", metricaLabel=", this.d, Extension.C_BRAKE);
    }
}
