package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class p5k0 {
    public final FormattedText a;
    public final String b;
    public final OrderStatusInfo.RidaSearchInfo.BackgroundColors c;

    public p5k0(FormattedText formattedText, String str, OrderStatusInfo.RidaSearchInfo.BackgroundColors backgroundColors) {
        this.a = formattedText;
        this.b = str;
        this.c = backgroundColors;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5k0)) {
            return false;
        }
        p5k0 p5k0Var = (p5k0) obj;
        return jl40.l(this.a, p5k0Var.a) && jl40.l(this.b, p5k0Var.b) && jl40.l(this.c, p5k0Var.c);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RidaHeaderData(title=" + this.a + ", subtitle=" + this.b + ", backgroundColors=" + this.c + Extension.C_BRAKE;
    }
}
