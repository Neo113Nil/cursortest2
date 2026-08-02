package com.yandex.go.order.bundle.map.impl.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cvw;
import defpackage.js4;
import defpackage.m180;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.n180;
import defpackage.qdb1;
import defpackage.tje;
import defpackage.wqh0;
import defpackage.x4e;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ7\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0015¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0014¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b.\u0010#¨\u00060"}, d2 = {"Lcom/yandex/go/order/bundle/map/impl/ui/BundledOrdersModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Lcom/yandex/go/order/bundle/map/impl/ui/BundledOrderListView;", "bundledOrderListView", "Lm180;", "orderModalViewContentHeightRepository", "<init>", "(Landroid/content/Context;Lcom/yandex/go/order/bundle/map/impl/ui/BundledOrderListView;Lm180;)V", "Lzy11;", "applyBottomSheetBackground", "()V", "placeBackButtonToTopLeftCornerOfContent", "updateContentOffset", "", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "hasCustomBackground", "()Z", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "", "newOffset", "setBackgroundDimColor", "(F)V", "isApplyShadow", "Lcom/yandex/go/order/bundle/map/impl/ui/BundledOrderListView;", "Lm180;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BundledOrdersModalView extends SlideableModalView {
    private final FloatButtonIconComponent backButton;
    private final BundledOrderListView bundledOrderListView;
    private final m180 orderModalViewContentHeightRepository;

    public BundledOrdersModalView(Context context, BundledOrderListView bundledOrderListView, m180 m180Var) {
        super(context, 7);
        this.bundledOrderListView = bundledOrderListView;
        this.orderModalViewContentHeightRepository = m180Var;
        this.backButton = qdb1.b(this, new js4(21, this));
        getCardContentContainer().addView(bundledOrderListView);
        setArrowState(ArrowsView.State.GONE);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        applyBottomSheetBackground();
        placeBackButtonToTopLeftCornerOfContent();
        getBottomSheetBehavior().B = false;
    }

    private final void applyBottomSheetBackground() {
        cvw.g0(0, 0, getBottomSheet());
    }

    private final void placeBackButtonToTopLeftCornerOfContent() {
        ViewParent parent = this.backButton.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setTranslationZ(10.0f);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.anchorGravity = 48;
                layoutParams2.gravity = 80;
                layoutParams2.setBehavior(null);
            }
            viewGroup.setLayoutParams(layoutParams);
        }
        FloatButtonIconComponent floatButtonIconComponent = this.backButton;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (!floatButtonIconComponent.isLaidOut() || floatButtonIconComponent.isLayoutRequested()) {
            floatButtonIconComponent.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.order.bundle.map.impl.ui.BundledOrdersModalView$placeBackButtonToTopLeftCornerOfContent$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    BundledOrdersModalView.this.updateContentOffset();
                }
            });
        } else {
            updateContentOffset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContentOffset() {
        BundledOrderListView bundledOrderListView = this.bundledOrderListView;
        bundledOrderListView.setPadding(tje.r(mrg0.go_design_s_space, getContext()), this.backButton.getHeight(), tje.r(mrg0.go_design_s_space, getContext()), bundledOrderListView.getPaddingBottom());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        applyBottomSheetBackground();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.black_alpha50;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev) || (getParent() != null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return wqh0.slideable_state_modal_view;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        x4e.z(getBottomSheet().getTop(), ((n180) this.orderModalViewContentHeightRepository).a, null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setBackgroundDimColor(float newOffset) {
    }
}
