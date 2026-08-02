package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.base.js.bridge.ReportableStubDelegate;
import com.vk.superapp.common.js.bridge.api.events.AccelerometerStart$Parameters;
import com.vk.superapp.common.js.bridge.api.events.AccelerometerStop$Parameters;
import com.vk.superapp.common.js.bridge.api.events.Alert$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ConversionHit$Parameters;
import com.vk.superapp.common.js.bridge.api.events.CustomMessage$Parameters;
import com.vk.superapp.common.js.bridge.api.events.DeviceMotionStart$Parameters;
import com.vk.superapp.common.js.bridge.api.events.DeviceMotionStop$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ForceHideHints$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GetUserInfo$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GyroscopeStart$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GyroscopeStop$Parameters;
import com.vk.superapp.common.js.bridge.api.events.IsPasskeyAvailable$Parameters;
import com.vk.superapp.common.js.bridge.api.events.OpenApp$Parameters;
import com.vk.superapp.common.js.bridge.api.events.OpenCodeReader$Parameters;
import com.vk.superapp.common.js.bridge.api.events.OpenReportForm$Parameters;
import com.vk.superapp.common.js.bridge.api.events.RetargetingPixel$Parameters;
import com.vk.superapp.common.js.bridge.api.events.Scroll$Parameters;
import com.vk.superapp.common.js.bridge.api.events.SetLocation$Parameters;
import com.vk.superapp.common.js.bridge.api.events.Share$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ShowSlidesSheet$Parameters;
import com.vk.superapp.common.js.bridge.api.events.StorageGetKeys$Parameters;
import xsna.d3y;

/* compiled from: JsCommonDelegateStub.kt */
/* loaded from: classes6.dex */
public final class g3y extends ReportableStubDelegate implements d3y {
    public final com.vk.superapp.base.js.bridge.b b;

