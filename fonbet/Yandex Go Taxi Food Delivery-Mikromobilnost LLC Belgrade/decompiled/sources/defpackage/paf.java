package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class paf {
    public final Text a;
    public final Text b;
    public final String c;
    public final saf d;
    public final nbf e;
    public final MoneyEntity f;
    public final b790 g;
    public final x9f h;
    public final boolean i;
    public final Text j;

    public paf(Text text, Text text2, String str, saf safVar, nbf nbfVar, MoneyEntity moneyEntity, b790 b790Var, x9f x9fVar, boolean z, Text.Constant constant) {
        this.a = text;
        this.b = text2;
        this.c = str;
        this.d = safVar;
        this.e = nbfVar;
        this.f = moneyEntity;
        this.g = b790Var;
        this.h = x9fVar;
        this.i = z;
        this.j = constant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof paf)) {
            return false;
        }
        paf pafVar = (paf) obj;
        return jl40.l(this.a, pafVar.a) && jl40.l(this.b, pafVar.b) && jl40.l(this.c, pafVar.c) && jl40.l(this.d, pafVar.d) && jl40.l(this.e, pafVar.e) && jl40.l(this.f, pafVar.f) && jl40.l(this.g, pafVar.g) && this.h.equals(pafVar.h) && this.i == pafVar.i && jl40.l(this.j, pafVar.j);
    }

    public final int hashCode() {
        int c = n.c(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int d = ly3.d(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31);
        b790 b790Var = this.g;
        int e = unr0.e((this.h.hashCode() + ((d + (b790Var == null ? 0 : b790Var.hashCode())) * 31)) * 31, 31, this.i);
        Text text = this.j;
        return e + (text != null ? text.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder p = n.p("CreditDepositPageEntity(title=", this.a, ", paymentMethodSheetTitle=", this.b, ", paymentMethodsDeeplink=");
        p.append(this.c);
        p.append(", defaultPaymentMethod=");
        p.append(this.d);
        p.append(", paymentMethodList=");
        p.append(this.e);
        p.append(", defaultAmountValue=");
        p.append(this.f);
        p.append(", pageInfo=");
        p.append(this.g);
        p.append(", amountCheckEntity=");
        p.append(this.h);
        p.append(", isKeyboardVisible=");
        p.append(this.i);
        p.append(", buttonText=");
        p.append(this.j);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
