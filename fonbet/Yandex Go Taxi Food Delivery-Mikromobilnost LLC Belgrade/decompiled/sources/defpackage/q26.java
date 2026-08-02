package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class q26 {
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ q26(int i) {
        this(null, null, (i & 4) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q26)) {
            return false;
        }
        q26 q26Var = (q26) obj;
        return jl40.l(this.a, q26Var.a) && jl40.l(this.b, q26Var.b) && this.c == q26Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return x4e.i(b64.v("BlePaymentQrButton(title=", this.a, ", icon=", this.b, ", isHidden="), this.c, Extension.C_BRAKE);
    }

    public q26() {
        this(7);
    }

    public q26(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
