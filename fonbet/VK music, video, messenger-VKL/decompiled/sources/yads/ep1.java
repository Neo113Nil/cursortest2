package yads;

import android.content.Context;
import java.util.Map;
import kotlin.Pair;
import xsna.jgp;
import xsna.myc0;
import xsna.on00;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class ep1 {
    public final d4 a;
    public final ov2 b;
    public final w5 c;
    public final mp1 d;
    public final yp1 e;
    public final fp1 f;
    public final tc2 g;
    public final tp1 h;
    public dp1 i;

    public /* synthetic */ ep1(d4 d4Var, ov2 ov2Var, w5 w5Var, mp1 mp1Var, yp1 yp1Var, fp1 fp1Var, tc2 tc2Var) {
        this(d4Var, ov2Var, w5Var, mp1Var, yp1Var, fp1Var, tc2Var, new tp1());
    }

    public final void a() {
        rr1 rr1Var;
        dp1 dp1Var = this.i;
        this.c.a(v5.c, new ac(ep2.d, (dp1Var == null || (rr1Var = dp1Var.b) == null) ? null : rr1Var.b), null);
    }

    public ep1(d4 d4Var, ov2 ov2Var, w5 w5Var, mp1 mp1Var, yp1 yp1Var, fp1 fp1Var, tc2 tc2Var, tp1 tp1Var) {
        this.a = d4Var;
        this.b = ov2Var;
        this.c = w5Var;
        this.d = mp1Var;
        this.e = yp1Var;
        this.f = fp1Var;
        this.g = tc2Var;
        this.h = tp1Var;
    }

    public final void a(Context context) {
        dp1 dp1Var = this.i;
        if (dp1Var != null) {
            try {
                this.d.a(dp1Var.a);
            } catch (Throwable th) {
                rr1 rr1Var = dp1Var.b;
                String networkName = dp1Var.c.b().getNetworkName();
                Map f = on00.f(new Pair("reason", xsna.dt.b("exception_in_adapter", th.toString())));
                yp1 yp1Var = this.e;
                yp1Var.getClass();
                yp1Var.a(context, dp2.f, rr1Var, networkName, f);
            }
        }
    }

    public final void a(Context context, Object obj) {
        dp1 a = this.f.a(context);
        this.i = a;
        if (a != null) {
            d4 d4Var = this.a;
            d4Var.k = a.b;
            d4Var.l = a.c.b().getNetworkName();
            this.c.a(v5.c, null);
            rr1 rr1Var = a.b;
            String networkName = a.c.b().getNetworkName();
            yp1 yp1Var = this.e;
            yp1Var.getClass();
            yp1Var.a(context, dp2.g, rr1Var, networkName, jgp.b);
            try {
                mp1 mp1Var = this.d;
                com.monetization.ads.mediation.base.a aVar = a.a;
                Map a2 = a.d.a(context);
                fq1 fq1Var = a.d;
                rr1 rr1Var2 = a.b;
                fq1Var.getClass();
                mp1Var.a(context, aVar, obj, a2, rr1Var2.c);
                return;
            } catch (Throwable th) {
                Map f = on00.f(new Pair("reason", xsna.dt.b("exception_in_adapter", th.toString())));
                yp1 yp1Var2 = this.e;
                yp1Var2.getClass();
                yp1Var2.a(context, dp2.f, rr1Var, networkName, f);
                a();
                a(context, obj);
                return;
            }
        }
        tc2 tc2Var = this.g;
        mn2 mn2Var = tc2Var.b;
        qcy qcyVar = tc2.c[0];
        zn znVar = (zn) mn2Var.a.get();
        if (znVar == null || znVar.r == z5.b) {
            return;
        }
        uc2 uc2Var = tc2Var.a;
        znVar.a(z5.d);
        synchronized (znVar) {
            myc0.h(znVar.e, null, null, new qn(znVar, uc2Var, null), 3);
        }
    }
}
