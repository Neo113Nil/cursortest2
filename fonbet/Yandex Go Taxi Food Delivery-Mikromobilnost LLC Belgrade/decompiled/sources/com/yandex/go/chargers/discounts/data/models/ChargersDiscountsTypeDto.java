package com.yandex.go.chargers.discounts.data.models;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.nw9;
import defpackage.wu9;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsTypeDto;", "", "Companion", "nw9", "RENTAL", "PARTNERS", "TASKS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscountsTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersDiscountsTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final nw9 Companion;
    public static final ChargersDiscountsTypeDto PARTNERS;
    public static final ChargersDiscountsTypeDto RENTAL;
    public static final ChargersDiscountsTypeDto TASKS;

    static {
        ChargersDiscountsTypeDto chargersDiscountsTypeDto = new ChargersDiscountsTypeDto("RENTAL", 0);
        RENTAL = chargersDiscountsTypeDto;
        ChargersDiscountsTypeDto chargersDiscountsTypeDto2 = new ChargersDiscountsTypeDto("PARTNERS", 1);
        PARTNERS = chargersDiscountsTypeDto2;
        ChargersDiscountsTypeDto chargersDiscountsTypeDto3 = new ChargersDiscountsTypeDto("TASKS", 2);
        TASKS = chargersDiscountsTypeDto3;
        ChargersDiscountsTypeDto[] chargersDiscountsTypeDtoArr = {chargersDiscountsTypeDto, chargersDiscountsTypeDto2, chargersDiscountsTypeDto3};
        $VALUES = chargersDiscountsTypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(chargersDiscountsTypeDtoArr);
        Companion = new nw9();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wu9(6));
    }

    public static ChargersDiscountsTypeDto valueOf(String str) {
        return (ChargersDiscountsTypeDto) Enum.valueOf(ChargersDiscountsTypeDto.class, str);
    }

    public static ChargersDiscountsTypeDto[] values() {
        return (ChargersDiscountsTypeDto[]) $VALUES.clone();
    }
}
