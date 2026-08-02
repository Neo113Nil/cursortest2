package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class RemovedMessageData extends MessageData {

    @Json(name = "removed_group_size")
    public int removedGroupSize;

    public RemovedMessageData() {
        super(-1, "");
    }
}
