package com.yandex.go.places.impl.ui.web_custom_tabs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.places.base.ui.modals.BasePlacesModalView;
import defpackage.bz20;
import defpackage.c2x0;
import defpackage.cma1;
import defpackage.fmg0;
import defpackage.ho4;
import defpackage.ny61;
import defpackage.o6h0;
import defpackage.pg41;
import defpackage.sls;
import defpackage.u601;
import defpackage.uuh0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersImageView;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000bH\u0014¢\u0006\u0004\b#\u0010\rJ\u000f\u0010$\u001a\u00020\u000bH\u0014¢\u0006\u0004\b$\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u0012\u0004\b&\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/yandex/go/places/impl/ui/web_custom_tabs/WebCustomTabsModalView;", "Lcom/yandex/go/places/base/ui/modals/BasePlacesModalView;", "Lpg41;", "Landroid/content/Context;", "activityContext", "Lc2x0;", "systemBarsCoordinator", "Lcom/yandex/go/places/impl/ui/web_custom_tabs/b;", "presenter", "<init>", "(Landroid/content/Context;Lc2x0;Lcom/yandex/go/places/impl/ui/web_custom_tabs/b;)V", "Lzy11;", "showLoading", "()V", "Lkotlin/Function0;", "onReload", "onClose", "showError", "(Lsls;Lsls;)V", "", "screenName", "()Ljava/lang/String;", "Landroid/view/View;", "getCardContainer", "()Landroid/view/View;", "", "newState", "onBottomSheetStateChanged", "(I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lpg41;", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/content/Context;", "getActivityContext$annotations", "Lcom/yandex/go/places/impl/ui/web_custom_tabs/b;", "getPresenter", "()Lcom/yandex/go/places/impl/ui/web_custom_tabs/b;", "com/yandex/go/places/impl/ui/web_custom_tabs/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WebCustomTabsModalView extends BasePlacesModalView<pg41> {
    public static final int $stable = 8;
    private final Context activityContext;
    private final b presenter;

    public WebCustomTabsModalView(Context context, c2x0 c2x0Var, b bVar) {
        super(context, new bz20(false), c2x0Var, bVar);
        this.activityContext = context;
        this.presenter = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ pg41 access$getBinding(WebCustomTabsModalView webCustomTabsModalView) {
        return (pg41) webCustomTabsModalView.getBinding();
    }

    private static /* synthetic */ void getActivityContext$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showError(sls onReload, sls onClose) {
        ((pg41) getBinding()).c.clearAnimation();
        ((pg41) getBinding()).c.setVisibility(8);
        ((GoConstraintLayout) ((pg41) getBinding()).b.c).setVisibility(0);
        ((ButtonComponent) ((pg41) getBinding()).b.b).setDebounceClickListener(new u601(9, onReload));
        c.z(onClose, (RoundedCornersImageView) ((pg41) getBinding()).b.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showLoading() {
        ((GoConstraintLayout) ((pg41) getBinding()).b.c).setVisibility(8);
        ((pg41) getBinding()).c.setVisibility(0);
        ((pg41) getBinding()).c.startAnimation(AnimationUtils.loadAnimation(getContext(), fmg0.discovery_spinner_rotation));
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public pg41 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uuh0.web_custom_tabs_modal_view, parent, false);
        int i = o6h0.errorView;
        View O = cma1.O(i, inflate);
        if (O != null) {
            int i2 = o6h0.closeButton;
            RoundedCornersImageView roundedCornersImageView = (RoundedCornersImageView) cma1.O(i2, O);
            if (roundedCornersImageView != null) {
                i2 = o6h0.reloadButton;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, O);
                if (buttonComponent != null) {
                    i2 = o6h0.subtitle;
                    if (((RobotoTextView) cma1.O(i2, O)) != null) {
                        i2 = o6h0.title;
                        if (((RobotoTextView) cma1.O(i2, O)) != null) {
                            ho4 ho4Var = new ho4((ViewGroup) O, (View) roundedCornersImageView, (RobotoTextView) buttonComponent, 23);
                            int i3 = o6h0.spinner;
                            GoImageView goImageView = (GoImageView) cma1.O(i3, inflate);
                            if (goImageView != null) {
                                return new pg41(ho4Var, (GoFrameLayout) inflate, goImageView);
                            }
                            i = i3;
                        }
                    }
                }
            }
            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
            return null;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public View getCardContainer() {
        return ((pg41) getBinding()).a;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b presenter = getPresenter();
        presenter.Bg(new a(this));
        presenter.Mg();
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public void onBottomSheetStateChanged(int newState) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((pg41) getBinding()).c.clearAnimation();
        getPresenter().Cg();
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "WebCustomTabsModalView";
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public b getPresenter() {
        return this.presenter;
    }
}
