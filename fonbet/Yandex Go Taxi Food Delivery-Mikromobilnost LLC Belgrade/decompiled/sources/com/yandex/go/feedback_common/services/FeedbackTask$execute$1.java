package com.yandex.go.feedback_common.services;

import com.yandex.go.feedback_common.data.FeedbackApi;
import com.yandex.go.feedback_common.data.model.FeedbackParam;
import defpackage.a3y0;
import defpackage.cmt;
import defpackage.crq0;
import defpackage.kvq;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.quq;
import defpackage.tse;
import defpackage.wls;
import defpackage.ztq;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.network.api.models.GoApiHttpException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.feedback_common.services.FeedbackTask$execute$1", f = "FeedbackTask.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class FeedbackTask$execute$1 extends SuspendLambda implements wls {
    final /* synthetic */ quq $callback;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FeedbackTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackTask$execute$1(quq quqVar, FeedbackTask feedbackTask, Continuation continuation) {
        super(2, continuation);
        this.$callback = quqVar;
        this.this$0 = feedbackTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FeedbackTask$execute$1 feedbackTask$execute$1 = new FeedbackTask$execute$1(this.$callback, this.this$0, continuation);
        feedbackTask$execute$1.L$0 = obj;
        return feedbackTask$execute$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackTask$execute$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        a3y0 a3y0Var;
        FeedbackParam feedbackParam;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                quq quqVar = this.$callback;
                FeedbackTask feedbackTask = this.this$0;
                FeedbackApi feedbackApi = ((ztq) quqVar).b;
                feedbackParam = feedbackTask.feedbackParam;
                cmt<zy11> b = feedbackApi.b(feedbackParam);
                this.L$0 = tseVar;
                this.L$1 = null;
                this.label = 1;
                if (ru.yandex.taxi.network.api.a.a(b, null, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        FeedbackTask feedbackTask2 = this.this$0;
        quq quqVar2 = this.$callback;
        if (!(failure instanceof Result.Failure)) {
            crq0.b(feedbackTask2.f());
            ((ztq) quqVar2).b();
        }
        FeedbackTask feedbackTask3 = this.this$0;
        quq quqVar3 = this.$callback;
        Throwable a = Result.a(failure);
        if (a != null) {
            if (a instanceof GoApiHttpException) {
                FeedbackTask.c(feedbackTask3, (GoApiHttpException) a, quqVar3);
            } else {
                a3y0Var = feedbackTask3.logger;
                a3y0Var.b("execute", a, new kvq(tseVar, 0));
                ((ztq) quqVar3).a();
            }
        }
        return new Result(failure);
    }
}
