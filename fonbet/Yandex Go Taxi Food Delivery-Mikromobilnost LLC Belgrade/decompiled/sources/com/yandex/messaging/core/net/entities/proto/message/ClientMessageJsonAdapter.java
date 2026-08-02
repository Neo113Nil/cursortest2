package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.calls.CallingMessage;
import com.yandex.messaging.core.net.entities.proto.telemost.MeetingCallingMessage;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\fR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\fR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\fR\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\fR\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\fR\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\fR\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\fR\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\fR\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\fR\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\fR\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\fR\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\fR\u001c\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\fR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\fR\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\fR\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ClientMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/ClientMessage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/proto/message/Typing;", "nullableTypingAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/Heartbeat;", "nullableHeartbeatAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/SeenMarker;", "nullableSeenMarkerAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage;", "nullablePlainMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/StateSync;", "nullableStateSyncAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/SystemMessage;", "nullableSystemMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest;", "nullableBotRequestAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/ServerNotification;", "nullableServerNotificationAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/Report;", "nullableReportAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/Reaction;", "nullableReactionAdapter", "Lcom/yandex/messaging/core/net/entities/proto/calls/CallingMessage;", "nullableCallingMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingCallingMessage;", "nullableMeetingCallingMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/PinMessage;", "nullablePinMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/ChatApproval;", "nullableChatApprovalAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/ReadMarker;", "nullableReadMarkerAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/UpdateFields;", "nullableUpdateFieldsAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/ClearUserHistory;", "nullableClearUserHistoryAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/Vote;", "nullableVoteAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/TranslationMessage;", "nullableTranslationMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/UserStatusMessage;", "nullableUserStatusMessageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/UnseenMarker;", "nullableUnseenMarkerAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/TypingEnhanced;", "nullableTypingEnhancedAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/ChatOpen;", "nullableChatOpenAdapter", "", "booleanAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ClientMessageJsonAdapter extends JsonAdapter<ClientMessage> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ClientMessage> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<BotRequest> nullableBotRequestAdapter;
    private final JsonAdapter<CallingMessage> nullableCallingMessageAdapter;
    private final JsonAdapter<ChatApproval> nullableChatApprovalAdapter;
    private final JsonAdapter<ChatOpen> nullableChatOpenAdapter;
    private final JsonAdapter<ClearUserHistory> nullableClearUserHistoryAdapter;
    private final JsonAdapter<Heartbeat> nullableHeartbeatAdapter;
    private final JsonAdapter<MeetingCallingMessage> nullableMeetingCallingMessageAdapter;
    private final JsonAdapter<PinMessage> nullablePinMessageAdapter;
    private final JsonAdapter<PlainMessage> nullablePlainMessageAdapter;
    private final JsonAdapter<Reaction> nullableReactionAdapter;
    private final JsonAdapter<ReadMarker> nullableReadMarkerAdapter;
    private final JsonAdapter<Report> nullableReportAdapter;
    private final JsonAdapter<SeenMarker> nullableSeenMarkerAdapter;
    private final JsonAdapter<ServerNotification> nullableServerNotificationAdapter;
    private final JsonAdapter<StateSync> nullableStateSyncAdapter;
    private final JsonAdapter<SystemMessage> nullableSystemMessageAdapter;
    private final JsonAdapter<TranslationMessage> nullableTranslationMessageAdapter;
    private final JsonAdapter<Typing> nullableTypingAdapter;
    private final JsonAdapter<TypingEnhanced> nullableTypingEnhancedAdapter;
    private final JsonAdapter<UnseenMarker> nullableUnseenMarkerAdapter;
    private final JsonAdapter<UpdateFields> nullableUpdateFieldsAdapter;
    private final JsonAdapter<UserStatusMessage> nullableUserStatusMessageAdapter;
    private final JsonAdapter<Vote> nullableVoteAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Typing", "Heartbeat", "SeenMarker", "Plain", "StateSync", "SystemMessage", "BotRequest", "Notification", "Report", "Reaction", "CallingMessage", "MeetingCallingMessage", "Pin", "Unpin", "ChatApproval", "ReadMarker", "UpdateFields", "ClearUserHistory", "Vote", "TranslationMessage", "UserStatus", "UnseenMarker", "TypingEnhanced", "Ephemeral", "ChatOpen", "IsSilent", "NotificationBehaviour", "PersistentInlineButtons");

    public ClientMessageJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableTypingAdapter = moshi.adapter(Typing.class, emptySet, "typing");
        this.nullableHeartbeatAdapter = moshi.adapter(Heartbeat.class, emptySet, "heartbeat");
        this.nullableSeenMarkerAdapter = moshi.adapter(SeenMarker.class, emptySet, "seenMarker");
        this.nullablePlainMessageAdapter = moshi.adapter(PlainMessage.class, emptySet, "plain");
        this.nullableStateSyncAdapter = moshi.adapter(StateSync.class, emptySet, "stateSync");
        this.nullableSystemMessageAdapter = moshi.adapter(SystemMessage.class, emptySet, "systemMessage");
        this.nullableBotRequestAdapter = moshi.adapter(BotRequest.class, emptySet, "botRequest");
        this.nullableServerNotificationAdapter = moshi.adapter(ServerNotification.class, emptySet, "notification");
        this.nullableReportAdapter = moshi.adapter(Report.class, emptySet, "report");
        this.nullableReactionAdapter = moshi.adapter(Reaction.class, emptySet, "reaction");
        this.nullableCallingMessageAdapter = moshi.adapter(CallingMessage.class, emptySet, "callingMessage");
        this.nullableMeetingCallingMessageAdapter = moshi.adapter(MeetingCallingMessage.class, emptySet, "meetingCallingMessage");
        this.nullablePinMessageAdapter = moshi.adapter(PinMessage.class, emptySet, "pin");
        this.nullableChatApprovalAdapter = moshi.adapter(ChatApproval.class, emptySet, "chatApproval");
        this.nullableReadMarkerAdapter = moshi.adapter(ReadMarker.class, emptySet, "readMarker");
        this.nullableUpdateFieldsAdapter = moshi.adapter(UpdateFields.class, emptySet, "updateFields");
        this.nullableClearUserHistoryAdapter = moshi.adapter(ClearUserHistory.class, emptySet, "clearUserHistory");
        this.nullableVoteAdapter = moshi.adapter(Vote.class, emptySet, "vote");
        this.nullableTranslationMessageAdapter = moshi.adapter(TranslationMessage.class, emptySet, "translationMessage");
        this.nullableUserStatusMessageAdapter = moshi.adapter(UserStatusMessage.class, emptySet, "userStatus");
        this.nullableUnseenMarkerAdapter = moshi.adapter(UnseenMarker.class, emptySet, "unseenMarker");
        this.nullableTypingEnhancedAdapter = moshi.adapter(TypingEnhanced.class, emptySet, "typingEnhanced");
        this.nullableChatOpenAdapter = moshi.adapter(ChatOpen.class, emptySet, "chatOpen");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isSilent");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "notificationBehaviour");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ClientMessage fromJson(JsonReader jsonReader) {
        Typing typing;
        int i;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        PlainMessage plainMessage = null;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Integer num = 0;
        Heartbeat heartbeat = null;
        SeenMarker seenMarker = null;
        Typing typing2 = null;
        BotRequest botRequest = null;
        ServerNotification serverNotification = null;
        SystemMessage systemMessage = null;
        Report report = null;
        Reaction reaction = null;
        CallingMessage callingMessage = null;
        MeetingCallingMessage meetingCallingMessage = null;
        PinMessage pinMessage = null;
        PinMessage pinMessage2 = null;
        ChatApproval chatApproval = null;
        ReadMarker readMarker = null;
        UpdateFields updateFields = null;
        ClearUserHistory clearUserHistory = null;
        Vote vote = null;
        TranslationMessage translationMessage = null;
        UserStatusMessage userStatusMessage = null;
        UnseenMarker unseenMarker = null;
        TypingEnhanced typingEnhanced = null;
        PlainMessage plainMessage2 = null;
        ChatOpen chatOpen = null;
        int i2 = -1;
        StateSync stateSync = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    typing2 = this.nullableTypingAdapter.fromJson(jsonReader);
                    i2 &= -2;
                    continue;
                case 1:
                    heartbeat = this.nullableHeartbeatAdapter.fromJson(jsonReader);
                    i2 &= -3;
                    continue;
                case 2:
                    seenMarker = this.nullableSeenMarkerAdapter.fromJson(jsonReader);
                    i2 &= -5;
                    continue;
                case 3:
                    plainMessage = this.nullablePlainMessageAdapter.fromJson(jsonReader);
                    i2 &= -9;
                    continue;
                case 4:
                    stateSync = this.nullableStateSyncAdapter.fromJson(jsonReader);
                    i2 &= -17;
                    continue;
                case 5:
                    systemMessage = this.nullableSystemMessageAdapter.fromJson(jsonReader);
                    i2 &= -33;
                    continue;
                case 6:
                    botRequest = this.nullableBotRequestAdapter.fromJson(jsonReader);
                    i2 &= -65;
                    continue;
                case 7:
                    serverNotification = this.nullableServerNotificationAdapter.fromJson(jsonReader);
                    i2 &= -129;
                    continue;
                case 8:
                    report = this.nullableReportAdapter.fromJson(jsonReader);
                    i2 &= -257;
                    continue;
                case 9:
                    reaction = this.nullableReactionAdapter.fromJson(jsonReader);
                    i2 &= -513;
                    continue;
                case 10:
                    callingMessage = this.nullableCallingMessageAdapter.fromJson(jsonReader);
                    i2 &= -1025;
                    continue;
                case 11:
                    meetingCallingMessage = this.nullableMeetingCallingMessageAdapter.fromJson(jsonReader);
                    i2 &= -2049;
                    continue;
                case 12:
                    pinMessage = this.nullablePinMessageAdapter.fromJson(jsonReader);
                    i2 &= -4097;
                    continue;
                case 13:
                    pinMessage2 = this.nullablePinMessageAdapter.fromJson(jsonReader);
                    i2 &= -8193;
                    continue;
                case 14:
                    chatApproval = this.nullableChatApprovalAdapter.fromJson(jsonReader);
                    i2 &= -16385;
                    continue;
                case 15:
                    readMarker = this.nullableReadMarkerAdapter.fromJson(jsonReader);
                    i = -32769;
                    break;
                case 16:
                    updateFields = this.nullableUpdateFieldsAdapter.fromJson(jsonReader);
                    i = -65537;
                    break;
                case 17:
                    clearUserHistory = this.nullableClearUserHistoryAdapter.fromJson(jsonReader);
                    i = -131073;
                    break;
                case 18:
                    vote = this.nullableVoteAdapter.fromJson(jsonReader);
                    i = -262145;
                    break;
                case 19:
                    translationMessage = this.nullableTranslationMessageAdapter.fromJson(jsonReader);
                    i = -524289;
                    break;
                case 20:
                    userStatusMessage = this.nullableUserStatusMessageAdapter.fromJson(jsonReader);
                    i = -1048577;
                    break;
                case 21:
                    unseenMarker = this.nullableUnseenMarkerAdapter.fromJson(jsonReader);
                    i = -2097153;
                    break;
                case 22:
                    typingEnhanced = this.nullableTypingEnhancedAdapter.fromJson(jsonReader);
                    i = -4194305;
                    break;
                case 23:
                    plainMessage2 = this.nullablePlainMessageAdapter.fromJson(jsonReader);
                    i = -8388609;
                    break;
                case 24:
                    chatOpen = this.nullableChatOpenAdapter.fromJson(jsonReader);
                    i = -16777217;
                    break;
                case 25:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isSilent", "IsSilent", jsonReader);
                    }
                    i = -33554433;
                    break;
                case 26:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("notificationBehaviour", "NotificationBehaviour", jsonReader);
                    }
                    i = -67108865;
                    break;
                case 27:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("withPersistentInlineButtons", "PersistentInlineButtons", jsonReader);
                    }
                    i = -134217729;
                    break;
            }
            i2 &= i;
        }
        jsonReader.endObject();
        if (i2 == -268435456) {
            return new ClientMessage(typing2, heartbeat, seenMarker, plainMessage, stateSync, systemMessage, botRequest, serverNotification, report, reaction, callingMessage, meetingCallingMessage, pinMessage, pinMessage2, chatApproval, readMarker, updateFields, clearUserHistory, vote, translationMessage, userStatusMessage, unseenMarker, typingEnhanced, plainMessage2, chatOpen, bool2.booleanValue(), num.intValue(), bool3.booleanValue());
        }
        Typing typing3 = typing2;
        SystemMessage systemMessage2 = systemMessage;
        CallingMessage callingMessage2 = callingMessage;
        MeetingCallingMessage meetingCallingMessage2 = meetingCallingMessage;
        PinMessage pinMessage3 = pinMessage;
        ReadMarker readMarker2 = readMarker;
        UpdateFields updateFields2 = updateFields;
        ClearUserHistory clearUserHistory2 = clearUserHistory;
        UserStatusMessage userStatusMessage2 = userStatusMessage;
        UnseenMarker unseenMarker2 = unseenMarker;
        TypingEnhanced typingEnhanced2 = typingEnhanced;
        Constructor<ClientMessage> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Boolean.TYPE;
            typing = typing3;
            constructor = ClientMessage.class.getDeclaredConstructor(Typing.class, Heartbeat.class, SeenMarker.class, PlainMessage.class, StateSync.class, SystemMessage.class, BotRequest.class, ServerNotification.class, Report.class, Reaction.class, CallingMessage.class, MeetingCallingMessage.class, PinMessage.class, PinMessage.class, ChatApproval.class, ReadMarker.class, UpdateFields.class, ClearUserHistory.class, Vote.class, TranslationMessage.class, UserStatusMessage.class, UnseenMarker.class, TypingEnhanced.class, PlainMessage.class, ChatOpen.class, cls3, cls, cls3, cls, cls2);
            this.constructorRef = constructor;
        } else {
            typing = typing3;
        }
        return constructor.newInstance(typing, heartbeat, seenMarker, plainMessage, stateSync, systemMessage2, botRequest, serverNotification, report, reaction, callingMessage2, meetingCallingMessage2, pinMessage3, pinMessage2, chatApproval, readMarker2, updateFields2, clearUserHistory2, vote, translationMessage, userStatusMessage2, unseenMarker2, typingEnhanced2, plainMessage2, chatOpen, bool2, num, bool3, Integer.valueOf(i2), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ClientMessage clientMessage) {
        ClientMessage clientMessage2 = clientMessage;
        if (clientMessage2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Typing");
        this.nullableTypingAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.typing);
        jsonWriter.name("Heartbeat");
        this.nullableHeartbeatAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.heartbeat);
        jsonWriter.name("SeenMarker");
        this.nullableSeenMarkerAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.seenMarker);
        jsonWriter.name("Plain");
        this.nullablePlainMessageAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.plain);
        jsonWriter.name("StateSync");
        this.nullableStateSyncAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.stateSync);
        jsonWriter.name("SystemMessage");
        this.nullableSystemMessageAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.systemMessage);
        jsonWriter.name("BotRequest");
        this.nullableBotRequestAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.botRequest);
        jsonWriter.name("Notification");
        this.nullableServerNotificationAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.notification);
        jsonWriter.name("Report");
        this.nullableReportAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.report);
        jsonWriter.name("Reaction");
        this.nullableReactionAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.reaction);
        jsonWriter.name("CallingMessage");
        this.nullableCallingMessageAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.callingMessage);
        jsonWriter.name("MeetingCallingMessage");
        this.nullableMeetingCallingMessageAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.meetingCallingMessage);
        jsonWriter.name("Pin");
        this.nullablePinMessageAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.pin);
        jsonWriter.name("Unpin");
        this.nullablePinMessageAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.unpin);
        jsonWriter.name("ChatApproval");
        this.nullableChatApprovalAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.chatApproval);
        jsonWriter.name("ReadMarker");
        this.nullableReadMarkerAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.readMarker);
        jsonWriter.name("UpdateFields");
        this.nullableUpdateFieldsAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.updateFields);
        jsonWriter.name("ClearUserHistory");
        this.nullableClearUserHistoryAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.clearUserHistory);
        jsonWriter.name("Vote");
        this.nullableVoteAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.vote);
        jsonWriter.name("TranslationMessage");
        this.nullableTranslationMessageAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.translationMessage);
        jsonWriter.name("UserStatus");
        this.nullableUserStatusMessageAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.userStatus);
        jsonWriter.name("UnseenMarker");
        this.nullableUnseenMarkerAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.unseenMarker);
        jsonWriter.name("TypingEnhanced");
        this.nullableTypingEnhancedAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.getTypingEnhanced());
        jsonWriter.name("Ephemeral");
        this.nullablePlainMessageAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.ephemeral);
        jsonWriter.name("ChatOpen");
        this.nullableChatOpenAdapter.toJson(jsonWriter, (JsonWriter) clientMessage2.chatOpen);
        jsonWriter.name("IsSilent");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(clientMessage2.isSilent));
        jsonWriter.name("NotificationBehaviour");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(clientMessage2.notificationBehaviour));
        jsonWriter.name("PersistentInlineButtons");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(clientMessage2.withPersistentInlineButtons));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(ClientMessage)");
    }
}
