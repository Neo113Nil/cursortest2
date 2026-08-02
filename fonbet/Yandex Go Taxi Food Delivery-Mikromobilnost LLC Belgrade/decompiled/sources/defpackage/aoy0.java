package defpackage;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.j;

/* loaded from: classes10.dex */
public final class aoy0 implements fb30 {
    public boolean a = true;
    public asy0 b;
    public final /* synthetic */ j c;

    public aoy0(j jVar) {
        this.c = jVar;
    }

    @Override // defpackage.fb30
    public final void a() {
        if (this.a) {
            j.b(this.c, this.b);
        }
    }

    @Override // defpackage.fb30
    public final boolean b(long j, dkq0 dkq0Var, int i) {
        oay oayVar;
        j jVar = this.c;
        if (!jVar.l() || jVar.o().a.b.length() == 0 || (oayVar = jVar.d) == null || oayVar.d() == null) {
            return false;
        }
        yur yurVar = jVar.l;
        if (yurVar != null) {
            yur.b(yurVar);
        }
        jVar.o = j;
        jVar.t = -1;
        jVar.h(true);
        long f = f(jVar.o(), jVar.o, true, dkq0Var);
        if (i >= 2) {
            this.a = true;
            this.b = new asy0(f);
        }
        return true;
    }

    @Override // defpackage.fb30
    public final boolean c(long j, dkq0 dkq0Var) {
        oay oayVar;
        j jVar = this.c;
        if (!jVar.l() || jVar.o().a.b.length() == 0 || (oayVar = jVar.d) == null || oayVar.d() == null) {
            return false;
        }
        f(jVar.o(), j, false, dkq0Var);
        return true;
    }

    @Override // defpackage.fb30
    public final boolean d(long j) {
        oay oayVar;
        j jVar = this.c;
        if (!jVar.l() || jVar.o().a.b.length() == 0 || (oayVar = jVar.d) == null || oayVar.d() == null) {
            return false;
        }
        f(jVar.o(), j, false, wfz.Q);
        return true;
    }

    @Override // defpackage.fb30
    public final boolean e(long j) {
        j jVar = this.c;
        oay oayVar = jVar.d;
        if (oayVar == null || oayVar.d() == null || !jVar.l()) {
            return false;
        }
        jVar.t = -1;
        yur yurVar = jVar.l;
        if (yurVar != null) {
            yur.b(yurVar);
        }
        f(jVar.o(), j, false, wfz.Q);
        return true;
    }

    public final long f(hoy0 hoy0Var, long j, boolean z, dkq0 dkq0Var) {
        j jVar = this.c;
        long c = j.c(jVar, hoy0Var, j, z, false, dkq0Var, false, null);
        if (!asy0.a(c, this.b)) {
            this.a = false;
        }
        jVar.r(asy0.c(c) ? HandleState.Cursor : HandleState.Selection);
        return c;
    }
}
