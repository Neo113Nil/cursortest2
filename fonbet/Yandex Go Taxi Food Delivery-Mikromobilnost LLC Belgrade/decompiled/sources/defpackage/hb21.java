package defpackage;

import com.yandex.fintechsdk.adapters.yb.sdk.api.upgradesplit.UpgradeSplitResult$Status;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class hb21 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UpgradeSplitResult$Status.values().length];
        try {
            iArr[UpgradeSplitResult$Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpgradeSplitResult$Status.CANCELED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UpgradeSplitResult$Status.INVALID_DEEPLINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UpgradeSplitResult$Status.FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
