package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.cex;

/* loaded from: classes15.dex */
public class ErrorResponseData {

    @cex
    @Json(name = AuthSdkActivity.RESPONSE_TYPE_CODE)
    public String code;

    @cex
    @Json(name = "text")
    public String text;
}
