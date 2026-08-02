package com.yandex.go.chargers.discounts.data.models;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.vfc;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/discounts/data/models/ChargersDiscountsItemDto$TaskDiscountItemDto", "Lcom/yandex/go/chargers/discounts/data/models/a0;", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersDiscountsItemDto$TaskDiscountItemDto extends a0 {
    public static final y Companion = new y();
    public final ChargersDiscountDto a;
    public final String b;
    public final String c;
    public final FormattedText d;
    public final FormattedText e;
    public final FormattedText f;
    public final int g;
    public final int h;
    public final FormattedText i;
    public final String j;
    public final String k;
    public final ChargersTaskDiscountDetailsDto l;

    public ChargersDiscountsItemDto$TaskDiscountItemDto(int i, ChargersDiscountDto chargersDiscountDto, String str, String str2, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, int i2, int i3, FormattedText formattedText4, String str3, String str4, ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto) {
        this.a = (i & 1) == 0 ? new ChargersDiscountDto(0) : chargersDiscountDto;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText;
        }
        if ((i & 16) == 0) {
            this.e = FormattedText.c;
        } else {
            this.e = formattedText2;
        }
        if ((i & 32) == 0) {
            this.f = FormattedText.c;
        } else {
            this.f = formattedText3;
        }
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = i2;
        }
        if ((i & 128) == 0) {
            this.h = 0;
        } else {
            this.h = i3;
        }
        if ((i & 256) == 0) {
            this.i = FormattedText.c;
        } else {
            this.i = formattedText4;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str3;
        }
        if ((i & 1024) == 0) {
            this.k = "";
        } else {
            this.k = str4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = chargersTaskDiscountDetailsDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersDiscountsItemDto$TaskDiscountItemDto)) {
            return false;
        }
        ChargersDiscountsItemDto$TaskDiscountItemDto chargersDiscountsItemDto$TaskDiscountItemDto = (ChargersDiscountsItemDto$TaskDiscountItemDto) obj;
        return jl40.l(this.a, chargersDiscountsItemDto$TaskDiscountItemDto.a) && jl40.l(this.b, chargersDiscountsItemDto$TaskDiscountItemDto.b) && jl40.l(this.c, chargersDiscountsItemDto$TaskDiscountItemDto.c) && jl40.l(this.d, chargersDiscountsItemDto$TaskDiscountItemDto.d) && jl40.l(this.e, chargersDiscountsItemDto$TaskDiscountItemDto.e) && jl40.l(this.f, chargersDiscountsItemDto$TaskDiscountItemDto.f) && this.g == chargersDiscountsItemDto$TaskDiscountItemDto.g && this.h == chargersDiscountsItemDto$TaskDiscountItemDto.h && jl40.l(this.i, chargersDiscountsItemDto$TaskDiscountItemDto.i) && jl40.l(this.j, chargersDiscountsItemDto$TaskDiscountItemDto.j) && jl40.l(this.k, chargersDiscountsItemDto$TaskDiscountItemDto.k) && jl40.l(this.l, chargersDiscountsItemDto$TaskDiscountItemDto.l);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.c(oyr.b(this.h, oyr.b(this.g, unr0.c(unr0.c(unr0.c(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d.a), 31, this.e.a), 31, this.f.a), 31), 31), 31, this.i.a), 31, this.j), 31, this.k);
        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto = this.l;
        return b + (chargersTaskDiscountDetailsDto == null ? 0 : chargersTaskDiscountDetailsDto.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskDiscountItemDto(discount=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", imageTag=");
        sb.append(this.c);
        sb.append(", body=");
        sb.append(this.d);
        sb.append(", description=");
        defpackage.n.C(sb, this.e, ", rightBody=", this.f, ", stepsCount=");
        vfc.u(this.g, this.h, ", currentStep=", ", progressDescriptionText=", sb);
        sb.append(this.i);
        sb.append(", activeProgressColor=");
        sb.append(this.j);
        sb.append(", baseProgressColor=");
        sb.append(this.k);
        sb.append(", details=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public ChargersDiscountsItemDto$TaskDiscountItemDto() {
        ChargersDiscountDto chargersDiscountDto = new ChargersDiscountDto(0);
        FormattedText formattedText = FormattedText.c;
        this.a = chargersDiscountDto;
        this.b = "";
        this.c = "";
        this.d = formattedText;
        this.e = formattedText;
        this.f = formattedText;
        this.g = 0;
        this.h = 0;
        this.i = formattedText;
        this.j = "";
        this.k = "";
        this.l = null;
    }
}
