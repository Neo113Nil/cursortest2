package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class HistoryResponse {

    @Json(name = "Chats")
    @xuf0(tag = 1)
    public ChatHistoryResponse[] chats;

    @Json(name = "Status")
    @xuf0(tag = 4)
    public int status;

    @Json(name = "WorkspaceVersion")
    @xuf0(tag = 8)
    public int workspaceVersion = 0;

    @Json(name = "Users")
    @xuf0(tag = 11)
    public ReducedUserInfo[] users = null;
}
