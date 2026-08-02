package com.yandex.messaging.domain.poll;

import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;
import com.yandex.messaging.internal.entities.PollMessageData;
import defpackage.lhs;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wpb1;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.poll.PollInfoRepository$subscribeAndUpdatePollInfo$1$localPollInfoJob$1", f = "PollInfoRepository.kt", l = {HProv.PP_SAME_MEDIA}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PollInfoRepository$subscribeAndUpdatePollInfo$1$localPollInfoJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ y6f0 $$this$channelFlow;
    final /* synthetic */ PollInfoRequest $pollInfoRequest;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollInfoRepository$subscribeAndUpdatePollInfo$1$localPollInfoJob$1(c cVar, PollInfoRequest pollInfoRequest, y6f0 y6f0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$pollInfoRequest = pollInfoRequest;
        this.$$this$channelFlow = y6f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PollInfoRepository$subscribeAndUpdatePollInfo$1$localPollInfoJob$1(this.this$0, this.$pollInfoRequest, this.$$this$channelFlow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PollInfoRepository$subscribeAndUpdatePollInfo$1$localPollInfoJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if ((!(r0.length == 0)) == true) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        PollInfoResponse.AnswerVotes[] answerVotesArr = null;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = c.E;
            this.label = 1;
            if (wpb1.h(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        c cVar = this.this$0;
        PollInfoRequest pollInfoRequest = this.$pollInfoRequest;
        int i2 = c.F;
        cVar.getClass();
        tje.f();
        PollMessageData c = cVar.c(pollInfoRequest);
        PollInfoResponse.AnswerVotes[] answerVotesArr2 = c.answerVotes;
        if (answerVotesArr2 != null) {
        }
        answerVotesArr2 = null;
        if (answerVotesArr2 == null) {
            int[] iArr = c.results.answers;
            if (iArr != null) {
                ArrayList arrayList = new ArrayList(iArr.length);
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    arrayList.add(new PollInfoResponse.AnswerVotes(i4, iArr[i3], new PollInfoResponse.Vote[0]));
                    i3++;
                    i4++;
                }
                answerVotesArr = (PollInfoResponse.AnswerVotes[]) arrayList.toArray(new PollInfoResponse.AnswerVotes[0]);
            }
        } else {
            answerVotesArr = answerVotesArr2;
        }
        String str = c.title;
        if (str == null) {
            str = "";
        }
        if (answerVotesArr == null) {
            answerVotesArr = new PollInfoResponse.AnswerVotes[0];
        }
        String[] strArr = c.answers;
        if (strArr == null) {
            strArr = new String[0];
        }
        ((x6f0) this.$$this$channelFlow).d(new lhs(str, answerVotesArr, strArr, c.results));
        return zy11.a;
    }
}
