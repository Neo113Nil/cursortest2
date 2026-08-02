package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.superapp.common.js.bridge.api.events.AccelerometerStart$Parameters;
import com.vk.superapp.common.js.bridge.api.events.AccelerometerStop$Parameters;
import com.vk.superapp.common.js.bridge.api.events.AddToHomeScreen$Parameters;
import com.vk.superapp.common.js.bridge.api.events.AddToHomeScreenInfo$Parameters;
import com.vk.superapp.common.js.bridge.api.events.Alert$Parameters;
import com.vk.superapp.common.js.bridge.api.events.CheckAllowedScopes$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ConversionHit$Parameters;
import com.vk.superapp.common.js.bridge.api.events.CopyText$Parameters;
import com.vk.superapp.common.js.bridge.api.events.CreateHash$Parameters;
import com.vk.superapp.common.js.bridge.api.events.CustomMessage$Parameters;
import com.vk.superapp.common.js.bridge.api.events.DeviceMotionStart$Parameters;
import com.vk.superapp.common.js.bridge.api.events.DeviceMotionStop$Parameters;
import com.vk.superapp.common.js.bridge.api.events.DisableSwipeBack$Parameters;
import com.vk.superapp.common.js.bridge.api.events.DownloadFile$Parameters;
import com.vk.superapp.common.js.bridge.api.events.EnableSwipeBack$Parameters;
import com.vk.superapp.common.js.bridge.api.events.FlashGetInfo$Parameters;
import com.vk.superapp.common.js.bridge.api.events.FlashSetLevel$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ForceHideHints$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GetCommunityToken$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GetEmail$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GetPersonalCard$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GetPhoneNumber$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GetPurchaseBundles$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GetUserInfo$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GyroscopeStart$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GyroscopeStop$Parameters;
import com.vk.superapp.common.js.bridge.api.events.IsPasskeyAvailable$Parameters;
import com.vk.superapp.common.js.bridge.api.events.KeepScreenOn$Parameters;
import com.vk.superapp.common.js.bridge.api.events.LoadAds$Parameters;
import com.vk.superapp.common.js.bridge.api.events.OpenApp$Parameters;
import com.vk.superapp.common.js.bridge.api.events.OpenCodeReader$Parameters;
import com.vk.superapp.common.js.bridge.api.events.OpenContacts$Parameters;
import com.vk.superapp.common.js.bridge.api.events.OpenDebugSettings$Parameters;
import com.vk.superapp.common.js.bridge.api.events.OpenExternalLink$Parameters;
import com.vk.superapp.common.js.bridge.api.events.OpenPayForm$Parameters;
import com.vk.superapp.common.js.bridge.api.events.OpenReportForm$Parameters;
import com.vk.superapp.common.js.bridge.api.events.Recommend$Parameters;
import com.vk.superapp.common.js.bridge.api.events.RestoreInAppPurchases$Parameters;
import com.vk.superapp.common.js.bridge.api.events.RetargetingPixel$Parameters;
import com.vk.superapp.common.js.bridge.api.events.Scroll$Parameters;
import com.vk.superapp.common.js.bridge.api.events.SelectSbpBank$Parameters;
import com.vk.superapp.common.js.bridge.api.events.SendPayload$Parameters;
import com.vk.superapp.common.js.bridge.api.events.SetLocation$Parameters;
import com.vk.superapp.common.js.bridge.api.events.SetPaymentToken$Parameters;
import com.vk.superapp.common.js.bridge.api.events.Share$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ShowActionMenu$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ShowImages$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ShowLeaderBoardBox$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ShowRequestBox$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ShowSlidesSheet$Parameters;
import com.vk.superapp.common.js.bridge.api.events.StorageGetKeys$Parameters;
import com.vk.superapp.common.js.bridge.api.events.UsersSearch$Parameters;
import xsna.p2y;

/* compiled from: JsCommonBridge.kt */
/* loaded from: classes6.dex */
public interface b3y {
    void C0(p2y<Scroll$Parameters> p2yVar);

    void D(p2y<OpenApp$Parameters> p2yVar);

    void E(p2y<GyroscopeStop$Parameters> p2yVar);

    void M0(p2y<DeviceMotionStart$Parameters> p2yVar);

    void P0(p2y<AccelerometerStop$Parameters> p2yVar);

    void R0(p2y<ForceHideHints$Parameters> p2yVar);

