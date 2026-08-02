package com.yandex.go.taxi.order.change.source.mvp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.taxi.order.change.source.mvp.UpdateSourcePointConfirmationModalView;
import defpackage.b821;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.f1h0;
import defpackage.f28;
import defpackage.g821;
import defpackage.h821;
import defpackage.k821;
import defpackage.n4h0;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.tje;
import defpackage.vng;
import defpackage.xng0;
import defpackage.zkh0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/go/taxi/order/change/source/mvp/UpdateSourcePointConfirmationModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lb821;", "Landroid/content/Context;", "context", "Lk821;", "presenter", "<init>", "(Landroid/content/Context;Lk821;)V", "", "applyThemeForChildrenByDefault", "()Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lb821;", "isArrowsPermanentlyHidden", "", "screenName", "()Ljava/lang/String;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lk821;", "h821", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UpdateSourcePointConfirmationModalView extends SlideableBindingModalView<b821> {
    public static final int $stable = 8;
    private final k821 presenter;

    public UpdateSourcePointConfirmationModalView(Context context, k821 k821Var) {
        super(context);
        this.presenter = k821Var;
        qdb1.c(this, new g821(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$closedByUser(k821 k821Var) {
        k821Var.y.a(k821Var.z, null);
        ((f28) k821Var.A.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$closedByUser$0(k821 k821Var) {
        k821Var.y.a(k821Var.z, null);
        ((f28) k821Var.A.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$closedByUser$1(k821 k821Var) {
        k821Var.y.a(k821Var.z, null);
        ((f28) k821Var.A.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$2$0(UpdateSourcePointConfirmationModalView updateSourcePointConfirmationModalView) {
        k821 k821Var = updateSourcePointConfirmationModalView.presenter;
        k821Var.Kg(true);
        tje.N(k821Var.Jg(), null, null, new UpdateSourcePointConfirmationPresenter$buttonClicked$1(k821Var, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        b821 binding = getBinding();
        binding.a.setBackground(vng.t(f1h0.bg_bottom_notification, getContext()));
        AppCompatImageView appCompatImageView = binding.c;
        appCompatImageView.setBackground(vng.t(n4h0.bg_pickup_update_icon, getContext()));
        appCompatImageView.setImageDrawable(vng.t(n4h0.ic_pickup_update_icon, getContext()));
        binding.e.applyTheme(themeType);
        binding.d.applyTheme(themeType);
        binding.b.applyTheme(themeType);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public b821 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.update_source_point_confirm_modal_view, parent, false);
        int i = p8h0.button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = p8h0.icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
            if (appCompatImageView != null) {
                i = p8h0.subtitle;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = p8h0.title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new b821(appCompatImageView, (ConstraintLayout) inflate, buttonComponent, robotoTextView, robotoTextView2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final k821 k821Var = this.presenter;
        final int i = 0;
        setOnSlideOutListener(new Runnable() { // from class: f821
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                k821 k821Var2 = k821Var;
                switch (i2) {
                    case 0:
                        UpdateSourcePointConfirmationModalView.onAttachedToWindow$closedByUser(k821Var2);
                        break;
                    case 1:
                        UpdateSourcePointConfirmationModalView.onAttachedToWindow$closedByUser$0(k821Var2);
                        break;
                    default:
                        UpdateSourcePointConfirmationModalView.onAttachedToWindow$closedByUser$1(k821Var2);
                        break;
                }
            }
        });
        final k821 k821Var2 = this.presenter;
        final int i2 = 1;
        setOnBackPressedListener(new Runnable() { // from class: f821
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                k821 k821Var22 = k821Var2;
                switch (i22) {
                    case 0:
                        UpdateSourcePointConfirmationModalView.onAttachedToWindow$closedByUser(k821Var22);
                        break;
                    case 1:
                        UpdateSourcePointConfirmationModalView.onAttachedToWindow$closedByUser$0(k821Var22);
                        break;
                    default:
                        UpdateSourcePointConfirmationModalView.onAttachedToWindow$closedByUser$1(k821Var22);
                        break;
                }
            }
        });
        final k821 k821Var3 = this.presenter;
        final int i3 = 2;
        setOnTouchOutsideListener(new Runnable() { // from class: f821
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                k821 k821Var22 = k821Var3;
                switch (i22) {
                    case 0:
                        UpdateSourcePointConfirmationModalView.onAttachedToWindow$closedByUser(k821Var22);
                        break;
                    case 1:
                        UpdateSourcePointConfirmationModalView.onAttachedToWindow$closedByUser$0(k821Var22);
                        break;
                    default:
                        UpdateSourcePointConfirmationModalView.onAttachedToWindow$closedByUser$1(k821Var22);
                        break;
                }
            }
        });
        k821 k821Var4 = this.presenter;
        h821 h821Var = new h821(this);
        k821Var4.Bg(h821Var);
        tje.N(k821Var4.Jg(), null, null, new UpdateSourcePointConfirmationPresenter$attachView$1(k821Var4, h821Var, null), 3);
        ButtonComponent buttonComponent = getBinding().b;
        buttonComponent.updateShimmeringColor(new bdc(xng0.controlMinor));
        buttonComponent.setDebounceClickListener(new g821(this, i));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        getBinding().b.setDebounceClickListener(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "UpdateSourcePointConfirmationModalView";
    }
}
