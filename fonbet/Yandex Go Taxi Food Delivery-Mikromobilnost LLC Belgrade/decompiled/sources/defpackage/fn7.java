package defpackage;

import androidx.camera.camera2.internal.b;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public final /* synthetic */ class fn7 implements aa3, el7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn7 b;

    public /* synthetic */ fn7(gn7 gn7Var, int i) {
        this.a = i;
        this.b = gn7Var;
    }

    @Override // defpackage.aa3
    public euy apply(Object obj) {
        int i = this.a;
        int i2 = 4;
        gn7 gn7Var = this.b;
        switch (i) {
            case 0:
                return gn7Var.a.h.c(true);
            case 1:
                return jx81.r(new fn7(gn7Var, i2));
            case 2:
                return gn7Var.a.h.e();
            default:
                ScheduledExecutorService scheduledExecutorService = gn7Var.c;
                b bVar = gn7Var.a;
                cn7 cn7Var = new cn7(new vm7(4));
                bVar.r(cn7Var);
                nm7 nm7Var = new nm7(4, bVar, cn7Var);
                androidx.camera.core.impl.utils.executor.b bVar2 = bVar.c;
                gl7 gl7Var = cn7Var.b;
                gl7Var.b.c(nm7Var, bVar2);
                return jx81.r(new e5h(gl7Var, scheduledExecutorService, 2000L, 1));
        }
    }

    @Override // defpackage.el7
    public Object j(androidx.concurrent.futures.b bVar) {
        gn7 gn7Var = this.b;
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = (TorchFlashRequiredFor3aUpdateQuirk) gn7Var.e.a;
        boolean z = (torchFlashRequiredFor3aUpdateQuirk == null || b.v(torchFlashRequiredFor3aUpdateQuirk.a, 5) == 5) ? false : true;
        sgb1.g(3, "UseFlashModeTorchFor3aUpdate");
        if (!z) {
            bVar.b(null);
            return "EnableTorchInternal";
        }
        sgb1.g(3, "Camera2CapturePipeline");
        gn7Var.a.t(2);
        bVar.b(null);
        return "EnableTorchInternal";
    }
}
