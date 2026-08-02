package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class ReactionInfo {

    @Json(name = "Count")
    @xuf0(tag = 2)
    public int count;

    @Json(name = "Type")
    @xuf0(tag = 1)
    public int type;
}
