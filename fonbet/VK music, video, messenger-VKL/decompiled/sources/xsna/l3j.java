package xsna;

import androidx.compose.runtime.a;
import xsna.fv80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class l3j implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l3j(int i, izs izsVar, q630 q630Var, boolean z) {
        this.d = izsVar;
        this.e = q630Var;
        this.c = z;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                com.vk.ecomm.reviews.impl.communities.yclients.h.b(ne7.I(1), (androidx.compose.runtime.a) obj, izsVar, q630Var, this.c);
                break;
            default:
                nw80 nw80Var = (nw80) this.d;
                z37 z37Var = (z37) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(240783176, intValue, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderListContent.<anonymous>.<anonymous> (OrderListContent.kt:40)");
                    }
                    boolean J = aVar.J(z37Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        fv80.b bVar = new fv80.b(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar.R(bVar);
                        x = bVar;
                    }
                    bv80.a(this.c, nw80Var, (izs) ((fcy) x), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ l3j(boolean z, nw80 nw80Var, z37 z37Var) {
        this.c = z;
        this.d = nw80Var;
        this.e = z37Var;
    }
}
