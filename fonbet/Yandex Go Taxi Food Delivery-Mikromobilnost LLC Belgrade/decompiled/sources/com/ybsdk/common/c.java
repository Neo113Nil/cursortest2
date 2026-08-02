package com.ybsdk.common;

import com.ybsdk.common.InternalSdkState;
import defpackage.w511;

/* loaded from: classes8.dex */
public abstract class c {
    public static final boolean a(InternalSdkState internalSdkState) {
        if ((internalSdkState instanceof InternalSdkState.Ok) || (internalSdkState instanceof InternalSdkState.YbRegistration) || (internalSdkState instanceof InternalSdkState.ApplicationStatusCheck) || (internalSdkState instanceof InternalSdkState.PinTokenClear) || (internalSdkState instanceof InternalSdkState.PinInput.PinTokenReissue) || (internalSdkState instanceof InternalSdkState.PinInput.PinTokenRetry) || (internalSdkState instanceof InternalSdkState.OpenProduct) || (internalSdkState instanceof InternalSdkState.SmsAuthorization) || (internalSdkState instanceof InternalSdkState.StartSessionDeeplink) || (internalSdkState instanceof InternalSdkState.Support)) {
            return true;
        }
        if (!(internalSdkState instanceof InternalSdkState.AccountUpgrade) && !(internalSdkState instanceof InternalSdkState.Error) && !(internalSdkState instanceof InternalSdkState.RequestNewAmToken) && !(internalSdkState instanceof InternalSdkState.Unauthenticated) && !(internalSdkState instanceof InternalSdkState.UpdateRequired)) {
            w511.b();
        }
        return false;
    }

    public static final String b(InternalSdkState internalSdkState) {
        if (internalSdkState instanceof InternalSdkState.AccountUpgrade) {
            return "AccountUpgrade";
        }
        if (internalSdkState instanceof InternalSdkState.ApplicationStatusCheck) {
            return "ApplicationStatusCheck";
        }
        if (internalSdkState instanceof InternalSdkState.YbRegistration) {
            return "BankRegistration";
        }
        if (internalSdkState instanceof InternalSdkState.Error) {
            return "Error";
        }
        if (internalSdkState instanceof InternalSdkState.Ok) {
            return "Ok";
        }
        if (internalSdkState instanceof InternalSdkState.OpenProduct) {
            return "OpenProduct";
        }
        if (internalSdkState instanceof InternalSdkState.PinTokenClear) {
            return "PinTokenClear";
        }
        if (internalSdkState instanceof InternalSdkState.PinInput.PinTokenReissue) {
            return "PinTokenReissue";
        }
        if (internalSdkState instanceof InternalSdkState.PinInput.PinTokenRetry) {
            return "PinTokenRetry";
        }
        if (internalSdkState instanceof InternalSdkState.RequestNewAmToken) {
            return "RequestNewAmToken";
        }
        if (internalSdkState instanceof InternalSdkState.SmsAuthorization) {
            return "SmsAuthorization";
        }
        if (internalSdkState instanceof InternalSdkState.Support) {
            return "Support";
        }
        if (internalSdkState instanceof InternalSdkState.Unauthenticated) {
            return "Unauthenticated";
        }
        if (internalSdkState instanceof InternalSdkState.UpdateRequired) {
            return "UpdateRequired";
        }
        if (internalSdkState instanceof InternalSdkState.StartSessionDeeplink) {
            return "StartSessionDeeplink";
        }
        w511.b();
        return null;
    }

    public static final String c(InternalSdkState internalSdkState) {
        if (internalSdkState instanceof InternalSdkState.Ok) {
            return ((InternalSdkState.Ok) internalSdkState).getStartLandingUrl();
        }
        if (internalSdkState instanceof InternalSdkState.YbRegistration) {
            return ((InternalSdkState.YbRegistration) internalSdkState).getStartLandingUrl();
        }
        if (internalSdkState instanceof InternalSdkState.OpenProduct) {
            return ((InternalSdkState.OpenProduct) internalSdkState).getStartLandingUrl();
        }
        if (!(internalSdkState instanceof InternalSdkState.Support) && !(internalSdkState instanceof InternalSdkState.SmsAuthorization) && !(internalSdkState instanceof InternalSdkState.StartSessionDeeplink) && !(internalSdkState instanceof InternalSdkState.AccountUpgrade) && !(internalSdkState instanceof InternalSdkState.ApplicationStatusCheck) && !(internalSdkState instanceof InternalSdkState.Error) && !(internalSdkState instanceof InternalSdkState.PinTokenClear) && !(internalSdkState instanceof InternalSdkState.PinInput.PinTokenReissue) && !(internalSdkState instanceof InternalSdkState.PinInput.PinTokenRetry) && !(internalSdkState instanceof InternalSdkState.RequestNewAmToken) && !(internalSdkState instanceof InternalSdkState.Unauthenticated) && !(internalSdkState instanceof InternalSdkState.UpdateRequired)) {
            w511.b();
        }
        return null;
    }

    public static final boolean d(InternalSdkState internalSdkState) {
        if ((internalSdkState instanceof InternalSdkState.Ok) || (internalSdkState instanceof InternalSdkState.StartSessionDeeplink)) {
            return true;
        }
        if (!(internalSdkState instanceof InternalSdkState.Support) && !(internalSdkState instanceof InternalSdkState.SmsAuthorization) && !(internalSdkState instanceof InternalSdkState.YbRegistration) && !(internalSdkState instanceof InternalSdkState.OpenProduct) && !(internalSdkState instanceof InternalSdkState.AccountUpgrade) && !(internalSdkState instanceof InternalSdkState.ApplicationStatusCheck) && !(internalSdkState instanceof InternalSdkState.Error) && !(internalSdkState instanceof InternalSdkState.PinTokenClear) && !(internalSdkState instanceof InternalSdkState.PinInput.PinTokenReissue) && !(internalSdkState instanceof InternalSdkState.PinInput.PinTokenRetry) && !(internalSdkState instanceof InternalSdkState.RequestNewAmToken) && !(internalSdkState instanceof InternalSdkState.Unauthenticated) && !(internalSdkState instanceof InternalSdkState.UpdateRequired)) {
            w511.b();
        }
        return false;
    }
}
