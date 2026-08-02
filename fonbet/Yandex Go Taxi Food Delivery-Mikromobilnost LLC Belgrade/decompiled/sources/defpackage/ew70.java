package defpackage;

import ru.yandex.taxi.order.OrderFragment;

/* loaded from: classes6.dex */
public final /* synthetic */ class ew70 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ OrderFragment b;

    public /* synthetic */ ew70(OrderFragment orderFragment, int i) {
        this.a = i;
        this.b = orderFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zyx0 taxiOrderChatFacadeRouter$lambda$0;
        fjm driverProfileRouter$lambda$0;
        urf0 promocodesRouter$lambda$0;
        d8t0 somethingWrongOnboardingScreenRouter$lambda$0;
        boolean onCreateView$lambda$0;
        int i = this.a;
        OrderFragment orderFragment = this.b;
        switch (i) {
            case 0:
                taxiOrderChatFacadeRouter$lambda$0 = OrderFragment.taxiOrderChatFacadeRouter$lambda$0(orderFragment);
                return taxiOrderChatFacadeRouter$lambda$0;
            case 1:
                driverProfileRouter$lambda$0 = OrderFragment.driverProfileRouter$lambda$0(orderFragment);
                return driverProfileRouter$lambda$0;
            case 2:
                promocodesRouter$lambda$0 = OrderFragment.promocodesRouter$lambda$0(orderFragment);
                return promocodesRouter$lambda$0;
            case 3:
                somethingWrongOnboardingScreenRouter$lambda$0 = OrderFragment.somethingWrongOnboardingScreenRouter$lambda$0(orderFragment);
                return somethingWrongOnboardingScreenRouter$lambda$0;
            default:
                onCreateView$lambda$0 = OrderFragment.onCreateView$lambda$0(orderFragment);
                return Boolean.valueOf(onCreateView$lambda$0);
        }
    }
}
