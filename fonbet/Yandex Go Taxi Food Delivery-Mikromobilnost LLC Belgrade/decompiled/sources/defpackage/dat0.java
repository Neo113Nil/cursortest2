package defpackage;

import com.yandex.go.address_confirmation.api.TargetScreenAfterConfirmation;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class dat0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TargetScreenAfterConfirmation.values().length];
        try {
            iArr[TargetScreenAfterConfirmation.TAXI_MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TargetScreenAfterConfirmation.SUMMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
