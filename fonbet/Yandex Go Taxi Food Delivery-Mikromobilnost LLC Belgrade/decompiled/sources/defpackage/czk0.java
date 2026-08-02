package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.rounding.RoundingStatusEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class czk0 {
    public final RoundingStatusEntity a;
    public final String b;
    public final String c;
    public final String d;
    public final xyk0 e;
    public final String f;

    public czk0(RoundingStatusEntity roundingStatusEntity, String str, String str2, String str3, xyk0 xyk0Var, String str4) {
        this.a = roundingStatusEntity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = xyk0Var;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czk0)) {
            return false;
        }
        czk0 czk0Var = (czk0) obj;
        return this.a == czk0Var.a && jl40.l(this.b, czk0Var.b) && jl40.l(this.c, czk0Var.c) && jl40.l(this.d, czk0Var.d) && jl40.l(this.e, czk0Var.e) && jl40.l(this.f, czk0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode2 = (this.e.hashCode() + ((b + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundingSettings(status=");
        sb.append(this.a);
        sb.append(", sourceAgreementId=");
        sb.append(this.b);
        sb.append(", targetAgreementId=");
        g8e.D(sb, this.c, ", operationId=", this.d, ", selectedOption=");
        sb.append(this.e);
        sb.append(", verificationToken=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
