package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UpdateChatOrganizationsParams;", "", "chatId", "", "orgId", "", "<init>", "(Ljava/lang/String;J)V", "getChatId", "()Ljava/lang/String;", "getOrgId", "()J", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateChatOrganizationsParams {
    private final String chatId;
    private final long orgId;

    public UpdateChatOrganizationsParams(@Json(name = "chat") String str, @Json(name = "organization_id") long j) {
        this.chatId = str;
        this.orgId = j;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final long getOrgId() {
        return this.orgId;
    }
}
