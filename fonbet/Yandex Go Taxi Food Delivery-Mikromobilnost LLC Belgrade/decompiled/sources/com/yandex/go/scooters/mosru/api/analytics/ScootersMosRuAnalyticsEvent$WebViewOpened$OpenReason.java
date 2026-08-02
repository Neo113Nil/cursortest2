package com.yandex.go.scooters.mosru.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/scooters/mosru/api/analytics/ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason", "", "Lcom/yandex/go/scooters/mosru/api/analytics/ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason;", "MODAL", "DEEPLINK", "go-client-android.features.scooters.mosru:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason[] $VALUES;
    public static final ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason DEEPLINK;
    public static final ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason MODAL;

    static {
        ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason scootersMosRuAnalyticsEvent$WebViewOpened$OpenReason = new ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason("MODAL", 0);
        MODAL = scootersMosRuAnalyticsEvent$WebViewOpened$OpenReason;
        ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason scootersMosRuAnalyticsEvent$WebViewOpened$OpenReason2 = new ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason("DEEPLINK", 1);
        DEEPLINK = scootersMosRuAnalyticsEvent$WebViewOpened$OpenReason2;
        ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason[] scootersMosRuAnalyticsEvent$WebViewOpened$OpenReasonArr = {scootersMosRuAnalyticsEvent$WebViewOpened$OpenReason, scootersMosRuAnalyticsEvent$WebViewOpened$OpenReason2};
        $VALUES = scootersMosRuAnalyticsEvent$WebViewOpened$OpenReasonArr;
        $ENTRIES = a.a(scootersMosRuAnalyticsEvent$WebViewOpened$OpenReasonArr);
    }

    public static ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason valueOf(String str) {
        return (ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason) Enum.valueOf(ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason.class, str);
    }

    public static ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason[] values() {
        return (ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason[]) $VALUES.clone();
    }
}
