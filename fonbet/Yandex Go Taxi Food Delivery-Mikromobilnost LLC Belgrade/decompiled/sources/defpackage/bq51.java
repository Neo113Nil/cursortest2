package defpackage;

import com.ybsdk.feature.card.api.entities.CardCarouselProductType;
import com.ybsdk.feature.card.api.entities.YbCardPaymentSystemEntity;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.card.api.entities.YbCardType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bq51 {
    public final YbCardType a;
    public final String b;
    public final String c;
    public final String d;
    public final YbCardStatusEntity e;
    public final List f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final YbCardPaymentSystemEntity k;
    public final String l;
    public final jq51 m;
    public final List n;
    public final wp51 o;
    public final CardCarouselProductType p;

    public bq51(YbCardType ybCardType, String str, String str2, String str3, YbCardStatusEntity ybCardStatusEntity, List list, boolean z, String str4, String str5, String str6, YbCardPaymentSystemEntity ybCardPaymentSystemEntity, String str7, jq51 jq51Var, List list2, wp51 wp51Var, CardCarouselProductType cardCarouselProductType) {
        this.a = ybCardType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = ybCardStatusEntity;
        this.f = list;
        this.g = z;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = ybCardPaymentSystemEntity;
        this.l = str7;
        this.m = jq51Var;
        this.n = list2;
        this.o = wp51Var;
        this.p = cardCarouselProductType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq51)) {
            return false;
        }
        bq51 bq51Var = (bq51) obj;
        return this.a == bq51Var.a && jl40.l(this.b, bq51Var.b) && jl40.l(this.c, bq51Var.c) && jl40.l(this.d, bq51Var.d) && this.e == bq51Var.e && this.f.equals(bq51Var.f) && this.g == bq51Var.g && jl40.l(this.h, bq51Var.h) && jl40.l(this.i, bq51Var.i) && jl40.l(this.j, bq51Var.j) && this.k == bq51Var.k && jl40.l(this.l, bq51Var.l) && jl40.l(this.m, bq51Var.m) && jl40.l(this.n, bq51Var.n) && this.o.equals(bq51Var.o) && this.p == bq51Var.p;
    }

    public final int hashCode() {
        YbCardType ybCardType = this.a;
        int hashCode = (ybCardType == null ? 0 : ybCardType.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int e = unr0.e(unr0.c((this.e.hashCode() + unr0.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d)) * 31, 31, this.f), 31, this.g);
        String str3 = this.h;
        int hashCode3 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int b = unr0.b((this.k.hashCode() + unr0.b((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.j)) * 31, 31, this.l);
        jq51 jq51Var = this.m;
        int hashCode4 = (this.o.hashCode() + unr0.c((b + (jq51Var == null ? 0 : jq51Var.hashCode())) * 31, 31, this.n)) * 31;
        CardCarouselProductType cardCarouselProductType = this.p;
        return hashCode4 + (cardCarouselProductType != null ? cardCarouselProductType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YbCardEntity(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        g8e.D(sb, this.c, ", cardId=", this.d, ", status=");
        sb.append(this.e);
        sb.append(", tokens=");
        sb.append(this.f);
        sb.append(", removable=");
        unr0.A(", supportUrl=", this.h, ", blockReason=", sb, this.g);
        g8e.D(sb, this.i, ", lastPanDigits=", this.j, ", paymentSystem=");
        sb.append(this.k);
        sb.append(", expirationDate=");
        sb.append(this.l);
        sb.append(", skin=");
        sb.append(this.m);
        sb.append(", settings=");
        sb.append(this.n);
        sb.append(", buttons=");
        sb.append(this.o);
        sb.append(", productType=");
        sb.append(this.p);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
