package com.yandex.go.scooters.insurance.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/insurance/model/ScootersDisableInsuranceResult;", "", "DISABLED", "SKIPPED", "CANCELED", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDisableInsuranceResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersDisableInsuranceResult[] $VALUES;
    public static final ScootersDisableInsuranceResult CANCELED;
    public static final ScootersDisableInsuranceResult DISABLED;
    public static final ScootersDisableInsuranceResult SKIPPED;

    static {
        ScootersDisableInsuranceResult scootersDisableInsuranceResult = new ScootersDisableInsuranceResult("DISABLED", 0);
        DISABLED = scootersDisableInsuranceResult;
        ScootersDisableInsuranceResult scootersDisableInsuranceResult2 = new ScootersDisableInsuranceResult("SKIPPED", 1);
        SKIPPED = scootersDisableInsuranceResult2;
        ScootersDisableInsuranceResult scootersDisableInsuranceResult3 = new ScootersDisableInsuranceResult("CANCELED", 2);
        CANCELED = scootersDisableInsuranceResult3;
        ScootersDisableInsuranceResult[] scootersDisableInsuranceResultArr = {scootersDisableInsuranceResult, scootersDisableInsuranceResult2, scootersDisableInsuranceResult3};
        $VALUES = scootersDisableInsuranceResultArr;
        $ENTRIES = a.a(scootersDisableInsuranceResultArr);
    }

    public static ScootersDisableInsuranceResult valueOf(String str) {
        return (ScootersDisableInsuranceResult) Enum.valueOf(ScootersDisableInsuranceResult.class, str);
    }

    public static ScootersDisableInsuranceResult[] values() {
        return (ScootersDisableInsuranceResult[]) $VALUES.clone();
    }
}
