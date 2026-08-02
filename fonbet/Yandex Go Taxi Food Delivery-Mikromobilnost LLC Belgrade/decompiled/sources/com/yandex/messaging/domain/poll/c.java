package com.yandex.messaging.domain.poll;

import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.internal.entities.PollMessageData;
import defpackage.at2;
import defpackage.axd0;
import defpackage.az10;
import defpackage.by10;
import defpackage.ike;
import defpackage.k020;
import defpackage.kse;
import defpackage.l020;
import defpackage.meb;
import defpackage.ny61;
import defpackage.tje;
import defpackage.vff0;
import defpackage.vqc;
import defpackage.vse;
import defpackage.wff0;
import defpackage.y2e0;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class c implements vff0 {
    public static final long E = vqc.a(0, 0, 500, 7);
    public static final /* synthetic */ int F = 0;
    public final meb A;
    public final ike B;
    public final ConcurrentHashMap C = new ConcurrentHashMap();
    public final LinkedHashMap D = new LinkedHashMap();
    public final Moshi a;
    public final y2e0 b;
    public final wff0 c;
    public final k020 w;
    public final kse x;
    public final by10 y;
    public final az10 z;

    public c(at2 at2Var, Moshi moshi, y2e0 y2e0Var, wff0 wff0Var, k020 k020Var, kse kseVar, vse vseVar) {
        this.a = moshi;
        this.b = y2e0Var;
        this.c = wff0Var;
        this.w = k020Var;
        this.x = kseVar;
        this.y = at2Var.b();
        this.z = at2Var.B();
        this.A = at2Var.Y();
        this.B = vseVar.b();
        wff0Var.a(this);
    }

    public static boolean d(PollMessageData pollMessageData, PollInfoResponse pollInfoResponse) {
        long j = pollMessageData.results.version;
        long j2 = pollInfoResponse.getResults().version;
        if (j2 == j) {
            PollInfoResponse.AnswerVotes[] answerVotesArr = pollMessageData.answerVotes;
            int length = answerVotesArr != null ? answerVotesArr.length : 0;
            PollInfoResponse.AnswerVotes[] answerVotes = pollInfoResponse.getAnswerVotes();
            int length2 = answerVotes != null ? answerVotes.length : 0;
            ReducedUserInfo[] reducedUserInfoArr = pollMessageData.results.voters;
            int length3 = reducedUserInfoArr != null ? reducedUserInfoArr.length : 0;
            ReducedUserInfo[] reducedUserInfoArr2 = pollInfoResponse.getResults().recentVoters;
            int length4 = reducedUserInfoArr2 != null ? reducedUserInfoArr2.length : 0;
            if (length2 > length || length4 > length3) {
                return true;
            }
        } else if (j2 > j) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PollInfoRequest pollInfoRequest, ContinuationImpl continuationImpl) {
        PollInfoRepository$fetchAndUpdatePollInfo$1 pollInfoRepository$fetchAndUpdatePollInfo$1;
        int i;
        if (continuationImpl instanceof PollInfoRepository$fetchAndUpdatePollInfo$1) {
            pollInfoRepository$fetchAndUpdatePollInfo$1 = (PollInfoRepository$fetchAndUpdatePollInfo$1) continuationImpl;
            int i2 = pollInfoRepository$fetchAndUpdatePollInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pollInfoRepository$fetchAndUpdatePollInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pollInfoRepository$fetchAndUpdatePollInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pollInfoRepository$fetchAndUpdatePollInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kse.a(this.x);
                    pollInfoRepository$fetchAndUpdatePollInfo$1.L$0 = this;
                    pollInfoRepository$fetchAndUpdatePollInfo$1.L$1 = pollInfoRequest;
                    pollInfoRepository$fetchAndUpdatePollInfo$1.label = 1;
                    y2e0 y2e0Var = this.b;
                    y2e0Var.getClass();
                    obj = tje.k0(pollInfoRepository$fetchAndUpdatePollInfo$1.get_context(), new PollsApi$fetchPollInfo$$inlined$cancelableCoroutineWrapper$default$1(null, y2e0Var, pollInfoRequest), pollInfoRepository$fetchAndUpdatePollInfo$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pollInfoRequest = (PollInfoRequest) pollInfoRepository$fetchAndUpdatePollInfo$1.L$1;
                    this = (c) pollInfoRepository$fetchAndUpdatePollInfo$1.L$0;
                    kotlin.b.b(obj);
                }
                return axd0.a(this.e(pollInfoRequest, (PollInfoResponse) obj));
            }
        }
        pollInfoRepository$fetchAndUpdatePollInfo$1 = new PollInfoRepository$fetchAndUpdatePollInfo$1(this, continuationImpl);
        Object obj2 = pollInfoRepository$fetchAndUpdatePollInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pollInfoRepository$fetchAndUpdatePollInfo$1.label;
        if (i != 0) {
        }
        return axd0.a(this.e(pollInfoRequest, (PollInfoResponse) obj2));
    }

    @Override // defpackage.vff0
    public final void b() {
        kotlinx.coroutines.a.g(this.B.a, null);
        this.c.c(this);
        this.C.clear();
        this.D.clear();
    }

    public final PollMessageData c(PollInfoRequest pollInfoRequest) {
        String b;
        MessageRef messageRef = pollInfoRequest.forwardMessageRef;
        if (messageRef != null) {
            String str = messageRef.chatId;
            b = this.z.C(messageRef.timestamp, str);
        } else {
            Long c = this.A.c(pollInfoRequest.chatId);
            if (c == null) {
                ny61.r("attempt to fetch poll information from unpersisted chat");
                return null;
            }
            b = this.y.b(c.longValue(), pollInfoRequest.timestamp);
        }
        if (b == null) {
            ny61.r("No message data found for message");
            return null;
        }
        try {
            Object fromJson = this.a.adapter(PollMessageData.class).fromJson(b);
            if (fromJson != null) {
                return (PollMessageData) fromJson;
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (IOException e) {
            ny61.j(e);
            return null;
        }
    }

    public final PollMessageData e(PollInfoRequest pollInfoRequest, PollInfoResponse pollInfoResponse) {
        kse.a(this.x);
        PollMessageData c = c(pollInfoRequest);
        if (!d(c, pollInfoResponse)) {
            return c;
        }
        c.myChoices = pollInfoResponse.getMyChoices();
        c.answerVotes = pollInfoResponse.getAnswerVotes();
        PlainMessage.PollResult results = pollInfoResponse.getResults();
        PollMessageData.VoteResult voteResult = new PollMessageData.VoteResult();
        voteResult.version = results.version;
        voteResult.answers = results.answers;
        voteResult.voteCount = results.voteCount;
        voteResult.voters = results.recentVoters;
        c.results = voteResult;
        MessageRef messageRef = pollInfoRequest.forwardMessageRef;
        if (messageRef == null) {
            messageRef = MessageRef.a(pollInfoRequest.timestamp, pollInfoRequest.chatId);
        }
        l020 C = this.w.C();
        try {
            C.e0(messageRef, c);
            C.s();
            C.close();
            return c;
        } finally {
        }
    }
}
