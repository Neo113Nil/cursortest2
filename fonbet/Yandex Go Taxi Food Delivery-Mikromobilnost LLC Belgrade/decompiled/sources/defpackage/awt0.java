package defpackage;

import com.ybsdk.screens.modal.SpoilerOnboardingBottomSheet;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class awt0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SpoilerOnboardingBottomSheet.ButtonAction.values().length];
        try {
            iArr[SpoilerOnboardingBottomSheet.ButtonAction.CLOSE_BOTTOM_SHEET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SpoilerOnboardingBottomSheet.ButtonAction.TURN_OFF_ONBOARDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
