package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ButtonSize;

/* loaded from: classes5.dex */
public final class ex90 implements pre, pru {
    public final String a;
    public final FormattedText b;
    public final hty0 c;
    public final String d;
    public final ButtonSize e;
    public final String f;
    public final List g;
    public final String h;

    public ex90(String str, FormattedText formattedText, hty0 hty0Var, String str2, ButtonSize buttonSize, String str3, List list, String str4) {
        this.a = str;
        this.b = formattedText;
        this.c = hty0Var;
        this.d = str2;
        this.e = buttonSize;
        this.f = str3;
        this.g = list;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex90)) {
            return false;
        }
        ex90 ex90Var = (ex90) obj;
        return jl40.l(this.a, ex90Var.a) && jl40.l(this.b, ex90Var.b) && this.c.equals(ex90Var.c) && jl40.l(this.d, ex90Var.d) && this.e == ex90Var.e && jl40.l(this.f, ex90Var.f) && jl40.l(this.g, ex90Var.g) && jl40.l(this.h, ex90Var.h);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "payment-button";
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int c = unr0.c(unr0.b((this.e.hashCode() + unr0.b((this.c.hashCode() + ((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31)) * 31, 31, this.d)) * 31, 31, this.f), 31, this.g);
        String str = this.h;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentButtonRemoteCoreWidget(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitleStyle=");
        sb.append(this.c);
        sb.append(", unselectedPaymentText=");
        sb.append(this.d);
        sb.append(", buttonSize=");
        sb.append(this.e);
        sb.append(", backgroundColor=");
        sb.append(this.f);
        sb.append(", availablePaymentTypes=");
        return n.l(", metricaLabel=", this.h, Extension.C_BRAKE, sb, this.g);
    }
}
