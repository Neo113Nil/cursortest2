package androidx.compose.runtime;

import defpackage.ban;
import defpackage.e3t0;
import defpackage.i7u0;
import defpackage.j131;
import defpackage.jl40;
import defpackage.k7y;
import defpackage.ngd0;
import defpackage.rwd;
import defpackage.sls;
import defpackage.vvf0;

/* loaded from: classes.dex */
public abstract class h {
    public final k7y a;

    public h(sls slsVar) {
        this.a = new k7y(slsVar);
    }

    public abstract vvf0 a(Object obj);

    public j131 b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j131 c(vvf0 vvf0Var, j131 j131Var) {
        ban banVar = null;
        if (j131Var instanceof ban) {
            if (vvf0Var.d) {
                banVar = (ban) j131Var;
                banVar.a.setValue(vvf0Var.a());
            }
        } else if (j131Var instanceof i7u0) {
            if ((vvf0Var.b || vvf0Var.e != null) && !vvf0Var.d) {
                i7u0 i7u0Var = (i7u0) j131Var;
                if (jl40.l(vvf0Var.a(), i7u0Var.a)) {
                    banVar = i7u0Var;
                }
            }
        } else if (j131Var instanceof rwd) {
            vvf0Var.getClass();
        }
        if (banVar != null) {
            return banVar;
        }
        if (!vvf0Var.d) {
            return new i7u0(vvf0Var.a());
        }
        Object obj = vvf0Var.e;
        e3t0 e3t0Var = vvf0Var.c;
        if (e3t0Var == null) {
            e3t0Var = ngd0.F;
        }
        return new ban(new ParcelableSnapshotMutableState(obj, e3t0Var));
    }
}
