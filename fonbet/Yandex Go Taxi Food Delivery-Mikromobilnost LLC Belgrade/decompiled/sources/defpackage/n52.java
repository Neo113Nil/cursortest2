package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.video.g;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.camerax.VideoQuality;
import java.util.Collections;
import java.util.Set;
import kotlin.Result;

/* loaded from: classes4.dex */
public final class n52 {
    public final pbj a;

    public /* synthetic */ n52(pbj pbjVar) {
        this.a = pbjVar;
    }

    public static a84 a(VideoQuality videoQuality) {
        switch (v9p.a[videoQuality.ordinal()]) {
            case 1:
                return kgg0.a;
            case 2:
                return kgg0.b;
            case 3:
                return kgg0.c;
            case 4:
                return kgg0.d;
            case 5:
                return kgg0.e;
            case 6:
                return kgg0.f;
            default:
                w511.t("VideoQuality ", videoQuality, " is unhandled by FallbackStrategyProxyApi.");
                return null;
        }
    }

    public static Size b(ar7 ar7Var, VideoQuality videoQuality) {
        a84 a84Var;
        switch (rgg0.a[videoQuality.ordinal()]) {
            case 1:
                a84Var = kgg0.a;
                break;
            case 2:
                a84Var = kgg0.b;
                break;
            case 3:
                a84Var = kgg0.c;
                break;
            case 4:
                a84Var = kgg0.d;
                break;
            case 5:
                a84Var = kgg0.e;
                break;
            case 6:
                a84Var = kgg0.f;
                break;
            default:
                w511.t("VideoQuality ", videoQuality, " is unhandled by QualitySelectorProxyApi.");
                return null;
        }
        d6z.m("Invalid quality: " + a84Var, kgg0.h.contains(a84Var));
        Set set = g.n0;
        n28 e = new pii0(ar7Var, 1).e(q8n.d);
        qo31 a = e == null ? null : e.a(a84Var);
        if (a != null) {
            return a.f().j();
        }
        return null;
    }

    public void c(q64 q64Var, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(q64Var)) {
                fu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.FallbackStrategy.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(q64Var))), new nd2(29, fu7Var));
        }
    }

    public void d(dm7 dm7Var, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(dm7Var)) {
                fu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.Camera2CameraControl.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(dm7Var))), new nd2(6, fu7Var));
        }
    }

    public void e(qp7 qp7Var, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(qp7Var)) {
                fu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.CameraControl.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(qp7Var))), new nd2(10, fu7Var));
        }
    }

    public void f(fur furVar, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else if (w4uVar.k(furVar)) {
            fu7Var.invoke(new Result(zy11.a));
        } else {
            new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.FocusMeteringAction.pigeon_newInstance", pbjVar.j(), null).z(scc.g(Long.valueOf(w4uVar.i(furVar)), furVar.b, furVar.a, furVar.c, Boolean.valueOf(furVar.d > 0)), new isb0(2, fu7Var));
        }
    }

    public void g(t7v t7vVar, fu7 fu7Var) {
        pbj pbjVar = this.a;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else if (((w4u) pbjVar.w).k(t7vVar)) {
            fu7Var.invoke(new Result(zy11.a));
        } else {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("new-instance-error", "Attempting to create a new Dart instance of Analyzer, but the class has a nonnull callback method.", ""))));
        }
    }

    public void h(fvy fvyVar, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
            return;
        }
        if (w4uVar.k(fvyVar)) {
            fu7Var.invoke(new Result(zy11.a));
            return;
        }
        long i = w4uVar.i(fvyVar);
        String str = "dev.flutter.pigeon.camera_android_camerax.LiveData.pigeon_newInstance";
        new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(scc.g(Long.valueOf(i), fvyVar.b), new isb0(11, fu7Var));
    }

    public void i(qgg0 qgg0Var, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(qgg0Var)) {
                fu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.QualitySelector.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(qgg0Var))), new isb0(20, fu7Var));
        }
    }

    public void j(CameraCharacteristics.Key key, fu7 fu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            fu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(key)) {
                fu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.CameraCharacteristicsKey.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(key))), new nd2(9, fu7Var));
        }
    }

    public void k(CameraCharacteristics cameraCharacteristics, gu7 gu7Var) {
        pbj pbjVar = this.a;
        w4u w4uVar = (w4u) pbjVar.w;
        if (pbjVar.b) {
            gu7Var.invoke(new Result(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", ""))));
        } else {
            if (w4uVar.k(cameraCharacteristics)) {
                gu7Var.invoke(new Result(zy11.a));
                return;
            }
            String str = "dev.flutter.pigeon.camera_android_camerax.CameraCharacteristics.pigeon_newInstance";
            new m2v((tt5) pbjVar.c, str, pbjVar.j(), null).z(Collections.singletonList(Long.valueOf(w4uVar.i(cameraCharacteristics))), new nd2(8, gu7Var));
        }
    }
}
