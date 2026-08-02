package com.ybsdk.feature.server.tooltips.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipContentDto;", "", "title", "", "subtitle", "action", "Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipActionDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipActionDto;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAction", "()Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipActionDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-server-tooltips-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServerTooltipContentDto {
    private final ServerTooltipActionDto action;
    private final String subtitle;
    private final String title;

    public ServerTooltipContentDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "action") ServerTooltipActionDto serverTooltipActionDto) {
        this.title = str;
        this.subtitle = str2;
        this.action = serverTooltipActionDto;
    }

    public static /* synthetic */ ServerTooltipContentDto copy$default(ServerTooltipContentDto serverTooltipContentDto, String str, String str2, ServerTooltipActionDto serverTooltipActionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverTooltipContentDto.title;
        }
        if ((i & 2) != 0) {
            str2 = serverTooltipContentDto.subtitle;
        }
        if ((i & 4) != 0) {
            serverTooltipActionDto = serverTooltipContentDto.action;
        }
        return serverTooltipContentDto.copy(str, str2, serverTooltipActionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final ServerTooltipActionDto getAction() {
        return this.action;
    }

    public final ServerTooltipContentDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "action") ServerTooltipActionDto action) {
        return new ServerTooltipContentDto(title, subtitle, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerTooltipContentDto)) {
            return false;
        }
        ServerTooltipContentDto serverTooltipContentDto = (ServerTooltipContentDto) other;
        return jl40.l(this.title, serverTooltipContentDto.title) && jl40.l(this.subtitle, serverTooltipContentDto.subtitle) && jl40.l(this.action, serverTooltipContentDto.action);
    }

    public final ServerTooltipActionDto getAction() {
        return this.action;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ServerTooltipActionDto serverTooltipActionDto = this.action;
        return hashCode2 + (serverTooltipActionDto != null ? serverTooltipActionDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        ServerTooltipActionDto serverTooltipActionDto = this.action;
        StringBuilder v = b64.v("ServerTooltipContentDto(title=", str, ", subtitle=", str2, ", action=");
        v.append(serverTooltipActionDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
