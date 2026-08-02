package yads;

import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* loaded from: classes10.dex */
public final class le0 implements zx2 {
    public final /* synthetic */ me0 a;

    public le0(me0 me0Var) {
        this.a = me0Var;
    }

    @Override // yads.zx2
    public final boolean b() {
        return true;
    }

    @Override // yads.zx2
    public final long c() {
        return (this.a.f * 1000000) / r0.d.i;
    }

    @Override // yads.zx2
    public final xx2 b(long j) {
        me0 me0Var = this.a;
        long j2 = (me0Var.d.i * j) / 1000000;
        long j3 = me0Var.b;
        long j4 = me0Var.c;
        int i = mc3.a;
        by2 by2Var = new by2(j, Math.max(j3, Math.min(((((j4 - j3) * j2) / me0Var.f) + j3) - ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, j4 - 1)));
        return new xx2(by2Var, by2Var);
    }
}
