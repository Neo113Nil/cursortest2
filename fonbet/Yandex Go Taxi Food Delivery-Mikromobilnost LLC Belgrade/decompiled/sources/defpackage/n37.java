package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.Style;

/* loaded from: classes5.dex */
public final class n37 {
    public final hqs0 a;
    public final Style b;
    public final ajf c;
    public final boolean d;
    public final boolean e;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public n37(hqs0 hqs0Var, Style style, ajf ajfVar, boolean z, boolean z2) {
        this.a = hqs0Var;
        this.b = style;
        this.c = ajfVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n37)) {
            return false;
        }
        n37 n37Var = (n37) obj;
        return this.a.equals(n37Var.a) && this.b == n37Var.b && jl40.l(this.c, n37Var.c) && this.d == n37Var.d && this.e == n37Var.e;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ajf ajfVar = this.c;
        return Boolean.hashCode(this.e) + unr0.e((hashCode + (ajfVar == null ? 0 : ajfVar.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonStyle(slot=");
        sb.append(this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", customStyle=");
        sb.append(this.c);
        sb.append(", isEnabled=");
        sb.append(this.d);
        sb.append(", isShimmering=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
