package xsna;

import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;

/* compiled from: LibverifyListenerWrapper.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class i3z {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[VerificationController.State.values().length];
        try {
            iArr[VerificationController.State.ENTER_PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VerificationController.State.ENTER_SMS_CODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[VerificationApi.FailReason.values().length];
        try {
            iArr2[VerificationApi.FailReason.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[VerificationApi.FailReason.INCORRECT_PHONE_NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[VerificationApi.FailReason.UNSUPPORTED_NUMBER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[VerificationApi.FailReason.NO_NETWORK.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[VerificationApi.FailReason.NETWORK_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[VerificationApi.FailReason.RATELIMIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[VerificationApi.FailReason.GENERAL_ERROR.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[VerificationApi.FailReason.INCORRECT_SMS_CODE.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[VerificationApi.FailReason.NO_MORE_ROUTES.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
