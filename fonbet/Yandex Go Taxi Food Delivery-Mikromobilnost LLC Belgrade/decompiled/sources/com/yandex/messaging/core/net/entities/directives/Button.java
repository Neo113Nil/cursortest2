package com.yandex.messaging.core.net.entities.directives;

import com.squareup.moshi.Json;
import defpackage.cex;

/* loaded from: classes15.dex */
public class Button {

    @Json(name = "directives")
    public Directive[] directives;

    @Json(name = "payload")
    public Object payload;

    @Json(name = "text")
    public String text;

    @cex
    @Json(name = "title")
    public String title;

    @Json(name = "url")
    public String url;
}
