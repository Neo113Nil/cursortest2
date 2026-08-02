package com.yandex.go.scooters.offers.v2.analytics;

import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$InsuranceState;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/scooters/offers/v2/analytics/ScootersCardV2Analytics$InsuranceState", "", "Lcom/yandex/go/scooters/offers/v2/analytics/ScootersCardV2Analytics$InsuranceState;", "Lcom/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$InsuranceState;", "evgenValue", "Lcom/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$InsuranceState;", "a", "()Lcom/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$InsuranceState;", "UNAVAILABLE", "STANDART", "FULL", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCardV2Analytics$InsuranceState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersCardV2Analytics$InsuranceState[] $VALUES;
    public static final ScootersCardV2Analytics$InsuranceState FULL;
    public static final ScootersCardV2Analytics$InsuranceState STANDART;
    public static final ScootersCardV2Analytics$InsuranceState UNAVAILABLE;
    private final ScootersOfferCardAnalytics$InsuranceState evgenValue;

    static {
        ScootersCardV2Analytics$InsuranceState scootersCardV2Analytics$InsuranceState = new ScootersCardV2Analytics$InsuranceState("UNAVAILABLE", 0, ScootersOfferCardAnalytics$InsuranceState.Unavailable);
        UNAVAILABLE = scootersCardV2Analytics$InsuranceState;
        ScootersCardV2Analytics$InsuranceState scootersCardV2Analytics$InsuranceState2 = new ScootersCardV2Analytics$InsuranceState("STANDART", 1, ScootersOfferCardAnalytics$InsuranceState.Standart);
        STANDART = scootersCardV2Analytics$InsuranceState2;
        ScootersCardV2Analytics$InsuranceState scootersCardV2Analytics$InsuranceState3 = new ScootersCardV2Analytics$InsuranceState("FULL", 2, ScootersOfferCardAnalytics$InsuranceState.Full);
        FULL = scootersCardV2Analytics$InsuranceState3;
        ScootersCardV2Analytics$InsuranceState[] scootersCardV2Analytics$InsuranceStateArr = {scootersCardV2Analytics$InsuranceState, scootersCardV2Analytics$InsuranceState2, scootersCardV2Analytics$InsuranceState3};
        $VALUES = scootersCardV2Analytics$InsuranceStateArr;
        $ENTRIES = kotlin.enums.a.a(scootersCardV2Analytics$InsuranceStateArr);
    }

    public ScootersCardV2Analytics$InsuranceState(String str, int i, ScootersOfferCardAnalytics$InsuranceState scootersOfferCardAnalytics$InsuranceState) {
        this.evgenValue = scootersOfferCardAnalytics$InsuranceState;
    }

    public static ScootersCardV2Analytics$InsuranceState valueOf(String str) {
        return (ScootersCardV2Analytics$InsuranceState) Enum.valueOf(ScootersCardV2Analytics$InsuranceState.class, str);
    }

    public static ScootersCardV2Analytics$InsuranceState[] values() {
        return (ScootersCardV2Analytics$InsuranceState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final ScootersOfferCardAnalytics$InsuranceState getEvgenValue() {
        return this.evgenValue;
    }
}