    void S0(p2y<GetUserInfo$Parameters> p2yVar);

    void T(p2y<CustomMessage$Parameters> p2yVar);

    void V0(p2y<StorageGetKeys$Parameters> p2yVar);

    @JavascriptInterface
    void VKWebAppAccelerometerChanged(String str);

    @JavascriptInterface
    void VKWebAppAccelerometerStart(String str);

    @JavascriptInterface
    void VKWebAppAccelerometerStop(String str);

    @JavascriptInterface
    void VKWebAppAddToHomeScreen(String str);

    @JavascriptInterface
    void VKWebAppAddToHomeScreenInfo(String str);

    @JavascriptInterface
    void VKWebAppAlert(String str);

    @JavascriptInterface
    void VKWebAppCheckAllowedScopes(String str);

    @JavascriptInterface
    void VKWebAppConversionHit(String str);

    @JavascriptInterface
    void VKWebAppCopyText(String str);

    @JavascriptInterface
    void VKWebAppCreateHash(String str);

    @JavascriptInterface
    void VKWebAppCustomMessage(String str);

    @JavascriptInterface
    void VKWebAppDeviceMotionChanged(String str);

    @JavascriptInterface
    void VKWebAppDeviceMotionStart(String str);

    @JavascriptInterface
    void VKWebAppDeviceMotionStop(String str);

    @JavascriptInterface
    void VKWebAppDisableSwipeBack(String str);

    @JavascriptInterface
    void VKWebAppDownloadFile(String str);

    @JavascriptInterface
    void VKWebAppEnableSwipeBack(String str);

    @JavascriptInterface
    void VKWebAppFlashGetInfo(String str);

    @JavascriptInterface
    void VKWebAppFlashSetLevel(String str);

    @JavascriptInterface
    void VKWebAppForceHideHints(String str);

    @JavascriptInterface
    void VKWebAppGetCommunityToken(String str);

    @JavascriptInterface
    void VKWebAppGetEmail(String str);

    @JavascriptInterface
    void VKWebAppGetPersonalCard(String str);

    @JavascriptInterface
    void VKWebAppGetPhoneNumber(String str);

    @JavascriptInterface
    void VKWebAppGetPurchaseBundles(String str);

    @JavascriptInterface
    void VKWebAppGetUserInfo(String str);

    @JavascriptInterface
    void VKWebAppGyroscopeChanged(String str);

    @JavascriptInterface
    void VKWebAppGyroscopeStart(String str);

    @JavascriptInterface
    void VKWebAppGyroscopeStop(String str);

    @JavascriptInterface
    void VKWebAppIsPasskeyAvailable(String str);

    @JavascriptInterface
    void VKWebAppKeepScreenOn(String str);

    @JavascriptInterface
    void VKWebAppLoadAds(String str);

    @JavascriptInterface
    void VKWebAppOpenApp(String str);

    @JavascriptInterface
    void VKWebAppOpenCodeReader(String str);

    @JavascriptInterface
    void VKWebAppOpenContacts(String str);

    @JavascriptInterface
    void VKWebAppOpenDebugSettings(String str);

    @JavascriptInterface
    void VKWebAppOpenExternalLink(String str);

    @JavascriptInterface
    void VKWebAppOpenPayForm(String str);

    @JavascriptInterface
    void VKWebAppOpenReportForm(String str);

    @JavascriptInterface
    void VKWebAppRecommend(String str);

    @JavascriptInterface
    void VKWebAppRestoreInAppPurchases(String str);

    @JavascriptInterface
    void VKWebAppRetargetingPixel(String str);

    @JavascriptInterface
    void VKWebAppScroll(String str);

    @JavascriptInterface
    void VKWebAppSelectSbpBank(String str);

    @JavascriptInterface
    void VKWebAppSendPayload(String str);

    @JavascriptInterface
    void VKWebAppSetLocation(String str);

    @JavascriptInterface
    void VKWebAppSetPaymentToken(String str);

    @JavascriptInterface
    void VKWebAppShare(String str);

    @JavascriptInterface
    void VKWebAppShowActionMenu(String str);

    @JavascriptInterface
    void VKWebAppShowImages(String str);

    @JavascriptInterface
    void VKWebAppShowLeaderBoardBox(String str);

    @JavascriptInterface
    void VKWebAppShowRequestBox(String str);

    @JavascriptInterface
    void VKWebAppShowSlidesSheet(String str);

