package defpackage;

import just.adapter.scroll.ScrollDirection;
import just.adapter.snapping.IntervalType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class m1t0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ScrollDirection.values().length];
        try {
            iArr[ScrollDirection.DECREASING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScrollDirection.IGNORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScrollDirection.INCREASING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[IntervalType.values().length];
        try {
            iArr2[IntervalType.RELATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[IntervalType.ABSOLUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
