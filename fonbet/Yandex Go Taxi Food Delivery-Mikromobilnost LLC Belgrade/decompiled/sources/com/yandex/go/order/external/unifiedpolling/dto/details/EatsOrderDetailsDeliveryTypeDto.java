package com.yandex.go.order.external.unifiedpolling.dto.details;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ktm;
import defpackage.wen;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/order/external/unifiedpolling/dto/details/EatsOrderDetailsDeliveryTypeDto;", "", "Companion", "wen", "NATIVE", "MARKETPLACE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EatsOrderDetailsDeliveryTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EatsOrderDetailsDeliveryTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final wen Companion;
    public static final EatsOrderDetailsDeliveryTypeDto MARKETPLACE;
    public static final EatsOrderDetailsDeliveryTypeDto NATIVE;

    static {
        EatsOrderDetailsDeliveryTypeDto eatsOrderDetailsDeliveryTypeDto = new EatsOrderDetailsDeliveryTypeDto("NATIVE", 0);
        NATIVE = eatsOrderDetailsDeliveryTypeDto;
        EatsOrderDetailsDeliveryTypeDto eatsOrderDetailsDeliveryTypeDto2 = new EatsOrderDetailsDeliveryTypeDto("MARKETPLACE", 1);
        MARKETPLACE = eatsOrderDetailsDeliveryTypeDto2;
        EatsOrderDetailsDeliveryTypeDto[] eatsOrderDetailsDeliveryTypeDtoArr = {eatsOrderDetailsDeliveryTypeDto, eatsOrderDetailsDeliveryTypeDto2};
        $VALUES = eatsOrderDetailsDeliveryTypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(eatsOrderDetailsDeliveryTypeDtoArr);
        Companion = new wen();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ktm(23));
    }

    public static EatsOrderDetailsDeliveryTypeDto valueOf(String str) {
        return (EatsOrderDetailsDeliveryTypeDto) Enum.valueOf(EatsOrderDetailsDeliveryTypeDto.class, str);
    }

    public static EatsOrderDetailsDeliveryTypeDto[] values() {
        return (EatsOrderDetailsDeliveryTypeDto[]) $VALUES.clone();
    }
}
