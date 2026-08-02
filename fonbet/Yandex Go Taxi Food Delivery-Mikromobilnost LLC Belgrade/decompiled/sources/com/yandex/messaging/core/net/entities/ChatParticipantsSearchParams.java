package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChatParticipantsSearchParams;", "", "chatId", "", "query", "limit", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getChatId", "()Ljava/lang/String;", "getQuery", "getLimit", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ChatParticipantsSearchParams {
    private final String chatId;
    private final int limit;
    private final String query;

    public ChatParticipantsSearchParams(@Json(name = "chat_id") String str, @Json(name = "query") String str2, @Json(name = "limit") int i) {
        this.chatId = str;
        this.query = str2;
        this.limit = i;
    }

    public static /* synthetic */ ChatParticipantsSearchParams copy$default(ChatParticipantsSearchParams chatParticipantsSearchParams, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatParticipantsSearchParams.chatId;
        }
        if ((i2 & 2) != 0) {
            str2 = chatParticipantsSearchParams.query;
        }
        if ((i2 & 4) != 0) {
            i = chatParticipantsSearchParams.limit;
        }
        return chatParticipantsSearchParams.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final ChatParticipantsSearchParams copy(@Json(name = "chat_id") String chatId, @Json(name = "query") String query, @Json(name = "limit") int limit) {
        return new ChatParticipantsSearchParams(chatId, query, limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatParticipantsSearchParams)) {
            return false;
        }
        ChatParticipantsSearchParams chatParticipantsSearchParams = (ChatParticipantsSearchParams) other;
        return jl40.l(this.chatId, chatParticipantsSearchParams.chatId) && jl40.l(this.query, chatParticipantsSearchParams.query) && this.limit == chatParticipantsSearchParams.limit;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        return Integer.hashCode(this.limit) + unr0.b(this.chatId.hashCode() * 31, 31, this.query);
    }

    public String toString() {
        return oyr.m(this.limit, Extension.C_BRAKE, b64.v("ChatParticipantsSearchParams(chatId=", this.chatId, ", query=", this.query, ", limit="));
    }
}
