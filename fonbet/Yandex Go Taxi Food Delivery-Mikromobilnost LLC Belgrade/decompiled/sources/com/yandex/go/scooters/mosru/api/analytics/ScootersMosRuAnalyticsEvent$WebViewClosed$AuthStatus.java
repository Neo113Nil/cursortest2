package com.yandex.go.scooters.mosru.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/scooters/mosru/api/analytics/ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus", "", "Lcom/yandex/go/scooters/mosru/api/analytics/ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus;", "SUCCESS", "FAILURE", "CANCELED", "go-client-android.features.scooters.mosru:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus[] $VALUES;
    public static final ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus CANCELED;
    public static final ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus FAILURE;
    public static final ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus SUCCESS;

    static {
        ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus scootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus = new ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus("SUCCESS", 0);
        SUCCESS = scootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus;
        ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus scootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus2 = new ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus("FAILURE", 1);
        FAILURE = scootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus2;
        ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus scootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus3 = new ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus("CANCELED", 2);
        CANCELED = scootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus3;
        ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus[] scootersMosRuAnalyticsEvent$WebViewClosed$AuthStatusArr = {scootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus, scootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus2, scootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus3};
        $VALUES = scootersMosRuAnalyticsEvent$WebViewClosed$AuthStatusArr;
        $ENTRIES = a.a(scootersMosRuAnalyticsEvent$WebViewClosed$AuthStatusArr);
    }

    public static ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus valueOf(String str) {
        return (ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus) Enum.valueOf(ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus.class, str);
    }

    public static ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus[] values() {
        return (ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus[]) $VALUES.clone();
    }
}
