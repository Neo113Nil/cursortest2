package com.yandex.go.taxi.order.recalculation.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a0f0;
import defpackage.b0f0;
import defpackage.c0f0;
import defpackage.cma1;
import defpackage.i3y;
import defpackage.kdd0;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p8h0;
import defpackage.pzt0;
import defpackage.qd00;
import defpackage.qdb1;
import defpackage.r0d0;
import defpackage.tje;
import defpackage.x4e;
import defpackage.x770;
import defpackage.zkh0;
import defpackage.zze0;
import java.util.HashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/yandex/go/taxi/order/recalculation/ui/PriceRecalculationModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lb0f0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/order/recalculation/ui/b;", "presenter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/order/recalculation/ui/b;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onDismissManually", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lb0f0;", "Lcom/yandex/go/taxi/order/recalculation/ui/b;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "floatBackButton$delegate", "Li3y;", "getFloatBackButton", "()Lru/yandex/taxi/design/FloatButtonIconComponent;", "floatBackButton", "", "shimmeringColor$delegate", "getShimmeringColor", "()I", "shimmeringColor", "a0f0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PriceRecalculationModalView extends SlideableBindingModalView<b0f0> {
    public static final int $stable = 8;

    /* renamed from: floatBackButton$delegate, reason: from kotlin metadata */
    private final i3y floatBackButton;
    private final b presenter;

    /* renamed from: shimmeringColor$delegate, reason: from kotlin metadata */
    private final i3y shimmeringColor;

    public PriceRecalculationModalView(Context context, b bVar) {
        super(context);
        this.presenter = bVar;
        r0d0 r0d0Var = new r0d0(20, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.floatBackButton = kotlin.a.b(lazyThreadSafetyMode, r0d0Var);
        this.shimmeringColor = kotlin.a.b(lazyThreadSafetyMode, new qd00(context, 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FloatButtonIconComponent floatBackButton_delegate$lambda$0(PriceRecalculationModalView priceRecalculationModalView) {
        return qdb1.b(priceRecalculationModalView, new zze0(priceRecalculationModalView.presenter, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void floatBackButton_delegate$lambda$0$onBackButtonPressed(b bVar) {
        bVar.Ng();
        ((c0f0) bVar.Dg()).dismissView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FloatButtonIconComponent getFloatBackButton() {
        return (FloatButtonIconComponent) this.floatBackButton.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getShimmeringColor() {
        return ((Number) this.shimmeringColor.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$onInitialCancelPressed(b bVar) {
        bVar.G.m(null);
        ((c0f0) bVar.Dg()).dismissView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int shimmeringColor_delegate$lambda$0(Context context) {
        return context.getColor(mqg0.transparent);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public b0f0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.price_recalculation_modal_view, parent, false);
        int i = p8h0.bottom_container;
        if (((LinearLayout) cma1.O(i, inflate)) != null) {
            i = p8h0.cancel_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = p8h0.confirm_button;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent != null) {
                    i = p8h0.description;
                    ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                    if (listItemComponent2 != null) {
                        i = p8h0.header;
                        ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                        if (listHeaderComponent != null) {
                            i = p8h0.recalculation_price_image;
                            ImageView imageView = (ImageView) cma1.O(i, inflate);
                            if (imageView != null) {
                                i = p8h0.recalculation_price_image_shimmering;
                                ShimmeringFrameLayout shimmeringFrameLayout = (ShimmeringFrameLayout) cma1.O(i, inflate);
                                if (shimmeringFrameLayout != null) {
                                    i = p8h0.recalculation_price_text;
                                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                                    if (robotoTextView != null) {
                                        i = p8h0.recalculation_price_text_shimmering;
                                        ShimmeringFrameLayout shimmeringFrameLayout2 = (ShimmeringFrameLayout) cma1.O(i, inflate);
                                        if (shimmeringFrameLayout2 != null) {
                                            i = p8h0.shadow;
                                            if (((ImageView) cma1.O(i, inflate)) != null) {
                                                return new b0f0((ConstraintLayout) inflate, buttonComponent, listItemComponent, listItemComponent2, listHeaderComponent, imageView, shimmeringFrameLayout, robotoTextView, shimmeringFrameLayout2);
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
        getBinding().b.setDebounceClickListener(new zze0(this.presenter, 1));
        b bVar = this.presenter;
        bVar.Bg(new a0f0(this));
        kdd0 kdd0Var = bVar.G;
        x770 x770Var = (x770) kdd0Var.a;
        x770Var.a.a("PriceChangeCard.Shown", x4e.p("order_id", ((o2y0) kdd0Var.d).b().a), 2, new HashMap());
        bVar.Mg();
        pzt0 pzt0Var = bVar.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.N = tje.N(bVar.Jg(), null, null, new PriceRecalculationPresenter$loadAlertWarningImage$1(bVar, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        this.presenter.Ng();
    }
}
