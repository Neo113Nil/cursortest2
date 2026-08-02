package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jd3 extends s4z0 {
    public final FormattedText a;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public jd3(FormattedText formattedText) {
        this.a = formattedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jd3) && this.a.equals(((jd3) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "AttributedTextTileFooterModel(title=" + this.a + Extension.C_BRAKE;
    }
}
