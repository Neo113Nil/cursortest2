package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dn10 {
    public final u8j0 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public dn10(u8j0 u8j0Var, boolean z, boolean z2, boolean z3) {
        this.a = u8j0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static dn10 a(dn10 dn10Var, u8j0 u8j0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            u8j0Var = dn10Var.a;
        }
        dn10Var.getClass();
        boolean z2 = dn10Var.b;
        boolean z3 = (i & 8) != 0 ? dn10Var.c : false;
        if ((i & 16) != 0) {
            z = dn10Var.d;
        }
        dn10Var.getClass();
        return new dn10(u8j0Var, z2, z3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn10)) {
            return false;
        }
        dn10 dn10Var = (dn10) obj;
        return this.a.equals(dn10Var.a) && this.b == dn10Var.b && this.c == dn10Var.c && this.d == dn10Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.e(this.a.hashCode() * 961, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuState(menuEntity=");
        sb.append(this.a);
        sb.append(", userInfoResult=null, showLogOut=");
        sb.append(this.b);
        sb.append(", showNfcSettingsOption=");
        return smw0.k(", showProgress=", Extension.C_BRAKE, sb, this.c, this.d);
    }
}
