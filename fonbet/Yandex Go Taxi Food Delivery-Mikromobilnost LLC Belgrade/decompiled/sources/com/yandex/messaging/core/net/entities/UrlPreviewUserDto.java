package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JR\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UrlPreviewUserDto;", "", "guid", "", "displayName", "avatarId", "gender", "phoneId", "lastSeen", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getGuid", "()Ljava/lang/String;", "getDisplayName", "getAvatarId", "getGender", "getPhoneId", "getLastSeen", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/yandex/messaging/core/net/entities/UrlPreviewUserDto;", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UrlPreviewUserDto {
    private final String avatarId;
    private final String displayName;
    private final String gender;
    private final String guid;
    private final Long lastSeen;
    private final String phoneId;

    public UrlPreviewUserDto(@Json(name = "guid") String str, @Json(name = "display_name") String str2, @Json(name = "avatar_id") String str3, @Json(name = "gender") String str4, @Json(name = "phone_id") String str5, @Json(name = "last_seen") Long l) {
        this.guid = str;
        this.displayName = str2;
        this.avatarId = str3;
        this.gender = str4;
        this.phoneId = str5;
        this.lastSeen = l;
    }

    public static /* synthetic */ UrlPreviewUserDto copy$default(UrlPreviewUserDto urlPreviewUserDto, String str, String str2, String str3, String str4, String str5, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlPreviewUserDto.guid;
        }
        if ((i & 2) != 0) {
            str2 = urlPreviewUserDto.displayName;
        }
        if ((i & 4) != 0) {
            str3 = urlPreviewUserDto.avatarId;
        }
        if ((i & 8) != 0) {
            str4 = urlPreviewUserDto.gender;
        }
        if ((i & 16) != 0) {
            str5 = urlPreviewUserDto.phoneId;
        }
        if ((i & 32) != 0) {
            l = urlPreviewUserDto.lastSeen;
        }
        String str6 = str5;
        Long l2 = l;
        return urlPreviewUserDto.copy(str, str2, str3, str4, str6, l2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatarId() {
        return this.avatarId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPhoneId() {
        return this.phoneId;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getLastSeen() {
        return this.lastSeen;
    }

    public final UrlPreviewUserDto copy(@Json(name = "guid") String guid, @Json(name = "display_name") String displayName, @Json(name = "avatar_id") String avatarId, @Json(name = "gender") String gender, @Json(name = "phone_id") String phoneId, @Json(name = "last_seen") Long lastSeen) {
        return new UrlPreviewUserDto(guid, displayName, avatarId, gender, phoneId, lastSeen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlPreviewUserDto)) {
            return false;
        }
        UrlPreviewUserDto urlPreviewUserDto = (UrlPreviewUserDto) other;
        return jl40.l(this.guid, urlPreviewUserDto.guid) && jl40.l(this.displayName, urlPreviewUserDto.displayName) && jl40.l(this.avatarId, urlPreviewUserDto.avatarId) && jl40.l(this.gender, urlPreviewUserDto.gender) && jl40.l(this.phoneId, urlPreviewUserDto.phoneId) && jl40.l(this.lastSeen, urlPreviewUserDto.lastSeen);
    }

    public final String getAvatarId() {
        return this.avatarId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final Long getLastSeen() {
        return this.lastSeen;
    }

    public final String getPhoneId() {
        return this.phoneId;
    }

    public int hashCode() {
        int b = unr0.b(this.guid.hashCode() * 31, 31, this.displayName);
        String str = this.avatarId;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.gender;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.lastSeen;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.guid;
        String str2 = this.displayName;
        String str3 = this.avatarId;
        String str4 = this.gender;
        String str5 = this.phoneId;
        Long l = this.lastSeen;
        StringBuilder v = b64.v("UrlPreviewUserDto(guid=", str, ", displayName=", str2, ", avatarId=");
        g8e.D(v, str3, ", gender=", str4, ", phoneId=");
        v.append(str5);
        v.append(", lastSeen=");
        v.append(l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
