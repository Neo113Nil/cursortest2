package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import defpackage.cex;

/* loaded from: classes15.dex */
public class SearchParams {

    @Json(name = "chat_id")
    public String chatId;

    @cex
    @Json(name = "entities")
    public String[] entities;

    @Json(name = "invite_hash")
    public String inviteHash;

    @cex
    @Json(name = "query")
    public String query;

    @Json(name = "ranking")
    public Ranking[] ranking;

    @Json(name = "limit")
    public int limit = 100;

    @Json(name = "suggest_chat_id")
    public String suggestChatId = null;

    @Json(name = "new_chat")
    public boolean isNewChat = false;

    public SearchParams(String[] strArr, String str, String str2, String str3, Ranking ranking) {
        this.entities = strArr;
        this.chatId = str;
        this.query = str2;
        this.inviteHash = str3;
        this.ranking = new Ranking[]{ranking};
    }
}
