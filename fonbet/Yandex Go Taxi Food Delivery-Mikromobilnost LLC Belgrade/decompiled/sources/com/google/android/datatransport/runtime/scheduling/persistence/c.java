package com.google.android.datatransport.runtime.scheduling.persistence;

import defpackage.j64;
import defpackage.s3c;
import defpackage.yvf0;

/* loaded from: classes.dex */
public final class c implements yvf0 {
    public final yvf0 a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;

    public c(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5) {
        this.a = yvf0Var;
        this.b = yvf0Var2;
        this.c = yvf0Var3;
        this.d = yvf0Var4;
        this.e = yvf0Var5;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new b((s3c) this.a.get(), (s3c) this.b.get(), (j64) this.c.get(), (SchemaManager) this.d.get(), this.e);
    }
}
