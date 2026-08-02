package com.yandex.messaging.core.net.entities.chatcreate;

import com.squareup.moshi.Json;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public class CreateGroupChatParam {

    @Json(name = DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)
    public final String description;

    @Json(name = "channel")
    public final boolean isChannel = false;

    @Json(name = "public")
    public final boolean isPublic;

    @Json(name = "name")
    public final String name;

    @Json(name = "permissions")
    public final Permissions permissions;

    @Json(name = "roles")
    public final Roles roles;

    public CreateGroupChatParam(String str, String str2, Permissions permissions, Roles roles, boolean z) {
        this.name = str;
        this.description = str2;
        this.permissions = permissions;
        this.roles = roles;
        this.isPublic = z;
    }
}
