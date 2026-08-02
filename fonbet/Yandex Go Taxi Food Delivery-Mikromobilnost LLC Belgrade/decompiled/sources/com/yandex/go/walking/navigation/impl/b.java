package com.yandex.go.walking.navigation.impl;

import defpackage.f541;
import defpackage.n541;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.sy60;
import java.util.List;

/* loaded from: classes14.dex */
public final class b implements sy60 {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    public final void n1() {
        c cVar = this.a;
        f541 f541Var = (f541) cVar.x;
        if (f541Var != null) {
            List list = f541Var.c;
            n541 n541Var = list.size() >= 2 ? new n541(list) : null;
            if (n541Var == null) {
                return;
            }
            pzt0 pzt0Var = cVar.L;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            cVar.L = com.yandex.go.coroutines.b.g(cVar.o(), null, null, new WalkNavRootInternalRouter$loadRoute$2(cVar, null), 3);
            com.yandex.go.coroutines.b.g(cVar.o(), null, null, new WalkNavRootInternalRouter$loadRoute$3(cVar, f541Var, n541Var, null), 3);
        }
    }
}
