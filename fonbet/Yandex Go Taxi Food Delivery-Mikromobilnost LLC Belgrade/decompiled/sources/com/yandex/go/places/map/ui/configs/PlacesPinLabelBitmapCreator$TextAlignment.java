package com.yandex.go.places.map.ui.configs;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/places/map/ui/configs/PlacesPinLabelBitmapCreator$TextAlignment", "", "Lcom/yandex/go/places/map/ui/configs/PlacesPinLabelBitmapCreator$TextAlignment;", "LEFT", "CENTER", "RIGHT", PolicyMappingsExtension.MAP}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesPinLabelBitmapCreator$TextAlignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesPinLabelBitmapCreator$TextAlignment[] $VALUES;
    public static final PlacesPinLabelBitmapCreator$TextAlignment CENTER;
    public static final PlacesPinLabelBitmapCreator$TextAlignment LEFT;
    public static final PlacesPinLabelBitmapCreator$TextAlignment RIGHT;

    static {
        PlacesPinLabelBitmapCreator$TextAlignment placesPinLabelBitmapCreator$TextAlignment = new PlacesPinLabelBitmapCreator$TextAlignment("LEFT", 0);
        LEFT = placesPinLabelBitmapCreator$TextAlignment;
        PlacesPinLabelBitmapCreator$TextAlignment placesPinLabelBitmapCreator$TextAlignment2 = new PlacesPinLabelBitmapCreator$TextAlignment("CENTER", 1);
        CENTER = placesPinLabelBitmapCreator$TextAlignment2;
        PlacesPinLabelBitmapCreator$TextAlignment placesPinLabelBitmapCreator$TextAlignment3 = new PlacesPinLabelBitmapCreator$TextAlignment("RIGHT", 2);
        RIGHT = placesPinLabelBitmapCreator$TextAlignment3;
        PlacesPinLabelBitmapCreator$TextAlignment[] placesPinLabelBitmapCreator$TextAlignmentArr = {placesPinLabelBitmapCreator$TextAlignment, placesPinLabelBitmapCreator$TextAlignment2, placesPinLabelBitmapCreator$TextAlignment3};
        $VALUES = placesPinLabelBitmapCreator$TextAlignmentArr;
        $ENTRIES = a.a(placesPinLabelBitmapCreator$TextAlignmentArr);
    }

    public static PlacesPinLabelBitmapCreator$TextAlignment valueOf(String str) {
        return (PlacesPinLabelBitmapCreator$TextAlignment) Enum.valueOf(PlacesPinLabelBitmapCreator$TextAlignment.class, str);
    }

    public static PlacesPinLabelBitmapCreator$TextAlignment[] values() {
        return (PlacesPinLabelBitmapCreator$TextAlignment[]) $VALUES.clone();
    }
}
