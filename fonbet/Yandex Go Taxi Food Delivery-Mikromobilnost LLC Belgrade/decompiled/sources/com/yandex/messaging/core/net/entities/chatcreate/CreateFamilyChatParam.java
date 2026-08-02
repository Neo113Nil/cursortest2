package com.yandex.messaging.core.net.entities.chatcreate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/yandex/messaging/core/net/entities/chatcreate/CreateFamilyChatParam;", "", "permissions", "Lcom/yandex/messaging/core/net/entities/chatcreate/Permissions;", "roles", "Lcom/yandex/messaging/core/net/entities/chatcreate/Roles;", "isFamily", "", "isPublic", "<init>", "(Lcom/yandex/messaging/core/net/entities/chatcreate/Permissions;Lcom/yandex/messaging/core/net/entities/chatcreate/Roles;ZZ)V", "getPermissions", "()Lcom/yandex/messaging/core/net/entities/chatcreate/Permissions;", "getRoles", "()Lcom/yandex/messaging/core/net/entities/chatcreate/Roles;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CreateFamilyChatParam {

    @Json(name = "is_family")
    private final boolean isFamily;

    @Json(name = "public")
    private final boolean isPublic;

    @Json(name = "permissions")
    private final Permissions permissions;

    @Json(name = "roles")
    private final Roles roles;

    public /* synthetic */ CreateFamilyChatParam(Permissions permissions, Roles roles, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(permissions, roles, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2);
    }

    public static /* synthetic */ CreateFamilyChatParam copy$default(CreateFamilyChatParam createFamilyChatParam, Permissions permissions, Roles roles, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            permissions = createFamilyChatParam.permissions;
        }
        if ((i & 2) != 0) {
            roles = createFamilyChatParam.roles;
        }
        if ((i & 4) != 0) {
            z = createFamilyChatParam.isFamily;
        }
        if ((i & 8) != 0) {
            z2 = createFamilyChatParam.isPublic;
        }
        return createFamilyChatParam.copy(permissions, roles, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final Permissions getPermissions() {
        return this.permissions;
    }

    /* renamed from: component2, reason: from getter */
    public final Roles getRoles() {
        return this.roles;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFamily() {
        return this.isFamily;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    public final CreateFamilyChatParam copy(Permissions permissions, Roles roles, boolean isFamily, boolean isPublic) {
        return new CreateFamilyChatParam(permissions, roles, isFamily, isPublic);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateFamilyChatParam)) {
            return false;
        }
        CreateFamilyChatParam createFamilyChatParam = (CreateFamilyChatParam) other;
        return jl40.l(this.permissions, createFamilyChatParam.permissions) && jl40.l(this.roles, createFamilyChatParam.roles) && this.isFamily == createFamilyChatParam.isFamily && this.isPublic == createFamilyChatParam.isPublic;
    }

    public final Permissions getPermissions() {
        return this.permissions;
    }

    public final Roles getRoles() {
        return this.roles;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPublic) + unr0.e((this.roles.hashCode() + (this.permissions.hashCode() * 31)) * 31, 31, this.isFamily);
    }

    public final boolean isFamily() {
        return this.isFamily;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public String toString() {
        Permissions permissions = this.permissions;
        Roles roles = this.roles;
        boolean z = this.isFamily;
        boolean z2 = this.isPublic;
        StringBuilder sb = new StringBuilder("CreateFamilyChatParam(permissions=");
        sb.append(permissions);
        sb.append(", roles=");
        sb.append(roles);
        sb.append(", isFamily=");
        return smw0.k(", isPublic=", Extension.C_BRAKE, sb, z, z2);
    }

    public CreateFamilyChatParam(Permissions permissions, Roles roles, boolean z, boolean z2) {
        this.permissions = permissions;
        this.roles = roles;
        this.isFamily = z;
        this.isPublic = z2;
    }
}
