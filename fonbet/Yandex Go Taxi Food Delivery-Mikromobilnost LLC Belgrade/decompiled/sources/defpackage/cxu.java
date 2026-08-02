package defpackage;

import android.content.Context;
import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ru.yandex.taxi.address.design.SourceDestinationComponent;

/* loaded from: classes14.dex */
public abstract class cxu {
    public static final void a(rzu rzuVar, f530 f530Var, sls slsVar, sls slsVar2, boolean z, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-191513139);
        int i2 = i | (btsVar.k(rzuVar) ? 4 : 2) | 48 | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(slsVar2) ? 2048 : 1024) | (btsVar.a(z) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                SourceDestinationComponent sourceDestinationComponent = new SourceDestinationComponent(context, null, 0, 6, null);
                sourceDestinationComponent.setSourceDestinationListener(new bxu(slsVar, slsVar2));
                btsVar.o0(sourceDestinationComponent);
                Q = sourceDestinationComponent;
            }
            c530 c530Var = c530.a;
            g.e(z, c530Var, k.d(sb2.G(1.0f, 1500.0f, 4, null), null, 12), k.l(sb2.G(1.0f, 1500.0f, 4, null), null, 12), null, wwg.S(2006668453, true, new nfj(15, (SourceDestinationComponent) Q, rzuVar), btsVar), btsVar, ((i2 >> 12) & 14) | 200112, 16);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(rzuVar, f530Var2, slsVar, slsVar2, z, i);
        }
    }
}
