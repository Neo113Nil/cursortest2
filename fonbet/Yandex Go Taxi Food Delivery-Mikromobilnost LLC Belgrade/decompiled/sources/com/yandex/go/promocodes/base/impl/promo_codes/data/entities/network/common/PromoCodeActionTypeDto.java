package com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xlf0;
import defpackage.ylf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/PromoCodeActionTypeDto;", "", "Companion", "ylf0", "POPUP", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PromoCodeActionTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PromoCodeActionTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ylf0 Companion;
    public static final PromoCodeActionTypeDto POPUP;

    static {
        PromoCodeActionTypeDto promoCodeActionTypeDto = new PromoCodeActionTypeDto("POPUP", 0);
        POPUP = promoCodeActionTypeDto;
        PromoCodeActionTypeDto[] promoCodeActionTypeDtoArr = {promoCodeActionTypeDto};
        $VALUES = promoCodeActionTypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(promoCodeActionTypeDtoArr);
        Companion = new ylf0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(1));
    }

    public static PromoCodeActionTypeDto valueOf(String str) {
        return (PromoCodeActionTypeDto) Enum.valueOf(PromoCodeActionTypeDto.class, str);
    }

    public static PromoCodeActionTypeDto[] values() {
        return (PromoCodeActionTypeDto[]) $VALUES.clone();
    }
}
