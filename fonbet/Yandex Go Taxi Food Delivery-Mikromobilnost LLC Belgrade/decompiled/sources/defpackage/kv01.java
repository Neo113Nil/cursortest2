package defpackage;

import com.ybsdk.rconfig.configs.TransfersDashboardTopButtonsType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class kv01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransfersDashboardTopButtonsType.values().length];
        try {
            iArr[TransfersDashboardTopButtonsType.NFC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransfersDashboardTopButtonsType.REVERSE_QR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
