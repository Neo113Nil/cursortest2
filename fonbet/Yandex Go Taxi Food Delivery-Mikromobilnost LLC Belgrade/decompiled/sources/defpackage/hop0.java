package defpackage;

import com.ybsdk.api.YBSdkScenarioResultReceiver$RegistrationResult;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class hop0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YBSdkScenarioResultReceiver$RegistrationResult.values().length];
        try {
            iArr[YBSdkScenarioResultReceiver$RegistrationResult.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YBSdkScenarioResultReceiver$RegistrationResult.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
