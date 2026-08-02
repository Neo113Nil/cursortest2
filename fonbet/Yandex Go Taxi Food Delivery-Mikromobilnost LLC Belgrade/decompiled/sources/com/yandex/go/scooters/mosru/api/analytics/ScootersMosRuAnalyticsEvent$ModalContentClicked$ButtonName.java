package com.yandex.go.scooters.mosru.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/scooters/mosru/api/analytics/ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName", "", "Lcom/yandex/go/scooters/mosru/api/analytics/ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName;", "AUTHORIZE", "CLOSE", "go-client-android.features.scooters.mosru:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName[] $VALUES;
    public static final ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName AUTHORIZE;
    public static final ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName CLOSE;

    static {
        ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName scootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName = new ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName("AUTHORIZE", 0);
        AUTHORIZE = scootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName;
        ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName scootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName2 = new ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName("CLOSE", 1);
        CLOSE = scootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName2;
        ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName[] scootersMosRuAnalyticsEvent$ModalContentClicked$ButtonNameArr = {scootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName, scootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName2};
        $VALUES = scootersMosRuAnalyticsEvent$ModalContentClicked$ButtonNameArr;
        $ENTRIES = a.a(scootersMosRuAnalyticsEvent$ModalContentClicked$ButtonNameArr);
    }

    public static ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName valueOf(String str) {
        return (ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName) Enum.valueOf(ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName.class, str);
    }

    public static ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName[] values() {
        return (ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName[]) $VALUES.clone();
    }
}
