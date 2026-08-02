package com.yandex.go.taxi.order.feedback.domain;

import com.yandex.go.feedback_common.data.model.FeedbackParam;
import com.yandex.go.feedback_common.services.d;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/feedback_common/data/model/FeedbackParam;", "feedbackParam", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/feedback_common/data/model/FeedbackParam;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.feedback.domain.UserFeedbackRepositoryImpl$addFeedbackTask$2", f = "UserFeedbackRepositoryImpl.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class UserFeedbackRepositoryImpl$addFeedbackTask$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserFeedbackRepositoryImpl$addFeedbackTask$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserFeedbackRepositoryImpl$addFeedbackTask$2 userFeedbackRepositoryImpl$addFeedbackTask$2 = new UserFeedbackRepositoryImpl$addFeedbackTask$2(this.this$0, continuation);
        userFeedbackRepositoryImpl$addFeedbackTask$2.L$0 = obj;
        return userFeedbackRepositoryImpl$addFeedbackTask$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserFeedbackRepositoryImpl$addFeedbackTask$2) create((FeedbackParam) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FeedbackParam feedbackParam = (FeedbackParam) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0.c;
            this.L$0 = null;
            this.label = 1;
            if (dVar.a.a(feedbackParam, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
