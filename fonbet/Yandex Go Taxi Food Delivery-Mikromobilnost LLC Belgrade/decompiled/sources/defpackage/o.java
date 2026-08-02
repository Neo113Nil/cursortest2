package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o {
    public final int a;
    public final FormattedText b;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public o(int i, FormattedText formattedText) {
        this.a = i;
        this.b = formattedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && this.b.equals(oVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AIChatDynamicTextItem(displayTimeMs=" + this.a + ", dynamicText=" + this.b + Extension.C_BRAKE;
    }
}
