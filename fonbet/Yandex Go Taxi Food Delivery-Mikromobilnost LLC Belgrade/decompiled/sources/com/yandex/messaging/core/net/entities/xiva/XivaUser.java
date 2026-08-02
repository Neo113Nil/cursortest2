package com.yandex.messaging.core.net.entities.xiva;

import com.squareup.moshi.Json;
import defpackage.cex;

/* loaded from: classes15.dex */
public class XivaUser {

    @cex
    @Json(name = "guid")
    public String guid;

    @Json(name = "is_display_restricted")
    public boolean isDisplayRestricted;

    @Json(name = "uid")
    public long uid;
}
