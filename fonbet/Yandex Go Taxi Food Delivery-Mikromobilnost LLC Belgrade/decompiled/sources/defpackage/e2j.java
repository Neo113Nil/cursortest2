package defpackage;

import com.yandex.go.taxi.order.cancel.popup.mvp.DetailedCancelPopupModalView;

/* loaded from: classes14.dex */
public final class e2j implements g2j {
    public final /* synthetic */ DetailedCancelPopupModalView a;

    public e2j(DetailedCancelPopupModalView detailedCancelPopupModalView) {
        this.a = detailedCancelPopupModalView;
    }

    @Override // defpackage.g2j
    public final void Z2(l2j l2jVar) {
        String str = l2jVar.b;
        DetailedCancelPopupModalView detailedCancelPopupModalView = this.a;
        detailedCancelPopupModalView.setTitle(str);
        detailedCancelPopupModalView.setMessage(l2jVar.c);
        detailedCancelPopupModalView.setTopImage(l2jVar.a);
        detailedCancelPopupModalView.setCostInfo(l2jVar.d);
        detailedCancelPopupModalView.setButton(l2jVar.e);
    }
}
