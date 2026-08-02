package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/scooters/analytics/ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason", "", "Lcom/yandex/go/scooters/analytics/ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MapOnPreorder", "MapOnOrder", "CameraOnCompletion", "OfferCard", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason[] $VALUES;
    public static final ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason CameraOnCompletion;
    public static final ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason MapOnOrder;
    public static final ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason MapOnPreorder;
    public static final ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason OfferCard;
    private final String eventValue;

    static {
        ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason = new ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason("MapOnPreorder", 0, "map_on_preorder");
        MapOnPreorder = scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason;
        ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason2 = new ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason("MapOnOrder", 1, "map_on_order");
        MapOnOrder = scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason2;
        ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason3 = new ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason("CameraOnCompletion", 2, "camera_on_completion");
        CameraOnCompletion = scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason3;
        ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason4 = new ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason("OfferCard", 3, "offer_card");
        OfferCard = scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason4;
        ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason[] scootersAnalytics$ScootersParkingPanoramaOpenedOpenReasonArr = {scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason, scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason2, scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason3, scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason4};
        $VALUES = scootersAnalytics$ScootersParkingPanoramaOpenedOpenReasonArr;
        $ENTRIES = a.a(scootersAnalytics$ScootersParkingPanoramaOpenedOpenReasonArr);
    }

    public ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason valueOf(String str) {
        return (ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason) Enum.valueOf(ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason.class, str);
    }

    public static ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason[] values() {
        return (ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
