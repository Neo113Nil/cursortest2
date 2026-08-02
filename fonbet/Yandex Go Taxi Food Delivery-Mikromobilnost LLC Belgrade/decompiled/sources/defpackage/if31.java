package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.model.OffersErrorReason;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class if31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OffersErrorReason.values().length];
        try {
            iArr[OffersErrorReason.TransportLoadingError.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OffersErrorReason.RouteStatsLoadingError.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OffersErrorReason.HubLoadingError.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
