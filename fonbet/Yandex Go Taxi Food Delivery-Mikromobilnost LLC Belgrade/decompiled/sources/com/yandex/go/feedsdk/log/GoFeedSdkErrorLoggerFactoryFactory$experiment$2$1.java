package com.yandex.go.feedsdk.log;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/feedsdk/log/experiments/FeedSdkErrorReportingExperiment;", "<anonymous>", "(Ltse;)Lcom/yandex/go/feedsdk/log/experiments/FeedSdkErrorReportingExperiment;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.feedsdk.log.GoFeedSdkErrorLoggerFactoryFactory$experiment$2$1", f = "GoFeedSdkErrorLoggerFactoryFactory.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class GoFeedSdkErrorLoggerFactoryFactory$experiment$2$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoFeedSdkErrorLoggerFactoryFactory$experiment$2$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoFeedSdkErrorLoggerFactoryFactory$experiment$2$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GoFeedSdkErrorLoggerFactoryFactory$experiment$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        qoh qohVar = this.this$0.a;
        this.label = 1;
        Object s = qohVar.s(this);
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
