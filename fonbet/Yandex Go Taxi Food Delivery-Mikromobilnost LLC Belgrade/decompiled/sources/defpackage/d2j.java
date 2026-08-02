package defpackage;

import com.yandex.go.taxi.order.cancel.popup.mvp.DetailedCancelPopupModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class d2j implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DetailedCancelPopupModalView b;

    public /* synthetic */ d2j(DetailedCancelPopupModalView detailedCancelPopupModalView, int i) {
        this.a = i;
        this.b = detailedCancelPopupModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 costInfo$lambda$2;
        zy11 topImage$lambda$1;
        int i = this.a;
        DetailedCancelPopupModalView detailedCancelPopupModalView = this.b;
        switch (i) {
            case 0:
                costInfo$lambda$2 = DetailedCancelPopupModalView.setCostInfo$lambda$2(detailedCancelPopupModalView);
                return costInfo$lambda$2;
            default:
                topImage$lambda$1 = DetailedCancelPopupModalView.setTopImage$lambda$1(detailedCancelPopupModalView);
                return topImage$lambda$1;
        }
    }
}
