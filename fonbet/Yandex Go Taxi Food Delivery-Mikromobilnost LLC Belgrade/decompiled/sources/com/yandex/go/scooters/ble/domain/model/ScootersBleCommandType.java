package com.yandex.go.scooters.ble.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/ble/domain/model/ScootersBleCommandType;", "", "AUTH", "LOCK", "UNLOCK", "SOUND", "CABLE_UNLOCK", "UNLOCK_BATTERY_COVER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersBleCommandType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersBleCommandType[] $VALUES;
    public static final ScootersBleCommandType AUTH;
    public static final ScootersBleCommandType CABLE_UNLOCK;
    public static final ScootersBleCommandType LOCK;
    public static final ScootersBleCommandType SOUND;
    public static final ScootersBleCommandType UNLOCK;
    public static final ScootersBleCommandType UNLOCK_BATTERY_COVER;

    static {
        ScootersBleCommandType scootersBleCommandType = new ScootersBleCommandType("AUTH", 0);
        AUTH = scootersBleCommandType;
        ScootersBleCommandType scootersBleCommandType2 = new ScootersBleCommandType("LOCK", 1);
        LOCK = scootersBleCommandType2;
        ScootersBleCommandType scootersBleCommandType3 = new ScootersBleCommandType("UNLOCK", 2);
        UNLOCK = scootersBleCommandType3;
        ScootersBleCommandType scootersBleCommandType4 = new ScootersBleCommandType("SOUND", 3);
        SOUND = scootersBleCommandType4;
        ScootersBleCommandType scootersBleCommandType5 = new ScootersBleCommandType("CABLE_UNLOCK", 4);
        CABLE_UNLOCK = scootersBleCommandType5;
        ScootersBleCommandType scootersBleCommandType6 = new ScootersBleCommandType("UNLOCK_BATTERY_COVER", 5);
        UNLOCK_BATTERY_COVER = scootersBleCommandType6;
        ScootersBleCommandType[] scootersBleCommandTypeArr = {scootersBleCommandType, scootersBleCommandType2, scootersBleCommandType3, scootersBleCommandType4, scootersBleCommandType5, scootersBleCommandType6};
        $VALUES = scootersBleCommandTypeArr;
        $ENTRIES = a.a(scootersBleCommandTypeArr);
    }

    public static ScootersBleCommandType valueOf(String str) {
        return (ScootersBleCommandType) Enum.valueOf(ScootersBleCommandType.class, str);
    }

    public static ScootersBleCommandType[] values() {
        return (ScootersBleCommandType[]) $VALUES.clone();
    }
}