    public g3y(com.vk.superapp.base.js.bridge.b bVar) {
        this.b = bVar;
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final String B1() {
        return "common";
    }

    @Override // xsna.b3y
    public final void C0(p2y<Scroll$Parameters> p2yVar) {
        nq.a("VKWebAppScroll", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void D(p2y<OpenApp$Parameters> p2yVar) {
        nq.a("VKWebAppOpenApp", this, p2yVar);
    }

    @Override // xsna.d3y
    public final void D0(int i, String str) {
        C1("handleOpenCodeReaderResult(resultCode=" + i + ", qrString=" + str + ')');
    }

    @Override // xsna.b3y
    public final void E(p2y<GyroscopeStop$Parameters> p2yVar) {
        nq.a("VKWebAppGyroscopeStop", this, p2yVar);
    }

    @Override // xsna.d3y
    public final void G() {
        C1("sendOpenAppInvalidParamsError");
    }

    @Override // xsna.d3y
    public final void K() {
        C1("sendOpenAppSuccess");
    }

    @Override // xsna.b3y
    public final void M0(p2y<DeviceMotionStart$Parameters> p2yVar) {
        nq.a("VKWebAppDeviceMotionStart", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void P0(p2y<AccelerometerStop$Parameters> p2yVar) {
        nq.a("VKWebAppAccelerometerStop", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void R0(p2y<ForceHideHints$Parameters> p2yVar) {
        nq.a("VKWebAppForceHideHints", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void S0(p2y<GetUserInfo$Parameters> p2yVar) {
        nq.a("VKWebAppGetUserInfo", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void T(p2y<CustomMessage$Parameters> p2yVar) {
        nq.a("VKWebAppCustomMessage", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void V0(p2y<StorageGetKeys$Parameters> p2yVar) {
        nq.a("VKWebAppStorageGetKeys", this, p2yVar);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppAccelerometerChanged(String str) {
        d3y.a.VKWebAppAccelerometerChanged(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppAccelerometerStart(String str) {
        d3y.a.VKWebAppAccelerometerStart(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppAccelerometerStop(String str) {
        d3y.a.VKWebAppAccelerometerStop(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppAddToHomeScreen(String str) {
        d3y.a.VKWebAppAddToHomeScreen(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppAddToHomeScreenInfo(String str) {
        d3y.a.VKWebAppAddToHomeScreenInfo(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppAlert(String str) {
        d3y.a.VKWebAppAlert(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppCheckAllowedScopes(String str) {
        d3y.a.VKWebAppCheckAllowedScopes(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppConversionHit(String str) {
        d3y.a.VKWebAppConversionHit(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppCopyText(String str) {
        d3y.a.VKWebAppCopyText(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppCreateHash(String str) {
        d3y.a.VKWebAppCreateHash(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppCustomMessage(String str) {
        d3y.a.VKWebAppCustomMessage(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppDeviceMotionChanged(String str) {
        d3y.a.VKWebAppDeviceMotionChanged(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppDeviceMotionStart(String str) {
        d3y.a.VKWebAppDeviceMotionStart(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppDeviceMotionStop(String str) {
        d3y.a.VKWebAppDeviceMotionStop(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppDisableSwipeBack(String str) {
        d3y.a.VKWebAppDisableSwipeBack(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppDownloadFile(String str) {
        d3y.a.VKWebAppDownloadFile(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppEnableSwipeBack(String str) {
        d3y.a.VKWebAppEnableSwipeBack(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppFlashGetInfo(String str) {
        d3y.a.VKWebAppFlashGetInfo(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppFlashSetLevel(String str) {
        d3y.a.VKWebAppFlashSetLevel(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppForceHideHints(String str) {
        d3y.a.VKWebAppForceHideHints(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGetCommunityToken(String str) {
        d3y.a.VKWebAppGetCommunityToken(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGetEmail(String str) {
        d3y.a.VKWebAppGetEmail(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGetPersonalCard(String str) {
        d3y.a.VKWebAppGetPersonalCard(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGetPhoneNumber(String str) {
        d3y.a.VKWebAppGetPhoneNumber(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGetPurchaseBundles(String str) {
        d3y.a.VKWebAppGetPurchaseBundles(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGetUserInfo(String str) {
        d3y.a.VKWebAppGetUserInfo(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGyroscopeChanged(String str) {
        d3y.a.VKWebAppGyroscopeChanged(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGyroscopeStart(String str) {
        d3y.a.VKWebAppGyroscopeStart(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppGyroscopeStop(String str) {
        d3y.a.VKWebAppGyroscopeStop(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppIsPasskeyAvailable(String str) {
        d3y.a.VKWebAppIsPasskeyAvailable(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppKeepScreenOn(String str) {
        d3y.a.VKWebAppKeepScreenOn(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppLoadAds(String str) {
        d3y.a.VKWebAppLoadAds(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppOpenApp(String str) {
        d3y.a.VKWebAppOpenApp(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppOpenCodeReader(String str) {
        d3y.a.VKWebAppOpenCodeReader(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppOpenContacts(String str) {
        d3y.a.VKWebAppOpenContacts(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppOpenDebugSettings(String str) {
        d3y.a.VKWebAppOpenDebugSettings(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppOpenExternalLink(String str) {
        d3y.a.VKWebAppOpenExternalLink(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppOpenPayForm(String str) {
        d3y.a.VKWebAppOpenPayForm(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppOpenReportForm(String str) {
        d3y.a.VKWebAppOpenReportForm(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppRecommend(String str) {
        d3y.a.VKWebAppRecommend(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppRestoreInAppPurchases(String str) {
        d3y.a.VKWebAppRestoreInAppPurchases(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppRetargetingPixel(String str) {
        d3y.a.VKWebAppRetargetingPixel(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppScroll(String str) {
        d3y.a.VKWebAppScroll(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppSelectSbpBank(String str) {
        d3y.a.VKWebAppSelectSbpBank(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppSendPayload(String str) {
        d3y.a.VKWebAppSendPayload(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppSetLocation(String str) {
        d3y.a.VKWebAppSetLocation(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppSetPaymentToken(String str) {
        d3y.a.VKWebAppSetPaymentToken(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppShare(String str) {
        d3y.a.VKWebAppShare(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppShowActionMenu(String str) {
        d3y.a.VKWebAppShowActionMenu(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppShowImages(String str) {
        d3y.a.VKWebAppShowImages(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppShowLeaderBoardBox(String str) {
        d3y.a.VKWebAppShowLeaderBoardBox(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppShowRequestBox(String str) {
        d3y.a.VKWebAppShowRequestBox(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppShowSlidesSheet(String str) {
        d3y.a.VKWebAppShowSlidesSheet(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppStorageGetKeys(String str) {
        d3y.a.VKWebAppStorageGetKeys(this, str);
    }

    @Override // xsna.d3y, xsna.b3y
    @JavascriptInterface
    public void VKWebAppUsersSearch(String str) {
        d3y.a.VKWebAppUsersSearch(this, str);
    }

    @Override // xsna.b3y
    public final void Y(p2y<RetargetingPixel$Parameters> p2yVar) {
        nq.a("VKWebAppRetargetingPixel", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void a0(p2y<Alert$Parameters> p2yVar) {
        nq.a("VKWebAppAlert", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void d0(p2y<Share$Parameters> p2yVar) {
        nq.a("VKWebAppShare", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void f1(p2y<OpenCodeReader$Parameters> p2yVar) {
        nq.a("VKWebAppOpenCodeReader", this, p2yVar);
    }

    @Override // xsna.d3y
    public final void g0() {
        C1("sendOpenAppInactiveScreenError");
    }

    @Override // xsna.b3y
    public final void j0(p2y<GyroscopeStart$Parameters> p2yVar) {
        nq.a("VKWebAppGyroscopeStart", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void k0(p2y<OpenReportForm$Parameters> p2yVar) {
        nq.a("VKWebAppOpenReportForm", this, p2yVar);
    }

    @Override // xsna.d3y
    public final void l1() {
        C1("sendAppScreenshotTaken");
    }

    @Override // xsna.b3y
    public final void m0(p2y<ShowSlidesSheet$Parameters> p2yVar) {
        nq.a("VKWebAppShowSlidesSheet", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void n(p2y<IsPasskeyAvailable$Parameters> p2yVar) {
        nq.a("VKWebAppIsPasskeyAvailable", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void p1(p2y<SetLocation$Parameters> p2yVar) {
        nq.a("VKWebAppSetLocation", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void r0(p2y<DeviceMotionStop$Parameters> p2yVar) {
        nq.a("VKWebAppDeviceMotionStop", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void u0(p2y<AccelerometerStart$Parameters> p2yVar) {
        nq.a("VKWebAppAccelerometerStart", this, p2yVar);
    }

    @Override // xsna.b3y
    public final void v0(p2y<ConversionHit$Parameters> p2yVar) {
        nq.a("VKWebAppConversionHit", this, p2yVar);
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final com.vk.superapp.base.js.bridge.b z1() {
        return this.b;
    }

    @Override // xsna.npf0
    public final void release() {
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
    }
}
