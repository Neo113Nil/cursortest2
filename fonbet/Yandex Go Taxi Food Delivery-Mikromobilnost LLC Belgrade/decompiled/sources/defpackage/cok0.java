package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardStatusProgressItemView;

/* loaded from: classes14.dex */
public final /* synthetic */ class cok0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wnk0 b;
    public final /* synthetic */ RideCardStatusProgressItemView c;
    public final /* synthetic */ wrs0 w;

    public /* synthetic */ cok0(wnk0 wnk0Var, RideCardStatusProgressItemView rideCardStatusProgressItemView, wrs0 wrs0Var, int i) {
        this.a = i;
        this.b = wnk0Var;
        this.c = rideCardStatusProgressItemView;
        this.w = wrs0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 renderTitle$lambda$0$0;
        zy11 renderSubtitle$lambda$0$0;
        int i = this.a;
        wrs0 wrs0Var = this.w;
        RideCardStatusProgressItemView rideCardStatusProgressItemView = this.c;
        wnk0 wnk0Var = this.b;
        switch (i) {
            case 0:
                renderTitle$lambda$0$0 = RideCardStatusProgressItemView.renderTitle$lambda$0$0(wnk0Var, rideCardStatusProgressItemView, wrs0Var);
                return renderTitle$lambda$0$0;
            default:
                renderSubtitle$lambda$0$0 = RideCardStatusProgressItemView.renderSubtitle$lambda$0$0(wnk0Var, rideCardStatusProgressItemView, wrs0Var);
                return renderSubtitle$lambda$0$0;
        }
    }
}
