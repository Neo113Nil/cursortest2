package defpackage;

import com.yandex.go.taxi.order.info.OrderInfoContentView;

/* loaded from: classes14.dex */
public final /* synthetic */ class ox70 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ OrderInfoContentView b;

    public /* synthetic */ ox70(OrderInfoContentView orderInfoContentView, int i) {
        this.a = i;
        this.b = orderInfoContentView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 applyPartnerInfo$lambda$0;
        zy11 applyCarrierInfo$lambda$0;
        int i = this.a;
        OrderInfoContentView orderInfoContentView = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                applyPartnerInfo$lambda$0 = OrderInfoContentView.applyPartnerInfo$lambda$0(orderInfoContentView, str);
                return applyPartnerInfo$lambda$0;
            default:
                applyCarrierInfo$lambda$0 = OrderInfoContentView.applyCarrierInfo$lambda$0(orderInfoContentView, str);
                return applyCarrierInfo$lambda$0;
        }
    }
}
