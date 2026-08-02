package defpackage;

import com.ybsdk.feature.kyc.internal.network.dto.SyncResponseStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class anx {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SyncResponseStatus.values().length];
        try {
            iArr[SyncResponseStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SyncResponseStatus.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
