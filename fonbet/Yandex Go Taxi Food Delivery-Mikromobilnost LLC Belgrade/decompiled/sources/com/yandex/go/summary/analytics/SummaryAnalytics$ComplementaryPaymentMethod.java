package com.yandex.go.summary.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/summary/analytics/SummaryAnalytics$ComplementaryPaymentMethod", "", "Lcom/yandex/go/summary/analytics/SummaryAnalytics$ComplementaryPaymentMethod;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PersonalWallet", "BirbonusWallet", "go-client-android.features.summary:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SummaryAnalytics$ComplementaryPaymentMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryAnalytics$ComplementaryPaymentMethod[] $VALUES;
    public static final SummaryAnalytics$ComplementaryPaymentMethod BirbonusWallet;
    public static final SummaryAnalytics$ComplementaryPaymentMethod PersonalWallet;
    private final String eventValue;

    static {
        SummaryAnalytics$ComplementaryPaymentMethod summaryAnalytics$ComplementaryPaymentMethod = new SummaryAnalytics$ComplementaryPaymentMethod("PersonalWallet", 0, "personal_wallet");
        PersonalWallet = summaryAnalytics$ComplementaryPaymentMethod;
        SummaryAnalytics$ComplementaryPaymentMethod summaryAnalytics$ComplementaryPaymentMethod2 = new SummaryAnalytics$ComplementaryPaymentMethod("BirbonusWallet", 1, "birbonus_wallet");
        BirbonusWallet = summaryAnalytics$ComplementaryPaymentMethod2;
        SummaryAnalytics$ComplementaryPaymentMethod[] summaryAnalytics$ComplementaryPaymentMethodArr = {summaryAnalytics$ComplementaryPaymentMethod, summaryAnalytics$ComplementaryPaymentMethod2};
        $VALUES = summaryAnalytics$ComplementaryPaymentMethodArr;
        $ENTRIES = a.a(summaryAnalytics$ComplementaryPaymentMethodArr);
    }

    public SummaryAnalytics$ComplementaryPaymentMethod(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SummaryAnalytics$ComplementaryPaymentMethod valueOf(String str) {
        return (SummaryAnalytics$ComplementaryPaymentMethod) Enum.valueOf(SummaryAnalytics$ComplementaryPaymentMethod.class, str);
    }

    public static SummaryAnalytics$ComplementaryPaymentMethod[] values() {
        return (SummaryAnalytics$ComplementaryPaymentMethod[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
