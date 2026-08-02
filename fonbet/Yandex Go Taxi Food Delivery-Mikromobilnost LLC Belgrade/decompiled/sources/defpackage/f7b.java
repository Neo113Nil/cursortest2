package defpackage;

import com.yandex.messaging.internal.authorized.chat.ChatOutgoingMessageHandler$uploadAndSendIfNecessary$$inlined$suspendCancelableWrapper$1$1;

/* loaded from: classes15.dex */
public final class f7b implements e1k {
    public cn2 a;
    public final pzt0 b;

    public f7b(ike ikeVar, i7b i7bVar, Integer num, yw80 yw80Var, uw80[] uw80VarArr, jsa0 jsa0Var, long j) {
        this.b = tje.N(ikeVar, null, null, new ChatOutgoingMessageHandler$uploadAndSendIfNecessary$$inlined$suspendCancelableWrapper$1$1(this, null, i7bVar, num, yw80Var, uw80VarArr, jsa0Var, j), 3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.a(null);
        cn2 cn2Var = this.a;
        if (cn2Var != null) {
            cn2Var.close();
        }
    }
}
