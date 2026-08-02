package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import defpackage.yvf0;

/* loaded from: classes.dex */
public final class e implements yvf0 {
    public final yvf0 a;
    public final yvf0 b;
    public final yvf0 c;

    public e(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3) {
        this.a = yvf0Var;
        this.b = yvf0Var2;
        this.c = yvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new SchemaManager((Context) this.a.get(), (String) this.b.get(), ((Integer) this.c.get()).intValue());
    }
}
