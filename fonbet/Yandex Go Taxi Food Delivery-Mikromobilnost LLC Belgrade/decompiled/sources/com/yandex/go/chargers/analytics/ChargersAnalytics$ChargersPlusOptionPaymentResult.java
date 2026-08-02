package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersPlusOptionPaymentResult", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersPlusOptionPaymentResult;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Success", "Failure", "Cancel", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersPlusOptionPaymentResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersPlusOptionPaymentResult[] $VALUES;
    public static final ChargersAnalytics$ChargersPlusOptionPaymentResult Cancel;
    public static final ChargersAnalytics$ChargersPlusOptionPaymentResult Failure;
    public static final ChargersAnalytics$ChargersPlusOptionPaymentResult Success;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersPlusOptionPaymentResult chargersAnalytics$ChargersPlusOptionPaymentResult = new ChargersAnalytics$ChargersPlusOptionPaymentResult("Success", 0, "Success");
        Success = chargersAnalytics$ChargersPlusOptionPaymentResult;
        ChargersAnalytics$ChargersPlusOptionPaymentResult chargersAnalytics$ChargersPlusOptionPaymentResult2 = new ChargersAnalytics$ChargersPlusOptionPaymentResult("Failure", 1, "Failure");
        Failure = chargersAnalytics$ChargersPlusOptionPaymentResult2;
        ChargersAnalytics$ChargersPlusOptionPaymentResult chargersAnalytics$ChargersPlusOptionPaymentResult3 = new ChargersAnalytics$ChargersPlusOptionPaymentResult("Cancel", 2, "Cancel");
        Cancel = chargersAnalytics$ChargersPlusOptionPaymentResult3;
        ChargersAnalytics$ChargersPlusOptionPaymentResult[] chargersAnalytics$ChargersPlusOptionPaymentResultArr = {chargersAnalytics$ChargersPlusOptionPaymentResult, chargersAnalytics$ChargersPlusOptionPaymentResult2, chargersAnalytics$ChargersPlusOptionPaymentResult3};
        $VALUES = chargersAnalytics$ChargersPlusOptionPaymentResultArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersPlusOptionPaymentResultArr);
    }

    public ChargersAnalytics$ChargersPlusOptionPaymentResult(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersPlusOptionPaymentResult valueOf(String str) {
        return (ChargersAnalytics$ChargersPlusOptionPaymentResult) Enum.valueOf(ChargersAnalytics$ChargersPlusOptionPaymentResult.class, str);
    }

    public static ChargersAnalytics$ChargersPlusOptionPaymentResult[] values() {
        return (ChargersAnalytics$ChargersPlusOptionPaymentResult[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
