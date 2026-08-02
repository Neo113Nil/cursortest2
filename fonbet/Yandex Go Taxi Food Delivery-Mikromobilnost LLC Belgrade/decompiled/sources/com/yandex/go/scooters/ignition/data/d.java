package com.yandex.go.scooters.ignition.data;

import defpackage.bvf0;
import defpackage.kgx;
import defpackage.mdh;
import defpackage.mth;
import defpackage.qme0;
import defpackage.qv10;
import defpackage.qwo0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class d {
    public final tt2 a;
    public final qwo0 b;
    public final r0 c = bvf0.c(null);

    public d(tt2 tt2Var, qwo0 qwo0Var) {
        this.a = tt2Var;
        this.b = qwo0Var;
    }

    public static void d(d dVar, boolean z, boolean z2, int i) {
        qwo0 qwo0Var = dVar.b;
        if ((i & 1) != 0) {
            z = ((Boolean) qwo0Var.l.getValue(qwo0Var, qwo0.B[10])).booleanValue();
        }
        if ((i & 2) != 0) {
            z2 = ((Boolean) qwo0Var.m.getValue(qwo0Var, qwo0.B[11])).booleanValue();
        }
        qme0 qme0Var = qwo0Var.l;
        kgx[] kgxVarArr = qwo0.B;
        qme0Var.setValue(qwo0Var, kgxVarArr[10], Boolean.valueOf(z));
        qwo0Var.m.setValue(qwo0Var, kgxVarArr[11], Boolean.valueOf(z2));
        f(dVar);
    }

    public static boolean f(d dVar) {
        qwo0 qwo0Var = dVar.b;
        return dVar.e(((Boolean) qwo0Var.n.getValue(qwo0Var, qwo0.B[12])).booleanValue());
    }

    public final tpr a() {
        tpr t = kotlinx.coroutines.flow.e.t(new mth(new n(this.c, new ScootersIgnitionEnabledStateRepository$ignitionEnabledStateFlow$1(this, null)), 6));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(t, mdh.b);
    }

    public final boolean b() {
        qwo0 qwo0Var = this.b;
        qme0 qme0Var = qwo0Var.l;
        kgx[] kgxVarArr = qwo0.B;
        return ((Boolean) qme0Var.getValue(qwo0Var, kgxVarArr[10])).booleanValue() && ((Boolean) qwo0Var.m.getValue(qwo0Var, kgxVarArr[11])).booleanValue();
    }

    public final boolean c() {
        Boolean bool = (Boolean) this.c.getValue();
        return bool != null ? bool.booleanValue() : f(this);
    }

    public final boolean e(boolean z) {
        if (!b()) {
            z = false;
        }
        qwo0 qwo0Var = this.b;
        qwo0Var.n.setValue(qwo0Var, qwo0.B[12], Boolean.valueOf(z));
        qv10.B(z, this.c, null);
        return z;
    }
}
