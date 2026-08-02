package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import defpackage.cex;

/* loaded from: classes15.dex */
public class SelfRemovedData implements StateSyncDiff {

    @cex
    @Json(name = "chat_id")
    public String chatId;

    @Json(name = "chat_member")
    public ChatMember chatMember;

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.o(this);
    }
}
