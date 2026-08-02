package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.x4e;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChatSettingsParams;", "", "chatId", "", "version", "", "memberRights", "", "", "<init>", "(Ljava/lang/String;JLjava/util/Map;)V", "getChatId", "()Ljava/lang/String;", "getVersion", "()J", "getMemberRights", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ChatSettingsParams {
    private final String chatId;
    private final Map<String, Boolean> memberRights;
    private final long version;

    public ChatSettingsParams(@Json(name = "chat_id") String str, @Json(name = "version") long j, @Json(name = "member_rights") Map<String, Boolean> map) {
        this.chatId = str;
        this.version = j;
        this.memberRights = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatSettingsParams copy$default(ChatSettingsParams chatSettingsParams, String str, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatSettingsParams.chatId;
        }
        if ((i & 2) != 0) {
            j = chatSettingsParams.version;
        }
        if ((i & 4) != 0) {
            map = chatSettingsParams.memberRights;
        }
        return chatSettingsParams.copy(str, j, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    public final Map<String, Boolean> component3() {
        return this.memberRights;
    }

    public final ChatSettingsParams copy(@Json(name = "chat_id") String chatId, @Json(name = "version") long version, @Json(name = "member_rights") Map<String, Boolean> memberRights) {
        return new ChatSettingsParams(chatId, version, memberRights);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatSettingsParams)) {
            return false;
        }
        ChatSettingsParams chatSettingsParams = (ChatSettingsParams) other;
        return jl40.l(this.chatId, chatSettingsParams.chatId) && this.version == chatSettingsParams.version && jl40.l(this.memberRights, chatSettingsParams.memberRights);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final Map<String, Boolean> getMemberRights() {
        return this.memberRights;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.memberRights.hashCode() + qv10.c(this.chatId.hashCode() * 31, 31, this.version);
    }

    public String toString() {
        String str = this.chatId;
        long j = this.version;
        Map<String, Boolean> map = this.memberRights;
        StringBuilder l = x4e.l("ChatSettingsParams(chatId=", str, ", version=", j);
        l.append(", memberRights=");
        l.append(map);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
