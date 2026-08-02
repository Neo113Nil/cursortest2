package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/scooters/analytics/ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Agree", "Disagree", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName[] $VALUES;
    public static final ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName Agree;
    public static final ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName Disagree;
    private final String eventValue;

    static {
        ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName scootersAnalytics$ScootersPackagesUpsaleTappedButtonName = new ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName("Agree", 0, "agree");
        Agree = scootersAnalytics$ScootersPackagesUpsaleTappedButtonName;
        ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName scootersAnalytics$ScootersPackagesUpsaleTappedButtonName2 = new ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName("Disagree", 1, "disagree");
        Disagree = scootersAnalytics$ScootersPackagesUpsaleTappedButtonName2;
        ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName[] scootersAnalytics$ScootersPackagesUpsaleTappedButtonNameArr = {scootersAnalytics$ScootersPackagesUpsaleTappedButtonName, scootersAnalytics$ScootersPackagesUpsaleTappedButtonName2};
        $VALUES = scootersAnalytics$ScootersPackagesUpsaleTappedButtonNameArr;
        $ENTRIES = a.a(scootersAnalytics$ScootersPackagesUpsaleTappedButtonNameArr);
    }

    public ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName valueOf(String str) {
        return (ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName) Enum.valueOf(ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName.class, str);
    }

    public static ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName[] values() {
        return (ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
