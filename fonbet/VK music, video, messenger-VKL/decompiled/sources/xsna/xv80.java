package xsna;

import com.vk.dto.masks.Mask;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xv80 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ xv80(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new OrderListAction.ClickSpan("OPEN_LINK", (String) obj));
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                this.c.invoke(fbe0.b);
                break;
            default:
                Mask mask = (Mask) ((it80) obj).a;
                if (mask != null) {
                    this.c.invoke(mask);
                }
                break;
        }
        return s3q0.a;
    }
}
