package com.yandex.plus.pay.api.google.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/pay/api/google/model/PurchaseState;", "", "PURCHASED", "PENDING", "UNSPECIFIED_STATE", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PurchaseState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PurchaseState[] $VALUES;
    public static final PurchaseState PENDING;
    public static final PurchaseState PURCHASED;
    public static final PurchaseState UNSPECIFIED_STATE;

    static {
        PurchaseState purchaseState = new PurchaseState("PURCHASED", 0);
        PURCHASED = purchaseState;
        PurchaseState purchaseState2 = new PurchaseState("PENDING", 1);
        PENDING = purchaseState2;
        PurchaseState purchaseState3 = new PurchaseState("UNSPECIFIED_STATE", 2);
        UNSPECIFIED_STATE = purchaseState3;
        PurchaseState[] purchaseStateArr = {purchaseState, purchaseState2, purchaseState3};
        $VALUES = purchaseStateArr;
        $ENTRIES = a.a(purchaseStateArr);
    }

    public static PurchaseState valueOf(String str) {
        return (PurchaseState) Enum.valueOf(PurchaseState.class, str);
    }

    public static PurchaseState[] values() {
        return (PurchaseState[]) $VALUES.clone();
    }
}
