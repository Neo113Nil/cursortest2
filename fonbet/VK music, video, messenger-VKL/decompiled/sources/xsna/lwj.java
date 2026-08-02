package xsna;

import com.vk.editor.filters.correction.entity.CorrectionType;

/* compiled from: CorrectionItem.kt */
/* loaded from: classes18.dex */
public final class lwj {
    public final CorrectionType a;
    public float b;
    public boolean c = false;
    public boolean d;

    /* compiled from: CorrectionItem.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CorrectionType.values().length];
            try {
                iArr[CorrectionType.Exposition.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CorrectionType.Brightness.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CorrectionType.Contrast.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CorrectionType.Saturation.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CorrectionType.Heat.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CorrectionType.Shadow.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CorrectionType.Highlight.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CorrectionType.Sharpness.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CorrectionType.Grain.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CorrectionType.Blur.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lwj(CorrectionType correctionType, float f, boolean z) {
        this.a = correctionType;
        this.b = f;
        this.d = z;
    }
}
