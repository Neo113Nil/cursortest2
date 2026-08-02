package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.b;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class gn7 implements bn7 {
    public final b a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final v8v d;
    public final eg01 e;

    public gn7(b bVar, androidx.camera.core.impl.utils.executor.b bVar2, k6u k6uVar, eg01 eg01Var) {
        this.a = bVar;
        this.b = bVar2;
        this.c = k6uVar;
        this.e = eg01Var;
        v8v v8vVar = bVar.r;
        Objects.requireNonNull(v8vVar);
        this.d = v8vVar;
    }

    @Override // defpackage.bn7
    public final euy a(TotalCaptureResult totalCaptureResult) {
        int i = 3;
        sgb1.g(3, "Camera2CapturePipeline");
        AtomicReference atomicReference = new AtomicReference();
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        int i2 = 0;
        try {
            atomicReference.set(new en7(0, bVar));
            bVar.a = "OnScreenFlashUiApplied";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        androidx.concurrent.futures.b bVar2 = new androidx.concurrent.futures.b();
        bVar2.c = new hsj0();
        gl7 gl7Var2 = new gl7(bVar2);
        bVar2.b = gl7Var2;
        bVar2.a = x4e.class;
        try {
            geb1.f().execute(new d1(10, this, atomicReference, bVar2));
            bVar2.a = "OnScreenFlashStart";
        } catch (Exception e2) {
            gl7Var2.a(e2);
        }
        jqs a = jqs.a(gl7Var2);
        fn7 fn7Var = new fn7(this, i2);
        Executor executor = this.b;
        o89 n = ni91.n(ni91.n(ni91.n(ni91.n(ni91.n(a, fn7Var, executor), new fn7(this, 1), executor), new e90(5, this, gl7Var), executor), new fn7(this, 2), executor), new fn7(this, i), executor);
        vm7 vm7Var = new vm7(i);
        return ni91.n(n, new gym(vm7Var), geb1.b());
    }

    @Override // defpackage.bn7
    public final boolean b() {
        return false;
    }

    @Override // defpackage.bn7
    public final void c() {
        b bVar = this.a;
        mur murVar = bVar.h;
        sgb1.g(3, "Camera2CapturePipeline");
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = (TorchFlashRequiredFor3aUpdateQuirk) this.e.a;
        int i = 0;
        boolean z = (torchFlashRequiredFor3aUpdateQuirk == null || b.v(torchFlashRequiredFor3aUpdateQuirk.a, 5) == 5) ? false : true;
        sgb1.g(3, "UseFlashModeTorchFor3aUpdate");
        if (z) {
            bVar.t(0);
        }
        murVar.c(false).c(new d82(1), this.b);
        murVar.a(false, true);
        k6u f = geb1.f();
        v8v v8vVar = this.d;
        Objects.requireNonNull(v8vVar);
        f.execute(new dn7(i, v8vVar));
    }
}
