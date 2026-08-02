package defpackage;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class mg5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FinishFlowStatus.values().length];
        try {
            iArr[FinishFlowStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FinishFlowStatus.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FinishFlowStatus.FAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FinishFlowStatus.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
