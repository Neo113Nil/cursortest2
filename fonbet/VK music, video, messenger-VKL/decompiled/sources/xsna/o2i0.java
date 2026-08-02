package xsna;

import androidx.compose.ui.window.SecureFlagPolicy;

/* compiled from: SecureFlagPolicy.android.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class o2i0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SecureFlagPolicy.values().length];
        try {
            iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
