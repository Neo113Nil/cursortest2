package defpackage;

import com.yandex.go.superapp.biometrics.data.models.BiometricsBleReceiverDisconnectReason;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class jy5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BiometricsBleReceiverDisconnectReason.values().length];
        try {
            iArr[BiometricsBleReceiverDisconnectReason.DeviceUnavailable.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BiometricsBleReceiverDisconnectReason.LongDistance.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BiometricsBleReceiverDisconnectReason.Timeout.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
