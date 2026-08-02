package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class iv4 {
    public static final hv4 Companion = new hv4();
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public /* synthetic */ iv4(String str, int i, String str2, int i2, int i3) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, gv4.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv4)) {
            return false;
        }
        iv4 iv4Var = (iv4) obj;
        return jl40.l(this.a, iv4Var.a) && jl40.l(this.b, iv4Var.b) && this.c == iv4Var.c && this.d == iv4Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", padding=", Extension.C_BRAKE, b64.v("BarcodeCustomProps(format=", this.a, ", value=", this.b, ", cornerRadius="));
    }
}
