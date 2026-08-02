package xsna;

import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import xsna.dbe0;
import xsna.hjl0;
import xsna.jte;
import xsna.lze;
import xsna.oig0;
import xsna.q0j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class t9d implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ t9d(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(jte.l.b);
                break;
            case 1:
                this.c.invoke(dbe0.h.a.b);
                break;
            case 2:
                this.c.invoke(OrderListAction.h.b);
                break;
            case 3:
                this.c.invoke(oig0.c.a);
                break;
            case 4:
                this.c.invoke(lze.e.b);
                break;
            case 5:
                this.c.invoke(q0j0.f.a.b);
                break;
            case 6:
                this.c.invoke(hjl0.e.b);
                break;
            default:
                this.c.invoke(dbe0.r.a.b);
                break;
        }
        return s3q0.a;
    }
}
