package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.xuf0;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/NotificationMeta;", "", "overrideUrl", "", "appearance", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotificationMeta {
    public static final int APPEARANCE_TURBO_APP = 1;

    @xuf0(tag = 2)
    public final int appearance;

    @xuf0(tag = 1)
    public final String overrideUrl;

    public NotificationMeta(@Json(name = "OverrideUrl") String str, @Json(name = "Appearance") int i) {
        this.overrideUrl = str;
        this.appearance = i;
    }
}
