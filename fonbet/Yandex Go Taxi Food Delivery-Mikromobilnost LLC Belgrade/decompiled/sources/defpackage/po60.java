package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class po60 {
    public final ru11 a;
    public final cne0 b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public po60(dne0 dne0Var, ru11 ru11Var) {
        this.a = ru11Var;
        this.b = dne0Var.b();
    }

    public final hnz0 a() {
        boolean compareAndSet = this.c.compareAndSet(false, true);
        cne0 cne0Var = this.b;
        if (compareAndSet) {
            String l = cne0Var.l("oauth_token", null);
            long j = cne0Var.j("oauth_token_uid", 0L);
            if (l != null && !evu0.J(l) && j <= 0) {
                long j2 = this.a.a().a;
                if (j2 > 0) {
                    cne0Var.d().putLong("oauth_token_uid", j2).commit();
                }
            }
        }
        String l2 = cne0Var.l("oauth_token", null);
        long j3 = cne0Var.j("oauth_token_uid", 0L);
        if (l2 == null || evu0.J(l2) || j3 <= 0) {
            return null;
        }
        return new hnz0(l2, j3);
    }
}
