package com.yandex.go.scooters.ignition.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/domain/model/ScootersIgnitionOption;", "", "NOTIFICATION", "GEOLOCATION", "BLUETOOTH", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersIgnitionOption {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersIgnitionOption[] $VALUES;
    public static final ScootersIgnitionOption BLUETOOTH;
    public static final ScootersIgnitionOption GEOLOCATION;
    public static final ScootersIgnitionOption NOTIFICATION;

    static {
        ScootersIgnitionOption scootersIgnitionOption = new ScootersIgnitionOption("NOTIFICATION", 0);
        NOTIFICATION = scootersIgnitionOption;
        ScootersIgnitionOption scootersIgnitionOption2 = new ScootersIgnitionOption("GEOLOCATION", 1);
        GEOLOCATION = scootersIgnitionOption2;
        ScootersIgnitionOption scootersIgnitionOption3 = new ScootersIgnitionOption("BLUETOOTH", 2);
        BLUETOOTH = scootersIgnitionOption3;
        ScootersIgnitionOption[] scootersIgnitionOptionArr = {scootersIgnitionOption, scootersIgnitionOption2, scootersIgnitionOption3};
        $VALUES = scootersIgnitionOptionArr;
        $ENTRIES = a.a(scootersIgnitionOptionArr);
    }

    public static ScootersIgnitionOption valueOf(String str) {
        return (ScootersIgnitionOption) Enum.valueOf(ScootersIgnitionOption.class, str);
    }

    public static ScootersIgnitionOption[] values() {
        return (ScootersIgnitionOption[]) $VALUES.clone();
    }
}
