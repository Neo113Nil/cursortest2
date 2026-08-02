package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.common.js.bridge.api.events.AccelerometerStart$Error;
import com.vk.superapp.common.js.bridge.api.events.AccelerometerStop$Error;
import com.vk.superapp.common.js.bridge.api.events.Alert$Error;
import com.vk.superapp.common.js.bridge.api.events.ConversionHit$Error;
import com.vk.superapp.common.js.bridge.api.events.CustomMessage$Error;
import com.vk.superapp.common.js.bridge.api.events.DeviceMotionStart$Error;
import com.vk.superapp.common.js.bridge.api.events.DeviceMotionStop$Error;
import com.vk.superapp.common.js.bridge.api.events.GetUserInfo$Error;
import com.vk.superapp.common.js.bridge.api.events.GyroscopeStart$Error;
import com.vk.superapp.common.js.bridge.api.events.GyroscopeStop$Error;
import com.vk.superapp.common.js.bridge.api.events.OpenApp$Error;
import com.vk.superapp.common.js.bridge.api.events.OpenCodeReader$Error;
import com.vk.superapp.common.js.bridge.api.events.OpenReportForm$Error;
import com.vk.superapp.common.js.bridge.api.events.RetargetingPixel$Error;
import com.vk.superapp.common.js.bridge.api.events.Share$Error;
import com.vk.superapp.common.js.bridge.api.events.ShowSlidesSheet$Error;
import com.vk.superapp.common.js.bridge.api.events.StorageGetKeys$Error;

/* compiled from: ErrorEventSender.kt */
/* loaded from: classes6.dex */
public final class svp {
    public final com.vk.superapp.base.js.bridge.b a;

    public svp(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppAccelerometerStart"), new AccelerometerStart$Error(null, new AccelerometerStart$Error.Data(AccelerometerStart$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppAccelerometerStop"), new AccelerometerStop$Error(null, new AccelerometerStop$Error.Data(AccelerometerStop$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppAlert"), new Alert$Error(null, new Alert$Error.Data(Alert$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    public final void d(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppConversionHit"), new ConversionHit$Error(null, new ConversionHit$Error.Data(ConversionHit$Error.Data.Type.CLIENT_ERROR, responses$ClientError != null ? responses$ClientError.c() : null, responses$ClientError, null, 8, null), 1, null), null, null, 12);
    }

    public final void e(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppCustomMessage"), new CustomMessage$Error(null, new CustomMessage$Error.Data(CustomMessage$Error.Data.Type.CLIENT_ERROR, responses$ClientError != null ? responses$ClientError.c() : null, responses$ClientError, null, 8, null), 1, null), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppDeviceMotionStart"), new DeviceMotionStart$Error(null, new DeviceMotionStart$Error.Data(DeviceMotionStart$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppDeviceMotionStop"), new DeviceMotionStop$Error(null, new DeviceMotionStop$Error.Data(DeviceMotionStop$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    public final void h(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetUserInfo"), new GetUserInfo$Error(null, new GetUserInfo$Error.Data(GetUserInfo$Error.Data.Type.CLIENT_ERROR, responses$ClientError != null ? responses$ClientError.c() : null, responses$ClientError, null, 8, null), 1, null), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGyroscopeStart"), new GyroscopeStart$Error(null, new GyroscopeStart$Error.Data(GyroscopeStart$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGyroscopeStop"), new GyroscopeStop$Error(null, new GyroscopeStop$Error.Data(GyroscopeStop$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    public final void k(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppOpenApp"), new OpenApp$Error(null, new OpenApp$Error.Data(OpenApp$Error.Data.Type.CLIENT_ERROR, responses$ClientError != null ? responses$ClientError.c() : null, responses$ClientError, null, 8, null), 1, null), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppOpenCodeReader"), new OpenCodeReader$Error(null, new OpenCodeReader$Error.Data(OpenCodeReader$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppOpenReportForm"), new OpenReportForm$Error(null, new OpenReportForm$Error.Data(OpenReportForm$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    public final void n(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppRetargetingPixel"), new RetargetingPixel$Error(null, new RetargetingPixel$Error.Data(RetargetingPixel$Error.Data.Type.CLIENT_ERROR, responses$ClientError != null ? responses$ClientError.c() : null, responses$ClientError, null, 8, null), 1, null), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppShare"), new Share$Error(null, new Share$Error.Data(Share$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppShowSlidesSheet"), new ShowSlidesSheet$Error(null, new ShowSlidesSheet$Error.Data(ShowSlidesSheet$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppStorageGetKeys"), new StorageGetKeys$Error(null, new StorageGetKeys$Error.Data(StorageGetKeys$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }
}
