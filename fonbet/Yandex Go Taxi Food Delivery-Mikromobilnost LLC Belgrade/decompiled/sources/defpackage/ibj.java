package defpackage;

import io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation;
import io.flutter.plugins.camerax.CameraXError;
import kotlin.Result;

/* loaded from: classes4.dex */
public final class ibj extends qwf0 {
    public final /* synthetic */ v83 a;
    public final /* synthetic */ jbj b;
    public final /* synthetic */ PlatformChannel$DeviceOrientation c;

    public ibj(v83 v83Var, jbj jbjVar, PlatformChannel$DeviceOrientation platformChannel$DeviceOrientation) {
        this.a = v83Var;
        this.b = jbjVar;
        this.c = platformChannel$DeviceOrientation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String obj = this.c.toString();
        gv40 gv40Var = new gv40(21, new nni(this));
        pbj pbjVar = this.a.a;
        if (pbjVar.b) {
            n.D(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", "")), gv40Var);
            return;
        }
        w4u w4uVar = (w4u) pbjVar.w;
        jbj jbjVar = this.b;
        if (w4uVar.k(jbjVar)) {
            new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.onDeviceOrientationChanged", pbjVar.j(), null).z(scc.g(jbjVar, obj), new trb0(gv40Var, 1));
        } else {
            n.D(new Result.Failure(new CameraXError("missing-instance-error", "Callback to `DeviceOrientationManager.onDeviceOrientationChanged` failed because native instance was not in the instance manager.", "")), gv40Var);
        }
    }
}
