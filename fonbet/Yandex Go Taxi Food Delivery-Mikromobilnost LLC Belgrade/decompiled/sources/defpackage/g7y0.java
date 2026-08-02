package defpackage;

import com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingViewDelegate$Type;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class g7y0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TaxiOrderTrackingViewDelegate$Type.values().length];
        try {
            iArr[TaxiOrderTrackingViewDelegate$Type.FEED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxiOrderTrackingViewDelegate$Type.TARIFF_SELECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TaxiOrderTrackingViewDelegate$Type.MULTIMODAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TaxiOrderTrackingViewDelegate$Type.EMPTY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
