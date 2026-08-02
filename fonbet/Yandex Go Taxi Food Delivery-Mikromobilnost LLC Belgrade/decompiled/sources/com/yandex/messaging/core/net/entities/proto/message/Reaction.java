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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J1\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/Reaction;", "", "chatId", "", ClidProvider.TIMESTAMP, "", "type", "", "action", "<init>", "(Ljava/lang/String;JII)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Reaction {

    @xuf0(tag = 5)
    public final int action;

    @cex
    @xuf0(tag = 1)
    public final String chatId;

    @xuf0(tag = 2)
    public final long timestamp;

    @xuf0(tag = 3)
    public final int type;

    public /* synthetic */ Reaction(String str, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public static /* synthetic */ Reaction copy$default(Reaction reaction, String str, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = reaction.chatId;
        }
        if ((i3 & 2) != 0) {
            j = reaction.timestamp;
        }
        if ((i3 & 4) != 0) {
            i = reaction.type;
        }
        if ((i3 & 8) != 0) {
            i2 = reaction.action;
        }
        return reaction.copy(str, j, i, i2);
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
    public final int getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    public final Reaction copy(@Json(name = "ChatId") String chatId, @Json(name = "Timestamp") long timestamp, @Json(name = "Type") int type, @Json(name = "Action") int action) {
        return new Reaction(chatId, timestamp, type, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Reaction)) {
            return false;
        }
        Reaction reaction = (Reaction) other;
        return jl40.l(this.chatId, reaction.chatId) && this.timestamp == reaction.timestamp && this.type == reaction.type && this.action == reaction.action;
    }

    public int hashCode() {
        return Integer.hashCode(this.action) + oyr.b(this.type, qv10.c(this.chatId.hashCode() * 31, 31, this.timestamp), 31);
    }

    public String toString() {
        String str = this.chatId;
        long j = this.timestamp;
        int i = this.type;
        int i2 = this.action;
        StringBuilder l = x4e.l("Reaction(chatId=", str, ", timestamp=", j);
        l.append(", type=");
        l.append(i);
        l.append(", action=");
        l.append(i2);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public Reaction(@Json(name = "ChatId") String str, @Json(name = "Timestamp") long j, @Json(name = "Type") int i, @Json(name = "Action") int i2) {
        this.chatId = str;
        this.timestamp = j;
        this.type = i;
        this.action = i2;
    }
}
