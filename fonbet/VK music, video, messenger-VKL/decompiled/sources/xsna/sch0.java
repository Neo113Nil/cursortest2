package xsna;

import com.vk.metrics.performance.scroll.ScrollScreenType;

/* compiled from: ScreenScrollPerformanceChecker.kt */
/* loaded from: classes3.dex */
public final class sch0 implements ffs {
    public final /* synthetic */ rch0 a;
    public final /* synthetic */ ScrollScreenType b;
    public final /* synthetic */ p1d0 c;

    public sch0(rch0 rch0Var, ScrollScreenType scrollScreenType, p1d0 p1d0Var) {
        this.a = rch0Var;
        this.b = scrollScreenType;
        this.c = p1d0Var;
    }

    @Override // xsna.ffs
    public final void a(int i, int i2, long j, long j2) {
        ScrollScreenType scrollScreenType = this.b;
        rch0 rch0Var = this.a;
        rch0Var.b(scrollScreenType, j, i, j2, i2, false);
        if (((Boolean) this.c.invoke()).booleanValue()) {
            rch0Var.b(this.b, j, i, j2, i2, true);
        }
    }
}
