package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.i1;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class g5j {
    public final FormattedText a;
    public final FormattedText b;
    public final OrderDetailsCardResponse.CardIcon c;
    public final i1 d;

    public g5j(FormattedText formattedText, FormattedText formattedText2, OrderDetailsCardResponse.CardIcon cardIcon, i1 i1Var) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = cardIcon;
        this.d = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5j)) {
            return false;
        }
        g5j g5jVar = (g5j) obj;
        return this.a.equals(g5jVar.a) && jl40.l(this.b, g5jVar.b) && jl40.l(this.c, g5jVar.c) && jl40.l(this.d, g5jVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31)) * 31;
        i1 i1Var = this.d;
        return hashCode2 + (i1Var != null ? i1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = n.r("DestinationContractModel(title=", this.a, ", subtitle=", this.b, ", icon=");
        r.append(this.c);
        r.append(", accessory=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
