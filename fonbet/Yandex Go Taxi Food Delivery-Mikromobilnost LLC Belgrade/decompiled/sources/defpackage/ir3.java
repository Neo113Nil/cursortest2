package defpackage;

import android.os.SystemClock;
import kotlin.NoWhenBranchMatchedException;
import ru.yandex.taxi.persuggest.repository.AutoFsSessionPhase;
import ru.yandex.taxi.persuggest.repository.a;

/* loaded from: classes9.dex */
public final class ir3 {
    public final cr3 a;
    public final a b;
    public long d;
    public long e;
    public long f;
    public long g;
    public v8e i;
    public v8e j;
    public AutoFsSessionPhase c = AutoFsSessionPhase.AwaitingCycleStart;
    public long h = -1;

    public ir3(ky2 ky2Var, cr3 cr3Var, a aVar) {
        this.a = cr3Var;
        this.b = aVar;
        ky2Var.d(new hy2(1, this));
    }

    public static void a(ir3 ir3Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((dr3) ir3Var.a).a()) {
            br3 br3Var = (br3) ((dr3) ir3Var.a).a.a.getValue();
            if (br3Var == null) {
                br3Var = br3.d;
            }
            ir3Var.f = br3Var.b();
            ir3Var.g = br3Var.a();
            int i = hr3.a[ir3Var.c.ordinal()];
            if (i == 1 || i == 2) {
                return;
            }
            if (i == 3) {
                long j = ir3Var.f;
                if (j <= 0 || elapsedRealtime - ir3Var.d < j) {
                    return;
                }
                ir3Var.c();
                return;
            }
            if (i != 4) {
                w511.b();
                return;
            }
            long j2 = ir3Var.g;
            if (j2 <= 0 || elapsedRealtime - ir3Var.e < j2) {
                return;
            }
            v8e v8eVar = ir3Var.j;
            if (v8eVar != null) {
                v8eVar.j();
            }
            ir3Var.j = null;
            ir3Var.c = AutoFsSessionPhase.ReadyForAutoFs;
        }
    }

    public final synchronized void b() {
        try {
            if (((dr3) this.a).a()) {
                int i = hr3.a[this.c.ordinal()];
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        v8e v8eVar = this.i;
                        if (v8eVar != null) {
                            v8eVar.j();
                        }
                        this.i = null;
                        v8e v8eVar2 = this.j;
                        if (v8eVar2 != null) {
                            v8eVar2.j();
                        }
                        this.j = null;
                        this.c = AutoFsSessionPhase.ReadyForAutoFs;
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        v8e v8eVar3 = this.j;
                        if (v8eVar3 != null) {
                            v8eVar3.j();
                        }
                        this.j = null;
                        this.c = AutoFsSessionPhase.ReadyForAutoFs;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        v8e v8eVar = this.i;
        if (v8eVar != null) {
            v8eVar.j();
        }
        this.i = null;
        this.e = SystemClock.elapsedRealtime();
        this.c = AutoFsSessionPhase.Silent;
        v8e v8eVar2 = this.j;
        if (v8eVar2 != null) {
            v8eVar2.j();
        }
        this.j = null;
        long j = this.g;
        if (j <= 0) {
            return;
        }
        this.j = this.b.a(j, new gr3(this, 1));
    }

    public final synchronized void d() {
        if (((dr3) this.a).a()) {
            if (this.c == AutoFsSessionPhase.WarmUp) {
                c();
            }
        }
    }
}
