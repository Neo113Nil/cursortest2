package defpackage;

import io.flutter.plugins.camerax.CameraXError;
import kotlin.Result;

/* loaded from: classes4.dex */
public final class l52 extends qwf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l52(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                m52 m52Var = (m52) obj2;
                n52 n52Var = (n52) m52Var.b;
                x4r0 x4r0Var = (x4r0) obj;
                gv40 gv40Var = new gv40(21, new f22(this));
                pbj pbjVar = n52Var.a;
                if (!pbjVar.b) {
                    if (!((w4u) pbjVar.w).k(m52Var)) {
                        n.D(new Result.Failure(new CameraXError("missing-instance-error", "Callback to `Analyzer.analyze` failed because native instance was not in the instance manager.", "")), gv40Var);
                        break;
                    } else {
                        new m2v((tt5) pbjVar.c, "dev.flutter.pigeon.camera_android_camerax.Analyzer.analyze", pbjVar.j(), null).z(scc.g(m52Var, x4r0Var), new trb0(gv40Var, 0));
                        break;
                    }
                } else {
                    n.D(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", "")), gv40Var);
                    break;
                }
            case 1:
                wdj wdjVar = (wdj) obj2;
                sm7 sm7Var = (sm7) wdjVar.b;
                gv40 gv40Var2 = new gv40(21, new fd60(this));
                pbj pbjVar2 = sm7Var.a;
                if (!pbjVar2.b) {
                    if (!((w4u) pbjVar2.w).k(wdjVar)) {
                        n.D(new Result.Failure(new CameraXError("missing-instance-error", "Callback to `Observer.onChanged` failed because native instance was not in the instance manager.", "")), gv40Var2);
                        break;
                    } else {
                        new m2v((tt5) pbjVar2.c, "dev.flutter.pigeon.camera_android_camerax.Observer.onChanged", pbjVar2.j(), null).z(scc.g(wdjVar, obj), new trb0(gv40Var2, 2));
                        break;
                    }
                } else {
                    n.D(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", "")), gv40Var2);
                    break;
                }
            case 2:
                v3x0 v3x0Var = (v3x0) obj2;
                v83 v83Var = v3x0Var.b;
                String str = (String) obj;
                gv40 gv40Var3 = new gv40(21, new oxv0(17, this));
                pbj pbjVar3 = v83Var.a;
                if (!pbjVar3.b) {
                    if (!((w4u) pbjVar3.w).k(v3x0Var)) {
                        n.D(new Result.Failure(new CameraXError("missing-instance-error", "Callback to `SystemServicesManager.onCameraError` failed because native instance was not in the instance manager.", "")), gv40Var3);
                        break;
                    } else {
                        new m2v((tt5) pbjVar3.c, "dev.flutter.pigeon.camera_android_camerax.SystemServicesManager.onCameraError", pbjVar3.j(), null).z(scc.g(v3x0Var, str), new trb0(gv40Var3, 3));
                        break;
                    }
                } else {
                    n.D(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", "")), gv40Var3);
                    break;
                }
            default:
                jn31 jn31Var = (jn31) obj2;
                sm7 sm7Var2 = jn31Var.a;
                in31 in31Var = (in31) obj;
                gv40 gv40Var4 = new gv40(21, new ke31(14, this));
                pbj pbjVar4 = sm7Var2.a;
                if (!pbjVar4.b) {
                    if (!((w4u) pbjVar4.w).k(jn31Var)) {
                        n.D(new Result.Failure(new CameraXError("missing-instance-error", "Callback to `VideoRecordEventListener.onEvent` failed because native instance was not in the instance manager.", "")), gv40Var4);
                        break;
                    } else {
                        new m2v((tt5) pbjVar4.c, "dev.flutter.pigeon.camera_android_camerax.VideoRecordEventListener.onEvent", pbjVar4.j(), null).z(scc.g(jn31Var, in31Var), new trb0(gv40Var4, 4));
                        break;
                    }
                } else {
                    n.D(new Result.Failure(new CameraXError("ignore-calls-error", "Calls to Dart are being ignored.", "")), gv40Var4);
                    break;
                }
        }
    }
}
