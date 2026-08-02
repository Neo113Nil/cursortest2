package com.yandex.go.payments.summary.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.payments.paymentlist.domain.k;
import com.yandex.go.payments.paymentlist.ui.PaymentMethodChooserView;
import defpackage.c230;
import defpackage.e230;
import defpackage.e6h0;
import defpackage.gca0;
import defpackage.iy2;
import defpackage.jl40;
import defpackage.kca0;
import defpackage.l4m;
import defpackage.luh0;
import defpackage.m4m;
import defpackage.mrg0;
import defpackage.p4m;
import defpackage.pav;
import defpackage.pwf0;
import defpackage.rp31;
import defpackage.rxz;
import defpackage.sba0;
import defpackage.ssu;
import defpackage.tje;
import defpackage.u0a0;
import defpackage.utg0;
import defpackage.vo51;
import defpackage.vsz0;
import defpackage.w511;
import defpackage.x4c;
import defpackage.xw31;
import defpackage.xyi;
import defpackage.yes0;
import defpackage.z0a0;
import defpackage.za60;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001?BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0019H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0019H\u0014¢\u0006\u0004\b(\u0010'J\u0017\u0010+\u001a\u00020\u00192\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/R\u001a\u00101\u001a\u0002008\u0004X\u0084\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010>\u001a\u0002088TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lcom/yandex/go/payments/summary/ui/PaymentMethodsListModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lkca0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lz0a0;", "paymentImageLoader", "Lvo51;", "sdkRouterFactory", "Lrxz;", "loyaltyTabletFactory", "Lcom/yandex/go/payments/paymentlist/domain/k;", "presenter", "Lvsz0;", "toolbarHolder", "Lu0a0;", "paymentIconInfoFactory", "<init>", "(Landroid/content/Context;Lpav;Lz0a0;Lvo51;Lrxz;Lcom/yandex/go/payments/paymentlist/domain/k;Lvsz0;Lu0a0;)V", "", "isButtonVisible", "Lp4m;", ClidProvider.STATE, "Lzy11;", "configureButtonDone", "(ZLp4m;)V", "hasAddButton", "doneButtonVisible", "configureChooserView", "(ZZ)V", "Lgca0;", "configureToolbar", "(Lgca0;)V", "Le230;", "insetsType", "()Le230;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "Lcom/yandex/go/payments/paymentlist/domain/k;", "Lvsz0;", "Lu0a0;", "Lcom/yandex/go/payments/paymentlist/ui/PaymentMethodChooserView;", "paymentMethodChooserView", "Lcom/yandex/go/payments/paymentlist/ui/PaymentMethodChooserView;", "getPaymentMethodChooserView", "()Lcom/yandex/go/payments/paymentlist/ui/PaymentMethodChooserView;", "Lru/yandex/taxi/design/ButtonComponent;", "buttonDone", "Lru/yandex/taxi/design/ButtonComponent;", "", "bottomMargin", CA20Status.STATUS_USER_I, "bottomMarginWithAddButton", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "sba0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public class PaymentMethodsListModalView extends SlideableModalView implements kca0 {
    public static final int $stable = 8;
    private final int bottomMargin;
    private final int bottomMarginWithAddButton;
    private final ButtonComponent buttonDone;
    private final u0a0 paymentIconInfoFactory;
    private final PaymentMethodChooserView paymentMethodChooserView;
    private final k presenter;
    private final vsz0 toolbarHolder;

    public PaymentMethodsListModalView(Context context, pav pavVar, z0a0 z0a0Var, vo51 vo51Var, rxz rxzVar, k kVar, vsz0 vsz0Var, u0a0 u0a0Var) {
        super(context);
        this.presenter = kVar;
        this.toolbarHolder = vsz0Var;
        this.paymentIconInfoFactory = u0a0Var;
        int i = e6h0.payment_method_chooser_view;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        PaymentMethodChooserView paymentMethodChooserView = (PaymentMethodChooserView) ((View) rp31.d(this, i));
        this.paymentMethodChooserView = paymentMethodChooserView;
        this.buttonDone = (ButtonComponent) ((View) rp31.d(this, e6h0.payment_method_chooser_done));
        this.bottomMargin = tje.r(utg0.payment_method_chooser_margin_bottom, getContext());
        this.bottomMarginWithAddButton = tje.r(utg0.payment_method_chooser_margin_bottom_with_add_card_button, getContext());
        ((x4c) vo51Var).getClass();
        paymentMethodChooserView.init(z0a0Var, pavVar, kotlin.a.a(new xyi(7)), rxzVar, kVar, u0a0Var);
        RecyclerView paymentMethodList = paymentMethodChooserView.getPaymentMethodList();
        paymentMethodList.setClipToPadding(false);
        paymentMethodList.getLayoutParams().height = -2;
        vsz0Var.c().setVisibility(0);
        xw31.I(paymentMethodList, null, null, null, Integer.valueOf(tje.r(mrg0.go_design_m_space, getContext())));
        xw31.E(paymentMethodChooserView, null, Integer.valueOf(xw31.g(paymentMethodChooserView).topMargin + tje.u(60, getContext())), null, null);
        configureChooserView(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureButtonDone(boolean isButtonVisible, p4m state) {
        if (!(state instanceof m4m)) {
            if (jl40.l(state, l4m.a)) {
                this.buttonDone.setVisibility(8);
                return;
            } else {
                w511.b();
                return;
            }
        }
        this.buttonDone.setVisibility(isButtonVisible ? 0 : 8);
        m4m m4mVar = (m4m) state;
        this.buttonDone.setEnabled(m4mVar.c());
        this.buttonDone.setButtonBackground(m4mVar.a());
        this.buttonDone.setButtonTitleColor(m4mVar.e());
        this.buttonDone.setText(m4mVar.d());
        this.buttonDone.setDebounceClickListener(!isButtonVisible ? pwf0.c : new iy2(27, this, m4mVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureButtonDone$lambda$0(PaymentMethodsListModalView paymentMethodsListModalView, p4m p4mVar) {
        paymentMethodsListModalView.presenter.Og(((m4m) p4mVar).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureChooserView(boolean hasAddButton, boolean doneButtonVisible) {
        xw31.x((doneButtonVisible && hasAddButton) ? this.bottomMarginWithAddButton : doneButtonVisible ? this.bottomMargin : 0, this.paymentMethodChooserView);
        this.paymentMethodChooserView.setDoneButtonClickListener(new ssu(22, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureChooserView$lambda$0(PaymentMethodsListModalView paymentMethodsListModalView) {
        paymentMethodsListModalView.presenter.Og(za60.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureToolbar(gca0 state) {
        this.toolbarHolder.x(state.b, state.c);
        this.toolbarHolder.h(state.d);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return luh0.payment_method_chooser;
    }

    public final PaymentMethodChooserView getPaymentMethodChooserView() {
        return this.paymentMethodChooserView;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Lg(new sba0(this));
        int i = e6h0.title_bar;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        c.w((ViewStub) ((View) rp31.d(this, i)), this.toolbarHolder.c());
        this.toolbarHolder.A();
        this.toolbarHolder.l(new PaymentMethodsListModalView$onAttachedToWindow$1(0, this.presenter, k.class, "onToolbarActionClicked", "onToolbarActionClicked()V", 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        SimpleSpinnerModalView.Companion.getClass();
        yes0.b(this);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        super.setOnBackPressedListener(onBackPressedListener);
        this.toolbarHolder.j(onBackPressedListener);
    }
}
