package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class etw {
    public final u8j0 a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public etw(u8j0 u8j0Var, String str, String str2, boolean z, boolean z2) {
        this.a = u8j0Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public static etw a(etw etwVar, u8j0 u8j0Var, String str, String str2, boolean z, int i) {
        if ((i & 1) != 0) {
            u8j0Var = etwVar.a;
        }
        u8j0 u8j0Var2 = u8j0Var;
        if ((i & 2) != 0) {
            str = etwVar.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = etwVar.c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            z = etwVar.d;
        }
        boolean z2 = etwVar.e;
        etwVar.getClass();
        return new etw(u8j0Var2, str3, str4, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etw)) {
            return false;
        }
        etw etwVar = (etw) obj;
        return this.a.equals(etwVar.a) && this.b.equals(etwVar.b) && jl40.l(this.c, etwVar.c) && this.d == etwVar.d && this.e == etwVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternetPaymentFormInputState(providerInfo=");
        sb.append(this.a);
        sb.append(", personalAccount=");
        sb.append(this.b);
        sb.append(", providerId=");
        tse0.y(this.c, ", isValid=", ", openedWithResult=", sb, this.d);
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
