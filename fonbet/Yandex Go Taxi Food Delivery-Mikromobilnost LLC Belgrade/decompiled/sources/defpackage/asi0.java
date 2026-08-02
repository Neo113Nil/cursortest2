package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class asi0 {
    public final csi0 a;
    public final tsz0 b;
    public final ztv c;
    public final uda0 d;
    public final String e;
    public final String f;
    public final bk11 g;
    public final h5a0 h;
    public final List i;
    public final oz3 j;

    public asi0(csi0 csi0Var, tsz0 tsz0Var, ztv ztvVar, uda0 uda0Var, String str, String str2, bk11 bk11Var, h5a0 h5a0Var, List list, oz3 oz3Var) {
        this.a = csi0Var;
        this.b = tsz0Var;
        this.c = ztvVar;
        this.d = uda0Var;
        this.e = str;
        this.f = str2;
        this.g = bk11Var;
        this.h = h5a0Var;
        this.i = list;
        this.j = oz3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asi0)) {
            return false;
        }
        asi0 asi0Var = (asi0) obj;
        return jl40.l(this.a, asi0Var.a) && this.b.equals(asi0Var.b) && this.c.equals(asi0Var.c) && this.d.equals(asi0Var.d) && jl40.l(this.e, asi0Var.e) && jl40.l(this.f, asi0Var.f) && this.g.equals(asi0Var.g) && jl40.l(this.h, asi0Var.h) && jl40.l(this.i, asi0Var.i) && jl40.l(this.j, asi0Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + unr0.b(unr0.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f)) * 31;
        h5a0 h5a0Var = this.h;
        int hashCode2 = (hashCode + (h5a0Var == null ? 0 : h5a0Var.hashCode())) * 31;
        List list = this.i;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        oz3 oz3Var = this.j;
        return hashCode3 + (oz3Var != null ? oz3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegularAutoTopupSettingsEntity(data=");
        sb.append(this.a);
        sb.append(", toolbar=");
        sb.append(this.b);
        sb.append(", infoButton=");
        sb.append(this.c);
        sb.append(", paymentMethodsWithButtons=");
        sb.append(this.d);
        sb.append(", saveButtonText=");
        g8e.D(sb, this.e, ", turnOffButtonText=", this.f, ", turnOffNoticeInfo=");
        sb.append(this.g);
        sb.append(", currentPaymentMethod=");
        sb.append(this.h);
        sb.append(", boundPaymentMethodIds=");
        sb.append(this.i);
        sb.append(", bindingPaymentInstructions=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
