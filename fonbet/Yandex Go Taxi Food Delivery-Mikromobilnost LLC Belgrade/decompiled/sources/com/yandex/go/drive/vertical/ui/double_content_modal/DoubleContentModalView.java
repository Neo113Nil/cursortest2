package com.yandex.go.drive.vertical.ui.double_content_modal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.drive.sdkintegration.presentation.DriveHostView;
import com.yandex.mobile.drive.sdk.full.DriveSummaryCardCollapseSource;
import com.yandex.mobile.drive.sdk.full.DriveSummaryCardExpansionSource;
import defpackage.ahm;
import defpackage.bxl;
import defpackage.cma1;
import defpackage.dth0;
import defpackage.e230;
import defpackage.ebc;
import defpackage.eem;
import defpackage.fem;
import defpackage.fih0;
import defpackage.jl40;
import defpackage.jpo;
import defpackage.l5m;
import defpackage.m5m;
import defpackage.n5m;
import defpackage.ndh0;
import defpackage.ny61;
import defpackage.od8;
import defpackage.rgm;
import defpackage.rp31;
import defpackage.t0k;
import defpackage.t1w;
import defpackage.u90;
import defpackage.uz;
import defpackage.w130;
import defpackage.w511;
import defpackage.xgm;
import defpackage.zvi;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.animation.LogarithmicInterpolator;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001HB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u000fJ\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\r2\u0006\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020&H\u0014¢\u0006\u0004\b-\u0010*J\u0019\u00100\u001a\u00020\r2\b\b\u0001\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\r2\u0006\u00103\u001a\u000202H\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\rH\u0014¢\u0006\u0004\b6\u0010\u000fJ\u000f\u00108\u001a\u000207H\u0014¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0010H\u0014¢\u0006\u0004\b:\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010=R\u0016\u0010>\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lcom/yandex/go/drive/vertical/ui/double_content_modal/DoubleContentModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ll5m;", "Landroid/content/Context;", "context", "Lebc;", "collapsedView", "Ljpo;", "expandedView", "Lm5m;", "delegate", "<init>", "(Landroid/content/Context;Lebc;Ljpo;Lm5m;)V", "Lzy11;", "actualizeAnchorOffset", "()V", "", "isAnchored", "updateContainersZ", "(Z)V", "onAttachedToWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ll5m;", "onSlideOut", "", "getTopPadding", "()I", "canDragToExpandFromAnchored", "()Z", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "behavior", "initBehavior", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "", "newOffset", "onDialogSlide", "(F)V", "", "duration", "animateShowBackground", "(J)V", "animateDismissBackground", "Le230;", "insetsType", "()Le230;", "hasCustomBackground", "Lebc;", "Ljpo;", "Lm5m;", "lastSlide", "F", "Lru/yandex/taxi/animation/LogarithmicInterpolator;", "alphaInterpolator", "Lru/yandex/taxi/animation/LogarithmicInterpolator;", "Lru/yandex/taxi/widget/ArrowsView;", "getArrowsView", "()Lru/yandex/taxi/widget/ArrowsView;", "arrowsView", "Companion", "n5m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public class DoubleContentModalView extends SlideableBindingModalView<l5m> {
    private static final float BOTTOM_CONTENT_Z_INDEX = 1.0f;
    private static final n5m Companion = new n5m();
    private static final float SELECTOR_APPEARANCE_EDGE = 0.3f;
    private static final float TOP_CONTENT_Z_INDEX = 3.0f;
    private final LogarithmicInterpolator alphaInterpolator;
    private final ebc collapsedView;
    private final m5m delegate;
    private final jpo expandedView;
    private float lastSlide;

    public DoubleContentModalView(Context context, ebc ebcVar, jpo jpoVar, m5m m5mVar) {
        super(context);
        this.collapsedView = ebcVar;
        this.expandedView = jpoVar;
        this.delegate = m5mVar;
        this.lastSlide = -1.0f;
        this.alphaInterpolator = new LogarithmicInterpolator(0.2f, 1.0f);
        setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        setClickable(false);
        setClipToPadding(false);
        setClipChildren(false);
        getBinding().a.setClipChildren(false);
        getBottomSheet().setClipChildren(false);
        getBottomSheet().addOnLayoutChangeListener(new u90(27, this));
        c.z(new bxl(3, this), getArrowsView());
        getBinding().b.setOnClickListener(new od8(1));
        getBinding().a.addView(ebcVar.asView(), new FrameLayout.LayoutParams(-1, -2));
        getBinding().a.addView(((rgm) jpoVar).a, new FrameLayout.LayoutParams(-1, -1));
        updateContainersZ(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$1(DoubleContentModalView doubleContentModalView) {
        if (doubleContentModalView.isAnchored() || doubleContentModalView.isCollapsed()) {
            ahm ahmVar = (ahm) doubleContentModalView.delegate;
            fem femVar = ahmVar.H;
            if (femVar instanceof t0k) {
                ahmVar.Lg((t0k) femVar, DriveSummaryCardExpansionSource.Gesture);
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void actualizeAnchorOffset() {
        int height = this.collapsedView.asView().getHeight();
        int max = Math.max(getHeight() - height, 0);
        AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        if (bottomSheetBehavior.w(bottomSheetBehavior.x) != max) {
            getBottomSheetBehavior().M(height, false);
            getBottomSheetBehavior().G(max, false);
        }
    }

    private final ArrowsView getArrowsView() {
        View rootView = getRootView();
        int i = ndh0.slideable_modal_view_arrows;
        WeakHashMap weakHashMap = b.a;
        return (ArrowsView) ((View) rp31.d(rootView, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(DoubleContentModalView doubleContentModalView, t1w t1wVar) {
        doubleContentModalView.setTopSystemWindowInset(t1wVar.b);
        doubleContentModalView.collapsedView.applyInsets(t1wVar);
        doubleContentModalView.expandedView.getClass();
        return zy11.a;
    }

    private final void updateContainersZ(boolean isAnchored) {
        this.collapsedView.asView().setZ(isAnchored ? 3.0f : 1.0f);
        ((rgm) this.expandedView).a.setZ(isAnchored ? 1.0f : 3.0f);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        startAction.run();
        endAction.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        onAnimateShowStartAction.run();
        onAnimateShowEndAction.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShowBackground(long duration) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public l5m bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(dth0.double_content_layout, parent, false);
        int i = fih0.click_catcher;
        View O = cma1.O(i, inflate);
        if (O != null) {
            return new l5m((GoFrameLayout) inflate, O);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void initBehavior(AnchorBottomSheetBehavior<View> behavior) {
        super.initBehavior(behavior);
        getBottomSheetBehavior().W = false;
        getBottomSheetBehavior().Z = false;
        getBottomSheetBehavior().J(true);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new zvi(17, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        OneShotPreDrawListener.add(this, new uz(29, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        t0k t0kVar;
        super.onDialogSlide(newOffset);
        float x = getBottomSheetBehavior().x();
        float max = Float.compare(x, 1.0f) == 0 ? 0.0f : Math.max(0.0f, (newOffset - x) / (1.0f - x));
        if (Float.compare(newOffset, x) > 0 && Float.compare(x, 1.0f) == 0) {
            max = 1.0f;
        }
        if (Float.compare(this.lastSlide, max) == 0) {
            return;
        }
        this.lastSlide = max;
        boolean z = true;
        float interpolation = Float.compare(max, 0.3f) == 1 ? this.alphaInterpolator.getInterpolation((max - 0.3f) / 0.7f) : 0.0f;
        if (Float.compare(max, 0.0f) == 0) {
            updateContainersZ(true);
        } else if (Float.compare(max, 0.0f) == 1) {
            updateContainersZ(false);
        }
        if (Float.compare(max, 1.0f) == 0) {
            refreshNestedScrollView(((rgm) this.expandedView).a);
        } else if (Float.compare(max, 0.0f) == 0) {
            refreshNestedScrollView(this.collapsedView.asView());
        }
        boolean z2 = Float.compare(max, 1.0f) == 0;
        getArrowsView().setVisibility(!z2 ? 0 : 8);
        this.collapsedView.onSlideParent((getRootView().getHeight() - getBottomSheetBehavior().a) * newOffset, z2 ? 0.0f : 1.0f - interpolation);
        rgm rgmVar = (rgm) this.expandedView;
        DriveHostView driveHostView = rgmVar.a;
        driveHostView.setAlpha(interpolation);
        driveHostView.setVisibility(interpolation > 0.0f ? 0 : 8);
        ahm ahmVar = rgmVar.b;
        if (ahmVar.M == null) {
            ahmVar.M = DriveSummaryCardExpansionSource.Gesture;
        }
        if (ahmVar.N == null) {
            ahmVar.N = DriveSummaryCardCollapseSource.Gesture;
        }
        boolean z3 = interpolation == 1.0f;
        boolean z4 = interpolation == 0.0f;
        if (ahmVar.J == z3 && ahmVar.K == z4) {
            return;
        }
        ahmVar.J = z3;
        ahmVar.K = z4;
        xgm xgmVar = (xgm) ahmVar.Dg();
        if (!z3 && !ahmVar.L) {
            z = false;
        }
        xgmVar.z5(z);
        fem femVar = ahmVar.H;
        if (femVar instanceof t0k) {
            t0kVar = (t0k) femVar;
        } else {
            if (!(femVar instanceof eem) && femVar != null) {
                w511.b();
                return;
            }
            t0kVar = null;
        }
        if (z4 && !jl40.l(t0kVar, ahmVar.I) && t0kVar != null) {
            ahmVar.Mg(t0kVar);
        }
        if (z3) {
            ((xgm) ahmVar.Dg()).notifySummaryExpanded(ahmVar.M);
            ahmVar.M = null;
        } else if (z4) {
            ((xgm) ahmVar.Dg()).notifySummaryCollapsed(ahmVar.N);
            ahmVar.N = null;
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }
}
