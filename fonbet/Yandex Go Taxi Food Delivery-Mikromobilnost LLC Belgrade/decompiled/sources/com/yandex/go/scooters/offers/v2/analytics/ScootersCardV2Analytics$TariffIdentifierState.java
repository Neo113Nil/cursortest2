package com.yandex.go.scooters.offers.v2.analytics;

import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$TariffIdentifier;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/scooters/offers/v2/analytics/ScootersCardV2Analytics$TariffIdentifierState", "", "Lcom/yandex/go/scooters/offers/v2/analytics/ScootersCardV2Analytics$TariffIdentifierState;", "Lcom/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$TariffIdentifier;", "evgenValue", "Lcom/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$TariffIdentifier;", "a", "()Lcom/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$TariffIdentifier;", "STANDARD", "FIX", "PACKAGE", "UNKNOWN", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCardV2Analytics$TariffIdentifierState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersCardV2Analytics$TariffIdentifierState[] $VALUES;
    public static final ScootersCardV2Analytics$TariffIdentifierState FIX;
    public static final ScootersCardV2Analytics$TariffIdentifierState PACKAGE;
    public static final ScootersCardV2Analytics$TariffIdentifierState STANDARD;
    public static final ScootersCardV2Analytics$TariffIdentifierState UNKNOWN;
    private final ScootersOfferCardAnalytics$TariffIdentifier evgenValue;

    static {
        ScootersCardV2Analytics$TariffIdentifierState scootersCardV2Analytics$TariffIdentifierState = new ScootersCardV2Analytics$TariffIdentifierState("STANDARD", 0, ScootersOfferCardAnalytics$TariffIdentifier.MinutesOffer);
        STANDARD = scootersCardV2Analytics$TariffIdentifierState;
        ScootersCardV2Analytics$TariffIdentifierState scootersCardV2Analytics$TariffIdentifierState2 = new ScootersCardV2Analytics$TariffIdentifierState("FIX", 1, ScootersOfferCardAnalytics$TariffIdentifier.FixOffer);
        FIX = scootersCardV2Analytics$TariffIdentifierState2;
        ScootersCardV2Analytics$TariffIdentifierState scootersCardV2Analytics$TariffIdentifierState3 = new ScootersCardV2Analytics$TariffIdentifierState("PACKAGE", 2, ScootersOfferCardAnalytics$TariffIdentifier.Package);
        PACKAGE = scootersCardV2Analytics$TariffIdentifierState3;
        ScootersCardV2Analytics$TariffIdentifierState scootersCardV2Analytics$TariffIdentifierState4 = new ScootersCardV2Analytics$TariffIdentifierState("UNKNOWN", 3, ScootersOfferCardAnalytics$TariffIdentifier.Unknown);
        UNKNOWN = scootersCardV2Analytics$TariffIdentifierState4;
        ScootersCardV2Analytics$TariffIdentifierState[] scootersCardV2Analytics$TariffIdentifierStateArr = {scootersCardV2Analytics$TariffIdentifierState, scootersCardV2Analytics$TariffIdentifierState2, scootersCardV2Analytics$TariffIdentifierState3, scootersCardV2Analytics$TariffIdentifierState4};
        $VALUES = scootersCardV2Analytics$TariffIdentifierStateArr;
        $ENTRIES = kotlin.enums.a.a(scootersCardV2Analytics$TariffIdentifierStateArr);
    }

    public ScootersCardV2Analytics$TariffIdentifierState(String str, int i, ScootersOfferCardAnalytics$TariffIdentifier scootersOfferCardAnalytics$TariffIdentifier) {
        this.evgenValue = scootersOfferCardAnalytics$TariffIdentifier;
    }

    public static ScootersCardV2Analytics$TariffIdentifierState valueOf(String str) {
        return (ScootersCardV2Analytics$TariffIdentifierState) Enum.valueOf(ScootersCardV2Analytics$TariffIdentifierState.class, str);
    }

    public static ScootersCardV2Analytics$TariffIdentifierState[] values() {
        return (ScootersCardV2Analytics$TariffIdentifierState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final ScootersOfferCardAnalytics$TariffIdentifier getEvgenValue() {
        return this.evgenValue;
    }
}
