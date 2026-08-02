package com.yandex.messaging.extension.flow;

import com.yandex.messaging.internal.authorized.sync.h;
import defpackage.e3n;
import defpackage.e9e;
import defpackage.ffx;
import defpackage.iqr;
import defpackage.jqr;
import defpackage.lz40;
import defpackage.mth;
import defpackage.pzt0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.z83;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.t0;

/* loaded from: classes15.dex */
public abstract class c {
    public static final k a(mth mthVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        return new k(new rol0(new FlowKt$autoClosing$1(mthVar, ref$ObjectRef, null)), new FlowKt$autoClosing$2(null, ref$ObjectRef));
    }

    public static final pzt0 b(tpr tprVar, tse tseVar, wls wlsVar) {
        return e.H(tseVar, new jqr(tprVar, new FlowKt$launchIn$2(wlsVar, null), 3));
    }

    public static final void c(tpr tprVar, tse tseVar, e9e e9eVar) {
        e.H(tseVar, new jqr(tprVar, new FlowKt$launchIn$1(e9eVar, null), 3));
    }

    public static final void d(lz40 lz40Var, Object obj) {
        lz40Var.g(obj);
        z83.i();
    }

    public static final t0 e(tpr tprVar, tse tseVar, e3n e3nVar, h hVar) {
        n0 c = ffx.c(1, 0, null, 6);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        e.H(tseVar, new k(e.I(e.t(new iqr(c.j(), 0)), new FlowKt$watchSubscription$1(ref$ObjectRef, hVar, e3nVar, null)), new FlowKt$watchSubscription$2(null, ref$ObjectRef)));
        return new t0(c, new FlowKt$watchSubscription$3(tprVar, null));
    }
}
