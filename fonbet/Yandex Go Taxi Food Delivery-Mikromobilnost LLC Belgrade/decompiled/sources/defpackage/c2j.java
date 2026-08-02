package defpackage;

import android.graphics.Bitmap;
import com.yandex.go.taxi.order.cancel.popup.mvp.DetailedCancelPopupModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class c2j implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DetailedCancelPopupModalView b;

    public /* synthetic */ c2j(DetailedCancelPopupModalView detailedCancelPopupModalView, int i) {
        this.a = i;
        this.b = detailedCancelPopupModalView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 costInfo$lambda$1;
        zy11 topImage$lambda$0;
        int i = this.a;
        DetailedCancelPopupModalView detailedCancelPopupModalView = this.b;
        Bitmap bitmap = (Bitmap) obj;
        switch (i) {
            case 0:
                costInfo$lambda$1 = DetailedCancelPopupModalView.setCostInfo$lambda$1(detailedCancelPopupModalView, bitmap);
                return costInfo$lambda$1;
            default:
                topImage$lambda$0 = DetailedCancelPopupModalView.setTopImage$lambda$0(detailedCancelPopupModalView, bitmap);
                return topImage$lambda$0;
        }
    }
}
