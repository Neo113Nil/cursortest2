package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class GetChatInfoParam {

    @Json(name = "chat_ids")
    public final String[] ids;

    public GetChatInfoParam(String[] strArr) {
        this.ids = strArr;
    }
}
