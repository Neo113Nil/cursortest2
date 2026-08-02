package com.yandex.plus.home.common.utils;

import defpackage.ffx;
import defpackage.ike;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public abstract class c {
    public static n0 a() {
        return ffx.b(0, Integer.MAX_VALUE, BufferOverflow.SUSPEND);
    }

    public static final void b(tpr tprVar, tse tseVar, zls zlsVar) {
        tje.N(tseVar, null, null, new FlowExtKt$collectIn$1(tprVar, zlsVar, null), 3);
    }

    public static final pzt0 c(tpr tprVar, tse tseVar, wls wlsVar) {
        return tje.N(tseVar, null, null, new FlowExtKt$collectInScope$1(tprVar, wlsVar, null), 3);
    }

    public static final void d(tpr tprVar, tse tseVar, zls zlsVar) {
        tje.N(tseVar, null, null, new FlowExtKt$collectLatestIn$1(tprVar, zlsVar, null), 3);
    }

    public static final void e(tpr tprVar, ike ikeVar, wls wlsVar) {
        tje.N(ikeVar, null, null, new FlowExtKt$collectLatestInScope$1(tprVar, wlsVar, null), 3);
    }
}
