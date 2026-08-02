package yads;

import android.content.Context;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.qe9;
import xsna.wv4;

/* loaded from: classes10.dex */
public final class ps implements kd1 {
    public final Context a;
    public final si1 b;
    public final ni1 c;
    public final jd1 d;
    public final td1 e;
    public final jj2 f;
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public w00 h;

    public ps(Context context, si1 si1Var, ni1 ni1Var, jd1 jd1Var, td1 td1Var, jj2 jj2Var) {
        this.a = context;
        this.b = si1Var;
        this.c = ni1Var;
        this.d = jd1Var;
        this.e = td1Var;
        this.f = jj2Var;
    }

    @Override // yads.kd1
    public final void a(g9 g9Var) {
        this.b.a();
        if (this.h == null) {
            oc1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.c.a(new wv4(13, this, g9Var));
    }

    public final void b(g9 g9Var) {
        this.c.a(new qe9(9, this, g9Var));
    }

    public static final void b(ps psVar, g9 g9Var) {
        boolean b;
        psVar.f.getClass();
        if (jj2.a(g9Var)) {
            td1 td1Var = psVar.e;
            synchronized (td1Var) {
                b = td1Var.a.b();
            }
            if (b) {
                psVar.a(g9Var, new ns(psVar, g9Var), "render");
            }
        }
    }

    public final void a(g9 g9Var, w00 w00Var, String str) {
        g9 a = g9.a(g9Var, null, str, 2047);
        id1 a2 = this.d.a(this.a, this, a, new ms(this, a));
        this.g.add(a2);
        String str2 = a.a;
        a2.c.a(str2);
        a2.F.f = str2;
        a2.a(w00Var);
        a2.b(a);
    }

    public static final void a(ps psVar, g9 g9Var) {
        md1 md1Var;
        psVar.f.getClass();
        if (jj2.a(g9Var)) {
            td1 td1Var = psVar.e;
            synchronized (td1Var) {
                lj2 lj2Var = td1Var.a;
                td1Var.b.getClass();
                md1Var = (md1) lj2Var.a(py0.a(g9Var));
            }
            if (md1Var != null) {
                w00 w00Var = psVar.h;
                if (w00Var != null) {
                    w00Var.a(md1Var);
                    return;
                }
                return;
            }
            psVar.a(g9Var, new os(psVar), BuildConfig.FLAVOR);
            return;
        }
        psVar.a(g9Var, new os(psVar), BuildConfig.FLAVOR);
    }

    @Override // yads.r5
    public final void a(gy0 gy0Var) {
        id1 id1Var = (id1) gy0Var;
        if (this.h == null) {
            oc1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        id1Var.a((w00) null);
        this.g.remove(id1Var);
    }

    @Override // yads.kd1
    public final void a(gu3 gu3Var) {
        this.b.a();
        this.h = gu3Var;
    }
}
