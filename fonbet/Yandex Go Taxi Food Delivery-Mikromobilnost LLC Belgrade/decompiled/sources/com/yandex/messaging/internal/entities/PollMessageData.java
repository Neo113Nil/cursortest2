package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

/* loaded from: classes15.dex */
public class PollMessageData extends MessageData {

    @Json(name = "answerVotes")
    public PollInfoResponse.AnswerVotes[] answerVotes;

    @Json(name = "answers")
    public String[] answers;

    @Json(name = "is_anonymous")
    public boolean isAnonymous;

    @Json(name = "is_multiselect")
    public boolean isMultiselect;

    @Json(name = "my_choices")
    public int[] myChoices;

    @Json(name = "results")
    public VoteResult results;

    @Json(name = "title")
    public String title;

    public static class VoteResult {

        @Json(name = "answers")
        public int[] answers;

        @Json(name = "version")
        public long version;

        @Json(name = "vote_count")
        public int voteCount;

        @Json(name = CSPDirectoryConstants.SUBDIRECTORY_USERS)
        public ReducedUserInfo[] voters;
    }

    public PollMessageData(String str, String[] strArr, boolean z, boolean z2, VoteResult voteResult, int[] iArr) {
        super(12, "");
        this.title = str;
        String[] strArr2 = new String[strArr.length];
        this.answers = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        this.isAnonymous = z;
        this.isMultiselect = z2;
        this.results = voteResult;
        this.myChoices = iArr;
    }

    @Deprecated
    public PollMessageData() {
    }
}
