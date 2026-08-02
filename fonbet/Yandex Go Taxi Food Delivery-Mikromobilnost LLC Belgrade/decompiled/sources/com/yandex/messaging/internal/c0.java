package com.yandex.messaging.internal;

import defpackage.e1k;
import defpackage.jqr;
import defpackage.op21;
import defpackage.pzt0;
import defpackage.smt0;
import defpackage.tmt0;

/* loaded from: classes15.dex */
public final class c0 implements e1k {
    public final Object a;
    public final pzt0 b;
    public final /* synthetic */ smt0 c;

    public c0(smt0 smt0Var, Object obj, String str) {
        this.c = smt0Var;
        this.a = obj;
        tmt0 tmt0Var = smt0Var.z;
        this.b = kotlinx.coroutines.flow.e.H(tmt0Var.b, new jqr(kotlinx.coroutines.flow.e.t(tmt0Var.d.a(new op21(str))), new SpannableMessageObservable$Subscription$NameSubscription$userNameSubscription$1(this, tmt0Var, null), 3));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.a(null);
    }
}
