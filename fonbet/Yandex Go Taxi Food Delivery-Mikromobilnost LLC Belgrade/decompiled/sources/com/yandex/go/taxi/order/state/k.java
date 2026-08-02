package com.yandex.go.taxi.order.state;

import defpackage.il70;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.ul70;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements vpr {
    public final /* synthetic */ l a;
    public final /* synthetic */ il70 b;

    public k(l lVar, il70 il70Var) {
        this.a = lVar;
        this.b = il70Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        this.a.B.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new OrderCancelPresenter$attachView$1$4$1(this.b, (ul70) obj, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
