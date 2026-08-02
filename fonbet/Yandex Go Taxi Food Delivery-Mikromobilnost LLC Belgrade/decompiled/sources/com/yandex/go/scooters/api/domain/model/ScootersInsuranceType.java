package com.yandex.go.scooters.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/api/domain/model/ScootersInsuranceType;", "", "NO_INSURANCE", "STANDART", "FULL", "go-client-android.features.scooters:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersInsuranceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersInsuranceType[] $VALUES;
    public static final ScootersInsuranceType FULL;
    public static final ScootersInsuranceType NO_INSURANCE;
    public static final ScootersInsuranceType STANDART;

    static {
        ScootersInsuranceType scootersInsuranceType = new ScootersInsuranceType("NO_INSURANCE", 0);
        NO_INSURANCE = scootersInsuranceType;
        ScootersInsuranceType scootersInsuranceType2 = new ScootersInsuranceType("STANDART", 1);
        STANDART = scootersInsuranceType2;
        ScootersInsuranceType scootersInsuranceType3 = new ScootersInsuranceType("FULL", 2);
        FULL = scootersInsuranceType3;
        ScootersInsuranceType[] scootersInsuranceTypeArr = {scootersInsuranceType, scootersInsuranceType2, scootersInsuranceType3};
        $VALUES = scootersInsuranceTypeArr;
        $ENTRIES = kotlin.enums.a.a(scootersInsuranceTypeArr);
    }

    public static ScootersInsuranceType valueOf(String str) {
        return (ScootersInsuranceType) Enum.valueOf(ScootersInsuranceType.class, str);
    }

    public static ScootersInsuranceType[] values() {
        return (ScootersInsuranceType[]) $VALUES.clone();
    }
}
