package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lzl0 {
    public final String a;
    public final String b;
    public final tl c;
    public final boolean d;
    public final k0a0 e;

    public lzl0(String str, String str2, tl tlVar, boolean z, k0a0 k0a0Var) {
        this.a = str;
        this.b = str2;
        this.c = tlVar;
        this.d = z;
        this.e = k0a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzl0)) {
            return false;
        }
        lzl0 lzl0Var = (lzl0) obj;
        return jl40.l(this.a, lzl0Var.a) && jl40.l(this.b, lzl0Var.b) && jl40.l(this.c, lzl0Var.c) && this.d == lzl0Var.d && this.e.equals(lzl0Var.e);
    }

    public final int hashCode() {
        return this.e.a.hashCode() + unr0.e((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("SaveAccountViewModel(accountName=", this.a, ", membersDescription=", this.b, ", paymentMethodViewModel=");
        v.append(this.c);
        v.append(", isMakeDefaultPaymentChecked=");
        v.append(this.d);
        v.append(", paymentIcon=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
