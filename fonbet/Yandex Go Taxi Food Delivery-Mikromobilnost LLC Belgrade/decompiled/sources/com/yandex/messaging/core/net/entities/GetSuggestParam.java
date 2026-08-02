package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class GetSuggestParam {

    @Json(name = "chat_id")
    public String mChatId;

    @Json(name = "invite_hash")
    public String mInviteHash;

    @Json(name = "limit")
    int mLimit = 30;

    @Json(name = "txt")
    public String mSuggestText;

    public GetSuggestParam(String str, String str2) {
        this.mSuggestText = str;
        this.mChatId = str2;
    }
}
