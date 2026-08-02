package com.yandex.passport.sloth;

import defpackage.fse;
import defpackage.g6u;
import defpackage.jl40;
import defpackage.qhw0;
import defpackage.tse;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class h implements tse, Closeable {
    public final com.yandex.passport.common.coroutine.a a;
    public final z0 b;
    public qhw0 c;

    public h(com.yandex.passport.common.coroutine.a aVar, z0 z0Var) {
        this.a = aVar;
        this.b = z0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qhw0 qhw0Var = this.c;
        if (qhw0Var == null) {
            qhw0Var = jl40.a();
            this.c = qhw0Var;
            qhw0Var.w(new com.yandex.passport.internal.analytics.a0(22, this));
        }
        qhw0Var.a(null);
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        g6u g6uVar = ((com.yandex.passport.common.coroutine.b) this.a).b;
        qhw0 qhw0Var = this.c;
        if (qhw0Var == null) {
            qhw0Var = jl40.a();
            this.c = qhw0Var;
            qhw0Var.w(new com.yandex.passport.internal.analytics.a0(22, this));
        }
        return g6uVar.plus(qhw0Var);
    }
}
