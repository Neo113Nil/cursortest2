package xsna;

import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a;
import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import xsna.coc;
import xsna.d4k0;
import xsna.dbe0;
import xsna.h3b0;
import xsna.o9t;
import xsna.q7t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class iz7 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ iz7(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(a.c.b);
                break;
            case 1:
                this.c.invoke(coc.c.b);
                break;
            case 2:
                this.c.invoke(d4k0.d.b.b);
                break;
            case 3:
                this.c.invoke(new o9t.j(q7t.d.a));
                break;
            case 4:
                this.c.invoke(OrderAction.b.b);
                break;
            case 5:
                this.c.invoke(h3b0.f.b);
                break;
            default:
                this.c.invoke(dbe0.r.c.b);
                break;
        }
        return s3q0.a;
    }
}
