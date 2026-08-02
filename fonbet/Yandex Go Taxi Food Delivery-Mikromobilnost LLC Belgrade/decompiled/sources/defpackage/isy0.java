package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.attrbutedtext.api.TruncationMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class isy0 implements jsy0 {
    public final FormattedText a;
    public final TruncationMode b;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public isy0(FormattedText formattedText, TruncationMode truncationMode) {
        this.a = formattedText;
        this.b = truncationMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isy0)) {
            return false;
        }
        isy0 isy0Var = (isy0) obj;
        return this.a.equals(isy0Var.a) && this.b == isy0Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        TruncationMode truncationMode = this.b;
        return hashCode + (truncationMode == null ? 0 : truncationMode.hashCode());
    }

    public final String toString() {
        return "Static(text=" + this.a + ", truncationMode=" + this.b + Extension.C_BRAKE;
    }
}
