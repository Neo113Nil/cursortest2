package com.yandex.go.chargers.discounts.data.models;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/discounts/data/models/ChargersDiscountsActivateDiscountItemDto$DiscountItemDto", "Lcom/yandex/go/chargers/discounts/data/models/i;", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersDiscountsActivateDiscountItemDto$DiscountItemDto extends i {
    public static final f Companion = new f();
    public final String a;

    public ChargersDiscountsActivateDiscountItemDto$DiscountItemDto(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    @Override // com.yandex.go.chargers.discounts.data.models.i
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // com.yandex.go.chargers.discounts.data.models.i
    public final ChargersDiscountTypeDto b() {
        return ChargersDiscountTypeDto.DISCOUNT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChargersDiscountsActivateDiscountItemDto$DiscountItemDto) && jl40.l(this.a, ((ChargersDiscountsActivateDiscountItemDto$DiscountItemDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("DiscountItemDto(id=", this.a, Extension.C_BRAKE);
    }

    public ChargersDiscountsActivateDiscountItemDto$DiscountItemDto() {
        this.a = "";
    }
}
