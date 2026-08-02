package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.transfer.version2.api.entities.HcsInvoiceRequisitesEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hjq0 implements wjq0 {
    public final eh01 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ThemedImageUrlEntity f;
    public final HcsInvoiceRequisitesEntity g;

    public hjq0(eh01 eh01Var, String str, String str2, String str3, String str4, ThemedImageUrlEntity themedImageUrlEntity, HcsInvoiceRequisitesEntity hcsInvoiceRequisitesEntity) {
        this.a = eh01Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = themedImageUrlEntity;
        this.g = hcsInvoiceRequisitesEntity;
    }

    @Override // defpackage.wjq0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.wjq0
    public final eh01 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjq0)) {
            return false;
        }
        hjq0 hjq0Var = (hjq0) obj;
        return this.a.equals(hjq0Var.a) && jl40.l(this.b, hjq0Var.b) && jl40.l(this.c, hjq0Var.c) && jl40.l(this.d, hjq0Var.d) && jl40.l(this.e, hjq0Var.e) && this.f.equals(hjq0Var.f) && this.g.equals(hjq0Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int b2 = unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return this.g.hashCode() + xvz.c(this.f, (b2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HcsInvoiceTransfer(fromCircleButton=");
        sb.append(this.a);
        sb.append(", invoiceId=");
        sb.append(this.b);
        sb.append(", comment=");
        g8e.D(sb, this.c, ", title=", this.d, ", description=");
        sb.append(this.e);
        sb.append(", image=");
        sb.append(this.f);
        sb.append(", requisites=");
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
