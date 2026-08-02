package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.health.js.bridge.api.events.AskWorkoutsPermissions$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetHealthConnectInfo$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetSteps$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetStepsPermissions$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetWorkouts$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetWorkoutsPermissions$Parameters;
import com.vk.superapp.health.js.bridge.api.events.StopStepsPermissions$Parameters;
import xsna.k4y;

/* compiled from: JsHealthDelegate.kt */
/* loaded from: classes6.dex */
public interface m4y extends k4y, npf0 {

    /* compiled from: JsHealthDelegate.kt */
    public static final class b {
        @JavascriptInterface
        public static void VKWebAppAskWorkoutsPermissions(m4y m4yVar, String str) {
            k4y.a.VKWebAppAskWorkoutsPermissions(m4yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppGetHealthConnectInfo(m4y m4yVar, String str) {
            k4y.a.VKWebAppGetHealthConnectInfo(m4yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppGetSteps(m4y m4yVar, String str) {
            k4y.a.VKWebAppGetSteps(m4yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppGetStepsPermissions(m4y m4yVar, String str) {
            k4y.a.VKWebAppGetStepsPermissions(m4yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppGetWorkouts(m4y m4yVar, String str) {
            k4y.a.VKWebAppGetWorkouts(m4yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppGetWorkoutsPermissions(m4y m4yVar, String str) {
            k4y.a.VKWebAppGetWorkoutsPermissions(m4yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppStepsSyncCompleted(m4y m4yVar, String str) {
            k4y.a.VKWebAppStepsSyncCompleted(m4yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppStopStepsPermissions(m4y m4yVar, String str) {
            k4y.a.VKWebAppStopStepsPermissions(m4yVar, str);
        }

        @JavascriptInterface
        public static void VKWebAppWorkoutsSyncCompleted(m4y m4yVar, String str) {
            k4y.a.VKWebAppWorkoutsSyncCompleted(m4yVar, str);
        }
    }

    @Override // xsna.k4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppAskWorkoutsPermissions(String str);

    @Override // xsna.k4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetHealthConnectInfo(String str);

    @Override // xsna.k4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetSteps(String str);

    @Override // xsna.k4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetStepsPermissions(String str);

    @Override // xsna.k4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetWorkouts(String str);

    @Override // xsna.k4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppGetWorkoutsPermissions(String str);

    @Override // xsna.k4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppStepsSyncCompleted(String str);

    @Override // xsna.k4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppStopStepsPermissions(String str);

    @Override // xsna.k4y
    @JavascriptInterface
    /* synthetic */ void VKWebAppWorkoutsSyncCompleted(String str);

    /* compiled from: JsHealthDelegate.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final m4y STUB = new C3321a();

        public final m4y getSTUB() {
            return STUB;
        }

        /* compiled from: JsHealthDelegate.kt */
        /* renamed from: xsna.m4y$a$a, reason: collision with other inner class name */
        public static final class C3321a implements m4y {
            @Override // xsna.m4y, xsna.k4y
            @JavascriptInterface
            public void VKWebAppAskWorkoutsPermissions(String str) {
                b.VKWebAppAskWorkoutsPermissions(this, str);
            }

            @Override // xsna.m4y, xsna.k4y
            @JavascriptInterface
            public void VKWebAppGetHealthConnectInfo(String str) {
                b.VKWebAppGetHealthConnectInfo(this, str);
            }

            @Override // xsna.m4y, xsna.k4y
            @JavascriptInterface
            public void VKWebAppGetSteps(String str) {
                b.VKWebAppGetSteps(this, str);
            }

            @Override // xsna.m4y, xsna.k4y
            @JavascriptInterface
            public void VKWebAppGetStepsPermissions(String str) {
                b.VKWebAppGetStepsPermissions(this, str);
            }

            @Override // xsna.m4y, xsna.k4y
            @JavascriptInterface
            public void VKWebAppGetWorkouts(String str) {
                b.VKWebAppGetWorkouts(this, str);
            }

            @Override // xsna.m4y, xsna.k4y
            @JavascriptInterface
            public void VKWebAppGetWorkoutsPermissions(String str) {
                b.VKWebAppGetWorkoutsPermissions(this, str);
            }

            @Override // xsna.m4y, xsna.k4y
            @JavascriptInterface
            public void VKWebAppStepsSyncCompleted(String str) {
                b.VKWebAppStepsSyncCompleted(this, str);
            }

            @Override // xsna.m4y, xsna.k4y
            @JavascriptInterface
            public void VKWebAppStopStepsPermissions(String str) {
                b.VKWebAppStopStepsPermissions(this, str);
            }

            @Override // xsna.m4y, xsna.k4y
            @JavascriptInterface
            public void VKWebAppWorkoutsSyncCompleted(String str) {
                b.VKWebAppWorkoutsSyncCompleted(this, str);
            }

            @Override // xsna.npf0
            public final void release() {
            }

            @Override // xsna.k4y
            public final void c(p2y<GetSteps$Parameters> p2yVar) {
            }

            @Override // xsna.k4y
            public final void d(p2y<GetStepsPermissions$Parameters> p2yVar) {
            }

            @Override // xsna.k4y
            public final void h(p2y<AskWorkoutsPermissions$Parameters> p2yVar) {
            }

            @Override // xsna.k4y
            public final void j(p2y<GetWorkoutsPermissions$Parameters> p2yVar) {
            }

            @Override // xsna.k4y
            public final void k(p2y<GetHealthConnectInfo$Parameters> p2yVar) {
            }

            @Override // xsna.k4y
            public final void l(p2y<GetWorkouts$Parameters> p2yVar) {
            }

            @Override // xsna.k4y
            public final void m(p2y<StopStepsPermissions$Parameters> p2yVar) {
            }

            @Override // xsna.npf0
            public final void r(xwv0 xwv0Var) {
            }
        }
    }
}
