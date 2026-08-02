package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.g;
import androidx.compose.ui.semantics.a;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import defpackage.b64;
import defpackage.j6y;
import defpackage.lxv;
import defpackage.q5y;
import defpackage.tje;

/* loaded from: classes10.dex */
public final class j6y extends e530 implements gnq0 {
    public sls a;
    public e6y b;
    public Orientation c;
    public boolean w;
    public bhp0 x;
    public final ptw y = new ptw(9, this);
    public g z;

    public j6y(sls slsVar, e6y e6yVar, Orientation orientation, boolean z) {
        this.a = slsVar;
        this.b = e6yVar;
        this.c = orientation;
        this.w = z;
        E0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.foundation.lazy.layout.g] */
    public final void E0() {
        this.x = new bhp0(new i6y(this, 0), new i6y(this, 1));
        this.z = this.w ? new tls() { // from class: androidx.compose.foundation.lazy.layout.g
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int intValue = ((Integer) obj).intValue();
                j6y j6yVar = j6y.this;
                q5y q5yVar = (q5y) j6yVar.a.invoke();
                if (intValue < 0 || intValue >= q5yVar.getItemCount()) {
                    StringBuilder t = b64.t(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    t.append(q5yVar.getItemCount());
                    t.append(')');
                    lxv.a(t.toString());
                }
                tje.N(j6yVar.getCoroutineScope(), null, null, new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(j6yVar, intValue, null), 3);
                return Boolean.TRUE;
            }
        } : null;
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        f.v(mnq0Var);
        mnq0Var.a(d.N, this.y);
        Orientation orientation = this.c;
        Orientation orientation2 = Orientation.Vertical;
        bhp0 bhp0Var = this.x;
        if (orientation == orientation2) {
            if (bhp0Var == null) {
                bhp0Var = null;
            }
            androidx.compose.ui.semantics.g gVar = d.w;
            kgx kgxVar = f.a[13];
            mnq0Var.a(gVar, bhp0Var);
        } else {
            if (bhp0Var == null) {
                bhp0Var = null;
            }
            androidx.compose.ui.semantics.g gVar2 = d.v;
            kgx kgxVar2 = f.a[12];
            mnq0Var.a(gVar2, bhp0Var);
        }
        g gVar3 = this.z;
        if (gVar3 != null) {
            mnq0Var.a(a.f, new ag(null, gVar3));
        }
        f.b(mnq0Var, new i6y(this, 2));
        f.j(mnq0Var, this.b.e());
    }
}
