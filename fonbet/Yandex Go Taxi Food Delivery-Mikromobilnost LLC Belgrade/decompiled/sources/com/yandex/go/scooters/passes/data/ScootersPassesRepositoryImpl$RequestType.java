package com.yandex.go.scooters.passes.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/scooters/passes/data/ScootersPassesRepositoryImpl$RequestType", "", "Lcom/yandex/go/scooters/passes/data/ScootersPassesRepositoryImpl$RequestType;", "PURCHASE", "STATE_CHANGE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ScootersPassesRepositoryImpl$RequestType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersPassesRepositoryImpl$RequestType[] $VALUES;
    public static final ScootersPassesRepositoryImpl$RequestType PURCHASE;
    public static final ScootersPassesRepositoryImpl$RequestType STATE_CHANGE;

    static {
        ScootersPassesRepositoryImpl$RequestType scootersPassesRepositoryImpl$RequestType = new ScootersPassesRepositoryImpl$RequestType("PURCHASE", 0);
        PURCHASE = scootersPassesRepositoryImpl$RequestType;
        ScootersPassesRepositoryImpl$RequestType scootersPassesRepositoryImpl$RequestType2 = new ScootersPassesRepositoryImpl$RequestType("STATE_CHANGE", 1);
        STATE_CHANGE = scootersPassesRepositoryImpl$RequestType2;
        ScootersPassesRepositoryImpl$RequestType[] scootersPassesRepositoryImpl$RequestTypeArr = {scootersPassesRepositoryImpl$RequestType, scootersPassesRepositoryImpl$RequestType2};
        $VALUES = scootersPassesRepositoryImpl$RequestTypeArr;
        $ENTRIES = kotlin.enums.a.a(scootersPassesRepositoryImpl$RequestTypeArr);
    }

    public static ScootersPassesRepositoryImpl$RequestType valueOf(String str) {
        return (ScootersPassesRepositoryImpl$RequestType) Enum.valueOf(ScootersPassesRepositoryImpl$RequestType.class, str);
    }

    public static ScootersPassesRepositoryImpl$RequestType[] values() {
        return (ScootersPassesRepositoryImpl$RequestType[]) $VALUES.clone();
    }
}
