package com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jnf0;
import defpackage.k4o;
import defpackage.xlf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/PromoCodeStatusDto;", "", "Companion", "jnf0", "VALID", "INVALID", "RESTRICTED", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PromoCodeStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PromoCodeStatusDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final jnf0 Companion;
    public static final PromoCodeStatusDto INVALID;
    public static final PromoCodeStatusDto RESTRICTED;
    public static final PromoCodeStatusDto UNKNOWN;
    public static final PromoCodeStatusDto VALID;

    static {
        PromoCodeStatusDto promoCodeStatusDto = new PromoCodeStatusDto("VALID", 0);
        VALID = promoCodeStatusDto;
        PromoCodeStatusDto promoCodeStatusDto2 = new PromoCodeStatusDto("INVALID", 1);
        INVALID = promoCodeStatusDto2;
        PromoCodeStatusDto promoCodeStatusDto3 = new PromoCodeStatusDto("RESTRICTED", 2);
        RESTRICTED = promoCodeStatusDto3;
        PromoCodeStatusDto promoCodeStatusDto4 = new PromoCodeStatusDto("UNKNOWN", 3);
        UNKNOWN = promoCodeStatusDto4;
        PromoCodeStatusDto[] promoCodeStatusDtoArr = {promoCodeStatusDto, promoCodeStatusDto2, promoCodeStatusDto3, promoCodeStatusDto4};
        $VALUES = promoCodeStatusDtoArr;
        $ENTRIES = kotlin.enums.a.a(promoCodeStatusDtoArr);
        Companion = new jnf0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(8));
    }

    public static PromoCodeStatusDto valueOf(String str) {
        return (PromoCodeStatusDto) Enum.valueOf(PromoCodeStatusDto.class, str);
    }

    public static PromoCodeStatusDto[] values() {
        return (PromoCodeStatusDto[]) $VALUES.clone();
    }
}
