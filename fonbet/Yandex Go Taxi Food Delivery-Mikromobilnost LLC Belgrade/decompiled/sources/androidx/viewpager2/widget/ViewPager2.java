package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import defpackage.e6u0;
import defpackage.e9p;
import defpackage.et31;
import defpackage.ft31;
import defpackage.gt31;
import defpackage.hl7;
import defpackage.jt31;
import defpackage.kt31;
import defpackage.ny61;
import defpackage.php0;
import defpackage.q2i0;
import defpackage.sp31;
import defpackage.uji0;
import defpackage.yds;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public static final int OFFSCREEN_PAGE_LIMIT_DEFAULT = -1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static boolean sFeatureEnhancedA11yEnabled = true;
    ft31 mAccessibilityProvider;
    int mCurrentItem;
    private RecyclerView.a mCurrentItemDataSetChangeObserver;
    boolean mCurrentItemDirty;
    private androidx.viewpager2.widget.a mExternalPageChangeCallbacks;
    private e9p mFakeDragger;
    LinearLayoutManager mLayoutManager;
    private int mOffscreenPageLimit;
    private androidx.viewpager2.widget.a mPageChangeEventDispatcher;
    private b mPageTransformerAdapter;
    private f0 mPagerSnapHelper;
    private Parcelable mPendingAdapterState;
    private int mPendingCurrentItem;
    RecyclerView mRecyclerView;
    private RecyclerView.c mSavedItemAnimator;
    private boolean mSavedItemAnimatorPresent;
    c mScrollEventAdapter;
    private final Rect mTmpChildRect;
    private final Rect mTmpContainerRect;
    private boolean mUserInputEnabled;

    public class RecyclerViewImpl extends RecyclerView {
        public RecyclerViewImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            ft31 ft31Var = ViewPager2.this.mAccessibilityProvider;
            ft31Var.getClass();
            return ft31Var instanceof gt31 ? ViewPager2.this.mAccessibilityProvider.m() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.mCurrentItem);
            accessibilityEvent.setToIndex(ViewPager2.this.mCurrentItem);
            ViewPager2.this.mAccessibilityProvider.n(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.isUserInputEnabled() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.isUserInputEnabled() && super.onTouchEvent(motionEvent);
        }
    }

    public static abstract class a {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new androidx.viewpager2.widget.a();
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new d(this);
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(context, null);
    }

    private uji0 enforceChildFillListener() {
        return new et31();
    }

    private void initialize(Context context, AttributeSet attributeSet) {
        this.mAccessibilityProvider = sFeatureEnhancedA11yEnabled ? new h(this) : new gt31(this);
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.mRecyclerView = recyclerViewImpl;
        recyclerViewImpl.setId(View.generateViewId());
        this.mRecyclerView.setDescendantFocusability(131072);
        g gVar = new g(this, context);
        this.mLayoutManager = gVar;
        this.mRecyclerView.setLayoutManager(gVar);
        this.mRecyclerView.setScrollingTouchSlop(1);
        setOrientation(context, attributeSet);
        this.mRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mRecyclerView.addOnChildAttachStateChangeListener(enforceChildFillListener());
        c cVar = new c(this);
        this.mScrollEventAdapter = cVar;
        this.mFakeDragger = new e9p(this, cVar, this.mRecyclerView);
        kt31 kt31Var = new kt31(this);
        this.mPagerSnapHelper = kt31Var;
        kt31Var.b(this.mRecyclerView);
        this.mRecyclerView.addOnScrollListener(this.mScrollEventAdapter);
        androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a();
        this.mPageChangeEventDispatcher = aVar;
        this.mScrollEventAdapter.a = aVar;
        e eVar = new e(this);
        f fVar = new f(this);
        this.mPageChangeEventDispatcher.a.add(eVar);
        this.mPageChangeEventDispatcher.a.add(fVar);
        this.mAccessibilityProvider.f(this.mRecyclerView);
        this.mPageChangeEventDispatcher.a.add(this.mExternalPageChangeCallbacks);
        b bVar = new b(this.mLayoutManager);
        this.mPageTransformerAdapter = bVar;
        this.mPageChangeEventDispatcher.a.add(bVar);
        RecyclerView recyclerView = this.mRecyclerView;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void registerCurrentItemDataSetTracker(RecyclerView.Adapter adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void restorePendingState() {
        RecyclerView.Adapter adapter;
        if (this.mPendingCurrentItem == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.mPendingAdapterState;
        if (parcelable != null) {
            if (adapter instanceof e6u0) {
                ((yds) ((e6u0) adapter)).l(parcelable);
            }
            this.mPendingAdapterState = null;
        }
        int max = Math.max(0, Math.min(this.mPendingCurrentItem, adapter.getItemCount() - 1));
        this.mCurrentItem = max;
        this.mPendingCurrentItem = -1;
        this.mRecyclerView.scrollToPosition(max);
        this.mAccessibilityProvider.l();
    }

    private void setOrientation(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q2i0.ViewPager2);
        int[] iArr = q2i0.ViewPager2;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        sp31.b(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(q2i0.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void unregisterCurrentItemDataSetTracker(RecyclerView.Adapter adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        }
    }

    public void addItemDecoration(RecyclerView.d dVar) {
        this.mRecyclerView.addItemDecoration(dVar);
    }

    public boolean beginFakeDrag() {
        e9p e9pVar = this.mFakeDragger;
        c cVar = e9pVar.b;
        if (cVar.f == 1) {
            return false;
        }
        e9pVar.g = 0;
        e9pVar.f = 0.0f;
        e9pVar.h = SystemClock.uptimeMillis();
        VelocityTracker velocityTracker = e9pVar.d;
        if (velocityTracker == null) {
            e9pVar.d = VelocityTracker.obtain();
            e9pVar.e = ViewConfiguration.get(e9pVar.a.getContext()).getScaledMaximumFlingVelocity();
        } else {
            velocityTracker.clear();
        }
        cVar.e = 4;
        cVar.d(true);
        if (cVar.f != 0) {
            e9pVar.c.stopScroll();
        }
        long j = e9pVar.h;
        MotionEvent obtain = MotionEvent.obtain(j, j, 0, 0.0f, 0.0f, 0);
        e9pVar.d.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.mRecyclerView.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.mRecyclerView.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).mRecyclerViewId;
            sparseArray.put(this.mRecyclerView.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        restorePendingState();
    }

    public boolean endFakeDrag() {
        e9p e9pVar = this.mFakeDragger;
        c cVar = e9pVar.b;
        boolean z = cVar.m;
        if (!z) {
            return false;
        }
        if (cVar.f != 1 || z) {
            cVar.m = false;
            cVar.e();
            php0 php0Var = cVar.g;
            if (php0Var.c == 0) {
                int i = php0Var.a;
                if (i != cVar.h) {
                    cVar.a(i);
                }
                cVar.b(0);
                cVar.c();
            } else {
                cVar.b(2);
            }
        }
        VelocityTracker velocityTracker = e9pVar.d;
        velocityTracker.computeCurrentVelocity(1000, e9pVar.e);
        if (!e9pVar.c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            e9pVar.a.snapToPage();
        }
        return true;
    }

    public boolean fakeDragBy(float f) {
        e9p e9pVar = this.mFakeDragger;
        if (!e9pVar.b.m) {
            return false;
        }
        float f2 = e9pVar.f - f;
        e9pVar.f = f2;
        int round = Math.round(f2 - e9pVar.g);
        e9pVar.g += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = e9pVar.a.getOrientation() == 0;
        int i = z ? round : 0;
        int i2 = z ? 0 : round;
        float f3 = z ? e9pVar.f : 0.0f;
        float f4 = z ? 0.0f : e9pVar.f;
        e9pVar.c.scrollBy(i, i2);
        MotionEvent obtain = MotionEvent.obtain(e9pVar.h, uptimeMillis, 2, f3, f4, 0);
        e9pVar.d.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        ft31 ft31Var = this.mAccessibilityProvider;
        ft31Var.getClass();
        return ft31Var instanceof h ? this.mAccessibilityProvider.e() : super.getAccessibilityClassName();
    }

    public RecyclerView.Adapter getAdapter() {
        return this.mRecyclerView.getAdapter();
    }

    public int getCurrentItem() {
        return this.mCurrentItem;
    }

    public RecyclerView.d getItemDecorationAt(int i) {
        return this.mRecyclerView.getItemDecorationAt(i);
    }

    public int getItemDecorationCount() {
        return this.mRecyclerView.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getOrientation() {
        return this.mLayoutManager.J == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.mRecyclerView;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.mScrollEventAdapter.f;
    }

    public void invalidateItemDecorations() {
        this.mRecyclerView.invalidateItemDecorations();
    }

    public boolean isFakeDragging() {
        return this.mFakeDragger.b.m;
    }

    public boolean isRtl() {
        return this.mLayoutManager.b.getLayoutDirection() == 1;
    }

    public boolean isUserInputEnabled() {
        return this.mUserInputEnabled;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.mAccessibilityProvider.g(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        this.mTmpContainerRect.left = getPaddingLeft();
        this.mTmpContainerRect.right = (i3 - i) - getPaddingRight();
        this.mTmpContainerRect.top = getPaddingTop();
        this.mTmpContainerRect.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.mTmpContainerRect, this.mTmpChildRect);
        RecyclerView recyclerView = this.mRecyclerView;
        Rect rect = this.mTmpChildRect;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.mCurrentItemDirty) {
            updateCurrentItem();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        measureChild(this.mRecyclerView, i, i2);
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        int measuredState = this.mRecyclerView.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mPendingCurrentItem = savedState.mCurrentItem;
        this.mPendingAdapterState = savedState.mAdapterState;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mRecyclerViewId = this.mRecyclerView.getId();
        int i = this.mPendingCurrentItem;
        if (i == -1) {
            i = this.mCurrentItem;
        }
        savedState.mCurrentItem = i;
        Parcelable parcelable = this.mPendingAdapterState;
        if (parcelable != null) {
            savedState.mAdapterState = parcelable;
            return savedState;
        }
        Object adapter = this.mRecyclerView.getAdapter();
        if (adapter instanceof e6u0) {
            savedState.mAdapterState = ((yds) ((e6u0) adapter)).m();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return this.mAccessibilityProvider.b(i) ? this.mAccessibilityProvider.k(i, bundle) : super.performAccessibilityAction(i, bundle);
    }

    public void registerOnPageChangeCallback(a aVar) {
        this.mExternalPageChangeCallbacks.a.add(aVar);
    }

    public void removeItemDecoration(RecyclerView.d dVar) {
        this.mRecyclerView.removeItemDecoration(dVar);
    }

    public void removeItemDecorationAt(int i) {
        this.mRecyclerView.removeItemDecorationAt(i);
    }

    public void requestTransform() {
        if (this.mPageTransformerAdapter.b == null) {
            return;
        }
        c cVar = this.mScrollEventAdapter;
        cVar.e();
        php0 php0Var = cVar.g;
        double d = php0Var.a + php0Var.b;
        int i = (int) d;
        float f = (float) (d - i);
        this.mPageTransformerAdapter.onPageScrolled(i, f, Math.round(getPageSize() * f));
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.mRecyclerView.getAdapter();
        this.mAccessibilityProvider.d(adapter2);
        unregisterCurrentItemDataSetTracker(adapter2);
        this.mRecyclerView.setAdapter(adapter);
        this.mCurrentItem = 0;
        restorePendingState();
        this.mAccessibilityProvider.c(adapter);
        registerCurrentItemDataSetTracker(adapter);
    }

    public void setCurrentItem(int i, boolean z) {
        if (isFakeDragging()) {
            ny61.r("Cannot change current item when ViewPager2 is fake dragging");
        } else {
            setCurrentItemInternal(i, z);
        }
    }

    public void setCurrentItemInternal(int i, boolean z) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.mPendingCurrentItem != -1) {
                this.mPendingCurrentItem = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        int i2 = this.mCurrentItem;
        if (min == i2 && this.mScrollEventAdapter.f == 0) {
            return;
        }
        if (min == i2 && z) {
            return;
        }
        double d = i2;
        this.mCurrentItem = min;
        this.mAccessibilityProvider.p();
        c cVar = this.mScrollEventAdapter;
        if (cVar.f != 0) {
            cVar.e();
            php0 php0Var = cVar.g;
            d = php0Var.a + php0Var.b;
        }
        c cVar2 = this.mScrollEventAdapter;
        cVar2.getClass();
        cVar2.e = z ? 2 : 3;
        cVar2.m = false;
        boolean z2 = cVar2.i != min;
        cVar2.i = min;
        cVar2.b(2);
        if (z2) {
            cVar2.a(min);
        }
        RecyclerView recyclerView = this.mRecyclerView;
        if (!z) {
            recyclerView.scrollToPosition(min);
            return;
        }
        double d2 = min;
        if (Math.abs(d2 - d) <= 3.0d) {
            recyclerView.smoothScrollToPosition(min);
            return;
        }
        recyclerView.scrollToPosition(d2 > d ? min - 3 : min + 3);
        RecyclerView recyclerView2 = this.mRecyclerView;
        recyclerView2.post(new hl7(recyclerView2, min));
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.mAccessibilityProvider.o();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            ny61.g("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.mOffscreenPageLimit = i;
            this.mRecyclerView.requestLayout();
        }
    }

    public void setPageTransformer(jt31 jt31Var) {
        boolean z = this.mSavedItemAnimatorPresent;
        if (jt31Var != null) {
            if (!z) {
                this.mSavedItemAnimator = this.mRecyclerView.getItemAnimator();
                this.mSavedItemAnimatorPresent = true;
            }
            this.mRecyclerView.setItemAnimator(null);
        } else if (z) {
            this.mRecyclerView.setItemAnimator(this.mSavedItemAnimator);
            this.mSavedItemAnimator = null;
            this.mSavedItemAnimatorPresent = false;
        }
        b bVar = this.mPageTransformerAdapter;
        if (jt31Var == bVar.b) {
            return;
        }
        bVar.b = jt31Var;
        requestTransform();
    }

    public void setUserInputEnabled(boolean z) {
        this.mUserInputEnabled = z;
        this.mAccessibilityProvider.r();
    }

    public void snapToPage() {
        View e = this.mPagerSnapHelper.e(this.mLayoutManager);
        if (e == null) {
            return;
        }
        int[] c = this.mPagerSnapHelper.c(this.mLayoutManager, e);
        int i = c[0];
        if (i == 0 && c[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i, c[1]);
    }

    public void unregisterOnPageChangeCallback(a aVar) {
        this.mExternalPageChangeCallbacks.a.remove(aVar);
    }

    public void updateCurrentItem() {
        f0 f0Var = this.mPagerSnapHelper;
        if (f0Var == null) {
            ny61.r("Design assumption violated.");
            return;
        }
        View e = f0Var.e(this.mLayoutManager);
        if (e == null) {
            return;
        }
        this.mLayoutManager.getClass();
        int viewLayoutPosition = ((RecyclerView.LayoutParams) e.getLayoutParams()).getViewLayoutPosition();
        if (viewLayoutPosition != this.mCurrentItem && getScrollState() == 0) {
            this.mPageChangeEventDispatcher.onPageSelected(viewLayoutPosition);
        }
        this.mCurrentItemDirty = false;
    }

    public void addItemDecoration(RecyclerView.d dVar, int i) {
        this.mRecyclerView.addItemDecoration(dVar, i);
    }

    /* loaded from: classes10.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager2.widget.ViewPager2.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }
        };
        Parcelable mAdapterState;
        int mCurrentItem;
        int mRecyclerViewId;

        public SavedState(Parcel parcel) {
            super(parcel);
            readValues(parcel, null);
        }

        private void readValues(Parcel parcel, ClassLoader classLoader) {
            this.mRecyclerViewId = parcel.readInt();
            this.mCurrentItem = parcel.readInt();
            this.mAdapterState = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mRecyclerViewId);
            parcel.writeInt(this.mCurrentItem);
            parcel.writeParcelable(this.mAdapterState, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readValues(parcel, classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setOrientation(int i) {
        this.mLayoutManager.b2(i);
        this.mAccessibilityProvider.q();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new androidx.viewpager2.widget.a();
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new d(this);
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new androidx.viewpager2.widget.a();
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new d(this);
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new androidx.viewpager2.widget.a();
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new d(this);
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(context, attributeSet);
    }
}
