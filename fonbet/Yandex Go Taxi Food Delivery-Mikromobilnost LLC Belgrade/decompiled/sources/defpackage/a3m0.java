package defpackage;

import com.ybsdk.feature.savings.internal.entities.SavingsAccountButtonEntity$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a3m0 {
    public final String a;
    public final String b;
    public final SavingsAccountButtonEntity$Status c;
    public final String d;

    public a3m0(String str, String str2, SavingsAccountButtonEntity$Status savingsAccountButtonEntity$Status, String str3) {
        this.a = str;
        this.b = str2;
        this.c = savingsAccountButtonEntity$Status;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3m0)) {
            return false;
        }
        a3m0 a3m0Var = (a3m0) obj;
        return jl40.l(this.a, a3m0Var.a) && jl40.l(this.b, a3m0Var.b) && this.c == a3m0Var.c && jl40.l(this.d, a3m0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        SavingsAccountButtonEntity$Status savingsAccountButtonEntity$Status = this.c;
        int hashCode = (b + (savingsAccountButtonEntity$Status == null ? 0 : savingsAccountButtonEntity$Status.hashCode())) * 31;
        String str = this.d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SavingsAccountButtonEntity(text=", this.a, ", action=", this.b, ", status=");
        v.append(this.c);
        v.append(", subtitle=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
