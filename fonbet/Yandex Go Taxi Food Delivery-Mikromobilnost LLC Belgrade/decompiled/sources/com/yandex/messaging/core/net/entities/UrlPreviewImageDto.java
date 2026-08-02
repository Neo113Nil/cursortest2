package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UrlPreviewImageDto;", "", "source", "", "width", "", "height", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSource", "()Ljava/lang/String;", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UrlPreviewImageDto {
    private final Integer height;
    private final String source;
    private final Integer width;

    public UrlPreviewImageDto(@Json(name = "src") String str, @Json(name = "width") Integer num, @Json(name = "height") Integer num2) {
        this.source = str;
        this.width = num;
        this.height = num2;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getSource() {
        return this.source;
    }

    public final Integer getWidth() {
        return this.width;
    }
}
