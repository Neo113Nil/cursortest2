package com.yandex.go.design.compose.images;

import androidx.compose.runtime.f;
import defpackage.dui0;
import defpackage.igd;
import defpackage.nvi0;
import defpackage.oz40;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wwy;

/* loaded from: classes12.dex */
public final class c implements dui0 {
    public final nvi0 a;
    public final tse b;
    public final igd c;
    public final oz40 w;
    public pzt0 x;
    public final oz40 y = f.j(wwy.a);

    public c(nvi0 nvi0Var, tse tseVar, igd igdVar, oz40 oz40Var) {
        this.a = nvi0Var;
        this.b = tseVar;
        this.c = igdVar;
        this.w = oz40Var;
    }

    @Override // defpackage.dui0
    public final void b() {
        if (this.x == null) {
            this.x = tje.N(this.b, uyj.a, null, new LoadingImageStateHolder$onRemembered$1(this, null), 2);
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
