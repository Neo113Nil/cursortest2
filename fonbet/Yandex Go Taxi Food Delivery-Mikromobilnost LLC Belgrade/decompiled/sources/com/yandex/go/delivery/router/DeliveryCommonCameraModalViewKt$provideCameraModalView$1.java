package com.yandex.go.delivery.router;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b;
import com.yandex.go.delivery.router.DeliveryCommonCameraModalViewKt$provideCameraModalView$1;
import defpackage.gtq0;
import defpackage.hgr0;
import defpackage.izh;
import defpackage.j0g;
import defpackage.mqg0;
import defpackage.qje;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.ts11;
import defpackage.u90;
import defpackage.xng0;
import defpackage.xni;
import defpackage.xw31;
import defpackage.zvg;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001c\u0010\u0004J\u001d\u0010 \u001a\u00020\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0014¢\u0006\u0004\b \u0010!R\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0010\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"com/yandex/go/delivery/router/DeliveryCommonCameraModalViewKt$provideCameraModalView$1", "Lru/yandex/taxi/widget/SlideableModalView;", "Lzy11;", "applyInitPaddings", "()V", "", "height", "oldHeight", "onBottomSectionLayoutUpdated", "(II)V", "Landroid/widget/FrameLayout;", "bottomSectionContainer", "Lxni;", "bottomSectionEngine", "setupBottomSection", "(Landroid/widget/FrameLayout;Lxni;)V", "", "shouldShow", "updateBottomSectionShadowAnimated", "(Z)V", "hideKeyboard", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onAttachedToWindow", "onDetachedFromWindow", "onBackPressed", "onSlideOut", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "bottomSheetBehavior", "setInitialBehaviorState", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "Lkotlin/Function1;", "", "isRouterOnTopPredicate", "Ltls;", "bottomSectionShadowView", "Landroid/view/View;", "isShadowVisible", "Z", "", "lastSlideOffset", "F", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryCommonCameraModalViewKt$provideCameraModalView$1 extends SlideableModalView {
    final /* synthetic */ FrameLayout $bottomSectionContainer;
    final /* synthetic */ xni $bottomSectionEngine;
    final /* synthetic */ xni $engine;
    final /* synthetic */ sls $goBack;
    final /* synthetic */ FrameLayout $mainContentContainer;
    final /* synthetic */ izh $payload;
    final /* synthetic */ a $shadowUtil;
    private View bottomSectionShadowView;
    private final tls isRouterOnTopPredicate;
    private boolean isShadowVisible;
    private float lastSlideOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryCommonCameraModalViewKt$provideCameraModalView$1(izh izhVar, FrameLayout frameLayout, xni xniVar, FrameLayout frameLayout2, xni xniVar2, a aVar, sls slsVar) {
        super(frameLayout, (Integer) null);
        this.$payload = izhVar;
        this.$mainContentContainer = frameLayout;
        this.$engine = xniVar;
        this.$bottomSectionContainer = frameLayout2;
        this.$bottomSectionEngine = xniVar2;
        this.$shadowUtil = aVar;
        this.$goBack = slsVar;
        applyInitPaddings();
        this.isRouterOnTopPredicate = izhVar.m;
        getBottomSheet().setBackgroundResource(mqg0.transparent);
        setEnableBackgroundOnAppearing(false);
        ts11 ts11Var = izhVar.i;
        ts11Var.getClass();
        if (ts11Var.d) {
            setArrowState(ArrowsView.State.GONE);
        }
    }

    private final void applyInitPaddings() {
        int w = (int) tje.w(this.$payload.i.a, getContext());
        setPadding(w, getPaddingTop(), w, w);
    }

    private final void hideKeyboard() {
        View findFocus = this.$mainContentContainer.findFocus();
        if (findFocus == null) {
            findFocus = this.$mainContentContainer;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(findFocus.getWindowToken(), 0);
    }

    private final void onBottomSectionLayoutUpdated(int height, int oldHeight) {
        ViewGroup.LayoutParams layoutParams;
        if (height == oldHeight) {
            return;
        }
        int x = ((int) tje.x(getContext(), 22.0f)) + height;
        View view = this.bottomSectionShadowView;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = x;
            view.setLayoutParams(layoutParams);
        }
        updateBottomSectionShadowAnimated((getBottomSheetBehavior().E == 4 ? 0.0f : this.lastSlideOffset) < 0.95f && height > 0);
    }

    private final void setupBottomSection(final FrameLayout bottomSectionContainer, xni bottomSectionEngine) {
        bottomSectionEngine.b(bottomSectionContainer);
        View content = getContent();
        CoordinatorLayout coordinatorLayout = content instanceof CoordinatorLayout ? (CoordinatorLayout) content : null;
        if (coordinatorLayout == null) {
            return;
        }
        a aVar = this.$shadowUtil;
        Context context = getContext();
        int x = (int) tje.x(getContext(), 24.0f);
        Context context2 = getContext();
        Drawable v = gtq0.v(aVar, context, x, new hgr0(0.0f, tje.w(-4, context2), tje.w(20, context2), qje.u(context2.getTheme(), xng0.effectShadowTop)), 0, 16);
        final Rect rect = new Rect();
        v.getPadding(rect);
        final View view = new View(getContext());
        view.setBackground(v);
        view.setVisibility(4);
        this.bottomSectionShadowView = view;
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        coordinatorLayout.addView(view, layoutParams);
        CoordinatorLayout.LayoutParams layoutParams2 = new CoordinatorLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        coordinatorLayout.addView(bottomSectionContainer, layoutParams2);
        bottomSectionContainer.addOnLayoutChangeListener(new u90(23, this));
        WeakHashMap weakHashMap = b.a;
        if (!bottomSectionContainer.isLaidOut() || bottomSectionContainer.isLayoutRequested()) {
            bottomSectionContainer.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.delivery.router.DeliveryCommonCameraModalViewKt$provideCameraModalView$1$setupBottomSection$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    int height = bottomSectionContainer.getHeight() + ((int) tje.x(DeliveryCommonCameraModalViewKt$provideCameraModalView$1.this.getContext(), 22.0f));
                    View view3 = view;
                    CoordinatorLayout.LayoutParams layoutParams3 = new CoordinatorLayout.LayoutParams(-1, height);
                    layoutParams3.gravity = 80;
                    view3.setLayoutParams(layoutParams3);
                    xw31.E(view, Integer.valueOf(-rect.left), 0, Integer.valueOf(-rect.right), 0);
                }
            });
            return;
        }
        CoordinatorLayout.LayoutParams layoutParams3 = new CoordinatorLayout.LayoutParams(-1, bottomSectionContainer.getHeight() + ((int) tje.x(getContext(), 22.0f)));
        layoutParams3.gravity = 80;
        view.setLayoutParams(layoutParams3);
        xw31.E(view, Integer.valueOf(-rect.left), 0, Integer.valueOf(-rect.right), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupBottomSection$lambda$7(DeliveryCommonCameraModalViewKt$provideCameraModalView$1 deliveryCommonCameraModalViewKt$provideCameraModalView$1, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        deliveryCommonCameraModalViewKt$provideCameraModalView$1.onBottomSectionLayoutUpdated(i4 - i2, i8 - i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBottomSectionShadowAnimated(final boolean shouldShow) {
        final View view = this.bottomSectionShadowView;
        if (view == null || this.isShadowVisible == shouldShow) {
            return;
        }
        this.isShadowVisible = shouldShow;
        final int i = 0;
        ViewPropertyAnimator withStartAction = view.animate().alpha(shouldShow ? 1.0f : 0.0f).setDuration(200L).withStartAction(new Runnable() { // from class: uzh
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        DeliveryCommonCameraModalViewKt$provideCameraModalView$1.updateBottomSectionShadowAnimated$lambda$9(shouldShow, view);
                        break;
                    default:
                        DeliveryCommonCameraModalViewKt$provideCameraModalView$1.updateBottomSectionShadowAnimated$lambda$10(shouldShow, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        withStartAction.withEndAction(new Runnable() { // from class: uzh
            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        DeliveryCommonCameraModalViewKt$provideCameraModalView$1.updateBottomSectionShadowAnimated$lambda$9(shouldShow, view);
                        break;
                    default:
                        DeliveryCommonCameraModalViewKt$provideCameraModalView$1.updateBottomSectionShadowAnimated$lambda$10(shouldShow, view);
                        break;
                }
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBottomSectionShadowAnimated$lambda$10(boolean z, View view) {
        if (z) {
            return;
        }
        view.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBottomSectionShadowAnimated$lambda$9(boolean z, View view) {
        if (!z || view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
        view.setAlpha(0.0f);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        xni xniVar;
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        this.$engine.b(this.$mainContentContainer);
        FrameLayout frameLayout = this.$bottomSectionContainer;
        if (frameLayout != null && (xniVar = this.$bottomSectionEngine) != null) {
            setupBottomSection(frameLayout, xniVar);
        }
        getCardContentView().post(new zvg(17, this, this.$mainContentContainer));
        Integer num = this.$payload.i.e;
        if (num != null) {
            final int intValue = num.intValue();
            View rootView = getRootView();
            WeakHashMap weakHashMap = b.a;
            if (!rootView.isLaidOut() || rootView.isLayoutRequested()) {
                rootView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.delivery.router.DeliveryCommonCameraModalViewKt$provideCameraModalView$1$onAttachedToWindow$lambda$1$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        float height = view.getHeight() - (intValue * this.getResources().getDisplayMetrics().density);
                        AnchorBottomSheetBehavior bottomSheetBehavior = this.getBottomSheetBehavior();
                        int i = (int) height;
                        if (i < 0) {
                            i = 0;
                        }
                        bottomSheetBehavior.M(i, true);
                    }
                });
            } else {
                float height = rootView.getHeight() - (intValue * getResources().getDisplayMetrics().density);
                AnchorBottomSheetBehavior bottomSheetBehavior = getBottomSheetBehavior();
                int i = (int) height;
                if (i < 0) {
                    i = 0;
                }
                bottomSheetBehavior.M(i, true);
            }
        }
        AnchorBottomSheetBehavior<View> bottomSheetBehavior2 = getBottomSheetBehavior();
        FrameLayout frameLayout2 = this.$bottomSectionContainer;
        bottomSheetBehavior2.C = false;
        bottomSheetBehavior2.a0 = true;
        bottomSheetBehavior2.W = true;
        bottomSheetBehavior2.Z = false;
        bottomSheetBehavior2.V = true;
        bottomSheetBehavior2.c0 = true;
        bottomSheetBehavior2.R(false);
        setArrowState(ArrowsView.State.PLAIN);
        setArrowDefaultColor(qje.t(xng0.bgMain, getContext()));
        bottomSheetBehavior2.N = new j0g(this, frameLayout2);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.$goBack.invoke();
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.$engine.a();
        xni xniVar = this.$bottomSectionEngine;
        if (xniVar != null) {
            xniVar.a();
        }
        hideKeyboard();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.l((int) event.getRawX(), (int) event.getRawY(), 0, getCardContentView())) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        bottomSheetBehavior.O(4);
    }
}
