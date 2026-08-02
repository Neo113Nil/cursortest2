package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class MessageDataFilter {

    @Json(name = "DropPayload")
    @xuf0(tag = 2)
    public boolean dropPayload;

    @Json(name = "OnlyTimestamps")
    @xuf0(tag = 3)
    public boolean onlyTimestamps;

    public final String toString() {
        return "dropPayload = " + this.dropPayload + ", onlyTimestamps = " + this.onlyTimestamps;
    }
}
