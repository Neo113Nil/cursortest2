package defpackage;

import ru.yandex.taxi.perf.screen.ElementPerformanceState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class bwa0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ElementPerformanceState.values().length];
        try {
            iArr[ElementPerformanceState.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ElementPerformanceState.FIRST_CONTENTFUL_PAINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ElementPerformanceState.LARGEST_CONTENTFUL_PAINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
