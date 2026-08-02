package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l0;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.pager.PagerSelectedActionsDispatcher;
import com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.core.widget.ViewPager2Wrapper;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import com.yandex.div2.a;
import com.yandex.div2.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.epx;
import xsna.gzs;
import xsna.msy;
import xsna.zcl;

/* compiled from: DivPagerView.kt */
/* loaded from: classes7.dex */
public class DivPagerView extends ViewPager2Wrapper implements DivHolderView<a.i> {
    private final /* synthetic */ DivHolderViewMixin<a.i> $$delegate_0;
    private final Lazy accessibilityDelegate$delegate;
    private ViewPager2.g changePageCallbackForLogger;
    private OffScreenPagesUpdateCallback changePageCallbackForOffScreenPages;
    private ViewPager2.g changePageCallbackForState;
    private final List<ViewPager2.g> changePageCallbacksForIndicators;
    private OnInterceptTouchEventListener onInterceptTouchEventListener;
    private OnItemsUpdatedCallback pagerOnItemsCountChange;
    private PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher;

    /* compiled from: DivPagerView.kt */
    public interface OnItemsUpdatedCallback {
    }

    public /* synthetic */ DivPagerView(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private DivPagerView$accessibilityDelegate$2.AnonymousClass1 getAccessibilityDelegate() {
        return (DivPagerView$accessibilityDelegate$2.AnonymousClass1) this.accessibilityDelegate$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getWrapperFor(View view) {
        while (!epx.f(view, getRecyclerView())) {
            if (view instanceof DivViewWrapper) {
                return view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
        }
        return null;
    }

    public void addChangePageCallbackForIndicators(ViewPager2.g gVar) {
        this.changePageCallbacksForIndicators.add(gVar);
        getViewPager().b(gVar);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(Disposable disposable) {
        this.$$delegate_0.addSubscription(disposable);
    }

    public void clearChangePageCallbackForIndicators() {
        Iterator<T> it = this.changePageCallbacksForIndicators.iterator();
        while (it.hasNext()) {
            getViewPager().g((ViewPager2.g) it.next());
        }
        this.changePageCallbacksForIndicators.clear();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            divBorderDrawer.clipCorners(canvas);
            super.draw(canvas);
            divBorderDrawer.drawBorder(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view != null && view.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(view, canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    public void enableAccessibility() {
        RecyclerView recyclerView;
        DivPagerView$accessibilityDelegate$2.AnonymousClass1 accessibilityDelegate = getAccessibilityDelegate();
        if (accessibilityDelegate == null || (recyclerView = getRecyclerView()) == null) {
            return;
        }
        recyclerView.setAccessibilityDelegateCompat(accessibilityDelegate);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    public ViewPager2.g getChangePageCallbackForLogger$div_release() {
        return this.changePageCallbackForLogger;
    }

    public OffScreenPagesUpdateCallback getChangePageCallbackForOffScreenPages$div_release() {
        return this.changePageCallbackForOffScreenPages;
    }

    public ViewPager2.g getChangePageCallbackForState$div_release() {
        return this.changePageCallbackForState;
    }

    public boolean getClipToPage$div_release() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            return recyclerView.getClipChildren();
        }
        return false;
    }

    public int getCurrentItem$div_release() {
        return getViewPager().getCurrentItem();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public a.i getDiv() {
        return this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    public View getPageView(int i) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return null;
        }
        View childAt = recyclerView.getChildAt(i);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.getChildAt(0);
    }

    public OnItemsUpdatedCallback getPagerOnItemsCountChange$div_release() {
        return this.pagerOnItemsCountChange;
    }

    public PagerSelectedActionsDispatcher getPagerSelectedActionsDispatcher$div_release() {
        return this.pagerSelectedActionsDispatcher;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int i, int i2) {
        this.$$delegate_0.onBoundsChanged(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        OnInterceptTouchEventListener onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        return (onInterceptTouchEventListener != null ? onInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent) : false) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        onBoundsChanged(i, i2);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public void removeChangePageCallbackForIndicators(ViewPager2.g gVar) {
        this.changePageCallbacksForIndicators.remove(gVar);
        getViewPager().g(gVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(BindingContext bindingContext, u1 u1Var, View view) {
        this.$$delegate_0.setBorder(bindingContext, u1Var, view);
    }

    public void setChangePageCallbackForLogger$div_release(ViewPager2.g gVar) {
        ViewPager2.g gVar2 = this.changePageCallbackForLogger;
        if (gVar2 != null) {
            getViewPager().g(gVar2);
        }
        if (gVar != null) {
            getViewPager().b(gVar);
        }
        this.changePageCallbackForLogger = gVar;
    }

    public void setChangePageCallbackForOffScreenPages$div_release(OffScreenPagesUpdateCallback offScreenPagesUpdateCallback) {
        OffScreenPagesUpdateCallback offScreenPagesUpdateCallback2 = this.changePageCallbackForOffScreenPages;
        if (offScreenPagesUpdateCallback2 != null) {
            getViewPager().g(offScreenPagesUpdateCallback2);
            RecyclerView recyclerView = getRecyclerView();
            if (recyclerView != null) {
                recyclerView.removeOnLayoutChangeListener(offScreenPagesUpdateCallback2);
            }
        }
        if (offScreenPagesUpdateCallback != null) {
            getViewPager().b(offScreenPagesUpdateCallback);
            RecyclerView recyclerView2 = getRecyclerView();
            if (recyclerView2 != null) {
                recyclerView2.addOnLayoutChangeListener(offScreenPagesUpdateCallback);
            }
        }
        this.changePageCallbackForOffScreenPages = offScreenPagesUpdateCallback;
    }

    public void setChangePageCallbackForState$div_release(ViewPager2.g gVar) {
        ViewPager2.g gVar2 = this.changePageCallbackForState;
        if (gVar2 != null) {
            getViewPager().g(gVar2);
        }
        if (gVar != null) {
            getViewPager().b(gVar);
        }
        this.changePageCallbackForState = gVar;
    }

    public void setClipToPage$div_release(boolean z) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        recyclerView.setClipChildren(z);
    }

    public void setCurrentItem$div_release(int i) {
        getViewPager().e(i, false);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(a.i iVar) {
        this.$$delegate_0.setDiv(iVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    public void setOnInterceptTouchEventListener(OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.onInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setPagerOnItemsCountChange$div_release(OnItemsUpdatedCallback onItemsUpdatedCallback) {
        this.pagerOnItemsCountChange = onItemsUpdatedCallback;
    }

    public void setPagerSelectedActionsDispatcher$div_release(PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher) {
        PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher2 = this.pagerSelectedActionsDispatcher;
        if (pagerSelectedActionsDispatcher2 != null) {
            pagerSelectedActionsDispatcher2.detach(getViewPager());
        }
        if (pagerSelectedActionsDispatcher != null) {
            pagerSelectedActionsDispatcher.attach(getViewPager());
        }
        this.pagerSelectedActionsDispatcher = pagerSelectedActionsDispatcher;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivPagerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.changePageCallbacksForIndicators = new ArrayList();
        this.accessibilityDelegate$delegate = msy.a(LazyThreadSafetyMode.NONE, new gzs<DivPagerView$accessibilityDelegate$2.AnonymousClass1>() { // from class: com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2$1] */
            @Override // xsna.gzs
            public final AnonymousClass1 invoke() {
                RecyclerView recyclerView = DivPagerView.this.getRecyclerView();
                if (recyclerView == null) {
                    return null;
                }
                return new l0(DivPagerView.this) { // from class: com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2.1
                    final /* synthetic */ DivPagerView this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(RecyclerView.this);
                        this.this$0 = r2;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
                    
                        r2 = r1.this$0.getWrapperFor(r2);
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private final void performActionIfNeeded(View view, AccessibilityEvent accessibilityEvent) {
                        View wrapperFor;
                        int childAdapterPosition;
                        if (accessibilityEvent.getEventType() != 32768 || wrapperFor == null || this.this$0.getCurrentItem$div_release() == (childAdapterPosition = RecyclerView.this.getChildAdapterPosition(wrapperFor)) || childAdapterPosition == -1) {
                            return;
                        }
                        RecyclerView.this.performAccessibilityAction(childAdapterPosition > this.this$0.getCurrentItem$div_release() ? 4096 : 8192, null);
                    }

                    @Override // xsna.hk
                    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                        performActionIfNeeded(view, accessibilityEvent);
                        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                    }
                };
            }
        });
    }

    /* compiled from: DivPagerView.kt */
    public static abstract class OffScreenPagesUpdateCallback extends ViewPager2.g implements View.OnLayoutChangeListener {
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        }
    }
}
