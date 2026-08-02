package defpackage;

import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ds51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransitionPolicyType.values().length];
        try {
            iArr[TransitionPolicyType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransitionPolicyType.POPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransitionPolicyType.BOTTOM_UP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransitionPolicyType.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
