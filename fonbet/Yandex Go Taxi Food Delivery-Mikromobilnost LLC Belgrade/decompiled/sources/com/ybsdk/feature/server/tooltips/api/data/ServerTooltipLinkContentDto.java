package com.ybsdk.feature.server.tooltips.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipLinkContentDto;", "", "text", "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getText", "()Ljava/lang/String;", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-server-tooltips-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServerTooltipLinkContentDto {
    private final Themes<String> image;
    private final String text;

    public ServerTooltipLinkContentDto(@Json(name = "text") String str, @Json(name = "image") Themes<String> themes) {
        this.text = str;
        this.image = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServerTooltipLinkContentDto copy$default(ServerTooltipLinkContentDto serverTooltipLinkContentDto, String str, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverTooltipLinkContentDto.text;
        }
        if ((i & 2) != 0) {
            themes = serverTooltipLinkContentDto.image;
        }
        return serverTooltipLinkContentDto.copy(str, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final Themes<String> component2() {
        return this.image;
    }

    public final ServerTooltipLinkContentDto copy(@Json(name = "text") String text, @Json(name = "image") Themes<String> image) {
        return new ServerTooltipLinkContentDto(text, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerTooltipLinkContentDto)) {
            return false;
        }
        ServerTooltipLinkContentDto serverTooltipLinkContentDto = (ServerTooltipLinkContentDto) other;
        return jl40.l(this.text, serverTooltipLinkContentDto.text) && jl40.l(this.image, serverTooltipLinkContentDto.image);
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Themes<String> themes = this.image;
        return hashCode + (themes == null ? 0 : themes.hashCode());
    }

    public String toString() {
        return "ServerTooltipLinkContentDto(text=" + this.text + ", image=" + this.image + Extension.C_BRAKE;
    }
}
