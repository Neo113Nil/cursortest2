package com.yandex.go.places.impl.ui.payments.info;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.places.impl.ui.payments.info.PaymentsInfoModalView;
import defpackage.ak80;
import defpackage.ana0;
import defpackage.bna0;
import defpackage.by90;
import defpackage.cma1;
import defpackage.da0;
import defpackage.fna0;
import defpackage.g1a0;
import defpackage.lcc0;
import defpackage.lea0;
import defpackage.mia1;
import defpackage.ny61;
import defpackage.o6h0;
import defpackage.pcc0;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.tje;
import defpackage.u290;
import defpackage.uuh0;
import defpackage.zma0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/places/impl/ui/payments/info/PaymentsInfoModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lbna0;", "Landroid/content/Context;", "context", "Lfna0;", "presenter", "<init>", "(Landroid/content/Context;Lfna0;)V", "Llea0;", "chosenPaymentMethod", "Lzy11;", "setPaymentMethod", "(Llea0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lbna0;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lfna0;", "Companion", "ana0", "zma0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentsInfoModalView extends SlideableBindingModalView<bna0> {
    public static final int $stable = 8;
    private static final zma0 Companion = new zma0();

    @Deprecated
    public static final String NBSP_DASH = " — ";
    private final fna0 presenter;

    public PaymentsInfoModalView(Context context, final fna0 fna0Var) {
        super(context);
        this.presenter = fna0Var;
        final int i = 0;
        qdb1.c(this, new Runnable() { // from class: yma0
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                fna0 fna0Var2 = fna0Var;
                switch (i2) {
                    case 0:
                        PaymentsInfoModalView._init_$onBackButtonClicked(fna0Var2);
                        break;
                    default:
                        PaymentsInfoModalView.lambda$0$processPayment(fna0Var2);
                        break;
                }
            }
        });
        bna0 binding = getBinding();
        final int i2 = 1;
        binding.e.setDebounceClickListener(new Runnable() { // from class: yma0
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                fna0 fna0Var2 = fna0Var;
                switch (i22) {
                    case 0:
                        PaymentsInfoModalView._init_$onBackButtonClicked(fna0Var2);
                        break;
                    default:
                        PaymentsInfoModalView.lambda$0$processPayment(fna0Var2);
                        break;
                }
            }
        });
        mia1.c(binding.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onBackButtonClicked(fna0 fna0Var) {
        ((da0) fna0Var.y.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$processPayment(fna0 fna0Var) {
        tje.N(fna0Var.Jg(), null, null, new PaymentsInfoPresenter$processPayment$1(fna0Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(PaymentsInfoModalView paymentsInfoModalView) {
        fna0 fna0Var = paymentsInfoModalView.presenter;
        tje.N(fna0Var.Jg(), null, null, new PaymentsInfoPresenter$chosePaymentMethod$1(fna0Var, new u290(25, paymentsInfoModalView), null), 3);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0$0(PaymentsInfoModalView paymentsInfoModalView, lea0 lea0Var) {
        paymentsInfoModalView.setPaymentMethod(lea0Var);
        return zy11.a;
    }

    private final void setPaymentMethod(lea0 chosenPaymentMethod) {
        String id;
        if (chosenPaymentMethod == null || !chosenPaymentMethod.e()) {
            chosenPaymentMethod = null;
        }
        fna0 fna0Var = this.presenter;
        lcc0 lcc0Var = fna0Var.z;
        lcc0Var.c.g = chosenPaymentMethod;
        String c = (chosenPaymentMethod == null || (id = chosenPaymentMethod.getId()) == null) ? null : lcc0Var.c(id, true);
        tje.N(fna0Var.Jg(), null, null, new PaymentsInfoPresenter$setCardInfo$1(fna0Var, c, null), 3);
        bna0 binding = getBinding();
        ButtonComponent buttonComponent = binding.e;
        RobotoTextView robotoTextView = binding.d;
        buttonComponent.setEnabled(chosenPaymentMethod != null);
        robotoTextView.setText(c);
        fna0 fna0Var2 = this.presenter;
        if (c == null) {
            c = "";
        }
        robotoTextView.setContentDescription(fna0Var2.z.b(c));
        fna0 fna0Var3 = this.presenter;
        AppCompatImageView appCompatImageView = binding.b;
        pcc0 pcc0Var = fna0Var3.z.c;
        setPaymentMethod$lambda$1$0(binding, pcc0Var.h);
        lea0 lea0Var = pcc0Var.g;
        if (lea0Var != null) {
            ((g1a0) ((by90) pcc0Var.c.b.getValue()).d()).c(appCompatImageView, lea0Var);
        }
    }

    private static final zy11 setPaymentMethod$lambda$1$0(bna0 bna0Var, Drawable drawable) {
        bna0Var.b.setImageDrawable(drawable);
        return zy11.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public bna0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uuh0.payments_info_modal_view, parent, false);
        int i = o6h0.arrow_icon;
        if (((GoImageView) cma1.O(i, inflate)) != null) {
            i = o6h0.card_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
            if (appCompatImageView != null) {
                i = o6h0.error_image_view;
                if (((GoImageView) cma1.O(i, inflate)) != null) {
                    i = o6h0.payment_container;
                    GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
                    if (goLinearLayout != null) {
                        i = o6h0.payment_method_container;
                        if (((GoLinearLayout) cma1.O(i, inflate)) != null) {
                            i = o6h0.payment_method_subtitle;
                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView != null) {
                                i = o6h0.payment_method_title;
                                if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                                    i = o6h0.retry_button;
                                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                                    if (buttonComponent != null) {
                                        i = o6h0.spacer;
                                        GoView goView = (GoView) cma1.O(i, inflate);
                                        if (goView != null) {
                                            i = o6h0.subtitle_text_view;
                                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                            if (robotoTextView2 != null) {
                                                i = o6h0.title_text_view;
                                                RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                                                if (robotoTextView3 != null) {
                                                    return new bna0((GoLinearLayout) inflate, appCompatImageView, goLinearLayout, robotoTextView, buttonComponent, goView, robotoTextView2, robotoTextView3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
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
        fna0 fna0Var = this.presenter;
        ana0 ana0Var = new ana0(this);
        fna0Var.Bg(ana0Var);
        ana0Var.render(fna0Var.x);
        setPaymentMethod(this.presenter.z.c.g);
        c.z(new ak80(21, this), getBinding().c);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
