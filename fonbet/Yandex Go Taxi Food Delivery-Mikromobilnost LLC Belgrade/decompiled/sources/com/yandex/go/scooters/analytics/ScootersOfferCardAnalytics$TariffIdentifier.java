package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$TariffIdentifier", "", "Lcom/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$TariffIdentifier;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MinutesOffer", "FixOffer", "Package", "Unknown", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersOfferCardAnalytics$TariffIdentifier {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersOfferCardAnalytics$TariffIdentifier[] $VALUES;
    public static final ScootersOfferCardAnalytics$TariffIdentifier FixOffer;
    public static final ScootersOfferCardAnalytics$TariffIdentifier MinutesOffer;
    public static final ScootersOfferCardAnalytics$TariffIdentifier Package;
    public static final ScootersOfferCardAnalytics$TariffIdentifier Unknown;
    private final String eventValue;

    static {
        ScootersOfferCardAnalytics$TariffIdentifier scootersOfferCardAnalytics$TariffIdentifier = new ScootersOfferCardAnalytics$TariffIdentifier("MinutesOffer", 0, "minutes_offer");
        MinutesOffer = scootersOfferCardAnalytics$TariffIdentifier;
        ScootersOfferCardAnalytics$TariffIdentifier scootersOfferCardAnalytics$TariffIdentifier2 = new ScootersOfferCardAnalytics$TariffIdentifier("FixOffer", 1, "fix_offer");
        FixOffer = scootersOfferCardAnalytics$TariffIdentifier2;
        ScootersOfferCardAnalytics$TariffIdentifier scootersOfferCardAnalytics$TariffIdentifier3 = new ScootersOfferCardAnalytics$TariffIdentifier("Package", 2, "package");
        Package = scootersOfferCardAnalytics$TariffIdentifier3;
        ScootersOfferCardAnalytics$TariffIdentifier scootersOfferCardAnalytics$TariffIdentifier4 = new ScootersOfferCardAnalytics$TariffIdentifier("Unknown", 3, "unknown");
        Unknown = scootersOfferCardAnalytics$TariffIdentifier4;
        ScootersOfferCardAnalytics$TariffIdentifier[] scootersOfferCardAnalytics$TariffIdentifierArr = {scootersOfferCardAnalytics$TariffIdentifier, scootersOfferCardAnalytics$TariffIdentifier2, scootersOfferCardAnalytics$TariffIdentifier3, scootersOfferCardAnalytics$TariffIdentifier4};
        $VALUES = scootersOfferCardAnalytics$TariffIdentifierArr;
        $ENTRIES = a.a(scootersOfferCardAnalytics$TariffIdentifierArr);
    }

    public ScootersOfferCardAnalytics$TariffIdentifier(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersOfferCardAnalytics$TariffIdentifier valueOf(String str) {
        return (ScootersOfferCardAnalytics$TariffIdentifier) Enum.valueOf(ScootersOfferCardAnalytics$TariffIdentifier.class, str);
    }

    public static ScootersOfferCardAnalytics$TariffIdentifier[] values() {
        return (ScootersOfferCardAnalytics$TariffIdentifier[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
