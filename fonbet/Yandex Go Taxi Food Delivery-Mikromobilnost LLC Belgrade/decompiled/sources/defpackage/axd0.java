package defpackage;

import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;
import com.yandex.messaging.internal.entities.PollMessageData;

/* loaded from: classes15.dex */
public abstract class axd0 {
    public static final long a = vqc.a(1, 0, 0, 13);

    public static final lhs a(PollMessageData pollMessageData) {
        String str = pollMessageData.title;
        if (str == null) {
            str = "";
        }
        PollInfoResponse.AnswerVotes[] answerVotesArr = pollMessageData.answerVotes;
        if (answerVotesArr == null) {
            answerVotesArr = new PollInfoResponse.AnswerVotes[0];
        }
        String[] strArr = pollMessageData.answers;
        if (strArr == null) {
            strArr = new String[0];
        }
        return new lhs(str, answerVotesArr, strArr, pollMessageData.results);
    }
}
