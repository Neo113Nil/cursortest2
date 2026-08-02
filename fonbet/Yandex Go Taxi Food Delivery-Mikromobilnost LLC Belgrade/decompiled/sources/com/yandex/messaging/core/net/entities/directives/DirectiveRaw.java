package com.yandex.messaging.core.net.entities.directives;

import com.squareup.moshi.Json;
import defpackage.cex;

/* loaded from: classes15.dex */
public class DirectiveRaw {

    @cex
    @Json(name = "name")
    public String name;

    @Json(name = "payload")
    public Object payload;

    @cex
    @Json(name = "type")
    public String type;
}
