package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.xuf0;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u000b\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/ChatDataFilter;", "", "<init>", "()V", "minVersion", "", "getMinVersion$annotations", "getMinVersion", "()Ljava/lang/Long;", "setMinVersion", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatDataFilter {

    @xuf0(tag = 1)
    private Long minVersion;

    @Json(name = "MinVersion")
    public static /* synthetic */ void getMinVersion$annotations() {
    }

    public final Long getMinVersion() {
        return this.minVersion;
    }

    public final void setMinVersion(Long l) {
        this.minVersion = l;
    }
}
