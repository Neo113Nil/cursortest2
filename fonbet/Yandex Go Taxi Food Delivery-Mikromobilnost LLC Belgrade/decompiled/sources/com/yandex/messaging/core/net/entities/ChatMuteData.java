package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class ChatMuteData {

    @Json(name = "mute")
    public final boolean mute;

    @Json(name = "mute_mentions")
    public final boolean muteMentions;

    public ChatMuteData(boolean z, boolean z2) {
        this.mute = z;
        this.muteMentions = z2;
    }
}
