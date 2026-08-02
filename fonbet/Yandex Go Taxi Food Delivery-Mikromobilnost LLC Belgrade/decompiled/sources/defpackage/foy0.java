package defpackage;

import androidx.compose.ui.platform.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfoy0;", "Lj530;", "Lgoy0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class foy0 extends j530 {
    public final ety0 a;

    public foy0(ety0 ety0Var) {
        this.a = ety0Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new goy0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof foy0)) {
            return false;
        }
        return jl40.l(this.a, ((foy0) obj).a);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        goy0 goy0Var = (goy0) e530Var;
        goy0Var.getClass();
        ety0 I = bb1.I(this.a, qje.P(goy0Var).S);
        goy0Var.E0(I, (dyr) npb1.c(goy0Var, j.k));
        aw40 aw40Var = goy0Var.c;
        if (aw40Var == null) {
            throw nzs.g("Min size state is not set.");
        }
        aw40.a(aw40Var, null, null, I, 23);
        qje.P(goy0Var).C();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
