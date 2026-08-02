package com.yandex.go.taxi.intercity.dashboard.impl.presentation.popup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bhw;
import defpackage.c230;
import defpackage.chw;
import defpackage.cma1;
import defpackage.dhv;
import defpackage.e230;
import defpackage.ej1;
import defpackage.j8h0;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.tkh0;
import defpackage.tzt;
import defpackage.xgw;
import defpackage.xuv;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/popup/IntercityDashboardPopupView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lchw;", "Landroid/content/Context;", "context", "Lxgw;", "presenter", "<init>", "(Landroid/content/Context;Lxgw;)V", "Lzy11;", "setText", "()V", "handleReloadButtonClick", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lchw;", "onAttachedToWindow", "onDetachedFromWindow", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Lxgw;", "bhw", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardPopupView extends SlideableBindingModalView<chw> {
    private final xgw presenter;

    public IntercityDashboardPopupView(Context context, xgw xgwVar) {
        super(context);
        this.presenter = xgwVar;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        setText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleReloadButtonClick() {
        ((ej1) this.presenter.x.a).r(new xuv(19));
    }

    private final void setText() {
        getBinding().b.setTitle(getContext().getString(kyh0.intercity_main_error_card_title));
        getBinding().b.setSubtitle(getContext().getString(kyh0.intercity_main_error_card_subtitle));
        getBinding().c.setText(getContext().getString(kyh0.intercity_main_error_card_button_title));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public chw bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(tkh0.intercity_dashboard_popup_view, parent, false);
        int i = j8h0.popup_item_component;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
        if (listItemComponent != null) {
            i = j8h0.reload_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                return new chw((LinearLayout) inflate, buttonComponent, listItemComponent);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new tzt(26, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().c.setDebounceClickListener(new dhv(7, this));
        this.presenter.Bg(new bhw());
        requestApplyInsets();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
