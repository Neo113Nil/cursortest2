package com.yandex.go.places.map.ui.configs;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/places/map/ui/configs/PlacesPinLabelBitmapCreator$LabelTypeface", "", "Lcom/yandex/go/places/map/ui/configs/PlacesPinLabelBitmapCreator$LabelTypeface;", "DisplayCondRegular", "DisplayCondMedium", "DisplayCondBold", "TextMedium", "TextBold", PolicyMappingsExtension.MAP}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesPinLabelBitmapCreator$LabelTypeface {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesPinLabelBitmapCreator$LabelTypeface[] $VALUES;
    public static final PlacesPinLabelBitmapCreator$LabelTypeface DisplayCondBold;
    public static final PlacesPinLabelBitmapCreator$LabelTypeface DisplayCondMedium;
    public static final PlacesPinLabelBitmapCreator$LabelTypeface DisplayCondRegular;
    public static final PlacesPinLabelBitmapCreator$LabelTypeface TextBold;
    public static final PlacesPinLabelBitmapCreator$LabelTypeface TextMedium;

    static {
        PlacesPinLabelBitmapCreator$LabelTypeface placesPinLabelBitmapCreator$LabelTypeface = new PlacesPinLabelBitmapCreator$LabelTypeface("DisplayCondRegular", 0);
        DisplayCondRegular = placesPinLabelBitmapCreator$LabelTypeface;
        PlacesPinLabelBitmapCreator$LabelTypeface placesPinLabelBitmapCreator$LabelTypeface2 = new PlacesPinLabelBitmapCreator$LabelTypeface("DisplayCondMedium", 1);
        DisplayCondMedium = placesPinLabelBitmapCreator$LabelTypeface2;
        PlacesPinLabelBitmapCreator$LabelTypeface placesPinLabelBitmapCreator$LabelTypeface3 = new PlacesPinLabelBitmapCreator$LabelTypeface("DisplayCondBold", 2);
        DisplayCondBold = placesPinLabelBitmapCreator$LabelTypeface3;
        PlacesPinLabelBitmapCreator$LabelTypeface placesPinLabelBitmapCreator$LabelTypeface4 = new PlacesPinLabelBitmapCreator$LabelTypeface("TextMedium", 3);
        TextMedium = placesPinLabelBitmapCreator$LabelTypeface4;
        PlacesPinLabelBitmapCreator$LabelTypeface placesPinLabelBitmapCreator$LabelTypeface5 = new PlacesPinLabelBitmapCreator$LabelTypeface("TextBold", 4);
        TextBold = placesPinLabelBitmapCreator$LabelTypeface5;
        PlacesPinLabelBitmapCreator$LabelTypeface[] placesPinLabelBitmapCreator$LabelTypefaceArr = {placesPinLabelBitmapCreator$LabelTypeface, placesPinLabelBitmapCreator$LabelTypeface2, placesPinLabelBitmapCreator$LabelTypeface3, placesPinLabelBitmapCreator$LabelTypeface4, placesPinLabelBitmapCreator$LabelTypeface5};
        $VALUES = placesPinLabelBitmapCreator$LabelTypefaceArr;
        $ENTRIES = a.a(placesPinLabelBitmapCreator$LabelTypefaceArr);
    }

    public static PlacesPinLabelBitmapCreator$LabelTypeface valueOf(String str) {
        return (PlacesPinLabelBitmapCreator$LabelTypeface) Enum.valueOf(PlacesPinLabelBitmapCreator$LabelTypeface.class, str);
    }

    public static PlacesPinLabelBitmapCreator$LabelTypeface[] values() {
        return (PlacesPinLabelBitmapCreator$LabelTypeface[]) $VALUES.clone();
    }
}
