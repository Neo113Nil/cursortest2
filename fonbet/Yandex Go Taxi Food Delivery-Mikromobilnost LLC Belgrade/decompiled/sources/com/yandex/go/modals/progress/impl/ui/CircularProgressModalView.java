package com.yandex.go.modals.progress.impl.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.buh0;
import defpackage.cma1;
import defpackage.djh0;
import defpackage.e230;
import defpackage.g5c;
import defpackage.j2y;
import defpackage.kl40;
import defpackage.l7a;
import defpackage.mh2;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.qvb;
import defpackage.sb0;
import defpackage.sls;
import defpackage.y130;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.analytics.ModalViewCloseReason;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.BindingModalView;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R*\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010,\u001a\u00060+R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/yandex/go/modals/progress/impl/ui/CircularProgressModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lj2y;", "Landroid/content/Context;", "context", "Lmh2;", "animationDelegate", "", "dismissOnBackPressed", "animateManualDismiss", "<init>", "(Landroid/content/Context;Lmh2;ZZ)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lj2y;", "Le230;", "insetsType", "()Le230;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Ljava/lang/Runnable;", "startAction", "endAction", "Lzy11;", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "animateDismiss", "Lg5c;", "closeTransitionReason", "getDismissAnimationDelegate", "(Lg5c;)Lmh2;", "Z", "Lkotlin/Function0;", "onDetachAfterShownAction", "Lsls;", "getOnDetachAfterShownAction", "()Lsls;", "setOnDetachAfterShownAction", "(Lsls;)V", "Lqvb;", "showAwaitingDismissAnimator", "Lqvb;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CircularProgressModalView extends BindingModalView<j2y> {
    private final boolean animateManualDismiss;
    private sls onDetachAfterShownAction;
    private final qvb showAwaitingDismissAnimator;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.modals.progress.impl.ui.CircularProgressModalView$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((CircularProgressModalView) this.receiver).onBackPressed();
            return zy11.a;
        }
    }

    public CircularProgressModalView(Context context, mh2 mh2Var, boolean z, boolean z2) {
        super(context);
        this.animateManualDismiss = z2;
        this.showAwaitingDismissAnimator = new qvb(this);
        setAnimationDelegate(mh2Var);
        if (z) {
            c.z(new AnonymousClass1(0, this, CircularProgressModalView.class, "onBackPressed", "onBackPressed()V", 0), getBinding().b);
        } else {
            getBinding().b.setVisibility(8);
            setDismissOnBackPressed(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDismiss$lambda$0(sls slsVar, Runnable runnable) {
        slsVar.invoke();
        runnable.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        sls slsVar = this.onDetachAfterShownAction;
        if (slsVar == null) {
            super.animateDismiss(startAction, endAction);
            return;
        }
        l7a l7aVar = new l7a(7, slsVar, startAction);
        qvb qvbVar = this.showAwaitingDismissAnimator;
        boolean z = qvbVar.a;
        CircularProgressModalView circularProgressModalView = qvbVar.c;
        if (z) {
            super.animateDismiss(l7aVar, endAction);
        } else {
            qvbVar.b = new sb0(16, circularProgressModalView, l7aVar, endAction);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable startAction, Runnable endAction) {
        qvb qvbVar = this.showAwaitingDismissAnimator;
        qvbVar.a = false;
        super.animateShow(startAction, new l7a(8, qvbVar, endAction));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public j2y bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(buh0.layout_spinner_modal_view, parent, false);
        int i = djh0.back_button;
        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
        if (goImageView != null) {
            return new j2y((GoFrameLayout) inflate, goImageView);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public mh2 getDismissAnimationDelegate(g5c closeTransitionReason) {
        return (closeTransitionReason == ModalViewCloseReason.BACK_PRESSED || this.animateManualDismiss) ? super.getDismissAnimationDelegate(closeTransitionReason) : kl40.b;
    }

    public final sls getOnDetachAfterShownAction() {
        return this.onDetachAfterShownAction;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new y130(3, null);
    }

    public final void setOnDetachAfterShownAction(sls slsVar) {
        this.onDetachAfterShownAction = slsVar;
    }
}
