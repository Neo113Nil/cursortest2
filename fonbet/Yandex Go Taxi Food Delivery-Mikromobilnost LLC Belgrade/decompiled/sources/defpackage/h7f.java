package defpackage;

import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinState$PinStatusType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class h7f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CreatePinState$PinStatusType.values().length];
        try {
            iArr[CreatePinState$PinStatusType.IssuePinError.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CreatePinState$PinStatusType.TooManyAttempts.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CreatePinState$PinStatusType.None.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CreatePinState$PinStatusType.PinSetup.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
