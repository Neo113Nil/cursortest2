package com.yandex.go.design.compose.images;

import androidx.compose.runtime.f;
import defpackage.dui0;
import defpackage.igd;
import defpackage.oz40;
import defpackage.pzt0;
import defpackage.tbv;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wwy;

/* loaded from: classes12.dex */
public final class b implements dui0 {
    public final tbv a;
    public final tse b;
    public final igd c;
    public final oz40 w;
    public pzt0 x;
    public final oz40 y = f.j(wwy.a);

    public b(tbv tbvVar, tse tseVar, igd igdVar, oz40 oz40Var) {
        this.a = tbvVar;
        this.b = tseVar;
        this.c = igdVar;
        this.w = oz40Var;
    }

    @Override // defpackage.dui0
    public final void b() {
        if (this.x == null) {
            this.x = tje.N(this.b, uyj.a, null, new LoadingImageModelStateHolder$onRemembered$1(this, null), 2);
        }
    }

    @Override // defpackage.dui0
    public final void d() {
    }

    @Override // defpackage.dui0
    public final void e() {
        pzt0 pzt0Var = this.x;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.x = null;
        this.y.setValue(wwy.a);
    }
}
