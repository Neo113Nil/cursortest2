package com.yandex.go.chargers.discounts.data.models;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/discounts/data/models/ChargersDiscountsItemDto$PartnerPromoItemDto", "Lcom/yandex/go/chargers/discounts/data/models/a0;", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersDiscountsItemDto$PartnerPromoItemDto extends a0 {
    public static final t Companion = new t();
    public final ChargersDiscountDto a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;
    public final FormattedText e;
    public final ChargersPromoDetailsDto f;

    public ChargersDiscountsItemDto$PartnerPromoItemDto(int i, ChargersDiscountDto chargersDiscountDto, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, ChargersPromoDetailsDto chargersPromoDetailsDto) {
        this.a = (i & 1) == 0 ? new ChargersDiscountDto(0) : chargersDiscountDto;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText2;
        }
        if ((i & 16) == 0) {
            this.e = FormattedText.c;
        } else {
            this.e = formattedText3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = chargersPromoDetailsDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersDiscountsItemDto$PartnerPromoItemDto)) {
            return false;
        }
        ChargersDiscountsItemDto$PartnerPromoItemDto chargersDiscountsItemDto$PartnerPromoItemDto = (ChargersDiscountsItemDto$PartnerPromoItemDto) obj;
        return jl40.l(this.a, chargersDiscountsItemDto$PartnerPromoItemDto.a) && jl40.l(this.b, chargersDiscountsItemDto$PartnerPromoItemDto.b) && jl40.l(this.c, chargersDiscountsItemDto$PartnerPromoItemDto.c) && jl40.l(this.d, chargersDiscountsItemDto$PartnerPromoItemDto.d) && jl40.l(this.e, chargersDiscountsItemDto$PartnerPromoItemDto.e) && jl40.l(this.f, chargersDiscountsItemDto$PartnerPromoItemDto.f);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c.a), 31, this.d.a), 31, this.e.a);
        ChargersPromoDetailsDto chargersPromoDetailsDto = this.f;
        return c + (chargersPromoDetailsDto == null ? 0 : chargersPromoDetailsDto.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerPromoItemDto(discount=");
        sb.append(this.a);
        sb.append(", imageTag=");
        sb.append(this.b);
        sb.append(", body=");
        defpackage.n.C(sb, this.c, ", description=", this.d, ", rightBody=");
        sb.append(this.e);
        sb.append(", details=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public ChargersDiscountsItemDto$PartnerPromoItemDto() {
        ChargersDiscountDto chargersDiscountDto = new ChargersDiscountDto(0);
        FormattedText formattedText = FormattedText.c;
        this.a = chargersDiscountDto;
        this.b = "";
        this.c = formattedText;
        this.d = formattedText;
        this.e = formattedText;
        this.f = null;
    }
}
