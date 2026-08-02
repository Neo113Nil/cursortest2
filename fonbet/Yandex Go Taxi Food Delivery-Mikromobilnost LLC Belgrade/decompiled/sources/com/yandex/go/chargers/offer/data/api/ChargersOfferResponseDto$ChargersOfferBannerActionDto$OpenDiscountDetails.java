package com.yandex.go.chargers.offer.data.api;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto$ChargersOfferBannerActionDto$OpenDiscountDetails", "Lcom/yandex/go/chargers/offer/data/api/h;", "Companion", "$serializer", "com/yandex/go/chargers/offer/data/api/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersOfferResponseDto$ChargersOfferBannerActionDto$OpenDiscountDetails extends h {
    public static final f Companion = new f();
    public final ChargersDiscountDto a;

    public ChargersOfferResponseDto$ChargersOfferBannerActionDto$OpenDiscountDetails(int i, ChargersDiscountDto chargersDiscountDto) {
        if (1 == (i & 1)) {
            this.a = chargersDiscountDto;
        } else {
            qje.Z(i, 1, ChargersOfferResponseDto$ChargersOfferBannerActionDto$OpenDiscountDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChargersOfferResponseDto$ChargersOfferBannerActionDto$OpenDiscountDetails) && jl40.l(this.a, ((ChargersOfferResponseDto$ChargersOfferBannerActionDto$OpenDiscountDetails) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenDiscountDetails(discount=" + this.a + Extension.C_BRAKE;
    }
}
