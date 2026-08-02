package com.yandex.go.taxi.order.infosharing.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.taxi.order.infosharing.navigation.a;
import defpackage.alh0;
import defpackage.bkx0;
import defpackage.cma1;
import defpackage.kux0;
import defpackage.m5y0;
import defpackage.n5y0;
import defpackage.ny61;
import defpackage.o5y0;
import defpackage.q8h0;
import defpackage.qdb1;
import defpackage.tje;
import defpackage.usc;
import defpackage.v5y0;
import defpackage.w5y0;
import defpackage.wsc;
import defpackage.xug0;
import defpackage.xw31;
import defpackage.y7x0;
import defpackage.zc;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$CloseReason;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0019\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/go/taxi/order/infosharing/ui/TaxiOrderScreenshotSharingModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lm5y0;", "Ln5y0;", "Landroid/content/Context;", "context", "Lo5y0;", "presenter", "<init>", "(Landroid/content/Context;Lo5y0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lm5y0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onBackPressed", "", "contentTop", "onModalViewAppear", "(I)V", "Lw5y0;", ClidProvider.STATE, "renderUiState", "(Lw5y0;)V", "Lo5y0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderScreenshotSharingModalView extends SlideableBindingModalView<m5y0> implements n5y0 {
    private final o5y0 presenter;

    public TaxiOrderScreenshotSharingModalView(Context context, o5y0 o5y0Var) {
        super(context);
        this.presenter = o5y0Var;
        qdb1.c(this, new kux0(4, o5y0Var));
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$closeButtonClick(o5y0 o5y0Var) {
        o5y0Var.A.b(o5y0Var.y, CommunicationModalAnalyticsData$CloseReason.CLOSE_BUTTON);
        ((zc) o5y0Var.z.a).r(new bkx0(22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderUiState$lambda$0$0(TaxiOrderScreenshotSharingModalView taxiOrderScreenshotSharingModalView, w5y0 w5y0Var) {
        o5y0 o5y0Var = taxiOrderScreenshotSharingModalView.presenter;
        String str = w5y0Var.c.d;
        wsc wscVar = o5y0Var.A;
        usc uscVar = o5y0Var.y;
        wscVar.a(uscVar, str);
        wscVar.b(uscVar, CommunicationModalAnalyticsData$CloseReason.ACTION_BUTTON);
        ((zc) o5y0Var.z.a).r(new a());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public m5y0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(alh0.taxi_order_screenshot_sharing_modal_view, parent, false);
        int i = q8h0.button_component;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            i = q8h0.icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
            if (appCompatImageView != null) {
                i = q8h0.text_component;
                ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, inflate);
                if (listTextComponent != null) {
                    i = q8h0.title_component;
                    ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                    if (listTitleComponent != null) {
                        return new m5y0(linearLayout, buttonComponent, appCompatImageView, listTextComponent, listTitleComponent);
                    }
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
        setDismissOnTouchOutside(false);
        o5y0 o5y0Var = this.presenter;
        o5y0Var.Bg(this);
        tje.N(o5y0Var.Jg(), null, null, new TaxiOrderScreenshotSharingPresenter$attachView$1(o5y0Var, this, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        o5y0 o5y0Var = this.presenter;
        o5y0Var.A.b(o5y0Var.y, CommunicationModalAnalyticsData$CloseReason.SYSTEM_BACK);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        xw31.w(getBinding().e);
        getBinding().d.setTextPaddings(tje.r(xug0.sharing_text_start_padding, getContext()), tje.r(xug0.sharing_text_top_padding, getContext()), tje.r(xug0.sharing_text_end_padding, getContext()), tje.r(xug0.sharing_text_bottom_padding, getContext()));
    }

    @Override // defpackage.n5y0
    public void renderUiState(w5y0 state) {
        m5y0 binding = getBinding();
        binding.e.setTitle(state.a);
        binding.d.setText(state.b);
        binding.c.setImageDrawable(state.d);
        ButtonComponent buttonComponent = binding.b;
        v5y0 v5y0Var = state.c;
        buttonComponent.setText(v5y0Var.a);
        buttonComponent.setButtonTitleColor(v5y0Var.b);
        buttonComponent.setButtonBackground(v5y0Var.c);
        buttonComponent.setDebounceClickListener(new y7x0(13, this, state));
    }
}
