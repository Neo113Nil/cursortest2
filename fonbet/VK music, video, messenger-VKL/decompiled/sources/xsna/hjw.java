package xsna;

import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class hjw implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ int d;

    public /* synthetic */ hjw(int i, int i2, izs izsVar) {
        this.b = i2;
        this.c = izsVar;
        this.d = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(Integer.valueOf(this.d));
                break;
            default:
                this.c.invoke(new OrderListAction.d(this.d));
                break;
        }
        return s3q0.a;
    }
}
