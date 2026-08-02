package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R \u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetMediaMessagesParams;", "", "chatId", "", "inviteHash", "pivotId", "", "prev", "", "next", "types", "", "Lcom/yandex/messaging/core/net/entities/RequestMessageType;", "query", "<init>", "(Ljava/lang/String;Ljava/lang/String;JII[Lcom/yandex/messaging/core/net/entities/RequestMessageType;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getInviteHash", "getPivotId", "()J", "getPrev", "()I", "getNext", "getTypes", "()[Lcom/yandex/messaging/core/net/entities/RequestMessageType;", "[Lcom/yandex/messaging/core/net/entities/RequestMessageType;", "getQuery", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetMediaMessagesParams {

    @Json(name = "chat_id")
    private final String chatId;

    @Json(name = "invite_hash")
    private final String inviteHash;

    @Json(name = "next")
    private final int next;

    @Json(name = "pivot_id")
    private final long pivotId;

    @Json(name = "prev")
    private final int prev;

    @Json(name = "query")
    private final String query;

    @Json(name = "types")
    private final RequestMessageType[] types;

    public GetMediaMessagesParams(String str, String str2, long j, int i, int i2, RequestMessageType[] requestMessageTypeArr, String str3) {
        this.chatId = str;
        this.inviteHash = str2;
        this.pivotId = j;
        this.prev = i;
        this.next = i2;
        this.types = requestMessageTypeArr;
        this.query = str3;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getInviteHash() {
        return this.inviteHash;
    }

    public final int getNext() {
        return this.next;
    }

    public final long getPivotId() {
        return this.pivotId;
    }

    public final int getPrev() {
        return this.prev;
    }

    public final String getQuery() {
        return this.query;
    }

    public final RequestMessageType[] getTypes() {
        return this.types;
    }

    public /* synthetic */ GetMediaMessagesParams(String str, String str2, long j, int i, int i2, RequestMessageType[] requestMessageTypeArr, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, i, i2, (i3 & 32) != 0 ? null : requestMessageTypeArr, (i3 & 64) != 0 ? null : str3);
    }
}
