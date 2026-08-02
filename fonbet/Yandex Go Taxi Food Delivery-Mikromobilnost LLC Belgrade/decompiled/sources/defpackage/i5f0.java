package defpackage;

import android.os.Trace;
import androidx.camera.core.e;
import androidx.camera.core.j;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class i5f0 implements ns7 {
    public static final i5f0 b = new i5f0(new rdy());
    public final rdy a;

    public i5f0(rdy rdyVar) {
        this.a = rdyVar;
    }

    @Override // defpackage.ns7
    public final ArrayList a() {
        return this.a.a();
    }

    @Override // defpackage.ns7
    public final int b() {
        return this.a.i;
    }

    public final co7 c(pey peyVar, xs7 xs7Var, bj21 bj21Var) {
        int b2;
        rdy rdyVar = this.a;
        Trace.beginSection(ffx.f0("CX:bindToLifecycle-UseCaseGroup"));
        try {
            e eVar = rdyVar.e;
            if (eVar == null) {
                b2 = 0;
            } else {
                lm7 lm7Var = eVar.g;
                if (lm7Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                b2 = lm7Var.b.b();
            }
            if (b2 == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            rdy.d(rdyVar, 1);
            ody e = rdy.e(rdyVar, peyVar, xs7Var, new pbj(bj21Var.b, bj21Var.a, bj21Var.c));
            Trace.endSection();
            return e;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final co7 d(pey peyVar, xs7 xs7Var, j... jVarArr) {
        int b2;
        rdy rdyVar = this.a;
        j[] jVarArr2 = (j[]) Arrays.copyOf(jVarArr, jVarArr.length);
        Trace.beginSection(ffx.f0("CX:bindToLifecycle"));
        try {
            e eVar = rdyVar.e;
            if (eVar == null) {
                b2 = 0;
            } else {
                lm7 lm7Var = eVar.g;
                if (lm7Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                b2 = lm7Var.b.b();
            }
            if (b2 == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            rdy.d(rdyVar, 1);
            ody e = rdy.e(rdyVar, peyVar, xs7Var, new pbj(j73.A(jVarArr2)));
            Trace.endSection();
            return e;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean e(xs7 xs7Var) {
        boolean z;
        rdy rdyVar = this.a;
        Trace.beginSection(ffx.f0("CX:hasCamera"));
        try {
            xs7Var.c(rdyVar.e.a.c());
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        Trace.endSection();
        return z;
    }

    public final void f(j... jVarArr) {
        int b2;
        rdy rdyVar = this.a;
        j[] jVarArr2 = (j[]) Arrays.copyOf(jVarArr, jVarArr.length);
        Trace.beginSection(ffx.f0("CX:unbind"));
        try {
            tob1.b();
            e eVar = rdyVar.e;
            if (eVar == null) {
                b2 = 0;
            } else {
                lm7 lm7Var = eVar.g;
                if (lm7Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                b2 = lm7Var.b.b();
            }
            if (b2 == 2) {
                throw new UnsupportedOperationException("Unbind UseCase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            rdyVar.d.j(new pbj(j73.A(jVarArr2)), rdyVar.h);
        } finally {
            Trace.endSection();
        }
    }

    public final void g() {
        this.a.g();
    }
}
