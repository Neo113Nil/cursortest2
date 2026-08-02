package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.b;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public final class in7 implements bn7 {
    public final b a;
    public final int b;
    public boolean c = false;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final boolean f;

    public in7(b bVar, int i, androidx.camera.core.impl.utils.executor.b bVar2, k6u k6uVar, boolean z) {
        this.a = bVar;
        this.b = i;
        this.d = bVar2;
        this.e = k6uVar;
        this.f = z;
    }

    @Override // defpackage.bn7
    public final euy a(TotalCaptureResult totalCaptureResult) {
        jn7.c(totalCaptureResult, this.b);
        int i = 3;
        sgb1.g(3, "Camera2CapturePipeline");
        if (jn7.c(totalCaptureResult, this.b)) {
            if (this.a.s == 0) {
                sgb1.g(3, "Camera2CapturePipeline");
                final int i2 = 1;
                this.c = true;
                androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
                bVar.c = new hsj0();
                gl7 gl7Var = new gl7(bVar);
                bVar.b = gl7Var;
                bVar.a = x4e.class;
                try {
                    this.a.j.a(2, bVar);
                    bVar.a = "TorchOn";
                } catch (Exception e) {
                    gl7Var.a(e);
                }
                jqs a = jqs.a(gl7Var);
                final int i3 = 0;
                o89 n = ni91.n(ni91.n(a, new aa3(this) { // from class: hn7
                    public final /* synthetic */ in7 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.aa3
                    public final euy apply(Object obj) {
                        int i4 = i3;
                        in7 in7Var = this.b;
                        switch (i4) {
                            case 0:
                                return in7Var.f ? in7Var.a.h.e() : hiv.c;
                            default:
                                ScheduledExecutorService scheduledExecutorService = in7Var.e;
                                b bVar2 = in7Var.a;
                                cn7 cn7Var = new cn7(new vm7(5));
                                bVar2.r(cn7Var);
                                nm7 nm7Var = new nm7(4, bVar2, cn7Var);
                                androidx.camera.core.impl.utils.executor.b bVar3 = bVar2.c;
                                gl7 gl7Var2 = cn7Var.b;
                                gl7Var2.b.c(nm7Var, bVar3);
                                return jx81.r(new e5h(gl7Var2, scheduledExecutorService, 2000L, 1));
                        }
                    }
                }, this.d), new aa3(this) { // from class: hn7
                    public final /* synthetic */ in7 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.aa3
                    public final euy apply(Object obj) {
                        int i4 = i2;
                        in7 in7Var = this.b;
                        switch (i4) {
                            case 0:
                                return in7Var.f ? in7Var.a.h.e() : hiv.c;
                            default:
                                ScheduledExecutorService scheduledExecutorService = in7Var.e;
                                b bVar2 = in7Var.a;
                                cn7 cn7Var = new cn7(new vm7(5));
                                bVar2.r(cn7Var);
                                nm7 nm7Var = new nm7(4, bVar2, cn7Var);
                                androidx.camera.core.impl.utils.executor.b bVar3 = bVar2.c;
                                gl7 gl7Var2 = cn7Var.b;
                                gl7Var2.b.c(nm7Var, bVar3);
                                return jx81.r(new e5h(gl7Var2, scheduledExecutorService, 2000L, 1));
                        }
                    }
                }, this.d);
                vm7 vm7Var = new vm7(i);
                return ni91.n(n, new gym(vm7Var), geb1.b());
            }
            sgb1.g(3, "Camera2CapturePipeline");
        }
        return ni91.f(Boolean.FALSE);
    }

    @Override // defpackage.bn7
    public final boolean b() {
        return this.b == 0;
    }

    @Override // defpackage.bn7
    public final void c() {
        if (this.c) {
            b bVar = this.a;
            bVar.j.a(0, null);
            sgb1.g(3, "Camera2CapturePipeline");
            if (this.f) {
                bVar.h.a(false, true);
            }
        }
    }
}
