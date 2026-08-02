package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gns {
    public final Text a;
    public final Text b;
    public final Text c;
    public final rr51 d;
    public final MoneyEntity e;
    public final h5a0 f;
    public final h5a0 g;
    public final Text h;
    public final uda0 i;
    public final uos j;
    public final Text k;
    public final String l;

    public gns(Text text, Text text2, Text text3, rr51 rr51Var, MoneyEntity moneyEntity, h5a0 h5a0Var, h5a0 h5a0Var2, Text text4, uda0 uda0Var, uos uosVar, Text text5, String str) {
        this.a = text;
        this.b = text2;
        this.c = text3;
        this.d = rr51Var;
        this.e = moneyEntity;
        this.f = h5a0Var;
        this.g = h5a0Var2;
        this.h = text4;
        this.i = uda0Var;
        this.j = uosVar;
        this.k = text5;
        this.l = str;
    }

    public static gns a(gns gnsVar, MoneyEntity moneyEntity, h5a0 h5a0Var, h5a0 h5a0Var2, Text text, int i) {
        Text text2 = gnsVar.a;
        Text text3 = gnsVar.b;
        Text text4 = gnsVar.c;
        rr51 rr51Var = gnsVar.d;
        if ((i & 16) != 0) {
            moneyEntity = gnsVar.e;
        }
        MoneyEntity moneyEntity2 = moneyEntity;
        h5a0 h5a0Var3 = (i & 32) != 0 ? gnsVar.f : h5a0Var;
        h5a0 h5a0Var4 = (i & 64) != 0 ? gnsVar.g : h5a0Var2;
        Text text5 = gnsVar.h;
        uda0 uda0Var = gnsVar.i;
        uos uosVar = gnsVar.j;
        Text text6 = (i & 1024) != 0 ? gnsVar.k : text;
        String str = gnsVar.l;
        gnsVar.getClass();
        return new gns(text2, text3, text4, rr51Var, moneyEntity2, h5a0Var3, h5a0Var4, text5, uda0Var, uosVar, text6, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gns)) {
            return false;
        }
        gns gnsVar = (gns) obj;
        return this.a.equals(gnsVar.a) && this.b.equals(gnsVar.b) && this.c.equals(gnsVar.c) && this.d.equals(gnsVar.d) && jl40.l(this.e, gnsVar.e) && jl40.l(this.f, gnsVar.f) && jl40.l(this.g, gnsVar.g) && this.h.equals(gnsVar.h) && this.i.equals(gnsVar.i) && this.j.equals(gnsVar.j) && jl40.l(this.k, gnsVar.k) && jl40.l(this.l, gnsVar.l);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + n.c(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        MoneyEntity moneyEntity = this.e;
        int hashCode2 = (hashCode + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31;
        h5a0 h5a0Var = this.f;
        int hashCode3 = (hashCode2 + (h5a0Var == null ? 0 : h5a0Var.hashCode())) * 31;
        h5a0 h5a0Var2 = this.g;
        int hashCode4 = (this.j.hashCode() + ((this.i.hashCode() + n.c(this.h, (hashCode3 + (h5a0Var2 == null ? 0 : h5a0Var2.hashCode())) * 31, 31)) * 31)) * 31;
        Text text = this.k;
        return this.l.hashCode() + ((hashCode4 + (text != null ? text.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder p = n.p("OpenAndBuyScreen(title=", this.a, ", subtitle=", this.b, ", buttonText=");
        p.append(this.c);
        p.append(", divBlock=");
        p.append(this.d);
        p.append(", amount=");
        p.append(this.e);
        p.append(", selectedPaymentMethod=");
        p.append(this.f);
        p.append(", newSelectedPaymentMethod=");
        p.append(this.g);
        p.append(", primaryButtonText=");
        p.append(this.h);
        p.append(", paymentMethods=");
        p.append(this.i);
        p.append(", limitsData=");
        p.append(this.j);
        p.append(", errorText=");
        p.append(this.k);
        p.append(", fundAgreementId=");
        p.append(this.l);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
