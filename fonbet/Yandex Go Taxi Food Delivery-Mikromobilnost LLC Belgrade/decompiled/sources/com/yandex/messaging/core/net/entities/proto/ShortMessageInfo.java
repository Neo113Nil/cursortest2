package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class ShortMessageInfo {

    @Json(name = "PrevTimestampMcs")
    @xuf0(tag = 2)
    public long prevTimestamp;

    @Json(name = "SeqNo")
    @xuf0(tag = 3)
    public long seqNo;

    @Json(name = "TimestampMcs")
    @xuf0(tag = 1)
    public long timestamp;

    @Json(name = "Version")
    @xuf0(tag = 4)
    public long version;
}
