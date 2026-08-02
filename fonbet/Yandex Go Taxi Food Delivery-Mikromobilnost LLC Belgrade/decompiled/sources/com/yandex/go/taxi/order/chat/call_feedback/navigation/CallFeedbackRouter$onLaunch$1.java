package com.yandex.go.taxi.order.chat.call_feedback.navigation;

import com.yandex.go.taxi.order.chat.call_feedback.ui.CallFeedbackQuestionModalView;
import defpackage.kh7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.chat.call_feedback.navigation.CallFeedbackRouter$onLaunch$1", f = "CallFeedbackRouter.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CallFeedbackRouter$onLaunch$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallFeedbackRouter$onLaunch$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CallFeedbackRouter$onLaunch$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CallFeedbackRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(2000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        a aVar = this.this$0;
        aVar.getClass();
        aVar.F.s(new CallFeedbackQuestionModalView(aVar.E, (kh7) aVar.H.get(), new CallFeedbackRouter$showCallFeedbackView$view$1(1, aVar, a.class, "showNotification", "showNotification(Lcom/yandex/go/taxi/order/chat/call_feedback/domain/NotificationForm;)V", 0), new CallFeedbackRouter$showCallFeedbackView$view$2(0, aVar, a.class, "dismiss", "dismiss()V", 0)), true);
        return zy11.a;
    }
}
