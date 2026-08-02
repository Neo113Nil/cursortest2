package com.yandex.go.feedsdk.log;

import defpackage.lqq;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ont;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/feedsdk/log/experiments/FeedSdkErrorReportingExperiment;", "<anonymous>", "(Ltse;)Lcom/yandex/go/feedsdk/log/experiments/FeedSdkErrorReportingExperiment;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.feedsdk.log.GoFeedSdkErrorLoggerFactoryFactory$experimentProvider$1", f = "GoFeedSdkErrorLoggerFactoryFactory.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class GoFeedSdkErrorLoggerFactoryFactory$experimentProvider$1 extends SuspendLambda implements wls {
    final /* synthetic */ lqq $errorReportingExperimentRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoFeedSdkErrorLoggerFactoryFactory$experimentProvider$1(lqq lqqVar, Continuation continuation) {
        super(2, continuation);
        this.$errorReportingExperimentRepository = lqqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoFeedSdkErrorLoggerFactoryFactory$experimentProvider$1(this.$errorReportingExperimentRepository, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GoFeedSdkErrorLoggerFactoryFactory$experimentProvider$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        lqq lqqVar = this.$errorReportingExperimentRepository;
        this.label = 1;
        Object b = ((ont) lqqVar).a.b(this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
