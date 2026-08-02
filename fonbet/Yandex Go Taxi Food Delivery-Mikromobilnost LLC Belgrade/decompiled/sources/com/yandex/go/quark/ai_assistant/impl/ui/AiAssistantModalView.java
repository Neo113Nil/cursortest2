package com.yandex.go.quark.ai_assistant.impl.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.quark.ai_assistant.impl.analytics.AiAssistantAnalytics$NavigationButton;
import com.yandex.go.quark.ai_assistant.impl.presentation.AiAssistantPresenter$collectUiStateAsync$$inlined$collectLatestIn$1;
import com.yandex.go.quark.ai_assistant.impl.presentation.AiAssistantPresenter$collectUiStateAsync$$inlined$flatMapLatest$1;
import com.yandex.go.quark.dynamic.h;
import com.yandex.quark.webchat.navigation.internal.a;
import defpackage.a230;
import defpackage.avj0;
import defpackage.b7h0;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.d950;
import defpackage.dm1;
import defpackage.e230;
import defpackage.em1;
import defpackage.fm1;
import defpackage.g5c;
import defpackage.gvh0;
import defpackage.gxz0;
import defpackage.hc;
import defpackage.hh31;
import defpackage.jl40;
import defpackage.jm1;
import defpackage.m950;
import defpackage.mpu0;
import defpackage.mx60;
import defpackage.n751;
import defpackage.npu0;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.ol1;
import defpackage.pl1;
import defpackage.psg0;
import defpackage.qc;
import defpackage.qu;
import defpackage.quz;
import defpackage.rdb;
import defpackage.rl1;
import defpackage.se41;
import defpackage.sls;
import defpackage.sy60;
import defpackage.tje;
import defpackage.u1w;
import defpackage.ul1;
import defpackage.vdb;
import defpackage.w511;
import defpackage.wl1;
import defpackage.x1y;
import defpackage.x3;
import defpackage.x651;
import defpackage.xl1;
import defpackage.y1y;
import defpackage.y5e;
import defpackage.y651;
import defpackage.yl1;
import defpackage.z1y;
import defpackage.zl1;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.analytics.ModalViewCloseReason;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.BindingModalView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001CB=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u0013J\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0014¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020#H\u0014¢\u0006\u0004\b.\u0010'J\u000f\u0010/\u001a\u00020\u000eH\u0014¢\u0006\u0004\b/\u0010\u0013J\u000f\u00100\u001a\u00020\u000eH\u0014¢\u0006\u0004\b0\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00105R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0017\u0010;\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/yandex/go/quark/ai_assistant/impl/ui/AiAssistantModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lx1y;", "Landroid/content/Context;", "context", "Lwl1;", "presenter", "Lfm1;", "openingAnimation", "Lru/yandex/taxi/animation/NavigationDirection;", "openingAnimationDirection", "Lzl1;", "headerConfig", "Lkotlin/Function0;", "Lzy11;", "onDetachedFromWindowCallback", "<init>", "(Landroid/content/Context;Lwl1;Lfm1;Lru/yandex/taxi/animation/NavigationDirection;Lzl1;Lsls;)V", "setChatContainerInsetsHandler", "()V", "detachChatView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lx1y;", "Le230;", "insetsType", "()Le230;", "onAttachedToWindow", "", "zOrder", "show", "(Landroid/view/ViewGroup;F)V", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "Lg5c;", "closeReason", "setCloseTransitionReason", "(Lg5c;)V", "startAction", "endAction", "animateDismiss", "onDetachedFromWindow", "onBackPressed", "Lwl1;", "Lfm1;", "Lru/yandex/taxi/animation/NavigationDirection;", "Lzl1;", "Lsls;", "Lg5c;", "Landroid/view/ViewStub;", "stubChatView", "Landroid/view/ViewStub;", "Lmx60;", "quarkInterceptedBackPressedCallback", "Lmx60;", "getQuarkInterceptedBackPressedCallback", "()Lmx60;", "Landroid/view/View;", "getChatView", "()Landroid/view/View;", "chatView", "pl1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AiAssistantModalView extends BindingModalView<x1y> {
    private g5c closeReason;
    private final zl1 headerConfig;
    private final sls onDetachedFromWindowCallback;
    private final fm1 openingAnimation;
    private final NavigationDirection openingAnimationDirection;
    private final wl1 presenter;
    private final mx60 quarkInterceptedBackPressedCallback;
    private final ViewStub stubChatView;

    public AiAssistantModalView(Context context, wl1 wl1Var, fm1 fm1Var, NavigationDirection navigationDirection, zl1 zl1Var, sls slsVar) {
        super(context);
        this.presenter = wl1Var;
        this.openingAnimation = fm1Var;
        this.openingAnimationDirection = navigationDirection;
        this.headerConfig = zl1Var;
        this.onDetachedFromWindowCallback = slsVar;
        this.stubChatView = getBinding().h;
        this.quarkInterceptedBackPressedCallback = new qc(3, this);
        clearFocus();
        setChatContainerInsetsHandler();
        x1y binding = getBinding();
        c.z(new AiAssistantModalView$1$1(0, this, AiAssistantModalView.class, "onBackPressed", "onBackPressed()V", 0), binding.b);
        binding.d.c.setDebounceClickListener(new ol1(wl1Var, 1));
        if (!(zl1Var instanceof xl1)) {
            if (!jl40.l(zl1Var, yl1.a)) {
                w511.b();
                throw null;
            }
            binding.k.setVisibility(8);
            binding.m.setVisibility(8);
            return;
        }
        ViewGroup.LayoutParams layoutParams = binding.c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int u = tje.u(64, getContext());
            int marginStart = marginLayoutParams.getMarginStart();
            int marginEnd = marginLayoutParams.getMarginEnd();
            int i = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(marginStart);
            marginLayoutParams.topMargin = u;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = i;
        }
        c.z(new AiAssistantModalView$1$3(0, wl1Var, wl1.class, "openChatList", "openChatList()V", 0), binding.e);
        c.z(new AiAssistantModalView$1$4(0, wl1Var, wl1.class, "createNewChat", "createNewChat()V", 0), binding.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateShow$lambda$0(Runnable runnable, AiAssistantModalView aiAssistantModalView) {
        runnable.run();
        wl1 wl1Var = aiAssistantModalView.presenter;
        String str = wl1Var.C;
        if (str != null) {
            com.yandex.go.quark.ai_assistant.impl.router.c cVar = (com.yandex.go.quark.ai_assistant.impl.router.c) wl1Var.y.b;
            String str2 = "ai_assistant";
            cVar.A((m950) cVar.J.get(), new npu0((x3) new mpu0(str), str2, Float.valueOf(((avj0) cVar.K).b(psg0.shortcuts_corners_round)), false, 120), sy60.Q2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachChatView() {
        c.w(getChatView(), this.stubChatView);
        this.quarkInterceptedBackPressedCallback.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getChatView() {
        return getBinding().a.findViewById(b7h0.chat_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$reloadContent(wl1 wl1Var) {
        wl1Var.z.b(wl1Var.B.a);
        ((com.yandex.go.quark.ai_assistant.impl.router.c) wl1Var.y.b).T(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$close(wl1 wl1Var) {
        ((com.yandex.go.quark.ai_assistant.impl.router.c) wl1Var.y.b).r(new qu(9));
    }

    private final void setChatContainerInsetsHandler() {
        GoFrameLayout goFrameLayout = getBinding().c;
        quz quzVar = new quz(8);
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(goFrameLayout, quzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 setChatContainerInsetsHandler$lambda$0(View view, n751 n751Var) {
        if (n751Var.a.g(8).d <= 0) {
            return n751Var;
        }
        x651 x651Var = new x651(n751Var);
        u1w u1wVar = u1w.e;
        y651 y651Var = x651Var.a;
        y651Var.b(519, u1wVar);
        return y651Var.h();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        y5e.c(getContent(), startAction, endAction, this.closeReason == ModalViewCloseReason.BACK_PRESSED ? NavigationDirection.BACKWARD : NavigationDirection.FORWARD, 4);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        hc hcVar = new hc(12, onAnimateShowEndAction, this);
        fm1 fm1Var = this.openingAnimation;
        if (jl40.l(fm1Var, dm1.a)) {
            y5e.d(this, onAnimateShowStartAction, hcVar, this.openingAnimationDirection, 4);
            return;
        }
        if (!jl40.l(fm1Var, em1.a)) {
            w511.b();
            return;
        }
        getBinding().g.setScaleX(0.0f);
        getBinding().g.setScaleY(0.0f);
        getChatView().setAlpha(0.0f);
        getBinding().i.setAlpha(0.0f);
        getBinding().i.animate().alpha(1.0f).setDuration(350L);
        getBinding().g.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new FastOutSlowInInterpolator()).setDuration(300L).setListener(new AnimUtils$AnimationStartEndListener(onAnimateShowStartAction, hcVar));
        getChatView().animate().alpha(1.0f).setDuration(400L).setStartDelay(300L);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public x1y bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View O2;
        View inflate = inflater.inflate(gvh0.layout_quark_ai_assistant, parent, false);
        int i = b7h0.back_button;
        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
        if (goImageView != null) {
            i = b7h0.chat_container;
            GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
            if (goFrameLayout != null && (O = cma1.O((i = b7h0.chat_error), inflate)) != null) {
                int i2 = b7h0.description;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, O);
                if (robotoTextView != null) {
                    i2 = b7h0.reload_button;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, O);
                    if (buttonComponent != null) {
                        i2 = b7h0.title;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, O);
                        if (robotoTextView2 != null) {
                            y1y y1yVar = new y1y((GoLinearLayout) O, robotoTextView, buttonComponent, robotoTextView2);
                            int i3 = b7h0.chat_history_button;
                            GoImageView goImageView2 = (GoImageView) cma1.O(i3, inflate);
                            if (goImageView2 != null && (O2 = cma1.O((i3 = b7h0.chat_skeleton), inflate)) != null) {
                                int i4 = b7h0.keyboard_hint_skeleton;
                                if (((ShimmeringBar) cma1.O(i4, O2)) != null) {
                                    i4 = b7h0.keyboard_skeleton;
                                    if (((ShimmeringBar) cma1.O(i4, O2)) != null) {
                                        z1y z1yVar = new z1y((GoFrameLayout) O2);
                                        i3 = b7h0.chat_surface;
                                        View O3 = cma1.O(i3, inflate);
                                        if (O3 != null) {
                                            i3 = b7h0.chat_view;
                                            ViewStub viewStub = (ViewStub) cma1.O(i3, inflate);
                                            if (viewStub != null) {
                                                i3 = b7h0.header;
                                                GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i3, inflate);
                                                if (goFrameLayout2 != null) {
                                                    i3 = b7h0.new_chat_button;
                                                    GoImageView goImageView3 = (GoImageView) cma1.O(i3, inflate);
                                                    if (goImageView3 != null) {
                                                        i3 = b7h0.title;
                                                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i3, inflate);
                                                        if (robotoTextView3 != null) {
                                                            i3 = b7h0.title_skeleton;
                                                            ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i3, inflate);
                                                            if (shimmeringBar != null) {
                                                                i3 = b7h0.trail;
                                                                GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i3, inflate);
                                                                if (goLinearLayout != null) {
                                                                    return new x1y((GoFrameLayout) inflate, goImageView, goFrameLayout, y1yVar, goImageView2, z1yVar, O3, viewStub, goFrameLayout2, goImageView3, robotoTextView3, shimmeringBar, goLinearLayout);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i4)));
                                return null;
                            }
                            i = i3;
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                return null;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public final mx60 getQuarkInterceptedBackPressedCallback() {
        return this.quarkInterceptedBackPressedCallback;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new a230(5, null, new AiAssistantModalView$insetsType$1(0, getBinding().f, z1y.class, "getRoot", "getRoot()Lcom/yandex/go/design/view/GoFrameLayout;", 0));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int i = 0;
        setInterceptOnBackPress(false);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        super.onAttachedToWindow();
        wl1 wl1Var = this.presenter;
        wl1Var.Bg(new pl1(this));
        rl1 rl1Var = wl1Var.x;
        rdb rdbVar = (rdb) rl1Var.b.a.getValue();
        ((ul1) wl1Var.Dg()).render(new jm1(rdbVar != null ? ((com.yandex.go.quark.dynamic.c) rdbVar).a : null));
        tje.N(wl1Var.Jg(), null, null, new AiAssistantPresenter$collectUiStateAsync$$inlined$collectLatestIn$1(e.X(rl1Var.b, new AiAssistantPresenter$collectUiStateAsync$$inlined$flatMapLatest$1(wl1Var, null)), null, (ul1) wl1Var.Dg()), 3);
        setOnBackPressedListener(new ol1(this.presenter, i));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        post(new ce0(this, 15));
        wl1 wl1Var = this.presenter;
        o8g0 o8g0Var = wl1Var.D;
        if (o8g0Var != null) {
            se41 se41Var = (se41) o8g0Var.b;
            vdb c = h.c((h) o8g0Var.a, (gxz0) se41Var.o.e.a.getValue());
            if (c != null) {
                wl1Var.Kg(AiAssistantAnalytics$NavigationButton.Back);
                if (c.d) {
                    String str = c.a;
                    a aVar = se41Var.o;
                    if (aVar.a(new hh31(11, str, aVar)).equals(d950.a)) {
                        return;
                    }
                }
            }
        }
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        detachChatView();
        super.onDetachedFromWindow();
        this.onDetachedFromWindowCallback.invoke();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setCloseTransitionReason(g5c closeReason) {
        this.closeReason = closeReason;
        super.setCloseTransitionReason(closeReason);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void show(ViewGroup parent, float zOrder) {
        setZ(zOrder);
        parent.addView(this);
        getOnAppearingListener().d();
    }
}
