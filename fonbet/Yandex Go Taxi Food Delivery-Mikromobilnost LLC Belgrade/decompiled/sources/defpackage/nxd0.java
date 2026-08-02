package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.messaging.domain.poll.PollMessageVote$OperationType;
import java.util.List;

/* loaded from: classes15.dex */
public final class nxd0 {
    public final long a;
    public final String b;
    public final List c;
    public final PollMessageVote$OperationType d;
    public final Long e;
    public final String f;

    public nxd0(lxd0 lxd0Var) {
        Long l = lxd0Var.a;
        if (l == null) {
            ny61.r("message timestamp is missing");
            throw null;
        }
        this.a = l.longValue();
        String str = lxd0Var.b;
        if (str == null) {
            ny61.r("chat id is missing");
            throw null;
        }
        this.b = str;
        this.c = lxd0Var.c;
        this.d = lxd0Var.d;
        this.e = lxd0Var.e;
        this.f = lxd0Var.f;
    }

    public final MessageRef a() {
        String str = this.f;
        if (str == null) {
            return MessageRef.a(this.a, this.b);
        }
        Long l = this.e;
        if (l != null) {
            return MessageRef.a(l.longValue(), str);
        }
        ny61.g("Required value was null.");
        return null;
    }
}
