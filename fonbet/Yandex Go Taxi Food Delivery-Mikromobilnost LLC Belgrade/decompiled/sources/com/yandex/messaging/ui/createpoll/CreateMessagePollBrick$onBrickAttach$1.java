package com.yandex.messaging.ui.createpoll;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.evu0;
import defpackage.m7f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/messaging/domain/poll/PollMessageDraft;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/messaging/domain/poll/PollMessageDraft;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.createpoll.CreateMessagePollBrick$onBrickAttach$1", f = "CreatePollBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CreateMessagePollBrick$onBrickAttach$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateMessagePollBrick$onBrickAttach$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreateMessagePollBrick$onBrickAttach$1 createMessagePollBrick$onBrickAttach$1 = new CreateMessagePollBrick$onBrickAttach$1(this.this$0, continuation);
        createMessagePollBrick$onBrickAttach$1.L$0 = obj;
        return createMessagePollBrick$onBrickAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CreateMessagePollBrick$onBrickAttach$1 createMessagePollBrick$onBrickAttach$1 = (CreateMessagePollBrick$onBrickAttach$1) create((PollMessageDraft) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        createMessagePollBrick$onBrickAttach$1.invokeSuspend(zy11Var);
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
        PollMessageDraft pollMessageDraft = (PollMessageDraft) this.L$0;
        b bVar = this.this$0;
        bVar.getClass();
        m7f m7fVar = bVar.b;
        if (evu0.J(pollMessageDraft.getTitle())) {
            m7fVar.y.setEnabled(false);
            m7fVar.y.setText(oyh0.messenger_create_poll_error_title_is_empty);
        } else {
            if (!pollMessageDraft.getAnswers().isEmpty()) {
                List<String> answers = pollMessageDraft.getAnswers();
                if (!(answers instanceof Collection) || !answers.isEmpty()) {
                    Iterator<T> it = answers.iterator();
                    while (it.hasNext()) {
                        if (!evu0.J((String) it.next())) {
                            List<String> answers2 = pollMessageDraft.getAnswers();
                            if (!(answers2 instanceof Collection) || !answers2.isEmpty()) {
                                Iterator<T> it2 = answers2.iterator();
                                while (it2.hasNext()) {
                                    if (((String) it2.next()).length() > 140) {
                                        m7fVar.y.setEnabled(false);
                                        m7fVar.y.setText(oyh0.messenger_create_poll_error_too_long_answers);
                                        break;
                                    }
                                }
                            }
                            m7fVar.y.setEnabled(true);
                            m7fVar.y.setText(oyh0.messenger_create_poll_button_title);
                        }
                    }
                }
            }
            m7fVar.y.setEnabled(false);
            m7fVar.y.setText(oyh0.messenger_create_poll_error_not_enough_answers);
        }
        return zy11.a;
    }
}
