package com.ybsdk.common;

import com.ybsdk.rconfig.configs.ResponseCacheConfigExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppp0;
import defpackage.tse;
import defpackage.tvj0;
import defpackage.wls;
import defpackage.ws51;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.SdkStateDispatcher$setMetricaAppEnvironmentValues$1", f = "SdkStateDispatcher.kt", l = {349}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class SdkStateDispatcher$setMetricaAppEnvironmentValues$1 extends SuspendLambda implements wls {
    final /* synthetic */ Long $uid;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkStateDispatcher$setMetricaAppEnvironmentValues$1(e eVar, Long l, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$uid = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdkStateDispatcher$setMetricaAppEnvironmentValues$1(this.this$0, this.$uid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkStateDispatcher$setMetricaAppEnvironmentValues$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            eVar.d.a("is_insta_enabled", String.valueOf(((ResponseCacheConfigExperiment) ((com.ybsdk.rconfig.b) eVar.i.a).d(tvj0.a).getData()).getEnabled()));
            Long l = this.$uid;
            e eVar2 = this.this$0;
            if (l == null) {
                eVar2.d.a("has_plus", "");
                return zy11.a;
            }
            ppp0 ppp0Var = eVar2.e;
            long longValue = l.longValue();
            this.label = 1;
            g = ((com.ybsdk.feature.passport.impl.a) ppp0Var).g(longValue, this);
            if (g == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            g = ((Result) obj).getValue();
        }
        ws51 ws51Var = (ws51) (g instanceof Result.Failure ? null : g);
        if (ws51Var != null) {
            this.this$0.d.a("has_plus", String.valueOf(ws51Var.f));
        }
        return zy11.a;
    }
}
