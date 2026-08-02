package com.ybsdk.feature.push.impl.data;

import defpackage.bvf0;
import defpackage.hh51;
import defpackage.m2g0;
import defpackage.qv10;
import defpackage.v5c0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class b {
    public final m2g0 a;
    public final v5c0 b;
    public final r0 c;
    public final m0 d;

    public b(m2g0 m2g0Var, v5c0 v5c0Var) {
        this.a = m2g0Var;
        this.b = v5c0Var;
        r0 c = bvf0.c(Boolean.valueOf(m2g0Var.a.getBoolean("isPushEnabledBySettings", true)));
        this.c = c;
        this.d = new m0(c, ((hh51) v5c0Var.b).j, new PushSubscriptionSettingsHolder$isPushEnabledFlow$1(this, null));
    }

    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final m0 b() {
        return this.d;
    }

    public final boolean c() {
        return a() && ((Boolean) ((hh51) this.b.b).j.getValue()).booleanValue();
    }

    public final void d(boolean z) {
        qv10.B(z, this.c, null);
        this.a.a.edit().putBoolean("isPushEnabledBySettings", z).apply();
    }
}
