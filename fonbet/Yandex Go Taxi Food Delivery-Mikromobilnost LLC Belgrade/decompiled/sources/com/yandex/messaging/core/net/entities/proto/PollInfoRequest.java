package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#BY\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0011\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\fHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0010HÆ\u0003J_\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u000eHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/PollInfoRequest;", "", "chatId", "", "inviteHash", ClidProvider.TIMESTAMP, "", "forwardMessageRef", "Lcom/yandex/messaging/core/net/entities/proto/message/MessageRef;", "commonFields", "Lcom/yandex/messaging/core/net/entities/proto/CommonRequestFields;", "returnResults", "", "limit", "", "answerFilter", "Lcom/yandex/messaging/core/net/entities/proto/PollInfoRequest$AnswerFilter;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLcom/yandex/messaging/core/net/entities/proto/message/MessageRef;Lcom/yandex/messaging/core/net/entities/proto/CommonRequestFields;ZILcom/yandex/messaging/core/net/entities/proto/PollInfoRequest$AnswerFilter;)V", "builder", "Lcom/yandex/messaging/core/net/entities/proto/PollInfoRequestBuilder;", "(Lcom/yandex/messaging/core/net/entities/proto/PollInfoRequestBuilder;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "AnswerFilter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PollInfoRequest {

    @Json(name = "AnswerFilter")
    @xuf0(tag = 10)
    public final AnswerFilter answerFilter;

    @Json(name = "ChatId")
    @xuf0(tag = 2)
    public final String chatId;

    @Json(name = "CommonRequestFields")
    @xuf0(tag = 7)
    public final CommonRequestFields commonFields;

    @Json(name = "ForwardMessageRef")
    @xuf0(tag = 5)
    public final MessageRef forwardMessageRef;

    @Json(name = "InviteHash")
    @xuf0(tag = 3)
    public final String inviteHash;

    @Json(name = "Limit")
    @xuf0(tag = 9)
    public final int limit;

    @Json(name = "ReturnResults")
    @xuf0(tag = 8)
    public final boolean returnResults;

    @Json(name = "Timestamp")
    @xuf0(tag = 4)
    public final long timestamp;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/PollInfoRequest$AnswerFilter;", "", "answerId", "", "maxTimestamp", "", "<init>", "(IJ)V", "getAnswerId", "()I", "getMaxTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AnswerFilter {

        @xuf0(tag = 1)
        private final int answerId;

        @xuf0(tag = 2)
        private final long maxTimestamp;

        public AnswerFilter(@Json(name = "AnswerId") int i, @Json(name = "MaxTimestamp") long j) {
            this.answerId = i;
            this.maxTimestamp = j;
        }

        public static /* synthetic */ AnswerFilter copy$default(AnswerFilter answerFilter, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = answerFilter.answerId;
            }
            if ((i2 & 2) != 0) {
                j = answerFilter.maxTimestamp;
            }
            return answerFilter.copy(i, j);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAnswerId() {
            return this.answerId;
        }

        /* renamed from: component2, reason: from getter */
        public final long getMaxTimestamp() {
            return this.maxTimestamp;
        }

        public final AnswerFilter copy(@Json(name = "AnswerId") int answerId, @Json(name = "MaxTimestamp") long maxTimestamp) {
            return new AnswerFilter(answerId, maxTimestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnswerFilter)) {
                return false;
            }
            AnswerFilter answerFilter = (AnswerFilter) other;
            return this.answerId == answerFilter.answerId && this.maxTimestamp == answerFilter.maxTimestamp;
        }

        public final int getAnswerId() {
            return this.answerId;
        }

        public final long getMaxTimestamp() {
            return this.maxTimestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.maxTimestamp) + (Integer.hashCode(this.answerId) * 31);
        }

        public String toString() {
            return "AnswerFilter(answerId=" + this.answerId + ", maxTimestamp=" + this.maxTimestamp + Extension.C_BRAKE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PollInfoRequest(PollInfoRequestBuilder pollInfoRequestBuilder) {
        this(r1, null, r3, r5, r6, r7, r8, r0 != null ? new AnswerFilter(r0.intValue(), pollInfoRequestBuilder.h) : null);
        Long l;
        MessageRef messageRef;
        String str = pollInfoRequestBuilder.a;
        long j = pollInfoRequestBuilder.b;
        String str2 = pollInfoRequestBuilder.d;
        if (str2 == null || (l = pollInfoRequestBuilder.e) == null) {
            messageRef = null;
        } else {
            long longValue = l.longValue();
            MessageRef messageRef2 = new MessageRef();
            messageRef2.chatId = str2;
            messageRef2.timestamp = longValue;
            messageRef = messageRef2;
        }
        CommonRequestFields commonRequestFields = new CommonRequestFields(pollInfoRequestBuilder.i > 0, pollInfoRequestBuilder.j);
        boolean z = pollInfoRequestBuilder.c;
        int i = pollInfoRequestBuilder.f;
        Integer num = pollInfoRequestBuilder.g;
    }

    public static /* synthetic */ PollInfoRequest copy$default(PollInfoRequest pollInfoRequest, String str, String str2, long j, MessageRef messageRef, CommonRequestFields commonRequestFields, boolean z, int i, AnswerFilter answerFilter, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pollInfoRequest.chatId;
        }
        if ((i2 & 2) != 0) {
            str2 = pollInfoRequest.inviteHash;
        }
        if ((i2 & 4) != 0) {
            j = pollInfoRequest.timestamp;
        }
        if ((i2 & 8) != 0) {
            messageRef = pollInfoRequest.forwardMessageRef;
        }
        if ((i2 & 16) != 0) {
            commonRequestFields = pollInfoRequest.commonFields;
        }
        if ((i2 & 32) != 0) {
            z = pollInfoRequest.returnResults;
        }
        if ((i2 & 64) != 0) {
            i = pollInfoRequest.limit;
        }
        if ((i2 & 128) != 0) {
            answerFilter = pollInfoRequest.answerFilter;
        }
        AnswerFilter answerFilter2 = answerFilter;
        boolean z2 = z;
        MessageRef messageRef2 = messageRef;
        long j2 = j;
        return pollInfoRequest.copy(str, str2, j2, messageRef2, commonRequestFields, z2, i, answerFilter2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInviteHash() {
        return this.inviteHash;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final MessageRef getForwardMessageRef() {
        return this.forwardMessageRef;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonRequestFields getCommonFields() {
        return this.commonFields;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getReturnResults() {
        return this.returnResults;
    }

    /* renamed from: component7, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component8, reason: from getter */
    public final AnswerFilter getAnswerFilter() {
        return this.answerFilter;
    }

    public final PollInfoRequest copy(String chatId, String inviteHash, long timestamp, MessageRef forwardMessageRef, CommonRequestFields commonFields, boolean returnResults, int limit, AnswerFilter answerFilter) {
        return new PollInfoRequest(chatId, inviteHash, timestamp, forwardMessageRef, commonFields, returnResults, limit, answerFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollInfoRequest)) {
            return false;
        }
        PollInfoRequest pollInfoRequest = (PollInfoRequest) other;
        return jl40.l(this.chatId, pollInfoRequest.chatId) && jl40.l(this.inviteHash, pollInfoRequest.inviteHash) && this.timestamp == pollInfoRequest.timestamp && jl40.l(this.forwardMessageRef, pollInfoRequest.forwardMessageRef) && jl40.l(this.commonFields, pollInfoRequest.commonFields) && this.returnResults == pollInfoRequest.returnResults && this.limit == pollInfoRequest.limit && jl40.l(this.answerFilter, pollInfoRequest.answerFilter);
    }

    public int hashCode() {
        int hashCode = this.chatId.hashCode() * 31;
        String str = this.inviteHash;
        int c = qv10.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.timestamp);
        MessageRef messageRef = this.forwardMessageRef;
        int b = oyr.b(this.limit, unr0.e((this.commonFields.hashCode() + ((c + (messageRef == null ? 0 : messageRef.hashCode())) * 31)) * 31, 31, this.returnResults), 31);
        AnswerFilter answerFilter = this.answerFilter;
        return b + (answerFilter != null ? answerFilter.hashCode() : 0);
    }

    public String toString() {
        String str = this.chatId;
        String str2 = this.inviteHash;
        long j = this.timestamp;
        MessageRef messageRef = this.forwardMessageRef;
        CommonRequestFields commonRequestFields = this.commonFields;
        boolean z = this.returnResults;
        int i = this.limit;
        AnswerFilter answerFilter = this.answerFilter;
        StringBuilder v = b64.v("PollInfoRequest(chatId=", str, ", inviteHash=", str2, ", timestamp=");
        v.append(j);
        v.append(", forwardMessageRef=");
        v.append(messageRef);
        v.append(", commonFields=");
        v.append(commonRequestFields);
        v.append(", returnResults=");
        v.append(z);
        v.append(", limit=");
        v.append(i);
        v.append(", answerFilter=");
        v.append(answerFilter);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public PollInfoRequest(String str, String str2, long j, CommonRequestFields commonRequestFields) {
        this(str, str2, j, null, commonRequestFields, false, 0, null, 232, null);
    }

    public PollInfoRequest(String str, String str2, long j, MessageRef messageRef, CommonRequestFields commonRequestFields) {
        this(str, str2, j, messageRef, commonRequestFields, false, 0, null, 224, null);
    }

    public PollInfoRequest(String str, String str2, long j, MessageRef messageRef, CommonRequestFields commonRequestFields, boolean z) {
        this(str, str2, j, messageRef, commonRequestFields, z, 0, null, 192, null);
    }

    public PollInfoRequest(String str, String str2, long j, MessageRef messageRef, CommonRequestFields commonRequestFields, boolean z, int i) {
        this(str, str2, j, messageRef, commonRequestFields, z, i, null, 128, null);
    }

    public PollInfoRequest(String str, long j, CommonRequestFields commonRequestFields) {
        this(str, null, j, null, commonRequestFields, false, 0, null, MSException.ERROR_MORE_DATA, null);
    }

    public PollInfoRequest(String str, String str2, long j, MessageRef messageRef, CommonRequestFields commonRequestFields, boolean z, int i, AnswerFilter answerFilter) {
        this.chatId = str;
        this.inviteHash = str2;
        this.timestamp = j;
        this.forwardMessageRef = messageRef;
        this.commonFields = commonRequestFields;
        this.returnResults = z;
        this.limit = i;
        this.answerFilter = answerFilter;
    }

    public /* synthetic */ PollInfoRequest(String str, String str2, long j, MessageRef messageRef, CommonRequestFields commonRequestFields, boolean z, int i, AnswerFilter answerFilter, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, j, (i2 & 8) != 0 ? null : messageRef, commonRequestFields, (i2 & 32) != 0 ? true : z, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : answerFilter);
    }
}
