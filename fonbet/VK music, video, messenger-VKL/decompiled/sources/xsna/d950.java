package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.money.subscription.MusicSubscriptionControlFragment;
import xsna.t550;

/* compiled from: MusicSubscriptionDetailsAdapter.kt */
/* loaded from: classes3.dex */
public final class d950 extends d920 implements mf7 {
    public static final Object s = new Object();
    public final boolean i;
    public final oge0 j;
    public final t550.a k;
    public final t550.a l;
    public final t550.a m;
    public final t550.a n;
    public final t550.a o;
    public final t550.a p;
    public final m250 q;
    public final t550.a r;

    public d950(boolean z, oge0 oge0Var, MusicSubscriptionControlFragment.c cVar, obh obhVar) {
        this.i = z;
        this.j = oge0Var;
        t550.a aVar = new t550.a("null", new zos(10));
        this.k = aVar;
        t550.a aVar2 = new t550.a("null", new z410(7));
        this.l = aVar2;
        t550.a aVar3 = new t550.a("null", new pey(8));
        this.m = aVar3;
        t550.a aVar4 = new t550.a("null", new g86(14, this, cVar));
        this.n = aVar4;
        t550.a aVar5 = new t550.a("null", new qey(14));
        this.o = aVar5;
        t550.a aVar6 = new t550.a("null", new x2y(obhVar, 20));
        this.p = aVar6;
        m250 m250Var = new m250();
        this.q = m250Var;
        t550.a aVar7 = new t550.a("null", new jr3(27));
        this.r = aVar7;
        x0(aVar6);
        x0(aVar);
        x0(aVar3);
        x0(aVar2);
        x0(aVar5);
        x0(aVar4);
        x0(m250Var);
        x0(aVar7);
    }

    public final void C0(boolean z) {
        this.q.x0(z ? s : null);
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        boolean f = epx.f(z0(i), this.k);
        int i2 = 4;
        t550.a aVar = this.m;
        if (!f || epx.f(aVar.c, null)) {
            if (!epx.f(z0(i), aVar) || epx.f(aVar.c, null)) {
                boolean f2 = epx.f(z0(i), this.l);
                t550.a aVar2 = this.o;
                if (!f2 || epx.f(aVar2.c, null)) {
                    if (epx.f(z0(i), aVar2)) {
                        i2 = 6;
                    } else {
                        RecyclerView.Adapter z0 = z0(i);
                        t550.a aVar3 = this.n;
                        if (!epx.f(z0, aVar3) || epx.f(aVar3.c, null)) {
                            RecyclerView.Adapter z02 = z0(i);
                            t550.a aVar4 = this.r;
                            i2 = (!epx.f(z02, aVar4) || epx.f(aVar4.c, null)) ? 1 : 64;
                        }
                    }
                }
            } else {
                i2 = 2;
            }
        }
        return (!this.i || (i2 & 1) == 0) ? i2 : i2 | 1;
    }
}
