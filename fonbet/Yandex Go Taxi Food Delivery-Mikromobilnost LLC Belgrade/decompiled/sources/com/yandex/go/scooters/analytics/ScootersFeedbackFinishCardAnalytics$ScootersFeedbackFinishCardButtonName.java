package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/go/scooters/analytics/ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PricingHeader", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName[] $VALUES;
    public static final ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName PricingHeader;
    private final String eventValue = "pricing_header";

    static {
        ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName scootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName = new ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName();
        PricingHeader = scootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName;
        ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName[] scootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonNameArr = {scootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName};
        $VALUES = scootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonNameArr;
        $ENTRIES = a.a(scootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonNameArr);
    }

    public static ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName valueOf(String str) {
        return (ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName) Enum.valueOf(ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName.class, str);
    }

    public static ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName[] values() {
        return (ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
