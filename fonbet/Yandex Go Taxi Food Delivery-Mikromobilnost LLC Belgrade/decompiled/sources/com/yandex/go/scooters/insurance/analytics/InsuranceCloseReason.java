package com.yandex.go.scooters.insurance.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/scooters/insurance/analytics/InsuranceCloseReason;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "REFUSE_BUTTON", "CLOSE_BUTTON", "ENABLE_INSURANCE_BUTTON", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InsuranceCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InsuranceCloseReason[] $VALUES;
    public static final InsuranceCloseReason CLOSE_BUTTON;
    public static final InsuranceCloseReason ENABLE_INSURANCE_BUTTON;
    public static final InsuranceCloseReason REFUSE_BUTTON;
    private final String analyticsName;

    static {
        InsuranceCloseReason insuranceCloseReason = new InsuranceCloseReason("REFUSE_BUTTON", 0, "refuse_button");
        REFUSE_BUTTON = insuranceCloseReason;
        InsuranceCloseReason insuranceCloseReason2 = new InsuranceCloseReason("CLOSE_BUTTON", 1, "close_button");
        CLOSE_BUTTON = insuranceCloseReason2;
        InsuranceCloseReason insuranceCloseReason3 = new InsuranceCloseReason("ENABLE_INSURANCE_BUTTON", 2, "enable_insurance_button");
        ENABLE_INSURANCE_BUTTON = insuranceCloseReason3;
        InsuranceCloseReason[] insuranceCloseReasonArr = {insuranceCloseReason, insuranceCloseReason2, insuranceCloseReason3};
        $VALUES = insuranceCloseReasonArr;
        $ENTRIES = a.a(insuranceCloseReasonArr);
    }

    public InsuranceCloseReason(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static InsuranceCloseReason valueOf(String str) {
        return (InsuranceCloseReason) Enum.valueOf(InsuranceCloseReason.class, str);
    }

    public static InsuranceCloseReason[] values() {
        return (InsuranceCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
