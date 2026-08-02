package xsna;

import xsna.v400;

/* compiled from: LongPollSyncStorageChannels.kt */
/* loaded from: classes2.dex */
public final class x400 implements w400 {
    public final xgl0 a;

    public x400(xgl0 xgl0Var) {
        this.a = xgl0Var;
    }

    @Override // xsna.w400
    public final v400 a() {
        Long p = this.a.system().p();
        if (p != null) {
            return new v400.a(p.longValue());
        }
        return null;
    }

    @Override // xsna.w400
    public final void b(v400 v400Var) {
        this.a.system().l(((v400.a) v400Var).a);
    }
}
