package yads;

import android.content.Context;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.qe9;

/* loaded from: classes10.dex */
public final class ts implements cs2 {
    public final Context a;
    public final si1 b;
    public final ni1 c;
    public final bs2 d;
    public final us2 e;
    public final jj2 f;
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public q10 h;

    public ts(Context context, si1 si1Var, ni1 ni1Var, bs2 bs2Var, us2 us2Var, jj2 jj2Var) {
        this.a = context;
        this.b = si1Var;
        this.c = ni1Var;
        this.d = bs2Var;
        this.e = us2Var;
        this.f = jj2Var;
    }

    @Override // yads.cs2
    public final void a(g9 g9Var) {
        this.b.a();
        if (this.h == null) {
            oc1.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.c.a(new qe9(10, this, g9Var));
    }

    public final void b(g9 g9Var) {
        this.c.a(new xsna.cc3(9, this, g9Var));
    }

    public static final void b(ts tsVar, g9 g9Var) {
        boolean b;
        tsVar.f.getClass();
        if (jj2.a(g9Var)) {
            us2 us2Var = tsVar.e;
            synchronized (us2Var) {
                b = us2Var.a.b();
            }
            if (b) {
                tsVar.a(g9Var, new qs(tsVar, g9Var), "render");
            }
        }
    }

    public final void a(g9 g9Var, q10 q10Var, String str) {
        g9 a = g9.a(g9Var, null, str, 2047);
        as2 a2 = this.d.a(this.a, this, a, new ss(this, a));
        this.g.add(a2);
        String str2 = a.a;
        a2.c.a(str2);
        a2.F.d = str2;
        a2.a(q10Var);
        a2.b(a);
    }

    public static final void a(ts tsVar, g9 g9Var) {
        es2 es2Var;
        tsVar.f.getClass();
        if (jj2.a(g9Var)) {
            us2 us2Var = tsVar.e;
            synchronized (us2Var) {
                lj2 lj2Var = us2Var.a;
                us2Var.b.getClass();
                es2Var = (es2) lj2Var.a(py0.a(g9Var));
            }
            if (es2Var != null) {
                q10 q10Var = tsVar.h;
                if (q10Var != null) {
                    q10Var.a(es2Var);
                    return;
                }
                return;
            }
            tsVar.a(g9Var, new rs(tsVar), BuildConfig.FLAVOR);
            return;
        }
        tsVar.a(g9Var, new rs(tsVar), BuildConfig.FLAVOR);
    }

    @Override // yads.r5
    public final void a(gy0 gy0Var) {
        as2 as2Var = (as2) gy0Var;
        if (this.h == null) {
            oc1.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        as2Var.a((q10) null);
        this.g.remove(as2Var);
    }

    @Override // yads.cs2
    public final void a(lv3 lv3Var) {
        this.b.a();
        this.h = lv3Var;
    }
}
