package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.kgb;

/* loaded from: classes10.dex */
public final class so implements cs2 {
    public final Context a;
    public final si1 b;
    public final ni1 c;
    public final bs2 d;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public q10 f;

    public so(Context context, si1 si1Var, ni1 ni1Var, bs2 bs2Var) {
        this.a = context;
        this.b = si1Var;
        this.c = ni1Var;
        this.d = bs2Var;
    }

    @Override // yads.cs2
    public final void a(g9 g9Var) {
        this.b.a();
        if (this.f == null) {
            oc1.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.c.a(new kgb(10, this, g9Var));
    }

    public static final void a(so soVar, g9 g9Var) {
        as2 a = soVar.d.a(soVar.a, soVar, g9Var, null);
        soVar.e.add(a);
        String str = g9Var.a;
        a.c.a(str);
        a.F.d = str;
        a.a(soVar.f);
        a.b(g9Var);
    }

    @Override // yads.r5
    public final void a(gy0 gy0Var) {
        as2 as2Var = (as2) gy0Var;
        if (this.f == null) {
            oc1.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        as2Var.a((q10) null);
        this.e.remove(as2Var);
    }

    @Override // yads.cs2
    public final void a(lv3 lv3Var) {
        this.b.a();
        this.f = lv3Var;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((as2) it.next()).a((q10) lv3Var);
        }
    }
}
