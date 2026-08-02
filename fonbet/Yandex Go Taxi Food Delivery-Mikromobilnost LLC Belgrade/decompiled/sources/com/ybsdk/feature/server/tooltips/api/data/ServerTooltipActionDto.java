package com.ybsdk.feature.server.tooltips.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipActionDto;", "", "url", "", "linkContent", "Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipLinkContentDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipLinkContentDto;)V", "getUrl", "()Ljava/lang/String;", "getLinkContent", "()Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipLinkContentDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-server-tooltips-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServerTooltipActionDto {
    private final ServerTooltipLinkContentDto linkContent;
    private final String url;

    public ServerTooltipActionDto(@Json(name = "url") String str, @Json(name = "link_content") ServerTooltipLinkContentDto serverTooltipLinkContentDto) {
        this.url = str;
        this.linkContent = serverTooltipLinkContentDto;
    }

    public static /* synthetic */ ServerTooltipActionDto copy$default(ServerTooltipActionDto serverTooltipActionDto, String str, ServerTooltipLinkContentDto serverTooltipLinkContentDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverTooltipActionDto.url;
        }
        if ((i & 2) != 0) {
            serverTooltipLinkContentDto = serverTooltipActionDto.linkContent;
        }
        return serverTooltipActionDto.copy(str, serverTooltipLinkContentDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final ServerTooltipLinkContentDto getLinkContent() {
        return this.linkContent;
    }

    public final ServerTooltipActionDto copy(@Json(name = "url") String url, @Json(name = "link_content") ServerTooltipLinkContentDto linkContent) {
        return new ServerTooltipActionDto(url, linkContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerTooltipActionDto)) {
            return false;
        }
        ServerTooltipActionDto serverTooltipActionDto = (ServerTooltipActionDto) other;
        return jl40.l(this.url, serverTooltipActionDto.url) && jl40.l(this.linkContent, serverTooltipActionDto.linkContent);
    }

    public final ServerTooltipLinkContentDto getLinkContent() {
        return this.linkContent;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        ServerTooltipLinkContentDto serverTooltipLinkContentDto = this.linkContent;
        return hashCode + (serverTooltipLinkContentDto == null ? 0 : serverTooltipLinkContentDto.hashCode());
    }

    public String toString() {
        return "ServerTooltipActionDto(url=" + this.url + ", linkContent=" + this.linkContent + Extension.C_BRAKE;
    }
}
