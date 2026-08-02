package com.yandex.go.settings.domain;

import defpackage.gci0;
import defpackage.ney;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wsr0;
import defpackage.xk60;
import defpackage.xsr0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public final class c {
    public final xk60 a;
    public final ney b;
    public final gci0 c;

    public c(xk60 xk60Var, ney neyVar, tse tseVar) {
        this.a = xk60Var;
        this.b = neyVar;
        kotlinx.coroutines.flow.b g = e.g(new SystemNotificationsStateRepository$notificationsEnabled$1(this, null));
        sjh sjhVar = uyj.a;
        this.c = e.R(e.F(g, o400.a.x), tseVar, wsr0.a(xsr0.a, 3), Boolean.valueOf(xk60Var.b()));
    }
}
