package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/scooters/analytics/ScootersAnalytics$ScooterPassesTappedButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersAnalytics$ScooterPassesTappedButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Pass", "AutorenewalEnable", "AutorenewalDisable", "Purchase", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAnalytics$ScooterPassesTappedButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersAnalytics$ScooterPassesTappedButtonName[] $VALUES;
    public static final ScootersAnalytics$ScooterPassesTappedButtonName AutorenewalDisable;
    public static final ScootersAnalytics$ScooterPassesTappedButtonName AutorenewalEnable;
    public static final ScootersAnalytics$ScooterPassesTappedButtonName Pass;
    public static final ScootersAnalytics$ScooterPassesTappedButtonName Purchase;
    private final String eventValue;

    static {
        ScootersAnalytics$ScooterPassesTappedButtonName scootersAnalytics$ScooterPassesTappedButtonName = new ScootersAnalytics$ScooterPassesTappedButtonName("Pass", 0, "pass");
        Pass = scootersAnalytics$ScooterPassesTappedButtonName;
        ScootersAnalytics$ScooterPassesTappedButtonName scootersAnalytics$ScooterPassesTappedButtonName2 = new ScootersAnalytics$ScooterPassesTappedButtonName("AutorenewalEnable", 1, "autorenewal_enable");
        AutorenewalEnable = scootersAnalytics$ScooterPassesTappedButtonName2;
        ScootersAnalytics$ScooterPassesTappedButtonName scootersAnalytics$ScooterPassesTappedButtonName3 = new ScootersAnalytics$ScooterPassesTappedButtonName("AutorenewalDisable", 2, "autorenewal_disable");
        AutorenewalDisable = scootersAnalytics$ScooterPassesTappedButtonName3;
        ScootersAnalytics$ScooterPassesTappedButtonName scootersAnalytics$ScooterPassesTappedButtonName4 = new ScootersAnalytics$ScooterPassesTappedButtonName("Purchase", 3, "purchase");
        Purchase = scootersAnalytics$ScooterPassesTappedButtonName4;
        ScootersAnalytics$ScooterPassesTappedButtonName[] scootersAnalytics$ScooterPassesTappedButtonNameArr = {scootersAnalytics$ScooterPassesTappedButtonName, scootersAnalytics$ScooterPassesTappedButtonName2, scootersAnalytics$ScooterPassesTappedButtonName3, scootersAnalytics$ScooterPassesTappedButtonName4};
        $VALUES = scootersAnalytics$ScooterPassesTappedButtonNameArr;
        $ENTRIES = a.a(scootersAnalytics$ScooterPassesTappedButtonNameArr);
    }

    public ScootersAnalytics$ScooterPassesTappedButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersAnalytics$ScooterPassesTappedButtonName valueOf(String str) {
        return (ScootersAnalytics$ScooterPassesTappedButtonName) Enum.valueOf(ScootersAnalytics$ScooterPassesTappedButtonName.class, str);
    }

    public static ScootersAnalytics$ScooterPassesTappedButtonName[] values() {
        return (ScootersAnalytics$ScooterPassesTappedButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
