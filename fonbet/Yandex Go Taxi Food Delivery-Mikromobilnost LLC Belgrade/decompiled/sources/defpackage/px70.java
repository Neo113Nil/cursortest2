package defpackage;

import com.yandex.go.taxi.order.info.OrderInfoContentView;

/* loaded from: classes14.dex */
public final /* synthetic */ class px70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OrderInfoContentView b;

    public /* synthetic */ px70(OrderInfoContentView orderInfoContentView, int i) {
        this.a = i;
        this.b = orderInfoContentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        OrderInfoContentView orderInfoContentView = this.b;
        switch (i) {
            case 0:
                OrderInfoContentView.fillDriverPhone$lambda$0(orderInfoContentView);
                break;
            default:
                OrderInfoContentView.applyOrder$lambda$0(orderInfoContentView);
                break;
        }
    }
}
