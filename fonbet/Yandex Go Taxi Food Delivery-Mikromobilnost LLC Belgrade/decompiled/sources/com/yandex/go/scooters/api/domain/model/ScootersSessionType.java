package com.yandex.go.scooters.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/api/domain/model/ScootersSessionType;", "", "STANDART_OFFER", "FIX_POINT", "UNKNOWN", "go-client-android.features.scooters:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersSessionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersSessionType[] $VALUES;
    public static final ScootersSessionType FIX_POINT;
    public static final ScootersSessionType STANDART_OFFER;
    public static final ScootersSessionType UNKNOWN;

    static {
        ScootersSessionType scootersSessionType = new ScootersSessionType("STANDART_OFFER", 0);
        STANDART_OFFER = scootersSessionType;
        ScootersSessionType scootersSessionType2 = new ScootersSessionType("FIX_POINT", 1);
        FIX_POINT = scootersSessionType2;
        ScootersSessionType scootersSessionType3 = new ScootersSessionType("UNKNOWN", 2);
        UNKNOWN = scootersSessionType3;
        ScootersSessionType[] scootersSessionTypeArr = {scootersSessionType, scootersSessionType2, scootersSessionType3};
        $VALUES = scootersSessionTypeArr;
        $ENTRIES = kotlin.enums.a.a(scootersSessionTypeArr);
    }

    public static ScootersSessionType valueOf(String str) {
        return (ScootersSessionType) Enum.valueOf(ScootersSessionType.class, str);
    }

    public static ScootersSessionType[] values() {
        return (ScootersSessionType[]) $VALUES.clone();
    }
}
