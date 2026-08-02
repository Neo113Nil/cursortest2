package com.yandex.go.chargers.discounts.data.models;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/discounts/data/models/ChargersDiscountsItemDto$RentalPromoItemDto", "Lcom/yandex/go/chargers/discounts/data/models/a0;", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersDiscountsItemDto$RentalPromoItemDto extends a0 {
    public static final x Companion = new x();
    public final ChargersDiscountDto a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;
    public final FormattedText e;
    public final ChargersDiscountsToggleDto f;
    public final FormattedText g;
    public final FormattedText h;
    public final ChargersPromoDetailsDto i;

    public ChargersDiscountsItemDto$RentalPromoItemDto(int i, ChargersDiscountDto chargersDiscountDto, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, ChargersDiscountsToggleDto chargersDiscountsToggleDto, FormattedText formattedText4, FormattedText formattedText5, ChargersPromoDetailsDto chargersPromoDetailsDto) {
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
            this.f = chargersDiscountsToggleDto;
        }
        if ((i & 64) == 0) {
            this.g = FormattedText.c;
        } else {
            this.g = formattedText4;
        }
        if ((i & 128) == 0) {
            this.h = FormattedText.c;
        } else {
            this.h = formattedText5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = chargersPromoDetailsDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersDiscountsItemDto$RentalPromoItemDto)) {
            return false;
        }
        ChargersDiscountsItemDto$RentalPromoItemDto chargersDiscountsItemDto$RentalPromoItemDto = (ChargersDiscountsItemDto$RentalPromoItemDto) obj;
        return jl40.l(this.a, chargersDiscountsItemDto$RentalPromoItemDto.a) && jl40.l(this.b, chargersDiscountsItemDto$RentalPromoItemDto.b) && jl40.l(this.c, chargersDiscountsItemDto$RentalPromoItemDto.c) && jl40.l(this.d, chargersDiscountsItemDto$RentalPromoItemDto.d) && jl40.l(this.e, chargersDiscountsItemDto$RentalPromoItemDto.e) && jl40.l(this.f, chargersDiscountsItemDto$RentalPromoItemDto.f) && jl40.l(this.g, chargersDiscountsItemDto$RentalPromoItemDto.g) && jl40.l(this.h, chargersDiscountsItemDto$RentalPromoItemDto.h) && jl40.l(this.i, chargersDiscountsItemDto$RentalPromoItemDto.i);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c.a), 31, this.d.a), 31, this.e.a);
        ChargersDiscountsToggleDto chargersDiscountsToggleDto = this.f;
        int c2 = unr0.c(unr0.c((c + (chargersDiscountsToggleDto == null ? 0 : chargersDiscountsToggleDto.hashCode())) * 31, 31, this.g.a), 31, this.h.a);
        ChargersPromoDetailsDto chargersPromoDetailsDto = this.i;
        return c2 + (chargersPromoDetailsDto != null ? chargersPromoDetailsDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RentalPromoItemDto(discount=");
        sb.append(this.a);
        sb.append(", imageTag=");
        sb.append(this.b);
        sb.append(", body=");
        defpackage.n.C(sb, this.c, ", description=", this.d, ", rightBody=");
        sb.append(this.e);
        sb.append(", toggle=");
        sb.append(this.f);
        sb.append(", toggleText=");
        defpackage.n.C(sb, this.g, ", selectedToggleText=", this.h, ", details=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public ChargersDiscountsItemDto$RentalPromoItemDto() {
        ChargersDiscountDto chargersDiscountDto = new ChargersDiscountDto(0);
        FormattedText formattedText = FormattedText.c;
        this.a = chargersDiscountDto;
        this.b = "";
        this.c = formattedText;
        this.d = formattedText;
        this.e = formattedText;
        this.f = null;
        this.g = formattedText;
        this.h = formattedText;
        this.i = null;
    }
}
