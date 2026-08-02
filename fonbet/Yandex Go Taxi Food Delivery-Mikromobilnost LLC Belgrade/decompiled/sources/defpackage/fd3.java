package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.ATImagePropertyDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.ATTextPropertyDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.TextDecorationLineThroughDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class fd3 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;

    static {
        int[] iArr = new int[AttributedTextDto.TruncationModeDto.values().length];
        try {
            iArr[AttributedTextDto.TruncationModeDto.HEAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AttributedTextDto.TruncationModeDto.TAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AttributedTextDto.TruncationModeDto.MIDDLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[TextDecorationLineThroughDto.StyleDto.values().length];
        try {
            iArr2[TextDecorationLineThroughDto.StyleDto.DIAGONALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TextDecorationLineThroughDto.StyleDto.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[ATTextPropertyDto.FontWeightDto.values().length];
        try {
            iArr3[ATTextPropertyDto.FontWeightDto.BOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[ATTextPropertyDto.FontWeightDto.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[ATTextPropertyDto.FontWeightDto.MEDIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[ATTextPropertyDto.FontWeightDto.REGULAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[ATTextPropertyDto.FontWeightDto.DISPLAY_HEAVY.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
        int[] iArr4 = new int[ATTextPropertyDto.FontStyleDto.values().length];
        try {
            iArr4[ATTextPropertyDto.FontStyleDto.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[ATTextPropertyDto.FontStyleDto.ITALIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
        int[] iArr5 = new int[ATTextPropertyDto.TextDecorationDto.values().length];
        try {
            iArr5[ATTextPropertyDto.TextDecorationDto.UNDERLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr5[ATTextPropertyDto.TextDecorationDto.LINE_THROUGH.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        e = iArr5;
        int[] iArr6 = new int[ATImagePropertyDto.VerticalAlignmentDto.values().length];
        try {
            iArr6[ATImagePropertyDto.VerticalAlignmentDto.BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr6[ATImagePropertyDto.VerticalAlignmentDto.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr6[ATImagePropertyDto.VerticalAlignmentDto.BASELINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        f = iArr6;
        int[] iArr7 = new int[ATTextPropertyDto.MetaStyleDto.values().length];
        try {
            iArr7[ATTextPropertyDto.MetaStyleDto.HEADLINE_TITLE_1.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr7[ATTextPropertyDto.MetaStyleDto.HEADLINE_TITLE_2.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr7[ATTextPropertyDto.MetaStyleDto.HEADLINE_TITLE_3.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr7[ATTextPropertyDto.MetaStyleDto.HEADLINE_TITLE_4.ordinal()] = 4;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr7[ATTextPropertyDto.MetaStyleDto.HEADLINE_TITLE_5.ordinal()] = 5;
        } catch (NoSuchFieldError unused22) {
        }
        g = iArr7;
    }
}
