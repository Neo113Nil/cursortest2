package com.yandex.go.blockeduser.data;

import defpackage.bvf0;
import defpackage.gci0;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.m46;
import defpackage.tje;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class c {
    public final e a;
    public final hbp0 b;
    public final r0 c;
    public final gci0 d;
    public final b e;

    public c(hit hitVar, e eVar) {
        this.a = eVar;
        this.b = hitVar.a;
        r0 c = bvf0.c(null);
        this.c = c;
        gci0 d = kotlinx.coroutines.flow.e.d(c);
        this.d = d;
        this.e = new b(d, this);
    }

    public final boolean a() {
        return this.d.a.getValue() != null;
    }

    public final void b(m46 m46Var) {
        tje.N(this.b, null, null, new BlockedUserRepositoryImpl$setBlockedUser$1(this, m46Var, null), 3);
    }
}
