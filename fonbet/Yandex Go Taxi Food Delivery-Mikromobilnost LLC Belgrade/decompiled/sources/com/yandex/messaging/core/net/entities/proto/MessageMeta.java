package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.oyr;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/MessageMeta;", "", "origin", "", "<init>", "(I)V", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MessageMeta {

    @xuf0(tag = 1)
    public final int origin;

    public MessageMeta(@Json(name = "Origin") int i) {
        this.origin = i;
    }

    public static /* synthetic */ MessageMeta copy$default(MessageMeta messageMeta, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = messageMeta.origin;
        }
        return messageMeta.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOrigin() {
        return this.origin;
    }

    public final MessageMeta copy(@Json(name = "Origin") int origin) {
        return new MessageMeta(origin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MessageMeta) && this.origin == ((MessageMeta) other).origin;
    }

    public int hashCode() {
        return Integer.hashCode(this.origin);
    }

    public String toString() {
        return oyr.j(this.origin, "MessageMeta(origin=", Extension.C_BRAKE);
    }
}
