package com.yandex.go.chargers.offer.data.api;

import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.z1a;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersOfferVariantDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/data/api/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersOfferVariantDto {
    public static final t Companion = new t();
    public static final i3y[] e;
    public final String a;
    public final ChargersTariffDto b;
    public final List c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new z1a(27)), kotlin.a.b(lazyThreadSafetyMode, new z1a(28))};
    }

    public /* synthetic */ ChargersOfferVariantDto(int i, String str, ChargersTariffDto chargersTariffDto, List list, List list2) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, ChargersOfferVariantDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = chargersTariffDto;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersOfferVariantDto)) {
            return false;
        }
        ChargersOfferVariantDto chargersOfferVariantDto = (ChargersOfferVariantDto) obj;
        return jl40.l(this.a, chargersOfferVariantDto.a) && jl40.l(this.b, chargersOfferVariantDto.b) && jl40.l(this.c, chargersOfferVariantDto.c) && jl40.l(this.d, chargersOfferVariantDto.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersOfferVariantDto(offerId=");
        sb.append(this.a);
        sb.append(", tariff=");
        sb.append(this.b);
        sb.append(", buttons=");
        return vfc.p(sb, this.c, ", keys=", this.d, Extension.C_BRAKE);
    }
}
