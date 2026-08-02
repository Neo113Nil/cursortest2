package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.i1;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class f5j {
    public final FormattedText a;
    public final OrderDetailsCardResponse.CardIcon b;
    public final i1 c;

    public f5j(FormattedText formattedText, OrderDetailsCardResponse.CardIcon cardIcon, i1 i1Var) {
        this.a = formattedText;
        this.b = cardIcon;
        this.c = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5j)) {
            return false;
        }
        f5j f5jVar = (f5j) obj;
        return this.a.equals(f5jVar.a) && jl40.l(this.b, f5jVar.b) && jl40.l(this.c, f5jVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        i1 i1Var = this.c;
        return hashCode + (i1Var == null ? 0 : i1Var.hashCode());
    }

    public final String toString() {
        return "AddDestinationContractModel(title=" + this.a + ", icon=" + this.b + ", accessory=" + this.c + Extension.C_BRAKE;
    }
}
