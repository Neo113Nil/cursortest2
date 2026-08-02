package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.SuccessFlowScreen;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class l3v0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuccessFlowScreen.values().length];
        try {
            iArr[SuccessFlowScreen.UPSALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuccessFlowScreen.TOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuccessFlowScreen.FAMILY_INVITATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SuccessFlowScreen.CONTACTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SuccessFlowScreen.SUCCESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
