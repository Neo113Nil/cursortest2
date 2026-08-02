package com.ybsdk.feature.banners.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJF\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0006\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "", "id", "", "name", "action", "isMarkable", "", "dropSessionsWithoutFullscreensOnShow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getName", "getAction", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDropSessionsWithoutFullscreensOnShow", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "equals", "other", "hashCode", "", "toString", "feature-banners-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FullScreenDto {
    private final String action;
    private final Boolean dropSessionsWithoutFullscreensOnShow;
    private final String id;
    private final Boolean isMarkable;
    private final String name;

    public FullScreenDto(@Json(name = "event_id") String str, @Json(name = "name") String str2, @Json(name = "url") String str3, @Json(name = "is_markable") Boolean bool, @Json(name = "drop_sessions_without_fullscreens_on_show") Boolean bool2) {
        this.id = str;
        this.name = str2;
        this.action = str3;
        this.isMarkable = bool;
        this.dropSessionsWithoutFullscreensOnShow = bool2;
    }

    public static /* synthetic */ FullScreenDto copy$default(FullScreenDto fullScreenDto, String str, String str2, String str3, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fullScreenDto.id;
        }
        if ((i & 2) != 0) {
            str2 = fullScreenDto.name;
        }
        if ((i & 4) != 0) {
            str3 = fullScreenDto.action;
        }
        if ((i & 8) != 0) {
            bool = fullScreenDto.isMarkable;
        }
        if ((i & 16) != 0) {
            bool2 = fullScreenDto.dropSessionsWithoutFullscreensOnShow;
        }
        Boolean bool3 = bool2;
        String str4 = str3;
        return fullScreenDto.copy(str, str2, str4, bool, bool3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsMarkable() {
        return this.isMarkable;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getDropSessionsWithoutFullscreensOnShow() {
        return this.dropSessionsWithoutFullscreensOnShow;
    }

    public final FullScreenDto copy(@Json(name = "event_id") String id, @Json(name = "name") String name, @Json(name = "url") String action, @Json(name = "is_markable") Boolean isMarkable, @Json(name = "drop_sessions_without_fullscreens_on_show") Boolean dropSessionsWithoutFullscreensOnShow) {
        return new FullScreenDto(id, name, action, isMarkable, dropSessionsWithoutFullscreensOnShow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullScreenDto)) {
            return false;
        }
        FullScreenDto fullScreenDto = (FullScreenDto) other;
        return jl40.l(this.id, fullScreenDto.id) && jl40.l(this.name, fullScreenDto.name) && jl40.l(this.action, fullScreenDto.action) && jl40.l(this.isMarkable, fullScreenDto.isMarkable) && jl40.l(this.dropSessionsWithoutFullscreensOnShow, fullScreenDto.dropSessionsWithoutFullscreensOnShow);
    }

    public final String getAction() {
        return this.action;
    }

    public final Boolean getDropSessionsWithoutFullscreensOnShow() {
        return this.dropSessionsWithoutFullscreensOnShow;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.name;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.action);
        Boolean bool = this.isMarkable;
        int hashCode2 = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.dropSessionsWithoutFullscreensOnShow;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isMarkable() {
        return this.isMarkable;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.action;
        Boolean bool = this.isMarkable;
        Boolean bool2 = this.dropSessionsWithoutFullscreensOnShow;
        StringBuilder v = b64.v("FullScreenDto(id=", str, ", name=", str2, ", action=");
        tse0.A(v, str3, ", isMarkable=", bool, ", dropSessionsWithoutFullscreensOnShow=");
        return nzs.d(v, bool2, Extension.C_BRAKE);
    }
}
