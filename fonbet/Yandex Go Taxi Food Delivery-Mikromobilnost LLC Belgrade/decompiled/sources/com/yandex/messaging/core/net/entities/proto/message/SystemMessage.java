package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.proto.ChatInfoFromTransport;
import com.yandex.messaging.core.net.entities.proto.calls.CallInfo;
import com.yandex.messaging.core.net.entities.proto.telemost.PersonalMeetingEndedMessage;
import defpackage.b64;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.unr0;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u009a\u0001\u0010?\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\rHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006F"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/SystemMessage;", "", "chatId", "", "payloadId", "chatCreatedInfo", "Lcom/yandex/messaging/core/net/entities/proto/message/ChatCreatedInfo;", "chatInfoDiff", "Lcom/yandex/messaging/core/net/entities/proto/ChatInfoFromTransport;", "usersChange", "Lcom/yandex/messaging/core/net/entities/proto/message/ParticipantsChange;", "participantsChange", "userAction", "", "callInfo", "Lcom/yandex/messaging/core/net/entities/proto/calls/CallInfo;", "meetingStartedMessage", "Lcom/yandex/messaging/core/net/entities/proto/message/MeetingStartedMessage;", "meetingEndedMessage", "Lcom/yandex/messaging/core/net/entities/proto/message/MeetingEndedMessage;", "personalMeetingEndedMessage", "Lcom/yandex/messaging/core/net/entities/proto/telemost/PersonalMeetingEndedMessage;", "genericMessage", "Lcom/yandex/messaging/core/net/entities/proto/message/SystemGenericMessage;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/proto/message/ChatCreatedInfo;Lcom/yandex/messaging/core/net/entities/proto/ChatInfoFromTransport;Lcom/yandex/messaging/core/net/entities/proto/message/ParticipantsChange;Lcom/yandex/messaging/core/net/entities/proto/message/ParticipantsChange;Ljava/lang/Integer;Lcom/yandex/messaging/core/net/entities/proto/calls/CallInfo;Lcom/yandex/messaging/core/net/entities/proto/message/MeetingStartedMessage;Lcom/yandex/messaging/core/net/entities/proto/message/MeetingEndedMessage;Lcom/yandex/messaging/core/net/entities/proto/telemost/PersonalMeetingEndedMessage;Lcom/yandex/messaging/core/net/entities/proto/message/SystemGenericMessage;)V", "getChatId", "()Ljava/lang/String;", "getPayloadId", "getChatCreatedInfo", "()Lcom/yandex/messaging/core/net/entities/proto/message/ChatCreatedInfo;", "getChatInfoDiff", "()Lcom/yandex/messaging/core/net/entities/proto/ChatInfoFromTransport;", "getUsersChange$annotations", "()V", "getUsersChange", "()Lcom/yandex/messaging/core/net/entities/proto/message/ParticipantsChange;", "getParticipantsChange", "getUserAction", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCallInfo", "()Lcom/yandex/messaging/core/net/entities/proto/calls/CallInfo;", "getMeetingStartedMessage", "()Lcom/yandex/messaging/core/net/entities/proto/message/MeetingStartedMessage;", "getMeetingEndedMessage", "()Lcom/yandex/messaging/core/net/entities/proto/message/MeetingEndedMessage;", "getPersonalMeetingEndedMessage", "()Lcom/yandex/messaging/core/net/entities/proto/telemost/PersonalMeetingEndedMessage;", "getGenericMessage", "()Lcom/yandex/messaging/core/net/entities/proto/message/SystemGenericMessage;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/proto/message/ChatCreatedInfo;Lcom/yandex/messaging/core/net/entities/proto/ChatInfoFromTransport;Lcom/yandex/messaging/core/net/entities/proto/message/ParticipantsChange;Lcom/yandex/messaging/core/net/entities/proto/message/ParticipantsChange;Ljava/lang/Integer;Lcom/yandex/messaging/core/net/entities/proto/calls/CallInfo;Lcom/yandex/messaging/core/net/entities/proto/message/MeetingStartedMessage;Lcom/yandex/messaging/core/net/entities/proto/message/MeetingEndedMessage;Lcom/yandex/messaging/core/net/entities/proto/telemost/PersonalMeetingEndedMessage;Lcom/yandex/messaging/core/net/entities/proto/message/SystemGenericMessage;)Lcom/yandex/messaging/core/net/entities/proto/message/SystemMessage;", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SystemMessage {

    @xuf0(tag = 104)
    private final CallInfo callInfo;

    @xuf0(tag = 100)
    private final ChatCreatedInfo chatCreatedInfo;

    @xuf0(tag = 1)
    private final String chatId;

    @xuf0(tag = 101)
    private final ChatInfoFromTransport chatInfoDiff;

    @xuf0(tag = 105)
    private final SystemGenericMessage genericMessage;

    @xuf0(tag = 108)
    private final MeetingEndedMessage meetingEndedMessage;

    @xuf0(tag = HProv.PP_SET_PIN)
    private final MeetingStartedMessage meetingStartedMessage;

    @xuf0(tag = 106)
    private final ParticipantsChange participantsChange;

    @xuf0(tag = 2)
    private final String payloadId;

    @xuf0(tag = 109)
    private final PersonalMeetingEndedMessage personalMeetingEndedMessage;

    @xuf0(tag = 103)
    private final Integer userAction;

    @xuf0(tag = 102)
    private final ParticipantsChange usersChange;

    public /* synthetic */ SystemMessage(String str, String str2, ChatCreatedInfo chatCreatedInfo, ChatInfoFromTransport chatInfoFromTransport, ParticipantsChange participantsChange, ParticipantsChange participantsChange2, Integer num, CallInfo callInfo, MeetingStartedMessage meetingStartedMessage, MeetingEndedMessage meetingEndedMessage, PersonalMeetingEndedMessage personalMeetingEndedMessage, SystemGenericMessage systemGenericMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : chatCreatedInfo, (i & 8) != 0 ? null : chatInfoFromTransport, (i & 16) != 0 ? null : participantsChange, (i & 32) != 0 ? null : participantsChange2, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : callInfo, (i & 256) != 0 ? null : meetingStartedMessage, (i & 512) != 0 ? null : meetingEndedMessage, (i & 1024) != 0 ? null : personalMeetingEndedMessage, (i & 2048) != 0 ? null : systemGenericMessage);
    }

    public static /* synthetic */ SystemMessage copy$default(SystemMessage systemMessage, String str, String str2, ChatCreatedInfo chatCreatedInfo, ChatInfoFromTransport chatInfoFromTransport, ParticipantsChange participantsChange, ParticipantsChange participantsChange2, Integer num, CallInfo callInfo, MeetingStartedMessage meetingStartedMessage, MeetingEndedMessage meetingEndedMessage, PersonalMeetingEndedMessage personalMeetingEndedMessage, SystemGenericMessage systemGenericMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = systemMessage.chatId;
        }
        if ((i & 2) != 0) {
            str2 = systemMessage.payloadId;
        }
        if ((i & 4) != 0) {
            chatCreatedInfo = systemMessage.chatCreatedInfo;
        }
        if ((i & 8) != 0) {
            chatInfoFromTransport = systemMessage.chatInfoDiff;
        }
        if ((i & 16) != 0) {
            participantsChange = systemMessage.usersChange;
        }
        if ((i & 32) != 0) {
            participantsChange2 = systemMessage.participantsChange;
        }
        if ((i & 64) != 0) {
            num = systemMessage.userAction;
        }
        if ((i & 128) != 0) {
            callInfo = systemMessage.callInfo;
        }
        if ((i & 256) != 0) {
            meetingStartedMessage = systemMessage.meetingStartedMessage;
        }
        if ((i & 512) != 0) {
            meetingEndedMessage = systemMessage.meetingEndedMessage;
        }
        if ((i & 1024) != 0) {
            personalMeetingEndedMessage = systemMessage.personalMeetingEndedMessage;
        }
        if ((i & 2048) != 0) {
            systemGenericMessage = systemMessage.genericMessage;
        }
        PersonalMeetingEndedMessage personalMeetingEndedMessage2 = personalMeetingEndedMessage;
        SystemGenericMessage systemGenericMessage2 = systemGenericMessage;
        MeetingStartedMessage meetingStartedMessage2 = meetingStartedMessage;
        MeetingEndedMessage meetingEndedMessage2 = meetingEndedMessage;
        Integer num2 = num;
        CallInfo callInfo2 = callInfo;
        ParticipantsChange participantsChange3 = participantsChange;
        ParticipantsChange participantsChange4 = participantsChange2;
        return systemMessage.copy(str, str2, chatCreatedInfo, chatInfoFromTransport, participantsChange3, participantsChange4, num2, callInfo2, meetingStartedMessage2, meetingEndedMessage2, personalMeetingEndedMessage2, systemGenericMessage2);
    }

    @jxi
    public static /* synthetic */ void getUsersChange$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component10, reason: from getter */
    public final MeetingEndedMessage getMeetingEndedMessage() {
        return this.meetingEndedMessage;
    }

    /* renamed from: component11, reason: from getter */
    public final PersonalMeetingEndedMessage getPersonalMeetingEndedMessage() {
        return this.personalMeetingEndedMessage;
    }

    /* renamed from: component12, reason: from getter */
    public final SystemGenericMessage getGenericMessage() {
        return this.genericMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPayloadId() {
        return this.payloadId;
    }

    /* renamed from: component3, reason: from getter */
    public final ChatCreatedInfo getChatCreatedInfo() {
        return this.chatCreatedInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final ChatInfoFromTransport getChatInfoDiff() {
        return this.chatInfoDiff;
    }

    /* renamed from: component5, reason: from getter */
    public final ParticipantsChange getUsersChange() {
        return this.usersChange;
    }

    /* renamed from: component6, reason: from getter */
    public final ParticipantsChange getParticipantsChange() {
        return this.participantsChange;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getUserAction() {
        return this.userAction;
    }

    /* renamed from: component8, reason: from getter */
    public final CallInfo getCallInfo() {
        return this.callInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final MeetingStartedMessage getMeetingStartedMessage() {
        return this.meetingStartedMessage;
    }

    public final SystemMessage copy(@Json(name = "ChatId") String chatId, @Json(name = "PayloadId") String payloadId, @Json(name = "ChatCreatedInfo") ChatCreatedInfo chatCreatedInfo, @Json(name = "ChatInfoDiff") ChatInfoFromTransport chatInfoDiff, @Json(name = "ParticipantsChangedDiff") ParticipantsChange usersChange, @Json(name = "ParticipantsChangedDiffV2") ParticipantsChange participantsChange, @Json(name = "UserAction") Integer userAction, @Json(name = "CallInfo") CallInfo callInfo, @Json(name = "MeetingStartedMessage") MeetingStartedMessage meetingStartedMessage, @Json(name = "MeetingEndedMessage") MeetingEndedMessage meetingEndedMessage, @Json(name = "PersonalMeetingEndedMessage") PersonalMeetingEndedMessage personalMeetingEndedMessage, @Json(name = "GenericMessage") SystemGenericMessage genericMessage) {
        return new SystemMessage(chatId, payloadId, chatCreatedInfo, chatInfoDiff, usersChange, participantsChange, userAction, callInfo, meetingStartedMessage, meetingEndedMessage, personalMeetingEndedMessage, genericMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SystemMessage)) {
            return false;
        }
        SystemMessage systemMessage = (SystemMessage) other;
        return jl40.l(this.chatId, systemMessage.chatId) && jl40.l(this.payloadId, systemMessage.payloadId) && jl40.l(this.chatCreatedInfo, systemMessage.chatCreatedInfo) && jl40.l(this.chatInfoDiff, systemMessage.chatInfoDiff) && jl40.l(this.usersChange, systemMessage.usersChange) && jl40.l(this.participantsChange, systemMessage.participantsChange) && jl40.l(this.userAction, systemMessage.userAction) && jl40.l(this.callInfo, systemMessage.callInfo) && jl40.l(this.meetingStartedMessage, systemMessage.meetingStartedMessage) && jl40.l(this.meetingEndedMessage, systemMessage.meetingEndedMessage) && jl40.l(this.personalMeetingEndedMessage, systemMessage.personalMeetingEndedMessage) && jl40.l(this.genericMessage, systemMessage.genericMessage);
    }

    public final CallInfo getCallInfo() {
        return this.callInfo;
    }

    public final ChatCreatedInfo getChatCreatedInfo() {
        return this.chatCreatedInfo;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final ChatInfoFromTransport getChatInfoDiff() {
        return this.chatInfoDiff;
    }

    public final SystemGenericMessage getGenericMessage() {
        return this.genericMessage;
    }

    public final MeetingEndedMessage getMeetingEndedMessage() {
        return this.meetingEndedMessage;
    }

    public final MeetingStartedMessage getMeetingStartedMessage() {
        return this.meetingStartedMessage;
    }

    public final ParticipantsChange getParticipantsChange() {
        return this.participantsChange;
    }

    public final String getPayloadId() {
        return this.payloadId;
    }

    public final PersonalMeetingEndedMessage getPersonalMeetingEndedMessage() {
        return this.personalMeetingEndedMessage;
    }

    public final Integer getUserAction() {
        return this.userAction;
    }

    public final ParticipantsChange getUsersChange() {
        return this.usersChange;
    }

    public int hashCode() {
        int b = unr0.b(this.chatId.hashCode() * 31, 31, this.payloadId);
        ChatCreatedInfo chatCreatedInfo = this.chatCreatedInfo;
        int hashCode = (b + (chatCreatedInfo == null ? 0 : chatCreatedInfo.hashCode())) * 31;
        ChatInfoFromTransport chatInfoFromTransport = this.chatInfoDiff;
        int hashCode2 = (hashCode + (chatInfoFromTransport == null ? 0 : chatInfoFromTransport.hashCode())) * 31;
        ParticipantsChange participantsChange = this.usersChange;
        int hashCode3 = (hashCode2 + (participantsChange == null ? 0 : participantsChange.hashCode())) * 31;
        ParticipantsChange participantsChange2 = this.participantsChange;
        int hashCode4 = (hashCode3 + (participantsChange2 == null ? 0 : participantsChange2.hashCode())) * 31;
        Integer num = this.userAction;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        CallInfo callInfo = this.callInfo;
        int hashCode6 = (hashCode5 + (callInfo == null ? 0 : callInfo.hashCode())) * 31;
        MeetingStartedMessage meetingStartedMessage = this.meetingStartedMessage;
        int hashCode7 = (hashCode6 + (meetingStartedMessage == null ? 0 : meetingStartedMessage.hashCode())) * 31;
        MeetingEndedMessage meetingEndedMessage = this.meetingEndedMessage;
        int hashCode8 = (hashCode7 + (meetingEndedMessage == null ? 0 : meetingEndedMessage.hashCode())) * 31;
        PersonalMeetingEndedMessage personalMeetingEndedMessage = this.personalMeetingEndedMessage;
        int hashCode9 = (hashCode8 + (personalMeetingEndedMessage == null ? 0 : personalMeetingEndedMessage.hashCode())) * 31;
        SystemGenericMessage systemGenericMessage = this.genericMessage;
        return hashCode9 + (systemGenericMessage != null ? systemGenericMessage.hashCode() : 0);
    }

    public String toString() {
        String str = this.chatId;
        String str2 = this.payloadId;
        ChatCreatedInfo chatCreatedInfo = this.chatCreatedInfo;
        ChatInfoFromTransport chatInfoFromTransport = this.chatInfoDiff;
        ParticipantsChange participantsChange = this.usersChange;
        ParticipantsChange participantsChange2 = this.participantsChange;
        Integer num = this.userAction;
        CallInfo callInfo = this.callInfo;
        MeetingStartedMessage meetingStartedMessage = this.meetingStartedMessage;
        MeetingEndedMessage meetingEndedMessage = this.meetingEndedMessage;
        PersonalMeetingEndedMessage personalMeetingEndedMessage = this.personalMeetingEndedMessage;
        SystemGenericMessage systemGenericMessage = this.genericMessage;
        StringBuilder v = b64.v("SystemMessage(chatId=", str, ", payloadId=", str2, ", chatCreatedInfo=");
        v.append(chatCreatedInfo);
        v.append(", chatInfoDiff=");
        v.append(chatInfoFromTransport);
        v.append(", usersChange=");
        v.append(participantsChange);
        v.append(", participantsChange=");
        v.append(participantsChange2);
        v.append(", userAction=");
        v.append(num);
        v.append(", callInfo=");
        v.append(callInfo);
        v.append(", meetingStartedMessage=");
        v.append(meetingStartedMessage);
        v.append(", meetingEndedMessage=");
        v.append(meetingEndedMessage);
        v.append(", personalMeetingEndedMessage=");
        v.append(personalMeetingEndedMessage);
        v.append(", genericMessage=");
        v.append(systemGenericMessage);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public SystemMessage(@Json(name = "ChatId") String str, @Json(name = "PayloadId") String str2, @Json(name = "ChatCreatedInfo") ChatCreatedInfo chatCreatedInfo, @Json(name = "ChatInfoDiff") ChatInfoFromTransport chatInfoFromTransport, @Json(name = "ParticipantsChangedDiff") ParticipantsChange participantsChange, @Json(name = "ParticipantsChangedDiffV2") ParticipantsChange participantsChange2, @Json(name = "UserAction") Integer num, @Json(name = "CallInfo") CallInfo callInfo, @Json(name = "MeetingStartedMessage") MeetingStartedMessage meetingStartedMessage, @Json(name = "MeetingEndedMessage") MeetingEndedMessage meetingEndedMessage, @Json(name = "PersonalMeetingEndedMessage") PersonalMeetingEndedMessage personalMeetingEndedMessage, @Json(name = "GenericMessage") SystemGenericMessage systemGenericMessage) {
        this.chatId = str;
        this.payloadId = str2;
        this.chatCreatedInfo = chatCreatedInfo;
        this.chatInfoDiff = chatInfoFromTransport;
        this.usersChange = participantsChange;
        this.participantsChange = participantsChange2;
        this.userAction = num;
        this.callInfo = callInfo;
        this.meetingStartedMessage = meetingStartedMessage;
        this.meetingEndedMessage = meetingEndedMessage;
        this.personalMeetingEndedMessage = personalMeetingEndedMessage;
        this.genericMessage = systemGenericMessage;
    }
}
