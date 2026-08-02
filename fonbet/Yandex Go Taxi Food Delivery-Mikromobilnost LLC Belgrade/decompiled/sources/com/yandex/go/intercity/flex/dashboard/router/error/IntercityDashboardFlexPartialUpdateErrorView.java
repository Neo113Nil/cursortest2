package com.yandex.go.intercity.flex.dashboard.router.error;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.intercity.flex.dashboard.router.error.IntercityDashboardFlexPartialUpdateErrorView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cma1;
import defpackage.dew;
import defpackage.ej1;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.ndw;
import defpackage.ny61;
import defpackage.pth0;
import defpackage.sih0;
import defpackage.xuv;
import defpackage.ydw;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/router/error/IntercityDashboardFlexPartialUpdateErrorView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lndw;", "Landroid/content/Context;", "context", "Lydw;", "presenter", "<init>", "(Landroid/content/Context;Lydw;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lndw;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Lydw;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IntercityDashboardFlexPartialUpdateErrorView extends SlideableBindingModalView<ndw> {
    private final ydw presenter;

    public IntercityDashboardFlexPartialUpdateErrorView(Context context, ydw ydwVar) {
        super(context);
        this.presenter = ydwVar;
        getBinding().c.setTitle(getContext().getString(kyh0.intercity_main_error_card_title));
        getBinding().c.setSubtitle(getContext().getString(kyh0.intercity_main_error_card_subtitle));
        getBinding().d.setText(getContext().getString(kyh0.intercity_main_error_card_button_title));
        getBinding().b.setText(getContext().getString(kyh0.common_back));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(IntercityDashboardFlexPartialUpdateErrorView intercityDashboardFlexPartialUpdateErrorView) {
        ((ej1) intercityDashboardFlexPartialUpdateErrorView.presenter.x.a).r(new xuv(18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(IntercityDashboardFlexPartialUpdateErrorView intercityDashboardFlexPartialUpdateErrorView) {
        ((ej1) intercityDashboardFlexPartialUpdateErrorView.presenter.x.a).r(new xuv(17));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ndw bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(pth0.intercity_dashboard_flex_error_view, parent, false);
        int i = sih0.navigate_back_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = sih0.popup_item_component;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
            if (listItemComponent != null) {
                i = sih0.reload_button;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent2 != null) {
                    return new ndw((GoLinearLayout) inflate, buttonComponent, listItemComponent, buttonComponent2);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchOutsideListener(null);
        final int i = 0;
        setDismissOnTouchOutside(false);
        this.presenter.Bg(new dew());
        getBinding().d.setDebounceClickListener(new Runnable(this) { // from class: cew
            public final /* synthetic */ IntercityDashboardFlexPartialUpdateErrorView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                IntercityDashboardFlexPartialUpdateErrorView intercityDashboardFlexPartialUpdateErrorView = this.b;
                switch (i2) {
                    case 0:
                        IntercityDashboardFlexPartialUpdateErrorView.onAttachedToWindow$lambda$0(intercityDashboardFlexPartialUpdateErrorView);
                        break;
                    default:
                        IntercityDashboardFlexPartialUpdateErrorView.onAttachedToWindow$lambda$1(intercityDashboardFlexPartialUpdateErrorView);
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().b.setDebounceClickListener(new Runnable(this) { // from class: cew
            public final /* synthetic */ IntercityDashboardFlexPartialUpdateErrorView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                IntercityDashboardFlexPartialUpdateErrorView intercityDashboardFlexPartialUpdateErrorView = this.b;
                switch (i22) {
                    case 0:
                        IntercityDashboardFlexPartialUpdateErrorView.onAttachedToWindow$lambda$0(intercityDashboardFlexPartialUpdateErrorView);
                        break;
                    default:
                        IntercityDashboardFlexPartialUpdateErrorView.onAttachedToWindow$lambda$1(intercityDashboardFlexPartialUpdateErrorView);
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
