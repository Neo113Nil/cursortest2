package defpackage;

import ru.yandex.taxi.logistics.sdk.ui.theme.fonts.DeliveryTypeface;
import ru.yandex.taxi.logistics.sdk.ui.theme.fonts.Style;
import ru.yandex.taxi.logistics.sdk.ui.theme.fonts.TextMetaStyle;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class jjz {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[Style.values().length];
        try {
            iArr[Style.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Style.ITALIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[DeliveryTypeface.values().length];
        try {
            iArr2[DeliveryTypeface.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DeliveryTypeface.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DeliveryTypeface.THIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DeliveryTypeface.MEDIUM.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DeliveryTypeface.BOLD.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DeliveryTypeface.HEAVY.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[TextMetaStyle.values().length];
        try {
            iArr3[TextMetaStyle.HeadlineTitle1.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[TextMetaStyle.HeadlineTitle2.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[TextMetaStyle.HeadlineTitle3.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[TextMetaStyle.HeadlineTitle4.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[TextMetaStyle.HeadlineTitle5.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        c = iArr3;
    }
}
