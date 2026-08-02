package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import defpackage.cex;

/* loaded from: classes15.dex */
public class ChatInfoChangedData implements StateSyncDiff {

    @cex
    @Json(name = "chat_id")
    public String chatId;

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.q(this);
    }
}
