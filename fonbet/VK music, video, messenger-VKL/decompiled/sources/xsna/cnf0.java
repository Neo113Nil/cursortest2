package xsna;

import android.app.Application;
import com.vk.reefton.Reef;
import com.vk.reefton.dto.ReefHeartbeatType;
import com.vk.reefton.trackers.a;
import com.vk.reefton.trackers.b;
import com.vk.reefton.trackers.c;
import com.vk.reefton.trackers.d;
import com.vk.reefton.trackers.e;
import com.vk.reefton.trackers.f;
import com.vk.reefton.trackers.g;
import com.vk.reefton.trackers.h;
import com.vk.reefton.trackers.i;
import com.vk.reefton.trackers.k;
import com.vk.reefton.trackers.l;
import com.vk.reefton.trackers.m;
import com.vk.reefton.trackers.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import xsna.lnf0;
import xsna.snf0;
import xsna.wmf0;

/* compiled from: ReefBuilder.kt */
/* loaded from: classes5.dex */
public final class cnf0 {
    public final qof0 a;
    public boolean b;
    public final Set<l.a> c = izi0.i(new b.a(), new c.d(), new e.a(), new g.a(), new h.a(), new i.a(), new k.a(), new m.a(), new n.a());
    public final Set<snf0.a> d = izi0.i(new wmf0.a(), new lnf0.a());
    public gzs<? extends fnf0> e;
    public gzs<? extends Executor> f;
    public gzs<? extends Executor> g;
    public gzs<? extends aof0> h;
    public gzs<? extends bof0> i;
    public gzs<? extends xnf0> j;
    public gzs<? extends unf0> k;
    public gzs<? extends nnf0> l;
    public gzs<? extends iof0> m;

    public cnf0(Application application) {
        this.a = new qof0(application);
    }

    public final Reef a() {
        gzs<? extends fnf0> gzsVar = this.e;
        qof0 qof0Var = this.a;
        if (gzsVar != null) {
            qof0Var.c = gzsVar;
        }
        gzs<? extends Executor> gzsVar2 = this.f;
        if (gzsVar2 != null) {
            qof0Var.e = new rs40(1, gzsVar2);
        }
        if (this.g != null) {
            qof0Var.getClass();
        }
        gzs<? extends aof0> gzsVar3 = this.h;
        if (gzsVar3 != null) {
            qof0Var.g = gzsVar3;
        }
        gzs<? extends bof0> gzsVar4 = this.i;
        if (gzsVar4 != null) {
            qof0Var.i = gzsVar4;
        }
        gzs<? extends xnf0> gzsVar5 = this.j;
        if (gzsVar5 != null) {
            qof0Var.k = gzsVar5;
        }
        gzs<? extends unf0> gzsVar6 = this.k;
        if (gzsVar6 != null) {
            qof0Var.m = gzsVar6;
        }
        gzs<? extends nnf0> gzsVar7 = this.l;
        if (gzsVar7 != null) {
            qof0Var.o = gzsVar7;
        }
        gzs<? extends iof0> gzsVar8 = this.m;
        if (gzsVar8 != null) {
            qof0Var.q = gzsVar8;
        }
        xmf0 xmf0Var = new xmf0(this.b);
        Set<l.a> set = this.c;
        ArrayList arrayList = new ArrayList(c5g.u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((l.a) it.next()).a(qof0Var));
        }
        Set<snf0.a> set2 = this.d;
        ArrayList arrayList2 = new ArrayList(c5g.u(set2, 10));
        Iterator<T> it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((snf0.a) it2.next()).a(qof0Var));
        }
        return new Reef(xmf0Var, arrayList2, arrayList, qof0Var);
    }

    public final void b() {
        this.c.add(new a.C1758a());
    }

    public final void c(gzs gzsVar) {
        this.e = gzsVar;
    }

    public final void d(gzs gzsVar) {
        this.f = gzsVar;
    }

    public final void e(gzs gzsVar) {
        this.l = gzsVar;
    }

    public final void f(ReefHeartbeatType reefHeartbeatType, Long l, TimeUnit timeUnit) {
        d.a aVar = new d.a(reefHeartbeatType);
        if (l != null) {
            aVar.b = l.longValue();
        }
        if (timeUnit != null) {
            aVar.c = timeUnit;
        }
        this.c.add(aVar);
    }

    public final void g() {
        this.c.add(new f.a());
    }

    public final void h(gzs gzsVar) {
        this.k = gzsVar;
    }

    public final void i(gzs gzsVar) {
        this.j = gzsVar;
    }

    public final void j(gzs gzsVar) {
        this.h = gzsVar;
    }

    public final void k(gzs gzsVar) {
        this.i = gzsVar;
    }

    public final void l(gzs gzsVar) {
        this.g = gzsVar;
    }

    public final void m(gzs gzsVar) {
        this.m = gzsVar;
    }
}
