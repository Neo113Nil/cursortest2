package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ee90 {
    public final String a;
    public final String b;
    public final ih21 c;

    public ee90(String str, String str2, ih21 ih21Var) {
        this.a = str;
        this.b = str2;
        this.c = ih21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee90)) {
            return false;
        }
        ee90 ee90Var = (ee90) obj;
        return this.a.equals(ee90Var.a) && jl40.l(this.b, ee90Var.b) && jl40.l(this.c, ee90Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        ih21 ih21Var = this.c;
        return b + (ih21Var == null ? 0 : ih21Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("ParkData(zoneName=", this.a, ", tariffUrl=", this.b, ", tariffUrlParts=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
