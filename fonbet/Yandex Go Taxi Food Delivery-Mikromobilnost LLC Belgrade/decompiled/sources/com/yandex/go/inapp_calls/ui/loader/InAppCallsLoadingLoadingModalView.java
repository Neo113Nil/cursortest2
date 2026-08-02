package com.yandex.go.inapp_calls.ui.loader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.b;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.aj7;
import defpackage.ckv;
import defpackage.cma1;
import defpackage.dhv;
import defpackage.dkv;
import defpackage.ekv;
import defpackage.ip11;
import defpackage.kjv;
import defpackage.mqg0;
import defpackage.njv;
import defpackage.ny61;
import defpackage.oth0;
import defpackage.qje;
import defpackage.rih0;
import defpackage.tje;
import defpackage.tzt;
import defpackage.vjv;
import defpackage.w511;
import defpackage.xjv;
import defpackage.xng0;
import defpackage.y130;
import defpackage.zmh;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/go/inapp_calls/ui/loader/InAppCallsLoadingLoadingModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lvjv;", "Lxjv;", "Landroid/content/Context;", "context", "Lcom/yandex/go/inapp_calls/ui/loader/a;", "presenter", "Lip11;", "typefaceDelegate", "<init>", "(Landroid/content/Context;Lcom/yandex/go/inapp_calls/ui/loader/a;Lip11;)V", "Lekv;", "uiState", "Lzy11;", "render", "(Lekv;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lvjv;", "Ly130;", "insetsType", "()Ly130;", "Lcom/yandex/go/inapp_calls/ui/loader/a;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InAppCallsLoadingLoadingModalView extends SlideableBindingModalView<vjv> implements xjv {
    private final a presenter;

    public InAppCallsLoadingLoadingModalView(Context context, a aVar, ip11 ip11Var) {
        super(context);
        this.presenter = aVar;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        getBinding().g.setTypeface(((zmh) ip11Var).d());
        b.q(getBinding().g, true);
        getBinding().b.setBackgroundColor(context.getColor(mqg0.component_green_toxic));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(InAppCallsLoadingLoadingModalView inAppCallsLoadingLoadingModalView) {
        return inAppCallsLoadingLoadingModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$defaultCall(a aVar) {
        tje.N(aVar.Jg(), null, null, new InAppCallsLoadingPresenter$defaultCall$1(aVar, null), 3);
        aVar.F.set(true);
        ((aj7) aVar.C).b(aVar.y, false);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public vjv bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(oth0.in_app_calls_loading_modal_view, parent, false);
        int i = rih0.call_icon;
        IconCircleButton iconCircleButton = (IconCircleButton) cma1.O(i, inflate);
        if (iconCircleButton != null) {
            i = rih0.close_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
            if (appCompatImageView != null) {
                i = rih0.error_icon;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, inflate);
                if (appCompatImageView2 != null) {
                    i = rih0.loading_animation;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) cma1.O(i, inflate);
                    if (lottieAnimationView != null) {
                        i = rih0.subtitle;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            i = rih0.title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView2 != null) {
                                i = rih0.title_container;
                                if (((LinearLayout) cma1.O(i, inflate)) != null) {
                                    return new vjv((ConstraintLayout) inflate, iconCircleButton, appCompatImageView, appCompatImageView2, lottieAnimationView, robotoTextView, robotoTextView2);
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

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(1, new tzt(13, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.presenter;
        aVar.Bg(this);
        kjv kjvVar = aVar.E.d;
        ((AtomicBoolean) kjvVar.b).set(true);
        ((njv) kjvVar.c).k((String) kjvVar.a, "Show", new Pair[0]);
        tje.N(aVar.Jg(), null, null, new InAppCallsLoadingPresenter$attachView$1(aVar, null), 3);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        vjv binding = getBinding();
        c.z(new InAppCallsLoadingLoadingModalView$onAttachedToWindow$1$1(0, this.presenter, a.class, "back", "back()V", 0), binding.c);
        binding.b.setDebounceClickListener(new dhv(1, this.presenter));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.eyi0
    public void render(ekv uiState) {
        announceForAccessibility(uiState.c());
        if (uiState instanceof ckv) {
            vjv binding = getBinding();
            binding.d.setVisibility(0);
            binding.e.setVisibility(8);
            binding.g.setTextColor(getContext().getColor(mqg0.component_red_toxic));
        } else {
            if (!(uiState instanceof dkv)) {
                w511.b();
                return;
            }
            vjv binding2 = getBinding();
            binding2.d.setVisibility(8);
            binding2.e.setVisibility(0);
            binding2.g.setTextColor(qje.t(xng0.textMain, getContext()));
        }
        vjv binding3 = getBinding();
        binding3.g.setText(uiState.c());
        binding3.f.setText(uiState.b());
        binding3.b.setTitle(uiState.a());
    }
}
