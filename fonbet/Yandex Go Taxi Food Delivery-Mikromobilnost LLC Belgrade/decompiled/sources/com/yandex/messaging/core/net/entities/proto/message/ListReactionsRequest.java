package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018JP\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ListReactionsRequest;", "", "chatId", "", "inviteHash", ClidProvider.TIMESTAMP, "", "maxTimestamp", "limit", "", "mode", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ILjava/lang/Integer;)V", "getChatId", "()Ljava/lang/String;", "getInviteHash", "getTimestamp", "()J", "getMaxTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLimit", "()I", "getMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ILjava/lang/Integer;)Lcom/yandex/messaging/core/net/entities/proto/message/ListReactionsRequest;", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ListReactionsRequest {

    @xuf0(tag = 2)
    private final String chatId;

    @xuf0(tag = 3)
    private final String inviteHash;

    @xuf0(tag = 6)
    private final int limit;

    @xuf0(tag = 5)
    private final Long maxTimestamp;

    @xuf0(tag = 8)
    private final Integer mode;

    @xuf0(tag = 4)
    private final long timestamp;

    public /* synthetic */ ListReactionsRequest(String str, String str2, long j, Long l, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, l, i, (i2 & 32) != 0 ? null : num);
    }

    public static /* synthetic */ ListReactionsRequest copy$default(ListReactionsRequest listReactionsRequest, String str, String str2, long j, Long l, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = listReactionsRequest.chatId;
        }
        if ((i2 & 2) != 0) {
            str2 = listReactionsRequest.inviteHash;
        }
        if ((i2 & 4) != 0) {
            j = listReactionsRequest.timestamp;
        }
        if ((i2 & 8) != 0) {
            l = listReactionsRequest.maxTimestamp;
        }
        if ((i2 & 16) != 0) {
            i = listReactionsRequest.limit;
        }
        if ((i2 & 32) != 0) {
            num = listReactionsRequest.mode;
        }
        Integer num2 = num;
        Long l2 = l;
        long j2 = j;
        return listReactionsRequest.copy(str, str2, j2, l2, i, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInviteHash() {
        return this.inviteHash;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getMaxTimestamp() {
        return this.maxTimestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getMode() {
        return this.mode;
    }

    public final ListReactionsRequest copy(@Json(name = "ChatId") String chatId, @Json(name = "InviteHash") String inviteHash, @Json(name = "Timestamp") long timestamp, @Json(name = "MaxTimestamp") Long maxTimestamp, @Json(name = "Limit") int limit, @Json(name = "Mode") Integer mode) {
        return new ListReactionsRequest(chatId, inviteHash, timestamp, maxTimestamp, limit, mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListReactionsRequest)) {
            return false;
        }
        ListReactionsRequest listReactionsRequest = (ListReactionsRequest) other;
        return jl40.l(this.chatId, listReactionsRequest.chatId) && jl40.l(this.inviteHash, listReactionsRequest.inviteHash) && this.timestamp == listReactionsRequest.timestamp && jl40.l(this.maxTimestamp, listReactionsRequest.maxTimestamp) && this.limit == listReactionsRequest.limit && jl40.l(this.mode, listReactionsRequest.mode);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getInviteHash() {
        return this.inviteHash;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final Long getMaxTimestamp() {
        return this.maxTimestamp;
    }

    public final Integer getMode() {
        return this.mode;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = this.chatId.hashCode() * 31;
        String str = this.inviteHash;
        int c = qv10.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.timestamp);
        Long l = this.maxTimestamp;
        int b = oyr.b(this.limit, (c + (l == null ? 0 : l.hashCode())) * 31, 31);
        Integer num = this.mode;
        return b + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.chatId;
        String str2 = this.inviteHash;
        long j = this.timestamp;
        Long l = this.maxTimestamp;
        int i = this.limit;
        Integer num = this.mode;
        StringBuilder v = b64.v("ListReactionsRequest(chatId=", str, ", inviteHash=", str2, ", timestamp=");
        v.append(j);
        v.append(", maxTimestamp=");
        v.append(l);
        v.append(", limit=");
        v.append(i);
        v.append(", mode=");
        v.append(num);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ListReactionsRequest(@Json(name = "ChatId") String str, @Json(name = "InviteHash") String str2, @Json(name = "Timestamp") long j, @Json(name = "MaxTimestamp") Long l, @Json(name = "Limit") int i, @Json(name = "Mode") Integer num) {
        this.chatId = str;
        this.inviteHash = str2;
        this.timestamp = j;
        this.maxTimestamp = l;
        this.limit = i;
        this.mode = num;
    }
}
