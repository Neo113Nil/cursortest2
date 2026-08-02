package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/OutOrganizationUser;", "", "guid", "", "avatarId", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGuid", "()Ljava/lang/String;", "getAvatarId", "getDisplayName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OutOrganizationUser {
    private final String avatarId;
    private final String displayName;
    private final String guid;

    public OutOrganizationUser(@Json(name = "guid") String str, @Json(name = "avatar_id") String str2, @Json(name = "display_name") String str3) {
        this.guid = str;
        this.avatarId = str2;
        this.displayName = str3;
    }

    public static /* synthetic */ OutOrganizationUser copy$default(OutOrganizationUser outOrganizationUser, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = outOrganizationUser.guid;
        }
        if ((i & 2) != 0) {
            str2 = outOrganizationUser.avatarId;
        }
        if ((i & 4) != 0) {
            str3 = outOrganizationUser.displayName;
        }
        return outOrganizationUser.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAvatarId() {
        return this.avatarId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final OutOrganizationUser copy(@Json(name = "guid") String guid, @Json(name = "avatar_id") String avatarId, @Json(name = "display_name") String displayName) {
        return new OutOrganizationUser(guid, avatarId, displayName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutOrganizationUser)) {
            return false;
        }
        OutOrganizationUser outOrganizationUser = (OutOrganizationUser) other;
        return jl40.l(this.guid, outOrganizationUser.guid) && jl40.l(this.avatarId, outOrganizationUser.avatarId) && jl40.l(this.displayName, outOrganizationUser.displayName);
    }

    public final String getAvatarId() {
        return this.avatarId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getGuid() {
        return this.guid;
    }

    public int hashCode() {
        int hashCode = this.guid.hashCode() * 31;
        String str = this.avatarId;
        return this.displayName.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.guid;
        String str2 = this.avatarId;
        return oyr.t(b64.v("OutOrganizationUser(guid=", str, ", avatarId=", str2, ", displayName="), this.displayName, Extension.C_BRAKE);
    }
}
