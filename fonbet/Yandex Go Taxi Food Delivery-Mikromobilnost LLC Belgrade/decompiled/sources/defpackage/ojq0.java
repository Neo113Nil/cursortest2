package defpackage;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesTarget;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ojq0 implements sjq0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final RequisitesTarget i;
    public final eh01 j;
    public final DivDataDto k;

    public ojq0(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, RequisitesTarget requisitesTarget, eh01 eh01Var, DivDataDto divDataDto) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = z;
        this.i = requisitesTarget;
        this.j = eh01Var;
        this.k = divDataDto;
    }

    @Override // defpackage.wjq0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.wjq0
    public final eh01 b() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojq0)) {
            return false;
        }
        ojq0 ojq0Var = (ojq0) obj;
        return jl40.l(this.a, ojq0Var.a) && jl40.l(this.b, ojq0Var.b) && jl40.l(this.c, ojq0Var.c) && jl40.l(this.d, ojq0Var.d) && jl40.l(this.e, ojq0Var.e) && jl40.l(this.f, ojq0Var.f) && jl40.l(this.g, ojq0Var.g) && this.h == ojq0Var.h && jl40.l(this.i, ojq0Var.i) && jl40.l(this.j, ojq0Var.j) && jl40.l(this.k, ojq0Var.k);
    }

    @Override // defpackage.sjq0
    public final String getAccountNumber() {
        return this.a;
    }

    @Override // defpackage.sjq0
    public final RequisitesTarget getTarget() {
        return this.i;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        RequisitesTarget requisitesTarget = this.i;
        int hashCode = (this.j.hashCode() + ((e + (requisitesTarget == null ? 0 : requisitesTarget.hashCode())) * 31)) * 31;
        DivDataDto divDataDto = this.k;
        return hashCode + (divDataDto != null ? divDataDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("RequisitesHcsTransfer(accountNumber=", this.a, ", bic=", this.b, ", beneficiaryName=");
        g8e.D(v, this.c, ", inn=", this.d, ", hcsPersonalAccount=");
        g8e.D(v, this.e, ", paymentPeriod=", this.f, ", paymentPurpose=");
        tse0.y(this.g, ", vatIncluded=", ", target=", v, this.h);
        v.append(this.i);
        v.append(", fromCircleButton=");
        v.append(this.j);
        v.append(", divkitWidget=");
        v.append(this.k);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
