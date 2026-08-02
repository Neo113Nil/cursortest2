package com.yandex.go.delivery.router;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a2i0;
import defpackage.a3v;
import defpackage.bhh;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.eqh0;
import defpackage.izh;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tls;
import defpackage.ts11;
import defpackage.u90;
import defpackage.uxh;
import defpackage.vzh;
import defpackage.w130;
import defpackage.w511;
import defpackage.wth;
import defpackage.wzh;
import defpackage.xng0;
import defpackage.xni;
import defpackage.xw31;
import defpackage.xzh;
import defpackage.y5e;
import defpackage.yzh;
import defpackage.zdh0;
import defpackage.zy11;
import defpackage.zzh;
import kotlin.Metadata;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.CloseButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.logistics.childrouter.api.Animation;
import ru.yandex.taxi.logistics.childrouter.api.ButtonType;
import ru.yandex.taxi.logistics.childrouter.api.ScreenMode;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0018H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0018H\u0014¢\u0006\u0004\b(\u0010'J\u0017\u0010+\u001a\u00020\u00182\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0018H\u0014¢\u0006\u0004\b-\u0010'J\u000f\u0010.\u001a\u00020)H\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020)H\u0014¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020 H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0018H\u0002¢\u0006\u0004\b3\u0010'J\u000f\u00104\u001a\u00020\u0018H\u0002¢\u0006\u0004\b4\u0010'J\u000f\u00105\u001a\u00020\u0018H\u0002¢\u0006\u0004\b5\u0010'J\u000f\u00106\u001a\u00020\u0018H\u0002¢\u0006\u0004\b6\u0010'J\u000f\u00107\u001a\u00020\u0018H\u0002¢\u0006\u0004\b7\u0010'J\u000f\u00108\u001a\u00020\u0018H\u0002¢\u0006\u0004\b8\u0010'J\u000f\u00109\u001a\u00020\u0018H\u0002¢\u0006\u0004\b9\u0010'J\u0019\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b=\u0010>J/\u0010C\u001a\u00020A2\u0006\u0010?\u001a\u00020\u00152\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u0018\u0018\u00010@H\u0002¢\u0006\u0004\bC\u0010DJ/\u0010E\u001a\u00020A2\u0006\u0010?\u001a\u00020\u00152\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u0018\u0018\u00010@H\u0002¢\u0006\u0004\bE\u0010DJ\u001f\u0010H\u001a\u00020\u00182\u0006\u0010F\u001a\u00020<2\u0006\u0010G\u001a\u00020)H\u0002¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010JR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010KR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010LR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010V\u001a\u0010\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020 \u0018\u00010@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010UR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010[R\u0018\u0010F\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006a"}, d2 = {"Lcom/yandex/go/delivery/router/DeliveryCommonChildModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lxzh;", "Landroid/content/Context;", "context", "Lizh;", "payload", "La3v;", "focusCoordinator", "Lxni;", "engine", "Lvzh;", "listener", "<init>", "(Landroid/content/Context;Lizh;La3v;Lxni;Lvzh;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lxzh;", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "Lzy11;", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lw130;", "insetsType", "()Lw130;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "contentTop", "onModalViewAppear", "(I)V", "onBackPressed", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "getTopOffset", "hasCustomBackground", "()Z", "applyInitPaddings", "configureBackground", "configureFocusCoordinator", "configureShadow", "configureCardMode", "configureAnimations", "hideKeyboard", "Lru/yandex/taxi/logistics/childrouter/api/ButtonType;", "buttonType", "Landroid/view/View;", "setupButton", "(Lru/yandex/taxi/logistics/childrouter/api/ButtonType;)Landroid/view/View;", "clickListener", "Lkotlin/Function1;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "configure", "attachCloseButton", "(Ljava/lang/Runnable;Ltls;)Lru/yandex/taxi/design/FloatButtonIconComponent;", "attachBackButton", "button", "gravity", "attachHeaderButton", "(Landroid/view/View;I)V", "Lizh;", "La3v;", "Lxni;", "Lvzh;", "", "screenId", "Ljava/lang/String;", "Lts11;", "uiConfig", "Lts11;", "canTouchOutside", "Z", "isRouterOnTopPredicate", "Ltls;", "shouldCloseByHardwareBack", "Lru/yandex/taxi/logistics/childrouter/api/Animation;", "appearAnimation", "Lru/yandex/taxi/logistics/childrouter/api/Animation;", "disappearAnimation", "Landroid/view/View;", "Landroid/view/View$OnLayoutChangeListener;", "focusCoordinatorChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryCommonChildModalView extends SlideableBindingModalView<xzh> {
    private final Animation appearAnimation;
    private View button;
    private final boolean canTouchOutside;
    private final Animation disappearAnimation;
    private final xni engine;
    private final a3v focusCoordinator;
    private final View.OnLayoutChangeListener focusCoordinatorChangeListener;
    private final tls isRouterOnTopPredicate;
    private final vzh listener;
    private final izh payload;
    private final String screenId;
    private final boolean shouldCloseByHardwareBack;
    private final ts11 uiConfig;

    public DeliveryCommonChildModalView(Context context, izh izhVar, a3v a3vVar, xni xniVar, vzh vzhVar) {
        super(context);
        this.payload = izhVar;
        this.focusCoordinator = a3vVar;
        this.engine = xniVar;
        this.listener = vzhVar;
        this.screenId = izhVar.k;
        ts11 ts11Var = izhVar.i;
        this.uiConfig = ts11Var;
        this.canTouchOutside = izhVar.f;
        this.isRouterOnTopPredicate = izhVar.m;
        this.shouldCloseByHardwareBack = izhVar.g;
        this.appearAnimation = ts11Var.g;
        this.disappearAnimation = ts11Var.h;
        this.focusCoordinatorChangeListener = new u90(24, this);
        applyInitPaddings();
        configureBackground();
        configureFocusCoordinator();
        configureShadow();
        configureCardMode();
        configureAnimations();
        if (ts11Var.d) {
            setArrowState(ArrowsView.State.GONE);
        }
        this.button = setupButton(izhVar.c);
    }

    private final void applyInitPaddings() {
        int w = (int) tje.w(this.uiConfig.a, getContext());
        setPadding(w, getPaddingTop(), w, w);
    }

    private final FloatButtonIconComponent attachBackButton(Runnable clickListener, tls configure) {
        BackButtonIconComponent backButtonIconComponent = new BackButtonIconComponent(getContext(), null, 0, a2i0.FloatButtonIconStyle, 4, null);
        backButtonIconComponent.setDebounceClickListener(clickListener);
        backButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, backButtonIconComponent.getContext())));
        if (configure != null) {
            configure.invoke(backButtonIconComponent);
        }
        attachHeaderButton(backButtonIconComponent, 8388611);
        return backButtonIconComponent;
    }

    public static /* synthetic */ FloatButtonIconComponent attachBackButton$default(DeliveryCommonChildModalView deliveryCommonChildModalView, Runnable runnable, tls tlsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            tlsVar = null;
        }
        return deliveryCommonChildModalView.attachBackButton(runnable, tlsVar);
    }

    private final FloatButtonIconComponent attachCloseButton(Runnable clickListener, tls configure) {
        CloseButtonIconComponent closeButtonIconComponent = new CloseButtonIconComponent(getContext(), null, a2i0.FloatButtonIconStyle);
        closeButtonIconComponent.setDebounceClickListener(clickListener);
        closeButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, closeButtonIconComponent.getContext())));
        if (configure != null) {
            configure.invoke(closeButtonIconComponent);
        }
        attachHeaderButton(closeButtonIconComponent, 8388613);
        return closeButtonIconComponent;
    }

    public static /* synthetic */ FloatButtonIconComponent attachCloseButton$default(DeliveryCommonChildModalView deliveryCommonChildModalView, Runnable runnable, tls tlsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            tlsVar = null;
        }
        return deliveryCommonChildModalView.attachCloseButton(runnable, tlsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachHeaderButton(View button, int gravity) {
        getBinding().c.setVisibility(0);
        button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, gravity | 16));
        getBinding().c.addView(button);
    }

    private final void configureAnimations() {
        Animation animation = this.appearAnimation;
        Animation animation2 = Animation.NONE;
        this.animateOnAppearing = animation != animation2;
        this.animateOnDismissing = this.disappearAnimation != animation2;
    }

    private final void configureBackground() {
        getBottomSheet().setBackground(null);
        if (this.uiConfig.b) {
            return;
        }
        cvw.g0(qje.t(xng0.bgMain, getContext()), this.payload.d == ScreenMode.FULLSCREEN_MODE ? 0 : getContext().getResources().getDimensionPixelSize(mrg0.modal_view_corner_radius_big), getBinding().b);
    }

    private final void configureCardMode() {
        SlideableModalView.CardMode cardMode;
        int i = wzh.a[this.payload.d.ordinal()];
        if (i == 1) {
            cardMode = SlideableModalView.CardMode.FIXED_CARD;
        } else if (i == 2) {
            cardMode = SlideableModalView.CardMode.SLIDEABLE_CARD;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            cardMode = SlideableModalView.CardMode.FULLSCREEN;
        }
        setCardMode(cardMode);
    }

    private final void configureFocusCoordinator() {
        if (this.payload.h) {
            getBinding().b.addOnLayoutChangeListener(this.focusCoordinatorChangeListener);
        }
    }

    private final void configureShadow() {
        if (this.uiConfig.c) {
            return;
        }
        setEnableBackgroundOnAppearing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void focusCoordinatorChangeListener$lambda$0(DeliveryCommonChildModalView deliveryCommonChildModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        deliveryCommonChildModalView.focusCoordinator.Td(tje.u(27, deliveryCommonChildModalView.getContext()) + deliveryCommonChildModalView.getBinding().b.getMeasuredHeight(), new DeliveryCommonChildModalView$focusCoordinatorChangeListener$1$1(0, deliveryCommonChildModalView, DeliveryCommonChildModalView.class, "hashCode", "hashCode()I", 0));
    }

    private final void hideKeyboard() {
        View findFocus = getBinding().b.findFocus();
        if (findFocus == null) {
            findFocus = getBinding().b;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(findFocus.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(DeliveryCommonChildModalView deliveryCommonChildModalView, t1w t1wVar) {
        int paddingBottom;
        boolean z = deliveryCommonChildModalView.get_cardMode() == SlideableModalView.CardMode.FULLSCREEN;
        if (z) {
            Integer num = deliveryCommonChildModalView.uiConfig.f;
            deliveryCommonChildModalView.setTopSystemWindowInset(num != null ? num.intValue() : t1wVar.b);
        } else {
            if (z) {
                w511.b();
                return null;
            }
            deliveryCommonChildModalView.setPadding(deliveryCommonChildModalView.getPaddingLeft(), t1wVar.b, deliveryCommonChildModalView.getPaddingRight(), deliveryCommonChildModalView.getPaddingBottom());
        }
        tls tlsVar = deliveryCommonChildModalView.isRouterOnTopPredicate;
        boolean z2 = (tlsVar != null ? ((Boolean) tlsVar.invoke(deliveryCommonChildModalView.screenId)).booleanValue() : true) || !t1wVar.f;
        if (z2) {
            paddingBottom = t1wVar.g;
        } else {
            if (z2) {
                w511.b();
                return null;
            }
            paddingBottom = deliveryCommonChildModalView.getBinding().b.getPaddingBottom();
        }
        FrameLayout frameLayout = deliveryCommonChildModalView.getBinding().b;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), paddingBottom);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(DeliveryCommonChildModalView deliveryCommonChildModalView) {
        deliveryCommonChildModalView.refreshNestedScrollView(deliveryCommonChildModalView.getBinding().b);
    }

    private final View setupButton(ButtonType buttonType) {
        uxh uxhVar = new uxh(3, this.listener);
        int i = wzh.b[buttonType.ordinal()];
        if (i == 1) {
            return attachCloseButton$default(this, uxhVar, null, 2, null);
        }
        if (i != 2) {
            return null;
        }
        return attachBackButton$default(this, uxhVar, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupButton$onFloatButtonBack(vzh vzhVar) {
        ((zzh) ((yzh) vzhVar).a).r(new wth(9));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        if (this.disappearAnimation == Animation.SIDE_SLIDE) {
            y5e.c(getContent(), startAction, endAction, null, 12);
        } else {
            super.animateDismiss(startAction, endAction);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        if (this.appearAnimation == Animation.SIDE_SLIDE) {
            y5e.d(getContent(), onAnimateShowStartAction, onAnimateShowEndAction, null, 12);
        } else {
            super.animateShow(onAnimateShowStartAction, onAnimateShowEndAction);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.component_black_opacity_80;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public xzh bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(eqh0.delivery_common_child_modal_view, parent, false);
        parent.addView(inflate);
        int i = zdh0.delivery_common_child_content;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null) {
            i = zdh0.delivery_common_child_header;
            FrameLayout frameLayout2 = (FrameLayout) cma1.O(i, inflate);
            if (frameLayout2 != null) {
                return new xzh((LinearLayout) inflate, frameLayout, frameLayout2);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopOffset() {
        int height = getBinding().c.getHeight() - tje.u(12, getContext());
        if (height < 0) {
            return 0;
        }
        return height;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public w130 insetsType() {
        return new w130(1, new bhh(10, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ScreenMode screenMode = this.payload.d;
        if (screenMode == ScreenMode.FIXED || screenMode == ScreenMode.FULLSCREEN_MODE) {
            setDismissOnTouchOutside(false);
            setOnTouchOutsideListener(null);
        }
        this.engine.b(getBinding().b);
        getBinding().b.post(new uxh(2, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        if (this.shouldCloseByHardwareBack) {
            ((zzh) ((yzh) this.listener).a).r(new wth(10));
            super.onBackPressed();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.engine.a();
        this.focusCoordinator.t4(new DeliveryCommonChildModalView$onDetachedFromWindow$1(0, this, DeliveryCommonChildModalView.class, "hashCode", "hashCode()I", 0));
        getBinding().b.removeOnLayoutChangeListener(this.focusCoordinatorChangeListener);
        hideKeyboard();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        View view = this.button;
        if (view != null) {
            view.performAccessibilityAction(64, null);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        int rawX = (int) event.getRawX();
        int rawY = (int) event.getRawY();
        if (!this.canTouchOutside || xw31.l(rawX, rawY, 0, getBinding().b)) {
            return super.onTouchEvent(event);
        }
        return false;
    }
}
