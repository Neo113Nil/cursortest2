package xsna;

import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.bd20;
import xsna.hd20;
import xsna.oc20;

/* compiled from: MessageViewsFeature.kt */
/* loaded from: classes2.dex */
public final class ic20 extends di6<hd20, bd20, Object, oc20> {
    public final m990 h;
    public final io.reactivex.rxjava3.subjects.d<Integer> i;
    public boolean j;
    public int k;

    public ic20(int i, long j, mo8 mo8Var) {
        super(hd20.b.a);
        m990 m990Var = new m990(new g4u0(i, j, (xc20) mo8Var.b), new l370());
        this.h = m990Var;
        this.i = io.reactivex.rxjava3.subjects.d.O0(0);
        this.j = true;
        io.reactivex.rxjava3.core.q state = m990Var.getState();
        asu0 asu0Var = asu0.a;
        this.b.b(state.r0(asu0Var.c()).subscribe(new v8(this, 28), new lz(new cww(this, 9), 21)));
        di6.k(this, io.reactivex.rxjava3.core.a.s(64L, TimeUnit.MILLISECONDS, asu0Var.d()), null, new ph8(this, 3), 1);
    }

    @Override // xsna.di6
    public final void d(bd20 bd20Var) {
        bd20 bd20Var2 = bd20Var;
        if (bd20Var2 instanceof bd20.c) {
            m(new oc20.b(((bd20.c) bd20Var2).b));
            return;
        }
        if (bd20Var2 instanceof bd20.a) {
            m(oc20.a.a);
            return;
        }
        if (bd20Var2 instanceof bd20.b) {
            this.i.onNext(Integer.valueOf(((bd20.b) bd20Var2).b));
        } else {
            if (!(bd20Var2 instanceof bd20.d)) {
                throw new NoWhenBranchMatchedException();
            }
            q(new f1s(8));
            di6.k(this, io.reactivex.rxjava3.core.a.r(500L, TimeUnit.MILLISECONDS), null, new hgb(this, 1), 1);
        }
    }
}
