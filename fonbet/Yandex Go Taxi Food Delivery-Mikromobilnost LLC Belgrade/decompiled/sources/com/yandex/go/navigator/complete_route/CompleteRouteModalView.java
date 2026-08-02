package com.yandex.go.navigator.complete_route;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.complete_route.CompleteRouteModalView;
import defpackage.cma1;
import defpackage.d82;
import defpackage.dzc;
import defpackage.ej1;
import defpackage.ezc;
import defpackage.foc;
import defpackage.fuh0;
import defpackage.hzc;
import defpackage.i650;
import defpackage.izc;
import defpackage.kyh0;
import defpackage.n;
import defpackage.ny61;
import defpackage.qu;
import defpackage.w511;
import defpackage.z5h0;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/navigator/complete_route/CompleteRouteModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lezc;", "Landroid/content/Context;", "context", "Lizc;", "presenter", "<init>", "(Landroid/content/Context;Lizc;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lezc;", "Lzy11;", "onAttachedToWindow", "()V", "onBackPressed", "onDetachedFromWindow", "Lizc;", "dzc", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CompleteRouteModalView extends SlideableBindingModalView<ezc> {
    public static final int $stable = 8;
    private final izc presenter;

    public CompleteRouteModalView(Context context, izc izcVar) {
        super(context);
        this.presenter = izcVar;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
    }

    public static final /* synthetic */ ezc access$getBinding(CompleteRouteModalView completeRouteModalView) {
        return completeRouteModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(CompleteRouteModalView completeRouteModalView) {
        izc izcVar = completeRouteModalView.presenter;
        int i = hzc.a[izcVar.y.ordinal()];
        if (i == 1) {
            izcVar.Kg();
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        i650 i650Var = izcVar.A.a;
        i650Var.a.a("navigation.exit_route_button.keep_in_background", n.u(i650Var), 1, new HashMap());
        ((ej1) izcVar.x.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(CompleteRouteModalView completeRouteModalView) {
        izc izcVar = completeRouteModalView.presenter;
        i650 i650Var = izcVar.A.a;
        i650Var.a.a("navigation.exit_route_button.confirm", n.u(i650Var), 1, new HashMap());
        izcVar.z.f(false);
        ((ej1) izcVar.x.a).r(new foc(5));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ezc bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(fuh0.complete_route_modal_view, parent, false);
        int i = z5h0.btn_layout;
        if (((BottomEdgeButtonLayout) cma1.O(i, inflate)) != null) {
            i = z5h0.cancel_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = z5h0.complete_button;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent2 != null) {
                    i = z5h0.title;
                    if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                        return new ezc((GoLinearLayout) inflate, buttonComponent, buttonComponent2);
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
        izc izcVar = this.presenter;
        izcVar.Bg(new dzc());
        int i = hzc.a[izcVar.y.ordinal()];
        final int i2 = 1;
        if (i == 1) {
            access$getBinding(this).b.setText(getResources().getString(kyh0.navigator_continue_route));
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            setOnBackPressedListener(new d82(1));
            setOnTouchOutsideListener(new d82(1));
            setOnSlideOutListener(new d82(1));
            access$getBinding(this).b.setText(getResources().getString(kyh0.navigator_continue_in_background));
        }
        requestApplyInsets();
        final int i3 = 0;
        getBinding().b.setDebounceClickListener(new Runnable(this) { // from class: czc
            public final /* synthetic */ CompleteRouteModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                CompleteRouteModalView completeRouteModalView = this.b;
                switch (i4) {
                    case 0:
                        CompleteRouteModalView.onAttachedToWindow$lambda$0(completeRouteModalView);
                        break;
                    default:
                        CompleteRouteModalView.onAttachedToWindow$lambda$1(completeRouteModalView);
                        break;
                }
            }
        });
        getBinding().c.setDebounceClickListener(new Runnable(this) { // from class: czc
            public final /* synthetic */ CompleteRouteModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i2;
                CompleteRouteModalView completeRouteModalView = this.b;
                switch (i4) {
                    case 0:
                        CompleteRouteModalView.onAttachedToWindow$lambda$0(completeRouteModalView);
                        break;
                    default:
                        CompleteRouteModalView.onAttachedToWindow$lambda$1(completeRouteModalView);
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        izc izcVar = this.presenter;
        if (izcVar.y == CancelMode.CANCEL_COMPLETION) {
            izcVar.Kg();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
