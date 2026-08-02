package defpackage;

import androidx.camera.camera2.internal.b;
import androidx.camera.core.impl.Config$OptionPriority;

/* loaded from: classes10.dex */
public final class dm7 {
    public final b c;
    public final androidx.camera.core.impl.utils.executor.b d;
    public androidx.concurrent.futures.b g;
    public boolean a = false;
    public boolean b = false;
    public final Object e = new Object();
    public vn7 f = new vn7();

    public dm7(b bVar, androidx.camera.core.impl.utils.executor.b bVar2) {
        this.c = bVar;
        this.d = bVar2;
    }

    public final euy a(b48 b48Var) {
        synchronized (this.e) {
            vn7 vn7Var = this.f;
            vn7Var.getClass();
            Config$OptionPriority config$OptionPriority = Config$OptionPriority.OPTIONAL;
            for (x34 x34Var : b48Var.h()) {
                vn7Var.a.t(x34Var, config$OptionPriority, b48Var.f(x34Var));
            }
        }
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            this.d.execute(new cm7(this, bVar, 0));
            bVar.a = "addCaptureRequestOptions";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        return ni91.g(gl7Var);
    }
}
