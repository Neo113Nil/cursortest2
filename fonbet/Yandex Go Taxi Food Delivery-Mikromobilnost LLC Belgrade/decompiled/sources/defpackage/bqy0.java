package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bqy0 {
    public final ArrayList a;
    public final FormattedText b;
    public final Object c;
    public final String d;

    public bqy0(ArrayList arrayList, FormattedText formattedText, Object obj, String str) {
        this.a = arrayList;
        this.b = formattedText;
        this.c = obj;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqy0)) {
            return false;
        }
        bqy0 bqy0Var = (bqy0) obj;
        return this.a.equals(bqy0Var.a) && jl40.l(this.b, bqy0Var.b) && jl40.l(this.c, bqy0Var.c) && jl40.l(this.d, bqy0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int c = smw0.c((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TextInputStopWordsItem(stopWords=" + this.a + ", errorText=" + this.b + ", stateValue=" + this.c + ", metricaLabel=" + this.d + Extension.C_BRAKE;
    }
}
