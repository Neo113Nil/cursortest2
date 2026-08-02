package xsna;

import androidx.compose.runtime.a;
import java.util.List;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes2.dex */
public final class o1f0 implements zzs<cry, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ aia0 d;
    public final /* synthetic */ com.vk.im.reactions.impl.assets.a e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ izs g;

    public o1f0(List list, Integer num, aia0 aia0Var, com.vk.im.reactions.impl.assets.a aVar, boolean z, izs izsVar) {
        this.b = list;
        this.c = num;
        this.d = aia0Var;
        this.e = aVar;
        this.f = z;
        this.g = izsVar;
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
            yaw yawVar = (yaw) this.b.get(intValue);
            aVar2.K(1787570713);
            int i2 = yawVar.a;
            Integer num3 = this.c;
            boolean z = num3 != null && i2 == num3.intValue();
            aia0 aia0Var = this.d;
            float f = aia0Var.a;
            float f2 = aia0Var.f;
            boolean z2 = aia0Var.e;
            izs izsVar = this.g;
            boolean J = aVar2.J(izsVar) | aVar2.J(yawVar);
            Object x = aVar2.x();
            if (J || x == a.C0011a.a) {
                x = new m1f0(izsVar, yawVar);
                aVar2.R(x);
            }
            b1f0.a(yawVar, z, f, f2, this.e, this.f, z2, (gzs) x, aVar2, 0);
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
