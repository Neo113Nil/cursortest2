package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.kju0;
import defpackage.oo31;
import defpackage.vfc;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/MediaMessageListData;", "", "info", "Lcom/yandex/messaging/core/net/entities/MediaMessageListData$Info;", "messages", "", "Lcom/yandex/messaging/core/net/entities/proto/ChatHistoryResponse$OutMessage;", kju0.j, "Lcom/yandex/messaging/core/net/entities/MediaMessageListData$Metadata;", "<init>", "(Lcom/yandex/messaging/core/net/entities/MediaMessageListData$Info;Ljava/util/List;Ljava/util/List;)V", "getInfo", "()Lcom/yandex/messaging/core/net/entities/MediaMessageListData$Info;", "getMessages", "()Ljava/util/List;", "getMetadata", "Info", "Metadata", "BrowserLinkPreview", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MediaMessageListData {

    @Json(name = "info")
    private final Info info;

    @Json(name = "messages")
    private final List<ChatHistoryResponse.OutMessage> messages;

    @Json(name = kju0.j)
    private final List<Metadata> metadata;

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014Jb\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014¨\u0006%"}, d2 = {"Lcom/yandex/messaging/core/net/entities/MediaMessageListData$BrowserLinkPreview;", "", "imageUrl", "", "favicon", "url", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "width", "", "height", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getImageUrl", "()Ljava/lang/String;", "getFavicon", "getUrl", "getTitle", "getDescription", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/yandex/messaging/core/net/entities/MediaMessageListData$BrowserLinkPreview;", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrowserLinkPreview {

        @Json(name = DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)
        private final String description;

        @Json(name = "favicon")
        private final String favicon;

        @Json(name = "height")
        private final Integer height;

        @Json(name = "image")
        private final String imageUrl;

        @Json(name = "title")
        private final String title;

        @Json(name = "url")
        private final String url;

        @Json(name = "width")
        private final Integer width;

        public BrowserLinkPreview(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2) {
            this.imageUrl = str;
            this.favicon = str2;
            this.url = str3;
            this.title = str4;
            this.description = str5;
            this.width = num;
            this.height = num2;
        }

        public static /* synthetic */ BrowserLinkPreview copy$default(BrowserLinkPreview browserLinkPreview, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = browserLinkPreview.imageUrl;
            }
            if ((i & 2) != 0) {
                str2 = browserLinkPreview.favicon;
            }
            if ((i & 4) != 0) {
                str3 = browserLinkPreview.url;
            }
            if ((i & 8) != 0) {
                str4 = browserLinkPreview.title;
            }
            if ((i & 16) != 0) {
                str5 = browserLinkPreview.description;
            }
            if ((i & 32) != 0) {
                num = browserLinkPreview.width;
            }
            if ((i & 64) != 0) {
                num2 = browserLinkPreview.height;
            }
            Integer num3 = num;
            Integer num4 = num2;
            String str6 = str5;
            String str7 = str3;
            return browserLinkPreview.copy(str, str2, str7, str4, str6, num3, num4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFavicon() {
            return this.favicon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getWidth() {
            return this.width;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getHeight() {
            return this.height;
        }

        public final BrowserLinkPreview copy(String imageUrl, String favicon, String url, String title, String description, Integer width, Integer height) {
            return new BrowserLinkPreview(imageUrl, favicon, url, title, description, width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BrowserLinkPreview)) {
                return false;
            }
            BrowserLinkPreview browserLinkPreview = (BrowserLinkPreview) other;
            return jl40.l(this.imageUrl, browserLinkPreview.imageUrl) && jl40.l(this.favicon, browserLinkPreview.favicon) && jl40.l(this.url, browserLinkPreview.url) && jl40.l(this.title, browserLinkPreview.title) && jl40.l(this.description, browserLinkPreview.description) && jl40.l(this.width, browserLinkPreview.width) && jl40.l(this.height, browserLinkPreview.height);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getFavicon() {
            return this.favicon;
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUrl() {
            return this.url;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            String str = this.imageUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.favicon;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.url;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.title;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.description;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.width;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.height;
            return hashCode6 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            String str = this.imageUrl;
            String str2 = this.favicon;
            String str3 = this.url;
            String str4 = this.title;
            String str5 = this.description;
            Integer num = this.width;
            Integer num2 = this.height;
            StringBuilder v = b64.v("BrowserLinkPreview(imageUrl=", str, ", favicon=", str2, ", url=");
            g8e.D(v, str3, ", title=", str4, ", description=");
            vfc.w(num, str5, ", width=", ", height=", v);
            return oo31.j(v, num2, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/MediaMessageListData$Info;", "", "hasNext", "", "hasPrev", "next", "", "prev", "<init>", "(ZZII)V", "getHasNext", "()Z", "getHasPrev", "getNext", "()I", "getPrev", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Info {

        @Json(name = "has_next")
        private final boolean hasNext;

        @Json(name = "has_prev")
        private final boolean hasPrev;

        @Json(name = "next")
        private final int next;

        @Json(name = "prev")
        private final int prev;

        public Info(boolean z, boolean z2, int i, int i2) {
            this.hasNext = z;
            this.hasPrev = z2;
            this.next = i;
            this.prev = i2;
        }

        public final boolean getHasNext() {
            return this.hasNext;
        }

        public final boolean getHasPrev() {
            return this.hasPrev;
        }

        public final int getNext() {
            return this.next;
        }

        public final int getPrev() {
            return this.prev;
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/messaging/core/net/entities/MediaMessageListData$Metadata;", "", "links", "", "", "preview", "Lcom/yandex/messaging/core/net/entities/MediaMessageListData$BrowserLinkPreview;", "<init>", "(Ljava/util/List;Lcom/yandex/messaging/core/net/entities/MediaMessageListData$BrowserLinkPreview;)V", "getLinks", "()Ljava/util/List;", "getPreview", "()Lcom/yandex/messaging/core/net/entities/MediaMessageListData$BrowserLinkPreview;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Metadata {

        @Json(name = "links")
        private final List<String> links;

        @Json(name = "preview")
        private final BrowserLinkPreview preview;

        public Metadata(List<String> list, BrowserLinkPreview browserLinkPreview) {
            this.links = list;
            this.preview = browserLinkPreview;
        }

        public final List<String> getLinks() {
            return this.links;
        }

        public final BrowserLinkPreview getPreview() {
            return this.preview;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaMessageListData(Info info, List<? extends ChatHistoryResponse.OutMessage> list, List<Metadata> list2) {
        this.info = info;
        this.messages = list;
        this.metadata = list2;
    }

    public final Info getInfo() {
        return this.info;
    }

    public final List<ChatHistoryResponse.OutMessage> getMessages() {
        return this.messages;
    }

    public final List<Metadata> getMetadata() {
        return this.metadata;
    }
}
