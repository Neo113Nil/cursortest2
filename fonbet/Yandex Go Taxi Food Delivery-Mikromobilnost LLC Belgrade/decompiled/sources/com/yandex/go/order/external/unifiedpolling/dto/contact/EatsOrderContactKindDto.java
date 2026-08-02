package com.yandex.go.order.external.unifiedpolling.dto.contact;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ktm;
import defpackage.sen;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/order/external/unifiedpolling/dto/contact/EatsOrderContactKindDto;", "", "Companion", "sen", "COURIER", "CALL_CENTER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EatsOrderContactKindDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EatsOrderContactKindDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final EatsOrderContactKindDto CALL_CENTER;
    public static final EatsOrderContactKindDto COURIER;
    public static final sen Companion;

    static {
        EatsOrderContactKindDto eatsOrderContactKindDto = new EatsOrderContactKindDto("COURIER", 0);
        COURIER = eatsOrderContactKindDto;
        EatsOrderContactKindDto eatsOrderContactKindDto2 = new EatsOrderContactKindDto("CALL_CENTER", 1);
        CALL_CENTER = eatsOrderContactKindDto2;
        EatsOrderContactKindDto[] eatsOrderContactKindDtoArr = {eatsOrderContactKindDto, eatsOrderContactKindDto2};
        $VALUES = eatsOrderContactKindDtoArr;
        $ENTRIES = kotlin.enums.a.a(eatsOrderContactKindDtoArr);
        Companion = new sen();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ktm(22));
    }

    public static EatsOrderContactKindDto valueOf(String str) {
        return (EatsOrderContactKindDto) Enum.valueOf(EatsOrderContactKindDto.class, str);
    }

    public static EatsOrderContactKindDto[] values() {
        return (EatsOrderContactKindDto[]) $VALUES.clone();
    }
}
