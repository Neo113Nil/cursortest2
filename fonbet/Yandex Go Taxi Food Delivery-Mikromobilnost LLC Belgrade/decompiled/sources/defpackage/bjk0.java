package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes14.dex */
public final class bjk0 implements ejk0 {
    public final ComposeView a;
    public final p9y0 b;
    public final oz40 c = f.j(ajk0.e);

    static {
        shd shdVar = ComposeView.Companion;
    }

    public bjk0(ComposeView composeView, p9y0 p9y0Var) {
        this.a = composeView;
        this.b = p9y0Var;
        co91.c(composeView, new a(-122810549, new zik0(this), true));
    }

    @Override // defpackage.ejk0
    public final View asView() {
        return this.a;
    }

    @Override // defpackage.ejk0
    public final void b(xss0 xss0Var, boolean z, kdc kdcVar, wrs0 wrs0Var) {
        this.c.setValue(new ajk0(xss0Var, z, kdcVar, wrs0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [f530] */
    public final void c(fid fidVar, int i) {
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-338146945);
        int i2 = (btsVar.k(this) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            ajk0 ajk0Var = (ajk0) this.c.getValue();
            kdc kdcVar = ajk0Var.c;
            c530 c530Var2 = c530.a;
            if (kdcVar == null) {
                btsVar.e0(-2037214364);
                btsVar.t(false);
                c530Var = null;
            } else {
                btsVar.e0(-2037214363);
                ?? c = bzk0.c(c530Var2, new up2(rzo.d(s8o.m(kdcVar, (Context) btsVar.m(AndroidCompositionLocals_androidKt.b)))), qke.q);
                btsVar.t(false);
                c530Var = c;
            }
            if (c530Var != null) {
                c530Var2 = c530Var;
            }
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c530Var2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            xss0 xss0Var = ajk0Var.a;
            boolean e = ((i2 & 14) == 4) | btsVar.e(ajk0Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new vxj0(6, this, ajk0Var);
                btsVar.o0(Q);
            }
            udb1.d(xss0Var, (tls) Q, ajk0Var.b, btsVar, 0);
            btsVar.e0(1419592861);
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zik0(this, i);
        }
    }
}
