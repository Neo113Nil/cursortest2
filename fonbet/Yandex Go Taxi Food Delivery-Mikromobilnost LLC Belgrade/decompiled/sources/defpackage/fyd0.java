package defpackage;

import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import com.yandex.messaging.core.net.entities.proto.PollInfoRequestBuilder;
import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class fyd0 extends zwd0 {
    public final /* synthetic */ gyd0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ v790 c;

    public fyd0(gyd0 gyd0Var, long j, v790 v790Var) {
        this.a = gyd0Var;
        this.b = j;
        this.c = v790Var;
    }

    @Override // defpackage.zwd0
    public final void b(PollInfoResponse pollInfoResponse) {
        pollInfoResponse.getStatus();
        this.c.onError();
    }

    @Override // defpackage.o5t0
    public final Object c(int i, int i2) {
        gyd0 gyd0Var = this.a;
        PollInfoRequest pollInfoRequest = gyd0Var.a;
        PollInfoRequestBuilder pollInfoRequestBuilder = new PollInfoRequestBuilder();
        pollInfoRequestBuilder.a = pollInfoRequest.chatId;
        pollInfoRequestBuilder.b = pollInfoRequest.timestamp;
        MessageRef messageRef = pollInfoRequest.forwardMessageRef;
        pollInfoRequestBuilder.d = messageRef != null ? messageRef.chatId : null;
        pollInfoRequestBuilder.e = messageRef != null ? Long.valueOf(messageRef.timestamp) : null;
        pollInfoRequestBuilder.g = Integer.valueOf(gyd0Var.b);
        pollInfoRequestBuilder.h = this.b;
        pollInfoRequestBuilder.f = 100;
        pollInfoRequestBuilder.c = true;
        pollInfoRequestBuilder.i = i2;
        pollInfoRequestBuilder.j = i;
        return new PollInfoRequest(pollInfoRequestBuilder);
    }

    @Override // defpackage.zwd0
    public final void f(PollInfoResponse pollInfoResponse) {
        PollInfoResponse.AnswerVotes answerVotes;
        PollInfoResponse.Vote[] votes;
        PollInfoResponse.AnswerVotes[] answerVotes2 = pollInfoResponse.getAnswerVotes();
        List list = null;
        if (answerVotes2 != null) {
            int length = answerVotes2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    answerVotes = null;
                    break;
                }
                answerVotes = answerVotes2[i];
                if (answerVotes.getAnswerId() == this.a.b) {
                    break;
                } else {
                    i++;
                }
            }
            if (answerVotes != null && (votes = answerVotes.getVotes()) != null) {
                list = j73.d0(votes);
            }
        }
        this.c.F(new w790(list == null ? EmptyList.a : list, list != null && list.size() == 100, false));
    }
}
