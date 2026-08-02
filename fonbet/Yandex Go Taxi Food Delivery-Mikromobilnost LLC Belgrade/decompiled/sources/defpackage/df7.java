package defpackage;

import com.ybsdk.widgets.common.rangedatepicker.DayState;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class df7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DayState.values().length];
        try {
            iArr[DayState.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DayState.TODAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DayState.IN_RANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DayState.SINGLE_SELECTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DayState.RANGE_START.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DayState.RANGE_END.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
