package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class b971 {
    public static final a671 Companion = new a671();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public b971(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, w271.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b971)) {
            return false;
        }
        b971 b971Var = (b971) obj;
        return jl40.l(this.a, b971Var.a) && jl40.l(this.b, b971Var.b) && jl40.l(this.c, b971Var.c) && jl40.l(this.d, b971Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z2a1.a(z2a1.a(this.a.hashCode() * 31, this.b), this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("DebugPanelAppData(appId=", this.a, ", appVersion=", this.b, ", system="), this.c, ", androidApiLevel=", this.d, Extension.C_BRAKE);
    }

    public b971(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
