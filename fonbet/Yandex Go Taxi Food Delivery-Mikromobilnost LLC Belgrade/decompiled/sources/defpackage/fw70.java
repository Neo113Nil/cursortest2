package defpackage;

import ru.yandex.taxi.order.OrderFragment;

/* loaded from: classes6.dex */
public final /* synthetic */ class fw70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OrderFragment b;

    public /* synthetic */ fw70(OrderFragment orderFragment, int i) {
        this.a = i;
        this.b = orderFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        OrderFragment orderFragment = this.b;
        switch (i) {
            case 0:
                OrderFragment.showChat$lambda$1(orderFragment);
                break;
            default:
                OrderFragment.showChat$lambda$2(orderFragment);
                break;
        }
    }
}
