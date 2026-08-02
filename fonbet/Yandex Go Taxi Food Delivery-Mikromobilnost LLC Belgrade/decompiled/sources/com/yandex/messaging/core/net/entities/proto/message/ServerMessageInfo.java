package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class ServerMessageInfo {

    @Json(name = "CustomFrom")
    @xuf0(tag = 12)
    public CustomFromUserInfo customFrom;

    @Json(name = "Deleted")
    @xuf0(tag = 10)
    public boolean deleted;

    @Json(name = "ForwardCount")
    @xuf0(tag = 14)
    public long forwardCount;

    @cex
    @Json(name = "From")
    @xuf0(tag = 6)
    public ReducedUserInfo from;

    @Json(name = "HistoryVersion")
    @xuf0(tag = 9)
    public long historyVersion;

    @Json(name = "LastEditTimestamp")
    @xuf0(tag = 4)
    public long lastEditTimestamp;

    @Json(name = "ModerationAction")
    @xuf0(tag = 8)
    public int moderationAction;

    @Json(name = "PrevTimestamp")
    @xuf0(tag = 2)
    public long prevTimestamp;

    @Json(name = "SeqNo")
    @xuf0(tag = 3)
    public long seqNo;

    @Json(name = "ThreadState")
    @xuf0(tag = 17)
    public ThreadState threadState;

    @Json(name = "Timestamp")
    @xuf0(tag = 1)
    public long timestamp;

    @Json(name = "Translation")
    @xuf0(tag = 18)
    public Translation translation;

    @Json(name = "Version")
    @xuf0(tag = 5)
    public long version;

    @Json(name = "Views")
    @xuf0(tag = 11)
    public long views;
}
