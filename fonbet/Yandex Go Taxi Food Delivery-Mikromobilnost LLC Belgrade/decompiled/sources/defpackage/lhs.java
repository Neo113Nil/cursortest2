package defpackage;

import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;
import com.yandex.messaging.domain.poll.PollAnswer;
import com.yandex.messaging.internal.entities.PollMessageData;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class lhs {
    public final String a;
    public final PollInfoResponse.AnswerVotes[] b;
    public final String[] c;
    public final PollMessageData.VoteResult d;

    public lhs(String str, PollInfoResponse.AnswerVotes[] answerVotesArr, String[] strArr, PollMessageData.VoteResult voteResult) {
        this.a = str;
        this.b = answerVotesArr;
        this.c = strArr;
        this.d = voteResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0046  */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PollAnswer a(int i) {
        PollInfoResponse.AnswerVotes answerVotes;
        int i2;
        List list;
        PollInfoResponse.Vote[] votes;
        PollMessageData.VoteResult voteResult = this.d;
        int i3 = voteResult.voteCount;
        Integer valueOf = Integer.valueOf(i3);
        Integer num = null;
        if (i3 <= 0) {
            valueOf = null;
        }
        PollInfoResponse.AnswerVotes[] answerVotesArr = this.b;
        int length = answerVotesArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                answerVotes = null;
                break;
            }
            answerVotes = answerVotesArr[i4];
            if (answerVotes.getAnswerId() == i) {
                break;
            }
            i4++;
        }
        int[] iArr = voteResult.answers;
        if (iArr != null) {
            if (i >= 0 && i < iArr.length) {
                num = Integer.valueOf(iArr[i]);
            }
            if (num != null) {
                i2 = num.intValue();
                float intValue = valueOf == null ? (i2 / valueOf.intValue()) * 100.0f : 0.0f;
                String str = this.c[i];
                int rint = (int) Math.rint(intValue);
                if (answerVotes != null || (votes = answerVotes.getVotes()) == null) {
                    list = EmptyList.a;
                } else {
                    list = new ArrayList(votes.length);
                    for (PollInfoResponse.Vote vote : votes) {
                        list.add(vote.getUserInfo());
                    }
                }
                return new PollAnswer(str, i, i2, rint, list);
            }
        }
        i2 = 0;
        if (valueOf == null) {
        }
        String str2 = this.c[i];
        int rint2 = (int) Math.rint(intValue);
        if (answerVotes != null) {
        }
        list = EmptyList.a;
        return new PollAnswer(str2, i, i2, rint2, list);
    }
}
