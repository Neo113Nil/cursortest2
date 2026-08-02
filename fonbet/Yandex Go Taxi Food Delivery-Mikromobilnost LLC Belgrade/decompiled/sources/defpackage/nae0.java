package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.PopupType$TextHintPopup$ArrowDirection;

/* loaded from: classes5.dex */
public final class nae0 implements oae0 {
    public final FormattedText a;
    public final String b;
    public final PopupType$TextHintPopup$ArrowDirection c;
    public final m8s0 w;
    public final boolean x;

    public nae0(FormattedText formattedText, String str, PopupType$TextHintPopup$ArrowDirection popupType$TextHintPopup$ArrowDirection, l8s0 l8s0Var, boolean z) {
        this.a = formattedText;
        this.b = str;
        this.c = popupType$TextHintPopup$ArrowDirection;
        this.w = l8s0Var;
        this.x = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nae0)) {
            return false;
        }
        nae0 nae0Var = (nae0) obj;
        return this.a.equals(nae0Var.a) && jl40.l(this.b, nae0Var.b) && this.c == nae0Var.c && jl40.l(this.w, nae0Var.w) && this.x == nae0Var.x;
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        m8s0 m8s0Var = this.w;
        return Boolean.hashCode(this.x) + ((hashCode2 + (m8s0Var != null ? m8s0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextHintPopup(text=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", arrowDirection=");
        sb.append(this.c);
        sb.append(", showPolicy=");
        sb.append(this.w);
        sb.append(", isDismissable=");
        return x4e.i(sb, this.x, Extension.C_BRAKE);
    }
}
