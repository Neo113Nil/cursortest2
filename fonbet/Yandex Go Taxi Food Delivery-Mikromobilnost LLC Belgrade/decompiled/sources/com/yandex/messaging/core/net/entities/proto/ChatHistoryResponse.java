package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.telemost.MeetingInfoFanoutResponse;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class ChatHistoryResponse {

    @Json(name = "ApprovedByMe")
    @xuf0(tag = 17)
    public boolean approvedByMe;

    @cex
    @Json(name = "ChatId")
    @xuf0(tag = 1)
    public String chatId;

    @Json(name = "ChatInfo")
    @xuf0(tag = 14)
    public ChatInfoFromTransport chatInfo;

    @Json(name = "LastEditTsMcs")
    @xuf0(tag = 3)
    public long lastEditTimestamp;

    @Json(name = "LastTsMcs")
    @xuf0(tag = 19)
    public long lastMessageTimestamp;

    @Json(name = "LastSeenByMeVersion")
    @xuf0(tag = 27)
    public Long lastSeenByMeVersion;

    @Json(name = "MeetingInfo")
    @xuf0(tag = 26)
    public MeetingInfoFanoutResponse meetingInfo;

    @Json(name = "Messages")
    @xuf0(tag = 2)
    public OutMessage[] messages;

    @Json(name = "HistoryStartTsMcs")
    @xuf0(tag = 22)
    public long minMessageTimestamp;

    @Json(name = "MyRole")
    @xuf0(tag = 21)
    public ChatRole myRole;

    @Json(name = "LastSeenSeqNo")
    @xuf0(tag = 9)
    public long otherLastSeenSequenceNumber;

    @Json(name = "LastSeenTsMcs")
    @xuf0(tag = 6)
    public long otherSeenMarker;

    @Json(name = "LastSeenByMeSeqNo")
    @xuf0(tag = 10)
    public long ownerLastSeenSequenceNumber;

    @Json(name = "LastSeenByMeTsMcs")
    @xuf0(tag = 7)
    public long ownerSeenMarker;

    @Json(name = "PartnerInfo")
    @xuf0(tag = 18)
    public ReducedUserInfo partnerInfo;

    @Json(name = "MentionTsMcs")
    @xuf0(tag = 23)
    public long[] personalMentions;

    @Json(name = "PinnedMessageInfo")
    @xuf0(tag = 20)
    public PinnedMessageInfo pinnedMessageInfo;

    @Json(name = "PrivateChatInfo")
    @xuf0(tag = 24)
    public PrivateChatInfoFromTransport privateChatInfo;

    @Json(name = "SupportedEvents")
    @xuf0(tag = 28)
    public ChatEventTypes supportedEvents;

    @Json(name = "ThreadParentMessage")
    @xuf0(tag = 25)
    public ServerMessage threadParentMessage;

    public static class OutMessage {

        @cex
        @Json(name = "ServerMessage")
        @xuf0(tag = 101)
        public ServerMessage serverMessage;
    }
}
