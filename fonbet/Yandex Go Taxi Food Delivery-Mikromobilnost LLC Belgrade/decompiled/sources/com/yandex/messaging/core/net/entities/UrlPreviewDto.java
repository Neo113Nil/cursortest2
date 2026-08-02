package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import org.webrtc.MediaStreamTrack;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UrlPreviewDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "Lcom/yandex/messaging/core/net/entities/UrlPreviewImageDto;", MediaStreamTrack.VIDEO_TRACK_KIND, "Lcom/yandex/messaging/core/net/entities/UrlPreviewVideoDto;", "turboLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/UrlPreviewImageDto;Lcom/yandex/messaging/core/net/entities/UrlPreviewVideoDto;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getImage", "()Lcom/yandex/messaging/core/net/entities/UrlPreviewImageDto;", "getVideo", "()Lcom/yandex/messaging/core/net/entities/UrlPreviewVideoDto;", "getTurboLink", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UrlPreviewDto {
    private final String description;
    private final UrlPreviewImageDto image;
    private final String title;
    private final String turboLink;
    private final UrlPreviewVideoDto video;

    public UrlPreviewDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "image") UrlPreviewImageDto urlPreviewImageDto, @Json(name = "video") UrlPreviewVideoDto urlPreviewVideoDto, @Json(name = "turbo_link") String str3) {
        this.title = str;
        this.description = str2;
        this.image = urlPreviewImageDto;
        this.video = urlPreviewVideoDto;
        this.turboLink = str3;
    }

    public final String getDescription() {
        return this.description;
    }

    public final UrlPreviewImageDto getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTurboLink() {
        return this.turboLink;
    }

    public final UrlPreviewVideoDto getVideo() {
        return this.video;
    }
}
