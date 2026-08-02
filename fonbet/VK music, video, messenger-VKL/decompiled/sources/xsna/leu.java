package xsna;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.WorkInfo;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: GreedyScheduler.java */
/* loaded from: classes.dex */
public final class leu implements z7h0, j380, e3q {
    public final Context b;
    public final ftl d;
    public boolean e;
    public final ohd0 h;
    public final zvx0 i;
    public final androidx.work.a j;
    public Boolean l;
    public final WorkConstraintsTracker m;
    public final r5o0 n;
    public final sto0 o;
    public final HashMap c = new HashMap();
    public final Object f = new Object();
    public final dpn0 g = new dpn0(new uqk0());
    public final HashMap k = new HashMap();

    /* compiled from: GreedyScheduler.java */
    public static class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    static {
        m100.d("GreedyScheduler");
    }

    public leu(@NonNull Context context, @NonNull androidx.work.a aVar, @NonNull uhp0 uhp0Var, @NonNull ohd0 ohd0Var, @NonNull zvx0 zvx0Var, @NonNull r5o0 r5o0Var) {
        this.b = context;
        rll rllVar = aVar.g;
        this.d = new ftl(this, rllVar, aVar.d);
        this.o = new sto0(rllVar, zvx0Var);
        this.n = r5o0Var;
        this.m = new WorkConstraintsTracker(uhp0Var);
        this.j = aVar;
        this.h = ohd0Var;
        this.i = zvx0Var;
    }

    @Override // xsna.j380
    public final void a(@NonNull fxx0 fxx0Var, @NonNull androidx.work.impl.constraints.a aVar) {
        svx0 c = bdl.c(fxx0Var);
        boolean z = aVar instanceof a.C0094a;
        zvx0 zvx0Var = this.i;
        sto0 sto0Var = this.o;
        dpn0 dpn0Var = this.g;
        if (z) {
            if (dpn0Var.a(c)) {
                return;
            }
            m100 c2 = m100.c();
            c.toString();
            c2.getClass();
            tqk0 d = dpn0Var.d(c);
            sto0Var.b(d);
            zvx0Var.c(d, null);
            return;
        }
        m100 c3 = m100.c();
        c.toString();
        c3.getClass();
        tqk0 c4 = dpn0Var.c(c);
        if (c4 != null) {
            sto0Var.a(c4);
            zvx0Var.b(c4, ((a.b) aVar).a);
        }
    }

    @Override // xsna.e3q
    public final void b(@NonNull svx0 svx0Var, boolean z) {
        eyx eyxVar;
        tqk0 c = this.g.c(svx0Var);
        if (c != null) {
            this.o.a(c);
        }
        synchronized (this.f) {
            eyxVar = (eyx) this.c.remove(svx0Var);
        }
        if (eyxVar != null) {
            m100 c2 = m100.c();
            Objects.toString(svx0Var);
            c2.getClass();
            eyxVar.b(null);
        }
        if (z) {
            return;
        }
        synchronized (this.f) {
            this.k.remove(svx0Var);
        }
    }

    @Override // xsna.z7h0
    public final boolean c() {
        return false;
    }

    @Override // xsna.z7h0
    public final void d(@NonNull String str) {
        Runnable runnable;
        if (this.l == null) {
            int i = bhd0.a;
            this.l = Boolean.valueOf(Application.getProcessName().equals(this.b.getApplicationInfo().processName));
        }
        if (!this.l.booleanValue()) {
            m100.c().getClass();
            return;
        }
        if (!this.e) {
            this.h.a(this);
            this.e = true;
        }
        m100.c().getClass();
        ftl ftlVar = this.d;
        if (ftlVar != null && (runnable = (Runnable) ftlVar.d.remove(str)) != null) {
            ftlVar.b.a(runnable);
        }
        for (tqk0 tqk0Var : this.g.b(str)) {
            this.o.a(tqk0Var);
            this.i.a(tqk0Var);
        }
    }

    @Override // xsna.z7h0
    public final void e(@NonNull fxx0... fxx0VarArr) {
        long max;
        if (this.l == null) {
            Context context = this.b;
            int i = bhd0.a;
            this.l = Boolean.valueOf(Application.getProcessName().equals(context.getApplicationInfo().processName));
        }
        if (!this.l.booleanValue()) {
            m100.c().getClass();
            return;
        }
        if (!this.e) {
            this.h.a(this);
            this.e = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (fxx0 fxx0Var : fxx0VarArr) {
            if (!this.g.a(bdl.c(fxx0Var))) {
                synchronized (this.f) {
                    try {
                        svx0 c = bdl.c(fxx0Var);
                        a aVar = (a) this.k.get(c);
                        if (aVar == null) {
                            int i2 = fxx0Var.k;
                            this.j.d.getClass();
                            aVar = new a(i2, System.currentTimeMillis());
                            this.k.put(c, aVar);
                        }
                        max = (Math.max((fxx0Var.k - aVar.a) - 5, 0) * ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) + aVar.b;
                    } finally {
                    }
                }
                long max2 = Math.max(fxx0Var.a(), max);
                this.j.d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (fxx0Var.b == WorkInfo.State.ENQUEUED) {
                    if (currentTimeMillis < max2) {
                        ftl ftlVar = this.d;
                        if (ftlVar != null) {
                            rll rllVar = ftlVar.b;
                            HashMap hashMap = ftlVar.d;
                            Runnable runnable = (Runnable) hashMap.remove(fxx0Var.a);
                            if (runnable != null) {
                                rllVar.a(runnable);
                            }
                            etl etlVar = new etl(ftlVar, fxx0Var);
                            hashMap.put(fxx0Var.a, etlVar);
                            rllVar.b(max2 - ftlVar.c.d(), etlVar);
                        }
                    } else if (fxx0Var.c()) {
                        p6j p6jVar = fxx0Var.j;
                        if (p6jVar.d) {
                            m100 c2 = m100.c();
                            fxx0Var.toString();
                            c2.getClass();
                        } else if (p6jVar.b()) {
                            m100 c3 = m100.c();
                            fxx0Var.toString();
                            c3.getClass();
                        } else {
                            hashSet.add(fxx0Var);
                            hashSet2.add(fxx0Var.a);
                        }
                    } else if (!this.g.a(bdl.c(fxx0Var))) {
                        m100.c().getClass();
                        tqk0 d = this.g.d(bdl.c(fxx0Var));
                        this.o.b(d);
                        this.i.c(d, null);
                    }
                }
            }
        }
        synchronized (this.f) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(StringUtils.COMMA, hashSet2);
                    m100.c().getClass();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        fxx0 fxx0Var2 = (fxx0) it.next();
                        svx0 c4 = bdl.c(fxx0Var2);
                        if (!this.c.containsKey(c4)) {
                            this.c.put(c4, wux0.a(this.m, fxx0Var2, this.n.a(), this));
                        }
                    }
                }
            } finally {
            }
        }
    }
}
