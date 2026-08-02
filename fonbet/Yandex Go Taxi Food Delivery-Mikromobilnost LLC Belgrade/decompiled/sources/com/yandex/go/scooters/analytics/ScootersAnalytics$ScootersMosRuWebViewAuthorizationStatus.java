package com.yandex.go.scooters.analytics;

import com.yandex.payment.common.result.ResultType;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/scooters/analytics/ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus", "", "Lcom/yandex/go/scooters/analytics/ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Success", "Failure", "Canceled", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus[] $VALUES;
    public static final ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus Canceled;
    public static final ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus Failure;
    public static final ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus Success;
    private final String eventValue;

    static {
        ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus scootersAnalytics$ScootersMosRuWebViewAuthorizationStatus = new ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus("Success", 0, "success");
        Success = scootersAnalytics$ScootersMosRuWebViewAuthorizationStatus;
        ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus scootersAnalytics$ScootersMosRuWebViewAuthorizationStatus2 = new ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus("Failure", 1, ResultType.RESULT_TYPE_FAILURE);
        Failure = scootersAnalytics$ScootersMosRuWebViewAuthorizationStatus2;
        ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus scootersAnalytics$ScootersMosRuWebViewAuthorizationStatus3 = new ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus("Canceled", 2, "canceled");
        Canceled = scootersAnalytics$ScootersMosRuWebViewAuthorizationStatus3;
        ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus[] scootersAnalytics$ScootersMosRuWebViewAuthorizationStatusArr = {scootersAnalytics$ScootersMosRuWebViewAuthorizationStatus, scootersAnalytics$ScootersMosRuWebViewAuthorizationStatus2, scootersAnalytics$ScootersMosRuWebViewAuthorizationStatus3};
        $VALUES = scootersAnalytics$ScootersMosRuWebViewAuthorizationStatusArr;
        $ENTRIES = a.a(scootersAnalytics$ScootersMosRuWebViewAuthorizationStatusArr);
    }

    public ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus valueOf(String str) {
        return (ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus) Enum.valueOf(ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus.class, str);
    }

    public static ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus[] values() {
        return (ScootersAnalytics$ScootersMosRuWebViewAuthorizationStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
