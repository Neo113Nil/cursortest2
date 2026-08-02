package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import defpackage.cex;

/* loaded from: classes15.dex */
public class YouAddedData implements StateSyncDiff {

    @cex
    @Json(name = "chat")
    public ChatData chat;

    @Json(name = "chat_member")
    public ChatMember chatMember;

    @Json(name = "user")
    public UserData userData;

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.n(this);
    }
}
