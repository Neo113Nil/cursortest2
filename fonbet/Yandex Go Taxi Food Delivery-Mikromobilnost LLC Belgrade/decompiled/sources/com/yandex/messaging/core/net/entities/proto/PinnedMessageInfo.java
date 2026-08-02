package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class PinnedMessageInfo {

    @Json(name = "LastActionTsMcs")
    @xuf0(tag = 2)
    public long lastActionTs;

    @Json(name = "PinnedMessageTs")
    @xuf0(tag = 1)
    public long timestamp;
}
