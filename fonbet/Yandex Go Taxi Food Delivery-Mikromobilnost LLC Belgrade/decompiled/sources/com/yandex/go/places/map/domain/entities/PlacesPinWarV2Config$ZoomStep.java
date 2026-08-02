package com.yandex.go.places.map.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/places/map/domain/entities/PlacesPinWarV2Config$ZoomStep", "", "Lcom/yandex/go/places/map/domain/entities/PlacesPinWarV2Config$ZoomStep;", "FULL", "HALF", "QUARTER", "EIGHTH", PolicyMappingsExtension.MAP}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesPinWarV2Config$ZoomStep {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesPinWarV2Config$ZoomStep[] $VALUES;
    public static final PlacesPinWarV2Config$ZoomStep EIGHTH;
    public static final PlacesPinWarV2Config$ZoomStep FULL;
    public static final PlacesPinWarV2Config$ZoomStep HALF;
    public static final PlacesPinWarV2Config$ZoomStep QUARTER;

    static {
        PlacesPinWarV2Config$ZoomStep placesPinWarV2Config$ZoomStep = new PlacesPinWarV2Config$ZoomStep("FULL", 0);
        FULL = placesPinWarV2Config$ZoomStep;
        PlacesPinWarV2Config$ZoomStep placesPinWarV2Config$ZoomStep2 = new PlacesPinWarV2Config$ZoomStep("HALF", 1);
        HALF = placesPinWarV2Config$ZoomStep2;
        PlacesPinWarV2Config$ZoomStep placesPinWarV2Config$ZoomStep3 = new PlacesPinWarV2Config$ZoomStep("QUARTER", 2);
        QUARTER = placesPinWarV2Config$ZoomStep3;
        PlacesPinWarV2Config$ZoomStep placesPinWarV2Config$ZoomStep4 = new PlacesPinWarV2Config$ZoomStep("EIGHTH", 3);
        EIGHTH = placesPinWarV2Config$ZoomStep4;
        PlacesPinWarV2Config$ZoomStep[] placesPinWarV2Config$ZoomStepArr = {placesPinWarV2Config$ZoomStep, placesPinWarV2Config$ZoomStep2, placesPinWarV2Config$ZoomStep3, placesPinWarV2Config$ZoomStep4};
        $VALUES = placesPinWarV2Config$ZoomStepArr;
        $ENTRIES = a.a(placesPinWarV2Config$ZoomStepArr);
    }

    public static PlacesPinWarV2Config$ZoomStep valueOf(String str) {
        return (PlacesPinWarV2Config$ZoomStep) Enum.valueOf(PlacesPinWarV2Config$ZoomStep.class, str);
    }

    public static PlacesPinWarV2Config$ZoomStep[] values() {
        return (PlacesPinWarV2Config$ZoomStep[]) $VALUES.clone();
    }
}
