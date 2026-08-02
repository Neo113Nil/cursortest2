package com.ybsdk.common;

import defpackage.em3;
import defpackage.fk3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.trp0;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "uid", "Lzy11;", "<anonymous>", "(J)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.SdkStateDispatcher$authorizeAndSendState$2", f = "SdkStateDispatcher.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class SdkStateDispatcher$authorizeAndSendState$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkStateDispatcher$authorizeAndSendState$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SdkStateDispatcher$authorizeAndSendState$2 sdkStateDispatcher$authorizeAndSendState$2 = new SdkStateDispatcher$authorizeAndSendState$2(this.this$0, continuation);
        sdkStateDispatcher$authorizeAndSendState$2.L$0 = obj;
        return sdkStateDispatcher$authorizeAndSendState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkStateDispatcher$authorizeAndSendState$2) create((Long) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Long l2 = (Long) this.L$0;
            fk3 fk3Var = this.this$0.b;
            this.L$0 = l2;
            this.label = 1;
            if (((com.ybsdk.common.repositiories.auth.a) fk3Var).d(l2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            l = l2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l = (Long) this.L$0;
            kotlin.b.b(obj);
        }
        trp0 trp0Var = trp0.a;
        trp0.f = l;
        em3 em3Var = this.this$0.d.d;
        boolean z = l == null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("isNull", Boolean.valueOf(z));
        em3Var.a.a("authentication.uid_updated", linkedHashMap);
        e eVar = this.this$0;
        tje.N(eVar.h, null, null, new SdkStateDispatcher$setMetricaAppEnvironmentValues$1(eVar, l, null), 3);
        return zy11.a;
    }
}
