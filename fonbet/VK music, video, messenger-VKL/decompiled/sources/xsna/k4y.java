package xsna;

import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.vk.superapp.health.js.bridge.api.events.AskWorkoutsPermissions$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetHealthConnectInfo$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetSteps$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetStepsPermissions$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetWorkouts$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetWorkoutsPermissions$Parameters;
import com.vk.superapp.health.js.bridge.api.events.StopStepsPermissions$Parameters;
import xsna.p2y;

/* compiled from: JsHealthBridge.kt */
/* loaded from: classes6.dex */
public interface k4y {
    @JavascriptInterface
    void VKWebAppAskWorkoutsPermissions(String str);

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
    void VKWebAppStepsSyncCompleted(String str);

    @JavascriptInterface
    void VKWebAppStopStepsPermissions(String str);

    @JavascriptInterface
    void VKWebAppWorkoutsSyncCompleted(String str);

    void c(p2y<GetSteps$Parameters> p2yVar);

    void d(p2y<GetStepsPermissions$Parameters> p2yVar);

    void h(p2y<AskWorkoutsPermissions$Parameters> p2yVar);

    void j(p2y<GetWorkoutsPermissions$Parameters> p2yVar);

    void k(p2y<GetHealthConnectInfo$Parameters> p2yVar);

    void l(p2y<GetWorkouts$Parameters> p2yVar);

    void m(p2y<StopStepsPermissions$Parameters> p2yVar);

    /* compiled from: JsHealthBridge.kt */
    public static final class a {
        @JavascriptInterface
        public static void VKWebAppAskWorkoutsPermissions(k4y k4yVar, String str) {
            try {
                AskWorkoutsPermissions$Parameters a = AskWorkoutsPermissions$Parameters.a((AskWorkoutsPermissions$Parameters) new Gson().fromJson(str, AskWorkoutsPermissions$Parameters.class));
                AskWorkoutsPermissions$Parameters.b(a);
                k4yVar.h(new p2y<>(a, str));
            } catch (Exception e) {
                k4yVar.h(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetHealthConnectInfo(k4y k4yVar, String str) {
            try {
                GetHealthConnectInfo$Parameters a = GetHealthConnectInfo$Parameters.a((GetHealthConnectInfo$Parameters) new Gson().fromJson(str, GetHealthConnectInfo$Parameters.class));
                GetHealthConnectInfo$Parameters.b(a);
                k4yVar.k(new p2y<>(a, str));
            } catch (Exception e) {
                k4yVar.k(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetSteps(k4y k4yVar, String str) {
            try {
                GetSteps$Parameters a = GetSteps$Parameters.a((GetSteps$Parameters) new Gson().fromJson(str, GetSteps$Parameters.class));
                GetSteps$Parameters.b(a);
                k4yVar.c(new p2y<>(a, str));
            } catch (Exception e) {
                k4yVar.c(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetStepsPermissions(k4y k4yVar, String str) {
            try {
                GetStepsPermissions$Parameters a = GetStepsPermissions$Parameters.a((GetStepsPermissions$Parameters) new Gson().fromJson(str, GetStepsPermissions$Parameters.class));
                GetStepsPermissions$Parameters.b(a);
                k4yVar.d(new p2y<>(a, str));
            } catch (Exception e) {
                k4yVar.d(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetWorkouts(k4y k4yVar, String str) {
            try {
                GetWorkouts$Parameters a = GetWorkouts$Parameters.a((GetWorkouts$Parameters) new Gson().fromJson(str, GetWorkouts$Parameters.class));
                GetWorkouts$Parameters.b(a);
                k4yVar.l(new p2y<>(a, str));
            } catch (Exception e) {
                k4yVar.l(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppGetWorkoutsPermissions(k4y k4yVar, String str) {
            try {
                GetWorkoutsPermissions$Parameters a = GetWorkoutsPermissions$Parameters.a((GetWorkoutsPermissions$Parameters) new Gson().fromJson(str, GetWorkoutsPermissions$Parameters.class));
                GetWorkoutsPermissions$Parameters.b(a);
                k4yVar.j(new p2y<>(a, str));
            } catch (Exception e) {
                k4yVar.j(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppStopStepsPermissions(k4y k4yVar, String str) {
            try {
                StopStepsPermissions$Parameters a = StopStepsPermissions$Parameters.a((StopStepsPermissions$Parameters) new Gson().fromJson(str, StopStepsPermissions$Parameters.class));
                StopStepsPermissions$Parameters.b(a);
                k4yVar.m(new p2y<>(a, str));
            } catch (Exception e) {
                k4yVar.m(new p2y<>(new p2y.a(e), str));
            }
        }

        @JavascriptInterface
        public static void VKWebAppStepsSyncCompleted(k4y k4yVar, String str) {
        }

        @JavascriptInterface
        public static void VKWebAppWorkoutsSyncCompleted(k4y k4yVar, String str) {
        }
    }
}
