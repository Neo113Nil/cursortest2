package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class i6n {
    public final String a;
    public final v4v b;
    public final String c;
    public final gv90 d;

    public i6n(String str, lvi0 lvi0Var, String str2, gv90 gv90Var) {
        this.a = str;
        this.b = lvi0Var;
        this.c = str2;
        this.d = gv90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6n)) {
            return false;
        }
        i6n i6nVar = (i6n) obj;
        return jl40.l(this.a, i6nVar.a) && jl40.l(this.b, i6nVar.b) && jl40.l(this.c, i6nVar.c) && jl40.l(this.d, i6nVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        v4v v4vVar = this.b;
        int hashCode2 = (hashCode + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Trail(text=" + this.a + ", icon=" + this.b + ", metricaLabel=" + this.c + ", payload=" + this.d + Extension.C_BRAKE;
    }
}
