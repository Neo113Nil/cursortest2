package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import defpackage.cex;

/* loaded from: classes15.dex */
public class PinnedChatsBucket extends Bucket {

    @cex
    @Json(name = "bucket_value")
    public Value value;

    public static class Value {

        @cex
        @Json(name = "pinned_chats")
        public String[] pinnedChats;
    }

    public PinnedChatsBucket() {
        this.bucketName = "pinned_chats";
    }

    @Override // com.yandex.messaging.core.net.entities.Bucket
    public final String a() {
        return "pinned_chats";
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.a(this);
    }
}
