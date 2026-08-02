package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.bdui.action.finish.FinishFlowStatus;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class g3a0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FinishFlowStatus.values().length];
        try {
            iArr[FinishFlowStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FinishFlowStatus.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FinishFlowStatus.CANCEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FinishFlowStatus.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
