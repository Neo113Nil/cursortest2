package com.yandex.passport.sloth.command;

import com.yandex.passport.common.web.BridgeMethod;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class n {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BridgeMethod.values().length];
        try {
            iArr[BridgeMethod.Stub.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BridgeMethod.Ready.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BridgeMethod.Close.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BridgeMethod.SendMetrics.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BridgeMethod.ShowDebugInfo.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BridgeMethod.SocialAuth.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BridgeMethod.ChooseAccount.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[BridgeMethod.SamlSsoAuth.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[BridgeMethod.RequestPhoneNumberHint.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[BridgeMethod.StorePhoneNumber.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[BridgeMethod.FinishWithUrl.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[BridgeMethod.DeletedAccountAuth.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[BridgeMethod.OpenExternalUrl.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[BridgeMethod.DeviceUnbinded.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[BridgeMethod.PerformVibration.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[BridgeMethod.GetEbsAgeConfirmState.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[BridgeMethod.SetEbsAgeConfirmState.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[BridgeMethod.CreateNewProfile.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[BridgeMethod.SocialAction.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[BridgeMethod.SetPopupSize.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        a = iArr;
    }
}
