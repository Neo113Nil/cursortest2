package com.yandex.go.chargers.discounts.api.data.model;

import defpackage.ak9;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kt9;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/chargers/discounts/api/data/model/ChargersDiscountTypeDto;", "", "Companion", "kt9", JCP.RAW_PREFIX, "PROMOCODE", "DISCOUNT", "EMPTY", "go-client-android.features.chargers.discounts:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscountTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersDiscountTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final kt9 Companion;
    public static final ChargersDiscountTypeDto DISCOUNT;
    public static final ChargersDiscountTypeDto EMPTY;
    public static final ChargersDiscountTypeDto NONE;
    public static final ChargersDiscountTypeDto PROMOCODE;

    static {
        ChargersDiscountTypeDto chargersDiscountTypeDto = new ChargersDiscountTypeDto(JCP.RAW_PREFIX, 0);
        NONE = chargersDiscountTypeDto;
        ChargersDiscountTypeDto chargersDiscountTypeDto2 = new ChargersDiscountTypeDto("PROMOCODE", 1);
        PROMOCODE = chargersDiscountTypeDto2;
        ChargersDiscountTypeDto chargersDiscountTypeDto3 = new ChargersDiscountTypeDto("DISCOUNT", 2);
        DISCOUNT = chargersDiscountTypeDto3;
        ChargersDiscountTypeDto chargersDiscountTypeDto4 = new ChargersDiscountTypeDto("EMPTY", 3);
        EMPTY = chargersDiscountTypeDto4;
        ChargersDiscountTypeDto[] chargersDiscountTypeDtoArr = {chargersDiscountTypeDto, chargersDiscountTypeDto2, chargersDiscountTypeDto3, chargersDiscountTypeDto4};
        $VALUES = chargersDiscountTypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(chargersDiscountTypeDtoArr);
        Companion = new kt9();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(25));
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static ChargersDiscountTypeDto valueOf(String str) {
        return (ChargersDiscountTypeDto) Enum.valueOf(ChargersDiscountTypeDto.class, str);
    }

    public static ChargersDiscountTypeDto[] values() {
        return (ChargersDiscountTypeDto[]) $VALUES.clone();
    }
}
