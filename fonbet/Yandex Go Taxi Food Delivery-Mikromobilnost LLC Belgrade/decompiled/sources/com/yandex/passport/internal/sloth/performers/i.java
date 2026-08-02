package com.yandex.passport.internal.sloth.performers;

import com.yandex.passport.common.web.BridgeMethod;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BridgeMethod.values().length];
        try {
            iArr[BridgeMethod.GetCustomEulaStrings.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BridgeMethod.GetOtp.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BridgeMethod.GetPhoneRegionCode.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BridgeMethod.GetSms.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BridgeMethod.DebugOnlyGetVerificationHashForSms.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BridgeMethod.GetXTokenClientId.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BridgeMethod.RequestLoginCredentials.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[BridgeMethod.RequestMagicLinkParams.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[BridgeMethod.RequestSavedExperiments.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[BridgeMethod.SaveLoginCredentials.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[BridgeMethod.WebAuthNAuth.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[BridgeMethod.WebAuthNRegister.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[BridgeMethod.WebAuthNAvailability.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        a = iArr;
    }
}
