package com.yandex.go.order.tariffs_suggest.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoView;
import defpackage.b6h0;
import defpackage.cma1;
import defpackage.huh0;
import defpackage.jb80;
import defpackage.ny61;
import defpackage.t1w;
import defpackage.tje;
import defpackage.ub60;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010#\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lcom/yandex/go/order/tariffs_suggest/ui/OrderWithTariffButtonView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onAttachedToWindow", "()V", "Landroid/graphics/drawable/Drawable;", "shadowDrawable", "renderButtonsContainerShadow", "(Landroid/graphics/drawable/Drawable;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Ljb80;", "binding", "Ljb80;", "baseBottomPadding", CA20Status.STATUS_USER_I, "Lcom/yandex/go/design/view/GoView;", "getFooterShadow", "()Lcom/yandex/go/design/view/GoView;", "footerShadow", "Lru/yandex/taxi/design/ButtonComponent;", "getButtonAccept", "()Lru/yandex/taxi/design/ButtonComponent;", "buttonAccept", "getButtonExpandCollapse", "buttonExpandCollapse", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderWithTariffButtonView extends GoConstraintLayout {
    private final int baseBottomPadding;
    private final jb80 binding;

    public OrderWithTariffButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(huh0.order_with_tariff_button, this);
        int i2 = b6h0.button_container;
        GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i2, this);
        if (goFrameLayout != null) {
            i2 = b6h0.button_expand_collapse;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, this);
            if (buttonComponent != null) {
                i2 = b6h0.button_tariff_action;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i2, this);
                if (buttonComponent2 != null) {
                    i2 = b6h0.footer_shadow;
                    GoView goView = (GoView) cma1.O(i2, this);
                    if (goView != null) {
                        this.binding = new jb80(this, goFrameLayout, buttonComponent, buttonComponent2, goView);
                        this.baseBottomPadding = goFrameLayout.getPaddingBottom();
                        tje.i(this, 119, new ub60(13, this));
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(OrderWithTariffButtonView orderWithTariffButtonView, t1w t1wVar) {
        int i = t1wVar.d;
        GoFrameLayout goFrameLayout = orderWithTariffButtonView.binding.b;
        goFrameLayout.setPadding(goFrameLayout.getPaddingLeft(), goFrameLayout.getPaddingTop(), goFrameLayout.getPaddingRight(), orderWithTariffButtonView.baseBottomPadding + i);
        return false;
    }

    @Override // com.yandex.go.design.view.GoConstraintLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        getButtonAccept().invalidate();
    }

    public final ButtonComponent getButtonAccept() {
        return this.binding.d;
    }

    public final ButtonComponent getButtonExpandCollapse() {
        return this.binding.c;
    }

    public final GoView getFooterShadow() {
        return this.binding.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    public final void renderButtonsContainerShadow(Drawable shadowDrawable) {
        Rect rect = new Rect();
        shadowDrawable.getPadding(rect);
        xw31.E(getFooterShadow(), Integer.valueOf(-rect.left), Integer.valueOf(-rect.top), Integer.valueOf(-rect.right), Integer.valueOf(-rect.bottom));
        getFooterShadow().setBackground(shadowDrawable);
    }

    public OrderWithTariffButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OrderWithTariffButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ OrderWithTariffButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
