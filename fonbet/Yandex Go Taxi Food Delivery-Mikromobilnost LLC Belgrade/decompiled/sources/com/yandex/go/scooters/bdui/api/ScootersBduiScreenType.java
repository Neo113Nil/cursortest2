package com.yandex.go.scooters.bdui.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/scooters/bdui/api/ScootersBduiScreenType;", "", "MODAL_BOTTOM", "FULLSCREEN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersBduiScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersBduiScreenType[] $VALUES;
    public static final ScootersBduiScreenType FULLSCREEN;
    public static final ScootersBduiScreenType MODAL_BOTTOM;

    static {
        ScootersBduiScreenType scootersBduiScreenType = new ScootersBduiScreenType("MODAL_BOTTOM", 0);
        MODAL_BOTTOM = scootersBduiScreenType;
        ScootersBduiScreenType scootersBduiScreenType2 = new ScootersBduiScreenType("FULLSCREEN", 1);
        FULLSCREEN = scootersBduiScreenType2;
        ScootersBduiScreenType[] scootersBduiScreenTypeArr = {scootersBduiScreenType, scootersBduiScreenType2};
        $VALUES = scootersBduiScreenTypeArr;
        $ENTRIES = kotlin.enums.a.a(scootersBduiScreenTypeArr);
    }

    public static ScootersBduiScreenType valueOf(String str) {
        return (ScootersBduiScreenType) Enum.valueOf(ScootersBduiScreenType.class, str);
    }

    public static ScootersBduiScreenType[] values() {
        return (ScootersBduiScreenType[]) $VALUES.clone();
    }
}
