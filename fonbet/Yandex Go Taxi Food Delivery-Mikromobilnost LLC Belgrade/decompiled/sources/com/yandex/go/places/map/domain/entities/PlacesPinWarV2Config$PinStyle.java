package com.yandex.go.places.map.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/places/map/domain/entities/PlacesPinWarV2Config$PinStyle", "", "Lcom/yandex/go/places/map/domain/entities/PlacesPinWarV2Config$PinStyle;", "", "styleKey", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "UNIVERSAL_M", "UNIVERSAL_L", "SUPERMAP", "SUPERMAP_FALLBACK", PolicyMappingsExtension.MAP}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesPinWarV2Config$PinStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesPinWarV2Config$PinStyle[] $VALUES;
    public static final PlacesPinWarV2Config$PinStyle SUPERMAP;
    public static final PlacesPinWarV2Config$PinStyle SUPERMAP_FALLBACK;
    public static final PlacesPinWarV2Config$PinStyle UNIVERSAL_L;
    public static final PlacesPinWarV2Config$PinStyle UNIVERSAL_M;
    private final String styleKey;

    static {
        PlacesPinWarV2Config$PinStyle placesPinWarV2Config$PinStyle = new PlacesPinWarV2Config$PinStyle("UNIVERSAL_M", 0, "universal_style_m");
        UNIVERSAL_M = placesPinWarV2Config$PinStyle;
        PlacesPinWarV2Config$PinStyle placesPinWarV2Config$PinStyle2 = new PlacesPinWarV2Config$PinStyle("UNIVERSAL_L", 1, "universal_style_l");
        UNIVERSAL_L = placesPinWarV2Config$PinStyle2;
        PlacesPinWarV2Config$PinStyle placesPinWarV2Config$PinStyle3 = new PlacesPinWarV2Config$PinStyle("SUPERMAP", 2, "supermap");
        SUPERMAP = placesPinWarV2Config$PinStyle3;
        PlacesPinWarV2Config$PinStyle placesPinWarV2Config$PinStyle4 = new PlacesPinWarV2Config$PinStyle("SUPERMAP_FALLBACK", 3, "supermap_fallback");
        SUPERMAP_FALLBACK = placesPinWarV2Config$PinStyle4;
        PlacesPinWarV2Config$PinStyle[] placesPinWarV2Config$PinStyleArr = {placesPinWarV2Config$PinStyle, placesPinWarV2Config$PinStyle2, placesPinWarV2Config$PinStyle3, placesPinWarV2Config$PinStyle4};
        $VALUES = placesPinWarV2Config$PinStyleArr;
        $ENTRIES = a.a(placesPinWarV2Config$PinStyleArr);
    }

    public PlacesPinWarV2Config$PinStyle(String str, int i, String str2) {
        this.styleKey = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static PlacesPinWarV2Config$PinStyle valueOf(String str) {
        return (PlacesPinWarV2Config$PinStyle) Enum.valueOf(PlacesPinWarV2Config$PinStyle.class, str);
    }

    public static PlacesPinWarV2Config$PinStyle[] values() {
        return (PlacesPinWarV2Config$PinStyle[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getStyleKey() {
        return this.styleKey;
    }
}
