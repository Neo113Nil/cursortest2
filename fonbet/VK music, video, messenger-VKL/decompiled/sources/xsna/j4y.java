package xsna;

import android.webkit.JavascriptInterface;

/* compiled from: JsHardwareBridge.kt */
/* loaded from: classes6.dex */
public interface j4y {
    @JavascriptInterface
    void VKWebAppAccelerometerStart(String str);

    @JavascriptInterface
    void VKWebAppAccelerometerStop(String str);

    @JavascriptInterface
    void VKWebAppAskWorkoutsPermissions(String str);

    @JavascriptInterface
    void VKWebAppDeviceMotionStart(String str);

    @JavascriptInterface
    void VKWebAppDeviceMotionStop(String str);

    @JavascriptInterface
    void VKWebAppFlashGetInfo(String str);

    @JavascriptInterface
    void VKWebAppFlashSetLevel(String str);

    @JavascriptInterface
    void VKWebAppGetHealthConnectInfo(String str);

    @JavascriptInterface
    void VKWebAppGetSteps(String str);

    @JavascriptInterface
    void VKWebAppGetStepsPermissions(String str);

    @JavascriptInterface
    void VKWebAppGetWorkouts(String str);

    @JavascriptInterface
    void VKWebAppGetWorkoutsPermissions(String str);

    @JavascriptInterface
    void VKWebAppGyroscopeStart(String str);

    @JavascriptInterface
    void VKWebAppGyroscopeStop(String str);

    @JavascriptInterface
    void VKWebAppKeepScreenOn(String str);

    @JavascriptInterface
    void VKWebAppStopStepsPermissions(String str);

    @JavascriptInterface
    void VKWebAppTapticImpactOccurred(String str);

    @JavascriptInterface
    void VKWebAppTapticNotificationOccurred(String str);

    @JavascriptInterface
    void VKWebAppTapticSelectionChanged(String str);

    @JavascriptInterface
    void VKWebAppTrackEvent(String str);
}
