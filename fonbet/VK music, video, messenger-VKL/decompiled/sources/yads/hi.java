package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class hi {
    public final wf a;
    public final yvj b;
    public final ei c;
    public final fi d;
    public final kf e;
    public final y10 f;
    public final mf g;
    public final AtomicBoolean h = new AtomicBoolean(false);

    public hi(wf wfVar, yvj yvjVar, ei eiVar, fi fiVar, kf kfVar, jp2 jp2Var) {
        this.a = wfVar;
        this.b = yvjVar;
        this.c = eiVar;
        this.d = fiVar;
        this.e = kfVar;
        this.f = new y10(jp2Var);
        this.g = new mf(wfVar.a());
    }

    public static final void a(hi hiVar, ArrayList arrayList) {
        Long l;
        hiVar.getClass();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((oc2) it.next()).a.a);
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((oc2) it.next()).a.a);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        if (l != null) {
            long longValue = l.longValue();
            long b = ((uh1) hiVar.e.a).b("ExitInfoAnrLastReportedTimestamp");
            kf kfVar = hiVar.e;
            ((uh1) kfVar.a).a("ExitInfoAnrLastReportedTimestamp", Math.max(b, longValue));
        }
    }
}
