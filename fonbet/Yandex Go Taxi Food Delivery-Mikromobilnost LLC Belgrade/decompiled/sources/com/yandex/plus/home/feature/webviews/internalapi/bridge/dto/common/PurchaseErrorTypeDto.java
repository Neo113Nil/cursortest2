package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.wzf0;
import defpackage.xlf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/common/PurchaseErrorTypeDto;", "", "Companion", "wzf0", "UNKNOWN_ERROR", "CHOOSE_PAYMENT_METHOD_ERROR", "PAYMENT_ERROR", "CANCEL", "PARSE_CONFIG_ERROR", "NO_TARGET", "NO_PRODUCTS_BY_TARGET", "EMPTY_PRODUCTS_BY_TARGET", "INVALID_PAYMENT_METHOD", "NO_PRODUCT_BY_ID", "UNKNOWN_PURCHASE_TYPE", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PurchaseErrorTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PurchaseErrorTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PurchaseErrorTypeDto CANCEL;
    public static final PurchaseErrorTypeDto CHOOSE_PAYMENT_METHOD_ERROR;
    public static final wzf0 Companion;
    public static final PurchaseErrorTypeDto EMPTY_PRODUCTS_BY_TARGET;
    public static final PurchaseErrorTypeDto INVALID_PAYMENT_METHOD;
    public static final PurchaseErrorTypeDto NO_PRODUCTS_BY_TARGET;
    public static final PurchaseErrorTypeDto NO_PRODUCT_BY_ID;
    public static final PurchaseErrorTypeDto NO_TARGET;
    public static final PurchaseErrorTypeDto PARSE_CONFIG_ERROR;
    public static final PurchaseErrorTypeDto PAYMENT_ERROR;
    public static final PurchaseErrorTypeDto UNKNOWN_ERROR;
    public static final PurchaseErrorTypeDto UNKNOWN_PURCHASE_TYPE;

    static {
        PurchaseErrorTypeDto purchaseErrorTypeDto = new PurchaseErrorTypeDto("UNKNOWN_ERROR", 0);
        UNKNOWN_ERROR = purchaseErrorTypeDto;
        PurchaseErrorTypeDto purchaseErrorTypeDto2 = new PurchaseErrorTypeDto("CHOOSE_PAYMENT_METHOD_ERROR", 1);
        CHOOSE_PAYMENT_METHOD_ERROR = purchaseErrorTypeDto2;
        PurchaseErrorTypeDto purchaseErrorTypeDto3 = new PurchaseErrorTypeDto("PAYMENT_ERROR", 2);
        PAYMENT_ERROR = purchaseErrorTypeDto3;
        PurchaseErrorTypeDto purchaseErrorTypeDto4 = new PurchaseErrorTypeDto("CANCEL", 3);
        CANCEL = purchaseErrorTypeDto4;
        PurchaseErrorTypeDto purchaseErrorTypeDto5 = new PurchaseErrorTypeDto("PARSE_CONFIG_ERROR", 4);
        PARSE_CONFIG_ERROR = purchaseErrorTypeDto5;
        PurchaseErrorTypeDto purchaseErrorTypeDto6 = new PurchaseErrorTypeDto("NO_TARGET", 5);
        NO_TARGET = purchaseErrorTypeDto6;
        PurchaseErrorTypeDto purchaseErrorTypeDto7 = new PurchaseErrorTypeDto("NO_PRODUCTS_BY_TARGET", 6);
        NO_PRODUCTS_BY_TARGET = purchaseErrorTypeDto7;
        PurchaseErrorTypeDto purchaseErrorTypeDto8 = new PurchaseErrorTypeDto("EMPTY_PRODUCTS_BY_TARGET", 7);
        EMPTY_PRODUCTS_BY_TARGET = purchaseErrorTypeDto8;
        PurchaseErrorTypeDto purchaseErrorTypeDto9 = new PurchaseErrorTypeDto("INVALID_PAYMENT_METHOD", 8);
        INVALID_PAYMENT_METHOD = purchaseErrorTypeDto9;
        PurchaseErrorTypeDto purchaseErrorTypeDto10 = new PurchaseErrorTypeDto("NO_PRODUCT_BY_ID", 9);
        NO_PRODUCT_BY_ID = purchaseErrorTypeDto10;
        PurchaseErrorTypeDto purchaseErrorTypeDto11 = new PurchaseErrorTypeDto("UNKNOWN_PURCHASE_TYPE", 10);
        UNKNOWN_PURCHASE_TYPE = purchaseErrorTypeDto11;
        PurchaseErrorTypeDto[] purchaseErrorTypeDtoArr = {purchaseErrorTypeDto, purchaseErrorTypeDto2, purchaseErrorTypeDto3, purchaseErrorTypeDto4, purchaseErrorTypeDto5, purchaseErrorTypeDto6, purchaseErrorTypeDto7, purchaseErrorTypeDto8, purchaseErrorTypeDto9, purchaseErrorTypeDto10, purchaseErrorTypeDto11};
        $VALUES = purchaseErrorTypeDtoArr;
        $ENTRIES = a.a(purchaseErrorTypeDtoArr);
        Companion = new wzf0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(14));
    }

    public static PurchaseErrorTypeDto valueOf(String str) {
        return (PurchaseErrorTypeDto) Enum.valueOf(PurchaseErrorTypeDto.class, str);
    }

    public static PurchaseErrorTypeDto[] values() {
        return (PurchaseErrorTypeDto[]) $VALUES.clone();
    }
}
