package com.yandex.messaging.internal.entities;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/messaging/internal/entities/ReducedMessage;", "", "Companion", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ReducedMessage {
    public final String a;
    public final long b;
    public final long c;
    public final long d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/ReducedMessage$Companion;", "", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ReducedMessage(String str, long j, long j2, long j3) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReducedMessage)) {
            return false;
        }
        ReducedMessage reducedMessage = (ReducedMessage) obj;
        return jl40.l(this.a, reducedMessage.a) && this.b == reducedMessage.b && this.c == reducedMessage.c && this.d == reducedMessage.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder l = x4e.l("ReducedMessage(chatId=", this.a, ", messageHistoryId=", this.b);
        x4e.A(this.c, ", viewsCount=", ", forwardsCount=", l);
        return oyr.n(this.d, Extension.C_BRAKE, l);
    }
}
