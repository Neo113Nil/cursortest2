package defpackage;

import com.ybsdk.feature.transfer.api.TransfersResultReceiver$Result;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class li01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransfersResultReceiver$Result.values().length];
        try {
            iArr[TransfersResultReceiver$Result.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransfersResultReceiver$Result.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransfersResultReceiver$Result.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
