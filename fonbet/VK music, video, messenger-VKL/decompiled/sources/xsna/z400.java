package xsna;

import xsna.v400;

/* compiled from: LongPollSyncStorageMessages.kt */
/* loaded from: classes2.dex */
public final class z400 implements w400 {
    public final xgl0 a;

    static {
        System.currentTimeMillis();
    }

    public z400(xgl0 xgl0Var) {
        this.a = xgl0Var;
    }

    @Override // xsna.w400
    public final v400 a() {
        frn0 system = this.a.system();
        Long q = system.q();
        Long k = system.k();
        if (q == null || k == null) {
            return null;
        }
        return new v400.b(q.longValue(), k.longValue());
    }

    @Override // xsna.w400
    public final void b(v400 v400Var) {
        this.a.u(new ugm(v400Var, 14));
    }
}
