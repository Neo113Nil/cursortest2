package defpackage;

import androidx.compose.foundation.text.selection.g;

/* loaded from: classes10.dex */
public final class mkq0 implements yly0 {
    public long a = 0;
    public long b = 0;
    public dkq0 c = wfz.Q;
    public final /* synthetic */ kkq0 d;
    public final /* synthetic */ zkq0 e;
    public final /* synthetic */ long f;

    public mkq0(kkq0 kkq0Var, zkq0 zkq0Var, long j) {
        this.d = kkq0Var;
        this.e = zkq0Var;
        this.f = j;
    }

    @Override // defpackage.yly0
    public final void a() {
    }

    @Override // defpackage.yly0
    public final void b(long j) {
        rzx rzxVar = (rzx) this.d.invoke();
        if (rzxVar == null || !rzxVar.d()) {
            return;
        }
        zkq0 zkq0Var = this.e;
        if (alq0.a(zkq0Var, this.f)) {
            long f = wu60.f(this.b, j);
            this.b = f;
            long f2 = wu60.f(this.a, f);
            if (zkq0Var.b(rzxVar, f2, this.a, this.c, true)) {
                this.a = f2;
                this.b = 0L;
            }
        }
    }

    @Override // defpackage.yly0
    public final void c(long j, dkq0 dkq0Var) {
        this.c = dkq0Var;
        rzx rzxVar = (rzx) this.d.invoke();
        zkq0 zkq0Var = this.e;
        if (rzxVar != null) {
            if (!rzxVar.d()) {
                return;
            }
            dkq0 dkq0Var2 = this.c;
            alb0 alb0Var = zkq0Var.f;
            if (alb0Var != null) {
                alb0Var.invoke(Boolean.TRUE, rzxVar, new wu60(j), dkq0Var2);
            }
            this.a = j;
        }
        if (alq0.a(zkq0Var, this.f)) {
            this.b = 0L;
        }
    }

    @Override // defpackage.yly0
    public final void d() {
    }

    @Override // defpackage.yly0
    public final void onCancel() {
        g gVar;
        long j = this.f;
        zkq0 zkq0Var = this.e;
        if (!alq0.a(zkq0Var, j) || (gVar = zkq0Var.h) == null) {
            return;
        }
        gVar.invoke();
    }

    @Override // defpackage.yly0
    public final void onStop() {
        g gVar;
        long j = this.f;
        zkq0 zkq0Var = this.e;
        if (!alq0.a(zkq0Var, j) || (gVar = zkq0Var.h) == null) {
            return;
        }
        gVar.invoke();
    }
}
