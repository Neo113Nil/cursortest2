package defpackage;

import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.concurrent.futures.b;

/* loaded from: classes10.dex */
public final /* synthetic */ class cm7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dm7 b;
    public final /* synthetic */ b c;

    public /* synthetic */ cm7(dm7 dm7Var, b bVar, int i) {
        this.a = i;
        this.b = dm7Var;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.c;
        dm7 dm7Var = this.b;
        switch (i) {
            case 0:
                dm7Var.b = true;
                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                b bVar2 = dm7Var.g;
                if (bVar2 != null) {
                    bVar2.d(cameraControl$OperationCanceledException);
                    dm7Var.g = null;
                }
                dm7Var.g = bVar;
                if (dm7Var.a) {
                    androidx.camera.camera2.internal.b bVar3 = dm7Var.c;
                    bVar3.getClass();
                    b bVar4 = new b();
                    bVar4.c = new hsj0();
                    gl7 gl7Var = new gl7(bVar4);
                    bVar4.b = gl7Var;
                    bVar4.a = x4e.class;
                    try {
                        bVar3.c.execute(new fm7(bVar3, bVar4, 0));
                        bVar4.a = "updateSessionConfigAsync";
                    } catch (Exception e) {
                        gl7Var.a(e);
                    }
                    ni91.g(gl7Var).c(new js4(26, dm7Var), dm7Var.d);
                    dm7Var.b = false;
                    break;
                }
                break;
            default:
                dm7Var.b = true;
                CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                b bVar5 = dm7Var.g;
                if (bVar5 != null) {
                    bVar5.d(cameraControl$OperationCanceledException2);
                    dm7Var.g = null;
                }
                dm7Var.g = bVar;
                if (dm7Var.a) {
                    androidx.camera.camera2.internal.b bVar6 = dm7Var.c;
                    bVar6.getClass();
                    b bVar7 = new b();
                    bVar7.c = new hsj0();
                    gl7 gl7Var2 = new gl7(bVar7);
                    bVar7.b = gl7Var2;
                    bVar7.a = x4e.class;
                    try {
                        bVar6.c.execute(new fm7(bVar6, bVar7, 0));
                        bVar7.a = "updateSessionConfigAsync";
                    } catch (Exception e2) {
                        gl7Var2.a(e2);
                    }
                    ni91.g(gl7Var2).c(new js4(26, dm7Var), dm7Var.d);
                    dm7Var.b = false;
                    break;
                }
                break;
        }
    }
}
