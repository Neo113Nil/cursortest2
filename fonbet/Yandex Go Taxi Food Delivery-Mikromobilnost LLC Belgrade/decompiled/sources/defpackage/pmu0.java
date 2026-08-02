package defpackage;

import com.ybsdk.core.stories.LocalImageEnum;
import com.ybsdk.core.stories.dto.HorizontalAlignment;
import com.ybsdk.core.stories.dto.ImageMode;
import com.ybsdk.core.stories.dto.StoryItemMode;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class pmu0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[StoryItemMode.values().length];
        try {
            iArr[StoryItemMode.DIVKIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StoryItemMode.FULL_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[HorizontalAlignment.values().length];
        try {
            iArr2[HorizontalAlignment.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[HorizontalAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[HorizontalAlignment.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[ImageMode.values().length];
        try {
            iArr3[ImageMode.LOCAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[ImageMode.REMOTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
        int[] iArr4 = new int[LocalImageEnum.values().length];
        try {
            iArr4[LocalImageEnum.YA_PAY_BRANDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[LocalImageEnum.CARD_MIR.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[LocalImageEnum.POS_TERMINAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[LocalImageEnum.YA_PAY_CASHBACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[LocalImageEnum.SPLIT_BOX.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
    }
}
