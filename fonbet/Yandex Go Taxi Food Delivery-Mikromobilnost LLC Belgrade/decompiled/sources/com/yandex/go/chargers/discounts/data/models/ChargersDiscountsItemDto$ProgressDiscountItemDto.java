package com.yandex.go.chargers.discounts.data.models;

import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersProgressImageParamsDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/chargers/discounts/data/models/ChargersDiscountsItemDto$ProgressDiscountItemDto", "Lcom/yandex/go/chargers/discounts/data/models/a0;", "Companion", "ProgressDiscountItemTitleDescriptionDto", "DiscountAttentionDto", "$serializer", "com/yandex/go/chargers/discounts/data/models/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersDiscountsItemDto$ProgressDiscountItemDto extends a0 {
    public static final u Companion = new u();
    public final ChargersDiscountDto a;
    public final ProgressDiscountItemTitleDescriptionDto b;
    public final ProgressDiscountItemTitleDescriptionDto c;
    public final String d;
    public final ChargersProgressImageParamsDto e;
    public final String f;
    public final ChargersProgressImageParamsDto g;
    public final int h;
    public final int i;
    public final ChargersAttributeDto j;
    public final String k;
    public final DiscountAttentionDto l;
    public final ChargersProgressDiscountDetailsDto m;

    public ChargersDiscountsItemDto$ProgressDiscountItemDto(int i, ChargersDiscountDto chargersDiscountDto, ProgressDiscountItemTitleDescriptionDto progressDiscountItemTitleDescriptionDto, ProgressDiscountItemTitleDescriptionDto progressDiscountItemTitleDescriptionDto2, String str, ChargersProgressImageParamsDto chargersProgressImageParamsDto, String str2, ChargersProgressImageParamsDto chargersProgressImageParamsDto2, int i2, int i3, ChargersAttributeDto chargersAttributeDto, String str3, DiscountAttentionDto discountAttentionDto, ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto) {
        this.a = (i & 1) == 0 ? new ChargersDiscountDto(0) : chargersDiscountDto;
        if ((i & 2) == 0) {
            this.b = new ProgressDiscountItemTitleDescriptionDto(0);
        } else {
            this.b = progressDiscountItemTitleDescriptionDto;
        }
        if ((i & 4) == 0) {
            this.c = new ProgressDiscountItemTitleDescriptionDto(0);
        } else {
            this.c = progressDiscountItemTitleDescriptionDto2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = chargersProgressImageParamsDto;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = chargersProgressImageParamsDto2;
        }
        if ((i & 128) == 0) {
            this.h = 0;
        } else {
            this.h = i2;
        }
        if ((i & 256) == 0) {
            this.i = 0;
        } else {
            this.i = i3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = chargersAttributeDto;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = discountAttentionDto;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = chargersProgressDiscountDetailsDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersDiscountsItemDto$ProgressDiscountItemDto)) {
            return false;
        }
        ChargersDiscountsItemDto$ProgressDiscountItemDto chargersDiscountsItemDto$ProgressDiscountItemDto = (ChargersDiscountsItemDto$ProgressDiscountItemDto) obj;
        return jl40.l(this.a, chargersDiscountsItemDto$ProgressDiscountItemDto.a) && jl40.l(this.b, chargersDiscountsItemDto$ProgressDiscountItemDto.b) && jl40.l(this.c, chargersDiscountsItemDto$ProgressDiscountItemDto.c) && jl40.l(this.d, chargersDiscountsItemDto$ProgressDiscountItemDto.d) && jl40.l(this.e, chargersDiscountsItemDto$ProgressDiscountItemDto.e) && jl40.l(this.f, chargersDiscountsItemDto$ProgressDiscountItemDto.f) && jl40.l(this.g, chargersDiscountsItemDto$ProgressDiscountItemDto.g) && this.h == chargersDiscountsItemDto$ProgressDiscountItemDto.h && this.i == chargersDiscountsItemDto$ProgressDiscountItemDto.i && jl40.l(this.j, chargersDiscountsItemDto$ProgressDiscountItemDto.j) && jl40.l(this.k, chargersDiscountsItemDto$ProgressDiscountItemDto.k) && jl40.l(this.l, chargersDiscountsItemDto$ProgressDiscountItemDto.l) && jl40.l(this.m, chargersDiscountsItemDto$ProgressDiscountItemDto.m);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ChargersProgressImageParamsDto chargersProgressImageParamsDto = this.e;
        int hashCode3 = (hashCode2 + (chargersProgressImageParamsDto == null ? 0 : chargersProgressImageParamsDto.hashCode())) * 31;
        String str2 = this.f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ChargersProgressImageParamsDto chargersProgressImageParamsDto2 = this.g;
        int b = oyr.b(this.i, oyr.b(this.h, (hashCode4 + (chargersProgressImageParamsDto2 == null ? 0 : chargersProgressImageParamsDto2.hashCode())) * 31, 31), 31);
        ChargersAttributeDto chargersAttributeDto = this.j;
        int hashCode5 = (b + (chargersAttributeDto == null ? 0 : chargersAttributeDto.hashCode())) * 31;
        String str3 = this.k;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DiscountAttentionDto discountAttentionDto = this.l;
        int hashCode7 = (hashCode6 + (discountAttentionDto == null ? 0 : discountAttentionDto.hashCode())) * 31;
        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto = this.m;
        return hashCode7 + (chargersProgressDiscountDetailsDto != null ? chargersProgressDiscountDetailsDto.hashCode() : 0);
    }

    public final String toString() {
        return "ProgressDiscountItemDto(discount=" + this.a + ", selectedTexts=" + this.b + ", texts=" + this.c + ", leadImageTag=" + this.d + ", leadProgressImageParams=" + this.e + ", trailImageTag=" + this.f + ", trailProgressImageParams=" + this.g + ", stepsCount=" + this.h + ", currentStep=" + this.i + ", attribute=" + this.j + ", backgroundColor=" + this.k + ", attention=" + this.l + ", details=" + this.m + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsItemDto$ProgressDiscountItemDto$DiscountAttentionDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DiscountAttentionDto {
        public static final v Companion = new v();
        public final FormattedText a;
        public final String b;

        public /* synthetic */ DiscountAttentionDto(int i, String str, FormattedText formattedText) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public DiscountAttentionDto() {
            this.a = FormattedText.c;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsItemDto$ProgressDiscountItemDto$ProgressDiscountItemTitleDescriptionDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/w", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ProgressDiscountItemTitleDescriptionDto {
        public static final w Companion = new w();
        public final FormattedText a;
        public final FormattedText b;

        public /* synthetic */ ProgressDiscountItemTitleDescriptionDto(int i, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
        }

        public ProgressDiscountItemTitleDescriptionDto() {
            this(0);
        }

        public ProgressDiscountItemTitleDescriptionDto(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
        }
    }

    public ChargersDiscountsItemDto$ProgressDiscountItemDto() {
        ChargersDiscountDto chargersDiscountDto = new ChargersDiscountDto(0);
        ProgressDiscountItemTitleDescriptionDto progressDiscountItemTitleDescriptionDto = new ProgressDiscountItemTitleDescriptionDto(0);
        ProgressDiscountItemTitleDescriptionDto progressDiscountItemTitleDescriptionDto2 = new ProgressDiscountItemTitleDescriptionDto(0);
        this.a = chargersDiscountDto;
        this.b = progressDiscountItemTitleDescriptionDto;
        this.c = progressDiscountItemTitleDescriptionDto2;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 0;
        this.i = 0;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
    }
}
