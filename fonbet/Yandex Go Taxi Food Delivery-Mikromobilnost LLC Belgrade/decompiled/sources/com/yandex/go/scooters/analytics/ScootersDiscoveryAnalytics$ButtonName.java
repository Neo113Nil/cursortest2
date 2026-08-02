package com.yandex.go.scooters.analytics;

import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/scooters/analytics/ScootersDiscoveryAnalytics$ButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersDiscoveryAnalytics$ButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Qr", "Support", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDiscoveryAnalytics$ButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersDiscoveryAnalytics$ButtonName[] $VALUES;
    public static final ScootersDiscoveryAnalytics$ButtonName Qr;
    public static final ScootersDiscoveryAnalytics$ButtonName Support;
    private final String eventValue;

    static {
        ScootersDiscoveryAnalytics$ButtonName scootersDiscoveryAnalytics$ButtonName = new ScootersDiscoveryAnalytics$ButtonName("Qr", 0, "qr");
        Qr = scootersDiscoveryAnalytics$ButtonName;
        ScootersDiscoveryAnalytics$ButtonName scootersDiscoveryAnalytics$ButtonName2 = new ScootersDiscoveryAnalytics$ButtonName("Support", 1, FoldersConfig.SUPPORT_FILTER_ID);
        Support = scootersDiscoveryAnalytics$ButtonName2;
        ScootersDiscoveryAnalytics$ButtonName[] scootersDiscoveryAnalytics$ButtonNameArr = {scootersDiscoveryAnalytics$ButtonName, scootersDiscoveryAnalytics$ButtonName2};
        $VALUES = scootersDiscoveryAnalytics$ButtonNameArr;
        $ENTRIES = a.a(scootersDiscoveryAnalytics$ButtonNameArr);
    }

    public ScootersDiscoveryAnalytics$ButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersDiscoveryAnalytics$ButtonName valueOf(String str) {
        return (ScootersDiscoveryAnalytics$ButtonName) Enum.valueOf(ScootersDiscoveryAnalytics$ButtonName.class, str);
    }

    public static ScootersDiscoveryAnalytics$ButtonName[] values() {
        return (ScootersDiscoveryAnalytics$ButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
