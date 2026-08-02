package defpackage;

import com.ybsdk.feature.autotopup.api.AutoTopupType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class j4w {
    public final String a;
    public final String b;
    public final String c;
    public final e5a0 d;
    public final AutoTopupType e;

    public j4w(String str, String str2, String str3, e5a0 e5a0Var, AutoTopupType autoTopupType) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = e5a0Var;
        this.e = autoTopupType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4w)) {
            return false;
        }
        j4w j4wVar = (j4w) obj;
        return jl40.l(this.a, j4wVar.a) && jl40.l(this.b, j4wVar.b) && jl40.l(this.c, j4wVar.c) && this.d.equals(j4wVar.d) && this.e == j4wVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("InstructionSaveAutoTopupInfo(agreementId=", this.a, ", amount=", this.b, ", threshold=");
        v.append(this.c);
        v.append(", paymentMethod=");
        v.append(this.d);
        v.append(", autoTopupType=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
