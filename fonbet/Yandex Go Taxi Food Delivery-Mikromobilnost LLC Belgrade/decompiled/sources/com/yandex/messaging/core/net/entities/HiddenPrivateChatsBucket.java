package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import defpackage.cex;
import java.util.Map;

/* loaded from: classes15.dex */
public class HiddenPrivateChatsBucket extends Bucket {

    @cex
    @Json(name = "bucket_value")
    public Map<String, Long> bucketValue;

    public HiddenPrivateChatsBucket() {
        this.bucketName = "hidden_private_chats";
    }

    @Override // com.yandex.messaging.core.net.entities.Bucket
    public final String a() {
        return "hidden_private_chats";
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.k(this);
    }
}
