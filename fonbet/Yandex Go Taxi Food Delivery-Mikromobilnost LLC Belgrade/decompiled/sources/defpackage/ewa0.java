package defpackage;

import ru.yandex.taxi.perf.screen.PerformanceScreenName;
import ru.yandex.taxi.perf.screen.ScreenPerformanceState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ewa0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PerformanceScreenName.values().length];
        try {
            iArr[PerformanceScreenName.Summary.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PerformanceScreenName.TaxiMain.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PerformanceScreenName.Suggest.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PerformanceScreenName.TransportDiscovery.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PerformanceScreenName.BenefitsCenter.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[ScreenPerformanceState.values().length];
        try {
            iArr2[ScreenPerformanceState.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ScreenPerformanceState.FIRST_CONTENTFUL_PAINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ScreenPerformanceState.LARGEST_CONTENTFUL_PAINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ScreenPerformanceState.INTERRUPTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
    }
}
