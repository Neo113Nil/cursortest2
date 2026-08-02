package com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common;

import defpackage.bmf0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xlf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/PromoCodeDecorationIdDto;", "", "Companion", "bmf0", "BALLOONS", "IMAGE_TAG", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PromoCodeDecorationIdDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PromoCodeDecorationIdDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PromoCodeDecorationIdDto BALLOONS;
    public static final bmf0 Companion;
    public static final PromoCodeDecorationIdDto IMAGE_TAG;

    static {
        PromoCodeDecorationIdDto promoCodeDecorationIdDto = new PromoCodeDecorationIdDto("BALLOONS", 0);
        BALLOONS = promoCodeDecorationIdDto;
        PromoCodeDecorationIdDto promoCodeDecorationIdDto2 = new PromoCodeDecorationIdDto("IMAGE_TAG", 1);
        IMAGE_TAG = promoCodeDecorationIdDto2;
        PromoCodeDecorationIdDto[] promoCodeDecorationIdDtoArr = {promoCodeDecorationIdDto, promoCodeDecorationIdDto2};
        $VALUES = promoCodeDecorationIdDtoArr;
        $ENTRIES = kotlin.enums.a.a(promoCodeDecorationIdDtoArr);
        Companion = new bmf0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(3));
    }

    public static PromoCodeDecorationIdDto valueOf(String str) {
        return (PromoCodeDecorationIdDto) Enum.valueOf(PromoCodeDecorationIdDto.class, str);
    }

    public static PromoCodeDecorationIdDto[] values() {
        return (PromoCodeDecorationIdDto[]) $VALUES.clone();
    }
}
