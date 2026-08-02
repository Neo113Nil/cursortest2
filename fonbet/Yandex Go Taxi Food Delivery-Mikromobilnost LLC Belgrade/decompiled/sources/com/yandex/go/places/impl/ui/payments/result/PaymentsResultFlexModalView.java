package com.yandex.go.places.impl.ui.payments.result;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.places.base.ui.modals.lifecycle.BasePlacesLifecycleAwareModalView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.aoa0;
import defpackage.bz20;
import defpackage.c2x0;
import defpackage.c9c0;
import defpackage.cma1;
import defpackage.eoa0;
import defpackage.hoa0;
import defpackage.jsj;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.o6h0;
import defpackage.oep0;
import defpackage.uuh0;
import defpackage.zna0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001*B/\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0014¢\u0006\u0004\b#\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010)\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001a¨\u0006+"}, d2 = {"Lcom/yandex/go/places/impl/ui/payments/result/PaymentsResultFlexModalView;", "Lcom/yandex/go/places/base/ui/modals/lifecycle/BasePlacesLifecycleAwareModalView;", "Laoa0;", "Leoa0;", "Landroid/content/Context;", "context", "Lc2x0;", "systemBarsCoordinator", "Lhoa0;", "presenter", "Ljsj;", "flexCardContainer", "<init>", "(Landroid/content/Context;Lc2x0;Lhoa0;Ljsj;)V", "", "screenName", "()Ljava/lang/String;", "Landroid/view/View;", "getCardContainer", "()Landroid/view/View;", "", "newState", "Lzy11;", "onBottomSheetStateChanged", "(I)V", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Laoa0;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lhoa0;", "getPresenter", "()Lhoa0;", "Ljsj;", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "zna0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentsResultFlexModalView extends BasePlacesLifecycleAwareModalView<aoa0, eoa0> {
    public static final int $stable = 8;
    private final jsj flexCardContainer;
    private final hoa0 presenter;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentsResultFlexModalView(Context context, c2x0 c2x0Var, hoa0 hoa0Var, jsj jsjVar) {
        super(context, new bz20(false), c2x0Var, hoa0Var);
        this.presenter = hoa0Var;
        this.flexCardContainer = jsjVar;
        jsjVar.b(((aoa0) getBinding()).b);
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public aoa0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uuh0.payments_result_flex_modal_view, parent, false);
        int i = o6h0.inner_flex_container;
        ViewStub viewStub = (ViewStub) cma1.O(i, inflate);
        if (viewStub != null) {
            return new aoa0((GoFrameLayout) inflate, viewStub);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public View getCardContainer() {
        return ((aoa0) getBinding()).a;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return 0;
    }

    @Override // com.yandex.go.places.base.ui.modals.lifecycle.BasePlacesLifecycleAwareModalView, com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        hoa0 presenter = getPresenter();
        presenter.Bg(new zna0());
        oep0.b(presenter.C, (c9c0) presenter.H.getValue());
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public void onBottomSheetStateChanged(int newState) {
    }

    @Override // com.yandex.go.places.base.ui.modals.lifecycle.BasePlacesLifecycleAwareModalView, com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getPresenter().Cg();
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "PaymentsResultFlexModalView";
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public hoa0 getPresenter() {
        return this.presenter;
    }
}
