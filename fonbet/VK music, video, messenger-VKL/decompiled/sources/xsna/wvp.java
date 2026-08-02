package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.health.js.bridge.api.events.AskWorkoutsPermissions$Error;
import com.vk.superapp.health.js.bridge.api.events.GetHealthConnectInfo$Error;
import com.vk.superapp.health.js.bridge.api.events.GetSteps$Error;
import com.vk.superapp.health.js.bridge.api.events.GetStepsPermissions$Error;
import com.vk.superapp.health.js.bridge.api.events.GetWorkouts$Error;
import com.vk.superapp.health.js.bridge.api.events.GetWorkoutsPermissions$Error;
import com.vk.superapp.health.js.bridge.api.events.StopStepsPermissions$Error;

/* compiled from: ErrorEventSender.kt */
/* loaded from: classes6.dex */
public final class wvp {
    public final com.vk.superapp.base.js.bridge.b a;

    public wvp(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Responses$ClientError responses$ClientError) {
        String str = null;
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppAskWorkoutsPermissions"), new AskWorkoutsPermissions$Error(str, new AskWorkoutsPermissions$Error.Data(AskWorkoutsPermissions$Error.Data.Type.CLIENT_ERROR, null, responses$ClientError, 2, null), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Responses$ClientError responses$ClientError) {
        String str = null;
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetHealthConnectInfo"), new GetHealthConnectInfo$Error(str, new GetHealthConnectInfo$Error.Data(GetHealthConnectInfo$Error.Data.Type.CLIENT_ERROR, null, responses$ClientError, 2, null), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(String str, Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetSteps"), new GetSteps$Error(null, new GetSteps$Error.Data(GetSteps$Error.Data.Type.CLIENT_ERROR, str, responses$ClientError), 1, 0 == true ? 1 : 0), null, str, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Responses$ClientError responses$ClientError) {
        String str = null;
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetStepsPermissions"), new GetStepsPermissions$Error(str, new GetStepsPermissions$Error.Data(GetStepsPermissions$Error.Data.Type.CLIENT_ERROR, null, responses$ClientError, 2, null), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Responses$ClientError responses$ClientError) {
        String str = null;
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetWorkouts"), new GetWorkouts$Error(str, new GetWorkouts$Error.Data(GetWorkouts$Error.Data.Type.CLIENT_ERROR, null, responses$ClientError, 2, null), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Responses$ClientError responses$ClientError) {
        String str = null;
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetWorkoutsPermissions"), new GetWorkoutsPermissions$Error(str, new GetWorkoutsPermissions$Error.Data(GetWorkoutsPermissions$Error.Data.Type.CLIENT_ERROR, null, responses$ClientError, 2, null), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(Responses$ClientError responses$ClientError) {
        String str = null;
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppStopStepsPermissions"), new StopStepsPermissions$Error(str, new StopStepsPermissions$Error.Data(StopStepsPermissions$Error.Data.Type.CLIENT_ERROR, null, responses$ClientError, 2, null), 1, 0 == true ? 1 : 0), null, null, 12);
    }
}
