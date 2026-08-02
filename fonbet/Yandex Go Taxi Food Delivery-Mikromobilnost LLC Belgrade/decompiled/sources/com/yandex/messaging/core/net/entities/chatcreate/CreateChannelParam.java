package com.yandex.messaging.core.net.entities.chatcreate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006%"}, d2 = {"Lcom/yandex/messaging/core/net/entities/chatcreate/CreateChannelParam;", "", "name", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "permissions", "Lcom/yandex/messaging/core/net/entities/chatcreate/Permissions;", "roles", "Lcom/yandex/messaging/core/net/entities/chatcreate/Roles;", "channelPublicity", "", "isChannel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/chatcreate/Permissions;Lcom/yandex/messaging/core/net/entities/chatcreate/Roles;ZZ)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getDescription", "getPermissions", "()Lcom/yandex/messaging/core/net/entities/chatcreate/Permissions;", "getRoles", "()Lcom/yandex/messaging/core/net/entities/chatcreate/Roles;", "getChannelPublicity", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CreateChannelParam {

    @Json(name = "is_public")
    private final boolean channelPublicity;

    @Json(name = DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)
    private final String description;

    @Json(name = "channel")
    private final boolean isChannel;

    @Json(name = "name")
    private String name;

    @Json(name = "permissions")
    private final Permissions permissions;

    @Json(name = "roles")
    private final Roles roles;

    public /* synthetic */ CreateChannelParam(String str, String str2, Permissions permissions, Roles roles, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, permissions, roles, (i & 16) != 0 ? false : z, (i & 32) != 0 ? true : z2);
    }

    public static /* synthetic */ CreateChannelParam copy$default(CreateChannelParam createChannelParam, String str, String str2, Permissions permissions, Roles roles, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createChannelParam.name;
        }
        if ((i & 2) != 0) {
            str2 = createChannelParam.description;
        }
        if ((i & 4) != 0) {
            permissions = createChannelParam.permissions;
        }
        if ((i & 8) != 0) {
            roles = createChannelParam.roles;
        }
        if ((i & 16) != 0) {
            z = createChannelParam.channelPublicity;
        }
        if ((i & 32) != 0) {
            z2 = createChannelParam.isChannel;
        }
        boolean z3 = z;
        boolean z4 = z2;
        return createChannelParam.copy(str, str2, permissions, roles, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final Permissions getPermissions() {
        return this.permissions;
    }

    /* renamed from: component4, reason: from getter */
    public final Roles getRoles() {
        return this.roles;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getChannelPublicity() {
        return this.channelPublicity;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsChannel() {
        return this.isChannel;
    }

    public final CreateChannelParam copy(String name, String description, Permissions permissions, Roles roles, boolean channelPublicity, boolean isChannel) {
        return new CreateChannelParam(name, description, permissions, roles, channelPublicity, isChannel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateChannelParam)) {
            return false;
        }
        CreateChannelParam createChannelParam = (CreateChannelParam) other;
        return jl40.l(this.name, createChannelParam.name) && jl40.l(this.description, createChannelParam.description) && jl40.l(this.permissions, createChannelParam.permissions) && jl40.l(this.roles, createChannelParam.roles) && this.channelPublicity == createChannelParam.channelPublicity && this.isChannel == createChannelParam.isChannel;
    }

    public final boolean getChannelPublicity() {
        return this.channelPublicity;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final Permissions getPermissions() {
        return this.permissions;
    }

    public final Roles getRoles() {
        return this.roles;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isChannel) + unr0.e((this.roles.hashCode() + ((this.permissions.hashCode() + unr0.b(this.name.hashCode() * 31, 31, this.description)) * 31)) * 31, 31, this.channelPublicity);
    }

    public final boolean isChannel() {
        return this.isChannel;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.description;
        Permissions permissions = this.permissions;
        Roles roles = this.roles;
        boolean z = this.channelPublicity;
        boolean z2 = this.isChannel;
        StringBuilder v = b64.v("CreateChannelParam(name=", str, ", description=", str2, ", permissions=");
        v.append(permissions);
        v.append(", roles=");
        v.append(roles);
        v.append(", channelPublicity=");
        return smw0.k(", isChannel=", Extension.C_BRAKE, v, z, z2);
    }

    public CreateChannelParam(String str, String str2, Permissions permissions, Roles roles, boolean z, boolean z2) {
        this.name = str;
        this.description = str2;
        this.permissions = permissions;
        this.roles = roles;
        this.channelPublicity = z;
        this.isChannel = z2;
    }
}
