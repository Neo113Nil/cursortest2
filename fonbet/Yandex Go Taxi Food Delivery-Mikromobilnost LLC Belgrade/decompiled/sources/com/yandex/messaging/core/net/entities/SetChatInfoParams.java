package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public class SetChatInfoParams {

    @Json(name = "alias")
    public String alias;

    @Json(name = "channel")
    public Boolean channel;

    @Json(name = "is_public")
    public Boolean channelPublicity;

    @Json(name = "chat_id")
    public final String chatId;

    @Json(name = DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)
    public String description;

    @Json(name = "name")
    public String name;

    @Json(name = "public")
    public Boolean pubChat;

    @Json(name = "version")
    public final long version;
}
