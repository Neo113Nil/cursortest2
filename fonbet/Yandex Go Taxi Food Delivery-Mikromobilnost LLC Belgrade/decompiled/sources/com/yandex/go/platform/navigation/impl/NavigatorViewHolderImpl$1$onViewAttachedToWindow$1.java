package com.yandex.go.platform.navigation.impl;

import defpackage.o400;
import defpackage.sjh;
import defpackage.t850;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public /* synthetic */ class NavigatorViewHolderImpl$1$onViewAttachedToWindow$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object invoke(t850 t850Var, Continuation continuation) {
        d dVar = (d) this.receiver;
        dVar.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new NavigatorViewHolderImpl$onViewStateChanged$2(t850Var, dVar, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
