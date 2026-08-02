package defpackage;

import android.os.Trace;

/* loaded from: classes10.dex */
public final class c6y {
    public final tls a;
    public final vne0 b;
    public kzo c;
    public int d;
    public int e;
    public int f;

    public c6y() {
        this.b = new vne0();
        this.d = -1;
        this.e = -1;
    }

    public final b6y a(int i, long j, boolean z, tls tlsVar) {
        kzo kzoVar = this.c;
        if (kzoVar == null) {
            return z2n.a;
        }
        eoe0 eoe0Var = (eoe0) kzoVar.x;
        boolean z2 = eoe0Var instanceof j3f0;
        pne0 pne0Var = new pne0(kzoVar, i, this.b, tlsVar);
        pne0Var.d = new n8e(j);
        if (!z2) {
            eoe0Var.schedulePrefetch(pne0Var);
        } else if (z) {
            ((j3f0) eoe0Var).scheduleHighPriorityPrefetch(pne0Var);
        } else {
            ((j3f0) eoe0Var).scheduleLowPriorityPrefetch(pne0Var);
        }
        Trace.setCounter("compose:lazy:schedule_prefetch:index", i);
        return pne0Var;
    }

    public c6y(tls tlsVar) {
        this();
        this.a = tlsVar;
    }
}
