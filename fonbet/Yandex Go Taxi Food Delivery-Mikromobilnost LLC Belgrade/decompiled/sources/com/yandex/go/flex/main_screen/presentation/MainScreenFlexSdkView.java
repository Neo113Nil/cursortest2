package com.yandex.go.flex.main_screen.presentation;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout;
import com.yandex.go.flex.main_screen.presentation.f;
import com.yandex.go.flex.main_screen.presentation.feed.FeedState;
import defpackage.aa00;
import defpackage.b5q0;
import defpackage.be90;
import defpackage.bvf0;
import defpackage.c40;
import defpackage.cfx;
import defpackage.chp0;
import defpackage.cma1;
import defpackage.e3m;
import defpackage.eor;
import defpackage.f9x;
import defpackage.hla0;
import defpackage.ike;
import defpackage.kki0;
import defpackage.lth0;
import defpackage.mdh;
import defpackage.nch0;
import defpackage.nih0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.sjh;
import defpackage.t900;
import defpackage.tje;
import defpackage.tls;
import defpackage.u0x;
import defpackage.uqq;
import defpackage.uyj;
import defpackage.x4q0;
import defpackage.xlr;
import defpackage.xw31;
import defpackage.zir;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u0017H\u0016¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u001a\u0010+\u001a\u00020*8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/yandex/go/flex/main_screen/presentation/MainScreenFlexSdkView;", "Lcom/yandex/go/flex/common/api/ui/FlexSdkFrameLayout;", "Lt900;", "Landroid/content/Context;", "context", "Lcom/yandex/feedsdk/di/FeedSdkComponent;", "flexSdk", "Laa00;", "presenter", "<init>", "(Landroid/content/Context;Lcom/yandex/feedsdk/di/FeedSdkComponent;Laa00;)V", "Landroidx/recyclerview/widget/RecyclerView;", "contentView", "", "isScrolledToTop", "(Landroidx/recyclerview/widget/RecyclerView;)Z", "scrollToFirstItemAfterHideableItem", "(Landroidx/recyclerview/widget/RecyclerView;)Ljava/lang/Boolean;", "findContentRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/ViewGroup;", "provideEngineContainer", "()Landroid/view/ViewGroup;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "interceptOnBackPressed", "()Z", "Leor;", "startButton", "endButton", "setFloatButtons", "(Leor;Leor;)V", "isVisible", "setFabsVisibility", "(Z)V", "applyThemeForChildrenByDefault", "onResume", "onPause", "Lcom/yandex/feedsdk/di/FeedSdkComponent;", "Laa00;", "Lxlr;", "binding", "Lxlr;", "getBinding", "()Lxlr;", "Lcom/yandex/go/flex/main_screen/presentation/f;", "fabsDelegate", "Lcom/yandex/go/flex/main_screen/presentation/f;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainScreenFlexSdkView extends FlexSdkFrameLayout implements t900 {
    private final xlr binding;
    private final f fabsDelegate;
    private final FeedSdkComponent flexSdk;
    private final aa00 presenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenFlexSdkView(Context context, FeedSdkComponent feedSdkComponent, aa00 aa00Var) {
        super(context, feedSdkComponent.getEngine(), false);
        final int i = 0;
        this.flexSdk = feedSdkComponent;
        this.presenter = aa00Var;
        LayoutInflater.from(context).inflate(lth0.flex_sdk_main_screen, this);
        int i2 = nih0.bottom_end_side_fab_container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i2, this);
        if (frameLayout != null) {
            i2 = nih0.bottom_start_side_fab_container;
            FrameLayout frameLayout2 = (FrameLayout) cma1.O(i2, this);
            if (frameLayout2 != null) {
                i2 = nih0.feed_sdk_root;
                FrameLayout frameLayout3 = (FrameLayout) cma1.O(i2, this);
                if (frameLayout3 != null) {
                    this.binding = new xlr(this, frameLayout, frameLayout2, frameLayout3);
                    FrameLayout frameLayout4 = getBinding().c;
                    FrameLayout frameLayout5 = getBinding().b;
                    final f fVar = new f(frameLayout4, frameLayout5, context.getResources());
                    this.fabsDelegate = fVar;
                    int i3 = fVar.f;
                    xw31.F(frameLayout4, Integer.valueOf(i3), null, null, null);
                    xw31.F(frameLayout5, null, null, Integer.valueOf(i3), null);
                    frameLayout4.setVisibility(8);
                    frameLayout5.setVisibility(8);
                    tje.i(frameLayout4, 119, new tls() { // from class: ea00
                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            int i4 = i;
                            f fVar2 = fVar;
                            t1w t1wVar = (t1w) obj;
                            switch (i4) {
                                case 0:
                                    xw31.E(fVar2.a, null, null, null, Integer.valueOf(t1wVar.d));
                                    break;
                                default:
                                    xw31.E(fVar2.b, null, null, null, Integer.valueOf(t1wVar.d));
                                    break;
                            }
                            return Boolean.FALSE;
                        }
                    });
                    final int i4 = 1;
                    tje.i(frameLayout5, 119, new tls() { // from class: ea00
                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            int i42 = i4;
                            f fVar2 = fVar;
                            t1w t1wVar = (t1w) obj;
                            switch (i42) {
                                case 0:
                                    xw31.E(fVar2.a, null, null, null, Integer.valueOf(t1wVar.d));
                                    break;
                                default:
                                    xw31.E(fVar2.b, null, null, null, Integer.valueOf(t1wVar.d));
                                    break;
                            }
                            return Boolean.FALSE;
                        }
                    });
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final RecyclerView findContentRecyclerView() {
        return (RecyclerView) getBinding().d.findViewById(nch0.flexsdk_recycler_view_id);
    }

    private final boolean isScrolledToTop(RecyclerView contentView) {
        View X;
        if (contentView.getChildCount() == 0 || !contentView.canScrollVertically(Integer.MIN_VALUE)) {
            return true;
        }
        RecyclerView.e layoutManager = contentView.getLayoutManager();
        if (layoutManager != null && (X = layoutManager.X(0)) != null) {
            Rect rect = new Rect();
            contentView.getDecoratedBoundsWithMargins(X, rect);
            if (rect.top >= contentView.getPaddingTop()) {
                return true;
            }
        }
        return false;
    }

    private final Boolean scrollToFirstItemAfterHideableItem(RecyclerView contentView) {
        if (contentView == null || contentView.getChildCount() == 0 || !contentView.canScrollVertically(Integer.MIN_VALUE)) {
            return null;
        }
        RecyclerView.Adapter adapter = contentView.getAdapter();
        if (!(adapter instanceof cfx)) {
            return null;
        }
        cfx cfxVar = (cfx) adapter;
        if (!(((u0x) kotlin.collections.a.S(0, cfxVar.f())) instanceof hla0)) {
            return null;
        }
        if (cfxVar.getItemCount() < 2) {
            return Boolean.FALSE;
        }
        x0 findViewHolderForAdapterPosition = contentView.findViewHolderForAdapterPosition(1);
        View view = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.a : null;
        if (view != null && view.getTop() == contentView.getPaddingTop()) {
            return Boolean.FALSE;
        }
        kki0.c(contentView, new chp0.a(0).b, 1);
        return Boolean.TRUE;
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, defpackage.ylr
    public boolean interceptOnBackPressed() {
        RecyclerView findContentRecyclerView = findContentRecyclerView();
        if (findContentRecyclerView != null && isScrolledToTop(findContentRecyclerView)) {
            return false;
        }
        Boolean scrollToFirstItemAfterHideableItem = scrollToFirstItemAfterHideableItem(findContentRecyclerView);
        return scrollToFirstItemAfterHideableItem != null ? scrollToFirstItemAfterHideableItem.booleanValue() : uqq.a(this.flexSdk.getEngine());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, b5q0] */
    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object value;
        be90 be90Var;
        super.onAttachedToWindow();
        aa00 aa00Var = this.presenter;
        aa00Var.Bg(this);
        flex.engine.a aVar = aa00Var.x;
        aVar.c(aa00Var.G);
        aVar.c(aa00Var.H);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r2 = (b5q0) aa00Var.M.a.getAndSet(null);
        ref$ObjectRef.element = r2;
        if (r2 == 0) {
            aa00Var.D.a(x4q0.d);
        }
        com.yandex.go.flex.main_screen.utils.query.a aVar2 = new com.yandex.go.flex.main_screen.utils.query.a();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        r0 r0Var = aa00Var.b0.f;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, FeedState.CACHE));
        boolean z = qje.V((e3m) aVar.Z.a) != null;
        zir b = com.yandex.go.flex.common.api.c.b(aa00Var.J);
        if (b != null && !bvf0.G(aa00Var.P, b)) {
            aVar2.b();
            be90Var = f9x.a;
        } else if (z) {
            aVar2.b();
            be90Var = f9x.a;
        } else {
            b5q0 b5q0Var = (b5q0) ref$ObjectRef.element;
            aa00Var.E.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            be90 N = tje.N(aa00Var.Jg(), mdhVar, null, new MainScreenFlexSdkPresenter$attachView$1(aa00Var, null), 2);
            if (b5q0Var != null) {
                tje.N(aa00Var.Jg(), mdhVar, null, new MainScreenFlexSdkPresenter$attachView$2(aa00Var, aVar2, b5q0Var, N, mdhVar, null), 2);
            } else {
                aVar2.b();
            }
            be90Var = N;
        }
        tje.N(aa00Var.Jg(), null, null, new MainScreenFlexSdkPresenter$attachView$3(be90Var, aa00Var, ref$ObjectRef2, ref$ObjectRef, aVar2, this, null), 3);
        aa00Var.f0.a((ike) aa00Var.Jg());
        aa00Var.a0.getClass();
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, defpackage.ylr
    public void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, defpackage.ylr
    public void onResume() {
        super.onResume();
        this.presenter.resume();
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout
    public ViewGroup provideEngineContainer() {
        return getBinding().d;
    }

    @Override // defpackage.t900
    public void setFabsVisibility(boolean isVisible) {
        float f;
        f fVar = this.fabsDelegate;
        if (isVisible) {
            fVar.a();
            return;
        }
        MainScreenFlexSdkViewFabDelegate$State mainScreenFlexSdkViewFabDelegate$State = fVar.c;
        TimeInterpolator timeInterpolator = fVar.e;
        FrameLayout frameLayout = fVar.a;
        FrameLayout frameLayout2 = fVar.b;
        MainScreenFlexSdkViewFabDelegate$State mainScreenFlexSdkViewFabDelegate$State2 = MainScreenFlexSdkViewFabDelegate$State.Hidden;
        if (mainScreenFlexSdkViewFabDelegate$State == mainScreenFlexSdkViewFabDelegate$State2) {
            return;
        }
        fVar.c = mainScreenFlexSdkViewFabDelegate$State2;
        fVar.d.cancel();
        float f2 = 0.0f;
        if (frameLayout.equals(frameLayout)) {
            f = -frameLayout.getWidth();
        } else {
            Object parent = frameLayout2.getParent();
            f = (parent instanceof View ? (View) parent : null) != null ? r12.getWidth() : 0.0f;
        }
        ViewPropertyAnimator animate = frameLayout.animate();
        animate.cancel();
        int i = 2;
        animate.setInterpolator(timeInterpolator).setDuration(300L).withEndAction(new c40(false, (Object) fVar, i)).x(f);
        if (frameLayout2.equals(frameLayout)) {
            f2 = -frameLayout.getWidth();
        } else {
            Object parent2 = frameLayout2.getParent();
            View view = parent2 instanceof View ? (View) parent2 : null;
            if (view != null) {
                f2 = view.getWidth();
            }
        }
        ViewPropertyAnimator animate2 = frameLayout2.animate();
        animate2.cancel();
        animate2.setInterpolator(timeInterpolator).setDuration(300L).withEndAction(new c40(true, (Object) fVar, i)).x(f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout, defpackage.ylr
    public void setFloatButtons(eor startButton, eor endButton) {
        f fVar = this.fabsDelegate;
        FrameLayout frameLayout = fVar.a;
        frameLayout.removeAllViews();
        if (startButton != 0) {
            frameLayout.addView((View) startButton);
        }
        frameLayout.requestApplyInsets();
        FrameLayout frameLayout2 = fVar.b;
        frameLayout2.removeAllViews();
        if (endButton != 0) {
            frameLayout2.addView((View) endButton);
        }
        frameLayout2.requestApplyInsets();
        if (fVar.c == MainScreenFlexSdkViewFabDelegate$State.WaitingForButtons) {
            fVar.a();
        }
    }

    @Override // com.yandex.go.flex.common.api.ui.FlexSdkFrameLayout
    public xlr getBinding() {
        return this.binding;
    }
}
