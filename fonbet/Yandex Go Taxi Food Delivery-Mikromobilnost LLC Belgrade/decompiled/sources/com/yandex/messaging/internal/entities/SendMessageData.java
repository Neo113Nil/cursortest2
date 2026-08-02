package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import defpackage.cex;
import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes15.dex */
public class SendMessageData {

    @cex
    @Json(name = Constants.KEY_MESSAGE)
    public Message message;
}
