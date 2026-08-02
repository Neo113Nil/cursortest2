package defpackage;

import com.yandex.messaging.internal.authorized.chat.ChatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1;

/* loaded from: classes15.dex */
public final class c7b implements e1k {
    public cn2 a;
    public final pzt0 b;

    public c7b(tse tseVar, i7b i7bVar, yw80 yw80Var, long j, qsa0 qsa0Var) {
        this.b = tje.N(tseVar, null, null, new ChatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1(this, null, i7bVar, yw80Var, j, qsa0Var), 3);
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
