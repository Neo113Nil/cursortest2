package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.NoWhenBranchMatchedException;
import xsna.jm50;
import xsna.r070;
import xsna.xh60;

/* compiled from: NewsfeedFreshTimerTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class yj60 extends evg0<qz60, on50, r070.f, r070, jv60, xh60> {
    public final xj60 f;
    public final ce60 g;
    public final ts60 h;

    public yj60(xj60 xj60Var, ce60 ce60Var, ts60 ts60Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = xj60Var;
        this.g = ce60Var;
        this.h = ts60Var;
    }

    public static boolean t(yj60 yj60Var) {
        if (((qz60) yj60Var.b.getCurrentState()).c != 0) {
            return false;
        }
        yj60Var.g.getClass();
        return ce60.m();
    }

    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        r070.f fVar = (r070.f) hn50Var;
        if (fVar.equals(r070.f.C3588f.b)) {
            w();
            return null;
        }
        if (fVar.equals(r070.f.g.b)) {
            w();
            return null;
        }
        if (fVar.equals(r070.f.b.b)) {
            v();
            return null;
        }
        if (fVar.equals(r070.f.i.b)) {
            y();
            return null;
        }
        if (fVar.equals(r070.f.h.b)) {
            s();
            return null;
        }
        boolean equals = fVar.equals(r070.f.e.b);
        xj60 xj60Var = this.f;
        if (equals) {
            xj60Var.getClass();
            xj60Var.d = System.currentTimeMillis();
            xj60Var.b();
            return null;
        }
        if (fVar.equals(r070.f.c.b)) {
            xj60Var.getClass();
            xj60Var.d = System.currentTimeMillis();
            xj60Var.b();
            return null;
        }
        if (fVar.equals(r070.f.d.b)) {
            s();
            return null;
        }
        if (!(fVar instanceof r070.f.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((r070.f.a) fVar).b != 0) {
            c(new xh60.b.a(false));
            xj60Var.getClass();
            xj60Var.d = System.currentTimeMillis();
            xj60Var.b();
            return null;
        }
        xj60Var.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j = xj60Var.d;
        long j2 = currentTimeMillis - j;
        if (j <= 0 || j2 < ((Number) xj60Var.c.getValue()).longValue()) {
            x(0);
            return null;
        }
        v();
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void s() {
        xj60 xj60Var = this.f;
        xj60Var.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j = xj60Var.d;
        boolean z = j > 0 && currentTimeMillis - j >= ((Number) xj60Var.c.getValue()).longValue();
        if (this.g.e()) {
            y();
        } else if (z) {
            v();
        } else {
            x(((qz60) this.b.getCurrentState()).c);
        }
    }

    public final void v() {
        if (t(this)) {
            this.h.m("Refresh feed");
            c(new xh60.e(vp60.a));
            a(new r070.h.b(0, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP), false));
            w();
        }
    }

    public final void w() {
        if (t(this)) {
            xj60 xj60Var = this.f;
            xj60Var.b();
            xj60Var.e = 0L;
            c(new xh60.b.a(false));
            y();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void x(int i) {
        if (i == 0) {
            this.g.getClass();
            if (ce60.m()) {
                w100 w100Var = new w100(this, 10);
                xj60 xj60Var = this.f;
                long j = xj60Var.e;
                ?? r3 = xj60Var.c;
                xj60Var.a(j > 0 ? Math.max(((Number) r3.getValue()).longValue() - (System.currentTimeMillis() - xj60Var.e), 0L) : ((Number) r3.getValue()).longValue(), w100Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void y() {
        if (t(this)) {
            a040 a040Var = new a040(this, 10);
            xj60 xj60Var = this.f;
            xj60Var.a(((Number) xj60Var.c.getValue()).longValue(), a040Var);
        }
    }
}
