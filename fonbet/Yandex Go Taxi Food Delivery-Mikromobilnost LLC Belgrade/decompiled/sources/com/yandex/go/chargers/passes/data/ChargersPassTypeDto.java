package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.nba;
import defpackage.sfa;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassTypeDto;", "", "Companion", "sfa", "SUBSCRIPTION", "RENTAL_PACKAGE", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPassTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersPassTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final sfa Companion;
    public static final ChargersPassTypeDto RENTAL_PACKAGE;
    public static final ChargersPassTypeDto SUBSCRIPTION;
    public static final ChargersPassTypeDto UNKNOWN;

    static {
        ChargersPassTypeDto chargersPassTypeDto = new ChargersPassTypeDto("SUBSCRIPTION", 0);
        SUBSCRIPTION = chargersPassTypeDto;
        ChargersPassTypeDto chargersPassTypeDto2 = new ChargersPassTypeDto("RENTAL_PACKAGE", 1);
        RENTAL_PACKAGE = chargersPassTypeDto2;
        ChargersPassTypeDto chargersPassTypeDto3 = new ChargersPassTypeDto("UNKNOWN", 2);
        UNKNOWN = chargersPassTypeDto3;
        ChargersPassTypeDto[] chargersPassTypeDtoArr = {chargersPassTypeDto, chargersPassTypeDto2, chargersPassTypeDto3};
        $VALUES = chargersPassTypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(chargersPassTypeDtoArr);
        Companion = new sfa();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nba(16));
    }

    public static ChargersPassTypeDto valueOf(String str) {
        return (ChargersPassTypeDto) Enum.valueOf(ChargersPassTypeDto.class, str);
    }

    public static ChargersPassTypeDto[] values() {
        return (ChargersPassTypeDto[]) $VALUES.clone();
    }
}
