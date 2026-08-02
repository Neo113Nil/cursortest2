package com.yandex.plus.home.feature.webviews.internal;

import defpackage.bv80;
import defpackage.ffx;
import defpackage.jse;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class d {
    public final jse a;
    public final n0 b = ffx.c(0, 0, null, 7);

    public d(jse jseVar) {
        this.a = jseVar;
    }

    public final Object a(bv80 bv80Var, SuspendLambda suspendLambda) {
        Object k0 = tje.k0(this.a, new WebViewMessageReceiver$sendWebViewMessage$2(this, bv80Var, null), suspendLambda);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
