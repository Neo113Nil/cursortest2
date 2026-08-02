package com.yandex.passport.sloth.command;

import com.yandex.passport.common.web.BridgeMethod;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BridgeMethod.values().length];
        try {
            iArr[BridgeMethod.Stub.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BridgeMethod.GetSms.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BridgeMethod.DebugOnlyGetVerificationHashForSms.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BridgeMethod.RequestMagicLinkParams.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BridgeMethod.GetPhoneRegionCode.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BridgeMethod.RequestSavedExperiments.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BridgeMethod.ShowDebugInfo.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[BridgeMethod.RequestPhoneNumberHint.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[BridgeMethod.Close.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[BridgeMethod.ChooseAccount.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[BridgeMethod.BeginChangePasswordFlow.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[BridgeMethod.PrimaryActionTriggered.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[BridgeMethod.DeletedAccountAuth.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[BridgeMethod.WebAuthNAvailability.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[BridgeMethod.GetEbsAgeConfirmState.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[BridgeMethod.Ready.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[BridgeMethod.RequestLoginCredentials.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[BridgeMethod.SaveLoginCredentials.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[BridgeMethod.SocialAuth.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[BridgeMethod.SamlSsoAuth.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[BridgeMethod.SendMetrics.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[BridgeMethod.StorePhoneNumber.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[BridgeMethod.GetCustomEulaStrings.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[BridgeMethod.SetPopupSize.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[BridgeMethod.GetXTokenClientId.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[BridgeMethod.GetOtp.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[BridgeMethod.FinishWithUrl.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[BridgeMethod.FinishWithItem.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[BridgeMethod.OpenExternalUrl.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[BridgeMethod.DeviceUnbinded.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[BridgeMethod.ItemClickCommand.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[BridgeMethod.PerformVibration.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[BridgeMethod.SetEbsAgeConfirmState.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[BridgeMethod.CreateNewProfile.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[BridgeMethod.SocialAction.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[BridgeMethod.WebAuthNAuth.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[BridgeMethod.WebAuthNRegister.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        a = iArr;
    }
}
