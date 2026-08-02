package defpackage;

import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import com.yandex.go.notifications.acknowledge.domain.a;

/* loaded from: classes8.dex */
public final class p1g0 {
    public final h3y a;

    public p1g0(h3y h3yVar) {
        this.a = h3yVar;
    }

    public final void a(String str, Throwable th) {
        ((a) this.a.get()).b(str, PushAckStatus.ERROR);
        xby.l(jst.e, "PUSH_ACK:PUSH_ERROR", null, th, "Failed to handle push with id=".concat(str), 2);
    }
}
