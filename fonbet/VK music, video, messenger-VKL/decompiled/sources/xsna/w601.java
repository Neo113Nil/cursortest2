package xsna;

import android.os.Bundle;
import java.util.Iterator;
import xsna.zk3;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class w601 extends l801 {
    public final zk3 e;
    public final zk3 f;
    public long g;

    public w601(mb01 mb01Var) {
        super(mb01Var);
        this.f = new zk3();
        this.e = new zk3();
    }

    public final void l(long j, String str) {
        mb01 mb01Var = (mb01) this.b;
        if (str == null || str.length() == 0) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.a("Ad unit id must be a non-empty string");
        } else {
            kb01 kb01Var = mb01Var.k;
            mb01.k(kb01Var);
            kb01Var.s(new vsz0(this, str, j));
        }
    }

    public final void m(long j, String str) {
        mb01 mb01Var = (mb01) this.b;
        if (str == null || str.length() == 0) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.a("Ad unit id must be a non-empty string");
        } else {
            kb01 kb01Var = mb01Var.k;
            mb01.k(kb01Var);
            kb01Var.s(new m101(this, str, j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(long j) {
        kg01 kg01Var = ((mb01) this.b).p;
        mb01.j(kg01Var);
        dg01 q = kg01Var.q(false);
        zk3 zk3Var = this.e;
        Iterator it = ((zk3.c) zk3Var.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            p(str, j - ((Long) zk3Var.get(str)).longValue(), q);
        }
        if (!zk3Var.isEmpty()) {
            o(j - this.g, q);
        }
        q(j);
    }

    public final void o(long j, dg01 dg01Var) {
        mb01 mb01Var = (mb01) this.b;
        if (dg01Var == null) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.q.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.q.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            sk01.w(dg01Var, bundle, true);
            bf01 bf01Var = mb01Var.q;
            mb01.j(bf01Var);
            bf01Var.r("am", "_xa", bundle);
        }
    }

    public final void p(String str, long j, dg01 dg01Var) {
        mb01 mb01Var = (mb01) this.b;
        if (dg01Var == null) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.q.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                k901 k901Var2 = mb01Var.j;
                mb01.k(k901Var2);
                k901Var2.q.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            sk01.w(dg01Var, bundle, true);
            bf01 bf01Var = mb01Var.q;
            mb01.j(bf01Var);
            bf01Var.r("am", "_xu", bundle);
        }
    }

    public final void q(long j) {
        zk3 zk3Var = this.e;
        Iterator it = ((zk3.c) zk3Var.keySet()).iterator();
        while (it.hasNext()) {
            zk3Var.put((String) it.next(), Long.valueOf(j));
        }
        if (zk3Var.isEmpty()) {
            return;
        }
        this.g = j;
    }
}
