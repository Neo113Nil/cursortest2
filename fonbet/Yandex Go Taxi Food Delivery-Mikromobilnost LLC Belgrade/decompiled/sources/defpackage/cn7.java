package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.b;

/* loaded from: classes10.dex */
public final class cn7 implements im7 {
    public final b a;
    public final gl7 b;
    public final vm7 c;

    public cn7(vm7 vm7Var) {
        b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        try {
            this.a = bVar;
            bVar.a = "waitFor3AResult";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        this.b = gl7Var;
        this.c = vm7Var;
    }

    @Override // defpackage.im7
    public final boolean b(TotalCaptureResult totalCaptureResult) {
        boolean b;
        vm7 vm7Var = this.c;
        if (vm7Var != null) {
            switch (vm7Var.a) {
                case 1:
                    b = jn7.b(totalCaptureResult, false);
                    break;
                case 4:
                    b = jn7.b(totalCaptureResult, false);
                    break;
                default:
                    b = jn7.b(totalCaptureResult, true);
                    break;
            }
            if (!b) {
                return false;
            }
        }
        this.a.b(totalCaptureResult);
        return true;
    }
}
