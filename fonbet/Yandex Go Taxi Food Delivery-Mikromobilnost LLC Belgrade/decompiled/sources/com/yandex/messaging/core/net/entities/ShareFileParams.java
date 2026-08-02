package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ShareFileParams;", "", "fileIds", "", "", "originalChatId", "newChatId", "inviteHash", "<init>", "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileIds", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getOriginalChatId", "()Ljava/lang/String;", "getNewChatId", "getInviteHash", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShareFileParams {
    private final String[] fileIds;
    private final String inviteHash;
    private final String newChatId;
    private final String originalChatId;

    public ShareFileParams(@Json(name = "file_ids") String[] strArr, @Json(name = "share_chat_id") String str, @Json(name = "chat_id") String str2, @Json(name = "invite_hash") String str3) {
        this.fileIds = strArr;
        this.originalChatId = str;
        this.newChatId = str2;
        this.inviteHash = str3;
    }

    public final String[] getFileIds() {
        return this.fileIds;
    }

    public final String getInviteHash() {
        return this.inviteHash;
    }

    public final String getNewChatId() {
        return this.newChatId;
    }

    public final String getOriginalChatId() {
        return this.originalChatId;
    }

    public /* synthetic */ ShareFileParams(String[] strArr, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr, str, str2, (i & 8) != 0 ? null : str3);
    }
}
