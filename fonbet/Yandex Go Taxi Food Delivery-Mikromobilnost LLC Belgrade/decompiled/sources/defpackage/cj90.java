package defpackage;

import com.ybsdk.core.transfer.utils.TransferScenario;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class cj90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransferScenario.values().length];
        try {
            iArr[TransferScenario.CROSS_BORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
