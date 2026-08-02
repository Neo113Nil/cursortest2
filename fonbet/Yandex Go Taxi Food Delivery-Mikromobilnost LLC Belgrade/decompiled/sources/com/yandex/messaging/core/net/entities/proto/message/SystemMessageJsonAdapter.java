package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.ChatInfoFromTransport;
import com.yandex.messaging.core.net.entities.proto.calls.CallInfo;
import com.yandex.messaging.core.net.entities.proto.telemost.PersonalMeetingEndedMessage;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/SystemMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/SystemMessage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/ChatCreatedInfo;", "nullableChatCreatedInfoAdapter", "Lcom/yandex/messaging/core/net/entities/proto/ChatInfoFromTransport;", "nullableChatInfoFromTransportAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/ParticipantsChange;", "nullableParticipantsChangeAdapter", "", "nullableIntAdapter", "Lcom/yandex/messaging/core/net/entities/proto/calls/CallInfo;", "nullableCallInfoAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/MeetingStartedMessage;", "nullableMeetingStartedMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/MeetingEndedMessage;", "nullableMeetingEndedMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/telemost/PersonalMeetingEndedMessage;", "nullablePersonalMeetingEndedMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/SystemGenericMessage;", "nullableSystemGenericMessageAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SystemMessageJsonAdapter extends JsonAdapter<SystemMessage> {
    private volatile Constructor<SystemMessage> constructorRef;
    private final JsonAdapter<CallInfo> nullableCallInfoAdapter;
    private final JsonAdapter<ChatCreatedInfo> nullableChatCreatedInfoAdapter;
    private final JsonAdapter<ChatInfoFromTransport> nullableChatInfoFromTransportAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<MeetingEndedMessage> nullableMeetingEndedMessageAdapter;
    private final JsonAdapter<MeetingStartedMessage> nullableMeetingStartedMessageAdapter;
    private final JsonAdapter<ParticipantsChange> nullableParticipantsChangeAdapter;
    private final JsonAdapter<PersonalMeetingEndedMessage> nullablePersonalMeetingEndedMessageAdapter;
    private final JsonAdapter<SystemGenericMessage> nullableSystemGenericMessageAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ChatId", "PayloadId", "ChatCreatedInfo", "ChatInfoDiff", "ParticipantsChangedDiff", "ParticipantsChangedDiffV2", "UserAction", "CallInfo", "MeetingStartedMessage", "MeetingEndedMessage", "PersonalMeetingEndedMessage", "GenericMessage");
    private final JsonAdapter<String> stringAdapter;

    public SystemMessageJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.nullableChatCreatedInfoAdapter = moshi.adapter(ChatCreatedInfo.class, emptySet, "chatCreatedInfo");
        this.nullableChatInfoFromTransportAdapter = moshi.adapter(ChatInfoFromTransport.class, emptySet, "chatInfoDiff");
        this.nullableParticipantsChangeAdapter = moshi.adapter(ParticipantsChange.class, emptySet, "usersChange");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "userAction");
        this.nullableCallInfoAdapter = moshi.adapter(CallInfo.class, emptySet, "callInfo");
        this.nullableMeetingStartedMessageAdapter = moshi.adapter(MeetingStartedMessage.class, emptySet, "meetingStartedMessage");
        this.nullableMeetingEndedMessageAdapter = moshi.adapter(MeetingEndedMessage.class, emptySet, "meetingEndedMessage");
        this.nullablePersonalMeetingEndedMessageAdapter = moshi.adapter(PersonalMeetingEndedMessage.class, emptySet, "personalMeetingEndedMessage");
        this.nullableSystemGenericMessageAdapter = moshi.adapter(SystemGenericMessage.class, emptySet, "genericMessage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SystemMessage fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        String str = null;
        String str2 = null;
        ChatCreatedInfo chatCreatedInfo = null;
        ChatInfoFromTransport chatInfoFromTransport = null;
        ParticipantsChange participantsChange = null;
        ParticipantsChange participantsChange2 = null;
        Integer num = null;
        CallInfo callInfo = null;
        MeetingStartedMessage meetingStartedMessage = null;
        MeetingEndedMessage meetingEndedMessage = null;
        PersonalMeetingEndedMessage personalMeetingEndedMessage = null;
        SystemGenericMessage systemGenericMessage = null;
        while (true) {
            String str3 = str;
            String str4 = str2;
            if (!jsonReader.hasNext()) {
                ChatCreatedInfo chatCreatedInfo2 = chatCreatedInfo;
                jsonReader.endObject();
                if (i2 == -4093) {
                    if (str3 == null) {
                        throw Util.missingProperty("chatId", "ChatId", jsonReader);
                    }
                    if (str4 == null) {
                        throw Util.missingProperty("payloadId", "PayloadId", jsonReader);
                    }
                    MeetingStartedMessage meetingStartedMessage2 = meetingStartedMessage;
                    CallInfo callInfo2 = callInfo;
                    Integer num2 = num;
                    return new SystemMessage(str3, str4, chatCreatedInfo2, chatInfoFromTransport, participantsChange, participantsChange2, num2, callInfo2, meetingStartedMessage2, meetingEndedMessage, personalMeetingEndedMessage, systemGenericMessage);
                }
                Constructor<SystemMessage> constructor = this.constructorRef;
                if (constructor == null) {
                    i = i2;
                    constructor = SystemMessage.class.getDeclaredConstructor(String.class, String.class, ChatCreatedInfo.class, ChatInfoFromTransport.class, ParticipantsChange.class, ParticipantsChange.class, Integer.class, CallInfo.class, MeetingStartedMessage.class, MeetingEndedMessage.class, PersonalMeetingEndedMessage.class, SystemGenericMessage.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<SystemMessage> constructor2 = constructor;
                if (str3 == null) {
                    throw Util.missingProperty("chatId", "ChatId", jsonReader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("payloadId", "PayloadId", jsonReader);
                }
                return constructor2.newInstance(str3, str4, chatCreatedInfo2, chatInfoFromTransport, participantsChange, participantsChange2, num, callInfo, meetingStartedMessage, meetingEndedMessage, personalMeetingEndedMessage, systemGenericMessage, Integer.valueOf(i), null);
            }
            ChatCreatedInfo chatCreatedInfo3 = chatCreatedInfo;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    chatCreatedInfo = chatCreatedInfo3;
                    str = str3;
                    str2 = str4;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("chatId", "ChatId", jsonReader);
                    }
                    chatCreatedInfo = chatCreatedInfo3;
                    str2 = str4;
                case 1:
                    String fromJson = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("payloadId", "PayloadId", jsonReader);
                    }
                    str2 = fromJson;
                    chatCreatedInfo = chatCreatedInfo3;
                    str = str3;
                case 2:
                    chatCreatedInfo = this.nullableChatCreatedInfoAdapter.fromJson(jsonReader);
                    i2 &= -5;
                    str = str3;
                    str2 = str4;
                case 3:
                    chatInfoFromTransport = this.nullableChatInfoFromTransportAdapter.fromJson(jsonReader);
                    i2 &= -9;
                    chatCreatedInfo = chatCreatedInfo3;
                    str = str3;
                    str2 = str4;
                case 4:
                    participantsChange = this.nullableParticipantsChangeAdapter.fromJson(jsonReader);
                    i2 &= -17;
                    chatCreatedInfo = chatCreatedInfo3;
                    str = str3;
                    str2 = str4;
                case 5:
                    participantsChange2 = this.nullableParticipantsChangeAdapter.fromJson(jsonReader);
                    i2 &= -33;
                    chatCreatedInfo = chatCreatedInfo3;
                    str = str3;
                    str2 = str4;
                case 6:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    i2 &= -65;
                    chatCreatedInfo = chatCreatedInfo3;
                    str = str3;
                    str2 = str4;
                case 7:
                    callInfo = this.nullableCallInfoAdapter.fromJson(jsonReader);
                    i2 &= -129;
                    chatCreatedInfo = chatCreatedInfo3;
                    str = str3;
                    str2 = str4;
                case 8:
                    meetingStartedMessage = this.nullableMeetingStartedMessageAdapter.fromJson(jsonReader);
                    i2 &= -257;
                    chatCreatedInfo = chatCreatedInfo3;
                    str = str3;
                    str2 = str4;
                case 9:
                    meetingEndedMessage = this.nullableMeetingEndedMessageAdapter.fromJson(jsonReader);
                    i2 &= -513;
                    chatCreatedInfo = chatCreatedInfo3;
                    str = str3;
                    str2 = str4;
                case 10:
                    personalMeetingEndedMessage = this.nullablePersonalMeetingEndedMessageAdapter.fromJson(jsonReader);
                    i2 &= -1025;
                    chatCreatedInfo = chatCreatedInfo3;
                    str = str3;
                    str2 = str4;
                case 11:
                    systemGenericMessage = this.nullableSystemGenericMessageAdapter.fromJson(jsonReader);
                    i2 &= -2049;
                    chatCreatedInfo = chatCreatedInfo3;
                    str = str3;
                    str2 = str4;
                default:
                    chatCreatedInfo = chatCreatedInfo3;
                    str = str3;
                    str2 = str4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SystemMessage systemMessage) {
        SystemMessage systemMessage2 = systemMessage;
        if (systemMessage2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ChatId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) systemMessage2.getChatId());
        jsonWriter.name("PayloadId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) systemMessage2.getPayloadId());
        jsonWriter.name("ChatCreatedInfo");
        this.nullableChatCreatedInfoAdapter.toJson(jsonWriter, (JsonWriter) systemMessage2.getChatCreatedInfo());
        jsonWriter.name("ChatInfoDiff");
        this.nullableChatInfoFromTransportAdapter.toJson(jsonWriter, (JsonWriter) systemMessage2.getChatInfoDiff());
        jsonWriter.name("ParticipantsChangedDiff");
        this.nullableParticipantsChangeAdapter.toJson(jsonWriter, (JsonWriter) systemMessage2.getUsersChange());
        jsonWriter.name("ParticipantsChangedDiffV2");
        this.nullableParticipantsChangeAdapter.toJson(jsonWriter, (JsonWriter) systemMessage2.getParticipantsChange());
        jsonWriter.name("UserAction");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) systemMessage2.getUserAction());
        jsonWriter.name("CallInfo");
        this.nullableCallInfoAdapter.toJson(jsonWriter, (JsonWriter) systemMessage2.getCallInfo());
        jsonWriter.name("MeetingStartedMessage");
        this.nullableMeetingStartedMessageAdapter.toJson(jsonWriter, (JsonWriter) systemMessage2.getMeetingStartedMessage());
        jsonWriter.name("MeetingEndedMessage");
        this.nullableMeetingEndedMessageAdapter.toJson(jsonWriter, (JsonWriter) systemMessage2.getMeetingEndedMessage());
        jsonWriter.name("PersonalMeetingEndedMessage");
        this.nullablePersonalMeetingEndedMessageAdapter.toJson(jsonWriter, (JsonWriter) systemMessage2.getPersonalMeetingEndedMessage());
        jsonWriter.name("GenericMessage");
        this.nullableSystemGenericMessageAdapter.toJson(jsonWriter, (JsonWriter) systemMessage2.getGenericMessage());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(SystemMessage)");
    }
}
