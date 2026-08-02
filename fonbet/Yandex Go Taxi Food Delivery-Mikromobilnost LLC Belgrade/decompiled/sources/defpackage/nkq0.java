package defpackage;

import androidx.compose.foundation.text.selection.g;

/* loaded from: classes10.dex */
public final class nkq0 implements fb30 {
    public long a = 0;
    public final /* synthetic */ kkq0 b;
    public final /* synthetic */ zkq0 c;
    public final /* synthetic */ long d;

    public nkq0(kkq0 kkq0Var, zkq0 zkq0Var, long j) {
        this.b = kkq0Var;
        this.c = zkq0Var;
        this.d = j;
    }

    @Override // defpackage.fb30
    public final void a() {
        g gVar = this.c.h;
        if (gVar != null) {
            gVar.invoke();
        }
    }

    @Override // defpackage.fb30
    public final boolean b(long j, dkq0 dkq0Var, int i) {
        rzx rzxVar = (rzx) this.b.invoke();
        if (rzxVar == null || !rzxVar.d()) {
            return false;
        }
        zkq0 zkq0Var = this.c;
        alb0 alb0Var = zkq0Var.f;
        if (alb0Var != null) {
            alb0Var.invoke(Boolean.FALSE, rzxVar, new wu60(j), dkq0Var);
        }
        this.a = j;
        return alq0.a(zkq0Var, this.d);
    }

    @Override // defpackage.fb30
    public final boolean c(long j, dkq0 dkq0Var) {
        rzx rzxVar = (rzx) this.b.invoke();
        if (rzxVar == null) {
            return true;
        }
        if (!rzxVar.d()) {
            return false;
        }
        zkq0 zkq0Var = this.c;
        if (!alq0.a(zkq0Var, this.d)) {
            return false;
        }
        if (!zkq0Var.b(rzxVar, j, this.a, dkq0Var, false)) {
            return true;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.fb30
    public final boolean d(long j) {
        rzx rzxVar = (rzx) this.b.invoke();
        if (rzxVar == null) {
            return true;
        }
        if (!rzxVar.d()) {
            return false;
        }
        zkq0 zkq0Var = this.c;
        if (!alq0.a(zkq0Var, this.d)) {
            return false;
        }
        if (!zkq0Var.b(rzxVar, j, this.a, wfz.Q, false)) {
            return true;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.fb30
    public final boolean e(long j) {
        rzx rzxVar = (rzx) this.b.invoke();
        if (rzxVar == null || !rzxVar.d()) {
            return false;
        }
        long j2 = this.a;
        dkq0 dkq0Var = wfz.Q;
        zkq0 zkq0Var = this.c;
        if (zkq0Var.b(rzxVar, j, j2, dkq0Var, false)) {
            this.a = j;
        }
        return alq0.a(zkq0Var, this.d);
    }
}
