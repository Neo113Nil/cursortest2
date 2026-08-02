package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gi8 {
    public final List a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public gi8(int i, String str, String str2, List list, boolean z) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = z;
    }

    public static gi8 a(gi8 gi8Var, String str, String str2, int i, boolean z, int i2) {
        List list = gi8Var.a;
        if ((i2 & 2) != 0) {
            str = gi8Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = gi8Var.c;
        }
        if ((i2 & 8) != 0) {
            i = gi8Var.d;
        }
        boolean z2 = (i2 & 16) != 0 ? gi8Var.e : z;
        gi8Var.getClass();
        return new gi8(i, str, str2, list, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi8)) {
            return false;
        }
        gi8 gi8Var = (gi8) obj;
        return this.a.equals(gi8Var.a) && this.b.equals(gi8Var.b) && jl40.l(this.c, gi8Var.c) && this.d == gi8Var.d && this.e == gi8Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + oyr.b(this.d, unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder s = xvz.s("CardLimitSuccessState(limits=", this.a, ", amount=", this.b, ", currency=");
        b64.A(this.d, this.c, ", selectedLimitIndex=", ", limitSaving=", s);
        return x4e.i(s, this.e, Extension.C_BRAKE);
    }
}
