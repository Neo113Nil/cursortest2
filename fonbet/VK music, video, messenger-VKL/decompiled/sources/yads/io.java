package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.l96;

/* loaded from: classes10.dex */
public final class io implements kd1 {
    public final Context a;
    public final si1 b;
    public final ni1 c;
    public final jd1 d;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public w00 f;

    public io(Context context, si1 si1Var, ni1 ni1Var, jd1 jd1Var) {
        this.a = context;
        this.b = si1Var;
        this.c = ni1Var;
        this.d = jd1Var;
    }

    @Override // yads.kd1
    public final void a(g9 g9Var) {
        this.b.a();
        if (this.f == null) {
            oc1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.c.a(new l96(6, this, g9Var));
    }

    public static final void a(io ioVar, g9 g9Var) {
        id1 a = ioVar.d.a(ioVar.a, ioVar, g9Var, null);
        ioVar.e.add(a);
        String str = g9Var.a;
        a.c.a(str);
        a.F.f = str;
        a.a(ioVar.f);
        a.b(g9Var);
    }

    @Override // yads.r5
    public final void a(gy0 gy0Var) {
        id1 id1Var = (id1) gy0Var;
        if (this.f == null) {
            oc1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        id1Var.a((w00) null);
        this.e.remove(id1Var);
    }

    @Override // yads.kd1
    public final void a(gu3 gu3Var) {
        this.b.a();
        this.f = gu3Var;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((id1) it.next()).a((w00) gu3Var);
        }
    }
}
