package xsna;

import androidx.compose.ui.node.LayoutNode;
import xsna.ala0;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes18.dex */
public final class bla0 implements zzs<cry, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wow b;
    public final /* synthetic */ ala0 c;

    public bla0(wow wowVar, ala0 ala0Var) {
        this.b = wowVar;
        this.c = ala0Var;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(cry cryVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        cry cryVar2 = cryVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(cryVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1117249557, i, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
            }
            int intValue3 = ((Number) this.b.b.get(intValue)).intValue();
            aVar2.K(569839892);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(aVar2));
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, q630.a.a);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar3);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, d, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(aVar2, cri.a.h);
            k9q0.w(aVar2, c, cri.a.d);
            ala0 ala0Var = this.c;
            int i2 = ala0.e.$EnumSwitchMapping$0[((ala0.c) ((zak0) ala0Var.o).getValue()).ordinal()];
            if (i2 == 1) {
                aVar2.K(891239692);
                ala0Var.f(intValue3, 0, aVar2);
                aVar2.j();
            } else {
                if (i2 != 2) {
                    throw alb0.c(891237342, aVar2);
                }
                aVar2.K(891242063);
                ala0Var.b(intValue3, 0, aVar2);
                aVar2.j();
            }
            aVar2.G();
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
