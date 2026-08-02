package xsna;

import androidx.compose.runtime.a;
import com.vk.design.demo.presentation.nav.ScreenKey;
import java.util.List;
import kotlin.Pair;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes18.dex */
public final class joj implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;

    public /* synthetic */ joj(int i, Object obj, List list) {
        this.b = i;
        this.c = list;
        this.d = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                Object obj5 = (cry) obj;
                int intValue = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Number) obj4).intValue();
                wh50 wh50Var = (wh50) this.d;
                if ((intValue2 & 6) == 0) {
                    i = (aVar.J(obj5) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1117249557, i, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
                    }
                    Pair pair = (Pair) this.c.get(intValue);
                    aVar.K(892132786);
                    String str = (String) pair.d();
                    dt1 dt1Var = (dt1) pair.g();
                    boolean f = epx.f((dt1) wh50Var.getValue(), dt1Var);
                    boolean J = aVar.J(dt1Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new goj(dt1Var, wh50Var);
                        aVar.R(x);
                    }
                    afv0.b(f, str, (gzs) x, null, null, false, aVar, 0, 120);
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                cry cryVar = (cry) obj;
                int intValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (aVar2.J(cryVar) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= aVar2.o(intValue3) ? 32 : 16;
                }
                if (aVar2.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1117249557, i2, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
                    }
                    Pair pair2 = (Pair) this.c.get(intValue3);
                    aVar2.K(-762149522);
                    ee00.a((String) pair2.d(), (ScreenKey) pair2.g(), (izs) this.d, aVar2, 0);
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
