package defpackage;

import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationViewState$CodeState;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class h9c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CodeConfirmationViewState$CodeState.values().length];
        try {
            iArr[CodeConfirmationViewState$CodeState.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CodeConfirmationViewState$CodeState.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CodeConfirmationViewState$CodeState.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
