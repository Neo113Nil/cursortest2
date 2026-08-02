package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.design.compose.property.config.MarketProperty$VariantState;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.h5c0;
import xsna.rrd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wi4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wi4(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.e = obj;
        this.c = izsVar;
        this.d = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                xi4 xi4Var = (xi4) this.e;
                izs izsVar = (izs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                xi4Var.j(ne7.I(49), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                return s3q0.a;
            case 1:
                gzs gzsVar = (gzs) this.e;
                izs izsVar2 = (izs) this.c;
                q630 q630Var2 = (q630) this.d;
                ((Integer) obj2).getClass();
                sc40.b(ne7.I(1), (androidx.compose.runtime.a) obj, gzsVar, izsVar2, q630Var2);
                return s3q0.a;
            case 2:
                e64 e64Var = (e64) this.e;
                e64 e64Var2 = (e64) this.c;
                e64 e64Var3 = (e64) this.d;
                em50 em50Var = (em50) obj;
                h5c0 h5c0Var = (h5c0) obj2;
                if (h5c0Var instanceof j5c0) {
                    return em50Var.a(e64Var, h5c0Var);
                }
                if (h5c0Var instanceof h5c0.a) {
                    return em50Var.a(e64Var2, h5c0Var);
                }
                if (h5c0Var instanceof h5c0.b) {
                    return em50Var.a(e64Var3, h5c0Var);
                }
                if (h5c0Var instanceof i5c0) {
                    return em50Var.a(e64Var3, h5c0Var);
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                rrd0 rrd0Var = (rrd0) this.e;
                ird0 ird0Var = (ird0) this.c;
                ird0 ird0Var2 = (ird0) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(892497688, intValue, -1, "com.vk.ecomm.market.good.ui.holder.properties.ProductPropertyVariantsTextHolder.onBind.<anonymous>.<anonymous> (ProductPropertyVariantsTextHolder.kt:32)");
                    }
                    String str = ird0Var.a;
                    ArrayList<krd0> arrayList = ird0Var.c;
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    for (krd0 krd0Var : arrayList) {
                        int i = krd0Var.a;
                        String str2 = krd0Var.c;
                        krd0 krd0Var2 = ird0Var.d;
                        boolean z = krd0Var.f;
                        arrayList2.add(new ld10(i, str2, (z || !krd0Var.equals(krd0Var2)) ? !z ? MarketProperty$VariantState.UNAVAILABLE : krd0Var.equals(krd0Var2) ? MarketProperty$VariantState.SELECTED : MarketProperty$VariantState.AVAILABLE : MarketProperty$VariantState.RUN_OUT));
                    }
                    rrd0.f fVar = new rrd0.f(str, arrayList2);
                    boolean y = aVar.y(rrd0Var) | aVar.y(ird0Var2);
                    Object x = aVar.x();
                    if (y || x == a.C0011a.a) {
                        x = new ml1(23, rrd0Var, ird0Var2);
                        aVar.R(x);
                    }
                    rrd0Var.q6(fVar, (izs) x, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((vfp0) this.e).k((ggp0) this.d, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
        }
    }

    public /* synthetic */ wi4(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ wi4(vfp0 vfp0Var, ggp0 ggp0Var, izs izsVar, int i) {
        this.b = 4;
        this.e = vfp0Var;
        this.d = ggp0Var;
        this.c = izsVar;
    }
}
