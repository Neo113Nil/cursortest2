package com.yandex.go.scooters.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/scooters/api/domain/model/ScootersVehicleType;", "", "SCOOTER", "BIKE", "go-client-android.features.scooters:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScootersVehicleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersVehicleType[] $VALUES;
    public static final ScootersVehicleType BIKE;
    public static final ScootersVehicleType SCOOTER;

    static {
        ScootersVehicleType scootersVehicleType = new ScootersVehicleType("SCOOTER", 0);
        SCOOTER = scootersVehicleType;
        ScootersVehicleType scootersVehicleType2 = new ScootersVehicleType("BIKE", 1);
        BIKE = scootersVehicleType2;
        ScootersVehicleType[] scootersVehicleTypeArr = {scootersVehicleType, scootersVehicleType2};
        $VALUES = scootersVehicleTypeArr;
        $ENTRIES = kotlin.enums.a.a(scootersVehicleTypeArr);
    }

    public static ScootersVehicleType valueOf(String str) {
        return (ScootersVehicleType) Enum.valueOf(ScootersVehicleType.class, str);
    }

    public static ScootersVehicleType[] values() {
        return (ScootersVehicleType[]) $VALUES.clone();
    }
}
