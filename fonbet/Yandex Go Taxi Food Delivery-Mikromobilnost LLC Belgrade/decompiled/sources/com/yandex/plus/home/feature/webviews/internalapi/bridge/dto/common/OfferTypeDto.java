package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.oi60;
import defpackage.ut60;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/common/OfferTypeDto;", "", "Companion", "ut60", "COMPOSITE", "OPTION", "TARIFF", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OfferTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final OfferTypeDto COMPOSITE;
    public static final ut60 Companion;
    public static final OfferTypeDto OPTION;
    public static final OfferTypeDto TARIFF;

    static {
        OfferTypeDto offerTypeDto = new OfferTypeDto("COMPOSITE", 0);
        COMPOSITE = offerTypeDto;
        OfferTypeDto offerTypeDto2 = new OfferTypeDto("OPTION", 1);
        OPTION = offerTypeDto2;
        OfferTypeDto offerTypeDto3 = new OfferTypeDto("TARIFF", 2);
        TARIFF = offerTypeDto3;
        OfferTypeDto[] offerTypeDtoArr = {offerTypeDto, offerTypeDto2, offerTypeDto3};
        $VALUES = offerTypeDtoArr;
        $ENTRIES = a.a(offerTypeDtoArr);
        Companion = new ut60();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oi60(22));
    }

    public static OfferTypeDto valueOf(String str) {
        return (OfferTypeDto) Enum.valueOf(OfferTypeDto.class, str);
    }

    public static OfferTypeDto[] values() {
        return (OfferTypeDto[]) $VALUES.clone();
    }
}
