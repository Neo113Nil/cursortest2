package xsna;

import com.vk.api.generated.orders.dto.OrdersOrderDto;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class owa implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ owa(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                hfz hfzVar = (hfz) obj;
                xbg xbgVar = hfzVar instanceof xbg ? (xbg) hfzVar : null;
                return Boolean.valueOf(xbgVar != null && xbgVar.b == this.c);
            default:
                return new txm0((OrdersOrderDto.StatusDto) obj, this.c);
        }
    }
}
