package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class RequestUserParams {

    @Json(name = "bind_phone_number")
    public boolean bindPhoneNumber;

    @Json(name = "get_secret_sign")
    public boolean needXivaSecret;
}
