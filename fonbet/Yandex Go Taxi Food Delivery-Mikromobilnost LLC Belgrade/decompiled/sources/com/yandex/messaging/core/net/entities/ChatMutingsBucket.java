package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import java.util.Map;

/* loaded from: classes15.dex */
public class ChatMutingsBucket extends Bucket {

    @Json(name = "bucket_value")
    public Map<String, ChatMuteData> bucketValue;

    public ChatMutingsBucket() {
        this.bucketName = "chat_mutings";
    }

    @Override // com.yandex.messaging.core.net.entities.Bucket
    public final String a() {
        return "chat_mutings";
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.g(this);
    }
}
