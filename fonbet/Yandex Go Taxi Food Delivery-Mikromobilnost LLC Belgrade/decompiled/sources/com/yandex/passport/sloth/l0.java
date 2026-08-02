package com.yandex.passport.sloth;

import com.yandex.passport.sloth.data.SlothParams;
import defpackage.n3w;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class l0 implements v7p {
    public final /* synthetic */ int a = 1;
    public final n3w b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final xvf0 f;
    public final yvf0 g;

    public l0(n3w n3wVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, xvf0 xvf0Var) {
        this.b = n3wVar;
        this.c = yvf0Var;
        this.d = yvf0Var2;
        this.e = yvf0Var3;
        this.g = yvf0Var4;
        this.f = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.g;
        xvf0 xvf0Var = this.f;
        yvf0 yvf0Var2 = this.e;
        yvf0 yvf0Var3 = this.d;
        yvf0 yvf0Var4 = this.c;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new k0((SlothParams) n3wVar.a, (com.yandex.passport.internal.sloth.e) yvf0Var4.get(), (e) yvf0Var3.get(), (z0) yvf0Var2.get(), (v) yvf0Var.get(), (h) xvf0Var.get());
            default:
                return new com.yandex.passport.sloth.url.j((SlothParams) n3wVar.a, (com.yandex.passport.internal.sloth.f) yvf0Var4.get(), (com.yandex.passport.sloth.url.h) yvf0Var3.get(), (k0) yvf0Var2.get(), (l) xvf0Var.get(), (z0) yvf0Var.get());
        }
    }

    public l0(n3w n3wVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, xvf0 xvf0Var, yvf0 yvf0Var4) {
        this.b = n3wVar;
        this.c = yvf0Var;
        this.d = yvf0Var2;
        this.e = yvf0Var3;
        this.f = xvf0Var;
        this.g = yvf0Var4;
    }
}
