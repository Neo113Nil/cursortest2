package com.yandex.go.scooters.insurance.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/insurance/model/ScootersInsuranceCompletion;", "", "CLOSED", "DISABLED", "SKIPPED", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersInsuranceCompletion {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersInsuranceCompletion[] $VALUES;
    public static final ScootersInsuranceCompletion CLOSED;
    public static final ScootersInsuranceCompletion DISABLED;
    public static final ScootersInsuranceCompletion SKIPPED;

    static {
        ScootersInsuranceCompletion scootersInsuranceCompletion = new ScootersInsuranceCompletion("CLOSED", 0);
        CLOSED = scootersInsuranceCompletion;
        ScootersInsuranceCompletion scootersInsuranceCompletion2 = new ScootersInsuranceCompletion("DISABLED", 1);
        DISABLED = scootersInsuranceCompletion2;
        ScootersInsuranceCompletion scootersInsuranceCompletion3 = new ScootersInsuranceCompletion("SKIPPED", 2);
        SKIPPED = scootersInsuranceCompletion3;
        ScootersInsuranceCompletion[] scootersInsuranceCompletionArr = {scootersInsuranceCompletion, scootersInsuranceCompletion2, scootersInsuranceCompletion3};
        $VALUES = scootersInsuranceCompletionArr;
        $ENTRIES = a.a(scootersInsuranceCompletionArr);
    }

    public static ScootersInsuranceCompletion valueOf(String str) {
        return (ScootersInsuranceCompletion) Enum.valueOf(ScootersInsuranceCompletion.class, str);
    }

    public static ScootersInsuranceCompletion[] values() {
        return (ScootersInsuranceCompletion[]) $VALUES.clone();
    }
}
