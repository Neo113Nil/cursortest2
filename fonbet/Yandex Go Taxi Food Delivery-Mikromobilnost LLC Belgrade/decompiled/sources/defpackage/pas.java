package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayEnrollViewModel$ReturnToSbpStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class pas {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FpsPayEnrollViewModel$ReturnToSbpStatus.values().length];
        try {
            iArr[FpsPayEnrollViewModel$ReturnToSbpStatus.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FpsPayEnrollViewModel$ReturnToSbpStatus.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
