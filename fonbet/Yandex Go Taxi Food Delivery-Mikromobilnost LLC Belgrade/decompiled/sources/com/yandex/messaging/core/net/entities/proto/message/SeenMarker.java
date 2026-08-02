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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/SeenMarker;", "", "chatId", "", ClidProvider.TIMESTAMP, "", "seqNo", "version", "<init>", "(Ljava/lang/String;JJJ)V", "getChatId", "()Ljava/lang/String;", "getTimestamp", "()J", "getSeqNo", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SeenMarker {

    @cex
    @xuf0(tag = 1)
    private final String chatId;

    @xuf0(tag = 3)
    private final long seqNo;

    @xuf0(tag = 2)
    private final long timestamp;

    @xuf0(tag = 4)
    private final long version;

    public /* synthetic */ SeenMarker(String str, long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3);
    }

    public static /* synthetic */ SeenMarker copy$default(SeenMarker seenMarker, String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = seenMarker.chatId;
        }
        if ((i & 2) != 0) {
            j = seenMarker.timestamp;
        }
        if ((i & 4) != 0) {
            j2 = seenMarker.seqNo;
        }
        if ((i & 8) != 0) {
            j3 = seenMarker.version;
        }
        long j4 = j3;
        return seenMarker.copy(str, j, j2, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSeqNo() {
        return this.seqNo;
    }

    /* renamed from: component4, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    public final SeenMarker copy(@Json(name = "ChatId") String chatId, @Json(name = "Timestamp") long timestamp, @Json(name = "SeqNo") long seqNo, @Json(name = "Version") long version) {
        return new SeenMarker(chatId, timestamp, seqNo, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeenMarker)) {
            return false;
        }
        SeenMarker seenMarker = (SeenMarker) other;
        return jl40.l(this.chatId, seenMarker.chatId) && this.timestamp == seenMarker.timestamp && this.seqNo == seenMarker.seqNo && this.version == seenMarker.version;
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
        return Long.hashCode(this.version) + qv10.c(qv10.c(this.chatId.hashCode() * 31, 31, this.timestamp), 31, this.seqNo);
    }

    public String toString() {
        String str = this.chatId;
        long j = this.timestamp;
        long j2 = this.seqNo;
        long j3 = this.version;
        StringBuilder l = x4e.l("SeenMarker(chatId=", str, ", timestamp=", j);
        x4e.A(j2, ", seqNo=", ", version=", l);
        return oyr.n(j3, Extension.C_BRAKE, l);
    }

    public SeenMarker(@Json(name = "ChatId") String str, @Json(name = "Timestamp") long j, @Json(name = "SeqNo") long j2, @Json(name = "Version") long j3) {
        this.chatId = str;
        this.timestamp = j;
        this.seqNo = j2;
        this.version = j3;
    }
}
