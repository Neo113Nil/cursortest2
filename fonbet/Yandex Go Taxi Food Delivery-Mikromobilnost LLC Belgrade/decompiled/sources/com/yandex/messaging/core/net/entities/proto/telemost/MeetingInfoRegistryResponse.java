package com.yandex.messaging.core.net.entities.proto.telemost;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\n\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingInfoRegistryResponse;", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingInfoResponse;", "meetingId", "", "chatId", "creationTimestampMs", "", "participantsCount", "", ACSPConstants.STATUS, "version", "participantGuids", "", "maxParticipantsCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;JIIJ[Ljava/lang/String;Ljava/lang/Integer;)V", "getMeetingId", "()Ljava/lang/String;", "getChatId", "getCreationTimestampMs", "()J", "getParticipantsCount", "()I", "getStatus", "getVersion", "getParticipantGuids", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getMaxParticipantsCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MeetingInfoRegistryResponse implements MeetingInfoResponse {
    private final String chatId;
    private final long creationTimestampMs;
    private final Integer maxParticipantsCount;
    private final String meetingId;
    private final String[] participantGuids;
    private final int participantsCount;
    private final int status;
    private final long version;

    public /* synthetic */ MeetingInfoRegistryResponse(String str, String str2, long j, int i, int i2, long j2, String[] strArr, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, i, i2, j2, strArr, (i3 & 128) != 0 ? null : num);
    }

    public String getChatId() {
        return this.chatId;
    }

    public long getCreationTimestampMs() {
        return this.creationTimestampMs;
    }

    public Integer getMaxParticipantsCount() {
        return this.maxParticipantsCount;
    }

    public String getMeetingId() {
        return this.meetingId;
    }

    public String[] getParticipantGuids() {
        return this.participantGuids;
    }

    public int getParticipantsCount() {
        return this.participantsCount;
    }

    public int getStatus() {
        return this.status;
    }

    public long getVersion() {
        return this.version;
    }

    public MeetingInfoRegistryResponse(@Json(name = "meeting_id") String str, @Json(name = "chat_id") String str2, @Json(name = "create_timestamp") long j, @Json(name = "participants_count") int i, @Json(name = "status") int i2, @Json(name = "version") long j2, @Json(name = "participant_guids") String[] strArr, @Json(name = "max_participants_count") Integer num) {
        this.meetingId = str;
        this.chatId = str2;
        this.creationTimestampMs = j;
        this.participantsCount = i;
        this.status = i2;
        this.version = j2;
        this.participantGuids = strArr;
        this.maxParticipantsCount = num;
    }
}
