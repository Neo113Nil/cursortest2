package com.yandex.go.chargers.offer.passes.data.model;

import defpackage.g0g0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xlf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/offer/passes/data/model/PurchaseStatus;", "", "Companion", "g0g0", "SUCCESS", "PENDING", "FAILED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PurchaseStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PurchaseStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final g0g0 Companion;
    public static final PurchaseStatus FAILED;
    public static final PurchaseStatus PENDING;
    public static final PurchaseStatus SUCCESS;

    static {
        PurchaseStatus purchaseStatus = new PurchaseStatus("SUCCESS", 0);
        SUCCESS = purchaseStatus;
        PurchaseStatus purchaseStatus2 = new PurchaseStatus("PENDING", 1);
        PENDING = purchaseStatus2;
        PurchaseStatus purchaseStatus3 = new PurchaseStatus("FAILED", 2);
        FAILED = purchaseStatus3;
        PurchaseStatus[] purchaseStatusArr = {purchaseStatus, purchaseStatus2, purchaseStatus3};
        $VALUES = purchaseStatusArr;
        $ENTRIES = kotlin.enums.a.a(purchaseStatusArr);
        Companion = new g0g0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(18));
    }

    public static PurchaseStatus valueOf(String str) {
        return (PurchaseStatus) Enum.valueOf(PurchaseStatus.class, str);
    }

    public static PurchaseStatus[] values() {
        return (PurchaseStatus[]) $VALUES.clone();
    }
}
