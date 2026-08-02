package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$CardShownState", "", "Lcom/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$CardShownState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Minimized", "Opened", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersOfferCardAnalytics$CardShownState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersOfferCardAnalytics$CardShownState[] $VALUES;
    public static final ScootersOfferCardAnalytics$CardShownState Minimized;
    public static final ScootersOfferCardAnalytics$CardShownState Opened;
    private final String eventValue;

    static {
        ScootersOfferCardAnalytics$CardShownState scootersOfferCardAnalytics$CardShownState = new ScootersOfferCardAnalytics$CardShownState("Minimized", 0, "minimized");
        Minimized = scootersOfferCardAnalytics$CardShownState;
        ScootersOfferCardAnalytics$CardShownState scootersOfferCardAnalytics$CardShownState2 = new ScootersOfferCardAnalytics$CardShownState("Opened", 1, "opened");
        Opened = scootersOfferCardAnalytics$CardShownState2;
        ScootersOfferCardAnalytics$CardShownState[] scootersOfferCardAnalytics$CardShownStateArr = {scootersOfferCardAnalytics$CardShownState, scootersOfferCardAnalytics$CardShownState2};
        $VALUES = scootersOfferCardAnalytics$CardShownStateArr;
        $ENTRIES = a.a(scootersOfferCardAnalytics$CardShownStateArr);
    }

    public ScootersOfferCardAnalytics$CardShownState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersOfferCardAnalytics$CardShownState valueOf(String str) {
        return (ScootersOfferCardAnalytics$CardShownState) Enum.valueOf(ScootersOfferCardAnalytics$CardShownState.class, str);
    }

    public static ScootersOfferCardAnalytics$CardShownState[] values() {
        return (ScootersOfferCardAnalytics$CardShownState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
