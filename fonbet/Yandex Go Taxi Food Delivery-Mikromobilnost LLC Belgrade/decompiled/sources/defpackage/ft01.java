package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.TransferStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ft01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransferStatus.values().length];
        try {
            iArr[TransferStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferStatus.PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferStatus.TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
