package defpackage;

import com.yandex.go.multitariff.Description;
import com.yandex.go.multitariff.OrderButton;
import com.yandex.go.routestats.PriceMeta;
import com.yandex.go.zone.dto.response.SearchScreen;
import com.yandex.go.zone.dto.response.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class en40 {
    public final String a;
    public final PriceMeta b;
    public final String c;
    public final OrderButton d;
    public final SearchScreen e;
    public final Description f;
    public final c g;

    public en40(String str, PriceMeta priceMeta, String str2, OrderButton orderButton, SearchScreen searchScreen, Description description, c cVar) {
        this.a = str;
        this.b = priceMeta;
        this.c = str2;
        this.d = orderButton;
        this.e = searchScreen;
        this.f = description;
        this.g = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en40)) {
            return false;
        }
        en40 en40Var = (en40) obj;
        return jl40.l(this.a, en40Var.a) && jl40.l(this.b, en40Var.b) && jl40.l(this.c, en40Var.c) && jl40.l(this.d, en40Var.d) && jl40.l(this.e, en40Var.e) && jl40.l(this.f, en40Var.f) && jl40.l(this.g, en40Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PriceMeta priceMeta = this.b;
        int hashCode2 = (hashCode + (priceMeta == null ? 0 : priceMeta.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        SearchScreen searchScreen = this.e;
        int hashCode4 = (hashCode3 + (searchScreen == null ? 0 : searchScreen.hashCode())) * 31;
        Description description = this.f;
        int hashCode5 = (hashCode4 + (description == null ? 0 : description.hashCode())) * 31;
        c cVar = this.g;
        return hashCode5 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "MultiTariffOptionDetails(price=" + this.a + ", priceMeta=" + this.b + ", description=" + this.c + ", orderButton=" + this.d + ", searchScreen=" + this.e + ", detailedDescription=" + this.f + ", estimatedWaitingDto=" + this.g + Extension.C_BRAKE;
    }
}
