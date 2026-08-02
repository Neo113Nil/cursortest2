package com.yandex.go.scooters.qr.unavailable_scooter.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/scooters/qr/unavailable_scooter/analytics/ScootersQrUnavailableScooterAnalytics$State", "", "Lcom/yandex/go/scooters/qr/unavailable_scooter/analytics/ScootersQrUnavailableScooterAnalytics$State;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NEAREST_SCOOTER", "FALLBACK", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersQrUnavailableScooterAnalytics$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersQrUnavailableScooterAnalytics$State[] $VALUES;
    public static final ScootersQrUnavailableScooterAnalytics$State FALLBACK;
    public static final ScootersQrUnavailableScooterAnalytics$State NEAREST_SCOOTER;
    private final String analyticsName;

    static {
        ScootersQrUnavailableScooterAnalytics$State scootersQrUnavailableScooterAnalytics$State = new ScootersQrUnavailableScooterAnalytics$State("NEAREST_SCOOTER", 0, "nearest_scooter");
        NEAREST_SCOOTER = scootersQrUnavailableScooterAnalytics$State;
        ScootersQrUnavailableScooterAnalytics$State scootersQrUnavailableScooterAnalytics$State2 = new ScootersQrUnavailableScooterAnalytics$State("FALLBACK", 1, "fallback");
        FALLBACK = scootersQrUnavailableScooterAnalytics$State2;
        ScootersQrUnavailableScooterAnalytics$State[] scootersQrUnavailableScooterAnalytics$StateArr = {scootersQrUnavailableScooterAnalytics$State, scootersQrUnavailableScooterAnalytics$State2};
        $VALUES = scootersQrUnavailableScooterAnalytics$StateArr;
        $ENTRIES = a.a(scootersQrUnavailableScooterAnalytics$StateArr);
    }

    public ScootersQrUnavailableScooterAnalytics$State(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static ScootersQrUnavailableScooterAnalytics$State valueOf(String str) {
        return (ScootersQrUnavailableScooterAnalytics$State) Enum.valueOf(ScootersQrUnavailableScooterAnalytics$State.class, str);
    }

    public static ScootersQrUnavailableScooterAnalytics$State[] values() {
        return (ScootersQrUnavailableScooterAnalytics$State[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
