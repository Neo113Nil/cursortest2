package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.d0l0;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w811;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld0l0;", "route", "", "configHasTransport", "<anonymous>", "(Ld0l0;Z)Ld0l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.TransportRoutesLoadingInteractor$startLoading$2", f = "TransportRoutesLoadingInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TransportRoutesLoadingInteractor$startLoading$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ w811 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportRoutesLoadingInteractor$startLoading$2(w811 w811Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = w811Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        TransportRoutesLoadingInteractor$startLoading$2 transportRoutesLoadingInteractor$startLoading$2 = new TransportRoutesLoadingInteractor$startLoading$2(this.this$0, (Continuation) obj3);
        transportRoutesLoadingInteractor$startLoading$2.L$0 = (d0l0) obj;
        transportRoutesLoadingInteractor$startLoading$2.Z$0 = booleanValue;
        return transportRoutesLoadingInteractor$startLoading$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d0l0 d0l0Var = (d0l0) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z && !d0l0Var.b.isEmpty() && d0l0Var.h() != null) {
            return d0l0Var;
        }
        com.yandex.go.taxi.summary.mobilityhub.repository.b bVar = this.this$0.b;
        l8x l8xVar = bVar.e;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        r0 r0Var = bVar.c;
        Result result = new Result(EmptyList.a);
        r0Var.getClass();
        r0Var.m(null, result);
        return null;
    }
}
