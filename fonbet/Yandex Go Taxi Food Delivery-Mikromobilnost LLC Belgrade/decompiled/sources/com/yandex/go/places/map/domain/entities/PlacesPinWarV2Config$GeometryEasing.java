package com.yandex.go.places.map.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/places/map/domain/entities/PlacesPinWarV2Config$GeometryEasing", "", "Lcom/yandex/go/places/map/domain/entities/PlacesPinWarV2Config$GeometryEasing;", "LINEAR", "EASE_IN", "EASE_OUT", "EASE_IN_OUT", PolicyMappingsExtension.MAP}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesPinWarV2Config$GeometryEasing {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesPinWarV2Config$GeometryEasing[] $VALUES;
    public static final PlacesPinWarV2Config$GeometryEasing EASE_IN;
    public static final PlacesPinWarV2Config$GeometryEasing EASE_IN_OUT;
    public static final PlacesPinWarV2Config$GeometryEasing EASE_OUT;
    public static final PlacesPinWarV2Config$GeometryEasing LINEAR;

    static {
        PlacesPinWarV2Config$GeometryEasing placesPinWarV2Config$GeometryEasing = new PlacesPinWarV2Config$GeometryEasing("LINEAR", 0);
        LINEAR = placesPinWarV2Config$GeometryEasing;
        PlacesPinWarV2Config$GeometryEasing placesPinWarV2Config$GeometryEasing2 = new PlacesPinWarV2Config$GeometryEasing("EASE_IN", 1);
        EASE_IN = placesPinWarV2Config$GeometryEasing2;
        PlacesPinWarV2Config$GeometryEasing placesPinWarV2Config$GeometryEasing3 = new PlacesPinWarV2Config$GeometryEasing("EASE_OUT", 2);
        EASE_OUT = placesPinWarV2Config$GeometryEasing3;
        PlacesPinWarV2Config$GeometryEasing placesPinWarV2Config$GeometryEasing4 = new PlacesPinWarV2Config$GeometryEasing("EASE_IN_OUT", 3);
        EASE_IN_OUT = placesPinWarV2Config$GeometryEasing4;
        PlacesPinWarV2Config$GeometryEasing[] placesPinWarV2Config$GeometryEasingArr = {placesPinWarV2Config$GeometryEasing, placesPinWarV2Config$GeometryEasing2, placesPinWarV2Config$GeometryEasing3, placesPinWarV2Config$GeometryEasing4};
        $VALUES = placesPinWarV2Config$GeometryEasingArr;
        $ENTRIES = a.a(placesPinWarV2Config$GeometryEasingArr);
    }

    public static PlacesPinWarV2Config$GeometryEasing valueOf(String str) {
        return (PlacesPinWarV2Config$GeometryEasing) Enum.valueOf(PlacesPinWarV2Config$GeometryEasing.class, str);
    }

    public static PlacesPinWarV2Config$GeometryEasing[] values() {
        return (PlacesPinWarV2Config$GeometryEasing[]) $VALUES.clone();
    }
}
