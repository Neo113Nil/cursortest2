package defpackage;

import ru.yandex.taxi.logistics.sdk.ui_models.common.YaFontWeight;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaTextOverflow;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaTextStyle;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class kx21 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[YaTextStyle.values().length];
        try {
            iArr[YaTextStyle.TITLE1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YaTextStyle.TITLE2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[YaTextStyle.TITLE3.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[YaTextStyle.TITLE4.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[YaTextStyle.BODY1.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[YaTextStyle.BODY2.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[YaTextStyle.CAPTION1.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[YaTextStyle.CAPTION2.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
        int[] iArr2 = new int[YaFontWeight.values().length];
        try {
            iArr2[YaFontWeight.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[YaFontWeight.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[YaFontWeight.MEDIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[YaFontWeight.BOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[YaFontWeight.EXTRA_BOLD.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        b = iArr2;
        int[] iArr3 = new int[YaTextOverflow.values().length];
        try {
            iArr3[YaTextOverflow.Clip.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[YaTextOverflow.Ellipsis.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        c = iArr3;
    }
}
