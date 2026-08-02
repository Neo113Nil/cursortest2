package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class RecommendedChatsParams {

    @Json(name = "limit")
    public int limit = 8;

    @Json(name = "ranking")
    public Ranking[] ranking;

    @Json(name = "rtx_version")
    public String rtxVersion;
}
