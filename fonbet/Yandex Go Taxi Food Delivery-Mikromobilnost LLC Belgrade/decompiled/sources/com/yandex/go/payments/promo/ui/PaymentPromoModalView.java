package com.yandex.go.payments.promo.ui;

import android.app.Activity;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.ak80;
import defpackage.cma1;
import defpackage.dt41;
import defpackage.e6h0;
import defpackage.ft41;
import defpackage.luh0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.obv;
import defpackage.og21;
import defpackage.ptv;
import defpackage.qfo;
import defpackage.sha0;
import defpackage.tha0;
import defpackage.v770;
import defpackage.yo90;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.utils.c;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.widget.BindingModalView;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0014¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'¨\u0006("}, d2 = {"Lcom/yandex/go/payments/promo/ui/PaymentPromoModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Ltha0;", "Lptv;", "infoScreen", "Lqfo;", "eventInfo", "Landroid/app/Activity;", "activity", "Ldt41;", "webViewRouter", "Lru/yandex/taxi/utils/c;", "getImageHelper", "Lsha0;", "paymentPromoModalViewAnalytics", "Lru/yandex/taxi/deeplinks/f;", "deeplinkUtils", "<init>", "(Lptv;Lqfo;Landroid/app/Activity;Ldt41;Lru/yandex/taxi/utils/c;Lsha0;Lru/yandex/taxi/deeplinks/f;)V", "", "url", "Lzy11;", "onInfoClicked", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltha0;", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "onDismissManually", "()V", "Lqfo;", "Landroid/app/Activity;", "Ldt41;", "Lsha0;", "Lru/yandex/taxi/deeplinks/f;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentPromoModalView extends BindingModalView<tha0> {
    public static final int $stable = 8;
    private final Activity activity;
    private final f deeplinkUtils;
    private final qfo eventInfo;
    private final sha0 paymentPromoModalViewAnalytics;
    private final dt41 webViewRouter;

    public PaymentPromoModalView(ptv ptvVar, qfo qfoVar, Activity activity, dt41 dt41Var, c cVar, sha0 sha0Var, f fVar) {
        super(activity);
        this.eventInfo = qfoVar;
        this.activity = activity;
        this.webViewRouter = dt41Var;
        this.paymentPromoModalViewAnalytics = sha0Var;
        this.deeplinkUtils = fVar;
        if (qfoVar != null) {
            sha0Var.a(qfoVar, "Shown");
        }
        getBinding().f.setText(ptvVar.a);
        getBinding().c.setText(ptvVar.b);
        AppCompatImageView appCompatImageView = getBinding().d;
        String str = ptvVar.c;
        ((nac) cVar.a.a(appCompatImageView)).b(new obv(str, null, 6, 0));
        getBinding().e.setText(ptvVar.e);
        getBinding().e.setDebounceClickListener(new yo90(6, this, ptvVar));
        ru.yandex.taxi.design.utils.c.z(new ak80(17, this), getBinding().b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PaymentPromoModalView paymentPromoModalView, ptv ptvVar) {
        paymentPromoModalView.onInfoClicked(ptvVar.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$1(PaymentPromoModalView paymentPromoModalView) {
        paymentPromoModalView.onDismissManually();
        paymentPromoModalView.dismiss();
        return zy11.a;
    }

    private final void onInfoClicked(String url) {
        qfo qfoVar = this.eventInfo;
        if (qfoVar != null) {
            this.paymentPromoModalViewAnalytics.a(qfoVar, "ButtonTapped");
        }
        if (og21.b(Uri.parse(url))) {
            ft41 ft41Var = (ft41) this.webViewRouter;
            ft41Var.Q(new UiWebViewConfig(new CoreWebViewConfig(url, null, null, false, false, false, false, false, false, false, false, false, false, null, null, null, false, 131070, null), null, false, false, false, false, null, true, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194174, null));
        } else {
            this.deeplinkUtils.b(this.activity, url, v770.b);
        }
        dismiss();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public tha0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(luh0.payment_promo_modal_view, parent, false);
        int i = e6h0.close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
        if (appCompatImageView != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            i = e6h0.details;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = e6h0.image;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, inflate);
                if (appCompatImageView2 != null) {
                    i = e6h0.info_button;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent != null) {
                        i = e6h0.title;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView2 != null) {
                            return new tha0(linearLayout, appCompatImageView, robotoTextView, appCompatImageView2, buttonComponent, robotoTextView2);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.BindingModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return getBinding().a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        qfo qfoVar = this.eventInfo;
        if (qfoVar != null) {
            this.paymentPromoModalViewAnalytics.a(qfoVar, "Dismiss");
        }
    }
}
