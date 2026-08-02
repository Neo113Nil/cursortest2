package com.yandex.go.business.impl.domain;

import defpackage.i3y;
import defpackage.iq41;
import defpackage.mdh;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zf2;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class g {
    public final iq41 a;
    public final tt2 b;
    public final i3y c;

    public g(rqo rqoVar, iq41 iq41Var, tt2 tt2Var) {
        this.a = iq41Var;
        this.b = tt2Var;
        this.c = kotlin.a.b(LazyThreadSafetyMode.NONE, new zf2(rqoVar, 21));
    }

    public final Object a(Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new YangoBusinessInteractorImpl$yangoBusinessUrl$2(this, null), continuation);
    }
}
