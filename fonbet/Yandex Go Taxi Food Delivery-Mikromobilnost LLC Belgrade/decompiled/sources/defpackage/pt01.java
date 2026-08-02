package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pt01 {
    public final u8j0 a;
    public final String b;
    public final boolean c;
    public final String d;

    public pt01(u8j0 u8j0Var, String str, boolean z, String str2) {
        this.a = u8j0Var;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public static pt01 a(pt01 pt01Var, u8j0 u8j0Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            u8j0Var = pt01Var.a;
        }
        if ((i & 2) != 0) {
            str = pt01Var.b;
        }
        boolean z = pt01Var.c;
        if ((i & 8) != 0) {
            str2 = pt01Var.d;
        }
        pt01Var.getClass();
        return new pt01(u8j0Var, str, z, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt01)) {
            return false;
        }
        pt01 pt01Var = (pt01) obj;
        return this.a.equals(pt01Var.a) && this.b.equals(pt01Var.b) && this.c == pt01Var.c && jl40.l(this.d, pt01Var.d);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferTargetsState(ybs=");
        sb.append(this.a);
        sb.append(", filterText=");
        sb.append(this.b);
        sb.append(", isBackButtonVisible=");
        return n.m(", transferId=", this.d, Extension.C_BRAKE, sb, this.c);
    }
}
