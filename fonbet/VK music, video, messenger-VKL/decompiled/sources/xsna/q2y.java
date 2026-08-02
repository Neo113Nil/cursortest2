package xsna;

import android.webkit.JavascriptInterface;

/* compiled from: JsBrowserBridge.kt */
/* loaded from: classes6.dex */
public interface q2y extends m7y, j4y, z2y, h3y, o5y, e1y, y1y, l5y, s2y, i5y {
    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAccelerometerStart(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAccelerometerStop(String str);

    @Override // xsna.m7y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAddCard(String str);

    @Override // xsna.s2y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAddToChat(String str);

    @Override // xsna.h3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAddToCommunity(String str);

    @JavascriptInterface
    void VKWebAppAddToFavorites(String str);

    @JavascriptInterface
    void VKWebAppAddToHomeScreen(String str);

    @JavascriptInterface
    void VKWebAppAddToHomeScreenInfo(String str);

    @Override // xsna.h3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAllowMessagesFromGroup(String str);

    @Override // xsna.h3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAllowNotifications(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAskWorkoutsPermissions(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAuthByExchangeToken(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAuthPauseRequests(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAuthRestore(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAuthResumeRequests(String str);

    @JavascriptInterface
    void VKWebAppBecameInteractive(String str);

    @Override // xsna.m7y
    @JavascriptInterface
    /* synthetic */ void VKWebAppCanAddVirtualCard(String str);

    @JavascriptInterface
    void VKWebAppCanShowAltPayMethod(String str);

    @JavascriptInterface
    void VKWebAppCaptureProtection(String str);

    @JavascriptInterface
    void VKWebAppCheckAllowedScopes(String str);

    @Override // xsna.e1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppCheckBannerAd(String str);

    @Override // xsna.e1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppCheckNativeAds(String str);

    @JavascriptInterface
    void VKWebAppClose(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppConfirmUserByService(String str);

    @JavascriptInterface
    void VKWebAppConversionHit(String str);

    @JavascriptInterface
    void VKWebAppCopyText(String str);

    @JavascriptInterface
    void VKWebAppCreateHash(String str);

    @JavascriptInterface
    void VKWebAppCustomMessage(String str);

    @Override // xsna.h3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppDenyNotifications(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppDeviceMotionStart(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppDeviceMotionStop(String str);

    @JavascriptInterface
    void VKWebAppDownloadFile(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppFlashGetInfo(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppFlashSetLevel(String str);

    @JavascriptInterface
    void VKWebAppForceHideHints(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppForceLogout(String str);

    @Override // xsna.h3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetCommunityAuthToken(String str);

    @Override // xsna.h3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetCommunityToken(String str);

    @JavascriptInterface
    void VKWebAppGetConfig(String str);

    @Override // xsna.z2y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetEmail(String str);

    @JavascriptInterface
    void VKWebAppGetFriends(String str);

    @Override // xsna.i5y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetGeodata(String str);

    @Override // xsna.i5y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetGeodataPermission(String str);

    @JavascriptInterface
    void VKWebAppGetGrantedPermissions(String str);

    @Override // xsna.h3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetGroupInfo(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetHealthConnectInfo(String str);

    @JavascriptInterface
    void VKWebAppGetLaunchParams(String str);

    @Override // xsna.m7y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetMyTrackerId(String str);

    @JavascriptInterface
    void VKWebAppGetPermissions(String str);

    @JavascriptInterface
    void VKWebAppGetPersonalCard(String str);

    @Override // xsna.z2y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetPhoneNumber(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetRestoreHash(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetSteps(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetStepsPermissions(String str);

    @Override // xsna.z2y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetUserInfo(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetWorkouts(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetWorkoutsPermissions(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGyroscopeStart(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGyroscopeStop(String str);

    @Override // xsna.e1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppHideBannerAd(String str);

    @JavascriptInterface
    void VKWebAppInit(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppIsMultiaccountAvailable(String str);

    @Override // xsna.l5y
    @JavascriptInterface
    /* synthetic */ void VKWebAppIsNativePaymentEnabled(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppIsPasskeyAvailable(String str);

    @Override // xsna.h3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppJoinGroup(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppKeepScreenOn(String str);

    @Override // xsna.h3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppLeaveGroup(String str);

    @JavascriptInterface
    void VKWebAppLibverifyCancel(String str);

    @JavascriptInterface
    void VKWebAppLibverifyCheck(String str);

    @JavascriptInterface
    void VKWebAppLibverifyResend(String str);

    @JavascriptInterface
    void VKWebAppLibverifyStart(String str);

    @JavascriptInterface
    void VKWebAppLibverifySupported(String str);

    @JavascriptInterface
    void VKWebAppLocalStorageDelete(String str);

    @JavascriptInterface
    void VKWebAppLocalStorageGetMeta(String str);

    @JavascriptInterface
    void VKWebAppLocalStorageGetState(String str);

    @JavascriptInterface
    void VKWebAppLocalStorageRead(String str);

    @JavascriptInterface
    void VKWebAppLocalStorageWrite(String str);

    @JavascriptInterface
    void VKWebAppMakeInAppPurchase(String str);

    @JavascriptInterface
    void VKWebAppNavigateToSettings(String str);

    @JavascriptInterface
    void VKWebAppOpenApp(String str);

    @Override // xsna.o5y
    @JavascriptInterface
    /* synthetic */ void VKWebAppOpenCodeReader(String str);

    @JavascriptInterface
    /* synthetic */ void VKWebAppOpenContacts(String str);

    @Override // xsna.o5y
    @JavascriptInterface
    /* synthetic */ void VKWebAppOpenExternalLink(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppOpenMultiaccountSwitcher(String str);

    @Override // xsna.o5y
    @JavascriptInterface
    /* synthetic */ void VKWebAppOpenPackage(String str);

    @Override // xsna.m7y
    @JavascriptInterface
    /* synthetic */ void VKWebAppOpenPayForm(String str);

    @JavascriptInterface
    void VKWebAppOpenReportForm(String str);

    @JavascriptInterface
    void VKWebAppPrivacyEditSuccess(String str);

    @JavascriptInterface
    void VKWebAppRecommend(String str);

    @JavascriptInterface
    void VKWebAppRedirect(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppRegisterPasskey(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppRelatedPinCodeChanged(String str);

    @JavascriptInterface
    void VKWebAppResizeWindow(String str);

    @JavascriptInterface
    void VKWebAppRetargetingPixel(String str);

    @JavascriptInterface
    void VKWebAppSaveCredentials(String str);

    @Override // xsna.m7y
    @JavascriptInterface
    /* synthetic */ void VKWebAppSecureTokenGet(String str);

    @Override // xsna.m7y
    @JavascriptInterface
    /* synthetic */ void VKWebAppSecureTokenGetInfo(String str);

    @Override // xsna.m7y
    @JavascriptInterface
    /* synthetic */ void VKWebAppSecureTokenRemove(String str);

    @Override // xsna.m7y
    @JavascriptInterface
    /* synthetic */ void VKWebAppSecureTokenRequestAccess(String str);

    @Override // xsna.m7y
    @JavascriptInterface
    /* synthetic */ void VKWebAppSecureTokenSet(String str);

    @JavascriptInterface
    void VKWebAppSendCustomEvent(String str);

    @Override // xsna.h3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppSendPayload(String str);

    @Override // xsna.i5y
    @JavascriptInterface
    /* synthetic */ void VKWebAppSetLocation(String str);

    @JavascriptInterface
    void VKWebAppSetViewSettings(String str);

    @Override // xsna.o5y
    @JavascriptInterface
    /* synthetic */ void VKWebAppShare(String str);

    @JavascriptInterface
    void VKWebAppShowActionMenu(String str);

    @Override // xsna.e1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppShowBannerAd(String str);

    @Override // xsna.h3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppShowCommunityWidgetPreviewBox(String str);

    @JavascriptInterface
    void VKWebAppShowGoodOrderBox(String str);

    @Override // xsna.o5y
    @JavascriptInterface
    /* synthetic */ void VKWebAppShowImages(String str);

    @JavascriptInterface
    void VKWebAppShowInAppReviewDialog(String str);

    @Override // xsna.e1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppShowNativeAds(String str);

    @JavascriptInterface
    void VKWebAppShowNewPostBox(String str);

    @JavascriptInterface
    void VKWebAppShowOrderBox(String str);

    @Override // xsna.o5y
    @JavascriptInterface
    /* synthetic */ void VKWebAppShowQR(String str);

    @JavascriptInterface
    void VKWebAppShowSlidesSheet(String str);

    @JavascriptInterface
    void VKWebAppShowSubscriptionBox(String str);

    @Override // xsna.h3y
    @JavascriptInterface
    /* synthetic */ void VKWebAppShowWallPostBox(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppStopStepsPermissions(String str);

    @Override // xsna.z2y
    @JavascriptInterface
    /* synthetic */ void VKWebAppStorageGet(String str);

    @JavascriptInterface
    void VKWebAppStorageGetKeys(String str);

    @Override // xsna.z2y
    @JavascriptInterface
    /* synthetic */ void VKWebAppStorageSet(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppTapticImpactOccurred(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppTapticNotificationOccurred(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppTapticSelectionChanged(String str);

    @Override // xsna.j4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppTrackEvent(String str);

    @JavascriptInterface
    void VKWebAppTranslate(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppUserDeactivated(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppUsersSearch(String str);

    @JavascriptInterface
    void VKWebAppVKPayCheckout(String str);

    @Override // xsna.y1y
    @JavascriptInterface
    /* synthetic */ void VKWebAppValidatePhone(String str);

    @JavascriptInterface
    void VKWebAppVerifyUserByService(String str);

    @JavascriptInterface
    void VKWebAppVerifyUserServicesInfo(String str);

    @JavascriptInterface
    void VKWebAppVmojiUploadPhoto(String str);
}
