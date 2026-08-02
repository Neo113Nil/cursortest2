package defpackage;

import com.yandex.go.multitariff.Description;
import com.yandex.go.multitariff.OrderButton;
import com.yandex.go.routestats.PriceMeta;
import com.yandex.go.zone.dto.response.SearchScreen;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class df31 {
    public final String a;
    public final PriceMeta b;
    public final OrderButton c;
    public final Description d;
    public final SearchScreen e;

    public df31(String str, PriceMeta priceMeta, OrderButton orderButton, Description description, SearchScreen searchScreen) {
        this.a = str;
        this.b = priceMeta;
        this.c = orderButton;
        this.d = description;
        this.e = searchScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df31)) {
            return false;
        }
        df31 df31Var = (df31) obj;
        return jl40.l(this.a, df31Var.a) && jl40.l(this.b, df31Var.b) && jl40.l(this.c, df31Var.c) && jl40.l(this.d, df31Var.d) && jl40.l(this.e, df31Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PriceMeta priceMeta = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (priceMeta == null ? 0 : priceMeta.hashCode())) * 31)) * 31)) * 31;
        SearchScreen searchScreen = this.e;
        return hashCode2 + (searchScreen != null ? searchScreen.hashCode() : 0);
    }

    public final String toString() {
        return "VerticalMulticlassDetails(price=" + this.a + ", priceMeta=" + this.b + ", orderButton=" + this.c + ", description=" + this.d + ", searchScreen=" + this.e + Extension.C_BRAKE;
    }
}
