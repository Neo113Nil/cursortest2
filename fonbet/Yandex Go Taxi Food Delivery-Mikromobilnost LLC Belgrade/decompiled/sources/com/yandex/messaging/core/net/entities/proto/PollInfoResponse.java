package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import defpackage.jl40;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0002!\"B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse;", "", ACSPConstants.STATUS, "", "results", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$PollResult;", "myChoices", "", "answerVotes", "", "Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse$AnswerVotes;", "<init>", "(ILcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$PollResult;[I[Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse$AnswerVotes;)V", "isCompleted", "", "(Z)V", "getStatus", "()I", "setStatus", "(I)V", "getResults", "()Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$PollResult;", "setResults", "(Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$PollResult;)V", "getMyChoices", "()[I", "setMyChoices", "([I)V", "getAnswerVotes", "()[Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse$AnswerVotes;", "setAnswerVotes", "([Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse$AnswerVotes;)V", "[Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse$AnswerVotes;", "Vote", "AnswerVotes", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PollInfoResponse {

    @xuf0(tag = 5)
    private AnswerVotes[] answerVotes;

    @xuf0(tag = 4)
    private int[] myChoices;

    @xuf0(tag = 3)
    private PlainMessage.PollResult results;

    @xuf0(tag = 1)
    private int status;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse$AnswerVotes;", "", "answerId", "", "totalCount", "votes", "", "Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse$Vote;", "<init>", "(II[Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse$Vote;)V", "getAnswerId", "()I", "getTotalCount", "getVotes", "()[Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse$Vote;", "[Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse$Vote;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnswerVotes {

        @xuf0(tag = 1)
        private final int answerId;

        @xuf0(tag = 2)
        private final int totalCount;

        @xuf0(tag = 3)
        private final Vote[] votes;

        public AnswerVotes(@Json(name = "AnswerId") int i, @Json(name = "TotalCount") int i2, @Json(name = "Votes") Vote[] voteArr) {
            this.answerId = i;
            this.totalCount = i2;
            this.votes = voteArr;
        }

        public final int getAnswerId() {
            return this.answerId;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public final Vote[] getVotes() {
            return this.votes;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse$Vote;", "", ClidProvider.TIMESTAMP, "", "userInfo", "Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "<init>", "(JLcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;)V", "getTimestamp", "()J", "getUserInfo", "()Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Vote {

        @xuf0(tag = 1)
        private final long timestamp;

        @xuf0(tag = 2)
        private final ReducedUserInfo userInfo;

        public Vote(@Json(name = "Timestamp") long j, @Json(name = "UserInfo") ReducedUserInfo reducedUserInfo) {
            this.timestamp = j;
            this.userInfo = reducedUserInfo;
        }

        public static /* synthetic */ Vote copy$default(Vote vote, long j, ReducedUserInfo reducedUserInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                j = vote.timestamp;
            }
            if ((i & 2) != 0) {
                reducedUserInfo = vote.userInfo;
            }
            return vote.copy(j, reducedUserInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final ReducedUserInfo getUserInfo() {
            return this.userInfo;
        }

        public final Vote copy(@Json(name = "Timestamp") long timestamp, @Json(name = "UserInfo") ReducedUserInfo userInfo) {
            return new Vote(timestamp, userInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Vote)) {
                return false;
            }
            Vote vote = (Vote) other;
            return this.timestamp == vote.timestamp && jl40.l(this.userInfo, vote.userInfo);
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final ReducedUserInfo getUserInfo() {
            return this.userInfo;
        }

        public int hashCode() {
            return this.userInfo.hashCode() + (Long.hashCode(this.timestamp) * 31);
        }

        public String toString() {
            return "Vote(timestamp=" + this.timestamp + ", userInfo=" + this.userInfo + Extension.C_BRAKE;
        }
    }

    public PollInfoResponse(boolean z) {
        this(0, new PlainMessage.PollResult(0L, 0, null, null, z, 15, null), new int[0], null);
    }

    public final AnswerVotes[] getAnswerVotes() {
        return this.answerVotes;
    }

    public final int[] getMyChoices() {
        return this.myChoices;
    }

    public final PlainMessage.PollResult getResults() {
        return this.results;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setAnswerVotes(AnswerVotes[] answerVotesArr) {
        this.answerVotes = answerVotesArr;
    }

    public final void setMyChoices(int[] iArr) {
        this.myChoices = iArr;
    }

    public final void setResults(PlainMessage.PollResult pollResult) {
        this.results = pollResult;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public PollInfoResponse(@Json(name = "Status") int i, @Json(name = "Results") PlainMessage.PollResult pollResult, @Json(name = "MyChoices") int[] iArr, @Json(name = "AnswerVotes") AnswerVotes[] answerVotesArr) {
        this.status = i;
        this.results = pollResult;
        this.myChoices = iArr;
        this.answerVotes = answerVotesArr;
    }
}
