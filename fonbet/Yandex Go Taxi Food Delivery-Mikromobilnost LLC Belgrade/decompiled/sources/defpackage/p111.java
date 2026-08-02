package defpackage;

import com.yandex.payment.sdk.flex.actions.FinishFlowActionHandler$FinishFlowStatus;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class p111 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FinishFlowActionHandler$FinishFlowStatus.values().length];
        try {
            iArr[FinishFlowActionHandler$FinishFlowStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FinishFlowActionHandler$FinishFlowStatus.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FinishFlowActionHandler$FinishFlowStatus.CANCEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FinishFlowActionHandler$FinishFlowStatus.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
