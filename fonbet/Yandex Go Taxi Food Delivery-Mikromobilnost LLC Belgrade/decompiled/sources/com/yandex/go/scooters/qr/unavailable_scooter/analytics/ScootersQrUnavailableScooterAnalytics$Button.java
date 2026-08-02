package com.yandex.go.scooters.qr.unavailable_scooter.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/scooters/qr/unavailable_scooter/analytics/ScootersQrUnavailableScooterAnalytics$Button", "", "Lcom/yandex/go/scooters/qr/unavailable_scooter/analytics/ScootersQrUnavailableScooterAnalytics$Button;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SHOW_SCOOTER", "FIND_ON_MAP", "CLOSE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersQrUnavailableScooterAnalytics$Button {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersQrUnavailableScooterAnalytics$Button[] $VALUES;
    public static final ScootersQrUnavailableScooterAnalytics$Button CLOSE;
    public static final ScootersQrUnavailableScooterAnalytics$Button FIND_ON_MAP;
    public static final ScootersQrUnavailableScooterAnalytics$Button SHOW_SCOOTER;
    private final String analyticsName;

    static {
        ScootersQrUnavailableScooterAnalytics$Button scootersQrUnavailableScooterAnalytics$Button = new ScootersQrUnavailableScooterAnalytics$Button("SHOW_SCOOTER", 0, "show_scooter");
        SHOW_SCOOTER = scootersQrUnavailableScooterAnalytics$Button;
        ScootersQrUnavailableScooterAnalytics$Button scootersQrUnavailableScooterAnalytics$Button2 = new ScootersQrUnavailableScooterAnalytics$Button("FIND_ON_MAP", 1, "find_on_map");
        FIND_ON_MAP = scootersQrUnavailableScooterAnalytics$Button2;
        ScootersQrUnavailableScooterAnalytics$Button scootersQrUnavailableScooterAnalytics$Button3 = new ScootersQrUnavailableScooterAnalytics$Button("CLOSE", 2, "close");
        CLOSE = scootersQrUnavailableScooterAnalytics$Button3;
        ScootersQrUnavailableScooterAnalytics$Button[] scootersQrUnavailableScooterAnalytics$ButtonArr = {scootersQrUnavailableScooterAnalytics$Button, scootersQrUnavailableScooterAnalytics$Button2, scootersQrUnavailableScooterAnalytics$Button3};
        $VALUES = scootersQrUnavailableScooterAnalytics$ButtonArr;
        $ENTRIES = a.a(scootersQrUnavailableScooterAnalytics$ButtonArr);
    }

    public ScootersQrUnavailableScooterAnalytics$Button(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static ScootersQrUnavailableScooterAnalytics$Button valueOf(String str) {
        return (ScootersQrUnavailableScooterAnalytics$Button) Enum.valueOf(ScootersQrUnavailableScooterAnalytics$Button.class, str);
    }

    public static ScootersQrUnavailableScooterAnalytics$Button[] values() {
        return (ScootersQrUnavailableScooterAnalytics$Button[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
