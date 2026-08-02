package com.yandex.go.inapp_calls.repository;

import android.content.Context;
import com.yandex.go.dynamic.api.DynamicFeature;
import com.yandex.go.inapp_calls.InAppCallsDynamicApi;
import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import com.yandex.go.inapp_calls.experiment.q;
import defpackage.avj0;
import defpackage.b8n;
import defpackage.ctq;
import defpackage.d6z;
import defpackage.d8n;
import defpackage.evu0;
import defpackage.i7n;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.njv;
import defpackage.ny61;
import defpackage.rjv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$2$1", f = "InAppCallsFeatureWrapper.kt", l = {142}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class InAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$2$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$2$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$2$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            q qVar = this.this$0.a;
            this.label = 1;
            obj = qVar.d.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        InAppCallExperiment inAppCallExperiment = (InAppCallExperiment) obj;
        InAppCallExperiment.Companion.getClass();
        if (!jl40.l(inAppCallExperiment, InAppCallExperiment.r)) {
            i7n i7nVar = this.this$0.c;
            DynamicFeature dynamicFeature = DynamicFeature.INAPP_CALLS;
            ((com.yandex.go.dynamic.impl.b) i7nVar).getClass();
            d8n n = com.yandex.go.dynamic.impl.b.n(dynamicFeature);
            if (n instanceof b8n) {
                b8n b8nVar = (b8n) n;
                InAppCallsDynamicApi inAppCallsDynamicApi = (InAppCallsDynamicApi) b8nVar.a;
                c cVar = this.this$0;
                Context context = cVar.e;
                njv njvVar = cVar.d;
                String Y = d6z.Y(inAppCallExperiment, inAppCallExperiment.p.a);
                String str = inAppCallExperiment.p.b;
                String Y2 = str != null ? d6z.Y(inAppCallExperiment, str) : null;
                if (Y2 == null || evu0.J(Y2)) {
                    Y2 = ((avj0) cVar.f).h(kyh0.inapp_call_notification_channel_name);
                }
                inAppCallsDynamicApi.h(new rjv(context, njvVar, Y, Y2, d6z.Y(inAppCallExperiment, inAppCallExperiment.f.a), new ctq(13, cVar), cVar.h, cVar.a));
                this.this$0.j = (InAppCallsDynamicApi) b8nVar.a;
                return zy11Var;
            }
        }
        return zy11Var;
    }
}
