package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.mapper.model.state.Align;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class iqs0 {
    public final Align a;
    public final FormattedText b;
    public final FormattedText c;

    public iqs0(Align align, FormattedText formattedText, FormattedText formattedText2) {
        this.a = align;
        this.b = formattedText;
        this.c = formattedText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqs0)) {
            return false;
        }
        iqs0 iqs0Var = (iqs0) obj;
        return this.a == iqs0Var.a && this.b.equals(iqs0Var.b) && jl40.l(this.c, iqs0Var.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b.a);
        FormattedText formattedText = this.c;
        return c + (formattedText == null ? 0 : formattedText.a.hashCode());
    }

    public final String toString() {
        return "SlotBodyState(align=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + Extension.C_BRAKE;
    }
}
