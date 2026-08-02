package defpackage;

import ru.yandex.taxi.surge.models.dto.ButtonStyle;
import ru.yandex.taxi.surge.models.dto.DetailedPriceContent;
import ru.yandex.taxi.surge.models.dto.SelectorStyle;
import ru.yandex.taxi.surge.models.dto.SurgeButtonActionDto$ActionButtonStyle;
import ru.yandex.taxi.surge.models.dto.SurgeInfoItem$ActionButtonsContent;
import ru.yandex.taxi.surge.models.dto.TextBlockSize;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ktw0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[TextBlockSize.values().length];
        try {
            iArr[TextBlockSize.EXTRA_SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextBlockSize.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextBlockSize.MEDIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TextBlockSize.LARGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TextBlockSize.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[SelectorStyle.values().length];
        try {
            iArr2[SelectorStyle.ACCENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SelectorStyle.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SelectorStyle.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[ButtonStyle.values().length];
        try {
            iArr3[ButtonStyle.ACCENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[ButtonStyle.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[ButtonStyle.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        c = iArr3;
        int[] iArr4 = new int[DetailedPriceContent.DetailedPriceItem.DividerType.values().length];
        try {
            iArr4[DetailedPriceContent.DetailedPriceItem.DividerType.LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[DetailedPriceContent.DetailedPriceItem.DividerType.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        d = iArr4;
        int[] iArr5 = new int[SurgeButtonActionDto$ActionButtonStyle.values().length];
        try {
            iArr5[SurgeButtonActionDto$ActionButtonStyle.ACCENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr5[SurgeButtonActionDto$ActionButtonStyle.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        e = iArr5;
        int[] iArr6 = new int[SurgeInfoItem$ActionButtonsContent.ButtonsOrientation.values().length];
        try {
            iArr6[SurgeInfoItem$ActionButtonsContent.ButtonsOrientation.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr6[SurgeInfoItem$ActionButtonsContent.ButtonsOrientation.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        f = iArr6;
    }
}
