package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class GetChatDataByInviteHashParams {

    @Json(name = "invite_hash")
    public final String inviteHash;

    public GetChatDataByInviteHashParams(String str) {
        this.inviteHash = str;
    }
}
