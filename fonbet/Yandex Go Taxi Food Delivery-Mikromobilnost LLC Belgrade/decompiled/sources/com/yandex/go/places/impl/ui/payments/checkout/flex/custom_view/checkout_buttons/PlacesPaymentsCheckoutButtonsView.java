package com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.impl.domain.entities.payments.PlacesPaymentsCheckoutButtonsViewUiState;
import defpackage.bia0;
import defpackage.by90;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.ema0;
import defpackage.evu0;
import defpackage.g1a0;
import defpackage.hbp0;
import defpackage.l8x;
import defpackage.lcc0;
import defpackage.lea0;
import defpackage.mia1;
import defpackage.ny61;
import defpackage.o400;
import defpackage.o6h0;
import defpackage.pcc0;
import defpackage.qcc0;
import defpackage.qoi0;
import defpackage.qy90;
import defpackage.sjh;
import defpackage.t9b0;
import defpackage.tje;
import defpackage.uuh0;
import defpackage.uyj;
import defpackage.wls;
import defpackage.wnb0;
import defpackage.yo90;
import defpackage.zy11;
import defpackage.zzs;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.payment_options.model.PaymentIconType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\n*\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J4\u0010&\u001a\u00020\n2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0#\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0082@¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\nH\u0014¢\u0006\u0004\b(\u0010\u000eJ\u000f\u0010)\u001a\u00020\nH\u0014¢\u0006\u0004\b)\u0010\u000eJ\u0015\u0010*\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b*\u0010\fJ\u000f\u0010,\u001a\u00020\nH\u0000¢\u0006\u0004\b+\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/yandex/go/places/impl/ui/payments/checkout/flex/custom_view/checkout_buttons/PlacesPaymentsCheckoutButtonsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Llcc0;", "paymentsCheckoutInteractor", "<init>", "(Landroid/content/Context;Llcc0;)V", "Lcom/yandex/go/places/impl/ui/payments/checkout/flex/custom_view/checkout_buttons/PlacesPaymentsCheckoutButtonsViewProperties;", Constants.KEY_DATA, "Lzy11;", "initViews", "(Lcom/yandex/go/places/impl/ui/payments/checkout/flex/custom_view/checkout_buttons/PlacesPaymentsCheckoutButtonsViewProperties;)V", "clearPayments", "()V", "clearViews", "Lzzs;", "geoPoint", "loadPresetPaymentMethod", "(Lzzs;)V", "Lcom/yandex/go/places/impl/domain/entities/payments/PlacesPaymentsCheckoutButtonsViewUiState;", ClidProvider.STATE, "updateUiState", "(Lcom/yandex/go/places/impl/domain/entities/payments/PlacesPaymentsCheckoutButtonsViewUiState;)V", "Llea0;", "chosenPaymentMethod", "setPaymentMethod", "(Llea0;)V", "Landroid/widget/TextView;", "", "newText", "setTextWithVisibility", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Lkotlin/Function2;", "Ltse;", "Lkotlin/coroutines/Continuation;", "", "block", "runOnMainThreadIfActive", "(Lwls;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAttachedToWindow", "onDetachedFromWindow", "bindData", "resetState$impl", "resetState", "Llcc0;", "Lema0;", "binding", "Lema0;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "Ll8x;", "paymentMethodsJob", "Ll8x;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesPaymentsCheckoutButtonsView extends FrameLayout {
    public static final int $stable = 8;
    private ema0 binding;
    private l8x paymentMethodsJob;
    private final lcc0 paymentsCheckoutInteractor;
    private final hbp0 scopeDelegate;

    public PlacesPaymentsCheckoutButtonsView(Context context, lcc0 lcc0Var) {
        super(context);
        this.paymentsCheckoutInteractor = lcc0Var;
        String d = qoi0.a(PlacesPaymentsCheckoutButtonsView.class).d();
        this.scopeDelegate = new hbp0(new czo0(14), d == null ? "" : d, null);
    }

    private final void clearPayments() {
        pcc0 pcc0Var = this.paymentsCheckoutInteractor.c;
        qcc0 qcc0Var = pcc0Var.c;
        ((g1a0) ((by90) qcc0Var.b.getValue()).d()).d();
        ((by90) qcc0Var.b.getValue()).dispose();
        pcc0Var.g = null;
        pcc0Var.h = null;
        pcc0Var.i = null;
        pcc0Var.j = null;
        pcc0Var.k = null;
        pcc0Var.l = null;
        l8x l8xVar = this.paymentMethodsJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.paymentMethodsJob = null;
    }

    private final void clearViews() {
        removeAllViews();
        this.binding = null;
    }

    private final void initViews(PlacesPaymentsCheckoutButtonsViewProperties data) {
        View inflate = LayoutInflater.from(getContext()).inflate(uuh0.payments_checkout_buttons, (ViewGroup) this, false);
        int i = o6h0.button_placeholder;
        if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
            i = o6h0.card_container;
            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
            if (goLinearLayout != null) {
                i = o6h0.card_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                if (appCompatImageView != null) {
                    i = o6h0.card_info;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView != null) {
                        i = o6h0.content_container;
                        GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i, inflate);
                        if (goConstraintLayout != null) {
                            i = o6h0.content_container_header;
                            GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                            if (goFrameLayout != null) {
                                i = o6h0.error_container;
                                GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i, inflate);
                                if (goFrameLayout2 != null) {
                                    i = o6h0.error_title;
                                    if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                                        i = o6h0.header_placeholder;
                                        if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                            i = o6h0.payment_button;
                                            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                                            if (buttonComponent != null) {
                                                i = o6h0.placeholder_container;
                                                GoFrameLayout goFrameLayout3 = (GoFrameLayout) cma1.O(i, inflate);
                                                if (goFrameLayout3 != null) {
                                                    i = o6h0.retry_button;
                                                    ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                                                    if (buttonComponent2 != null) {
                                                        i = o6h0.total_price_title;
                                                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                                        if (robotoTextView2 != null) {
                                                            i = o6h0.total_price_value;
                                                            RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                                                            if (robotoTextView3 != null) {
                                                                GoFrameLayout goFrameLayout4 = (GoFrameLayout) inflate;
                                                                ema0 ema0Var = new ema0(goFrameLayout4, goLinearLayout, appCompatImageView, robotoTextView, goConstraintLayout, goFrameLayout, goFrameLayout2, buttonComponent, goFrameLayout3, buttonComponent2, robotoTextView2, robotoTextView3);
                                                                String str = data.e;
                                                                String str2 = data.g;
                                                                setTextWithVisibility(robotoTextView2, str);
                                                                setTextWithVisibility(robotoTextView3, data.f);
                                                                goFrameLayout.setContentDescription(((Object) robotoTextView2.getText()) + Extension.FIX_SPACE + ((Object) robotoTextView3.getText()));
                                                                mia1.c(goLinearLayout);
                                                                if (!evu0.J(str2)) {
                                                                    buttonComponent.setText(str2);
                                                                }
                                                                c.z(new t9b0(22, this), goLinearLayout);
                                                                buttonComponent.setDebounceClickListener(new wnb0(5, this));
                                                                buttonComponent2.setDebounceClickListener(new yo90(11, this, data));
                                                                tje.N(this.scopeDelegate, null, null, new PlacesPaymentsCheckoutButtonsView$initViews$lambda$0$$inlined$safeCollectIn$1(this.paymentsCheckoutInteractor.c.f, null, this), 3);
                                                                addView(goFrameLayout4);
                                                                this.binding = ema0Var;
                                                                return;
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
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initViews$lambda$0$0(PlacesPaymentsCheckoutButtonsView placesPaymentsCheckoutButtonsView) {
        com.yandex.go.coroutines.b.g(placesPaymentsCheckoutButtonsView.scopeDelegate, null, null, new PlacesPaymentsCheckoutButtonsView$initViews$1$1$1(placesPaymentsCheckoutButtonsView, null), 3);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0$1(PlacesPaymentsCheckoutButtonsView placesPaymentsCheckoutButtonsView) {
        com.yandex.go.coroutines.b.g(placesPaymentsCheckoutButtonsView.scopeDelegate, null, null, new PlacesPaymentsCheckoutButtonsView$initViews$1$2$1(placesPaymentsCheckoutButtonsView, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0$2(PlacesPaymentsCheckoutButtonsView placesPaymentsCheckoutButtonsView, PlacesPaymentsCheckoutButtonsViewProperties placesPaymentsCheckoutButtonsViewProperties) {
        placesPaymentsCheckoutButtonsView.loadPresetPaymentMethod(placesPaymentsCheckoutButtonsViewProperties.h);
    }

    private final void loadPresetPaymentMethod(zzs geoPoint) {
        updateUiState(PlacesPaymentsCheckoutButtonsViewUiState.LOADING);
        this.paymentMethodsJob = com.yandex.go.coroutines.b.g(this.scopeDelegate, uyj.a, null, new PlacesPaymentsCheckoutButtonsView$loadPresetPaymentMethod$1(this, geoPoint, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runOnMainThreadIfActive(wls wlsVar, Continuation<? super zy11> continuation) {
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new PlacesPaymentsCheckoutButtonsView$runOnMainThreadIfActive$2(wlsVar, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPaymentMethod(lea0 chosenPaymentMethod) {
        String id;
        String str = null;
        if (chosenPaymentMethod == null || !chosenPaymentMethod.e()) {
            chosenPaymentMethod = null;
        }
        this.paymentsCheckoutInteractor.c.g = chosenPaymentMethod;
        if (chosenPaymentMethod != null && (id = chosenPaymentMethod.getId()) != null) {
            str = this.paymentsCheckoutInteractor.c(id, false);
        }
        ema0 ema0Var = this.binding;
        if (ema0Var != null) {
            setTextWithVisibility(ema0Var.d, str);
            ema0Var.g.setEnabled(chosenPaymentMethod != null);
            GoLinearLayout goLinearLayout = ema0Var.b;
            lcc0 lcc0Var = this.paymentsCheckoutInteractor;
            if (str == null) {
                str = "";
            }
            goLinearLayout.setContentDescription(lcc0Var.b(str));
            lcc0 lcc0Var2 = this.paymentsCheckoutInteractor;
            AppCompatImageView appCompatImageView = ema0Var.c;
            pcc0 pcc0Var = lcc0Var2.c;
            setPaymentMethod$lambda$2$0(ema0Var, pcc0Var.h);
            lea0 lea0Var = pcc0Var.g;
            if (lea0Var != null) {
                ((g1a0) ((by90) pcc0Var.c.b.getValue()).d()).c(appCompatImageView, lea0Var);
            }
        }
    }

    private static final zy11 setPaymentMethod$lambda$2$0(ema0 ema0Var, Drawable drawable) {
        ema0Var.c.setImageDrawable(drawable);
        return zy11.a;
    }

    private final void setTextWithVisibility(TextView textView, String str) {
        textView.setVisibility(str == null || evu0.J(str) ? 8 : 0);
        textView.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUiState(PlacesPaymentsCheckoutButtonsViewUiState state) {
        ema0 ema0Var = this.binding;
        if (ema0Var != null) {
            ema0Var.h.setVisibility(state == PlacesPaymentsCheckoutButtonsViewUiState.LOADING ? 0 : 8);
            ema0Var.e.setVisibility(state == PlacesPaymentsCheckoutButtonsViewUiState.SUCCESS ? 0 : 8);
            ema0Var.f.setVisibility(state == PlacesPaymentsCheckoutButtonsViewUiState.ERROR ? 0 : 8);
        }
    }

    public final void bindData(PlacesPaymentsCheckoutButtonsViewProperties data) {
        resetState$impl();
        lcc0 lcc0Var = this.paymentsCheckoutInteractor;
        zzs zzsVar = data.h;
        String str = data.a;
        String str2 = data.d;
        String str3 = data.f;
        pcc0 pcc0Var = lcc0Var.c;
        pcc0Var.i = zzsVar;
        pcc0Var.k = str;
        pcc0Var.l = str2;
        pcc0Var.j = str3;
        ((g1a0) ((by90) pcc0Var.c.b.getValue()).d()).a();
        PaymentIconType paymentIconType = PaymentIconType.ADD_CARD;
        bia0 bia0Var = pcc0Var.d;
        Context context = pcc0Var.a;
        ((qy90) bia0Var).getClass();
        pcc0Var.h = tje.y(qy90.b(paymentIconType), context);
        initViews(data);
        loadPresetPaymentMethod(data.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scopeDelegate.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scopeDelegate.b();
    }

    public final void resetState$impl() {
        clearPayments();
        clearViews();
    }
}
