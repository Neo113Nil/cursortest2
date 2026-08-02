package defpackage;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesTarget;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pjq0 implements sjq0 {
    public final String a;
    public final RequisitesTarget b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final eh01 h;
    public final DivDataDto i;

    public pjq0(String str, RequisitesTarget requisitesTarget, String str2, String str3, boolean z, String str4, String str5, eh01 eh01Var, DivDataDto divDataDto) {
        this.a = str;
        this.b = requisitesTarget;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
        this.g = str5;
        this.h = eh01Var;
        this.i = divDataDto;
    }

    @Override // defpackage.wjq0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.wjq0
    public final eh01 b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjq0)) {
            return false;
        }
        pjq0 pjq0Var = (pjq0) obj;
        return jl40.l(this.a, pjq0Var.a) && jl40.l(this.b, pjq0Var.b) && jl40.l(this.c, pjq0Var.c) && jl40.l(this.d, pjq0Var.d) && this.e == pjq0Var.e && jl40.l(this.f, pjq0Var.f) && jl40.l(this.g, pjq0Var.g) && jl40.l(this.h, pjq0Var.h) && jl40.l(this.i, pjq0Var.i);
    }

    @Override // defpackage.sjq0
    public final String getAccountNumber() {
        return this.a;
    }

    @Override // defpackage.sjq0
    public final RequisitesTarget getTarget() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        RequisitesTarget requisitesTarget = this.b;
        int e = unr0.e(unr0.b(unr0.b((hashCode + (requisitesTarget == null ? 0 : requisitesTarget.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode2 = (this.h.hashCode() + unr0.b((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.g)) * 31;
        DivDataDto divDataDto = this.i;
        return hashCode2 + (divDataDto != null ? divDataDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequisitesLegalTransfer(accountNumber=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", beneficiaryName=");
        g8e.D(sb, this.c, ", inn=", this.d, ", vatIncluded=");
        unr0.A(", paymentPurpose=", this.f, ", bic=", sb, this.e);
        sb.append(this.g);
        sb.append(", fromCircleButton=");
        sb.append(this.h);
        sb.append(", divkitWidget=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
