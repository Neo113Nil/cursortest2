package com.yandex.go.places.map.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/map/domain/entities/PlacesPinWarV2Config$LabelRenderingMode", "", "Lcom/yandex/go/places/map/domain/entities/PlacesPinWarV2Config$LabelRenderingMode;", "INDEPENDENT_LABEL", "EMBEDDED_IN_ICON", PolicyMappingsExtension.MAP}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesPinWarV2Config$LabelRenderingMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesPinWarV2Config$LabelRenderingMode[] $VALUES;
    public static final PlacesPinWarV2Config$LabelRenderingMode EMBEDDED_IN_ICON;
    public static final PlacesPinWarV2Config$LabelRenderingMode INDEPENDENT_LABEL;

    static {
        PlacesPinWarV2Config$LabelRenderingMode placesPinWarV2Config$LabelRenderingMode = new PlacesPinWarV2Config$LabelRenderingMode("INDEPENDENT_LABEL", 0);
        INDEPENDENT_LABEL = placesPinWarV2Config$LabelRenderingMode;
        PlacesPinWarV2Config$LabelRenderingMode placesPinWarV2Config$LabelRenderingMode2 = new PlacesPinWarV2Config$LabelRenderingMode("EMBEDDED_IN_ICON", 1);
        EMBEDDED_IN_ICON = placesPinWarV2Config$LabelRenderingMode2;
        PlacesPinWarV2Config$LabelRenderingMode[] placesPinWarV2Config$LabelRenderingModeArr = {placesPinWarV2Config$LabelRenderingMode, placesPinWarV2Config$LabelRenderingMode2};
        $VALUES = placesPinWarV2Config$LabelRenderingModeArr;
        $ENTRIES = a.a(placesPinWarV2Config$LabelRenderingModeArr);
    }

    public static PlacesPinWarV2Config$LabelRenderingMode valueOf(String str) {
        return (PlacesPinWarV2Config$LabelRenderingMode) Enum.valueOf(PlacesPinWarV2Config$LabelRenderingMode.class, str);
    }

    public static PlacesPinWarV2Config$LabelRenderingMode[] values() {
        return (PlacesPinWarV2Config$LabelRenderingMode[]) $VALUES.clone();
    }
}
