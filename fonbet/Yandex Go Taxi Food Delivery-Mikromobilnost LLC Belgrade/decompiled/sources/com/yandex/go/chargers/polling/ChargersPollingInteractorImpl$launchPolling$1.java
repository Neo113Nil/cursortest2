package com.yandex.go.chargers.polling;

import defpackage.c06;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sme0;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.ysa;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.polling.ChargersPollingInteractorImpl$launchPolling$1", f = "ChargersPollingInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPollingInteractorImpl$launchPolling$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $service;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPollingInteractorImpl$launchPolling$1(k kVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$service = str;
        this.$operationId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersPollingInteractorImpl$launchPolling$1(this.this$0, this.$service, this.$operationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersPollingInteractorImpl$launchPolling$1 chargersPollingInteractorImpl$launchPolling$1 = (ChargersPollingInteractorImpl$launchPolling$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersPollingInteractorImpl$launchPolling$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c06 c06Var = this.this$0.f;
        String str = this.$service;
        String str2 = this.$operationId;
        c06Var.getClass();
        String str3 = str + ":" + str2;
        ysa ysaVar = (ysa) c06Var.b;
        sme0 sme0Var = ysaVar.d;
        kgx[] kgxVarArr = ysa.e;
        ysaVar.d.setValue(ysaVar, kgxVarArr[1], v4r0.i((Set) sme0Var.getValue(ysaVar, kgxVarArr[1]), str3));
        return zy11.a;
    }
}
