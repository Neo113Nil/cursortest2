package com.yandex.go.scooters.mosru.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/mosru/api/domain/model/ScootersMosRuAuthStatus;", "", "UNAUTHORIZED", "IN_PROGRESS", "PENDING", "SUCCESS", "go-client-android.features.scooters.mosru:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersMosRuAuthStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersMosRuAuthStatus[] $VALUES;
    public static final ScootersMosRuAuthStatus IN_PROGRESS;
    public static final ScootersMosRuAuthStatus PENDING;
    public static final ScootersMosRuAuthStatus SUCCESS;
    public static final ScootersMosRuAuthStatus UNAUTHORIZED;

    static {
        ScootersMosRuAuthStatus scootersMosRuAuthStatus = new ScootersMosRuAuthStatus("UNAUTHORIZED", 0);
        UNAUTHORIZED = scootersMosRuAuthStatus;
        ScootersMosRuAuthStatus scootersMosRuAuthStatus2 = new ScootersMosRuAuthStatus("IN_PROGRESS", 1);
        IN_PROGRESS = scootersMosRuAuthStatus2;
        ScootersMosRuAuthStatus scootersMosRuAuthStatus3 = new ScootersMosRuAuthStatus("PENDING", 2);
        PENDING = scootersMosRuAuthStatus3;
        ScootersMosRuAuthStatus scootersMosRuAuthStatus4 = new ScootersMosRuAuthStatus("SUCCESS", 3);
        SUCCESS = scootersMosRuAuthStatus4;
        ScootersMosRuAuthStatus[] scootersMosRuAuthStatusArr = {scootersMosRuAuthStatus, scootersMosRuAuthStatus2, scootersMosRuAuthStatus3, scootersMosRuAuthStatus4};
        $VALUES = scootersMosRuAuthStatusArr;
        $ENTRIES = a.a(scootersMosRuAuthStatusArr);
    }

    public static ScootersMosRuAuthStatus valueOf(String str) {
        return (ScootersMosRuAuthStatus) Enum.valueOf(ScootersMosRuAuthStatus.class, str);
    }

    public static ScootersMosRuAuthStatus[] values() {
        return (ScootersMosRuAuthStatus[]) $VALUES.clone();
    }
}
