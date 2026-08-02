package xsna;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import xsna.fxx0;

/* compiled from: WorkerUpdater.kt */
/* loaded from: classes12.dex */
public final class pyx0 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ String $name;
    final /* synthetic */ dwx0 $this_enqueueUniquelyNamedPeriodic;
    final /* synthetic */ androidx.work.e $workRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyx0(androidx.work.e eVar, String str, dwx0 dwx0Var) {
        super(0);
        this.$this_enqueueUniquelyNamedPeriodic = dwx0Var;
        this.$name = str;
        this.$workRequest = eVar;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        oyx0 oyx0Var = new oyx0(this.$workRequest, this.$name, this.$this_enqueueUniquelyNamedPeriodic);
        gxx0 D = this.$this_enqueueUniquelyNamedPeriodic.c.D();
        ArrayList A = D.A(this.$name);
        if (A.size() > 1) {
            throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
        fxx0.b bVar = (fxx0.b) j5g.a0(A);
        if (bVar == null) {
            oyx0Var.invoke();
        } else {
            String str = bVar.a;
            fxx0 j = D.j(str);
            if (j == null) {
                throw new IllegalStateException(i5s.a(t33.a("WorkSpec with ", str, ", that matches a name \""), this.$name, "\", wasn't found"));
            }
            if (!j.d()) {
                throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            }
            if (bVar.b == WorkInfo.State.CANCELLED) {
                D.delete(str);
                oyx0Var.invoke();
            } else {
                final fxx0 b = fxx0.b(this.$workRequest.b, bVar.a, null, null, null, 0, 0L, 0, 0, 0L, 0, 16777214);
                dwx0 dwx0Var = this.$this_enqueueUniquelyNamedPeriodic;
                ohd0 ohd0Var = dwx0Var.f;
                final WorkDatabase workDatabase = dwx0Var.c;
                androidx.work.a aVar = dwx0Var.b;
                final List<z7h0> list = dwx0Var.e;
                final Set<String> set = this.$workRequest.c;
                final String str2 = b.a;
                final fxx0 j2 = workDatabase.D().j(str2);
                if (j2 == null) {
                    throw new IllegalArgumentException(zr.a("Worker with ", str2, " doesn't exist"));
                }
                if (!j2.b.h()) {
                    if (j2.d() ^ b.d()) {
                        StringBuilder sb = new StringBuilder("Can't update ");
                        qyx0 qyx0Var = qyx0.i;
                        sb.append((String) qyx0Var.invoke(j2));
                        sb.append(" Worker to ");
                        throw new UnsupportedOperationException(i5s.a(sb, (String) qyx0Var.invoke(b), " Worker. Update operation must preserve worker's type."));
                    }
                    final boolean e = ohd0Var.e(str2);
                    if (!e) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            ((z7h0) it.next()).d(str2);
                        }
                    }
                    workDatabase.v(new Runnable() { // from class: xsna.nyx0
                        @Override // java.lang.Runnable
                        public final void run() {
                            WorkDatabase workDatabase2 = WorkDatabase.this;
                            gxx0 D2 = workDatabase2.D();
                            cyx0 E = workDatabase2.E();
                            fxx0 fxx0Var = j2;
                            WorkInfo.State state = fxx0Var.b;
                            int i = fxx0Var.k;
                            long j3 = fxx0Var.n;
                            int i2 = fxx0Var.t + 1;
                            int i3 = fxx0Var.s;
                            long j4 = fxx0Var.u;
                            int i4 = fxx0Var.v;
                            fxx0 fxx0Var2 = b;
                            fxx0 b2 = fxx0.b(fxx0Var2, null, state, null, null, i, j3, i3, i2, j4, i4, 12835837);
                            if (fxx0Var2.v == 1) {
                                b2.u = fxx0Var2.u;
                                b2.v++;
                            }
                            D2.z(omp.b(b2));
                            String str3 = str2;
                            E.a(str3);
                            E.b(str3, set);
                            if (e) {
                                return;
                            }
                            D2.u(-1L, str3);
                            workDatabase2.C().delete(str3);
                        }
                    });
                    if (!e) {
                        i8h0.b(aVar, workDatabase, list);
                    }
                }
            }
        }
        return s3q0.a;
    }
}
