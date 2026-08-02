package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cag0 {
    public final ResultStatus a;
    public final String b;
    public final lo10 c;
    public final String d;
    public final String e;
    public final v1v0 f;
    public final String g;
    public final List h;

    public cag0(ResultStatus resultStatus, String str, lo10 lo10Var, String str2, String str3, v1v0 v1v0Var, String str4, List list) {
        this.a = resultStatus;
        this.b = str;
        this.c = lo10Var;
        this.d = str2;
        this.e = str3;
        this.f = v1v0Var;
        this.g = str4;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cag0)) {
            return false;
        }
        cag0 cag0Var = (cag0) obj;
        return this.a == cag0Var.a && jl40.l(this.b, cag0Var.b) && jl40.l(this.c, cag0Var.c) && jl40.l(this.d, cag0Var.d) && jl40.l(this.e, cag0Var.e) && jl40.l(this.f, cag0Var.f) && jl40.l(this.g, cag0Var.g) && this.h.equals(cag0Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        lo10 lo10Var = this.c;
        int hashCode3 = (hashCode2 + (lo10Var == null ? 0 : lo10Var.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        v1v0 v1v0Var = this.f;
        int hashCode6 = (hashCode5 + (v1v0Var == null ? 0 : v1v0Var.hashCode())) * 31;
        String str4 = this.g;
        return this.h.hashCode() + ((hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrPaymentsResultEntity(status=");
        sb.append(this.a);
        sb.append(", paymentId=");
        sb.append(this.b);
        sb.append(", merchantEntity=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", subscriptionWidget=");
        sb.append(this.f);
        sb.append(", redirectLink=");
        return tse0.j(this.g, ", divkitWidgets=", Extension.C_BRAKE, sb, this.h);
    }
}
