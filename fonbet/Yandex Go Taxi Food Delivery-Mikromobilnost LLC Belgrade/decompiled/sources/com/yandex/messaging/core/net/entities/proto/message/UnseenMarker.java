package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.cex;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.x4e;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006!"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/UnseenMarker;", "", "chatId", "", "seqNo", "", "version", ClidProvider.TIMESTAMP, "<init>", "(Ljava/lang/String;JJJ)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getSeqNo", "()J", "setSeqNo", "(J)V", "getVersion", "setVersion", "getTimestamp", "setTimestamp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UnseenMarker {

    @cex
    @xuf0(tag = 1)
    private String chatId;

    @xuf0(tag = 2)
    private long seqNo;

    @xuf0(tag = 4)
    private long timestamp;

    @xuf0(tag = 3)
    private long version;

    public /* synthetic */ UnseenMarker(String str, long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3);
    }

    public static /* synthetic */ UnseenMarker copy$default(UnseenMarker unseenMarker, String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unseenMarker.chatId;
        }
        if ((i & 2) != 0) {
            j = unseenMarker.seqNo;
        }
        if ((i & 4) != 0) {
            j2 = unseenMarker.version;
        }
        if ((i & 8) != 0) {
            j3 = unseenMarker.timestamp;
        }
        long j4 = j3;
        return unseenMarker.copy(str, j, j2, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getSeqNo() {
        return this.seqNo;
    }

    /* renamed from: component3, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final UnseenMarker copy(@Json(name = "ChatId") String chatId, @Json(name = "SeqNo") long seqNo, @Json(name = "Version") long version, @Json(name = "Timestamp") long timestamp) {
        return new UnseenMarker(chatId, seqNo, version, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnseenMarker)) {
            return false;
        }
        UnseenMarker unseenMarker = (UnseenMarker) other;
        return jl40.l(this.chatId, unseenMarker.chatId) && this.seqNo == unseenMarker.seqNo && this.version == unseenMarker.version && this.timestamp == unseenMarker.timestamp;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final long getSeqNo() {
        return this.seqNo;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + qv10.c(qv10.c(this.chatId.hashCode() * 31, 31, this.seqNo), 31, this.version);
    }

    public final void setChatId(String str) {
        this.chatId = str;
    }

    public final void setSeqNo(long j) {
        this.seqNo = j;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setVersion(long j) {
        this.version = j;
    }

    public String toString() {
        String str = this.chatId;
        long j = this.seqNo;
        long j2 = this.version;
        long j3 = this.timestamp;
        StringBuilder l = x4e.l("UnseenMarker(chatId=", str, ", seqNo=", j);
        x4e.A(j2, ", version=", ", timestamp=", l);
        return oyr.n(j3, Extension.C_BRAKE, l);
    }

    public UnseenMarker(@Json(name = "ChatId") String str, @Json(name = "SeqNo") long j, @Json(name = "Version") long j2, @Json(name = "Timestamp") long j3) {
        this.chatId = str;
        this.seqNo = j;
        this.version = j2;
        this.timestamp = j3;
    }
}
