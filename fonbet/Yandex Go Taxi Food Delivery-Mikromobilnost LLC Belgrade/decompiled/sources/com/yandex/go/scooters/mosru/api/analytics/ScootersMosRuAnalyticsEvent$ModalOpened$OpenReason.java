package com.yandex.go.scooters.mosru.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/scooters/mosru/api/analytics/ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason", "", "Lcom/yandex/go/scooters/mosru/api/analytics/ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason;", "DEFAULT", "STATE_BAR", "SHORTCUT", "go-client-android.features.scooters.mosru:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason[] $VALUES;
    public static final ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason DEFAULT;
    public static final ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason SHORTCUT;
    public static final ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason STATE_BAR;

    static {
        ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason scootersMosRuAnalyticsEvent$ModalOpened$OpenReason = new ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason("DEFAULT", 0);
        DEFAULT = scootersMosRuAnalyticsEvent$ModalOpened$OpenReason;
        ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason scootersMosRuAnalyticsEvent$ModalOpened$OpenReason2 = new ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason("STATE_BAR", 1);
        STATE_BAR = scootersMosRuAnalyticsEvent$ModalOpened$OpenReason2;
        ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason scootersMosRuAnalyticsEvent$ModalOpened$OpenReason3 = new ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason("SHORTCUT", 2);
        SHORTCUT = scootersMosRuAnalyticsEvent$ModalOpened$OpenReason3;
        ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason[] scootersMosRuAnalyticsEvent$ModalOpened$OpenReasonArr = {scootersMosRuAnalyticsEvent$ModalOpened$OpenReason, scootersMosRuAnalyticsEvent$ModalOpened$OpenReason2, scootersMosRuAnalyticsEvent$ModalOpened$OpenReason3};
        $VALUES = scootersMosRuAnalyticsEvent$ModalOpened$OpenReasonArr;
        $ENTRIES = a.a(scootersMosRuAnalyticsEvent$ModalOpened$OpenReasonArr);
    }

    public static ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason valueOf(String str) {
        return (ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason) Enum.valueOf(ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason.class, str);
    }

    public static ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason[] values() {
        return (ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason[]) $VALUES.clone();
    }
}
