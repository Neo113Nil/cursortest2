package defpackage;

import com.ybsdk.screens.registration.codeconfirmation.domain.interactors.CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class d9c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult.values().length];
        try {
            iArr[CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
