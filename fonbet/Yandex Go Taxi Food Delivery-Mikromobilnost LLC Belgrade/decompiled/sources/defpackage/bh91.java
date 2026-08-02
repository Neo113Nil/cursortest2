package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class bh91 extends hr91 {
    public final w53 c;
    public final w53 w;
    public long x;

    public bh91(g gVar) {
        super(gVar);
        this.w = new w53();
        this.c = new w53();
    }

    public final void Hg(long j, String str) {
        g gVar = (g) this.b;
        if (str == null || str.length() == 0) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.a("Ad unit id must be a non-empty string");
        } else {
            aaa1 aaa1Var = gVar.z;
            g.g(aaa1Var);
            aaa1Var.Pg(new i391(this, str, j, 0));
        }
    }

    public final void Ig(long j, String str) {
        g gVar = (g) this.b;
        if (str == null || str.length() == 0) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.a("Ad unit id must be a non-empty string");
        } else {
            aaa1 aaa1Var = gVar.z;
            g.g(aaa1Var);
            aaa1Var.Pg(new i391(this, str, j, 1));
        }
    }

    public final void Jg(long j) {
        jya1 jya1Var = ((g) this.b).E;
        g.f(jya1Var);
        qwa1 Mg = jya1Var.Mg(false);
        w53 w53Var = this.c;
        Iterator it = ((s53) w53Var.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Lg(str, j - ((Long) w53Var.get(str)).longValue(), Mg);
        }
        if (!w53Var.isEmpty()) {
            Kg(j - this.x, Mg);
        }
        Mg(j);
    }

    public final void Kg(long j, qwa1 qwa1Var) {
        g gVar = (g) this.b;
        if (qwa1Var == null) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.H.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.H.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            ieb1.wh(qwa1Var, bundle, true);
            j jVar = gVar.F;
            g.f(jVar);
            jVar.Ng("am", "_xa", bundle);
        }
    }

    public final void Lg(String str, long j, qwa1 qwa1Var) {
        g gVar = (g) this.b;
        if (qwa1Var == null) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.H.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                y1a1 y1a1Var2 = gVar.y;
                g.g(y1a1Var2);
                y1a1Var2.H.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            ieb1.wh(qwa1Var, bundle, true);
            j jVar = gVar.F;
            g.f(jVar);
            jVar.Ng("am", "_xu", bundle);
        }
    }

    public final void Mg(long j) {
        w53 w53Var = this.c;
        Iterator it = ((s53) w53Var.keySet()).iterator();
        while (it.hasNext()) {
            w53Var.put((String) it.next(), Long.valueOf(j));
        }
        if (w53Var.isEmpty()) {
            return;
        }
        this.x = j;
    }
}
