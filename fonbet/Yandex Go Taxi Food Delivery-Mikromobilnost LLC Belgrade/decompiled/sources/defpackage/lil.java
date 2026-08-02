package defpackage;

import com.yandex.div2.DivTooltip$Position;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class lil {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivTooltip$Position.values().length];
        try {
            iArr[DivTooltip$Position.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivTooltip$Position.TOP_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivTooltip$Position.BOTTOM_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DivTooltip$Position.TOP_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DivTooltip$Position.RIGHT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DivTooltip$Position.BOTTOM_RIGHT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DivTooltip$Position.TOP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[DivTooltip$Position.BOTTOM.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[DivTooltip$Position.CENTER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
