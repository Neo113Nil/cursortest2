package com.yandex.go.chargers.discounts.api.data.model;

import defpackage.ak9;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/discounts/api/data/model/ChargersDiscountDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/discounts/api/data/model/a", "go-client-android.features.chargers.discounts:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscountDto {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(23)), null};
    public final ChargersDiscountTypeDto a;
    public final String b;

    public /* synthetic */ ChargersDiscountDto(int i, ChargersDiscountTypeDto chargersDiscountTypeDto, String str) {
        this.a = (i & 1) == 0 ? ChargersDiscountTypeDto.EMPTY : chargersDiscountTypeDto;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public ChargersDiscountDto() {
        this(0);
    }

    public ChargersDiscountDto(ChargersDiscountTypeDto chargersDiscountTypeDto, String str) {
        this.a = chargersDiscountTypeDto;
        this.b = str;
    }

    public /* synthetic */ ChargersDiscountDto(int i) {
        this(ChargersDiscountTypeDto.EMPTY, "");
    }
}
