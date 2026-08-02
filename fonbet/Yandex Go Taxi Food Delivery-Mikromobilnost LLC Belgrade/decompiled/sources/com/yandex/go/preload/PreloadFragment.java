package com.yandex.go.preload;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import defpackage.avh0;
import defpackage.b1;
import defpackage.cma1;
import defpackage.df4;
import defpackage.jcs;
import defpackage.kyh0;
import defpackage.qu;
import defpackage.soe0;
import defpackage.toe0;
import defpackage.v6h0;
import defpackage.voe0;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u00026B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010#R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103¨\u00067"}, d2 = {"Lcom/yandex/go/preload/PreloadFragment;", "Lru/yandex/taxi/fragment/YandexTaxiFragment;", "Lvoe0;", "Ljcs;", "Ldf4;", "<init>", "()V", "Lzy11;", "cancelPendingActions", "cancelAnimations", "", "showCancelButton", "setupCancelButton", "(Z)V", "animateButtonOnCancellation", "animateTextOnCancellation", "", "text", "setupText", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "bundle", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onBackPressed", "()Z", "canOpenMainMenu", "Lru/yandex/taxi/design/ButtonComponent;", "cancelButton", "Lru/yandex/taxi/design/ButtonComponent;", "Lru/yandex/taxi/widget/RobotoTextView;", "textView", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/os/Handler;", "fragmentHandler", "Landroid/os/Handler;", "Landroid/view/ViewPropertyAnimator;", "buttonCancelAnimation", "Landroid/view/ViewPropertyAnimator;", "textCancelAnimation", "hasCancelButton", "Z", "isCancelled", "Companion", "toe0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PreloadFragment extends YandexTaxiFragment<voe0, jcs> implements df4 {
    private static final int CANCELLATION_DISAPPEAR_DELAY = 800;
    public static final toe0 Companion = new toe0();
    private static final String SHOW_CANCEL_BUTTON_KEY = "com.yandex.go.preload.PreloadFragment.SHOW_CANCEL_BUTTON_KEY";
    private static final String TEXT_KEY = "com.yandex.go.preload.PreloadFragment.TEXT_KEY";
    private ViewPropertyAnimator buttonCancelAnimation;
    private ButtonComponent cancelButton;
    private final Handler fragmentHandler = new Handler(Looper.getMainLooper());
    private boolean hasCancelButton;
    private boolean isCancelled;
    private ViewPropertyAnimator textCancelAnimation;
    private RobotoTextView textView;

    private final void animateButtonOnCancellation() {
        ButtonComponent buttonComponent = this.cancelButton;
        if (buttonComponent == null) {
            buttonComponent = null;
        }
        this.buttonCancelAnimation = cma1.b(0.0f, buttonComponent).withEndAction(new soe0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateButtonOnCancellation$lambda$0(PreloadFragment preloadFragment) {
        preloadFragment.buttonCancelAnimation = null;
        preloadFragment.animateTextOnCancellation();
    }

    private final void animateTextOnCancellation() {
        RobotoTextView robotoTextView = this.textView;
        if (robotoTextView == null) {
            robotoTextView = null;
        }
        robotoTextView.setVisibility(0);
        robotoTextView.setAlpha(0.0f);
        float h = ru.yandex.taxi.design.utils.c.h(24, asView());
        robotoTextView.setY(robotoTextView.getY() + h);
        robotoTextView.setText(kyh0.loading_cancelled);
        this.textCancelAnimation = cma1.b(1.0f, robotoTextView).yBy(-h).withEndAction(new soe0(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateTextOnCancellation$lambda$0$0(PreloadFragment preloadFragment) {
        preloadFragment.fragmentHandler.postDelayed(new soe0(preloadFragment, 1), 800L);
        preloadFragment.textCancelAnimation = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateTextOnCancellation$lambda$0$0$0(PreloadFragment preloadFragment) {
        preloadFragment.requireCallback().a.r(new qu(9));
    }

    private final void cancelAnimations() {
        ViewPropertyAnimator viewPropertyAnimator = this.buttonCancelAnimation;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.textCancelAnimation;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
    }

    private final void cancelPendingActions() {
        this.fragmentHandler.removeCallbacksAndMessages(null);
        cancelAnimations();
    }

    private final void setupCancelButton(boolean showCancelButton) {
        ButtonComponent buttonComponent = (ButtonComponent) nonNullViewById(v6h0.cancel_button);
        buttonComponent.setVisibility(showCancelButton ? 0 : 8);
        buttonComponent.setDebounceClickListener(new soe0(this, 3));
        this.cancelButton = buttonComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCancelButton$lambda$0$0(PreloadFragment preloadFragment) {
        a aVar = preloadFragment.requireCallback().a.F;
        b1 b1Var = aVar.d;
        Double a = aVar.a(PreloadAnalytics$EventMarker.WAITING);
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        if (a != null) {
            hashMap.put("duration", a);
        }
        b1Var.a.a("DeeplinkPrerequeistesScreen.didTapCancelButton", hashMap, 1, new HashMap());
        preloadFragment.isCancelled = true;
        preloadFragment.animateButtonOnCancellation();
    }

    private final void setupText(String text) {
        RobotoTextView robotoTextView = (RobotoTextView) nonNullViewById(v6h0.text);
        robotoTextView.setText(text);
        robotoTextView.setVisibility((text == null || text.length() == 0) ? 4 : 0);
        this.textView = robotoTextView;
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment
    public boolean canOpenMainMenu() {
        return false;
    }

    @Override // defpackage.df4
    public boolean onBackPressed() {
        if (!this.hasCancelButton) {
            return false;
        }
        cancelPendingActions();
        if (!this.isCancelled) {
            a aVar = requireCallback().a.F;
            b1 b1Var = aVar.d;
            Double a = aVar.a(PreloadAnalytics$EventMarker.WAITING);
            b1Var.getClass();
            HashMap hashMap = new HashMap();
            if (a != null) {
                hashMap.put("duration", a);
            }
            b1Var.a.a("DeeplinkPrerequeistesScreen.didTapCancelButton", hashMap, 1, new HashMap());
        }
        requireCallback().a.r(new qu(9));
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        return inflater.inflate(avh0.preload_fragment, container, false);
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        cancelPendingActions();
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String string = requireArguments().getString(TEXT_KEY);
        this.hasCancelButton = requireArguments().getBoolean(SHOW_CANCEL_BUTTON_KEY);
        setupText(string);
        setupCancelButton(this.hasCancelButton);
    }
}
