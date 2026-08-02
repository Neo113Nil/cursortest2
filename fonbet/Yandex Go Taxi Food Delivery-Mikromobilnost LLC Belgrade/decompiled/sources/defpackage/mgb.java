package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mgb {
    public final boolean a;
    public final String b;
    public final xvz0 c;
    public final rzj0 d;
    public final rr51 e;
    public final List f;
    public final String g;
    public final String h;

    public mgb(boolean z, String str, xvz0 xvz0Var, rzj0 rzj0Var, rr51 rr51Var, ArrayList arrayList, String str2, String str3) {
        this.a = z;
        this.b = str;
        this.c = xvz0Var;
        this.d = rzj0Var;
        this.e = rr51Var;
        this.f = arrayList;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgb)) {
            return false;
        }
        mgb mgbVar = (mgb) obj;
        return this.a == mgbVar.a && jl40.l(this.b, mgbVar.b) && jl40.l(this.c, mgbVar.c) && jl40.l(this.d, mgbVar.d) && jl40.l(this.e, mgbVar.e) && jl40.l(this.f, mgbVar.f) && jl40.l(this.g, mgbVar.g) && jl40.l(this.h, mgbVar.h);
    }

    public final int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        xvz0 xvz0Var = this.c;
        int hashCode = (this.d.hashCode() + ((b + (xvz0Var == null ? 0 : xvz0Var.hashCode())) * 31)) * 31;
        rr51 rr51Var = this.e;
        int hashCode2 = (hashCode + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        List list = this.f;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ly3.v("CheckPaymentEntityV2(isPaymentAllowed=", ", checkId=", this.b, ", tooltip=", this.a);
        v.append(this.c);
        v.append(", resultPageData=");
        v.append(this.d);
        v.append(", divkitWidget=");
        v.append(this.e);
        v.append(", divkitAgreementsChipText=");
        v.append(this.f);
        v.append(", repaymentPlanId=");
        return g8e.r(v, this.g, ", declineReason=", this.h, Extension.C_BRAKE);
    }
}
