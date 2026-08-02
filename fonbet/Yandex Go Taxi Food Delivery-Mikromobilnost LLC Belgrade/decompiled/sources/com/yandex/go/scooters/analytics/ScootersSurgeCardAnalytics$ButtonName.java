package com.yandex.go.scooters.analytics;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/scooters/analytics/ScootersSurgeCardAnalytics$ButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersSurgeCardAnalytics$ButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "HowItWorks", "Ok", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersSurgeCardAnalytics$ButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersSurgeCardAnalytics$ButtonName[] $VALUES;
    public static final ScootersSurgeCardAnalytics$ButtonName HowItWorks;
    public static final ScootersSurgeCardAnalytics$ButtonName Ok;
    private final String eventValue;

    static {
        ScootersSurgeCardAnalytics$ButtonName scootersSurgeCardAnalytics$ButtonName = new ScootersSurgeCardAnalytics$ButtonName("HowItWorks", 0, "how_it_works");
        HowItWorks = scootersSurgeCardAnalytics$ButtonName;
        ScootersSurgeCardAnalytics$ButtonName scootersSurgeCardAnalytics$ButtonName2 = new ScootersSurgeCardAnalytics$ButtonName("Ok", 1, WriteBlocks.OK);
        Ok = scootersSurgeCardAnalytics$ButtonName2;
        ScootersSurgeCardAnalytics$ButtonName[] scootersSurgeCardAnalytics$ButtonNameArr = {scootersSurgeCardAnalytics$ButtonName, scootersSurgeCardAnalytics$ButtonName2};
        $VALUES = scootersSurgeCardAnalytics$ButtonNameArr;
        $ENTRIES = a.a(scootersSurgeCardAnalytics$ButtonNameArr);
    }

    public ScootersSurgeCardAnalytics$ButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersSurgeCardAnalytics$ButtonName valueOf(String str) {
        return (ScootersSurgeCardAnalytics$ButtonName) Enum.valueOf(ScootersSurgeCardAnalytics$ButtonName.class, str);
    }

    public static ScootersSurgeCardAnalytics$ButtonName[] values() {
        return (ScootersSurgeCardAnalytics$ButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
