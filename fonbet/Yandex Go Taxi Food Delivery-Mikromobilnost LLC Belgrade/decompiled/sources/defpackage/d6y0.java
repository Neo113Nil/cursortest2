package defpackage;

import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class d6y0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TaxiOrderSessionCheckpoint.values().length];
        try {
            iArr[TaxiOrderSessionCheckpoint.FCP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxiOrderSessionCheckpoint.LCP_DEFAULTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TaxiOrderSessionCheckpoint.LCP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
