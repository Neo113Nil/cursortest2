package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.ChatMember;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/YouRemovedFromThreadData;", "Lcom/yandex/messaging/core/net/entities/StateSyncDiff;", "", "threadId", "Lcom/yandex/messaging/core/net/entities/ChatMember;", "chatMember", "<init>", "(Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/ChatMember;)V", "Lcom/yandex/messaging/core/net/entities/StateSyncDiff$Handler;", "handler", "Lzy11;", "sync", "(Lcom/yandex/messaging/core/net/entities/StateSyncDiff$Handler;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/messaging/core/net/entities/ChatMember;", "copy", "(Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/ChatMember;)Lcom/yandex/messaging/core/net/entities/proto/YouRemovedFromThreadData;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getThreadId", "Lcom/yandex/messaging/core/net/entities/ChatMember;", "getChatMember", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class YouRemovedFromThreadData implements StateSyncDiff {
    private final ChatMember chatMember;
    private final String threadId;

    public /* synthetic */ YouRemovedFromThreadData(String str, ChatMember chatMember, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : chatMember);
    }

    public static /* synthetic */ YouRemovedFromThreadData copy$default(YouRemovedFromThreadData youRemovedFromThreadData, String str, ChatMember chatMember, int i, Object obj) {
        if ((i & 1) != 0) {
            str = youRemovedFromThreadData.threadId;
        }
        if ((i & 2) != 0) {
            chatMember = youRemovedFromThreadData.chatMember;
        }
        return youRemovedFromThreadData.copy(str, chatMember);
    }

    /* renamed from: component1, reason: from getter */
    public final String getThreadId() {
        return this.threadId;
    }

    /* renamed from: component2, reason: from getter */
    public final ChatMember getChatMember() {
        return this.chatMember;
    }

    public final YouRemovedFromThreadData copy(@Json(name = "thread_id") String threadId, @Json(name = "chat_member") ChatMember chatMember) {
        return new YouRemovedFromThreadData(threadId, chatMember);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YouRemovedFromThreadData)) {
            return false;
        }
        YouRemovedFromThreadData youRemovedFromThreadData = (YouRemovedFromThreadData) other;
        return jl40.l(this.threadId, youRemovedFromThreadData.threadId) && jl40.l(this.chatMember, youRemovedFromThreadData.chatMember);
    }

    public final ChatMember getChatMember() {
        return this.chatMember;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        int hashCode = this.threadId.hashCode() * 31;
        ChatMember chatMember = this.chatMember;
        return hashCode + (chatMember == null ? 0 : chatMember.hashCode());
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public void sync(StateSyncDiff.Handler handler) {
        handler.r(this);
    }

    public String toString() {
        return "YouRemovedFromThreadData(threadId=" + this.threadId + ", chatMember=" + this.chatMember + Extension.C_BRAKE;
    }

    public YouRemovedFromThreadData(@Json(name = "thread_id") String str, @Json(name = "chat_member") ChatMember chatMember) {
        this.threadId = str;
        this.chatMember = chatMember;
    }
}
