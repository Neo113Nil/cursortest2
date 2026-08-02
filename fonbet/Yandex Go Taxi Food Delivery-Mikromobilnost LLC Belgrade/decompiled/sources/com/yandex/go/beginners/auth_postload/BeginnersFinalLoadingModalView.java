package com.yandex.go.beginners.auth_postload;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.beginners.experiments.BeginnersAuthPostloadExperiment;
import defpackage.cma1;
import defpackage.d6z;
import defpackage.fhh0;
import defpackage.grh0;
import defpackage.ik5;
import defpackage.ip11;
import defpackage.l95;
import defpackage.ny61;
import defpackage.y130;
import defpackage.zmh;
import kotlin.Metadata;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0017\u0010\rJ\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001f\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!¨\u0006\""}, d2 = {"Lcom/yandex/go/beginners/auth_postload/BeginnersFinalLoadingModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lik5;", "Landroid/content/Context;", "context", "Lcom/yandex/go/beginners/experiments/BeginnersAuthPostloadExperiment;", "experiment", "Lip11;", "typefaceDelegate", "<init>", "(Landroid/content/Context;Lcom/yandex/go/beginners/experiments/BeginnersAuthPostloadExperiment;Lip11;)V", "Lzy11;", "setupModalViewConfig", "()V", "Ly130;", "insetsType", "()Ly130;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lik5;", "onAttachedToWindow", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Lcom/yandex/go/beginners/experiments/BeginnersAuthPostloadExperiment;", "Lip11;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BeginnersFinalLoadingModalView extends SlideableBindingModalView<ik5> {
    public static final int $stable = 8;
    private final BeginnersAuthPostloadExperiment experiment;
    private final ip11 typefaceDelegate;

    public BeginnersFinalLoadingModalView(Context context, BeginnersAuthPostloadExperiment beginnersAuthPostloadExperiment, ip11 ip11Var) {
        super(context);
        this.experiment = beginnersAuthPostloadExperiment;
        this.typefaceDelegate = ip11Var;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(BeginnersFinalLoadingModalView beginnersFinalLoadingModalView) {
        return beginnersFinalLoadingModalView.getBinding().a;
    }

    private final void setupModalViewConfig() {
        setInterceptOnBackPress(false);
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        cma1.b(0.0f, getContent()).withStartAction(startAction).withEndAction(endAction).start();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        getContent().setAlpha(0.0f);
        cma1.b(1.0f, getContent()).withStartAction(onAnimateShowStartAction).withEndAction(onAnimateShowEndAction).start();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ik5 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(grh0.beginners_final_loading, parent, false);
        int i = fhh0.final_loading_hint;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = fhh0.final_loading_loader;
            if (((CircularProgressBar) cma1.O(i, inflate)) != null) {
                i = fhh0.final_loading_title;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView2 != null) {
                    return new ik5((LinearLayout) inflate, robotoTextView, robotoTextView2);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(1, new l95(13, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setupModalViewConfig();
        RobotoTextView robotoTextView = getBinding().c;
        ip11 ip11Var = this.typefaceDelegate;
        robotoTextView.getContext();
        robotoTextView.setTypeface(((zmh) ip11Var).d(), 1);
        BeginnersAuthPostloadExperiment beginnersAuthPostloadExperiment = this.experiment;
        robotoTextView.setText(d6z.Y(beginnersAuthPostloadExperiment, beginnersAuthPostloadExperiment.f));
        RobotoTextView robotoTextView2 = getBinding().b;
        BeginnersAuthPostloadExperiment beginnersAuthPostloadExperiment2 = this.experiment;
        robotoTextView2.setText(d6z.Y(beginnersAuthPostloadExperiment2, beginnersAuthPostloadExperiment2.g));
    }
}
