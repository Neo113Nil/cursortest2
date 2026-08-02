package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class ee81 {
    public static final ya81 Companion = new ya81();
    public final String a;
    public final String b;
    public final String c;
    public final s271 d;

    public ee81(int i, String str, String str2, String str3, s271 s271Var) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, p781.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = s271Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee81)) {
            return false;
        }
        ee81 ee81Var = (ee81) obj;
        return jl40.l(this.a, ee81Var.a) && jl40.l(this.b, ee81Var.b) && jl40.l(this.c, ee81Var.c) && jl40.l(this.d, ee81Var.d);
    }

    public final int hashCode() {
        int a = z2a1.a(z2a1.a(this.a.hashCode() * 31, this.b), this.c);
        s271 s271Var = this.d;
        return a + (s271Var == null ? 0 : s271Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("DebugPanelAdUnit(name=", this.a, ", format=", this.b, ", adUnitId=");
        v.append(this.c);
        v.append(", mediation=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
