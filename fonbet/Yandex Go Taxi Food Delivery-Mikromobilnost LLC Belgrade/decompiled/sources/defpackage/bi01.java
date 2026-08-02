package defpackage;

import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class bi01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TransferMainResultScreenParams.Scenario.values().length];
        try {
            iArr[TransferMainResultScreenParams.Scenario.ME2ME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferMainResultScreenParams.Scenario.SELF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferMainResultScreenParams.Scenario.MKK_CASHOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[TransferDirection.values().length];
        try {
            iArr2[TransferDirection.TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TransferDirection.TOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
