package xsna;

import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.dt5;

/* compiled from: PrepareFrameTimeReporter.kt */
/* loaded from: classes3.dex */
public final class f2d0 {
    public final m8 a;
    public dt5.a b = new dt5.a();
    public dt5.b c = new dt5.b();
    public dt5.b d = new dt5.b();
    public int e;

    public f2d0(m8 m8Var) {
        this.a = m8Var;
    }

    public final void a() {
        dt5.b bVar = this.c;
        if (bVar.a > 0) {
            dt5.b bVar2 = this.d;
            long j = bVar2.c + bVar.c;
            Long l = bVar2.h;
            if (l == null) {
                Float a = dt5.b.a.a(bVar2.g);
                l = a != null ? Long.valueOf((long) a.floatValue()) : null;
                bVar2.h = l;
            }
            dt5.b bVar3 = this.c;
            Long l2 = bVar3.h;
            if (l2 == null) {
                Float a2 = dt5.b.a.a(bVar3.g);
                l2 = a2 != null ? Long.valueOf((long) a2.floatValue()) : null;
                bVar3.h = l2;
            }
            List I = rl3.I(new Long[]{l, l2});
            if (I.isEmpty()) {
                I = null;
            }
            this.a.invoke(new wfs(this.c.b().longValue() + this.d.b().longValue(), this.b.b().longValue(), I != null ? Long.valueOf(j5g.G0(I)) : null, j, this.b.c, (long) (TimeUnit.SECONDS.toMillis(1L) / this.e)));
        }
        this.d = new dt5.b();
        this.c = new dt5.b();
        this.b = new dt5.b();
    }
}
