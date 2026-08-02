package com.yandex.passport.internal.push;

import android.content.Context;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.permission.Permission;
import defpackage.qke;

/* loaded from: classes8.dex */
public final class k0 {
    public final Context a;
    public final com.yandex.passport.internal.properties.p b;
    public final com.yandex.passport.common.permission.c c;
    public final com.yandex.passport.internal.flags.j d;
    public final t0 e;

    public k0(Context context, com.yandex.passport.internal.properties.p pVar, com.yandex.passport.common.permission.c cVar, com.yandex.passport.internal.flags.j jVar, t0 t0Var) {
        this.a = context;
        this.b = pVar;
        this.c = cVar;
        this.d = jVar;
        this.e = t0Var;
    }

    public final EnqueueType a() {
        EnqueueType.Companion.getClass();
        if (((Boolean) this.d.b(com.yandex.passport.internal.flags.q.t)).booleanValue()) {
            return EnqueueType.COROUTINE;
        }
        Permission permission = Permission.WAKE_LOCK;
        com.yandex.passport.common.permission.b bVar = com.yandex.passport.common.permission.c.b;
        Context context = this.c.a;
        bVar.getClass();
        return qke.h(context, permission.getPermissionString()) == 0 ? EnqueueType.JOB_INTENT_SERVICE : EnqueueType.COROUTINE;
    }

    public final void b(Uid uid) {
        if (this.b.m.isEmpty()) {
            return;
        }
        this.e.a(a(), new o0(this.a, uid));
    }
}
