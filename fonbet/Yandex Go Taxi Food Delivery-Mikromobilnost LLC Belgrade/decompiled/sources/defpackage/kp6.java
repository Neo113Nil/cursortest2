package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kp6 {
    public final vp6 a;
    public final String b;
    public final boolean c;

    public kp6(vp6 vp6Var, String str, boolean z) {
        this.a = vp6Var;
        this.b = str;
        this.c = z;
    }

    public static kp6 a(kp6 kp6Var, String str, boolean z, int i) {
        vp6 vp6Var = kp6Var.a;
        if ((i & 2) != 0) {
            str = kp6Var.b;
        }
        return new kp6(vp6Var, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp6)) {
            return false;
        }
        kp6 kp6Var = (kp6) obj;
        return this.a.equals(kp6Var.a) && this.b.equals(kp6Var.b) && this.c == kp6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BudgetChargesUinInputSuccessState(screenData=");
        sb.append(this.a);
        sb.append(", uinInput=");
        sb.append(this.b);
        sb.append(", isValid=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
