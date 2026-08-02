package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class o26 {
    public final String a;
    public final String b;
    public final boolean c;
    public final q26 d;

    public o26(String str, String str2, boolean z, q26 q26Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = q26Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o26)) {
            return false;
        }
        o26 o26Var = (o26) obj;
        return jl40.l(this.a, o26Var.a) && jl40.l(this.b, o26Var.b) && this.c == o26Var.c && jl40.l(this.d, o26Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int e = unr0.e((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        q26 q26Var = this.d;
        return e + (q26Var != null ? q26Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("BlePaymentHeaderSection(title=", this.a, ", description=", this.b, ", showDivider=");
        v.append(this.c);
        v.append(", qrButton=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public o26() {
        this(null, null, true, null);
    }
}
