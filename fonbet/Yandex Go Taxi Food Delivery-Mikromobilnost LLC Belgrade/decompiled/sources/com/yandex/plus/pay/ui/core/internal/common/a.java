package com.yandex.plus.pay.ui.core.internal.common;

import defpackage.bvf0;
import defpackage.lj;
import defpackage.n4u0;
import defpackage.v7d0;
import defpackage.zgd0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class a {
    public final n4u0 a;
    public final com.yandex.plus.pay.ui.core.internal.config.a b;
    public final v7d0 c;
    public volatile String d;
    public volatile String e;

    public a(r0 r0Var, com.yandex.plus.pay.ui.core.internal.config.a aVar, v7d0 v7d0Var) {
        this.a = r0Var;
        this.b = aVar;
        this.c = v7d0Var;
    }

    public final Object a(Continuation continuation) {
        Long id = ((lj) this.a.getValue()).getId();
        if (id == null) {
            return null;
        }
        Object n = bvf0.n(new PlusPayUserStateProviderImpl$getUserState$2$1(id.longValue(), this, false, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : (zgd0) n;
    }
}
