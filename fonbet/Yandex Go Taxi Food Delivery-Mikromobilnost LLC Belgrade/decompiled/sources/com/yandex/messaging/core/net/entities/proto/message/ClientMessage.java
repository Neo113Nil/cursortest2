package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.proto.calls.CallingMessage;
import com.yandex.messaging.core.net.entities.proto.telemost.MeetingCallingMessage;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0002\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0003\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0003\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u00100\u001a\u0004\u0018\u000101\u0012\b\b\u0003\u00102\u001a\u000203\u0012\b\b\u0003\u00104\u001a\u000205\u0012\b\b\u0003\u00106\u001a\u000203¢\u0006\u0004\b7\u00108J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010&HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010(HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010*HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010,HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010.HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u000101HÆ\u0003J\t\u0010T\u001a\u000203HÆ\u0003J\t\u0010U\u001a\u000205HÆ\u0003J\t\u0010V\u001a\u000203HÆ\u0003JÓ\u0002\u0010W\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0003\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0003\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\t2\n\b\u0003\u00100\u001a\u0004\u0018\u0001012\b\b\u0003\u00102\u001a\u0002032\b\b\u0003\u00104\u001a\u0002052\b\b\u0003\u00106\u001a\u000203HÆ\u0001J\u0013\u0010X\u001a\u0002032\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u000205HÖ\u0001J\t\u0010[\u001a\u00020\\HÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010-\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0012\u0010/\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00100\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0002038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0002058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0002038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006]"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ClientMessage;", "", "typing", "Lcom/yandex/messaging/core/net/entities/proto/message/Typing;", "heartbeat", "Lcom/yandex/messaging/core/net/entities/proto/message/Heartbeat;", "seenMarker", "Lcom/yandex/messaging/core/net/entities/proto/message/SeenMarker;", "plain", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage;", "stateSync", "Lcom/yandex/messaging/core/net/entities/proto/message/StateSync;", "systemMessage", "Lcom/yandex/messaging/core/net/entities/proto/message/SystemMessage;", "botRequest", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest;", "notification", "Lcom/yandex/messaging/core/net/entities/proto/message/ServerNotification;", "report", "Lcom/yandex/messaging/core/net/entities/proto/message/Report;", "reaction", "Lcom/yandex/messaging/core/net/entities/proto/message/Reaction;", "callingMessage", "Lcom/yandex/messaging/core/net/entities/proto/calls/CallingMessage;", "meetingCallingMessage", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingCallingMessage;", "pin", "Lcom/yandex/messaging/core/net/entities/proto/message/PinMessage;", "unpin", "chatApproval", "Lcom/yandex/messaging/core/net/entities/proto/message/ChatApproval;", "readMarker", "Lcom/yandex/messaging/core/net/entities/proto/message/ReadMarker;", "updateFields", "Lcom/yandex/messaging/core/net/entities/proto/message/UpdateFields;", "clearUserHistory", "Lcom/yandex/messaging/core/net/entities/proto/message/ClearUserHistory;", "vote", "Lcom/yandex/messaging/core/net/entities/proto/message/Vote;", "translationMessage", "Lcom/yandex/messaging/core/net/entities/proto/message/TranslationMessage;", "userStatus", "Lcom/yandex/messaging/core/net/entities/proto/message/UserStatusMessage;", "unseenMarker", "Lcom/yandex/messaging/core/net/entities/proto/message/UnseenMarker;", "typingEnhanced", "Lcom/yandex/messaging/core/net/entities/proto/message/TypingEnhanced;", "ephemeral", "chatOpen", "Lcom/yandex/messaging/core/net/entities/proto/message/ChatOpen;", "isSilent", "", "notificationBehaviour", "", "withPersistentInlineButtons", "<init>", "(Lcom/yandex/messaging/core/net/entities/proto/message/Typing;Lcom/yandex/messaging/core/net/entities/proto/message/Heartbeat;Lcom/yandex/messaging/core/net/entities/proto/message/SeenMarker;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage;Lcom/yandex/messaging/core/net/entities/proto/message/StateSync;Lcom/yandex/messaging/core/net/entities/proto/message/SystemMessage;Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest;Lcom/yandex/messaging/core/net/entities/proto/message/ServerNotification;Lcom/yandex/messaging/core/net/entities/proto/message/Report;Lcom/yandex/messaging/core/net/entities/proto/message/Reaction;Lcom/yandex/messaging/core/net/entities/proto/calls/CallingMessage;Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingCallingMessage;Lcom/yandex/messaging/core/net/entities/proto/message/PinMessage;Lcom/yandex/messaging/core/net/entities/proto/message/PinMessage;Lcom/yandex/messaging/core/net/entities/proto/message/ChatApproval;Lcom/yandex/messaging/core/net/entities/proto/message/ReadMarker;Lcom/yandex/messaging/core/net/entities/proto/message/UpdateFields;Lcom/yandex/messaging/core/net/entities/proto/message/ClearUserHistory;Lcom/yandex/messaging/core/net/entities/proto/message/Vote;Lcom/yandex/messaging/core/net/entities/proto/message/TranslationMessage;Lcom/yandex/messaging/core/net/entities/proto/message/UserStatusMessage;Lcom/yandex/messaging/core/net/entities/proto/message/UnseenMarker;Lcom/yandex/messaging/core/net/entities/proto/message/TypingEnhanced;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage;Lcom/yandex/messaging/core/net/entities/proto/message/ChatOpen;ZIZ)V", "getTypingEnhanced", "()Lcom/yandex/messaging/core/net/entities/proto/message/TypingEnhanced;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "equals", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ClientMessage {

    @xuf0(tag = 7)
    public final BotRequest botRequest;

    @xuf0(tag = 12)
    public final CallingMessage callingMessage;

    @xuf0(tag = 15)
    public final ChatApproval chatApproval;

    @xuf0(tag = 30)
    public final ChatOpen chatOpen;

    @xuf0(tag = 20)
    public final ClearUserHistory clearUserHistory;

    @xuf0(tag = 29)
    public final PlainMessage ephemeral;

    @xuf0(tag = 2)
    public final Heartbeat heartbeat;

    @xuf0(tag = 101)
    public final boolean isSilent;

    @xuf0(tag = 24)
    public final MeetingCallingMessage meetingCallingMessage;

    @xuf0(tag = 21)
    public final ServerNotification notification;

    @xuf0(tag = 103)
    public final int notificationBehaviour;

    @xuf0(tag = 13)
    public final PinMessage pin;

    @xuf0(tag = 4)
    public final PlainMessage plain;

    @xuf0(tag = 11)
    public final Reaction reaction;

    @xuf0(tag = 16)
    public final ReadMarker readMarker;

    @xuf0(tag = 8)
    public final Report report;

    @xuf0(tag = 3)
    public final SeenMarker seenMarker;

    @xuf0(tag = 5)
    public final StateSync stateSync;

    @xuf0(tag = 6)
    public final SystemMessage systemMessage;

    @xuf0(tag = 25)
    public final TranslationMessage translationMessage;

    @xuf0(tag = 1)
    public final Typing typing;

    @xuf0(tag = 28)
    private final TypingEnhanced typingEnhanced;

    @xuf0(tag = 14)
    public final PinMessage unpin;

    @xuf0(tag = 27)
    public final UnseenMarker unseenMarker;

    @xuf0(tag = 19)
    public final UpdateFields updateFields;

    @xuf0(tag = 26)
    public final UserStatusMessage userStatus;

    @xuf0(tag = 22)
    public final Vote vote;

    @xuf0(tag = 104)
    public final boolean withPersistentInlineButtons;

    public /* synthetic */ ClientMessage(Typing typing, Heartbeat heartbeat, SeenMarker seenMarker, PlainMessage plainMessage, StateSync stateSync, SystemMessage systemMessage, BotRequest botRequest, ServerNotification serverNotification, Report report, Reaction reaction, CallingMessage callingMessage, MeetingCallingMessage meetingCallingMessage, PinMessage pinMessage, PinMessage pinMessage2, ChatApproval chatApproval, ReadMarker readMarker, UpdateFields updateFields, ClearUserHistory clearUserHistory, Vote vote, TranslationMessage translationMessage, UserStatusMessage userStatusMessage, UnseenMarker unseenMarker, TypingEnhanced typingEnhanced, PlainMessage plainMessage2, ChatOpen chatOpen, boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : typing, (i2 & 2) != 0 ? null : heartbeat, (i2 & 4) != 0 ? null : seenMarker, (i2 & 8) != 0 ? null : plainMessage, (i2 & 16) != 0 ? null : stateSync, (i2 & 32) != 0 ? null : systemMessage, (i2 & 64) != 0 ? null : botRequest, (i2 & 128) != 0 ? null : serverNotification, (i2 & 256) != 0 ? null : report, (i2 & 512) != 0 ? null : reaction, (i2 & 1024) != 0 ? null : callingMessage, (i2 & 2048) != 0 ? null : meetingCallingMessage, (i2 & 4096) != 0 ? null : pinMessage, (i2 & 8192) != 0 ? null : pinMessage2, (i2 & 16384) != 0 ? null : chatApproval, (i2 & 32768) != 0 ? null : readMarker, (i2 & 65536) != 0 ? null : updateFields, (i2 & 131072) != 0 ? null : clearUserHistory, (i2 & 262144) != 0 ? null : vote, (i2 & 524288) != 0 ? null : translationMessage, (i2 & 1048576) != 0 ? null : userStatusMessage, (i2 & 2097152) != 0 ? null : unseenMarker, (i2 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? null : typingEnhanced, (i2 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? null : plainMessage2, (i2 & 16777216) != 0 ? null : chatOpen, (i2 & SelfTester_JCP.DECRYPT_CFB) != 0 ? false : z, (i2 & SelfTester_JCP.DECRYPT_CBC) != 0 ? 0 : i, (i2 & SelfTester_JCP.DECRYPT_CNT) != 0 ? false : z2);
    }

    public static /* synthetic */ ClientMessage copy$default(ClientMessage clientMessage, Typing typing, Heartbeat heartbeat, SeenMarker seenMarker, PlainMessage plainMessage, StateSync stateSync, SystemMessage systemMessage, BotRequest botRequest, ServerNotification serverNotification, Report report, Reaction reaction, CallingMessage callingMessage, MeetingCallingMessage meetingCallingMessage, PinMessage pinMessage, PinMessage pinMessage2, ChatApproval chatApproval, ReadMarker readMarker, UpdateFields updateFields, ClearUserHistory clearUserHistory, Vote vote, TranslationMessage translationMessage, UserStatusMessage userStatusMessage, UnseenMarker unseenMarker, TypingEnhanced typingEnhanced, PlainMessage plainMessage2, ChatOpen chatOpen, boolean z, int i, boolean z2, int i2, Object obj) {
        boolean z3;
        int i3;
        Typing typing2 = (i2 & 1) != 0 ? clientMessage.typing : typing;
        Heartbeat heartbeat2 = (i2 & 2) != 0 ? clientMessage.heartbeat : heartbeat;
        SeenMarker seenMarker2 = (i2 & 4) != 0 ? clientMessage.seenMarker : seenMarker;
        PlainMessage plainMessage3 = (i2 & 8) != 0 ? clientMessage.plain : plainMessage;
        StateSync stateSync2 = (i2 & 16) != 0 ? clientMessage.stateSync : stateSync;
        SystemMessage systemMessage2 = (i2 & 32) != 0 ? clientMessage.systemMessage : systemMessage;
        BotRequest botRequest2 = (i2 & 64) != 0 ? clientMessage.botRequest : botRequest;
        ServerNotification serverNotification2 = (i2 & 128) != 0 ? clientMessage.notification : serverNotification;
        Report report2 = (i2 & 256) != 0 ? clientMessage.report : report;
        Reaction reaction2 = (i2 & 512) != 0 ? clientMessage.reaction : reaction;
        CallingMessage callingMessage2 = (i2 & 1024) != 0 ? clientMessage.callingMessage : callingMessage;
        MeetingCallingMessage meetingCallingMessage2 = (i2 & 2048) != 0 ? clientMessage.meetingCallingMessage : meetingCallingMessage;
        PinMessage pinMessage3 = (i2 & 4096) != 0 ? clientMessage.pin : pinMessage;
        PinMessage pinMessage4 = (i2 & 8192) != 0 ? clientMessage.unpin : pinMessage2;
        Typing typing3 = typing2;
        ChatApproval chatApproval2 = (i2 & 16384) != 0 ? clientMessage.chatApproval : chatApproval;
        ReadMarker readMarker2 = (i2 & 32768) != 0 ? clientMessage.readMarker : readMarker;
        UpdateFields updateFields2 = (i2 & 65536) != 0 ? clientMessage.updateFields : updateFields;
        ClearUserHistory clearUserHistory2 = (i2 & 131072) != 0 ? clientMessage.clearUserHistory : clearUserHistory;
        Vote vote2 = (i2 & 262144) != 0 ? clientMessage.vote : vote;
        TranslationMessage translationMessage2 = (i2 & 524288) != 0 ? clientMessage.translationMessage : translationMessage;
        UserStatusMessage userStatusMessage2 = (i2 & 1048576) != 0 ? clientMessage.userStatus : userStatusMessage;
        UnseenMarker unseenMarker2 = (i2 & 2097152) != 0 ? clientMessage.unseenMarker : unseenMarker;
        TypingEnhanced typingEnhanced2 = (i2 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? clientMessage.typingEnhanced : typingEnhanced;
        PlainMessage plainMessage4 = (i2 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? clientMessage.ephemeral : plainMessage2;
        ChatOpen chatOpen2 = (i2 & 16777216) != 0 ? clientMessage.chatOpen : chatOpen;
        boolean z4 = (i2 & SelfTester_JCP.DECRYPT_CFB) != 0 ? clientMessage.isSilent : z;
        int i4 = (i2 & SelfTester_JCP.DECRYPT_CBC) != 0 ? clientMessage.notificationBehaviour : i;
        if ((i2 & SelfTester_JCP.DECRYPT_CNT) != 0) {
            i3 = i4;
            z3 = clientMessage.withPersistentInlineButtons;
        } else {
            z3 = z2;
            i3 = i4;
        }
        return clientMessage.copy(typing3, heartbeat2, seenMarker2, plainMessage3, stateSync2, systemMessage2, botRequest2, serverNotification2, report2, reaction2, callingMessage2, meetingCallingMessage2, pinMessage3, pinMessage4, chatApproval2, readMarker2, updateFields2, clearUserHistory2, vote2, translationMessage2, userStatusMessage2, unseenMarker2, typingEnhanced2, plainMessage4, chatOpen2, z4, i3, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final Typing getTyping() {
        return this.typing;
    }

    /* renamed from: component10, reason: from getter */
    public final Reaction getReaction() {
        return this.reaction;
    }

    /* renamed from: component11, reason: from getter */
    public final CallingMessage getCallingMessage() {
        return this.callingMessage;
    }

    /* renamed from: component12, reason: from getter */
    public final MeetingCallingMessage getMeetingCallingMessage() {
        return this.meetingCallingMessage;
    }

    /* renamed from: component13, reason: from getter */
    public final PinMessage getPin() {
        return this.pin;
    }

    /* renamed from: component14, reason: from getter */
    public final PinMessage getUnpin() {
        return this.unpin;
    }

    /* renamed from: component15, reason: from getter */
    public final ChatApproval getChatApproval() {
        return this.chatApproval;
    }

    /* renamed from: component16, reason: from getter */
    public final ReadMarker getReadMarker() {
        return this.readMarker;
    }

    /* renamed from: component17, reason: from getter */
    public final UpdateFields getUpdateFields() {
        return this.updateFields;
    }

    /* renamed from: component18, reason: from getter */
    public final ClearUserHistory getClearUserHistory() {
        return this.clearUserHistory;
    }

    /* renamed from: component19, reason: from getter */
    public final Vote getVote() {
        return this.vote;
    }

    /* renamed from: component2, reason: from getter */
    public final Heartbeat getHeartbeat() {
        return this.heartbeat;
    }

    /* renamed from: component20, reason: from getter */
    public final TranslationMessage getTranslationMessage() {
        return this.translationMessage;
    }

    /* renamed from: component21, reason: from getter */
    public final UserStatusMessage getUserStatus() {
        return this.userStatus;
    }

    /* renamed from: component22, reason: from getter */
    public final UnseenMarker getUnseenMarker() {
        return this.unseenMarker;
    }

    /* renamed from: component23, reason: from getter */
    public final TypingEnhanced getTypingEnhanced() {
        return this.typingEnhanced;
    }

    /* renamed from: component24, reason: from getter */
    public final PlainMessage getEphemeral() {
        return this.ephemeral;
    }

    /* renamed from: component25, reason: from getter */
    public final ChatOpen getChatOpen() {
        return this.chatOpen;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsSilent() {
        return this.isSilent;
    }

    /* renamed from: component27, reason: from getter */
    public final int getNotificationBehaviour() {
        return this.notificationBehaviour;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getWithPersistentInlineButtons() {
        return this.withPersistentInlineButtons;
    }

    /* renamed from: component3, reason: from getter */
    public final SeenMarker getSeenMarker() {
        return this.seenMarker;
    }

    /* renamed from: component4, reason: from getter */
    public final PlainMessage getPlain() {
        return this.plain;
    }

    /* renamed from: component5, reason: from getter */
    public final StateSync getStateSync() {
        return this.stateSync;
    }

    /* renamed from: component6, reason: from getter */
    public final SystemMessage getSystemMessage() {
        return this.systemMessage;
    }

    /* renamed from: component7, reason: from getter */
    public final BotRequest getBotRequest() {
        return this.botRequest;
    }

    /* renamed from: component8, reason: from getter */
    public final ServerNotification getNotification() {
        return this.notification;
    }

    /* renamed from: component9, reason: from getter */
    public final Report getReport() {
        return this.report;
    }

    public final ClientMessage copy(@Json(name = "Typing") Typing typing, @Json(name = "Heartbeat") Heartbeat heartbeat, @Json(name = "SeenMarker") SeenMarker seenMarker, @Json(name = "Plain") PlainMessage plain, @Json(name = "StateSync") StateSync stateSync, @Json(name = "SystemMessage") SystemMessage systemMessage, @Json(name = "BotRequest") BotRequest botRequest, @Json(name = "Notification") ServerNotification notification, @Json(name = "Report") Report report, @Json(name = "Reaction") Reaction reaction, @Json(name = "CallingMessage") CallingMessage callingMessage, @Json(name = "MeetingCallingMessage") MeetingCallingMessage meetingCallingMessage, @Json(name = "Pin") PinMessage pin, @Json(name = "Unpin") PinMessage unpin, @Json(name = "ChatApproval") ChatApproval chatApproval, @Json(name = "ReadMarker") ReadMarker readMarker, @Json(name = "UpdateFields") UpdateFields updateFields, @Json(name = "ClearUserHistory") ClearUserHistory clearUserHistory, @Json(name = "Vote") Vote vote, @Json(name = "TranslationMessage") TranslationMessage translationMessage, @Json(name = "UserStatus") UserStatusMessage userStatus, @Json(name = "UnseenMarker") UnseenMarker unseenMarker, @Json(name = "TypingEnhanced") TypingEnhanced typingEnhanced, @Json(name = "Ephemeral") PlainMessage ephemeral, @Json(name = "ChatOpen") ChatOpen chatOpen, @Json(name = "IsSilent") boolean isSilent, @Json(name = "NotificationBehaviour") int notificationBehaviour, @Json(name = "PersistentInlineButtons") boolean withPersistentInlineButtons) {
        return new ClientMessage(typing, heartbeat, seenMarker, plain, stateSync, systemMessage, botRequest, notification, report, reaction, callingMessage, meetingCallingMessage, pin, unpin, chatApproval, readMarker, updateFields, clearUserHistory, vote, translationMessage, userStatus, unseenMarker, typingEnhanced, ephemeral, chatOpen, isSilent, notificationBehaviour, withPersistentInlineButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientMessage)) {
            return false;
        }
        ClientMessage clientMessage = (ClientMessage) other;
        return jl40.l(this.typing, clientMessage.typing) && jl40.l(this.heartbeat, clientMessage.heartbeat) && jl40.l(this.seenMarker, clientMessage.seenMarker) && jl40.l(this.plain, clientMessage.plain) && jl40.l(this.stateSync, clientMessage.stateSync) && jl40.l(this.systemMessage, clientMessage.systemMessage) && jl40.l(this.botRequest, clientMessage.botRequest) && jl40.l(this.notification, clientMessage.notification) && jl40.l(this.report, clientMessage.report) && jl40.l(this.reaction, clientMessage.reaction) && jl40.l(this.callingMessage, clientMessage.callingMessage) && jl40.l(this.meetingCallingMessage, clientMessage.meetingCallingMessage) && jl40.l(this.pin, clientMessage.pin) && jl40.l(this.unpin, clientMessage.unpin) && jl40.l(this.chatApproval, clientMessage.chatApproval) && jl40.l(this.readMarker, clientMessage.readMarker) && jl40.l(this.updateFields, clientMessage.updateFields) && jl40.l(this.clearUserHistory, clientMessage.clearUserHistory) && jl40.l(this.vote, clientMessage.vote) && jl40.l(this.translationMessage, clientMessage.translationMessage) && jl40.l(this.userStatus, clientMessage.userStatus) && jl40.l(this.unseenMarker, clientMessage.unseenMarker) && jl40.l(this.typingEnhanced, clientMessage.typingEnhanced) && jl40.l(this.ephemeral, clientMessage.ephemeral) && jl40.l(this.chatOpen, clientMessage.chatOpen) && this.isSilent == clientMessage.isSilent && this.notificationBehaviour == clientMessage.notificationBehaviour && this.withPersistentInlineButtons == clientMessage.withPersistentInlineButtons;
    }

    public final TypingEnhanced getTypingEnhanced() {
        return this.typingEnhanced;
    }

    public int hashCode() {
        Typing typing = this.typing;
        int hashCode = (typing == null ? 0 : typing.hashCode()) * 31;
        Heartbeat heartbeat = this.heartbeat;
        int hashCode2 = (hashCode + (heartbeat == null ? 0 : heartbeat.hashCode())) * 31;
        SeenMarker seenMarker = this.seenMarker;
        int hashCode3 = (hashCode2 + (seenMarker == null ? 0 : seenMarker.hashCode())) * 31;
        PlainMessage plainMessage = this.plain;
        int hashCode4 = (hashCode3 + (plainMessage == null ? 0 : plainMessage.hashCode())) * 31;
        StateSync stateSync = this.stateSync;
        int hashCode5 = (hashCode4 + (stateSync == null ? 0 : stateSync.hashCode())) * 31;
        SystemMessage systemMessage = this.systemMessage;
        int hashCode6 = (hashCode5 + (systemMessage == null ? 0 : systemMessage.hashCode())) * 31;
        BotRequest botRequest = this.botRequest;
        int hashCode7 = (hashCode6 + (botRequest == null ? 0 : botRequest.hashCode())) * 31;
        ServerNotification serverNotification = this.notification;
        int hashCode8 = (hashCode7 + (serverNotification == null ? 0 : serverNotification.hashCode())) * 31;
        Report report = this.report;
        int hashCode9 = (hashCode8 + (report == null ? 0 : report.hashCode())) * 31;
        Reaction reaction = this.reaction;
        int hashCode10 = (hashCode9 + (reaction == null ? 0 : reaction.hashCode())) * 31;
        CallingMessage callingMessage = this.callingMessage;
        int hashCode11 = (hashCode10 + (callingMessage == null ? 0 : callingMessage.hashCode())) * 31;
        MeetingCallingMessage meetingCallingMessage = this.meetingCallingMessage;
        int hashCode12 = (hashCode11 + (meetingCallingMessage == null ? 0 : meetingCallingMessage.hashCode())) * 31;
        PinMessage pinMessage = this.pin;
        int hashCode13 = (hashCode12 + (pinMessage == null ? 0 : pinMessage.hashCode())) * 31;
        PinMessage pinMessage2 = this.unpin;
        int hashCode14 = (hashCode13 + (pinMessage2 == null ? 0 : pinMessage2.hashCode())) * 31;
        ChatApproval chatApproval = this.chatApproval;
        int hashCode15 = (hashCode14 + (chatApproval == null ? 0 : chatApproval.hashCode())) * 31;
        ReadMarker readMarker = this.readMarker;
        int hashCode16 = (hashCode15 + (readMarker == null ? 0 : readMarker.hashCode())) * 31;
        UpdateFields updateFields = this.updateFields;
        int hashCode17 = (hashCode16 + (updateFields == null ? 0 : updateFields.hashCode())) * 31;
        ClearUserHistory clearUserHistory = this.clearUserHistory;
        int hashCode18 = (hashCode17 + (clearUserHistory == null ? 0 : clearUserHistory.hashCode())) * 31;
        Vote vote = this.vote;
        int hashCode19 = (hashCode18 + (vote == null ? 0 : vote.hashCode())) * 31;
        TranslationMessage translationMessage = this.translationMessage;
        int hashCode20 = (hashCode19 + (translationMessage == null ? 0 : translationMessage.hashCode())) * 31;
        UserStatusMessage userStatusMessage = this.userStatus;
        int hashCode21 = (hashCode20 + (userStatusMessage == null ? 0 : userStatusMessage.hashCode())) * 31;
        UnseenMarker unseenMarker = this.unseenMarker;
        int hashCode22 = (hashCode21 + (unseenMarker == null ? 0 : unseenMarker.hashCode())) * 31;
        TypingEnhanced typingEnhanced = this.typingEnhanced;
        int hashCode23 = (hashCode22 + (typingEnhanced == null ? 0 : typingEnhanced.hashCode())) * 31;
        PlainMessage plainMessage2 = this.ephemeral;
        int hashCode24 = (hashCode23 + (plainMessage2 == null ? 0 : plainMessage2.hashCode())) * 31;
        ChatOpen chatOpen = this.chatOpen;
        return Boolean.hashCode(this.withPersistentInlineButtons) + oyr.b(this.notificationBehaviour, unr0.e((hashCode24 + (chatOpen != null ? chatOpen.hashCode() : 0)) * 31, 31, this.isSilent), 31);
    }

    public String toString() {
        return "ClientMessage(typing=" + this.typing + ", heartbeat=" + this.heartbeat + ", seenMarker=" + this.seenMarker + ", plain=" + this.plain + ", stateSync=" + this.stateSync + ", systemMessage=" + this.systemMessage + ", botRequest=" + this.botRequest + ", notification=" + this.notification + ", report=" + this.report + ", reaction=" + this.reaction + ", callingMessage=" + this.callingMessage + ", meetingCallingMessage=" + this.meetingCallingMessage + ", pin=" + this.pin + ", unpin=" + this.unpin + ", chatApproval=" + this.chatApproval + ", readMarker=" + this.readMarker + ", updateFields=" + this.updateFields + ", clearUserHistory=" + this.clearUserHistory + ", vote=" + this.vote + ", translationMessage=" + this.translationMessage + ", userStatus=" + this.userStatus + ", unseenMarker=" + this.unseenMarker + ", typingEnhanced=" + this.typingEnhanced + ", ephemeral=" + this.ephemeral + ", chatOpen=" + this.chatOpen + ", isSilent=" + this.isSilent + ", notificationBehaviour=" + this.notificationBehaviour + ", withPersistentInlineButtons=" + this.withPersistentInlineButtons + Extension.C_BRAKE;
    }

    public ClientMessage(@Json(name = "Typing") Typing typing, @Json(name = "Heartbeat") Heartbeat heartbeat, @Json(name = "SeenMarker") SeenMarker seenMarker, @Json(name = "Plain") PlainMessage plainMessage, @Json(name = "StateSync") StateSync stateSync, @Json(name = "SystemMessage") SystemMessage systemMessage, @Json(name = "BotRequest") BotRequest botRequest, @Json(name = "Notification") ServerNotification serverNotification, @Json(name = "Report") Report report, @Json(name = "Reaction") Reaction reaction, @Json(name = "CallingMessage") CallingMessage callingMessage, @Json(name = "MeetingCallingMessage") MeetingCallingMessage meetingCallingMessage, @Json(name = "Pin") PinMessage pinMessage, @Json(name = "Unpin") PinMessage pinMessage2, @Json(name = "ChatApproval") ChatApproval chatApproval, @Json(name = "ReadMarker") ReadMarker readMarker, @Json(name = "UpdateFields") UpdateFields updateFields, @Json(name = "ClearUserHistory") ClearUserHistory clearUserHistory, @Json(name = "Vote") Vote vote, @Json(name = "TranslationMessage") TranslationMessage translationMessage, @Json(name = "UserStatus") UserStatusMessage userStatusMessage, @Json(name = "UnseenMarker") UnseenMarker unseenMarker, @Json(name = "TypingEnhanced") TypingEnhanced typingEnhanced, @Json(name = "Ephemeral") PlainMessage plainMessage2, @Json(name = "ChatOpen") ChatOpen chatOpen, @Json(name = "IsSilent") boolean z, @Json(name = "NotificationBehaviour") int i, @Json(name = "PersistentInlineButtons") boolean z2) {
        this.typing = typing;
        this.heartbeat = heartbeat;
        this.seenMarker = seenMarker;
        this.plain = plainMessage;
        this.stateSync = stateSync;
        this.systemMessage = systemMessage;
        this.botRequest = botRequest;
        this.notification = serverNotification;
        this.report = report;
        this.reaction = reaction;
        this.callingMessage = callingMessage;
        this.meetingCallingMessage = meetingCallingMessage;
        this.pin = pinMessage;
        this.unpin = pinMessage2;
        this.chatApproval = chatApproval;
        this.readMarker = readMarker;
        this.updateFields = updateFields;
        this.clearUserHistory = clearUserHistory;
        this.vote = vote;
        this.translationMessage = translationMessage;
        this.userStatus = userStatusMessage;
        this.unseenMarker = unseenMarker;
        this.typingEnhanced = typingEnhanced;
        this.ephemeral = plainMessage2;
        this.chatOpen = chatOpen;
        this.isSilent = z;
        this.notificationBehaviour = i;
        this.withPersistentInlineButtons = z2;
    }

    public ClientMessage() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435455, null);
    }
}
