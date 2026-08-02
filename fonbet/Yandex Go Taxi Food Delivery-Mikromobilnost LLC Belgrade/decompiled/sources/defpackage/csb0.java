package defpackage;

import androidx.camera.core.CameraState;
import io.flutter.plugins.camerax.CameraStateErrorCode;
import io.flutter.plugins.camerax.CameraXError;
import kotlin.Result;

/* loaded from: classes4.dex */
public abstract class csb0 {
    public final pbj a;

    public csb0(pbj pbjVar) {
        this.a = pbjVar;
    }

    public final void a(CameraState.a aVar, fu7 fu7Var) {
        CameraStateErrorCode cameraStateErrorCode;
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
            return;
        }
        if (w4uVar.k(aVar)) {
            fu7Var.invoke(new Result(zy11.a));
            return;
        }
        long i = w4uVar.i(aVar);
        switch (aVar.b()) {
            case 1:
                cameraStateErrorCode = CameraStateErrorCode.MAX_CAMERAS_IN_USE;
                break;
            case 2:
                cameraStateErrorCode = CameraStateErrorCode.CAMERA_IN_USE;
                break;
            case 3:
                cameraStateErrorCode = CameraStateErrorCode.OTHER_RECOVERABLE_ERROR;
                break;
            case 4:
                cameraStateErrorCode = CameraStateErrorCode.STREAM_CONFIG;
                break;
            case 5:
                cameraStateErrorCode = CameraStateErrorCode.CAMERA_DISABLED;
                break;
            case 6:
                cameraStateErrorCode = CameraStateErrorCode.CAMERA_FATAL_ERROR;
                break;
            case 7:
                cameraStateErrorCode = CameraStateErrorCode.DO_NOT_DISTURB_MODE_ENABLED;
                break;
            default:
                cameraStateErrorCode = CameraStateErrorCode.UNKNOWN;
                break;
        }
        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.CameraStateStateError.pigeon_newInstance", pbjVar.j(), null).z(scc.g(Long.valueOf(i), cameraStateErrorCode), new nd2(17, fu7Var));
    }
}
