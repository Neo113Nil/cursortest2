package xsna;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.jm50;
import xsna.lsw;
import xsna.r070;

/* compiled from: NewsfeedInactiveTasksTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class vl60 extends evg0<qz60, on50, r070.g, r070, jv60, xh60> {
    public final lsw f;
    public final p0m g;

    public vl60(lsw lswVar, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = lswVar;
        this.g = new p0m(lswVar, new e810(this, 11));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        r070.g gVar = (r070.g) hn50Var;
        if (!(gVar instanceof r070.g.a)) {
            if (!(gVar instanceof r070.g.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f.a(lsw.b.c.a);
            return null;
        }
        p0m p0mVar = this.g;
        if (!((Boolean) p0mVar.e.getValue()).booleanValue()) {
            return null;
        }
        m50 m50Var = p0mVar.d;
        zqh zqhVar = new zqh(p0mVar, 6);
        long longValue = ((Number) p0mVar.f.getValue()).longValue();
        long longValue2 = ((Number) p0mVar.g.getValue()).longValue();
        Set y0 = rl3.y0(new lsw.b[]{lsw.b.AbstractC3288b.a.a, lsw.b.a.C3286a.a, lsw.b.d.a.a});
        lsw.b.c cVar = lsw.b.c.a;
        lsw.a aVar = new lsw.a(longValue, new i4e(p0mVar, 20), longValue2, y0, rl3.y0(new lsw.b[]{lsw.b.d.C3290b.a, lsw.b.AbstractC3288b.C3289b.a, cVar}), Collections.singleton(cVar), 258);
        ksw kswVar = new ksw(m50Var, zqhVar, aVar);
        lsw lswVar = p0mVar.a;
        kswVar.e = new WeakReference<>(lswVar);
        long j = aVar.b;
        kswVar.g = j;
        lsw.b(kswVar, j);
        lswVar.a.add(kswVar);
        return null;
    }
}
