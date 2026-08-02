package xsna;

import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dr7 implements xy {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dr7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.xy
    public final void a(lj50 lj50Var) {
        switch (this.b) {
            case 0:
                ((or7) this.c).b((com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.a) lj50Var);
                break;
            default:
                ((ix80) this.c).b((OrderAction) lj50Var);
                break;
        }
    }
}
