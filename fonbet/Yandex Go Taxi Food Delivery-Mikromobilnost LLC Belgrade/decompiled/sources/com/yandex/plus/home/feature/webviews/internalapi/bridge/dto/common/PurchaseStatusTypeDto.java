package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import defpackage.gsq0;
import defpackage.h0g0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xlf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/common/PurchaseStatusTypeDto;", "", "Companion", "h0g0", "SUCCESS", "FAILURE", "CANCEL", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PurchaseStatusTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PurchaseStatusTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PurchaseStatusTypeDto CANCEL;
    public static final h0g0 Companion;
    public static final PurchaseStatusTypeDto FAILURE;
    public static final PurchaseStatusTypeDto SUCCESS;

    static {
        PurchaseStatusTypeDto purchaseStatusTypeDto = new PurchaseStatusTypeDto("SUCCESS", 0);
        SUCCESS = purchaseStatusTypeDto;
        PurchaseStatusTypeDto purchaseStatusTypeDto2 = new PurchaseStatusTypeDto("FAILURE", 1);
        FAILURE = purchaseStatusTypeDto2;
        PurchaseStatusTypeDto purchaseStatusTypeDto3 = new PurchaseStatusTypeDto("CANCEL", 2);
        CANCEL = purchaseStatusTypeDto3;
        PurchaseStatusTypeDto[] purchaseStatusTypeDtoArr = {purchaseStatusTypeDto, purchaseStatusTypeDto2, purchaseStatusTypeDto3};
        $VALUES = purchaseStatusTypeDtoArr;
        $ENTRIES = a.a(purchaseStatusTypeDtoArr);
        Companion = new h0g0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(19));
    }

    public static PurchaseStatusTypeDto valueOf(String str) {
        return (PurchaseStatusTypeDto) Enum.valueOf(PurchaseStatusTypeDto.class, str);
    }

    public static PurchaseStatusTypeDto[] values() {
        return (PurchaseStatusTypeDto[]) $VALUES.clone();
    }
}
