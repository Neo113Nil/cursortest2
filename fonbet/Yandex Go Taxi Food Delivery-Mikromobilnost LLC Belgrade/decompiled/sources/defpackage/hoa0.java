package defpackage;

import com.yandex.go.places.impl.ui.payments.result.a;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public final class hoa0 extends h75 {
    public final dac0 A;
    public final w2h B;
    public final oep0 C;
    public final wbc0 D;
    public boolean E;
    public final goa0 F;
    public final i3y G;
    public final i3y H;
    public final yj70 x;
    public final y7c0 y;
    public final jsj z;

    public hoa0(String str, yj70 yj70Var, y7c0 y7c0Var, jsj jsjVar, dac0 dac0Var, w2h w2hVar, oep0 oep0Var, wbc0 wbc0Var) {
        super(eoa0.class);
        this.x = yj70Var;
        this.y = y7c0Var;
        this.z = jsjVar;
        this.A = dac0Var;
        this.B = w2hVar;
        this.C = oep0Var;
        this.D = wbc0Var;
        final int i = 1;
        this.E = true;
        this.F = new goa0(this, str);
        final int i2 = 0;
        sls slsVar = new sls(this) { // from class: foa0
            public final /* synthetic */ hoa0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                hoa0 hoa0Var = this.b;
                switch (i3) {
                    case 0:
                        return new w4c(new aq80(hoa0Var));
                    default:
                        dac0 dac0Var2 = hoa0Var.A;
                        y7c0 y7c0Var2 = hoa0Var.y;
                        jsj jsjVar2 = hoa0Var.z;
                        xsj xsjVar = new xsj(hoa0Var, 6);
                        a aVar = new a(hoa0Var);
                        goa0 goa0Var = hoa0Var.F;
                        c8c0 c8c0Var = new c8c0(true);
                        return dac0.a(dac0Var2, y7c0Var2, goa0Var, jsjVar2, Collections.singleton((w4c) hoa0Var.G.getValue()), xsjVar, aVar, c8c0Var, EmptySet.a, hoa0Var.D.a().a(), null, HProv.ALG_TYPE_GR3410);
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        this.H = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: foa0
            public final /* synthetic */ hoa0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                hoa0 hoa0Var = this.b;
                switch (i3) {
                    case 0:
                        return new w4c(new aq80(hoa0Var));
                    default:
                        dac0 dac0Var2 = hoa0Var.A;
                        y7c0 y7c0Var2 = hoa0Var.y;
                        jsj jsjVar2 = hoa0Var.z;
                        xsj xsjVar = new xsj(hoa0Var, 6);
                        a aVar = new a(hoa0Var);
                        goa0 goa0Var = hoa0Var.F;
                        c8c0 c8c0Var = new c8c0(true);
                        return dac0.a(dac0Var2, y7c0Var2, goa0Var, jsjVar2, Collections.singleton((w4c) hoa0Var.G.getValue()), xsjVar, aVar, c8c0Var, EmptySet.a, hoa0Var.D.a().a(), null, HProv.ALG_TYPE_GR3410);
                }
            }
        });
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        ((c9c0) this.H.getValue()).i();
        super.Cg();
    }
}
