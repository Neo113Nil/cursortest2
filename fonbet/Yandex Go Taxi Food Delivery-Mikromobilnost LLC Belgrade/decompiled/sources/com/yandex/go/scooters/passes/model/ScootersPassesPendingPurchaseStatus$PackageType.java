package com.yandex.go.scooters.passes.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/scooters/passes/model/ScootersPassesPendingPurchaseStatus$PackageType", "", "Lcom/yandex/go/scooters/passes/model/ScootersPassesPendingPurchaseStatus$PackageType;", "MINUTES_PACKAGE", "SUPER_PASS", "go-client-android.features.scooters.passes:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPassesPendingPurchaseStatus$PackageType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersPassesPendingPurchaseStatus$PackageType[] $VALUES;
    public static final ScootersPassesPendingPurchaseStatus$PackageType MINUTES_PACKAGE;
    public static final ScootersPassesPendingPurchaseStatus$PackageType SUPER_PASS;

    static {
        ScootersPassesPendingPurchaseStatus$PackageType scootersPassesPendingPurchaseStatus$PackageType = new ScootersPassesPendingPurchaseStatus$PackageType("MINUTES_PACKAGE", 0);
        MINUTES_PACKAGE = scootersPassesPendingPurchaseStatus$PackageType;
        ScootersPassesPendingPurchaseStatus$PackageType scootersPassesPendingPurchaseStatus$PackageType2 = new ScootersPassesPendingPurchaseStatus$PackageType("SUPER_PASS", 1);
        SUPER_PASS = scootersPassesPendingPurchaseStatus$PackageType2;
        ScootersPassesPendingPurchaseStatus$PackageType[] scootersPassesPendingPurchaseStatus$PackageTypeArr = {scootersPassesPendingPurchaseStatus$PackageType, scootersPassesPendingPurchaseStatus$PackageType2};
        $VALUES = scootersPassesPendingPurchaseStatus$PackageTypeArr;
        $ENTRIES = kotlin.enums.a.a(scootersPassesPendingPurchaseStatus$PackageTypeArr);
    }

    public static ScootersPassesPendingPurchaseStatus$PackageType valueOf(String str) {
        return (ScootersPassesPendingPurchaseStatus$PackageType) Enum.valueOf(ScootersPassesPendingPurchaseStatus$PackageType.class, str);
    }

    public static ScootersPassesPendingPurchaseStatus$PackageType[] values() {
        return (ScootersPassesPendingPurchaseStatus$PackageType[]) $VALUES.clone();
    }
}
