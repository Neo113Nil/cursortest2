package com.yandex.go.scooters.insurance.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/scooters/insurance/model/ScootersInsuranceControl;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BUTTON", "TOGGLE", "IMMUTABLE_TOGGLE", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersInsuranceControl {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersInsuranceControl[] $VALUES;
    public static final ScootersInsuranceControl BUTTON;
    public static final ScootersInsuranceControl IMMUTABLE_TOGGLE;
    public static final ScootersInsuranceControl TOGGLE;
    private final String analyticsName;

    static {
        ScootersInsuranceControl scootersInsuranceControl = new ScootersInsuranceControl("BUTTON", 0, "button");
        BUTTON = scootersInsuranceControl;
        ScootersInsuranceControl scootersInsuranceControl2 = new ScootersInsuranceControl("TOGGLE", 1, "toggle");
        TOGGLE = scootersInsuranceControl2;
        ScootersInsuranceControl scootersInsuranceControl3 = new ScootersInsuranceControl("IMMUTABLE_TOGGLE", 2, "toggle");
        IMMUTABLE_TOGGLE = scootersInsuranceControl3;
        ScootersInsuranceControl[] scootersInsuranceControlArr = {scootersInsuranceControl, scootersInsuranceControl2, scootersInsuranceControl3};
        $VALUES = scootersInsuranceControlArr;
        $ENTRIES = a.a(scootersInsuranceControlArr);
    }

    public ScootersInsuranceControl(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static ScootersInsuranceControl valueOf(String str) {
        return (ScootersInsuranceControl) Enum.valueOf(ScootersInsuranceControl.class, str);
    }

    public static ScootersInsuranceControl[] values() {
        return (ScootersInsuranceControl[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
