package com.yandex.div.core.view2.divs.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.R$style;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager;
import com.yandex.div.core.view2.divs.gallery.PagerSnapStartHelper;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import com.yandex.div2.DivGallery;
import com.yandex.div2.a;
import com.yandex.div2.u1;
import java.util.List;
import xsna.lpj;
import xsna.zcl;

/* compiled from: DivRecyclerView.kt */
/* loaded from: classes7.dex */
public class DivRecyclerView extends BackHandlingRecyclerView implements DivHolderView<a.c> {
    public static final Companion Companion = new Companion(null);
    private final /* synthetic */ DivHolderViewMixin<a.c> $$delegate_0;
    private int beforeScrollFocusPosition;
    private boolean needFling;
    private OnInterceptTouchEventListener onInterceptTouchEventListener;
    private PagerSnapStartHelper pagerSnapStartHelper;
    private int pointTouchX;
    private int pointTouchY;
    private float scrollInterceptionAngle;
    private DivGallery.ScrollMode scrollMode;
    private int scrollPointerId;

    /* compiled from: DivRecyclerView.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DivRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private boolean canScroll() {
        return canScrollHorizontally(-1) || canScrollHorizontally(1) || canScrollVertically(-1) || canScrollVertically(1);
    }

    private int toTouchPoint(float f) {
        return (int) Math.ceil(f);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(Disposable disposable) {
        this.$$delegate_0.addSubscription(disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view != null && view.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(view, canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        boolean fling = super.fling(i, i2);
        if (getScrollMode() == DivGallery.ScrollMode.PAGING) {
            this.needFling = !fling;
        }
        return fling;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public a.c getDiv() {
        return this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    public View getItemView(int i) {
        View childAt = getChildAt(i);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.getChildAt(0);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    public PagerSnapStartHelper getPagerSnapStartHelper() {
        return this.pagerSnapStartHelper;
    }

    public float getScrollInterceptionAngle() {
        return this.scrollInterceptionAngle;
    }

    public DivGallery.ScrollMode getScrollMode() {
        return this.scrollMode;
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        OnInterceptTouchEventListener onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (!(onInterceptTouchEventListener != null ? onInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent) : false)) {
            if (getScrollInterceptionAngle() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                this.scrollPointerId = motionEvent.getPointerId(0);
                this.pointTouchX = toTouchPoint(motionEvent.getX());
                this.pointTouchY = toTouchPoint(motionEvent.getY());
                return super.onInterceptTouchEvent(motionEvent);
            }
            if (actionMasked != 2) {
                if (actionMasked != 5) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                this.scrollPointerId = motionEvent.getPointerId(actionIndex);
                this.pointTouchX = toTouchPoint(motionEvent.getX(actionIndex));
                this.pointTouchY = toTouchPoint(motionEvent.getY(actionIndex));
                return super.onInterceptTouchEvent(motionEvent);
            }
            RecyclerView.o layoutManager = getLayoutManager();
            if (layoutManager != null && (findPointerIndex = motionEvent.findPointerIndex(this.scrollPointerId)) >= 0) {
                int touchPoint = toTouchPoint(motionEvent.getX(findPointerIndex));
                int touchPoint2 = toTouchPoint(motionEvent.getY(findPointerIndex));
                if (getScrollState() == 1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                int abs = Math.abs(touchPoint - this.pointTouchX);
                int abs2 = Math.abs(touchPoint2 - this.pointTouchY);
                if (abs != 0 || abs2 != 0) {
                    double atan = abs != 0 ? (Math.atan(abs2 / abs) * 180) / 3.141592653589793d : 90.0d;
                    if ((!layoutManager.canScrollHorizontally() || atan > getScrollInterceptionAngle()) && (!layoutManager.canScrollVertically() || atan <= getScrollInterceptionAngle())) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        if (i == 2) {
            View focusedChild = getFocusedChild();
            if (focusedChild == null) {
                this.beforeScrollFocusPosition = -1;
                return;
            }
            this.beforeScrollFocusPosition = getChildAdapterPosition(focusedChild);
        }
        super.onScrollStateChanged(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    @Override // androidx.recyclerview.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onScrolled(int i, int i2) {
        int i3;
        int i4;
        int i5;
        DivViewWrapper divViewWrapper;
        View child;
        if (this.beforeScrollFocusPosition == -1) {
            return;
        }
        RecyclerView.o layoutManager = getLayoutManager();
        int orientation = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).b : layoutManager instanceof DivGridLayoutManager ? ((DivGridLayoutManager) layoutManager).getOrientation() : 0;
        if (orientation != 1 || i2 <= 0) {
            if (orientation == 1 && i2 <= 0) {
                i3 = this.beforeScrollFocusPosition;
            } else if (i > 0) {
                i4 = this.beforeScrollFocusPosition;
            } else {
                i3 = this.beforeScrollFocusPosition;
            }
            i5 = i3 - 1;
            RecyclerView.e0 findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i5);
            KeyEvent.Callback callback = findViewHolderForAdapterPosition == null ? findViewHolderForAdapterPosition.itemView : null;
            divViewWrapper = callback instanceof DivViewWrapper ? (DivViewWrapper) callback : null;
            if (divViewWrapper != null && (child = divViewWrapper.getChild()) != null) {
                child.requestFocus();
            }
            super.onScrolled(i, i2);
        }
        i4 = this.beforeScrollFocusPosition;
        i5 = i4 + 1;
        RecyclerView.e0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i5);
        if (findViewHolderForAdapterPosition2 == null) {
        }
        if (callback instanceof DivViewWrapper) {
        }
        if (divViewWrapper != null) {
            child.requestFocus();
        }
        super.onScrolled(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        onBoundsChanged(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        RecyclerView.o layoutManager;
        PagerSnapStartHelper pagerSnapStartHelper;
        View findSnapView;
        int i;
        DivGallery.ScrollMode scrollMode = getScrollMode();
        DivGallery.ScrollMode scrollMode2 = DivGallery.ScrollMode.PAGING;
        if (scrollMode == scrollMode2) {
            this.needFling = true;
        }
        boolean z = super.onTouchEvent(motionEvent) && canScroll();
        if (motionEvent != null && motionEvent.getActionMasked() == 1 && getScrollMode() == scrollMode2 && this.needFling && (layoutManager = getLayoutManager()) != null && (pagerSnapStartHelper = getPagerSnapStartHelper()) != null && (findSnapView = pagerSnapStartHelper.findSnapView(layoutManager)) != null) {
            int[] calculateDistanceToFinalSnap = pagerSnapStartHelper.calculateDistanceToFinalSnap(layoutManager, findSnapView);
            if (calculateDistanceToFinalSnap.length >= 2 && ((i = calculateDistanceToFinalSnap[0]) != 0 || calculateDistanceToFinalSnap[1] != 0)) {
                smoothScrollBy(i, calculateDistanceToFinalSnap[1]);
            }
        }
        return z;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        super.release();
        Object adapter = getAdapter();
        if (adapter instanceof Releasable) {
            ((Releasable) adapter).release();
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(BindingContext bindingContext, u1 u1Var, View view) {
        this.$$delegate_0.setBorder(bindingContext, u1Var, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(a.c cVar) {
        this.$$delegate_0.setDiv(cVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    public void setOnInterceptTouchEventListener(OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.onInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setPagerSnapStartHelper(PagerSnapStartHelper pagerSnapStartHelper) {
        this.pagerSnapStartHelper = pagerSnapStartHelper;
    }

    public void setScrollInterceptionAngle(float f) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = Math.abs(f) % 90;
        }
        this.scrollInterceptionAngle = f2;
    }

    public void setScrollMode(DivGallery.ScrollMode scrollMode) {
        this.scrollMode = scrollMode;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(new lpj(context, R$style.Div_Gallery), attributeSet, i);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.scrollPointerId = -1;
        this.scrollMode = DivGallery.ScrollMode.DEFAULT;
        this.beforeScrollFocusPosition = -1;
    }
}
