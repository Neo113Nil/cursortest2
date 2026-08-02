package com.yandex.passport.internal.methods;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class f0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MethodRef.values().length];
        try {
            iArr[MethodRef.Echo.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MethodRef.GetAccountsList.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MethodRef.GetAccountByUid.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MethodRef.GetAccountByName.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MethodRef.GetAccountByMachineReadableLogin.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MethodRef.GetUidByNormalizedLogin.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[MethodRef.GetCurrentAccount.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[MethodRef.SetCurrentAccount.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[MethodRef.GetToken.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[MethodRef.DropAllTokensByUid.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[MethodRef.DropToken.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[MethodRef.StashValue.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[MethodRef.StashValueBatch.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[MethodRef.GetAuthorizationUrl.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[MethodRef.GetCodeByCookie.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[MethodRef.AuthorizeByCode.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[MethodRef.AuthorizeByCookie.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[MethodRef.GetCodeByUid.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[MethodRef.GetChildCodeByUidParent.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[MethodRef.TryAutoLogin.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[MethodRef.Logout.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[MethodRef.IsAutoLoginDisabled.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[MethodRef.SetAutoLoginDisabled.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[MethodRef.CorruptMasterToken.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[MethodRef.DowngradeAccount.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[MethodRef.RemoveLegacyExtraDataUid.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[MethodRef.AddAccount.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[MethodRef.RemoveAccount.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[MethodRef.OnPushMessageReceived.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[MethodRef.OnNewPushToken.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[MethodRef.GetDebugJSon.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[MethodRef.AuthorizeByUserCredentials.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[MethodRef.IsAutoLoginFromCredentialManagerDisabled.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[MethodRef.SetAutoLoginFromCredentialManagerDisabled.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[MethodRef.UpdatePersonProfile.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[MethodRef.GetPersonProfile.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[MethodRef.UpdateAvatar.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[MethodRef.GetDeviceCode.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[MethodRef.AcceptDeviceAuthorization.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[MethodRef.AuthorizeByDeviceCode.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[MethodRef.PerformSync.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[MethodRef.SendAuthToTrack.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[MethodRef.AuthorizeByTrackId.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[MethodRef.GetAccountManagementUrl.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[MethodRef.AcceptAuthInTrack.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[MethodRef.OverrideExperiments.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[MethodRef.GetAnonymizedUserInfo.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[MethodRef.GetTurboAppUserInfo.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[MethodRef.GetAccountUpgradeStatus.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr[MethodRef.OnAccountUpgradeDeclined.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr[MethodRef.AuthorizeByRawJson.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr[MethodRef.UploadDiary.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr[MethodRef.IsMasterTokenValid.ordinal()] = 53;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr[MethodRef.GetQrLink.ordinal()] = 54;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr[MethodRef.AuthByQrLink.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr[MethodRef.GetTrackPayload.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr[MethodRef.GetTrackFromMagic.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr[MethodRef.UpdateAuthCookie.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr[MethodRef.GetAuthCookie.ordinal()] = 59;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr[MethodRef.GetInvalideCookiesAndDeleteAuthCookie.ordinal()] = 60;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr[MethodRef.GetLocationId.ordinal()] = 61;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr[MethodRef.GetFlagCredentialManagerForAutoLogin.ordinal()] = 62;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr[MethodRef.UpdateProperties.ordinal()] = 63;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr[MethodRef.GetPushCode.ordinal()] = 64;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr[MethodRef.GetSilentPushConfig.ordinal()] = 65;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr[MethodRef.GetSavedPushPayload.ordinal()] = 66;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr[MethodRef.DeleteSavedPushPayload.ordinal()] = 67;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr[MethodRef.TryAddPlusDevice.ordinal()] = 68;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr[MethodRef.GetAvailableAccounts.ordinal()] = 69;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr[MethodRef.ProvidePushProviderSupportedPlatforms.ordinal()] = 70;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr[MethodRef.GetUserIdUrl.ordinal()] = 71;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr[MethodRef.GetOtpByTrack.ordinal()] = 72;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr[MethodRef.RemoveAccountExplicitly.ordinal()] = 73;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr[MethodRef.GetBooleanFlag.ordinal()] = 74;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr[MethodRef.ExecuteCheckVpnStatus.ordinal()] = 75;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr[MethodRef.OnAppBackgroundStateChanged.ordinal()] = 76;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr[MethodRef.SetVpnChallengeActivityDisabled.ordinal()] = 77;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr[MethodRef.GetAccountSubtitle.ordinal()] = 78;
        } catch (NoSuchFieldError unused78) {
        }
        a = iArr;
    }
}
