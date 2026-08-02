package defpackage;

import com.yandex.messaging.ui.polloptioninfo.PollVotersDataSource$loadPage$$inlined$suspendCancelableWrapper$1$1;

/* loaded from: classes15.dex */
public final class eyd0 implements e1k {
    public cn2 a;
    public final pzt0 b;

    public eyd0(ike ikeVar, gyd0 gyd0Var, long j, v790 v790Var) {
        this.b = tje.N(ikeVar, null, null, new PollVotersDataSource$loadPage$$inlined$suspendCancelableWrapper$1$1(this, null, gyd0Var, j, v790Var), 3);
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
