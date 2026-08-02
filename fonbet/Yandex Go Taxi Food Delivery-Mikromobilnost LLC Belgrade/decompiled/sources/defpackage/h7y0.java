package defpackage;

import com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingView;
import com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingViewDelegate$Type;
import com.yandex.go.taxi.order.ui.TaxiOrderTrackingBackButton;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

/* loaded from: classes14.dex */
public final class h7y0 implements x6y0 {
    public final /* synthetic */ TaxiOrderTrackingView a;

    public h7y0(TaxiOrderTrackingView taxiOrderTrackingView) {
        this.a = taxiOrderTrackingView;
    }

    @Override // defpackage.x6y0
    public final void Cb(int i) {
        TaxiOrderTrackingView taxiOrderTrackingView = this.a;
        taxiOrderTrackingView.errorHeaderHeightPx = i;
        taxiOrderTrackingView.updateCollapsedHeightRatio();
    }

    @Override // defpackage.x6y0
    public final void J0(TaxiOrderTrackingViewDelegate$Type taxiOrderTrackingViewDelegate$Type) {
        TaxiOrderTrackingViewDelegate$Type taxiOrderTrackingViewDelegate$Type2;
        l7y0 l7y0Var;
        l7y0 l7y0Var2;
        l7y0 l7y0Var3;
        l7y0 l7y0Var4;
        int i = g7y0.a[taxiOrderTrackingViewDelegate$Type.ordinal()];
        TaxiOrderTrackingView taxiOrderTrackingView = this.a;
        if (i == 1) {
            taxiOrderTrackingView.showFeed();
        } else if (i == 2) {
            taxiOrderTrackingView.showTariffsSuggest();
        } else if (i == 3) {
            taxiOrderTrackingView.showMultimodal();
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            taxiOrderTrackingView.hideContainer();
        }
        taxiOrderTrackingView.currentViewType = taxiOrderTrackingViewDelegate$Type;
        taxiOrderTrackingViewDelegate$Type2 = taxiOrderTrackingView.currentViewType;
        if (taxiOrderTrackingViewDelegate$Type2 != TaxiOrderTrackingViewDelegate$Type.EMPTY) {
            taxiOrderTrackingView.setCanDrag(true);
            taxiOrderTrackingView.forceAnchor();
        }
        l7y0Var = taxiOrderTrackingView.binding;
        if (l7y0Var.i.getVisibility() != 0) {
            l7y0Var4 = taxiOrderTrackingView.binding;
            cma1.J(l7y0Var4.i);
        }
        l7y0Var2 = taxiOrderTrackingView.binding;
        if (l7y0Var2.h.getVisibility() == 0) {
            return;
        }
        l7y0Var3 = taxiOrderTrackingView.binding;
        cma1.J(l7y0Var3.h);
    }

    @Override // defpackage.x6y0
    public final void Ob(int i) {
        TaxiOrderTrackingView taxiOrderTrackingView = this.a;
        taxiOrderTrackingView.nonErrorHeaderHeightPx = i;
        taxiOrderTrackingView.updateCollapsedHeightRatio();
    }

    @Override // defpackage.x6y0
    public final void b0(glk0 glk0Var) {
        RotatableFloatButton rotatableFloatButton;
        gok0 gok0Var;
        TaxiOrderTrackingView taxiOrderTrackingView = this.a;
        rotatableFloatButton = taxiOrderTrackingView.panoramaButton;
        if (rotatableFloatButton == null) {
            return;
        }
        gok0Var = taxiOrderTrackingView.rideCardTaxiPanoramaEntryPointInteractor;
        ((iok0) gok0Var).b(glk0Var, rotatableFloatButton);
    }

    @Override // defpackage.x6y0
    public final void ic(float f) {
        this.a.updateAnchoredHeight(f);
    }

    @Override // defpackage.x6y0
    public final void updateBadgeText(String str) {
        TaxiOrderTrackingBackButton backNavigationButton;
        backNavigationButton = this.a.getBackNavigationButton();
        backNavigationButton.setBadgeText(str);
    }

    @Override // defpackage.x6y0
    public final void x2() {
        this.a.setBehaviourState(4);
    }
}
