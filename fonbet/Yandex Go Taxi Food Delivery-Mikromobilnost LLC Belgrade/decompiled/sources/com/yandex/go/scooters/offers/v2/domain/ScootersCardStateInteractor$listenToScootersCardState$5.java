package com.yandex.go.scooters.offers.v2.domain;

import defpackage.gxo0;
import defpackage.hxo0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.two0;
import defpackage.wls;
import defpackage.wwo0;
import defpackage.xwo0;
import defpackage.y5n0;
import defpackage.z5n0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz5n0;", "it", "Lzy11;", "<anonymous>", "(Lz5n0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$listenToScootersCardState$5", f = "ScootersCardStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCardStateInteractor$listenToScootersCardState$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardStateInteractor$listenToScootersCardState$5(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersCardStateInteractor$listenToScootersCardState$5 scootersCardStateInteractor$listenToScootersCardState$5 = new ScootersCardStateInteractor$listenToScootersCardState$5(this.this$0, continuation);
        scootersCardStateInteractor$listenToScootersCardState$5.L$0 = obj;
        return scootersCardStateInteractor$listenToScootersCardState$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersCardStateInteractor$listenToScootersCardState$5 scootersCardStateInteractor$listenToScootersCardState$5 = (ScootersCardStateInteractor$listenToScootersCardState$5) create((z5n0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersCardStateInteractor$listenToScootersCardState$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gxo0 gxo0Var;
        z5n0 z5n0Var = (z5n0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z5n0Var instanceof y5n0) {
            hxo0 hxo0Var = this.this$0.l;
            two0 two0Var = ((y5n0) z5n0Var).j.d;
            r0 r0Var = hxo0Var.c;
            xwo0 xwo0Var = two0Var instanceof xwo0 ? (xwo0) two0Var : null;
            wwo0 wwo0Var = (xwo0Var == null || (gxo0Var = xwo0Var.a) == null) ? null : gxo0Var.a;
            hxo0.a aVar = (hxo0.a) r0Var.getValue();
            if (wwo0Var == null) {
                aVar = new hxo0.a((wwo0) null, 3);
            } else if (!jl40.l(aVar.a, wwo0Var)) {
                aVar = new hxo0.a(wwo0Var, 2);
            }
            r0Var.m(null, aVar);
        }
        this.this$0.h.a.l(z5n0Var);
        return zy11.a;
    }
}
