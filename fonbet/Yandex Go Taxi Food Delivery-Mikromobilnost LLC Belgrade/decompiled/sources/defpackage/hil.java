package defpackage;

import com.yandex.div2.DivAnimation$Name;
import com.yandex.div2.DivTooltip$Position;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class hil {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DivAnimation$Name.values().length];
        try {
            iArr[DivAnimation$Name.FADE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivAnimation$Name.TRANSLATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivAnimation$Name.SCALE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DivAnimation$Name.SET.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DivAnimation$Name.NATIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DivAnimation$Name.NO_ANIMATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[DivTooltip$Position.values().length];
        try {
            iArr2[DivTooltip$Position.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DivTooltip$Position.LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DivTooltip$Position.BOTTOM_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[DivTooltip$Position.TOP_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[DivTooltip$Position.RIGHT.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[DivTooltip$Position.BOTTOM_RIGHT.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[DivTooltip$Position.CENTER.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[DivTooltip$Position.TOP.ordinal()] = 8;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[DivTooltip$Position.BOTTOM.ordinal()] = 9;
        } catch (NoSuchFieldError unused15) {
        }
        b = iArr2;
    }
}
