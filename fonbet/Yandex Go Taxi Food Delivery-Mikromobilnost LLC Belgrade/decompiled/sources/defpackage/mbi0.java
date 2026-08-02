package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class mbi0 {
    public static final kbi0 Companion = new kbi0();
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public /* synthetic */ mbi0(int i, int i2, int i3, int i4, String str, String str2) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, ibi0.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbi0)) {
            return false;
        }
        mbi0 mbi0Var = (mbi0) obj;
        return this.a == mbi0Var.a && this.b == mbi0Var.b && this.c == mbi0Var.c && jl40.l(this.d, mbi0Var.d) && jl40.l(this.e, mbi0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "ReadCardKey(block=", ", id=", ", version=");
        smw0.t(this.c, ", type=", this.d, ", value=", s);
        return oyr.t(s, this.e, Extension.C_BRAKE);
    }
}
