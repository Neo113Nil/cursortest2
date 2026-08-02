package com.yandex.go.taxi.order.support.ui.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.image.api.domain.models.ImageModel$Tag$Theme;
import com.yandex.go.taxi.order.support.analytics.SupportAnalytics$Source;
import com.yandex.go.taxi.order.support.domain.entities.SupportButtonsArrangement;
import defpackage.akw0;
import defpackage.bdc;
import defpackage.bhw0;
import defpackage.bjw0;
import defpackage.c230;
import defpackage.cma1;
import defpackage.ejw0;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.ip11;
import defpackage.kdc;
import defpackage.kok0;
import defpackage.lnv0;
import defpackage.m2y;
import defpackage.nac;
import defpackage.niw0;
import defpackage.ny61;
import defpackage.obv;
import defpackage.oew0;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.piw0;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.s5w0;
import defpackage.s8o;
import defpackage.scc;
import defpackage.tje;
import defpackage.tpt0;
import defpackage.w511;
import defpackage.wiw0;
import defpackage.wug0;
import defpackage.xiw0;
import defpackage.xng0;
import defpackage.yiw0;
import defpackage.zkh0;
import defpackage.zmh;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/yandex/go/taxi/order/support/ui/details/SupportDetailsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lyiw0;", "Landroid/content/Context;", "context", "Lejw0;", "presenter", "Lpav;", "imageLoader", "Lip11;", "typefaceDelegate", "<init>", "(Landroid/content/Context;Lejw0;Lpav;Lip11;)V", "Lc230;", "insetsType", "()Lc230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lyiw0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onBackPressed", "Lejw0;", "Lpav;", "", "itemMargin$delegate", "Li3y;", "getItemMargin", "()I", "itemMargin", "Lkdc;", "defaultTextColor$delegate", "getDefaultTextColor", "()Lkdc;", "defaultTextColor", "xiw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SupportDetailsModalView extends SlideableBindingModalView<yiw0> {
    public static final int $stable = 8;

    /* renamed from: defaultTextColor$delegate, reason: from kotlin metadata */
    private final i3y defaultTextColor;
    private final pav imageLoader;

    /* renamed from: itemMargin$delegate, reason: from kotlin metadata */
    private final i3y itemMargin;
    private final ejw0 presenter;

    public SupportDetailsModalView(Context context, ejw0 ejw0Var, pav pavVar, ip11 ip11Var) {
        super(context);
        this.presenter = ejw0Var;
        this.imageLoader = pavVar;
        this.itemMargin = a.a(new kok0(context, 11));
        this.defaultTextColor = a.a(new bhw0(1));
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        qdb1.b(this, new lnv0(10, this));
        getBinding().e.setTypeface(((zmh) ip11Var).d());
    }

    public static final /* synthetic */ yiw0 access$getBinding(SupportDetailsModalView supportDetailsModalView) {
        return supportDetailsModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bdc defaultTextColor_delegate$lambda$0() {
        return new bdc(xng0.textOnControlMinor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kdc getDefaultTextColor() {
        return (kdc) this.defaultTextColor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getItemMargin() {
        return ((Number) this.itemMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(SupportDetailsModalView supportDetailsModalView) {
        return supportDetailsModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int itemMargin_delegate$lambda$0(Context context) {
        return tje.r(wug0.support_details_button_small_margin, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$onTouchOutside(ejw0 ejw0Var) {
        piw0 piw0Var = ejw0Var.z;
        SupportAnalytics$Source supportAnalytics$Source = SupportAnalytics$Source.OUT_OF_SCREEN;
        piw0Var.getClass();
        piw0Var.b(piw0.a("DetailsScreen", "Disappear"), new Pair("source", supportAnalytics$Source));
        ((bjw0) ejw0Var.x.a).r(new qu(9));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public yiw0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.support_details_modal_view, parent, false);
        int i = p8h0.icon_spot;
        View O = cma1.O(i, inflate);
        if (O != null) {
            m2y o = m2y.o(O);
            i = p8h0.support_buttons_container;
            LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
            if (linearLayout != null) {
                i = p8h0.support_description;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = p8h0.support_title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new yiw0((GoLinearLayout) inflate, o, linearLayout, robotoTextView, robotoTextView2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new oew0(1, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int i;
        LinearLayout.LayoutParams layoutParams;
        super.onAttachedToWindow();
        setOnTouchOutsideListener(new lnv0(11, this.presenter));
        ejw0 ejw0Var = this.presenter;
        xiw0 xiw0Var = new xiw0(this);
        ejw0Var.Bg(xiw0Var);
        piw0 piw0Var = ejw0Var.z;
        akw0 akw0Var = ejw0Var.y;
        String str = akw0Var.a;
        piw0Var.getClass();
        piw0Var.b(piw0.a("DetailsScreen", "Appear"), new Pair("name", str));
        yiw0 access$getBinding = access$getBinding(this);
        String str2 = akw0Var.b;
        yiw0 access$getBinding2 = access$getBinding(this);
        int i2 = 2;
        int i3 = 0;
        ImageModel$Tag$Theme imageModel$Tag$Theme = null;
        if (str2 == null || evu0.J(str2)) {
            xiw0Var.h();
        } else {
            nac nacVar = (nac) this.imageLoader.a((ImageView) access$getBinding2.b.d);
            nacVar.i = new oew0(i2, xiw0Var);
            nacVar.h = new s5w0(7, xiw0Var);
            nacVar.b(new obv(str2, imageModel$Tag$Theme, 6, i3));
        }
        access$getBinding.e.setText(akw0Var.c);
        access$getBinding.d.setText(akw0Var.d);
        SupportButtonsArrangement supportButtonsArrangement = akw0Var.e;
        List list = akw0Var.f;
        LinearLayout linearLayout = access$getBinding(this).c;
        linearLayout.removeAllViews();
        int i4 = wiw0.a[supportButtonsArrangement.ordinal()];
        if (i4 == 1) {
            i = 1;
        } else {
            if (i4 != 2) {
                w511.b();
                return;
            }
            i = 0;
        }
        linearLayout.setOrientation(i);
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                scc.m();
                throw null;
            }
            niw0 niw0Var = (niw0) obj;
            ButtonComponent buttonComponent = new ButtonComponent(linearLayout.getContext(), null, 0, 6, null);
            boolean z = i5 == scc.f(list);
            int i7 = wiw0.a[supportButtonsArrangement.ordinal()];
            if (i7 == 1) {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, 0, 0, z ? 0 : getItemMargin());
            } else if (i7 != 2) {
                w511.b();
                return;
            } else {
                layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
                layoutParams.setMargins(0, 0, z ? 0 : getItemMargin(), 0);
            }
            buttonComponent.setLayoutParams(layoutParams);
            buttonComponent.setButtonSize(3);
            buttonComponent.setButtonTitleColor(getDefaultTextColor());
            buttonComponent.setButtonBackground(s8o.m(niw0Var.b, buttonComponent.getContext()));
            buttonComponent.setText(niw0Var.c);
            buttonComponent.setDebounceClickListener(new tpt0(24, this, niw0Var));
            linearLayout.addView(buttonComponent);
            i5 = i6;
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        ejw0 ejw0Var = this.presenter;
        piw0 piw0Var = ejw0Var.z;
        SupportAnalytics$Source supportAnalytics$Source = SupportAnalytics$Source.BACK_BUTTON;
        piw0Var.getClass();
        piw0Var.b(piw0.a("DetailsScreen", "Disappear"), new Pair("source", supportAnalytics$Source));
        ((bjw0) ejw0Var.x.a).r(new qu(9));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
