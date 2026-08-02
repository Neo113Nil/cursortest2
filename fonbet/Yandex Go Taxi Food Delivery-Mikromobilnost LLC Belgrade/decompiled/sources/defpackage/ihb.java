package defpackage;

import com.ybsdk.feature.pin.internal.domain.PinState;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ihb {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PinState.values().length];
        try {
            iArr[PinState.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[CheckType.values().length];
        try {
            iArr2[CheckType.ENTER_PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[CheckType.ENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[CheckType.VALIDATE_PIN_ON_RETURN.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CheckType.SET_BIOMETRY.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CheckType.CHANGE_PIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
