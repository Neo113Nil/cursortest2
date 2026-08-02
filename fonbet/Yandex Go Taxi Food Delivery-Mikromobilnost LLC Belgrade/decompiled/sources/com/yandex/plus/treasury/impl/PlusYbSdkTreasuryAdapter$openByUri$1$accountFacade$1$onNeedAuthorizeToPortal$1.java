package com.yandex.plus.treasury.impl;

import defpackage.lg51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.treasury.impl.PlusYbSdkTreasuryAdapter$openByUri$1$accountFacade$1$onNeedAuthorizeToPortal$1", f = "PlusYbSdkTreasuryAdapter.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusYbSdkTreasuryAdapter$openByUri$1$accountFacade$1$onNeedAuthorizeToPortal$1 extends SuspendLambda implements wls {
    final /* synthetic */ lg51 $resultListener;
    final /* synthetic */ c $this_runCatching;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusYbSdkTreasuryAdapter$openByUri$1$accountFacade$1$onNeedAuthorizeToPortal$1(a aVar, c cVar, lg51 lg51Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$this_runCatching = cVar;
        this.$resultListener = lg51Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlusYbSdkTreasuryAdapter$openByUri$1$accountFacade$1$onNeedAuthorizeToPortal$1 plusYbSdkTreasuryAdapter$openByUri$1$accountFacade$1$onNeedAuthorizeToPortal$1 = new PlusYbSdkTreasuryAdapter$openByUri$1$accountFacade$1$onNeedAuthorizeToPortal$1(this.this$0, this.$this_runCatching, this.$resultListener, continuation);
        plusYbSdkTreasuryAdapter$openByUri$1$accountFacade$1$onNeedAuthorizeToPortal$1.L$0 = obj;
        return plusYbSdkTreasuryAdapter$openByUri$1$accountFacade$1$onNeedAuthorizeToPortal$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusYbSdkTreasuryAdapter$openByUri$1$accountFacade$1$onNeedAuthorizeToPortal$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.go.plus.yb.integration.a aVar = this.$this_runCatching.b;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                b = aVar.b(this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                b = ((Result) obj).getValue();
            }
            kotlin.b.b(b);
            failure = zy11Var;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        lg51 lg51Var = this.$resultListener;
        if (!(failure instanceof Result.Failure)) {
            lg51Var.f();
        }
        lg51 lg51Var2 = this.$resultListener;
        Throwable a = Result.a(failure);
        if (a != null) {
            lg51Var2.d(a);
        }
        this.this$0.a.set(false);
        return zy11Var;
    }
}
