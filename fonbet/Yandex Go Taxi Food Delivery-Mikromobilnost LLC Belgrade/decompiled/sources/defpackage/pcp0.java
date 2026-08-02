package defpackage;

import ru.yandex.taxi.perf.screen.PerformanceScreenName;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class pcp0 {
    public static final /* synthetic */ int[] a;

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
    }
}
