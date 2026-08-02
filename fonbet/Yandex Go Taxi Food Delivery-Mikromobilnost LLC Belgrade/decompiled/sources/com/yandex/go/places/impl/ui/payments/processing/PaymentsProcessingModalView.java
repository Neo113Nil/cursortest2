package com.yandex.go.places.impl.ui.payments.processing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.base.ui.modals.BasePlacesModalView;
import com.yandex.go.places.models.domain.entities.PaymentProcessingState;
import defpackage.bz20;
import defpackage.c2x0;
import defpackage.cma1;
import defpackage.fmg0;
import defpackage.ny61;
import defpackage.o6h0;
import defpackage.rna0;
import defpackage.sna0;
import defpackage.tje;
import defpackage.uuh0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001e\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u0012\u0004\b \u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/yandex/go/places/impl/ui/payments/processing/PaymentsProcessingModalView;", "Lcom/yandex/go/places/base/ui/modals/BasePlacesModalView;", "Lsna0;", "Landroid/content/Context;", "activityContext", "Lc2x0;", "systemBarsCoordinator", "Lcom/yandex/go/places/impl/ui/payments/processing/a;", "presenter", "<init>", "(Landroid/content/Context;Lc2x0;Lcom/yandex/go/places/impl/ui/payments/processing/a;)V", "", "screenName", "()Ljava/lang/String;", "Landroid/view/View;", "getCardContainer", "()Landroid/view/View;", "", "newState", "Lzy11;", "onBottomSheetStateChanged", "(I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lsna0;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/content/Context;", "getActivityContext$annotations", "Lcom/yandex/go/places/impl/ui/payments/processing/a;", "getPresenter", "()Lcom/yandex/go/places/impl/ui/payments/processing/a;", "rna0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentsProcessingModalView extends BasePlacesModalView<sna0> {
    public static final int $stable = 8;
    private final Context activityContext;
    private final a presenter;

    public PaymentsProcessingModalView(Context context, c2x0 c2x0Var, a aVar) {
        super(context, new bz20(false), c2x0Var, aVar);
        this.activityContext = context;
        this.presenter = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ sna0 access$getBinding(PaymentsProcessingModalView paymentsProcessingModalView) {
        return (sna0) paymentsProcessingModalView.getBinding();
    }

    private static /* synthetic */ void getActivityContext$annotations() {
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public sna0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uuh0.payments_processing_modal_view, parent, false);
        int i = o6h0.label;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = o6h0.spinner;
            GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
            if (goImageView != null) {
                i = o6h0.spinner_container;
                if (((GoFrameLayout) cma1.O(i, inflate)) != null) {
                    i = o6h0.success_arrow;
                    GoImageView goImageView2 = (GoImageView) cma1.O(i, inflate);
                    if (goImageView2 != null) {
                        return new sna0((GoLinearLayout) inflate, robotoTextView, goImageView, goImageView2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public View getCardContainer() {
        return ((sna0) getBinding()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a presenter = getPresenter();
        rna0 rna0Var = new rna0(this);
        presenter.Bg(rna0Var);
        presenter.C = tje.N(presenter.Jg(), null, null, new PaymentsProcessingPresenter$attachView$1(presenter, null), 3);
        com.yandex.go.places.impl.data.repositories.payments.process.a aVar = presenter.A;
        aVar.b.l(PaymentProcessingState.IN_PROGRESS);
        tje.N(presenter.Jg(), null, null, new PaymentsProcessingPresenter$attachView$$inlined$safeCollectIn$1(e.d(aVar.b), null, rna0Var), 3);
        ((sna0) getBinding()).c.startAnimation(AnimationUtils.loadAnimation(getContext(), fmg0.discovery_spinner_rotation));
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public void onBottomSheetStateChanged(int newState) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((sna0) getBinding()).c.clearAnimation();
        getPresenter().Cg();
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "PaymentsProcessingModalView";
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public a getPresenter() {
        return this.presenter;
    }
}
