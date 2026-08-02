package defpackage;

import com.ybsdk.feature.split.deposit.internal.data.network.dto.TransactionStatusResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class eka0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransactionStatusResponse.Status.values().length];
        try {
            iArr[TransactionStatusResponse.Status.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransactionStatusResponse.Status.CHALLENGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransactionStatusResponse.Status.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransactionStatusResponse.Status.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
