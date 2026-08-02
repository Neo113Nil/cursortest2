package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.csf0;
import defpackage.fa51;
import defpackage.gl7;
import defpackage.h2u0;
import defpackage.hgz;
import defpackage.n951;
import defpackage.r6f0;
import defpackage.r94;
import defpackage.r951;
import defpackage.sa51;
import defpackage.uh6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ r951 a;
    public final /* synthetic */ h2u0 b;
    public final /* synthetic */ WorkerParameters.a c;

    public /* synthetic */ a(r951 r951Var, h2u0 h2u0Var, WorkerParameters.a aVar) {
        this.a = r951Var;
        this.b = h2u0Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        r951 r951Var = this.a;
        h2u0 h2u0Var = this.b;
        WorkerParameters.a aVar = this.c;
        final r6f0 r6f0Var = r951Var.a;
        r6f0Var.getClass();
        n951 n951Var = h2u0Var.a;
        final String str = n951Var.a;
        final ArrayList arrayList = new ArrayList();
        fa51 fa51Var = (fa51) r6f0Var.e.P0(new csf0(14, new Callable() { // from class: q6f0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = r6f0.this.e;
                RoomDatabase roomDatabase = workDatabase.Y0().a;
                String str2 = str;
                arrayList.addAll((List) a.b(roomDatabase, true, false, new brd(str2, 25)));
                return workDatabase.X0().d(str2);
            }
        }));
        if (fa51Var == null) {
            hgz g = hgz.g();
            n951Var.toString();
            g.getClass();
            r6f0Var.e(n951Var);
            return;
        }
        synchronized (r6f0Var.k) {
            try {
                synchronized (r6f0Var.k) {
                    z = r6f0Var.c(str) != null;
                }
                if (z) {
                    Set set = (Set) r6f0Var.h.get(str);
                    if (((h2u0) set.iterator().next()).a.b == n951Var.b) {
                        set.add(h2u0Var);
                        hgz g2 = hgz.g();
                        n951Var.toString();
                        g2.getClass();
                    } else {
                        r6f0Var.e(n951Var);
                    }
                    return;
                }
                if (fa51Var.t != n951Var.b) {
                    r6f0Var.e(n951Var);
                    return;
                }
                sa51 sa51Var = new sa51(r6f0Var.b, r6f0Var.c, r6f0Var.d, r6f0Var, r6f0Var.e, fa51Var, arrayList);
                if (aVar != null) {
                    sa51Var.h = aVar;
                }
                d dVar = new d(sa51Var);
                gl7 G = uh6.G(dVar.e.b.plus(kotlinx.coroutines.a.a()), new WorkerWrapper$launch$1(dVar, null));
                G.b.c(new r94(10, r6f0Var, G, dVar), r6f0Var.d.d);
                r6f0Var.g.put(str, dVar);
                HashSet hashSet = new HashSet();
                hashSet.add(h2u0Var);
                r6f0Var.h.put(str, hashSet);
                hgz g3 = hgz.g();
                n951Var.toString();
                g3.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
