package com.yandex.messaging.core.net.entities.xiva;

import com.squareup.moshi.Json;
import defpackage.cex;

/* loaded from: classes15.dex */
public class XivaSecretSign {

    @cex
    @Json(name = "sign")
    public String sign;

    @Json(name = "ts")
    public long ts;
}
