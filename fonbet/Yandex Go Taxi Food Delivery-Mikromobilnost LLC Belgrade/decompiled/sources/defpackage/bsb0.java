package defpackage;

import androidx.camera.core.CameraState;
import io.flutter.plugins.camerax.CameraStateType;
import io.flutter.plugins.camerax.CameraXError;
import kotlin.Result;

/* loaded from: classes4.dex */
public abstract class bsb0 {
    public final pbj a;

    public bsb0(pbj pbjVar) {
        this.a = pbjVar;
    }

    public final void a(CameraState cameraState, fu7 fu7Var) {
        pbj pbjVar = this.a;
        boolean z = pbjVar.b;
        w4u w4uVar = (w4u) pbjVar.w;
        if (z) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(cameraState)) {
                fu7Var.invoke(new Result(zy11.a));
                return;
            }
            long i = w4uVar.i(cameraState);
            int i2 = dt7.a[cameraState.b().ordinal()];
            new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.CameraState.pigeon_newInstance", pbjVar.j(), null).z(scc.g(Long.valueOf(i), i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? CameraStateType.UNKNOWN : CameraStateType.CLOSED : CameraStateType.CLOSING : CameraStateType.OPEN : CameraStateType.OPENING : CameraStateType.PENDING_OPEN, cameraState.a()), new nd2(16, fu7Var));
        }
    }
}
