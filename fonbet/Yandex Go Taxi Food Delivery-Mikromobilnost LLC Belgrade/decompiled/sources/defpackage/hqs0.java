package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.Align;

/* loaded from: classes5.dex */
public final class hqs0 {
    public final FormattedText a;
    public final FormattedText b;
    public final Align c;
    public final ul4 d;
    public final Integer e;
    public final Integer f;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public hqs0(FormattedText formattedText, FormattedText formattedText2, Align align, ul4 ul4Var, Integer num, Integer num2) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = align;
        this.d = ul4Var;
        this.e = num;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqs0)) {
            return false;
        }
        hqs0 hqs0Var = (hqs0) obj;
        return jl40.l(this.a, hqs0Var.a) && jl40.l(this.b, hqs0Var.b) && this.c == hqs0Var.c && jl40.l(this.d, hqs0Var.d) && jl40.l(this.e, hqs0Var.e) && jl40.l(this.f, hqs0Var.f);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
        FormattedText formattedText2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31)) * 31;
        ul4 ul4Var = this.d;
        int hashCode3 = (hashCode2 + (ul4Var == null ? 0 : ul4Var.hashCode())) * 31;
        Integer num = this.e;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "SlotBodyModel(title=" + this.a + ", subtitle=" + this.b + ", align=" + this.c + ", badge=" + this.d + ", titleMaxLines=" + this.e + ", subtitleMaxLines=" + this.f + Extension.C_BRAKE;
    }
}
