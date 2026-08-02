package com.yandex.go.scooters.insurance.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/scooters/insurance/analytics/InsuranceOpenReason;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ONBOARDING", "BOOK", "TARIFF_DETAILS", "ICON", "DISCOVERY_SHORCUT", "OFFER_ADDON", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InsuranceOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InsuranceOpenReason[] $VALUES;
    public static final InsuranceOpenReason BOOK;
    public static final InsuranceOpenReason DISCOVERY_SHORCUT;
    public static final InsuranceOpenReason ICON;
    public static final InsuranceOpenReason OFFER_ADDON;
    public static final InsuranceOpenReason ONBOARDING;
    public static final InsuranceOpenReason TARIFF_DETAILS;
    private final String analyticsName;

    static {
        InsuranceOpenReason insuranceOpenReason = new InsuranceOpenReason("ONBOARDING", 0, "onboarding_proposal");
        ONBOARDING = insuranceOpenReason;
        InsuranceOpenReason insuranceOpenReason2 = new InsuranceOpenReason("BOOK", 1, "book_proposal");
        BOOK = insuranceOpenReason2;
        InsuranceOpenReason insuranceOpenReason3 = new InsuranceOpenReason("TARIFF_DETAILS", 2, "tariff_details");
        TARIFF_DETAILS = insuranceOpenReason3;
        InsuranceOpenReason insuranceOpenReason4 = new InsuranceOpenReason("ICON", 3, "icon");
        ICON = insuranceOpenReason4;
        InsuranceOpenReason insuranceOpenReason5 = new InsuranceOpenReason("DISCOVERY_SHORCUT", 4, "discovery_shortcut");
        DISCOVERY_SHORCUT = insuranceOpenReason5;
        InsuranceOpenReason insuranceOpenReason6 = new InsuranceOpenReason("OFFER_ADDON", 5, "offer_addon");
        OFFER_ADDON = insuranceOpenReason6;
        InsuranceOpenReason[] insuranceOpenReasonArr = {insuranceOpenReason, insuranceOpenReason2, insuranceOpenReason3, insuranceOpenReason4, insuranceOpenReason5, insuranceOpenReason6};
        $VALUES = insuranceOpenReasonArr;
        $ENTRIES = a.a(insuranceOpenReasonArr);
    }

    public InsuranceOpenReason(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static InsuranceOpenReason valueOf(String str) {
        return (InsuranceOpenReason) Enum.valueOf(InsuranceOpenReason.class, str);
    }

    public static InsuranceOpenReason[] values() {
        return (InsuranceOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
