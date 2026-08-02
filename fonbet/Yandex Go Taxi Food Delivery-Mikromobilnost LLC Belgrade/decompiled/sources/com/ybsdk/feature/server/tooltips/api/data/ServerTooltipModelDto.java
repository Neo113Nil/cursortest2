package com.ybsdk.feature.server.tooltips.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oo31;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014JD\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\tHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipModelDto;", "", "anchor", "Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipAnchorDto;", "position", "Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipPositionDto;", "content", "Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipContentDto;", "verticalMargin", "", "durationMs", "<init>", "(Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipAnchorDto;Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipPositionDto;Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipContentDto;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAnchor", "()Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipAnchorDto;", "getPosition", "()Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipPositionDto;", "getContent", "()Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipContentDto;", "getVerticalMargin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDurationMs", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipAnchorDto;Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipPositionDto;Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipContentDto;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipModelDto;", "equals", "", "other", "hashCode", "toString", "", "feature-server-tooltips-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServerTooltipModelDto {
    private final ServerTooltipAnchorDto anchor;
    private final ServerTooltipContentDto content;
    private final Integer durationMs;
    private final ServerTooltipPositionDto position;
    private final Integer verticalMargin;

    public ServerTooltipModelDto(@Json(name = "anchor") ServerTooltipAnchorDto serverTooltipAnchorDto, @Json(name = "position") ServerTooltipPositionDto serverTooltipPositionDto, @Json(name = "content") ServerTooltipContentDto serverTooltipContentDto, @Json(name = "vertical_margin") Integer num, @Json(name = "duration_ms") Integer num2) {
        this.anchor = serverTooltipAnchorDto;
        this.position = serverTooltipPositionDto;
        this.content = serverTooltipContentDto;
        this.verticalMargin = num;
        this.durationMs = num2;
    }

    public static /* synthetic */ ServerTooltipModelDto copy$default(ServerTooltipModelDto serverTooltipModelDto, ServerTooltipAnchorDto serverTooltipAnchorDto, ServerTooltipPositionDto serverTooltipPositionDto, ServerTooltipContentDto serverTooltipContentDto, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            serverTooltipAnchorDto = serverTooltipModelDto.anchor;
        }
        if ((i & 2) != 0) {
            serverTooltipPositionDto = serverTooltipModelDto.position;
        }
        if ((i & 4) != 0) {
            serverTooltipContentDto = serverTooltipModelDto.content;
        }
        if ((i & 8) != 0) {
            num = serverTooltipModelDto.verticalMargin;
        }
        if ((i & 16) != 0) {
            num2 = serverTooltipModelDto.durationMs;
        }
        Integer num3 = num2;
        ServerTooltipContentDto serverTooltipContentDto2 = serverTooltipContentDto;
        return serverTooltipModelDto.copy(serverTooltipAnchorDto, serverTooltipPositionDto, serverTooltipContentDto2, num, num3);
    }

    /* renamed from: component1, reason: from getter */
    public final ServerTooltipAnchorDto getAnchor() {
        return this.anchor;
    }

    /* renamed from: component2, reason: from getter */
    public final ServerTooltipPositionDto getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final ServerTooltipContentDto getContent() {
        return this.content;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getVerticalMargin() {
        return this.verticalMargin;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getDurationMs() {
        return this.durationMs;
    }

    public final ServerTooltipModelDto copy(@Json(name = "anchor") ServerTooltipAnchorDto anchor, @Json(name = "position") ServerTooltipPositionDto position, @Json(name = "content") ServerTooltipContentDto content, @Json(name = "vertical_margin") Integer verticalMargin, @Json(name = "duration_ms") Integer durationMs) {
        return new ServerTooltipModelDto(anchor, position, content, verticalMargin, durationMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerTooltipModelDto)) {
            return false;
        }
        ServerTooltipModelDto serverTooltipModelDto = (ServerTooltipModelDto) other;
        return jl40.l(this.anchor, serverTooltipModelDto.anchor) && this.position == serverTooltipModelDto.position && jl40.l(this.content, serverTooltipModelDto.content) && jl40.l(this.verticalMargin, serverTooltipModelDto.verticalMargin) && jl40.l(this.durationMs, serverTooltipModelDto.durationMs);
    }

    public final ServerTooltipAnchorDto getAnchor() {
        return this.anchor;
    }

    public final ServerTooltipContentDto getContent() {
        return this.content;
    }

    public final Integer getDurationMs() {
        return this.durationMs;
    }

    public final ServerTooltipPositionDto getPosition() {
        return this.position;
    }

    public final Integer getVerticalMargin() {
        return this.verticalMargin;
    }

    public int hashCode() {
        int hashCode = (this.content.hashCode() + ((this.position.hashCode() + (this.anchor.hashCode() * 31)) * 31)) * 31;
        Integer num = this.verticalMargin;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.durationMs;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        ServerTooltipAnchorDto serverTooltipAnchorDto = this.anchor;
        ServerTooltipPositionDto serverTooltipPositionDto = this.position;
        ServerTooltipContentDto serverTooltipContentDto = this.content;
        Integer num = this.verticalMargin;
        Integer num2 = this.durationMs;
        StringBuilder sb = new StringBuilder("ServerTooltipModelDto(anchor=");
        sb.append(serverTooltipAnchorDto);
        sb.append(", position=");
        sb.append(serverTooltipPositionDto);
        sb.append(", content=");
        sb.append(serverTooltipContentDto);
        sb.append(", verticalMargin=");
        sb.append(num);
        sb.append(", durationMs=");
        return oo31.j(sb, num2, Extension.C_BRAKE);
    }
}
