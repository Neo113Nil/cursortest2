package com.yandex.messaging.core.net.entities.xiva;

import com.squareup.moshi.Json;
import defpackage.cex;

/* loaded from: classes15.dex */
public class XivaSecretContainer {

    @cex
    @Json(name = "secret_sign")
    public XivaSecretSign secret;

    @cex
    @Json(name = "user")
    public XivaUser user;
}
