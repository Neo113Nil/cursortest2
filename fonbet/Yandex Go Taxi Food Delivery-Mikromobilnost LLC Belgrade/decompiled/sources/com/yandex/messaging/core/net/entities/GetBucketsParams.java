package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import java.util.Map;

/* loaded from: classes15.dex */
public class GetBucketsParams {

    @Json(name = "versions")
    public final Map<String, Long> versions;

    public GetBucketsParams(Map map) {
        this.versions = map;
    }
}
