package com.yandex.passport.common.mvi;

import defpackage.ose;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public abstract class g extends ose {
    public g() {
        super(0);
    }

    @Override // defpackage.ose
    public final void c(Object obj) {
        tje.N(this.b, null, null, new SafeCoroutineExecutor$executeAction$1(this, obj, null), 3);
    }

    @Override // defpackage.ose
    public final void d(Object obj) {
        tje.N(this.b, null, null, new SafeCoroutineExecutor$executeIntent$1(this, obj, null), 3);
    }

    public Object h(Object obj, Continuation continuation) {
        return zy11.a;
    }

    public Object i(Object obj, Continuation continuation) {
        return zy11.a;
    }

    public abstract void j(Throwable th);
}
