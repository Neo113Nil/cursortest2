package defpackage;

import com.yandex.go.taxi.order.queue.interactor.l;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.a;

/* loaded from: classes14.dex */
public final class alg0 extends ad5 {
    public final i3y A;
    public String B;
    public tkg0 C;
    public pzt0 D;
    public final o2y0 x;
    public final ljg0 y;
    public final l z;

    public alg0(o2y0 o2y0Var, ljg0 ljg0Var, l lVar) {
        super(ekg0.class);
        this.x = o2y0Var;
        this.y = ljg0Var;
        this.z = lVar;
        this.A = a.b(LazyThreadSafetyMode.NONE, new hkg0(4));
        this.B = "";
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.y.b("QueueOverlay.Closed", new Pair[0]);
    }

    public final void Kg(tkg0 tkg0Var) {
        kkg0 kkg0Var;
        this.C = tkg0Var;
        ekg0 ekg0Var = (ekg0) Dg();
        if (tkg0Var == null || (kkg0Var = tkg0Var.b()) == null) {
            kkg0Var = jkg0.a;
        }
        ekg0Var.render(kkg0Var);
    }
}
