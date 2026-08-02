package com.yandex.messaging.ui.polloptioninfo;

import android.app.Activity;
import android.widget.TextView;
import com.yandex.messaging.domain.poll.PollAnswer;
import defpackage.ewh0;
import defpackage.lhs;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nyh0;
import defpackage.rxd0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llhs;", "optionInfo", "Lzy11;", "<anonymous>", "(Llhs;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.polloptioninfo.PollOptionInfoBrick$onBrickAttach$1", f = "PollOptionInfoBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PollOptionInfoBrick$onBrickAttach$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollOptionInfoBrick$onBrickAttach$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PollOptionInfoBrick$onBrickAttach$1 pollOptionInfoBrick$onBrickAttach$1 = new PollOptionInfoBrick$onBrickAttach$1(this.this$0, continuation);
        pollOptionInfoBrick$onBrickAttach$1.L$0 = obj;
        return pollOptionInfoBrick$onBrickAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PollOptionInfoBrick$onBrickAttach$1 pollOptionInfoBrick$onBrickAttach$1 = (PollOptionInfoBrick$onBrickAttach$1) create((lhs) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        pollOptionInfoBrick$onBrickAttach$1.invokeSuspend(zy11Var);
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
        lhs lhsVar = (lhs) this.L$0;
        a aVar = this.this$0;
        PollAnswer a = lhsVar.a(aVar.w.f);
        rxd0 rxd0Var = aVar.a;
        TextView textView = rxd0Var.x;
        Activity activity = aVar.b;
        textView.setText(activity.getResources().getQuantityString(ewh0.messenger_poll_answers_count, a.getVotedCount(), Integer.valueOf(a.getVotedCount())));
        rxd0Var.z.setText(a.getAnswer());
        rxd0Var.y.setProgress(a.getVotedPercent() / 100.0f, true);
        rxd0Var.B.setText(String.valueOf(a.getVotedCount()));
        rxd0Var.A.setText(activity.getString(nyh0.messenger_poll_vote_count_percents, Integer.valueOf(a.getVotedPercent())));
        return zy11.a;
    }
}
