package com.ybsdk.feature.server.tooltips.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JB\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipDto;", "", "name", "", "eventId", "defaultsGroup", "model", "Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipModelDto;", "showingDelayMs", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipModelDto;Ljava/lang/Integer;)V", "getName", "()Ljava/lang/String;", "getEventId", "getDefaultsGroup", "getModel", "()Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipModelDto;", "getShowingDelayMs", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipModelDto;Ljava/lang/Integer;)Lcom/ybsdk/feature/server/tooltips/api/data/ServerTooltipDto;", "equals", "", "other", "hashCode", "toString", "feature-server-tooltips-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServerTooltipDto {
    private final String defaultsGroup;
    private final String eventId;
    private final ServerTooltipModelDto model;
    private final String name;
    private final Integer showingDelayMs;

    public ServerTooltipDto(@Json(name = "name") String str, @Json(name = "event_id") String str2, @Json(name = "defaults_group") String str3, @Json(name = "model") ServerTooltipModelDto serverTooltipModelDto, @Json(name = "showing_delay_ms") Integer num) {
        this.name = str;
        this.eventId = str2;
        this.defaultsGroup = str3;
        this.model = serverTooltipModelDto;
        this.showingDelayMs = num;
    }

    public static /* synthetic */ ServerTooltipDto copy$default(ServerTooltipDto serverTooltipDto, String str, String str2, String str3, ServerTooltipModelDto serverTooltipModelDto, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverTooltipDto.name;
        }
        if ((i & 2) != 0) {
            str2 = serverTooltipDto.eventId;
        }
        if ((i & 4) != 0) {
            str3 = serverTooltipDto.defaultsGroup;
        }
        if ((i & 8) != 0) {
            serverTooltipModelDto = serverTooltipDto.model;
        }
        if ((i & 16) != 0) {
            num = serverTooltipDto.showingDelayMs;
        }
        Integer num2 = num;
        String str4 = str3;
        return serverTooltipDto.copy(str, str2, str4, serverTooltipModelDto, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDefaultsGroup() {
        return this.defaultsGroup;
    }

    /* renamed from: component4, reason: from getter */
    public final ServerTooltipModelDto getModel() {
        return this.model;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getShowingDelayMs() {
        return this.showingDelayMs;
    }

    public final ServerTooltipDto copy(@Json(name = "name") String name, @Json(name = "event_id") String eventId, @Json(name = "defaults_group") String defaultsGroup, @Json(name = "model") ServerTooltipModelDto model, @Json(name = "showing_delay_ms") Integer showingDelayMs) {
        return new ServerTooltipDto(name, eventId, defaultsGroup, model, showingDelayMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerTooltipDto)) {
            return false;
        }
        ServerTooltipDto serverTooltipDto = (ServerTooltipDto) other;
        return jl40.l(this.name, serverTooltipDto.name) && jl40.l(this.eventId, serverTooltipDto.eventId) && jl40.l(this.defaultsGroup, serverTooltipDto.defaultsGroup) && jl40.l(this.model, serverTooltipDto.model) && jl40.l(this.showingDelayMs, serverTooltipDto.showingDelayMs);
    }

    public final String getDefaultsGroup() {
        return this.defaultsGroup;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final ServerTooltipModelDto getModel() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getShowingDelayMs() {
        return this.showingDelayMs;
    }

    public int hashCode() {
        int hashCode = (this.model.hashCode() + unr0.b(unr0.b(this.name.hashCode() * 31, 31, this.eventId), 31, this.defaultsGroup)) * 31;
        Integer num = this.showingDelayMs;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.name;
        String str2 = this.eventId;
        String str3 = this.defaultsGroup;
        ServerTooltipModelDto serverTooltipModelDto = this.model;
        Integer num = this.showingDelayMs;
        StringBuilder v = b64.v("ServerTooltipDto(name=", str, ", eventId=", str2, ", defaultsGroup=");
        v.append(str3);
        v.append(", model=");
        v.append(serverTooltipModelDto);
        v.append(", showingDelayMs=");
        return oo31.j(v, num, Extension.C_BRAKE);
    }
}
