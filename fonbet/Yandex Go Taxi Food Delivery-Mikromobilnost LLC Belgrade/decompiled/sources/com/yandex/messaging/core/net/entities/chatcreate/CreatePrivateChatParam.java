package com.yandex.messaging.core.net.entities.chatcreate;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class CreatePrivateChatParam {

    @Json(name = "guid")
    public final String anotherPersonGuid;

    @Json(name = "onetime_user_token")
    public final String onetimeUserToken;

    @Json(name = "wait_for_update")
    public final boolean waitForUpdate = false;

    public CreatePrivateChatParam(String str, String str2) {
        this.anotherPersonGuid = str;
        this.onetimeUserToken = str2;
    }
}