    @JavascriptInterface
    void VKWebAppStorageGetKeys(String str);

    @JavascriptInterface
    void VKWebAppUsersSearch(String str);

    void Y(p2y<RetargetingPixel$Parameters> p2yVar);

    void a0(p2y<Alert$Parameters> p2yVar);

    void d0(p2y<Share$Parameters> p2yVar);

    void f1(p2y<OpenCodeReader$Parameters> p2yVar);

    void j0(p2y<GyroscopeStart$Parameters> p2yVar);

    void k0(p2y<OpenReportForm$Parameters> p2yVar);

    void m0(p2y<ShowSlidesSheet$Parameters> p2yVar);

    void n(p2y<IsPasskeyAvailable$Parameters> p2yVar);

    void p1(p2y<SetLocation$Parameters> p2yVar);

    void r0(p2y<DeviceMotionStop$Parameters> p2yVar);

    void u0(p2y<AccelerometerStart$Parameters> p2yVar);

    void v0(p2y<ConversionHit$Parameters> p2yVar);

    /* compiled from: JsCommonBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppAccelerometerStart(b3y b3yVar, String str) {
            try {
                AccelerometerStart$Parameters a = AccelerometerStart$Parameters.a((AccelerometerStart$Parameters) new Gson().fromJson(str, AccelerometerStart$Parameters.class));
                AccelerometerStart$Parameters.c(a);
                AccelerometerStart$Parameters.b(a);
                b3yVar.u0(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.u0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppAccelerometerStop(b3y b3yVar, String str) {
            try {
                AccelerometerStop$Parameters a = AccelerometerStop$Parameters.a((AccelerometerStop$Parameters) new Gson().fromJson(str, AccelerometerStop$Parameters.class));
                AccelerometerStop$Parameters.b(a);
                b3yVar.P0(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.P0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppAddToHomeScreen(b3y b3yVar, String str) {
            try {
                AddToHomeScreen$Parameters.b(AddToHomeScreen$Parameters.a((AddToHomeScreen$Parameters) new Gson().fromJson(str, AddToHomeScreen$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppAddToHomeScreenInfo(b3y b3yVar, String str) {
            try {
                AddToHomeScreenInfo$Parameters.b(AddToHomeScreenInfo$Parameters.a((AddToHomeScreenInfo$Parameters) new Gson().fromJson(str, AddToHomeScreenInfo$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppAlert(b3y b3yVar, String str) {
            try {
                Alert$Parameters a = Alert$Parameters.a((Alert$Parameters) new Gson().fromJson(str, Alert$Parameters.class));
                Alert$Parameters.b(a);
                b3yVar.a0(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.a0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppCheckAllowedScopes(b3y b3yVar, String str) {
            try {
                CheckAllowedScopes$Parameters.b(CheckAllowedScopes$Parameters.a((CheckAllowedScopes$Parameters) new Gson().fromJson(str, CheckAllowedScopes$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppConversionHit(b3y b3yVar, String str) {
            try {
                ConversionHit$Parameters a = ConversionHit$Parameters.a((ConversionHit$Parameters) new Gson().fromJson(str, ConversionHit$Parameters.class));
                ConversionHit$Parameters.b(a);
                b3yVar.v0(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.v0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppCopyText(b3y b3yVar, String str) {
            try {
                CopyText$Parameters.b(CopyText$Parameters.a((CopyText$Parameters) new Gson().fromJson(str, CopyText$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppCreateHash(b3y b3yVar, String str) {
            try {
                CreateHash$Parameters.b(CreateHash$Parameters.a((CreateHash$Parameters) new Gson().fromJson(str, CreateHash$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppCustomMessage(b3y b3yVar, String str) {
            try {
                CustomMessage$Parameters a = CustomMessage$Parameters.a((CustomMessage$Parameters) new Gson().fromJson(str, CustomMessage$Parameters.class));
                CustomMessage$Parameters.b(a);
                b3yVar.T(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.T(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppDeviceMotionStart(b3y b3yVar, String str) {
            try {
                DeviceMotionStart$Parameters a = DeviceMotionStart$Parameters.a((DeviceMotionStart$Parameters) new Gson().fromJson(str, DeviceMotionStart$Parameters.class));
                DeviceMotionStart$Parameters.c(a);
                DeviceMotionStart$Parameters.b(a);
                b3yVar.M0(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.M0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppDeviceMotionStop(b3y b3yVar, String str) {
            try {
                DeviceMotionStop$Parameters a = DeviceMotionStop$Parameters.a((DeviceMotionStop$Parameters) new Gson().fromJson(str, DeviceMotionStop$Parameters.class));
                DeviceMotionStop$Parameters.b(a);
                b3yVar.r0(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.r0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppDisableSwipeBack(b3y b3yVar, String str) {
            try {
                DisableSwipeBack$Parameters.b(DisableSwipeBack$Parameters.a((DisableSwipeBack$Parameters) new Gson().fromJson(str, DisableSwipeBack$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppDownloadFile(b3y b3yVar, String str) {
            try {
                DownloadFile$Parameters.b(DownloadFile$Parameters.a((DownloadFile$Parameters) new Gson().fromJson(str, DownloadFile$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppEnableSwipeBack(b3y b3yVar, String str) {
            try {
                EnableSwipeBack$Parameters.b(EnableSwipeBack$Parameters.a((EnableSwipeBack$Parameters) new Gson().fromJson(str, EnableSwipeBack$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppFlashGetInfo(b3y b3yVar, String str) {
            try {
                FlashGetInfo$Parameters.b(FlashGetInfo$Parameters.a((FlashGetInfo$Parameters) new Gson().fromJson(str, FlashGetInfo$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppFlashSetLevel(b3y b3yVar, String str) {
            try {
                FlashSetLevel$Parameters a = FlashSetLevel$Parameters.a((FlashSetLevel$Parameters) new Gson().fromJson(str, FlashSetLevel$Parameters.class));
                FlashSetLevel$Parameters.c(a);
                FlashSetLevel$Parameters.b(a);
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppForceHideHints(b3y b3yVar, String str) {
            try {
                ForceHideHints$Parameters a = ForceHideHints$Parameters.a((ForceHideHints$Parameters) new Gson().fromJson(str, ForceHideHints$Parameters.class));
                ForceHideHints$Parameters.b(a);
                b3yVar.R0(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.R0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetCommunityToken(b3y b3yVar, String str) {
            try {
                GetCommunityToken$Parameters a = GetCommunityToken$Parameters.a((GetCommunityToken$Parameters) new Gson().fromJson(str, GetCommunityToken$Parameters.class));
                GetCommunityToken$Parameters.d(a);
                GetCommunityToken$Parameters.b(a);
                GetCommunityToken$Parameters.c(a);
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetEmail(b3y b3yVar, String str) {
            try {
                GetEmail$Parameters.b(GetEmail$Parameters.a((GetEmail$Parameters) new Gson().fromJson(str, GetEmail$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetPersonalCard(b3y b3yVar, String str) {
            try {
                GetPersonalCard$Parameters.b(GetPersonalCard$Parameters.a((GetPersonalCard$Parameters) new Gson().fromJson(str, GetPersonalCard$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetPhoneNumber(b3y b3yVar, String str) {
            try {
                GetPhoneNumber$Parameters.b(GetPhoneNumber$Parameters.a((GetPhoneNumber$Parameters) new Gson().fromJson(str, GetPhoneNumber$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetPurchaseBundles(b3y b3yVar, String str) {
            try {
                GetPurchaseBundles$Parameters.b(GetPurchaseBundles$Parameters.a((GetPurchaseBundles$Parameters) new Gson().fromJson(str, GetPurchaseBundles$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetUserInfo(b3y b3yVar, String str) {
            try {
                GetUserInfo$Parameters a = GetUserInfo$Parameters.a((GetUserInfo$Parameters) new Gson().fromJson(str, GetUserInfo$Parameters.class));
                GetUserInfo$Parameters.c(a);
                GetUserInfo$Parameters.b(a);
                b3yVar.S0(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.S0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGyroscopeStart(b3y b3yVar, String str) {
            try {
                GyroscopeStart$Parameters a = GyroscopeStart$Parameters.a((GyroscopeStart$Parameters) new Gson().fromJson(str, GyroscopeStart$Parameters.class));
                GyroscopeStart$Parameters.c(a);
                GyroscopeStart$Parameters.b(a);
                b3yVar.j0(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.j0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGyroscopeStop(b3y b3yVar, String str) {
            try {
                GyroscopeStop$Parameters a = GyroscopeStop$Parameters.a((GyroscopeStop$Parameters) new Gson().fromJson(str, GyroscopeStop$Parameters.class));
                GyroscopeStop$Parameters.b(a);
                b3yVar.E(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.E(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppIsPasskeyAvailable(b3y b3yVar, String str) {
            try {
                IsPasskeyAvailable$Parameters a = IsPasskeyAvailable$Parameters.a((IsPasskeyAvailable$Parameters) new Gson().fromJson(str, IsPasskeyAvailable$Parameters.class));
                IsPasskeyAvailable$Parameters.b(a);
                b3yVar.n(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.n(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppKeepScreenOn(b3y b3yVar, String str) {
            try {
                KeepScreenOn$Parameters a = KeepScreenOn$Parameters.a((KeepScreenOn$Parameters) new Gson().fromJson(str, KeepScreenOn$Parameters.class));
                KeepScreenOn$Parameters.c(a);
                KeepScreenOn$Parameters.b(a);
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppLoadAds(b3y b3yVar, String str) {
            try {
                LoadAds$Parameters.b(LoadAds$Parameters.a((LoadAds$Parameters) new Gson().fromJson(str, LoadAds$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppOpenApp(b3y b3yVar, String str) {
            try {
                OpenApp$Parameters a = OpenApp$Parameters.a((OpenApp$Parameters) new Gson().fromJson(str, OpenApp$Parameters.class));
                OpenApp$Parameters.d(a);
                OpenApp$Parameters.b(a);
                OpenApp$Parameters.c(a);
                b3yVar.D(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.D(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppOpenCodeReader(b3y b3yVar, String str) {
            try {
                OpenCodeReader$Parameters a = OpenCodeReader$Parameters.a((OpenCodeReader$Parameters) new Gson().fromJson(str, OpenCodeReader$Parameters.class));
                OpenCodeReader$Parameters.b(a);
                b3yVar.f1(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.f1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppOpenContacts(b3y b3yVar, String str) {
            try {
                OpenContacts$Parameters.b(OpenContacts$Parameters.a((OpenContacts$Parameters) new Gson().fromJson(str, OpenContacts$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppOpenDebugSettings(b3y b3yVar, String str) {
            try {
                OpenDebugSettings$Parameters.b(OpenDebugSettings$Parameters.a((OpenDebugSettings$Parameters) new Gson().fromJson(str, OpenDebugSettings$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppOpenExternalLink(b3y b3yVar, String str) {
            try {
                OpenExternalLink$Parameters.b(OpenExternalLink$Parameters.a((OpenExternalLink$Parameters) new Gson().fromJson(str, OpenExternalLink$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppOpenPayForm(b3y b3yVar, String str) {
            try {
                OpenPayForm$Parameters a = OpenPayForm$Parameters.a((OpenPayForm$Parameters) new Gson().fromJson(str, OpenPayForm$Parameters.class));
                OpenPayForm$Parameters.c(a);
                OpenPayForm$Parameters.b(a);
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppOpenReportForm(b3y b3yVar, String str) {
            try {
                OpenReportForm$Parameters a = OpenReportForm$Parameters.a((OpenReportForm$Parameters) new Gson().fromJson(str, OpenReportForm$Parameters.class));
                OpenReportForm$Parameters.b(a);
                b3yVar.k0(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.k0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppRecommend(b3y b3yVar, String str) {
            try {
                Recommend$Parameters.b(Recommend$Parameters.a((Recommend$Parameters) new Gson().fromJson(str, Recommend$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppRestoreInAppPurchases(b3y b3yVar, String str) {
            try {
                RestoreInAppPurchases$Parameters.b(RestoreInAppPurchases$Parameters.a((RestoreInAppPurchases$Parameters) new Gson().fromJson(str, RestoreInAppPurchases$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppRetargetingPixel(b3y b3yVar, String str) {
            try {
                RetargetingPixel$Parameters a = RetargetingPixel$Parameters.a((RetargetingPixel$Parameters) new Gson().fromJson(str, RetargetingPixel$Parameters.class));
                RetargetingPixel$Parameters.d(a);
                RetargetingPixel$Parameters.c(a);
                RetargetingPixel$Parameters.b(a);
                b3yVar.Y(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.Y(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppScroll(b3y b3yVar, String str) {
            try {
                Scroll$Parameters a = Scroll$Parameters.a((Scroll$Parameters) new Gson().fromJson(str, Scroll$Parameters.class));
                Scroll$Parameters.d(a);
                Scroll$Parameters.c(a);
                Scroll$Parameters.b(a);
                b3yVar.C0(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.C0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppSelectSbpBank(b3y b3yVar, String str) {
            try {
                SelectSbpBank$Parameters.b(SelectSbpBank$Parameters.a((SelectSbpBank$Parameters) new Gson().fromJson(str, SelectSbpBank$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppSendPayload(b3y b3yVar, String str) {
            try {
                SendPayload$Parameters a = SendPayload$Parameters.a((SendPayload$Parameters) new Gson().fromJson(str, SendPayload$Parameters.class));
                SendPayload$Parameters.c(a);
                SendPayload$Parameters.b(a);
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppSetLocation(b3y b3yVar, String str) {
            try {
                SetLocation$Parameters a = SetLocation$Parameters.a((SetLocation$Parameters) new Gson().fromJson(str, SetLocation$Parameters.class));
                SetLocation$Parameters.b(a);
                b3yVar.p1(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.p1(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppSetPaymentToken(b3y b3yVar, String str) {
            try {
                SetPaymentToken$Parameters.b(SetPaymentToken$Parameters.a((SetPaymentToken$Parameters) new Gson().fromJson(str, SetPaymentToken$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppShare(b3y b3yVar, String str) {
            try {
                Share$Parameters a = Share$Parameters.a((Share$Parameters) new Gson().fromJson(str, Share$Parameters.class));
                Share$Parameters.c(a);
                Share$Parameters.b(a);
                b3yVar.d0(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.d0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowActionMenu(b3y b3yVar, String str) {
            try {
                ShowActionMenu$Parameters.b(ShowActionMenu$Parameters.a((ShowActionMenu$Parameters) new Gson().fromJson(str, ShowActionMenu$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowImages(b3y b3yVar, String str) {
            try {
                ShowImages$Parameters a = ShowImages$Parameters.a((ShowImages$Parameters) new Gson().fromJson(str, ShowImages$Parameters.class));
                ShowImages$Parameters.c(a);
                ShowImages$Parameters.b(a);
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowLeaderBoardBox(b3y b3yVar, String str) {
            try {
                ShowLeaderBoardBox$Parameters a = ShowLeaderBoardBox$Parameters.a((ShowLeaderBoardBox$Parameters) new Gson().fromJson(str, ShowLeaderBoardBox$Parameters.class));
                ShowLeaderBoardBox$Parameters.c(a);
                ShowLeaderBoardBox$Parameters.b(a);
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowRequestBox(b3y b3yVar, String str) {
            try {
                ShowRequestBox$Parameters.b(ShowRequestBox$Parameters.a((ShowRequestBox$Parameters) new Gson().fromJson(str, ShowRequestBox$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppShowSlidesSheet(b3y b3yVar, String str) {
            try {
                ShowSlidesSheet$Parameters a = ShowSlidesSheet$Parameters.a((ShowSlidesSheet$Parameters) new Gson().fromJson(str, ShowSlidesSheet$Parameters.class));
                ShowSlidesSheet$Parameters.b(a);
                b3yVar.m0(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.m0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppStorageGetKeys(b3y b3yVar, String str) {
            try {
                StorageGetKeys$Parameters a = StorageGetKeys$Parameters.a((StorageGetKeys$Parameters) new Gson().fromJson(str, StorageGetKeys$Parameters.class));
                StorageGetKeys$Parameters.d(a);
                StorageGetKeys$Parameters.b(a);
                StorageGetKeys$Parameters.c(a);
                b3yVar.V0(new p2y<>(a, str));
            } catch (Exception e) {
                b3yVar.V0(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppUsersSearch(b3y b3yVar, String str) {
            try {
                UsersSearch$Parameters.b(UsersSearch$Parameters.a((UsersSearch$Parameters) new Gson().fromJson(str, UsersSearch$Parameters.class)));
                b3yVar.getClass();
            } catch (Exception unused) {
                b3yVar.getClass();
            }
        }

        @JavascriptInterface
        public static void VKWebAppAccelerometerChanged(b3y b3yVar, String str) {
        }

        @JavascriptInterface
        public static void VKWebAppDeviceMotionChanged(b3y b3yVar, String str) {
        }

        @JavascriptInterface
        public static void VKWebAppGyroscopeChanged(b3y b3yVar, String str) {
        }
    }
}
