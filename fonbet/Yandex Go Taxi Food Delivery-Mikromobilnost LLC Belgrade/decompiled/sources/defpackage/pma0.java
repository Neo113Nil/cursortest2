package defpackage;

import com.yandex.go.places.impl.ui.payments.checkout.a;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public final class pma0 extends h75 {
    public final jsj A;
    public final dac0 B;
    public final lcc0 C;
    public final mcc0 D;
    public final oep0 E;
    public final jio F;
    public final wbc0 G;
    public pzt0 H;
    public boolean I;
    public final f470 J;
    public final i3y K;
    public final i3y L;
    public final String x;
    public final y7c0 y;
    public final aq80 z;

    public pma0(String str, y7c0 y7c0Var, aq80 aq80Var, jsj jsjVar, dac0 dac0Var, lcc0 lcc0Var, mcc0 mcc0Var, oep0 oep0Var, jio jioVar, wbc0 wbc0Var) {
        super(nma0.class);
        this.x = str;
        this.y = y7c0Var;
        this.z = aq80Var;
        this.A = jsjVar;
        this.B = dac0Var;
        this.C = lcc0Var;
        this.D = mcc0Var;
        this.E = oep0Var;
        this.F = jioVar;
        this.G = wbc0Var;
        final int i = 1;
        this.I = true;
        this.J = new f470(2, this);
        final int i2 = 0;
        sls slsVar = new sls(this) { // from class: oma0
            public final /* synthetic */ pma0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                pma0 pma0Var = this.b;
                switch (i3) {
                    case 0:
                        return new w4c(new nw70(13, pma0Var));
                    default:
                        dac0 dac0Var2 = pma0Var.B;
                        y7c0 y7c0Var2 = pma0Var.y;
                        jsj jsjVar2 = pma0Var.A;
                        xsj xsjVar = new xsj(pma0Var, 5);
                        a aVar = new a(pma0Var);
                        f470 f470Var = pma0Var.J;
                        c8c0 c8c0Var = new c8c0(true);
                        return dac0.a(dac0Var2, y7c0Var2, f470Var, jsjVar2, Collections.singleton((w4c) pma0Var.K.getValue()), xsjVar, aVar, c8c0Var, EmptySet.a, pma0Var.G.a().a(), null, HProv.ALG_TYPE_GR3410);
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.K = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        this.L = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: oma0
            public final /* synthetic */ pma0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                pma0 pma0Var = this.b;
                switch (i3) {
                    case 0:
                        return new w4c(new nw70(13, pma0Var));
                    default:
                        dac0 dac0Var2 = pma0Var.B;
                        y7c0 y7c0Var2 = pma0Var.y;
                        jsj jsjVar2 = pma0Var.A;
                        xsj xsjVar = new xsj(pma0Var, 5);
                        a aVar = new a(pma0Var);
                        f470 f470Var = pma0Var.J;
                        c8c0 c8c0Var = new c8c0(true);
                        return dac0.a(dac0Var2, y7c0Var2, f470Var, jsjVar2, Collections.singleton((w4c) pma0Var.K.getValue()), xsjVar, aVar, c8c0Var, EmptySet.a, pma0Var.G.a().a(), null, HProv.ALG_TYPE_GR3410);
                }
            }
        });
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.H = null;
        ((c9c0) this.L.getValue()).i();
    }
}
