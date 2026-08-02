package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/scooters/analytics/ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Agree", "Disagree", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName[] $VALUES;
    public static final ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName Agree;
    public static final ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName Disagree;
    private final String eventValue;

    static {
        ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName scootersAnalytics$ScootersSuperpassUpsaleTappedButtonName = new ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName("Agree", 0, "agree");
        Agree = scootersAnalytics$ScootersSuperpassUpsaleTappedButtonName;
        ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName scootersAnalytics$ScootersSuperpassUpsaleTappedButtonName2 = new ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName("Disagree", 1, "disagree");
        Disagree = scootersAnalytics$ScootersSuperpassUpsaleTappedButtonName2;
        ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName[] scootersAnalytics$ScootersSuperpassUpsaleTappedButtonNameArr = {scootersAnalytics$ScootersSuperpassUpsaleTappedButtonName, scootersAnalytics$ScootersSuperpassUpsaleTappedButtonName2};
        $VALUES = scootersAnalytics$ScootersSuperpassUpsaleTappedButtonNameArr;
        $ENTRIES = a.a(scootersAnalytics$ScootersSuperpassUpsaleTappedButtonNameArr);
    }

    public ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName valueOf(String str) {
        return (ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName) Enum.valueOf(ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName.class, str);
    }

    public static ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName[] values() {
        return (ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
