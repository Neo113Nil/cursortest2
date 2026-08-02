package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lk81;", "", "Companion", "i81", "j81", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class k81 {
    public static final j81 Companion = new j81();
    public final FormattedText a;
    public final FormattedText b;

    public /* synthetic */ k81(int i, FormattedText formattedText, FormattedText formattedText2) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k81)) {
            return false;
        }
        k81 k81Var = (k81) obj;
        return jl40.l(this.a, k81Var.a) && jl40.l(this.b, k81Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddressTopRegularDescription(title=" + this.a + ", subtitle=" + this.b + Extension.C_BRAKE;
    }

    public k81() {
        this(0);
    }

    public k81(int i) {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = formattedText;
    }
}
