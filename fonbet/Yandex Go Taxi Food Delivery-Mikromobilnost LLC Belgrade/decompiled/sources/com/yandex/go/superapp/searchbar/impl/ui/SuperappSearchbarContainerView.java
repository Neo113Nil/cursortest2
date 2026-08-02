package com.yandex.go.superapp.searchbar.impl.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.superapp.searchbar.impl.ui.scroll_up.ScrollUpButtonView;
import com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarView;
import defpackage.amp0;
import defpackage.edw0;
import defpackage.ibw0;
import defpackage.kjp0;
import defpackage.lew0;
import defpackage.oav0;
import defpackage.ons0;
import defpackage.pav;
import defpackage.pew0;
import defpackage.qp0;
import defpackage.qug0;
import defpackage.rew0;
import defpackage.s5w0;
import defpackage.sls;
import defpackage.t1w;
import defpackage.tje;
import defpackage.v66;
import defpackage.ytz;
import defpackage.zxs0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002'(B7\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/yandex/go/superapp/searchbar/impl/ui/SuperappSearchbarContainerView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lcom/yandex/go/superapp/searchbar/impl/ui/scroll_up/ScrollUpButtonView;", "scrollUpButton", "Llew0;", "searchbarViewFactory", "Lcom/yandex/go/superapp/searchbar/impl/presentation/a;", "presenter", "Lv66;", "contentBlurDelegate", "<init>", "(Landroid/content/Context;Lcom/yandex/go/superapp/searchbar/impl/ui/scroll_up/ScrollUpButtonView;Llew0;Lcom/yandex/go/superapp/searchbar/impl/presentation/a;Lv66;)V", "Lzy11;", "updateBlurCoordinates", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/yandex/go/superapp/searchbar/impl/presentation/a;", "Lv66;", "", "bottomPadding", CA20Status.STATUS_USER_I, "blurTopOffset", "Lpew0;", "searchbarViewDimens", "Lpew0;", "Lcom/yandex/go/superapp/searchbar/impl/ui/searchbar/SuperappSearchbarView;", "searchbarView", "Lcom/yandex/go/superapp/searchbar/impl/ui/searchbar/SuperappSearchbarView;", "Ledw0;", "animator", "Ledw0;", "com/yandex/go/superapp/searchbar/impl/ui/b", "pdw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappSearchbarContainerView extends GoFrameLayout {
    private final edw0 animator;
    private final int blurTopOffset;
    private final int bottomPadding;
    private final v66 contentBlurDelegate;
    private final com.yandex.go.superapp.searchbar.impl.presentation.a presenter;
    private final SuperappSearchbarView searchbarView;
    private final pew0 searchbarViewDimens;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.superapp.searchbar.impl.ui.SuperappSearchbarContainerView$4, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            com.yandex.go.superapp.searchbar.impl.presentation.a aVar = (com.yandex.go.superapp.searchbar.impl.presentation.a) this.receiver;
            ibw0 ibw0Var = aVar.B;
            ibw0Var.getClass();
            ibw0Var.a.a("SuperappMain.ScrollUpButton.Tapped", new HashMap(), 1, new HashMap());
            aVar.E.b();
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.superapp.searchbar.impl.ui.SuperappSearchbarContainerView$6, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ibw0 ibw0Var = ((com.yandex.go.superapp.searchbar.impl.presentation.a) this.receiver).B;
            ibw0Var.getClass();
            ibw0Var.a.a("SuperappMain.SearchBar.Expanded", new HashMap(), 1, new HashMap());
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.superapp.searchbar.impl.ui.SuperappSearchbarContainerView$7, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ibw0 ibw0Var = ((com.yandex.go.superapp.searchbar.impl.presentation.a) this.receiver).B;
            ibw0Var.getClass();
            ibw0Var.a.a("SuperappMain.SearchBar.Collapsed", new HashMap(), 1, new HashMap());
            return zy11.a;
        }
    }

    public SuperappSearchbarContainerView(Context context, ScrollUpButtonView scrollUpButtonView, lew0 lew0Var, com.yandex.go.superapp.searchbar.impl.presentation.a aVar, v66 v66Var) {
        super(context, null, 0, 0, 14, null);
        this.presenter = aVar;
        this.contentBlurDelegate = v66Var;
        this.bottomPadding = tje.r(qug0.superapp_searchbar_margin_bottom, getContext());
        this.blurTopOffset = tje.r(qug0.superapp_searchbar_blur_top_offset, getContext());
        pew0 pew0Var = new pew0(this);
        this.searchbarViewDimens = pew0Var;
        SuperappSearchbarContainerView$searchbarView$1 superappSearchbarContainerView$searchbarView$1 = new SuperappSearchbarContainerView$searchbarView$1(2, aVar, com.yandex.go.superapp.searchbar.impl.presentation.a.class, "handleAction", "handleAction(Lcom/yandex/go/dto/response/Action;Lcom/yandex/go/mainscreen/superapp/analytics/SuperappMainAnalytics$SearchBarTapSource;)V", 0);
        SuperappSearchbarContainerView$searchbarView$2 superappSearchbarContainerView$searchbarView$2 = new SuperappSearchbarContainerView$searchbarView$2(1, aVar, com.yandex.go.superapp.searchbar.impl.presentation.a.class, "onLottieAnimationFinished", "onLottieAnimationFinished(Lcom/yandex/go/superapp/searchbar/impl/presentation/SuperappSearchbarUiState$Visible$Button$LottieAnimation$Playing;)V", 0);
        qp0 qp0Var = ((rew0) lew0Var).a;
        SuperappSearchbarView superappSearchbarView = new SuperappSearchbarView((Context) qp0Var.a.get(), (pav) qp0Var.b.get(), (ytz) qp0Var.c.get(), pew0Var, superappSearchbarContainerView$searchbarView$1, superappSearchbarContainerView$searchbarView$2);
        this.searchbarView = superappSearchbarView;
        setClipToPadding(false);
        setClipChildren(false);
        tje.i(this, 80, new s5w0(4, this));
        addOnLayoutChangeListener(new ons0(6, this));
        superappSearchbarView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 8388691;
        addView(superappSearchbarView, layoutParams);
        setTouchDelegate(superappSearchbarView.getContainerTouchDelegate());
        int r = tje.r(qug0.superapp_searchbar_size_collapsed, getContext());
        c.z(new AnonymousClass4(0, aVar, com.yandex.go.superapp.searchbar.impl.presentation.a.class, "scrollUp", "scrollUp()V", 0), scrollUpButtonView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(r, r);
        layoutParams2.gravity = 8388693;
        layoutParams2.setMarginEnd(-r);
        addView(scrollUpButtonView, layoutParams2);
        zxs0 zxs0Var = new zxs0(superappSearchbarView.getContainerTouchDelegate(), v66Var);
        amp0 amp0Var = new amp0();
        amp0Var.a = superappSearchbarView;
        amp0Var.b = pew0Var;
        amp0Var.c = ArgbEvaluatorCompat.getInstance();
        this.animator = new edw0(context, zxs0Var, amp0Var, new kjp0(scrollUpButtonView), new AnonymousClass6(0, aVar, com.yandex.go.superapp.searchbar.impl.presentation.a.class, "onSearchbarExpanded", "onSearchbarExpanded()V", 0), new AnonymousClass7(0, aVar, com.yandex.go.superapp.searchbar.impl.presentation.a.class, "onSearchbarCollapsed", "onSearchbarCollapsed()V", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(SuperappSearchbarContainerView superappSearchbarContainerView, t1w t1wVar) {
        superappSearchbarContainerView.setPadding(superappSearchbarContainerView.getPaddingLeft(), superappSearchbarContainerView.getPaddingTop(), superappSearchbarContainerView.getPaddingRight(), superappSearchbarContainerView.bottomPadding + t1wVar.d);
        superappSearchbarContainerView.updateBlurCoordinates();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBlurCoordinates() {
        this.contentBlurDelegate.d(new oav0(1, this), null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        amp0 amp0Var = this.animator.h;
        if (amp0Var == null || !((ValueAnimator) amp0Var.c).isRunning()) {
            return super.dispatchTouchEvent(ev);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Lg(new b(this));
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
