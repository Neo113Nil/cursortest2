package com.yandex.go.inapp_calls.ui.fullscreenintent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.b;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$ButtonName;
import com.yandex.go.inapp_calls.ui.fullscreenintent.RequestUseFullScreenIntentModalView;
import com.yandex.go.inapp_calls.ui.fullscreenintent.a;
import defpackage.c230;
import defpackage.cma1;
import defpackage.d9j0;
import defpackage.e230;
import defpackage.f9j0;
import defpackage.ip11;
import defpackage.j9j0;
import defpackage.mjv;
import defpackage.n6j0;
import defpackage.ny61;
import defpackage.oth0;
import defpackage.pzt0;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.rih0;
import defpackage.vyf0;
import defpackage.zmh;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/inapp_calls/ui/fullscreenintent/RequestUseFullScreenIntentModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ln6j0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/inapp_calls/ui/fullscreenintent/a;", "presenter", "Lip11;", "typefaceDelegate", "<init>", "(Landroid/content/Context;Lcom/yandex/go/inapp_calls/ui/fullscreenintent/a;Lip11;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ln6j0;", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/yandex/go/inapp_calls/ui/fullscreenintent/a;", "d9j0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RequestUseFullScreenIntentModalView extends SlideableBindingModalView<n6j0> {
    private final a presenter;

    public RequestUseFullScreenIntentModalView(Context context, a aVar, ip11 ip11Var) {
        super(context);
        this.presenter = aVar;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        b.q(getBinding().d, true);
        getBinding().d.setTypeface(((zmh) ip11Var).d());
    }

    public static final /* synthetic */ n6j0 access$getBinding(RequestUseFullScreenIntentModalView requestUseFullScreenIntentModalView) {
        return requestUseFullScreenIntentModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(RequestUseFullScreenIntentModalView requestUseFullScreenIntentModalView) {
        return requestUseFullScreenIntentModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$closeClicked(a aVar) {
        ((f9j0) aVar.x.b).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$goToSettingsClicked(a aVar) {
        mjv mjvVar = aVar.E.b;
        InAppCallsAnalytics$ButtonName inAppCallsAnalytics$ButtonName = InAppCallsAnalytics$ButtonName.Ok;
        mjvVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", inAppCallsAnalytics$ButtonName.getEventValue());
        mjvVar.a.a("InAppCalls.NotificationPermissionModal.Tapped", hashMap, 1, new HashMap());
        pzt0 pzt0Var = aVar.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.F = com.yandex.go.coroutines.b.g(aVar.Jg(), null, null, new RequestUseFullScreenIntentPresenter$goToSettingsClicked$1(aVar, null), 3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public n6j0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(oth0.request_fullscreen_intent_modal_view, parent, false);
        int i = rih0.request_full_screen_intent_image;
        if (((AppCompatImageView) cma1.O(i, inflate)) != null) {
            i = rih0.request_full_screen_intent_message;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = rih0.request_full_screen_intent_open_settings_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = rih0.request_full_screen_intent_title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        i = rih0.request_full_screen_intent_vendor_specific;
                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView3 != null) {
                            return new n6j0((GoLinearLayout) inflate, robotoTextView, buttonComponent, robotoTextView2, robotoTextView3);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new vyf0(14, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.presenter;
        aVar.Bg(new d9j0());
        mjv mjvVar = aVar.E.b;
        mjvVar.getClass();
        final int i = 1;
        mjvVar.a.a("InAppCalls.NotificationPermissionModal.Shown", new HashMap(), 1, new HashMap());
        j9j0 j9j0Var = aVar.y.a;
        RobotoTextView robotoTextView = access$getBinding(this).d;
        String str = j9j0Var.a;
        String str2 = j9j0Var.c;
        robotoTextView.setText(str);
        final int i2 = 0;
        access$getBinding(this).d.setVisibility(j9j0Var.a.length() > 0 ? 0 : 8);
        access$getBinding(this).b.setText(j9j0Var.b);
        access$getBinding(this).c.setText(j9j0Var.d);
        if (str2 == null || str2.length() == 0) {
            access$getBinding(this).e.setVisibility(8);
        } else {
            access$getBinding(this).e.setVisibility(0);
            access$getBinding(this).e.setText(str2);
        }
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        final a aVar2 = this.presenter;
        qdb1.c(this, new Runnable() { // from class: c9j0
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                a aVar3 = aVar2;
                switch (i3) {
                    case 0:
                        RequestUseFullScreenIntentModalView.onAttachedToWindow$closeClicked(aVar3);
                        break;
                    default:
                        RequestUseFullScreenIntentModalView.onAttachedToWindow$goToSettingsClicked(aVar3);
                        break;
                }
            }
        });
        ButtonComponent buttonComponent = getBinding().c;
        final a aVar3 = this.presenter;
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: c9j0
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                a aVar32 = aVar3;
                switch (i3) {
                    case 0:
                        RequestUseFullScreenIntentModalView.onAttachedToWindow$closeClicked(aVar32);
                        break;
                    default:
                        RequestUseFullScreenIntentModalView.onAttachedToWindow$goToSettingsClicked(aVar32);
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
