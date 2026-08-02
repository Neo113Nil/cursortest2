package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.oap;
import xsna.qva0;
import xsna.xfs;

/* compiled from: PlaybackAdapter.kt */
/* loaded from: classes3.dex */
public final class rva0 implements xfs {
    public final qva0 a;

    public rva0(qva0 qva0Var) {
        this.a = qva0Var;
    }

    @Override // xsna.xfs
    public final xfs.a a(long j) {
        return b(new oap.b(Long.valueOf(j)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final xfs.a b(oap<Integer, Long> oapVar) {
        qva0.a v;
        boolean z = oapVar instanceof oap.b;
        qva0 qva0Var = this.a;
        if (z) {
            v = qva0Var.a(((Number) ((oap.b) oapVar).a).longValue());
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            v = qva0Var.v(((Number) ((oap.a) oapVar).a).intValue());
        }
        if (v == null) {
            return null;
        }
        return new xfs.a(v.a / 1000, v.b);
    }

    public final void c() {
        this.a.release();
    }

    @Override // xsna.xfs
    public final boolean init() {
        return this.a.init();
    }

    @Override // xsna.xfs
    public final xfs.a v(int i) {
        return b(new oap.a(Integer.valueOf(i)));
    }
}
