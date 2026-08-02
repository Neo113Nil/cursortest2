package com.yandex.go.shortcuts.impl.ui.feed;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.doq;
import defpackage.ekh0;
import defpackage.koe;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import defpackage.u7h0;
import defpackage.u90;
import defpackage.uz;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/go/shortcuts/impl/ui/feed/CoordinatorFeedView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lkoe;", "binding", "Lkoe;", "Landroid/widget/FrameLayout;", "bottomSheetView", "Landroid/widget/FrameLayout;", "Lcom/yandex/go/shortcuts/impl/ui/feed/StickyView;", "stickyView", "Lcom/yandex/go/shortcuts/impl/ui/feed/StickyView;", "Landroid/animation/AnimatorSet;", "stickyViewAnimator", "Landroid/animation/AnimatorSet;", "cardTopOffset", CA20Status.STATUS_USER_I, "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Ldoq;", "bottomSheetBehaviorCallback", "Ldoq;", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "bottomSheetBehavior", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CoordinatorFeedView extends CoordinatorLayout {
    private final koe binding;
    private final AnchorBottomSheetBehavior<FrameLayout> bottomSheetBehavior;
    private final doq bottomSheetBehaviorCallback;
    private final FrameLayout bottomSheetView;
    private final int cardTopOffset;
    private final View.OnLayoutChangeListener onLayoutChangeListener;
    private final StickyView stickyView;
    private AnimatorSet stickyViewAnimator;

    public CoordinatorFeedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(ekh0.coordinator_feed_view, this);
        int i2 = u7h0.coordinator_root;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i2, this);
        if (frameLayout != null) {
            i2 = u7h0.feed_view_container;
            if (((LinearLayout) cma1.O(i2, this)) != null) {
                i2 = u7h0.feed_view_root;
                FrameLayout frameLayout2 = (FrameLayout) cma1.O(i2, this);
                if (frameLayout2 != null) {
                    i2 = u7h0.sticky_view;
                    StickyView stickyView = (StickyView) cma1.O(i2, this);
                    if (stickyView != null) {
                        this.binding = new koe(this, frameLayout, frameLayout2, stickyView);
                        this.bottomSheetView = frameLayout;
                        this.stickyView = stickyView;
                        int u = tje.u(280, getContext());
                        this.cardTopOffset = u;
                        this.onLayoutChangeListener = new u90(19, this);
                        OneShotPreDrawListener.add(this, new uz(21, this));
                        cvw.g0(qje.t(xng0.bgMain, getContext()), tje.r(mrg0.modal_view_corner_radius_big, getContext()), frameLayout2);
                        doq doqVar = new doq(this);
                        this.bottomSheetBehaviorCallback = doqVar;
                        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
                            ny61.g("The view is not a child of CoordinatorLayout");
                            throw null;
                        }
                        CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                        if (!(behavior instanceof AnchorBottomSheetBehavior)) {
                            ny61.g("The view is not associated with AnchorBottomSheetBehavior");
                            throw null;
                        }
                        AnchorBottomSheetBehavior<FrameLayout> anchorBottomSheetBehavior = (AnchorBottomSheetBehavior) behavior;
                        anchorBottomSheetBehavior.C = false;
                        anchorBottomSheetBehavior.O(4);
                        anchorBottomSheetBehavior.Z = false;
                        anchorBottomSheetBehavior.M(u, false);
                        anchorBottomSheetBehavior.N = doqVar;
                        this.bottomSheetBehavior = anchorBottomSheetBehavior;
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLayoutChangeListener$lambda$0(CoordinatorFeedView coordinatorFeedView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        coordinatorFeedView.bottomSheetBehavior.L(c.o(coordinatorFeedView.binding.b));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.onLayoutChangeListener);
        this.bottomSheetBehaviorCallback.b = null;
    }

    public CoordinatorFeedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CoordinatorFeedView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CoordinatorFeedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
