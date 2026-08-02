package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.SeparateTitle$Align;

/* loaded from: classes5.dex */
public final class irq0 {
    public final FormattedText a;
    public final SeparateTitle$Align b;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public irq0(FormattedText formattedText, SeparateTitle$Align separateTitle$Align) {
        this.a = formattedText;
        this.b = separateTitle$Align;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irq0)) {
            return false;
        }
        irq0 irq0Var = (irq0) obj;
        return this.a.equals(irq0Var.a) && this.b == irq0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "SeparateTitle(text=" + this.a + ", align=" + this.b + Extension.C_BRAKE;
    }
}
