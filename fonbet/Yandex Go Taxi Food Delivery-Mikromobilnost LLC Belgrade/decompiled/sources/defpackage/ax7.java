package defpackage;

import com.yandex.go.taxi.order.cancel.reasons.analytics.CancelReasonsAnalytics$CloseReason;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ax7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CancelReasonsAnalytics$CloseReason.values().length];
        try {
            iArr[CancelReasonsAnalytics$CloseReason.ROLL_OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CancelReasonsAnalytics$CloseReason.DONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CancelReasonsAnalytics$CloseReason.OTHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
