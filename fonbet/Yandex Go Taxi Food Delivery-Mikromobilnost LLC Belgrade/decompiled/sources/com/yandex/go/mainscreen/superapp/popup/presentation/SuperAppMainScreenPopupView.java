package com.yandex.go.mainscreen.superapp.popup.presentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.mainscreen.superapp.popup.presentation.SuperAppMainScreenPopupView;
import defpackage.a3w0;
import defpackage.ajh0;
import defpackage.ate0;
import defpackage.cma1;
import defpackage.ecw0;
import defpackage.f0h0;
import defpackage.fk7;
import defpackage.g18;
import defpackage.i3w0;
import defpackage.j3w0;
import defpackage.k3w0;
import defpackage.lnv0;
import defpackage.lx4;
import defpackage.mrg0;
import defpackage.nwt0;
import defpackage.ny61;
import defpackage.owt0;
import defpackage.r3w0;
import defpackage.t1w;
import defpackage.tje;
import defpackage.vng;
import defpackage.y4n;
import defpackage.yth0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 72\u00020\u0001:\u000289B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0019\u0010\u000eJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006:"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/popup/presentation/SuperAppMainScreenPopupView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "La3w0;", "presenter", "<init>", "(Landroid/content/Context;La3w0;)V", "", "isVisible", "Lzy11;", "animateVisibility", "(Z)V", "animatePopupAppearance", "()V", "animatePopupDisappearance", "", CaretView.ALPHA_PROPERTY, "animateShadow", "(F)V", "finalPosition", "Lowt0;", "animationSpringForce", "(F)Lowt0;", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "La3w0;", "Lecw0;", "binding", "Lecw0;", "Lru/yandex/taxi/design/ListItemComponent;", "hint", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/design/ButtonComponent;", "reloadButton", "Lru/yandex/taxi/design/ButtonComponent;", "orderTaxiButton", "orderTaxiByPhoneCallButton", "Lg18;", "insetsCancellable", "Lg18;", "Lnwt0;", "showAnimation", "Lnwt0;", "hideAnimation", "Landroid/view/ViewPropertyAnimator;", "shadowAnimation", "Landroid/view/ViewPropertyAnimator;", "getContainerHeight", "()F", "containerHeight", "Companion", "k3w0", "j3w0", "popup"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperAppMainScreenPopupView extends GoFrameLayout {
    private static final float ANIMATION_DAMPING_BOUNCY = 0.8f;
    private static final long ANIMATION_DURATION_MS = 600;
    private static final float ANIMATION_DURATION_S = 0.6f;
    private static final float ANIMATION_STIFFNESS = 100.0f;
    public static final j3w0 Companion = new j3w0();
    private final ecw0 binding;
    private nwt0 hideAnimation;
    private final ListItemComponent hint;
    private g18 insetsCancellable;
    private final ButtonComponent orderTaxiButton;
    private final ButtonComponent orderTaxiByPhoneCallButton;
    private final a3w0 presenter;
    private final ButtonComponent reloadButton;
    private ViewPropertyAnimator shadowAnimation;
    private nwt0 showAnimation;

    public SuperAppMainScreenPopupView(Context context, final a3w0 a3w0Var) {
        super(context, null, 0, 0, 14, null);
        this.presenter = a3w0Var;
        LayoutInflater.from(context).inflate(yth0.superapp_main_screen_popup, this);
        int i = ajh0.container;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) cma1.O(i, this);
        if (linearLayoutCompat != null) {
            i = ajh0.hint;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, this);
            if (listItemComponent != null) {
                i = ajh0.order_taxi_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, this);
                if (buttonComponent != null) {
                    i = ajh0.order_taxi_by_phone_call_button;
                    ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, this);
                    if (buttonComponent2 != null) {
                        i = ajh0.reload_button;
                        ButtonComponent buttonComponent3 = (ButtonComponent) cma1.O(i, this);
                        if (buttonComponent3 != null) {
                            i = ajh0.shadow;
                            SuperAppMainScreenPopupShadowView superAppMainScreenPopupShadowView = (SuperAppMainScreenPopupShadowView) cma1.O(i, this);
                            if (superAppMainScreenPopupShadowView != null) {
                                this.binding = new ecw0(this, linearLayoutCompat, listItemComponent, buttonComponent, buttonComponent2, buttonComponent3, superAppMainScreenPopupShadowView);
                                this.hint = listItemComponent;
                                this.reloadButton = buttonComponent3;
                                this.orderTaxiButton = buttonComponent;
                                this.orderTaxiByPhoneCallButton = buttonComponent2;
                                setVisibility(4);
                                final int i2 = 0;
                                buttonComponent3.setDebounceClickListener(new Runnable() { // from class: h3w0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i3 = i2;
                                        a3w0 a3w0Var2 = a3w0Var;
                                        switch (i3) {
                                            case 0:
                                                SuperAppMainScreenPopupView._init_$onReloadScreenClick(a3w0Var2);
                                                break;
                                            case 1:
                                                SuperAppMainScreenPopupView._init_$onTaxiButtonClick(a3w0Var2);
                                                break;
                                            default:
                                                SuperAppMainScreenPopupView._init_$onTaxiByPhoneCallButtonClick(a3w0Var2);
                                                break;
                                        }
                                    }
                                });
                                final int i3 = 1;
                                buttonComponent.setDebounceClickListener(new Runnable() { // from class: h3w0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i32 = i3;
                                        a3w0 a3w0Var2 = a3w0Var;
                                        switch (i32) {
                                            case 0:
                                                SuperAppMainScreenPopupView._init_$onReloadScreenClick(a3w0Var2);
                                                break;
                                            case 1:
                                                SuperAppMainScreenPopupView._init_$onTaxiButtonClick(a3w0Var2);
                                                break;
                                            default:
                                                SuperAppMainScreenPopupView._init_$onTaxiByPhoneCallButtonClick(a3w0Var2);
                                                break;
                                        }
                                    }
                                });
                                final int i4 = 2;
                                buttonComponent2.setDebounceClickListener(new Runnable() { // from class: h3w0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i32 = i4;
                                        a3w0 a3w0Var2 = a3w0Var;
                                        switch (i32) {
                                            case 0:
                                                SuperAppMainScreenPopupView._init_$onReloadScreenClick(a3w0Var2);
                                                break;
                                            case 1:
                                                SuperAppMainScreenPopupView._init_$onTaxiButtonClick(a3w0Var2);
                                                break;
                                            default:
                                                SuperAppMainScreenPopupView._init_$onTaxiByPhoneCallButtonClick(a3w0Var2);
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onReloadScreenClick(a3w0 a3w0Var) {
        ((r3w0) a3w0Var.A.b).a.g(zy11.a);
        ((j) ((lx4) a3w0Var.B.a.a)).d("SuperApp.FallbackAssistant.ReloadTapped").m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onTaxiButtonClick(a3w0 a3w0Var) {
        a3w0Var.C.a("open from fallback popup");
        ((j) ((lx4) a3w0Var.B.a.a)).d("SuperApp.FallbackAssistant.Taxi.Tapped").m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onTaxiByPhoneCallButtonClick(a3w0 a3w0Var) {
        ((fk7) a3w0Var.A.w).a();
        ((j) ((lx4) a3w0Var.B.a.a)).d("SuperApp.FallbackAssistant.OrderTaxiByCallTapped").m();
    }

    private final void animatePopupAppearance() {
        int i = 0;
        setVisibility(0);
        nwt0 nwt0Var = this.hideAnimation;
        if (nwt0Var != null) {
            nwt0Var.c();
        }
        nwt0 nwt0Var2 = new nwt0(this, y4n.n);
        nwt0Var2.b = getContainerHeight();
        nwt0Var2.c = true;
        nwt0Var2.u = animationSpringForce(0.0f);
        nwt0Var2.a = getContainerHeight() / 0.6f;
        nwt0Var2.a(new i3w0(this, i));
        nwt0Var2.h();
        this.showAnimation = nwt0Var2;
        animateShadow(1.0f);
    }

    private final void animatePopupDisappearance() {
        nwt0 nwt0Var = this.showAnimation;
        if (nwt0Var != null) {
            nwt0Var.c();
        }
        nwt0 nwt0Var2 = new nwt0(this, y4n.n);
        nwt0Var2.b = 0.0f;
        nwt0Var2.c = true;
        nwt0Var2.u = animationSpringForce(getContainerHeight());
        nwt0Var2.a = getContainerHeight() / 0.6f;
        nwt0Var2.a(new i3w0(this, 1));
        nwt0Var2.h();
        this.hideAnimation = nwt0Var2;
        animateShadow(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animatePopupDisappearance$lambda$0(SuperAppMainScreenPopupView superAppMainScreenPopupView, y4n y4nVar, boolean z, float f, float f2) {
        if (!z) {
            superAppMainScreenPopupView.setVisibility(4);
        }
        superAppMainScreenPopupView.hideAnimation = null;
    }

    private final void animateShadow(float alpha) {
        ViewPropertyAnimator viewPropertyAnimator = this.shadowAnimation;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.shadowAnimation = this.binding.c.animate().setDuration(600L).withEndAction(new lnv0(8, this)).alpha(alpha);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateVisibility(boolean isVisible) {
        if (isVisible && (getVisibility() == 4 || this.hideAnimation != null)) {
            animatePopupAppearance();
        } else {
            if (isVisible || getVisibility() == 4 || this.hideAnimation != null) {
                return;
            }
            animatePopupDisappearance();
        }
    }

    private final owt0 animationSpringForce(float finalPosition) {
        owt0 owt0Var = new owt0(finalPosition);
        owt0Var.b(100.0f);
        owt0Var.a(0.8f);
        return owt0Var;
    }

    private final float getContainerHeight() {
        return this.binding.b.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$0(SuperAppMainScreenPopupView superAppMainScreenPopupView, t1w t1wVar) {
        LinearLayoutCompat linearLayoutCompat = superAppMainScreenPopupView.binding.b;
        linearLayoutCompat.setPadding(linearLayoutCompat.getPaddingLeft(), linearLayoutCompat.getPaddingTop(), linearLayoutCompat.getPaddingRight(), tje.r(mrg0.go_design_m_space, superAppMainScreenPopupView.getContext()) + t1wVar.g);
        return false;
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.binding.b.setBackground(vng.t(f0h0.bg_rounded_24dp_modal_view, getContext()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(new k3w0(this));
        this.insetsCancellable = tje.i(this.binding.b, 80, new ate0(23, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        g18 g18Var = this.insetsCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
    }
}
