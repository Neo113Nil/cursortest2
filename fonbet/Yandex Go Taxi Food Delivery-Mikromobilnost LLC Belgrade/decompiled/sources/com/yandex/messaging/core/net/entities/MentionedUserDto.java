package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/MentionedUserDto;", "", "guid", "", "displayName", "phoneId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGuid", "()Ljava/lang/String;", "getDisplayName", "getPhoneId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MentionedUserDto {
    private final String displayName;
    private final String guid;
    private final String phoneId;

    public MentionedUserDto(@Json(name = "guid") String str, @Json(name = "display_name") String str2, @Json(name = "phone_id") String str3) {
        this.guid = str;
        this.displayName = str2;
        this.phoneId = str3;
    }

    public static /* synthetic */ MentionedUserDto copy$default(MentionedUserDto mentionedUserDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mentionedUserDto.guid;
        }
        if ((i & 2) != 0) {
            str2 = mentionedUserDto.displayName;
        }
        if ((i & 4) != 0) {
            str3 = mentionedUserDto.phoneId;
        }
        return mentionedUserDto.copy(str, str2, str3);
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
    public final String getPhoneId() {
        return this.phoneId;
    }

    public final MentionedUserDto copy(@Json(name = "guid") String guid, @Json(name = "display_name") String displayName, @Json(name = "phone_id") String phoneId) {
        return new MentionedUserDto(guid, displayName, phoneId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MentionedUserDto)) {
            return false;
        }
        MentionedUserDto mentionedUserDto = (MentionedUserDto) other;
        return jl40.l(this.guid, mentionedUserDto.guid) && jl40.l(this.displayName, mentionedUserDto.displayName) && jl40.l(this.phoneId, mentionedUserDto.phoneId);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final String getPhoneId() {
        return this.phoneId;
    }

    public int hashCode() {
        return this.phoneId.hashCode() + unr0.b(this.guid.hashCode() * 31, 31, this.displayName);
    }

    public String toString() {
        String str = this.guid;
        String str2 = this.displayName;
        return oyr.t(b64.v("MentionedUserDto(guid=", str, ", displayName=", str2, ", phoneId="), this.phoneId, Extension.C_BRAKE);
    }
}
