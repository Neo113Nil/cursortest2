package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import defpackage.gsq0;
import defpackage.i0g0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xlf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/common/PurchaseTypeDto;", "", "Companion", "i0g0", "HOST", "DEPRECATED_HOST", "INAPP", "NATIVE", "WEB", "UNKNOWN", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PurchaseTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PurchaseTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final i0g0 Companion;
    public static final PurchaseTypeDto DEPRECATED_HOST;
    public static final PurchaseTypeDto HOST;
    public static final PurchaseTypeDto INAPP;
    public static final PurchaseTypeDto NATIVE;
    public static final PurchaseTypeDto UNKNOWN;
    public static final PurchaseTypeDto WEB;

    static {
        PurchaseTypeDto purchaseTypeDto = new PurchaseTypeDto("HOST", 0);
        HOST = purchaseTypeDto;
        PurchaseTypeDto purchaseTypeDto2 = new PurchaseTypeDto("DEPRECATED_HOST", 1);
        DEPRECATED_HOST = purchaseTypeDto2;
        PurchaseTypeDto purchaseTypeDto3 = new PurchaseTypeDto("INAPP", 2);
        INAPP = purchaseTypeDto3;
        PurchaseTypeDto purchaseTypeDto4 = new PurchaseTypeDto("NATIVE", 3);
        NATIVE = purchaseTypeDto4;
        PurchaseTypeDto purchaseTypeDto5 = new PurchaseTypeDto("WEB", 4);
        WEB = purchaseTypeDto5;
        PurchaseTypeDto purchaseTypeDto6 = new PurchaseTypeDto("UNKNOWN", 5);
        UNKNOWN = purchaseTypeDto6;
        PurchaseTypeDto[] purchaseTypeDtoArr = {purchaseTypeDto, purchaseTypeDto2, purchaseTypeDto3, purchaseTypeDto4, purchaseTypeDto5, purchaseTypeDto6};
        $VALUES = purchaseTypeDtoArr;
        $ENTRIES = a.a(purchaseTypeDtoArr);
        Companion = new i0g0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(20));
    }

    public static PurchaseTypeDto valueOf(String str) {
        return (PurchaseTypeDto) Enum.valueOf(PurchaseTypeDto.class, str);
    }

    public static PurchaseTypeDto[] values() {
        return (PurchaseTypeDto[]) $VALUES.clone();
    }
}
