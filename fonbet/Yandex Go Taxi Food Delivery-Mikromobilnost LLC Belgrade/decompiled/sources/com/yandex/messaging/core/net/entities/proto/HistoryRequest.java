package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.message.HistoryTranslationDataFilter;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class HistoryRequest {

    @Json(name = "ChatId")
    @xuf0(tag = 2)
    public String chatId;

    @Json(name = "CommonRequestFields")
    @xuf0(tag = 11)
    public CommonRequestFields commonFields;

    @Json(name = "DropPersonalFields")
    @xuf0(tag = 12)
    public boolean dropPersonalFields;

    @Json(name = "ChatDataFilter")
    @xuf0(tag = 15)
    public ChatDataFilter filter = new ChatDataFilter();

    @Json(name = "HasMeeting")
    @xuf0(tag = 20)
    public Boolean hasMeeting;

    @Json(name = "InviteHash")
    @xuf0(tag = 8)
    public String inviteHash;

    @Json(name = "Limit")
    @xuf0(tag = 4)
    public long limit;

    @Json(name = "MaxTimestamp")
    @xuf0(tag = 5)
    public long maxTimestamp;

    @Json(name = "MessageDataFilter")
    @xuf0(tag = 9)
    public MessageDataFilter messageDataFilter;

    @Json(name = "MinTimestamp")
    @xuf0(tag = 3)
    public long minTimestamp;

    @Json(name = "Offset")
    @xuf0(tag = 6)
    public long offset;

    @Json(name = "Threads")
    @xuf0(tag = 19)
    public boolean threads;

    @Json(name = "TranslationDataFilter")
    @xuf0(tag = 21)
    public HistoryTranslationDataFilter translationDataFilter;

    public final String toString() {
        ChatDataFilter chatDataFilter = this.filter;
        return "minTs = " + this.minTimestamp + ", maxTs = " + this.maxTimestamp + ", offset = " + this.offset + ", limit = " + this.limit + ", chatId = " + this.chatId + ", threads = " + this.threads + ", chatDataFilter.minVersion = " + (chatDataFilter != null ? chatDataFilter.getMinVersion() : null) + ", dropPersonalFields = " + this.dropPersonalFields + ", messageDataFilter: " + this.messageDataFilter;
    }
}
