package com.yandex.go.walking.navigation.impl;

import com.yandex.mapkit.navigation.transport.Navigation;
import defpackage.f541;
import defpackage.h55;
import defpackage.jcg;
import defpackage.n541;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.usx0;
import defpackage.w041;
import defpackage.xv8;
import defpackage.yvf0;
import defpackage.z6x0;
import java.util.List;

/* loaded from: classes14.dex */
public final class c extends h55 {
    public final jcg D;
    public final yvf0 E;
    public final yvf0 F;
    public final yvf0 G;
    public final com.yandex.go.walking.navigation.impl.domain.interactor.a H;
    public final com.yandex.go.walking.navigation.impl.navigation_core.guidance.b I;
    public final com.yandex.go.walking.navigation.impl.navigation_core.b J;
    public final w041 K;
    public pzt0 L;

    public c(jcg jcgVar, usx0 usx0Var, xv8 xv8Var, z6x0 z6x0Var, com.yandex.go.walking.navigation.impl.domain.interactor.a aVar, com.yandex.go.walking.navigation.impl.navigation_core.guidance.b bVar, com.yandex.go.walking.navigation.impl.navigation_core.b bVar2, w041 w041Var) {
        super(null);
        this.D = jcgVar;
        this.E = usx0Var;
        this.F = xv8Var;
        this.G = z6x0Var;
        this.H = aVar;
        this.I = bVar;
        this.J = bVar2;
        this.K = w041Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = null;
        Navigation navigation = this.J.c;
        if (navigation != null) {
            navigation.resetRoutes();
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        f541 f541Var = (f541) obj;
        String str = f541Var.d;
        String str2 = f541Var.e;
        w041 w041Var = this.K;
        w041Var.a = str;
        w041Var.b = str2;
        List list = f541Var.c;
        n541 n541Var = list.size() >= 2 ? new n541(list) : null;
        if (n541Var == null) {
            r(new qu(9));
            return;
        }
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = com.yandex.go.coroutines.b.g(o(), null, null, new WalkNavRootInternalRouter$loadRoute$2(this, null), 3);
        com.yandex.go.coroutines.b.g(o(), null, null, new WalkNavRootInternalRouter$loadRoute$3(this, f541Var, n541Var, null), 3);
    }
}
