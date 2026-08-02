package com.yandex.go.navigator.repository;

import defpackage.h901;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh901;", "it", "Lzy11;", "<anonymous>", "(Lh901;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.repository.GuidanceProgressContentRepository$trafficLineContentFlow$4", f = "GuidanceProgressContentRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GuidanceProgressContentRepository$trafficLineContentFlow$4 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuidanceProgressContentRepository$trafficLineContentFlow$4(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GuidanceProgressContentRepository$trafficLineContentFlow$4(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GuidanceProgressContentRepository$trafficLineContentFlow$4 guidanceProgressContentRepository$trafficLineContentFlow$4 = (GuidanceProgressContentRepository$trafficLineContentFlow$4) create((h901) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        guidanceProgressContentRepository$trafficLineContentFlow$4.invokeSuspend(zy11Var);
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
        this.this$0.c = true;
        return zy11.a;
    }
}
