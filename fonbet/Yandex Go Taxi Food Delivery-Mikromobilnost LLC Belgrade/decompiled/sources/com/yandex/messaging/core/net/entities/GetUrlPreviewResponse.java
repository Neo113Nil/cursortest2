package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u007f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetUrlPreviewResponse;", "", "imageUrl", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "title", "url", "width", "", "height", "preview", "Lcom/yandex/messaging/core/net/entities/UrlPreviewDto;", "chat", "Lcom/yandex/messaging/core/net/entities/UrlPreviewChatDto;", Constants.KEY_MESSAGE, "Lcom/yandex/messaging/core/net/entities/UrlPreviewMessageDto;", "user", "Lcom/yandex/messaging/core/net/entities/UrlPreviewUserDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/yandex/messaging/core/net/entities/UrlPreviewDto;Lcom/yandex/messaging/core/net/entities/UrlPreviewChatDto;Lcom/yandex/messaging/core/net/entities/UrlPreviewMessageDto;Lcom/yandex/messaging/core/net/entities/UrlPreviewUserDto;)V", "getImageUrl", "()Ljava/lang/String;", "getDescription", "getTitle", "getUrl", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getPreview", "()Lcom/yandex/messaging/core/net/entities/UrlPreviewDto;", "getChat", "()Lcom/yandex/messaging/core/net/entities/UrlPreviewChatDto;", "getMessage", "()Lcom/yandex/messaging/core/net/entities/UrlPreviewMessageDto;", "getUser", "()Lcom/yandex/messaging/core/net/entities/UrlPreviewUserDto;", "Companion", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetUrlPreviewResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final GetUrlPreviewResponse noResponse = new GetUrlPreviewResponse(null, null, null, null, null, null, null, null, null, null, 1023, null);
    private final UrlPreviewChatDto chat;
    private final String description;
    private final Integer height;
    private final String imageUrl;
    private final UrlPreviewMessageDto message;
    private final UrlPreviewDto preview;
    private final String title;
    private final String url;
    private final UrlPreviewUserDto user;
    private final Integer width;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetUrlPreviewResponse$Companion;", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ GetUrlPreviewResponse(String str, String str2, String str3, String str4, Integer num, Integer num2, UrlPreviewDto urlPreviewDto, UrlPreviewChatDto urlPreviewChatDto, UrlPreviewMessageDto urlPreviewMessageDto, UrlPreviewUserDto urlPreviewUserDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : urlPreviewDto, (i & 128) != 0 ? null : urlPreviewChatDto, (i & 256) != 0 ? null : urlPreviewMessageDto, (i & 512) != 0 ? null : urlPreviewUserDto);
    }

    public static final GetUrlPreviewResponse getNoResponse() {
        INSTANCE.getClass();
        return noResponse;
    }

    public final UrlPreviewChatDto getChat() {
        return this.chat;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final UrlPreviewMessageDto getMessage() {
        return this.message;
    }

    public final UrlPreviewDto getPreview() {
        return this.preview;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final UrlPreviewUserDto getUser() {
        return this.user;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public GetUrlPreviewResponse(@Json(name = "image") String str, @Json(name = "description") String str2, @Json(name = "title") String str3, @Json(name = "url") String str4, @Json(name = "width") Integer num, @Json(name = "height") Integer num2, @Json(name = "preview") UrlPreviewDto urlPreviewDto, @Json(name = "chat") UrlPreviewChatDto urlPreviewChatDto, @Json(name = "message") UrlPreviewMessageDto urlPreviewMessageDto, @Json(name = "user") UrlPreviewUserDto urlPreviewUserDto) {
        this.imageUrl = str;
        this.description = str2;
        this.title = str3;
        this.url = str4;
        this.width = num;
        this.height = num2;
        this.preview = urlPreviewDto;
        this.chat = urlPreviewChatDto;
        this.message = urlPreviewMessageDto;
        this.user = urlPreviewUserDto;
    }

    public GetUrlPreviewResponse() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
