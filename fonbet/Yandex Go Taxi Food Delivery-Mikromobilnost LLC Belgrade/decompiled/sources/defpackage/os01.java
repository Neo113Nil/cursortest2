package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.TransferType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class os01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransferType.values().length];
        try {
            iArr[TransferType.C2C.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferType.ME2ME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
