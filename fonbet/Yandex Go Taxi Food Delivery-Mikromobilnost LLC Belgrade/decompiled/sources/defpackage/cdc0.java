package defpackage;

import com.yandex.go.places.map.ui.configs.PlacesPinLabelBitmapCreator$LabelTypeface;
import com.yandex.go.places.map.ui.configs.PlacesPinLabelBitmapCreator$TextAlignment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class cdc0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PlacesPinLabelBitmapCreator$LabelTypeface.values().length];
        try {
            iArr[PlacesPinLabelBitmapCreator$LabelTypeface.DisplayCondMedium.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlacesPinLabelBitmapCreator$LabelTypeface.DisplayCondRegular.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlacesPinLabelBitmapCreator$LabelTypeface.DisplayCondBold.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlacesPinLabelBitmapCreator$LabelTypeface.TextMedium.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PlacesPinLabelBitmapCreator$LabelTypeface.TextBold.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[PlacesPinLabelBitmapCreator$TextAlignment.values().length];
        try {
            iArr2[PlacesPinLabelBitmapCreator$TextAlignment.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PlacesPinLabelBitmapCreator$TextAlignment.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PlacesPinLabelBitmapCreator$TextAlignment.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
