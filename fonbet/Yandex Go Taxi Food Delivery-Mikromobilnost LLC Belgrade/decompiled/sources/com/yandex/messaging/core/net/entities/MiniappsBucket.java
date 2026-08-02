package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import defpackage.cex;
import java.util.Map;

/* loaded from: classes15.dex */
public class MiniappsBucket extends Bucket {

    @cex
    @Json(name = "bucket_value")
    public Map<String, Value> value;

    public static class Value {

        @cex
        @Json(name = "miniapp_url")
        public String miniappUrl;

        @Json(name = "trusted")
        public Boolean trusted;
    }

    @Override // com.yandex.messaging.core.net.entities.Bucket
    public final String a() {
        return "miniapps";
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.b(this);
    }
}
