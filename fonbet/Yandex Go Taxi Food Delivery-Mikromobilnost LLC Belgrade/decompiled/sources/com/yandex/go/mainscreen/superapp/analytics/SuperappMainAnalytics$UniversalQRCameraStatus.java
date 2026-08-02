package com.yandex.go.mainscreen.superapp.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/mainscreen/superapp/analytics/SuperappMainAnalytics$UniversalQRCameraStatus", "", "Lcom/yandex/go/mainscreen/superapp/analytics/SuperappMainAnalytics$UniversalQRCameraStatus;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "RequestAccess", "Forbidden", "ReadyToScan", "go-client-android.features.superapp.mainscreen:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappMainAnalytics$UniversalQRCameraStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperappMainAnalytics$UniversalQRCameraStatus[] $VALUES;
    public static final SuperappMainAnalytics$UniversalQRCameraStatus Forbidden;
    public static final SuperappMainAnalytics$UniversalQRCameraStatus ReadyToScan;
    public static final SuperappMainAnalytics$UniversalQRCameraStatus RequestAccess;
    private final String eventValue;

    static {
        SuperappMainAnalytics$UniversalQRCameraStatus superappMainAnalytics$UniversalQRCameraStatus = new SuperappMainAnalytics$UniversalQRCameraStatus("RequestAccess", 0, "request_access");
        RequestAccess = superappMainAnalytics$UniversalQRCameraStatus;
        SuperappMainAnalytics$UniversalQRCameraStatus superappMainAnalytics$UniversalQRCameraStatus2 = new SuperappMainAnalytics$UniversalQRCameraStatus("Forbidden", 1, "forbidden");
        Forbidden = superappMainAnalytics$UniversalQRCameraStatus2;
        SuperappMainAnalytics$UniversalQRCameraStatus superappMainAnalytics$UniversalQRCameraStatus3 = new SuperappMainAnalytics$UniversalQRCameraStatus("ReadyToScan", 2, "ready_to_scan");
        ReadyToScan = superappMainAnalytics$UniversalQRCameraStatus3;
        SuperappMainAnalytics$UniversalQRCameraStatus[] superappMainAnalytics$UniversalQRCameraStatusArr = {superappMainAnalytics$UniversalQRCameraStatus, superappMainAnalytics$UniversalQRCameraStatus2, superappMainAnalytics$UniversalQRCameraStatus3};
        $VALUES = superappMainAnalytics$UniversalQRCameraStatusArr;
        $ENTRIES = a.a(superappMainAnalytics$UniversalQRCameraStatusArr);
    }

    public SuperappMainAnalytics$UniversalQRCameraStatus(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SuperappMainAnalytics$UniversalQRCameraStatus valueOf(String str) {
        return (SuperappMainAnalytics$UniversalQRCameraStatus) Enum.valueOf(SuperappMainAnalytics$UniversalQRCameraStatus.class, str);
    }

    public static SuperappMainAnalytics$UniversalQRCameraStatus[] values() {
        return (SuperappMainAnalytics$UniversalQRCameraStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
