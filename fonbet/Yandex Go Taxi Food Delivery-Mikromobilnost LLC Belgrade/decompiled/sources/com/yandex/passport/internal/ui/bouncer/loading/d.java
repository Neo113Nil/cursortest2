package com.yandex.passport.internal.ui.bouncer.loading;

import com.yandex.passport.internal.ui.bouncer.t;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class d implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final yvf0 c;

    public /* synthetic */ d(xvf0 xvf0Var, yvf0 yvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = yvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.c;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new c((e) xvf0Var.get(), (t) yvf0Var.get());
            default:
                return new f((g) xvf0Var.get(), (t) yvf0Var.get());
        }
    }
}
