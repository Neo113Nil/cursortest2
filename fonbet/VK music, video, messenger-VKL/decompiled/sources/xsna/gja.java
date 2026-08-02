package xsna;

import com.vk.ecomm.categories.api.MarketBridgeCategory;
import kotlin.NoWhenBranchMatchedException;
import xsna.fja;
import xsna.mja;
import xsna.sja;

/* compiled from: CategoriesActor.kt */
/* loaded from: classes18.dex */
public final class gja implements qj50<cka, fja, on50, hn50<on50>, sja, mja> {
    public final sj50<cka, on50, hn50<on50>, sja, mja> b;

    public gja(sj50<cka, on50, hn50<on50>, sja, mja> sj50Var) {
        this.b = sj50Var;
    }

    @Override // xsna.qj50
    public final sj50<cka, on50, hn50<on50>, sja, mja> W() {
        throw null;
    }

    @Override // xsna.qj50
    public final /* bridge */ /* synthetic */ boolean i(fja fjaVar) {
        return true;
    }

    @Override // xsna.qj50
    public final void p(fja fjaVar) {
        fja fjaVar2 = fjaVar;
        boolean equals = fjaVar2.equals(fja.a.b);
        sj50<cka, on50, hn50<on50>, sja, mja> sj50Var = this.b;
        if (equals) {
            if (sj50Var.getCurrentState().c.size() > 1) {
                sj50Var.e(sja.a.a);
                return;
            } else {
                sj50Var.c(mja.a.a);
                s3q0 s3q0Var = s3q0.a;
                return;
            }
        }
        if (!(fjaVar2 instanceof fja.b)) {
            if (!(fjaVar2 instanceof fja.c)) {
                throw new NoWhenBranchMatchedException();
            }
            sj50Var.e(new sja.c(((fja.c) fjaVar2).b));
        } else {
            MarketBridgeCategory marketBridgeCategory = ((fja.b) fjaVar2).b;
            if (!marketBridgeCategory.e.isEmpty()) {
                sj50Var.e(new sja.b(marketBridgeCategory));
            } else {
                sj50Var.c(new mja.b(marketBridgeCategory));
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.qj50
    public final void init() {
    }
}
