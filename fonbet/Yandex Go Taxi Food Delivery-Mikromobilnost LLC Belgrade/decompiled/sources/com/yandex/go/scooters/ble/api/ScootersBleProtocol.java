package com.yandex.go.scooters.ble.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/scooters/ble/api/ScootersBleProtocol;", "", "NINEBOT", "WIND", "go-client-android.features.scooters.ble:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersBleProtocol {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersBleProtocol[] $VALUES;
    public static final ScootersBleProtocol NINEBOT;
    public static final ScootersBleProtocol WIND;

    static {
        ScootersBleProtocol scootersBleProtocol = new ScootersBleProtocol("NINEBOT", 0);
        NINEBOT = scootersBleProtocol;
        ScootersBleProtocol scootersBleProtocol2 = new ScootersBleProtocol("WIND", 1);
        WIND = scootersBleProtocol2;
        ScootersBleProtocol[] scootersBleProtocolArr = {scootersBleProtocol, scootersBleProtocol2};
        $VALUES = scootersBleProtocolArr;
        $ENTRIES = a.a(scootersBleProtocolArr);
    }

    public static ScootersBleProtocol valueOf(String str) {
        return (ScootersBleProtocol) Enum.valueOf(ScootersBleProtocol.class, str);
    }

    public static ScootersBleProtocol[] values() {
        return (ScootersBleProtocol[]) $VALUES.clone();
    }
}
