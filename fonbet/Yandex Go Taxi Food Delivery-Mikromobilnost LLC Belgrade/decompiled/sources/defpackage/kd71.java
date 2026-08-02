package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import yads.pf1;

/* loaded from: classes7.dex */
public final class kd71 {
    public final kn1 a;
    public final tse b;
    public final z371 c;
    public final wvb1 d;
    public final y381 e;
    public final qx71 f;
    public final lr71 g;
    public final AtomicBoolean h = new AtomicBoolean(false);

    public kd71(kn1 kn1Var, tse tseVar, z371 z371Var, wvb1 wvb1Var, y381 y381Var, ge71 ge71Var) {
        this.a = kn1Var;
        this.b = tseVar;
        this.c = z371Var;
        this.d = wvb1Var;
        this.e = y381Var;
        this.f = new qx71(0, ge71Var);
        this.g = new lr71((Set) kn1Var.w);
    }

    public static final void a(kd71 kd71Var, ArrayList arrayList) {
        Long l;
        kd71Var.getClass();
        pf1 pf1Var = kd71Var.e.a;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((hx81) it.next()).a.a);
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((hx81) it.next()).a.a);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        if (l != null) {
            pf1Var.a("ExitInfoAnrLastReportedTimestamp", Math.max(pf1Var.b("ExitInfoAnrLastReportedTimestamp"), l.longValue()));
        }
    }
}
