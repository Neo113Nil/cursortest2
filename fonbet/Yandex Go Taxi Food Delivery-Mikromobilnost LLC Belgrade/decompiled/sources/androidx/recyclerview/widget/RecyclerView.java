package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import com.yandex.messaging.support.view.timeline.TimelineLayoutManager;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.d6z;
import defpackage.dlp0;
import defpackage.fob1;
import defpackage.g6q0;
import defpackage.gog0;
import defpackage.i6e0;
import defpackage.ijj;
import defpackage.j6e0;
import defpackage.jjj;
import defpackage.jpb;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.o2i0;
import defpackage.qn50;
import defpackage.qp31;
import defpackage.qv10;
import defpackage.qwg0;
import defpackage.rfw0;
import defpackage.scc;
import defpackage.sn50;
import defpackage.sp31;
import defpackage.th;
import defpackage.tji0;
import defpackage.u70;
import defpackage.uh;
import defpackage.uji0;
import defpackage.unr0;
import defpackage.up31;
import defpackage.va90;
import defpackage.vji0;
import defpackage.w511;
import defpackage.wh;
import defpackage.wji0;
import defpackage.x4e;
import defpackage.yci0;
import defpackage.ycs0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements dlp0, qn50 {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final String LOW_RES_ROTARY_ENCODER_FEATURE = "android.hardware.rotaryencoder.lowres";
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled;
    static final v0 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled;
    z0 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    androidx.recyclerview.widget.a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private tji0 mChildDrawingOrderCallback;
    androidx.recyclerview.widget.d mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    ijj mDifferentialMotionFlingController;
    private final jjj mDifferentialMotionFlingTarget;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private b mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    p mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private vji0 mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    c mItemAnimator;
    private m0 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<d> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    e mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    boolean mLowResRotaryEncoderFeature;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final s0 mObserver;
    private List<uji0> mOnChildAttachStateListeners;
    private f mOnFlingListener;
    private final ArrayList<vji0> mOnItemTouchListeners;
    final List<x0> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    o mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final r0 mRecycler;
    wji0 mRecyclerListener;
    final List<wji0> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    float mScaledHorizontalScrollFactor;
    float mScaledVerticalScrollFactor;
    private g mScrollListener;
    private List<g> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private sn50 mScrollingChildHelper;
    final k mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final w0 mViewFlinger;
    private final i1 mViewInfoProcessCallback;
    final j1 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;

    public static abstract class a {
        public void a() {
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, Object obj) {
            b(i, i2);
        }

        public void d(int i, int i2) {
        }

        public void e(int i, int i2) {
        }

        public void f(int i, int i2) {
        }

        public void g() {
        }
    }

    public static class b {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class c {
        public m0 a = null;
        public final ArrayList b = new ArrayList();
        public long c = 120;
        public long d = 120;
        public long e = 250;
        public long f = 250;

        public static class a {
            public int a;
            public int b;
        }

        public static int e(x0 x0Var) {
            int i = x0Var.C;
            int i2 = i & 14;
            if (x0Var.L()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int i3 = x0Var.w;
                int E = x0Var.E();
                if (i3 != -1 && E != -1 && i3 != E) {
                    return i2 | 2048;
                }
            }
            return i2;
        }

        public abstract boolean a(x0 x0Var, a aVar, a aVar2);

        public abstract boolean b(x0 x0Var, x0 x0Var2, a aVar, a aVar2);

        public abstract boolean c(x0 x0Var, a aVar, a aVar2);

        public abstract boolean d(x0 x0Var, a aVar, a aVar2);

        public boolean f(x0 x0Var) {
            return true;
        }

        public boolean g(x0 x0Var, List list) {
            return f(x0Var);
        }

        public final void h(x0 x0Var) {
            m0 m0Var = this.a;
            if (m0Var != null) {
                RecyclerView recyclerView = ((n0) m0Var).a;
                x0Var.T(true);
                View view = x0Var.a;
                if (x0Var.A != null && x0Var.B == null) {
                    x0Var.A = null;
                }
                x0Var.B = null;
                if ((x0Var.C & 16) == 0 && !recyclerView.removeAnimatingView(view) && x0Var.P()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }

        public final void i() {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((g6q0) ((l0) arrayList.get(i))).a.invoke();
            }
            arrayList.clear();
        }

        public abstract void j(x0 x0Var);

        public abstract void k();

        public long l() {
            return this.c;
        }

        public abstract boolean m();

        public abstract void n();
    }

    public static abstract class d {
        public void c(Rect rect, View view, RecyclerView recyclerView, k kVar) {
            ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
            rect.set(0, 0, 0, 0);
        }

        public void d(Canvas canvas, RecyclerView recyclerView, k kVar) {
        }

        public void e(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    public static abstract class e {
        public boolean A;
        public final boolean B;
        public boolean C;
        public int D;
        public boolean E;
        public int F;
        public int G;
        public int H;
        public int I;
        public androidx.recyclerview.widget.d a;
        public RecyclerView b;
        public final rfw0 c;
        public final rfw0 w;
        public j x;
        public boolean y;
        public boolean z;

        /* loaded from: classes10.dex */
        public static class a {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public e() {
            o0 o0Var = new o0(this);
            p0 p0Var = new p0(this);
            this.c = new rfw0(o0Var);
            this.w = new rfw0(p0Var);
            this.y = false;
            this.z = false;
            this.A = false;
            this.B = true;
            this.C = true;
        }

        public static void B0(int i, int i2, int i3, int i4, View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public static int L(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        public static int b0(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.bottom;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int e0(int i, int i2, int i3, int i4, boolean z) {
            int max = Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 != Integer.MIN_VALUE) {
                            if (i2 != 0) {
                            }
                        }
                        i4 = max;
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i2 = 1073741824;
            } else {
                if (i4 < 0) {
                    if (i4 != -1) {
                        if (i4 == -2) {
                            if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                                i4 = max;
                                i2 = Integer.MIN_VALUE;
                            } else {
                                i4 = max;
                                i2 = 0;
                            }
                        }
                        i2 = 0;
                        i4 = 0;
                    }
                    i4 = max;
                }
                i2 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public static int o0(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.left;
        }

        public static int r0(View view) {
            return ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        }

        public static a s0(Context context, AttributeSet attributeSet, int i, int i2) {
            a aVar = new a();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o2i0.RecyclerView, i, i2);
            aVar.a = obtainStyledAttributes.getInt(o2i0.RecyclerView_android_orientation, 1);
            aVar.b = obtainStyledAttributes.getInt(o2i0.RecyclerView_spanCount, 1);
            aVar.c = obtainStyledAttributes.getBoolean(o2i0.RecyclerView_reverseLayout, false);
            aVar.d = obtainStyledAttributes.getBoolean(o2i0.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return aVar;
        }

        public static int t0(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.right;
        }

        public static int v0(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.top;
        }

        public static boolean z0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public final boolean A0() {
            j jVar = this.x;
            return jVar != null && jVar.e;
        }

        public void C0(int i, int i2, int i3, int i4, View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.mDecorInsets;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public void D0(int i, int i2, View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.b.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int e0 = e0(this.H, this.F, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, I());
            int e02 = e0(this.I, this.G, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, J());
            if (u1(view, e0, e02, layoutParams)) {
                view.measure(e0, e02);
            }
        }

        public View E(int i) {
            return c0(i);
        }

        public void E0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public final void F(View view) {
            G(-1, view, false);
        }

        public void F0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public final void G(int i, View view, boolean z) {
            x0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.N()) {
                ycs0 ycs0Var = this.b.mViewInfoStore.a;
                h1 h1Var = (h1) ycs0Var.get(childViewHolderInt);
                if (h1Var == null) {
                    h1Var = h1.a();
                    ycs0Var.put(childViewHolderInt, h1Var);
                }
                h1Var.a |= 1;
            } else {
                this.b.mViewInfoStore.c(childViewHolderInt);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (childViewHolderInt.V() || childViewHolderInt.O()) {
                if (childViewHolderInt.O()) {
                    childViewHolderInt.G.o(childViewHolderInt);
                } else {
                    childViewHolderInt.C &= -33;
                }
                this.a.b(view, i, view.getLayoutParams(), false);
            } else {
                ViewParent parent = view.getParent();
                RecyclerView recyclerView = this.b;
                androidx.recyclerview.widget.d dVar = this.a;
                if (parent == recyclerView) {
                    int j = dVar.j(view);
                    if (i == -1) {
                        i = this.a.e();
                    }
                    if (j == -1) {
                        StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        sb.append(this.b.indexOfChild(view));
                        ny61.r(b64.g(this.b, sb));
                        return;
                    }
                    if (j != i) {
                        e eVar = this.b.mLayout;
                        View c0 = eVar.c0(j);
                        if (c0 == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j + eVar.b.toString());
                        }
                        eVar.V(j);
                        LayoutParams layoutParams2 = (LayoutParams) c0.getLayoutParams();
                        x0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(c0);
                        boolean N = childViewHolderInt2.N();
                        RecyclerView recyclerView2 = eVar.b;
                        if (N) {
                            ycs0 ycs0Var2 = recyclerView2.mViewInfoStore.a;
                            h1 h1Var2 = (h1) ycs0Var2.get(childViewHolderInt2);
                            if (h1Var2 == null) {
                                h1Var2 = h1.a();
                                ycs0Var2.put(childViewHolderInt2, h1Var2);
                            }
                            h1Var2.a = 1 | h1Var2.a;
                        } else {
                            recyclerView2.mViewInfoStore.c(childViewHolderInt2);
                        }
                        eVar.a.b(c0, i, layoutParams2, childViewHolderInt2.N());
                    }
                } else {
                    dVar.a(i, view, false);
                    layoutParams.mInsetsDirty = true;
                    j jVar = this.x;
                    if (jVar != null && jVar.e && jVar.b.getChildLayoutPosition(view) == jVar.a) {
                        jVar.f = view;
                    }
                }
            }
            if (layoutParams.mPendingInvalidate) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Objects.toString(layoutParams.mViewHolder);
                }
                childViewHolderInt.a.invalidate();
                layoutParams.mPendingInvalidate = false;
            }
        }

        public void G0(Adapter adapter, Adapter adapter2) {
        }

        public void H(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void H0(RecyclerView recyclerView) {
        }

        public boolean I() {
            return false;
        }

        public void I0(RecyclerView recyclerView, r0 r0Var) {
        }

        public boolean J() {
            return this instanceof TimelineLayoutManager;
        }

        public View J0(View view, int i, r0 r0Var, k kVar) {
            return null;
        }

        public boolean K(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            r0 r0Var = recyclerView.mRecycler;
            k kVar = recyclerView.mState;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            Adapter adapter = this.b.mAdapter;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void L0(r0 r0Var, k kVar, wh whVar) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                whVar.a(8192);
                whVar.B(true);
                Bundle extras = whVar.a.getExtras();
                if (extras != null) {
                    extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-67108865)) | SelfTester_JCP.DECRYPT_CBC);
                }
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                whVar.a(4096);
                whVar.B(true);
                Bundle extras2 = whVar.a.getExtras();
                if (extras2 != null) {
                    extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-67108865)) | SelfTester_JCP.DECRYPT_CBC);
                }
            }
            whVar.r(th.a(u0(r0Var, kVar), g0(r0Var, kVar), 0, false));
        }

        public void M(int i, int i2, k kVar, o oVar) {
        }

        public final void M0(View view, wh whVar) {
            x0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.N()) {
                return;
            }
            androidx.recyclerview.widget.d dVar = this.a;
            if (dVar.c.contains(childViewHolderInt.a)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            N0(recyclerView.mRecycler, recyclerView.mState, view, whVar);
        }

        public void N(int i, o oVar) {
        }

        public void N0(r0 r0Var, k kVar, View view, wh whVar) {
            whVar.s(uh.a(J() ? r0(view) : 0, 1, I() ? r0(view) : 0, 1, false, false));
        }

        public int O(k kVar) {
            return 0;
        }

        public void O0(int i, int i2) {
        }

        public int P(k kVar) {
            return 0;
        }

        public void P0() {
        }

        public int Q(k kVar) {
            return 0;
        }

        public void Q0(int i, int i2) {
        }

        public int R(k kVar) {
            return 0;
        }

        public void R0(int i, int i2) {
        }

        public int S(k kVar) {
            return 0;
        }

        public void S0(RecyclerView recyclerView, int i, int i2) {
        }

        public int T(k kVar) {
            return 0;
        }

        public void T0(RecyclerView recyclerView, int i, int i2, Object obj) {
            S0(recyclerView, i, i2);
        }

        public final void U(r0 r0Var) {
            for (int d0 = d0() - 1; d0 >= 0; d0--) {
                j1(r0Var, d0, c0(d0));
            }
        }

        public void U0(r0 r0Var, k kVar) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void V(int i) {
            c0(i);
            this.a.c(i);
        }

        public void V0(k kVar) {
        }

        public final View W(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.a.c.contains(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public void W0(Parcelable parcelable) {
        }

        public View X(int i) {
            int d0 = d0();
            for (int i2 = 0; i2 < d0; i2++) {
                View c0 = c0(i2);
                x0 childViewHolderInt = RecyclerView.getChildViewHolderInt(c0);
                if (childViewHolderInt != null && childViewHolderInt.G() == i && !childViewHolderInt.U() && (this.b.mState.g || !childViewHolderInt.N())) {
                    return c0;
                }
            }
            return null;
        }

        public Parcelable X0() {
            return null;
        }

        public abstract LayoutParams Y();

        public void Y0(int i) {
        }

        public LayoutParams Z(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public boolean Z0(int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return a1(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        public LayoutParams a0(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public boolean a1(r0 r0Var, k kVar, int i, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            float f;
            if (this.b == null) {
                return false;
            }
            int i2 = this.I;
            int i3 = this.H;
            Rect rect = new Rect();
            if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                i2 = rect.height();
                i3 = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.b.canScrollVertically(1) ? (i2 - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    paddingLeft = (i3 - getPaddingLeft()) - getPaddingRight();
                }
                paddingLeft = 0;
            } else if (i != 8192) {
                paddingTop = 0;
                paddingLeft = 0;
            } else {
                paddingTop = this.b.canScrollVertically(-1) ? -((i2 - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    paddingLeft = -((i3 - getPaddingLeft()) - getPaddingRight());
                }
                paddingLeft = 0;
            }
            if (paddingTop == 0 && paddingLeft == 0) {
                return false;
            }
            if (bundle != null) {
                f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f < 0.0f) {
                    if (!RecyclerView.sDebugAssertionsEnabled) {
                        return false;
                    }
                    ny61.g(x4e.f("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (", Extension.C_BRAKE, f));
                    return false;
                }
            } else {
                f = 1.0f;
            }
            if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                    paddingLeft = (int) (paddingLeft * f);
                    paddingTop = (int) (paddingTop * f);
                }
                this.b.smoothScrollBy(paddingLeft, paddingTop, null, Integer.MIN_VALUE, true);
                return true;
            }
            RecyclerView recyclerView = this.b;
            Adapter adapter = recyclerView.mAdapter;
            if (adapter == null) {
                return false;
            }
            if (i == 4096) {
                recyclerView.smoothScrollToPosition(adapter.getItemCount() - 1);
            } else if (i == 8192) {
                recyclerView.smoothScrollToPosition(0);
            }
            return true;
        }

        public final void b1() {
            for (int d0 = d0() - 1; d0 >= 0; d0--) {
                this.a.k(d0);
            }
        }

        public final View c0(int i) {
            androidx.recyclerview.widget.d dVar = this.a;
            if (dVar != null) {
                return dVar.d(i);
            }
            return null;
        }

        public void c1(r0 r0Var) {
            for (int d0 = d0() - 1; d0 >= 0; d0--) {
                if (!RecyclerView.getChildViewHolderInt(c0(d0)).U()) {
                    View c0 = c0(d0);
                    g1(d0);
                    r0Var.k(c0);
                }
            }
        }

        public final int d0() {
            androidx.recyclerview.widget.d dVar = this.a;
            if (dVar != null) {
                return dVar.e();
            }
            return 0;
        }

        public final void d1(r0 r0Var) {
            ArrayList arrayList;
            int size = r0Var.a.size();
            int i = size - 1;
            while (true) {
                arrayList = r0Var.a;
                if (i < 0) {
                    break;
                }
                View view = ((x0) arrayList.get(i)).a;
                x0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.U()) {
                    childViewHolderInt.T(false);
                    if (childViewHolderInt.P()) {
                        this.b.removeDetachedView(view, false);
                    }
                    c cVar = this.b.mItemAnimator;
                    if (cVar != null) {
                        cVar.j(childViewHolderInt);
                    }
                    childViewHolderInt.T(true);
                    x0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.G = null;
                    childViewHolderInt2.H = false;
                    childViewHolderInt2.C &= -33;
                    r0Var.l(childViewHolderInt2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList arrayList2 = r0Var.b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.b.invalidate();
            }
        }

        public final void e1(View view, r0 r0Var) {
            f1(view);
            r0Var.k(view);
        }

        public final boolean f0() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public void f1(View view) {
            androidx.recyclerview.widget.d dVar = this.a;
            va90 va90Var = dVar.a;
            int i = dVar.d;
            if (i == 1) {
                ny61.r("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i == 2) {
                ny61.r("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                dVar.d = 1;
                dVar.e = view;
                int indexOfChild = ((RecyclerView) va90Var.a).indexOfChild(view);
                if (indexOfChild < 0) {
                    dVar.d = 0;
                    dVar.e = null;
                    return;
                }
                if (dVar.b.g(indexOfChild)) {
                    dVar.l(view);
                }
                va90Var.l(indexOfChild);
                dVar.d = 0;
                dVar.e = null;
            } catch (Throwable th) {
                dVar.d = 0;
                dVar.e = null;
                throw th;
            }
        }

        public int g0(r0 r0Var, k kVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.mAdapter == null || !I()) {
                return 1;
            }
            return this.b.mAdapter.getItemCount();
        }

        public void g1(int i) {
            if (c0(i) != null) {
                this.a.k(i);
            }
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.b;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int getPaddingEnd() {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            return recyclerView.getPaddingEnd();
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int getPaddingStart() {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            return recyclerView.getPaddingStart();
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int h0(View view) {
            return view.getBottom() + ((LayoutParams) view.getLayoutParams()).mDecorInsets.bottom;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
        
            if ((r5.bottom - r10) > r2) goto L28;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean h1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.H - getPaddingRight();
            int paddingBottom = this.I - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width - paddingRight;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - paddingBottom);
            if (this.b.getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            int[] iArr = {max, min2};
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (z2) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int paddingLeft2 = getPaddingLeft();
                    int paddingTop2 = getPaddingTop();
                    int paddingRight2 = this.H - getPaddingRight();
                    int paddingBottom2 = this.I - getPaddingBottom();
                    Rect rect2 = this.b.mTempRect;
                    i0(focusedChild, rect2);
                    if (rect2.left - i4 < paddingRight2) {
                        if (rect2.right - i4 > paddingLeft2) {
                            if (rect2.top - i5 < paddingBottom2) {
                            }
                        }
                    }
                }
                return false;
            }
            if (i4 != 0 || i5 != 0) {
                if (z) {
                    recyclerView.scrollBy(i4, i5);
                    return true;
                }
                recyclerView.smoothScrollBy(i4, i5);
                return true;
            }
            return false;
        }

        public void i0(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public final void i1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int j0(View view) {
            return view.getLeft() - ((LayoutParams) view.getLayoutParams()).mDecorInsets.left;
        }

        public final void j1(r0 r0Var, int i, View view) {
            x0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.U()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
            } else if (childViewHolderInt.L() && !childViewHolderInt.N() && !this.b.mAdapter.hasStableIds()) {
                g1(i);
                r0Var.l(childViewHolderInt);
            } else {
                V(i);
                r0Var.m(view);
                this.b.mViewInfoStore.c(childViewHolderInt);
            }
        }

        public int k0(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int k1(int i, r0 r0Var, k kVar) {
            return 0;
        }

        public int l0(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void l1(int i) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.e(RecyclerView.TAG, "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public void m(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public int m0(View view) {
            return view.getRight() + ((LayoutParams) view.getLayoutParams()).mDecorInsets.right;
        }

        public int m1(int i, r0 r0Var, k kVar) {
            return 0;
        }

        public int n0(View view) {
            return view.getTop() - ((LayoutParams) view.getLayoutParams()).mDecorInsets.top;
        }

        public final void n1(RecyclerView recyclerView) {
            p1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void o1() {
            if (true != this.C) {
                this.C = true;
                this.D = 0;
                RecyclerView recyclerView = this.b;
                if (recyclerView != null) {
                    recyclerView.mRecycler.p();
                }
            }
        }

        public final int p0() {
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            return recyclerView.getMinimumHeight();
        }

        public final void p1(int i, int i2) {
            this.H = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.F = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.H = 0;
            }
            this.I = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.G = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.I = 0;
        }

        public final int q0() {
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            return recyclerView.getMinimumWidth();
        }

        public final void q1(int i, int i2) {
            this.b.setMeasuredDimension(i, i2);
        }

        public void r1(Rect rect, int i, int i2) {
            q1(L(i, getPaddingRight() + getPaddingLeft() + rect.width(), q0()), L(i2, getPaddingBottom() + getPaddingTop() + rect.height(), p0()));
        }

        public final void s1(int i, int i2) {
            int d0 = d0();
            if (d0 == 0) {
                this.b.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < d0; i7++) {
                View c0 = c0(i7);
                Rect rect = this.b.mTempRect;
                i0(c0, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.b.mTempRect.set(i6, i4, i3, i5);
            r1(this.b.mTempRect, i, i2);
        }

        public final void t1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.H = 0;
                this.I = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.mChildHelper;
                this.H = recyclerView.getWidth();
                this.I = recyclerView.getHeight();
            }
            this.F = 1073741824;
            this.G = 1073741824;
        }

        public int u0(r0 r0Var, k kVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.mAdapter == null || !J()) {
                return 1;
            }
            return this.b.mAdapter.getItemCount();
        }

        final boolean u1(View view, int i, int i2, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.B && z0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && z0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public final void v(j jVar) {
            j jVar2 = this.x;
            if (jVar2 != null && jVar != jVar2 && jVar2.e) {
                jVar2.i();
            }
            this.x = jVar;
            RecyclerView recyclerView = this.b;
            jVar.getClass();
            w0 w0Var = recyclerView.mViewFlinger;
            w0Var.z.removeCallbacks(w0Var);
            w0Var.c.abortAnimation();
            jVar.b = recyclerView;
            jVar.c = this;
            int i = jVar.a;
            if (i == -1) {
                ny61.g("Invalid target position");
                return;
            }
            recyclerView.mState.a = i;
            jVar.e = true;
            jVar.d = true;
            jVar.f = jVar.b(i);
            jVar.f();
            jVar.b.mViewFlinger.b();
        }

        public boolean v1() {
            return false;
        }

        public final void w0(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public final boolean w1(View view, int i, int i2, LayoutParams layoutParams) {
            return (this.B && z0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && z0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        /* renamed from: x0 */
        public boolean getK() {
            return this.A;
        }

        public void x1(RecyclerView recyclerView, k kVar, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public boolean y0() {
            return false;
        }

        public boolean y1() {
            return false;
        }
    }

    public static abstract class f {
        public abstract boolean a(int i, int i2);
    }

    public static abstract class g {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class h {
        public final SparseArray a = new SparseArray();
        public int b = 0;
        public final Set c = Collections.newSetFromMap(new IdentityHashMap());

        public void a() {
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.a;
                if (i >= sparseArray.size()) {
                    return;
                }
                q0 q0Var = (q0) sparseArray.valueAt(i);
                Iterator it = q0Var.a.iterator();
                while (it.hasNext()) {
                    i6e0.a(((x0) it.next()).a);
                }
                q0Var.a.clear();
                i++;
            }
        }

        public x0 b(int i) {
            q0 q0Var = (q0) this.a.get(i);
            if (q0Var == null) {
                return null;
            }
            ArrayList arrayList = q0Var.a;
            if (arrayList.isEmpty()) {
                return null;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((x0) arrayList.get(size)).J()) {
                    return (x0) arrayList.remove(size);
                }
            }
            return null;
        }

        public final q0 c(int i) {
            SparseArray sparseArray = this.a;
            q0 q0Var = (q0) sparseArray.get(i);
            if (q0Var != null) {
                return q0Var;
            }
            q0 q0Var2 = new q0();
            sparseArray.put(i, q0Var2);
            return q0Var2;
        }

        public void d(x0 x0Var) {
            int i = x0Var.y;
            ArrayList arrayList = c(i).a;
            if (((q0) this.a.get(i)).b <= arrayList.size()) {
                i6e0.a(x0Var.a);
            } else if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(x0Var)) {
                ny61.g("this scrap item already exists");
            } else {
                x0Var.S();
                arrayList.add(x0Var);
            }
        }

        public void e(int i, int i2) {
            q0 c = c(i);
            c.b = i2;
            ArrayList arrayList = c.a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    /* loaded from: classes10.dex */
    public static class i implements vji0 {
        @Override // defpackage.vji0
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            return false;
        }

        @Override // defpackage.vji0
        public final void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        @Override // defpackage.vji0
        public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        }
    }

    public static abstract class j {
        public int a = -1;
        public RecyclerView b;
        public e c;
        public boolean d;
        public boolean e;
        public View f;
        public final t0 g;

        public j() {
            t0 t0Var = new t0();
            t0Var.d = -1;
            t0Var.f = false;
            t0Var.g = 0;
            t0Var.a = 0;
            t0Var.b = 0;
            t0Var.c = Integer.MIN_VALUE;
            t0Var.e = null;
            this.g = t0Var;
        }

        public PointF a(int i) {
            Object obj = this.c;
            if (obj instanceof u0) {
                return ((u0) obj).d(i);
            }
            return null;
        }

        public final View b(int i) {
            return this.b.mLayout.X(i);
        }

        public final int c() {
            return this.b.mLayout.d0();
        }

        public final void d(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                i();
            }
            if (this.d && this.f == null && this.c != null && (a = a(this.a)) != null) {
                float f = a.x;
                if (f != 0.0f || a.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(a.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            t0 t0Var = this.g;
            if (view != null) {
                if (this.b.getChildLayoutPosition(view) == this.a) {
                    h(this.f, recyclerView.mState, t0Var);
                    t0Var.a(recyclerView);
                    i();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                k kVar = recyclerView.mState;
                e(i, i2, t0Var);
                boolean z = t0Var.d >= 0;
                t0Var.a(recyclerView);
                if (z && this.e) {
                    this.d = true;
                    recyclerView.mViewFlinger.b();
                }
            }
        }

        public abstract void e(int i, int i2, t0 t0Var);

        public abstract void f();

        public abstract void g();

        public abstract void h(View view, k kVar, t0 t0Var);

        public final void i() {
            if (this.e) {
                this.e = false;
                g();
                this.b.mState.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                e eVar = this.c;
                if (eVar.x == this) {
                    eVar.x = null;
                }
                this.c = null;
                this.b = null;
            }
        }
    }

    public static class k {
        public int a = -1;
        public int b = 0;
        public int c = 0;
        public int d = 1;
        public int e = 0;
        public boolean f = false;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public int l;
        public long m;
        public int n;

        public final void a(int i) {
            if ((this.d & i) != 0) {
                return;
            }
            yci0.o("Layout state should be one of ", Integer.toBinaryString(i), " but it is ", Integer.toBinaryString(this.d));
        }

        public final int b() {
            return this.g ? this.b - this.c : this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.a);
            sb.append(", mData=null, mItemCount=");
            sb.append(this.e);
            sb.append(", mIsMeasuring=");
            sb.append(this.i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.c);
            sb.append(", mStructureChanged=");
            sb.append(this.f);
            sb.append(", mInPreLayout=");
            sb.append(this.g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.j);
            sb.append(", mRunPredictiveAnimations=");
            return unr0.u(sb, this.k, '}');
        }
    }

    /* loaded from: classes10.dex */
    public static abstract class l {
        public abstract View a();
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new Interpolator() { // from class: androidx.recyclerview.widget.RecyclerView.3
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            }
        };
        sDefaultEdgeEffectFactory = new v0();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mObserver = new s0(this);
        this.mRecycler = new r0(this);
        this.mViewInfoStore = new j1();
        this.mUpdateChildViewsRunnable = new g0(this);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new androidx.recyclerview.widget.h();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new w0(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new o() : null;
        this.mState = new k();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n0(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new h0(this);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new i0(this);
        j0 j0Var = new j0(this);
        this.mDifferentialMotionFlingTarget = j0Var;
        this.mDifferentialMotionFlingController = new ijj(getContext(), j0Var);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        this.mScaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new z0(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o2i0.RecyclerView, i2, 0);
        int[] iArr = o2i0.RecyclerView;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        sp31.b(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        String string = obtainStyledAttributes.getString(o2i0.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(o2i0.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(o2i0.RecyclerView_android_clipToPadding, true);
        boolean z = obtainStyledAttributes.getBoolean(o2i0.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(o2i0.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(o2i0.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(o2i0.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(o2i0.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        this.mLowResRotaryEncoderFeature = context.getPackageManager().hasSystemFeature(LOW_RES_ROTARY_ENCODER_FEATURE);
        createLayoutManager(context, string, attributeSet, i2, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        sp31.b(this, context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(i6e0.b, Boolean.TRUE);
    }

    private void addAnimatingView(x0 x0Var) {
        View view = x0Var.a;
        boolean z = view.getParent() == this;
        this.mRecycler.o(getChildViewHolder(view));
        boolean P = x0Var.P();
        androidx.recyclerview.widget.d dVar = this.mChildHelper;
        if (P) {
            dVar.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            dVar.a(-1, view, true);
            return;
        }
        int indexOfChild = ((RecyclerView) dVar.a.a).indexOfChild(view);
        if (indexOfChild < 0) {
            kbs.f(view, "view is not a child, cannot hide ");
        } else {
            dVar.b.i(indexOfChild);
            dVar.i(view);
        }
    }

    private void animateChange(x0 x0Var, x0 x0Var2, c.a aVar, c.a aVar2, boolean z, boolean z2) {
        x0Var.T(false);
        if (z) {
            addAnimatingView(x0Var);
        }
        if (x0Var != x0Var2) {
            if (z2) {
                addAnimatingView(x0Var2);
            }
            x0Var.A = x0Var2;
            addAnimatingView(x0Var);
            this.mRecycler.o(x0Var);
            x0Var2.T(false);
            x0Var2.B = x0Var;
        }
        if (this.mItemAnimator.b(x0Var, x0Var2, aVar, aVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(x0 x0Var) {
        WeakReference weakReference = x0Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == x0Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            x0Var.b = null;
        }
    }

    private int consumeFlingInStretch(int i2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i2 > 0 && edgeEffect != null && bvf0.z(edgeEffect) != 0.0f) {
            int round = Math.round(bvf0.K(edgeEffect, ((-i2) * 4.0f) / i3, 0.5f) * ((-i3) / 4.0f));
            if (round != i2) {
                edgeEffect.finish();
            }
            return i2 - round;
        }
        if (i2 >= 0 || edgeEffect2 == null || bvf0.z(edgeEffect2) == 0.0f) {
            return i2;
        }
        float f2 = i3;
        int round2 = Math.round(bvf0.K(edgeEffect2, (i2 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
        if (round2 != i2) {
            edgeEffect2.finish();
        }
        return i2 - round2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(e.class);
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((e) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                yci0.j(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", fullClassName, e4);
            } catch (ClassNotFoundException e5) {
                yci0.j(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", fullClassName, e5);
            } catch (IllegalAccessException e6) {
                yci0.j(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", fullClassName, e6);
            } catch (InstantiationException e7) {
                yci0.j(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", fullClassName, e7);
            } catch (InvocationTargetException e8) {
                yci0.j(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", fullClassName, e8);
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        obtain.setContentChangeTypes(i2);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        h1 h1Var;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.i = false;
        startInterceptRequestLayout();
        j1 j1Var = this.mViewInfoStore;
        j1Var.a.clear();
        j1Var.b.clear();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        k kVar = this.mState;
        kVar.h = kVar.j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        kVar.g = kVar.k;
        kVar.e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.j) {
            int e2 = this.mChildHelper.e();
            for (int i2 = 0; i2 < e2; i2++) {
                x0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
                if (!childViewHolderInt.U() && (!childViewHolderInt.L() || this.mAdapter.hasStableIds())) {
                    c cVar = this.mItemAnimator;
                    c.e(childViewHolderInt);
                    childViewHolderInt.H();
                    cVar.getClass();
                    c.a aVar = new c.a();
                    View view = childViewHolderInt.a;
                    aVar.a = view.getLeft();
                    aVar.b = view.getTop();
                    view.getRight();
                    view.getBottom();
                    ycs0 ycs0Var = this.mViewInfoStore.a;
                    h1 h1Var2 = (h1) ycs0Var.get(childViewHolderInt);
                    if (h1Var2 == null) {
                        h1Var2 = h1.a();
                        ycs0Var.put(childViewHolderInt, h1Var2);
                    }
                    h1Var2.b = aVar;
                    h1Var2.a |= 4;
                    if (this.mState.h && childViewHolderInt.Q() && !childViewHolderInt.N() && !childViewHolderInt.U() && !childViewHolderInt.L()) {
                        this.mViewInfoStore.b.h(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.k) {
            saveOldPositions();
            k kVar2 = this.mState;
            boolean z = kVar2.f;
            kVar2.f = false;
            this.mLayout.U0(this.mRecycler, kVar2);
            this.mState.f = z;
            for (int i3 = 0; i3 < this.mChildHelper.e(); i3++) {
                x0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i3));
                if (!childViewHolderInt2.U() && ((h1Var = (h1) this.mViewInfoStore.a.get(childViewHolderInt2)) == null || (h1Var.a & 4) == 0)) {
                    c.e(childViewHolderInt2);
                    boolean z2 = (childViewHolderInt2.C & 8192) != 0;
                    c cVar2 = this.mItemAnimator;
                    childViewHolderInt2.H();
                    cVar2.getClass();
                    c.a aVar2 = new c.a();
                    View view2 = childViewHolderInt2.a;
                    aVar2.a = view2.getLeft();
                    aVar2.b = view2.getTop();
                    view2.getRight();
                    view2.getBottom();
                    if (z2) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, aVar2);
                    } else {
                        ycs0 ycs0Var2 = this.mViewInfoStore.a;
                        h1 h1Var3 = (h1) ycs0Var2.get(childViewHolderInt2);
                        if (h1Var3 == null) {
                            h1Var3 = h1.a();
                            ycs0Var2.put(childViewHolderInt2, h1Var3);
                        }
                        h1Var3.a |= 2;
                        h1Var3.b = aVar2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.e();
        this.mState.e = this.mAdapter.getItemCount();
        this.mState.c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.mLayoutState;
            if (parcelable != null) {
                this.mLayout.W0(parcelable);
            }
            this.mPendingSavedState = null;
        }
        k kVar = this.mState;
        kVar.g = false;
        this.mLayout.U0(this.mRecycler, kVar);
        k kVar2 = this.mState;
        kVar2.f = false;
        kVar2.j = kVar2.j && this.mItemAnimator != null;
        kVar2.d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        k kVar = this.mState;
        kVar.d = 1;
        if (kVar.j) {
            int e2 = this.mChildHelper.e() - 1;
            while (e2 >= 0) {
                x0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(e2));
                if (!childViewHolderInt.U()) {
                    long changedHolderKey = this.getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    c.a aVar = new c.a();
                    View view = childViewHolderInt.a;
                    aVar.a = view.getLeft();
                    aVar.b = view.getTop();
                    view.getRight();
                    view.getBottom();
                    x0 x0Var = (x0) this.mViewInfoStore.b.c(changedHolderKey);
                    if (x0Var == null || x0Var.U()) {
                        recyclerView2 = this;
                        recyclerView2.mViewInfoStore.a(childViewHolderInt, aVar);
                    } else {
                        h1 h1Var = (h1) this.mViewInfoStore.a.get(x0Var);
                        boolean z = (h1Var == null || (h1Var.a & 1) == 0) ? false : true;
                        h1 h1Var2 = (h1) this.mViewInfoStore.a.get(childViewHolderInt);
                        boolean z2 = (h1Var2 == null || (h1Var2.a & 1) == 0) ? false : true;
                        if (z && x0Var == childViewHolderInt) {
                            this.mViewInfoStore.a(childViewHolderInt, aVar);
                        } else {
                            c.a b2 = this.mViewInfoStore.b(x0Var, 4);
                            this.mViewInfoStore.a(childViewHolderInt, aVar);
                            c.a b3 = this.mViewInfoStore.b(childViewHolderInt, 8);
                            if (b2 == null) {
                                this.handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, x0Var);
                            } else {
                                recyclerView2 = this;
                                recyclerView2.animateChange(x0Var, childViewHolderInt, b2, b3, z, z2);
                            }
                        }
                    }
                    e2--;
                    this = recyclerView2;
                }
                recyclerView2 = this;
                e2--;
                this = recyclerView2;
            }
            recyclerView = this;
            j1 j1Var = recyclerView.mViewInfoStore;
            i1 i1Var = recyclerView.mViewInfoProcessCallback;
            ycs0 ycs0Var = j1Var.a;
            for (int i2 = ycs0Var.c - 1; i2 >= 0; i2--) {
                x0 x0Var2 = (x0) ycs0Var.f(i2);
                h1 h1Var3 = (h1) ycs0Var.h(i2);
                int i3 = h1Var3.a;
                if ((i3 & 3) == 3) {
                    RecyclerView recyclerView3 = ((i0) i1Var).a;
                    recyclerView3.mLayout.e1(x0Var2.a, recyclerView3.mRecycler);
                } else if ((i3 & 1) != 0) {
                    c.a aVar2 = h1Var3.b;
                    if (aVar2 == null) {
                        RecyclerView recyclerView4 = ((i0) i1Var).a;
                        recyclerView4.mLayout.e1(x0Var2.a, recyclerView4.mRecycler);
                    } else {
                        c.a aVar3 = h1Var3.c;
                        RecyclerView recyclerView5 = ((i0) i1Var).a;
                        recyclerView5.mRecycler.o(x0Var2);
                        recyclerView5.animateDisappearance(x0Var2, aVar2, aVar3);
                    }
                } else if ((i3 & 14) == 14) {
                    ((i0) i1Var).a.animateAppearance(x0Var2, h1Var3.b, h1Var3.c);
                } else if ((i3 & 12) == 12) {
                    c.a aVar4 = h1Var3.b;
                    c.a aVar5 = h1Var3.c;
                    i0 i0Var = (i0) i1Var;
                    i0Var.getClass();
                    x0Var2.T(false);
                    RecyclerView recyclerView6 = i0Var.a;
                    boolean z3 = recyclerView6.mDataSetHasChangedAfterLayout;
                    c cVar = recyclerView6.mItemAnimator;
                    if (z3) {
                        if (cVar.b(x0Var2, x0Var2, aVar4, aVar5)) {
                            recyclerView6.postAnimationRunner();
                        }
                    } else if (cVar.d(x0Var2, aVar4, aVar5)) {
                        recyclerView6.postAnimationRunner();
                    }
                } else if ((i3 & 4) != 0) {
                    c.a aVar6 = h1Var3.b;
                    RecyclerView recyclerView7 = ((i0) i1Var).a;
                    recyclerView7.mRecycler.o(x0Var2);
                    recyclerView7.animateDisappearance(x0Var2, aVar6, null);
                } else if ((i3 & 8) != 0) {
                    ((i0) i1Var).a.animateAppearance(x0Var2, h1Var3.b, h1Var3.c);
                }
                h1Var3.a = 0;
                h1Var3.b = null;
                h1Var3.c = null;
                h1.d.a0(h1Var3);
            }
        } else {
            recyclerView = this;
        }
        recyclerView.mLayout.d1(recyclerView.mRecycler);
        k kVar2 = recyclerView.mState;
        kVar2.b = kVar2.e;
        recyclerView.mDataSetHasChangedAfterLayout = false;
        recyclerView.mDispatchItemsChangedEvent = false;
        kVar2.j = false;
        kVar2.k = false;
        recyclerView.mLayout.y = false;
        ArrayList arrayList = recyclerView.mRecycler.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        e eVar = recyclerView.mLayout;
        if (eVar.E) {
            eVar.D = 0;
            eVar.E = false;
            recyclerView.mRecycler.p();
        }
        recyclerView.mLayout.V0(recyclerView.mState);
        recyclerView.onExitLayoutOrScroll();
        recyclerView.stopInterceptRequestLayout(false);
        j1 j1Var2 = recyclerView.mViewInfoStore;
        j1Var2.a.clear();
        j1Var2.b.clear();
        int[] iArr = recyclerView.mMinMaxLayoutPositions;
        if (recyclerView.didChildRangeChange(iArr[0], iArr[1])) {
            recyclerView.dispatchOnScrolled(0, 0);
        }
        recyclerView.recoverFocusFromState();
        recyclerView.resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        vji0 vji0Var = this.mInterceptingOnItemTouchListener;
        if (vji0Var == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        vji0Var.onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            vji0 vji0Var = this.mOnItemTouchListeners.get(i2);
            if (vji0Var.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = vji0Var;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int e2 = this.mChildHelper.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < e2; i4++) {
            x0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i4));
            if (!childViewHolderInt.U()) {
                int G = childViewHolderInt.G();
                if (G < i2) {
                    i2 = G;
                }
                if (G > i3) {
                    i3 = G;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        x0 findViewHolderForAdapterPosition;
        View view;
        k kVar = this.mState;
        int i2 = kVar.l;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = kVar.b();
        for (int i3 = i2; i3 < b2; i3++) {
            x0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            View view2 = findViewHolderForAdapterPosition2.a;
            if (view2.hasFocusable()) {
                return view2;
            }
        }
        int min = Math.min(b2, i2);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            view = findViewHolderForAdapterPosition.a;
        } while (!view.hasFocusable());
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean fling(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        float f2;
        float f3;
        e eVar = this.mLayout;
        if (eVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.mLayoutSuppressed) {
            boolean I = eVar.I();
            boolean J = this.mLayout.J();
            if (!I || Math.abs(i2) < i4) {
                i2 = 0;
            }
            if (!J || Math.abs(i3) < i4) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (i2 != 0) {
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect == null || bvf0.z(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.mRightGlow;
                        if (edgeEffect2 != null && bvf0.z(edgeEffect2) != 0.0f) {
                            if (shouldAbsorb(this.mRightGlow, i2, getWidth())) {
                                this.mRightGlow.onAbsorb(i2);
                                i2 = 0;
                            }
                            i6 = i2;
                            i2 = 0;
                        }
                    } else {
                        int i8 = -i2;
                        if (shouldAbsorb(this.mLeftGlow, i8, getWidth())) {
                            this.mLeftGlow.onAbsorb(i8);
                            i2 = 0;
                        }
                        i6 = i2;
                        i2 = 0;
                    }
                    if (i3 != 0) {
                        EdgeEffect edgeEffect3 = this.mTopGlow;
                        if (edgeEffect3 == null || bvf0.z(edgeEffect3) == 0.0f) {
                            EdgeEffect edgeEffect4 = this.mBottomGlow;
                            if (edgeEffect4 != null && bvf0.z(edgeEffect4) != 0.0f) {
                                if (shouldAbsorb(this.mBottomGlow, i3, getHeight())) {
                                    this.mBottomGlow.onAbsorb(i3);
                                    i3 = 0;
                                }
                                i7 = 0;
                            }
                        } else {
                            int i9 = -i3;
                            if (shouldAbsorb(this.mTopGlow, i9, getHeight())) {
                                this.mTopGlow.onAbsorb(i9);
                                i3 = 0;
                            }
                            i7 = 0;
                        }
                        if (i6 == 0 || i3 != 0) {
                            int i10 = -i5;
                            i6 = Math.max(i10, Math.min(i6, i5));
                            i3 = Math.max(i10, Math.min(i3, i5));
                            startNestedScrollForType(1);
                            this.mViewFlinger.a(i6, i3);
                        }
                        if (i2 == 0 || i7 != 0) {
                            f2 = i2;
                            f3 = i7;
                            if (!dispatchNestedPreFling(f2, f3)) {
                                boolean z = I || J;
                                dispatchNestedFling(f2, f3, z);
                                f fVar = this.mOnFlingListener;
                                if (fVar == null || !fVar.a(i2, i7)) {
                                    if (z) {
                                        startNestedScrollForType(1);
                                        int i11 = -i5;
                                        this.mViewFlinger.a(Math.max(i11, Math.min(i2, i5)), Math.max(i11, Math.min(i7, i5)));
                                        return true;
                                    }
                                }
                                return true;
                            }
                        } else if (i6 != 0 || i3 != 0) {
                            return true;
                        }
                    }
                    i7 = i3;
                    i3 = 0;
                    if (i6 == 0) {
                    }
                    int i102 = -i5;
                    i6 = Math.max(i102, Math.min(i6, i5));
                    i3 = Math.max(i102, Math.min(i3, i5));
                    startNestedScrollForType(1);
                    this.mViewFlinger.a(i6, i3);
                    if (i2 == 0) {
                    }
                    f2 = i2;
                    f3 = i7;
                    if (!dispatchNestedPreFling(f2, f3)) {
                    }
                }
                i6 = 0;
                if (i3 != 0) {
                }
                i7 = i3;
                i3 = 0;
                if (i6 == 0) {
                }
                int i1022 = -i5;
                i6 = Math.max(i1022, Math.min(i6, i5));
                i3 = Math.max(i1022, Math.min(i3, i5));
                startNestedScrollForType(1);
                this.mViewFlinger.a(i6, i3);
                if (i2 == 0) {
                }
                f2 = i2;
                f3 = i7;
                if (!dispatchNestedPreFling(f2, f3)) {
                }
            }
        }
        return false;
    }

    public static x0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).mViewHolder;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.mDecorInsets;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(Extension.DOT_CHAR)) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private sn50 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new sn50(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i2) {
        double log = Math.log((Math.abs(i2) * 0.35f) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f2 = DECELERATION_RATE;
        return (float) (Math.exp((f2 / (f2 - 1.0d)) * log) * this.mPhysicalCoef * SCROLL_FRICTION);
    }

    private void handleMissingPreInfoForChangeError(long j2, x0 x0Var, x0 x0Var2) {
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            x0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (childViewHolderInt != x0Var && getChangedHolderKey(childViewHolderInt) == j2) {
                Adapter adapter = this.mAdapter;
                if (adapter == null || !adapter.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(x0Var);
                    ny61.r(b64.g(this, sb));
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(x0Var);
                ny61.r(b64.g(this, sb2));
                return;
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + x0Var2 + " cannot be found but it is necessary for " + x0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            x0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.U() && childViewHolderInt.Q()) {
                return true;
            }
        }
        return false;
    }

    private void initAutofill() {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (qp31.a(this) == 0) {
            qp31.b(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.d(new va90((Object) this));
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c2 = 65535;
        int i4 = this.mLayout.b.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i5 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 < 0);
        }
        if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 > 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return c2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return c2 > 0;
        }
        StringBuilder sb = new StringBuilder("Invalid direction: ");
        sb.append(i2);
        ny61.g(b64.g(this, sb));
        return false;
    }

    private void nestedScrollByInternal(int i2, int i3, MotionEvent motionEvent, int i4) {
        e eVar = this.mLayout;
        if (eVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean I = eVar.I();
        boolean J = this.mLayout.J();
        int i5 = J ? (I ? 1 : 0) | 2 : I ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int releaseHorizontalGlow = i2 - releaseHorizontalGlow(i2, height);
        int releaseVerticalGlow = i3 - releaseVerticalGlow(i3, width);
        startNestedScroll(i5, i4);
        if (dispatchNestedPreScroll(I ? releaseHorizontalGlow : 0, J ? releaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i4)) {
            int[] iArr2 = this.mReusableIntPair;
            releaseHorizontalGlow -= iArr2[0];
            releaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(I ? releaseHorizontalGlow : 0, J ? releaseVerticalGlow : 0, motionEvent, i4);
        p pVar = this.mGapWorker;
        if (pVar != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
            pVar.a(this, releaseHorizontalGlow, releaseVerticalGlow);
        }
        stopNestedScroll(i4);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.y1();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        boolean z2 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            aVar.l(aVar.b);
            aVar.l(aVar.c);
            aVar.y = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.P0();
            }
        }
        boolean predictiveItemAnimationsEnabled = predictiveItemAnimationsEnabled();
        androidx.recyclerview.widget.a aVar2 = this.mAdapterHelper;
        if (predictiveItemAnimationsEnabled) {
            aVar2.k();
        } else {
            aVar2.e();
        }
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.y) && (!z || this.mAdapter.hasStableIds());
        k kVar = this.mState;
        if (kVar.j && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        kVar.k = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pullGlows(float f2, float f3, float f4, float f5) {
        boolean z;
        boolean z2 = true;
        if (f3 < 0.0f) {
            ensureLeftGlow();
            bvf0.K(this.mLeftGlow, (-f3) / getWidth(), 1.0f - (f4 / getHeight()));
        } else {
            if (f3 <= 0.0f) {
                z = false;
                if (f5 >= 0.0f) {
                    ensureTopGlow();
                    bvf0.K(this.mTopGlow, (-f5) / getHeight(), f2 / getWidth());
                } else if (f5 > 0.0f) {
                    ensureBottomGlow();
                    bvf0.K(this.mBottomGlow, f5 / getHeight(), 1.0f - (f2 / getWidth()));
                } else {
                    z2 = z;
                }
                if (z2 && f3 == 0.0f && f5 == 0.0f) {
                    return;
                }
                postInvalidateOnAnimation();
            }
            ensureRightGlow();
            bvf0.K(this.mRightGlow, f3 / getWidth(), f4 / getHeight());
        }
        z = true;
        if (f5 >= 0.0f) {
        }
        if (z2) {
        }
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void recoverFocusFromState() {
        View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            if (!this.mChildHelper.c.contains(getFocusedChild())) {
                return;
            }
        }
        View view = null;
        x0 findViewHolderForItemId = (this.mState.m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.m);
        if (findViewHolderForItemId != null) {
            View view2 = findViewHolderForItemId.a;
            if (!this.mChildHelper.c.contains(view2) && view2.hasFocusable()) {
                view = view2;
                if (view == null) {
                    int i2 = this.mState.n;
                    if (i2 != -1 && (findViewById = view.findViewById(i2)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                    return;
                }
                return;
            }
        }
        if (this.mChildHelper.e() > 0) {
            view = findNextViewToFocus();
        }
        if (view == null) {
        }
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    private int releaseHorizontalGlow(int i2, float f2) {
        float height = f2 / getHeight();
        float width = i2 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f3 = 0.0f;
        if (edgeEffect == null || bvf0.z(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && bvf0.z(edgeEffect2) != 0.0f) {
                boolean canScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.mRightGlow;
                if (canScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float K = bvf0.K(edgeEffect3, width, height);
                    if (bvf0.z(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f3 = K;
                }
                invalidate();
            }
        } else {
            boolean canScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.mLeftGlow;
            if (canScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -bvf0.K(edgeEffect4, -width, 1.0f - height);
                if (bvf0.z(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    private int releaseVerticalGlow(int i2, float f2) {
        float width = f2 / getWidth();
        float height = i2 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f3 = 0.0f;
        if (edgeEffect == null || bvf0.z(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && bvf0.z(edgeEffect2) != 0.0f) {
                boolean canScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.mBottomGlow;
                if (canScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float K = bvf0.K(edgeEffect3, height, 1.0f - width);
                    if (bvf0.z(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f3 = K;
                }
                invalidate();
            }
        } else {
            boolean canScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (canScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -bvf0.K(edgeEffect4, -height, width);
                if (bvf0.z(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.mInsetsDirty) {
                Rect rect = layoutParams2.mDecorInsets;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.h1(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        k kVar = this.mState;
        kVar.m = -1L;
        kVar.l = -1;
        kVar.n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        x0 findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.m = this.mAdapter.hasStableIds() ? findContainingViewHolder.x : -1L;
        this.mState.l = this.mDataSetHasChangedAfterLayout ? -1 : findContainingViewHolder.N() ? findContainingViewHolder.w : findContainingViewHolder.E();
        this.mState.n = getDeepestFocusedViewWithId(findContainingViewHolder.a);
    }

    private void setAdapterInternal(Adapter adapter, boolean z, boolean z2) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
        aVar.l(aVar.b);
        aVar.l(aVar.c);
        aVar.y = 0;
        Adapter adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        e eVar = this.mLayout;
        if (eVar != null) {
            eVar.G0(adapter3, this.mAdapter);
        }
        r0 r0Var = this.mRecycler;
        Adapter adapter4 = this.mAdapter;
        r0Var.b();
        r0Var.h(adapter3, true);
        h d2 = r0Var.d();
        if (adapter3 != null) {
            d2.b--;
        }
        if (!z && d2.b == 0) {
            d2.a();
        }
        if (adapter4 != null) {
            d2.b++;
        } else {
            d2.getClass();
        }
        r0Var.g();
        this.mState.f = true;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        sDebugAssertionsEnabled = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        sVerboseLoggingEnabled = z;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i2, int i3) {
        if (i2 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i2) < bvf0.z(edgeEffect) * ((float) i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void startNestedScrollForType(int i2) {
        boolean I = this.mLayout.I();
        int i3 = I;
        if (this.mLayout.J()) {
            i3 = (I ? 1 : 0) | 2;
        }
        startNestedScroll(i3, i2);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || bvf0.z(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z = false;
        } else {
            bvf0.K(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && bvf0.z(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            bvf0.K(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && bvf0.z(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            bvf0.K(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || bvf0.z(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z;
        }
        bvf0.K(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        j jVar;
        w0 w0Var = this.mViewFlinger;
        w0Var.z.removeCallbacks(w0Var);
        w0Var.c.abortAnimation();
        e eVar = this.mLayout;
        if (eVar == null || (jVar = eVar.x) == null) {
            return;
        }
        jVar.i();
    }

    public void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        e eVar = this.mLayout;
        if (eVar != null) {
            eVar.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public void addItemDecoration(d dVar, int i2) {
        e eVar = this.mLayout;
        if (eVar != null) {
            eVar.H("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        ArrayList<d> arrayList = this.mItemDecorations;
        if (i2 < 0) {
            arrayList.add(dVar);
        } else {
            arrayList.add(i2, dVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(uji0 uji0Var) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(uji0Var);
    }

    public void addOnItemTouchListener(vji0 vji0Var) {
        this.mOnItemTouchListeners.add(vji0Var);
    }

    public void addOnScrollListener(g gVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(gVar);
    }

    public void addRecyclerListener(wji0 wji0Var) {
        d6z.m("'listener' arg cannot be null.", wji0Var != null);
        this.mRecyclerListeners.add(wji0Var);
    }

    public void animateAppearance(x0 x0Var, c.a aVar, c.a aVar2) {
        x0Var.T(false);
        if (this.mItemAnimator.a(x0Var, aVar, aVar2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(x0 x0Var, c.a aVar, c.a aVar2) {
        addAnimatingView(x0Var);
        x0Var.T(false);
        if (this.mItemAnimator.c(x0Var, aVar, aVar2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            ny61.r(b64.g(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
        } else {
            ny61.r(b64.g(this, qv10.t(str)));
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (this.mDispatchScrollCounter > 0) {
                new IllegalStateException(b64.g(this, new StringBuilder("")));
            }
        } else if (str == null) {
            ny61.r(b64.g(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        } else {
            ny61.r(str);
        }
    }

    public boolean canReuseUpdatedViewHolder(x0 x0Var) {
        c cVar = this.mItemAnimator;
        return cVar == null || cVar.g(x0Var, x0Var.H());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.K((LayoutParams) layoutParams);
    }

    public void clearOldPositions() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            x0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (!childViewHolderInt.U()) {
                childViewHolderInt.w = -1;
                childViewHolderInt.z = -1;
            }
        }
        r0 r0Var = this.mRecycler;
        ArrayList arrayList = r0Var.a;
        ArrayList arrayList2 = r0Var.c;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            x0 x0Var = (x0) arrayList2.get(i3);
            x0Var.w = -1;
            x0Var.z = -1;
        }
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            x0 x0Var2 = (x0) arrayList.get(i4);
            x0Var2.w = -1;
            x0Var2.z = -1;
        }
        ArrayList arrayList3 = r0Var.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                x0 x0Var3 = (x0) r0Var.b.get(i5);
                x0Var3.w = -1;
                x0Var3.z = -1;
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<uji0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<g> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        e eVar = this.mLayout;
        if (eVar != null && eVar.I()) {
            return this.mLayout.O(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        e eVar = this.mLayout;
        if (eVar != null && eVar.I()) {
            return this.mLayout.P(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        e eVar = this.mLayout;
        if (eVar != null && eVar.I()) {
            return this.mLayout.Q(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        e eVar = this.mLayout;
        if (eVar != null && eVar.J()) {
            return this.mLayout.R(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, defpackage.dlp0
    public int computeVerticalScrollOffset() {
        e eVar = this.mLayout;
        if (eVar != null && eVar.J()) {
            return this.mLayout.S(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        e eVar = this.mLayout;
        if (eVar != null && eVar.J()) {
            return this.mLayout.T(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i2) {
        return consumeFlingInStretch(i2, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i2) {
        return consumeFlingInStretch(i2, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.i()) {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            int i2 = aVar.y;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (aVar.i()) {
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.k();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.d();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public void defaultOnMeasure(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        setMeasuredDimension(e.L(i2, paddingRight, getMinimumWidth()), e.L(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        x0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<uji0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        x0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<uji0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        e layoutManager = getLayoutManager();
        int i2 = 0;
        if (layoutManager != null) {
            if (layoutManager.J()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        smoothScrollBy(0, measuredHeight, null, Integer.MIN_VALUE);
                        return true;
                    }
                    smoothScrollBy(0, -measuredHeight, null, Integer.MIN_VALUE);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean y0 = layoutManager.y0();
                    if (keyCode == 122) {
                        if (y0) {
                            i2 = getAdapter().getItemCount();
                        }
                    } else if (!y0) {
                        i2 = getAdapter().getItemCount();
                    }
                    smoothScrollToPosition(i2);
                    return true;
                }
            } else if (layoutManager.I()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        smoothScrollBy(measuredWidth, 0, null, Integer.MIN_VALUE);
                        return true;
                    }
                    smoothScrollBy(-measuredWidth, 0, null, Integer.MIN_VALUE);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean y02 = layoutManager.y0();
                    if (keyCode2 == 122) {
                        if (y02) {
                            i2 = getAdapter().getItemCount();
                        }
                    } else if (!y02) {
                        i2 = getAdapter().getItemCount();
                    }
                    smoothScrollToPosition(i2);
                    return true;
                }
            }
        }
        return false;
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.i = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.d == 1) {
            dispatchLayoutStep1();
            this.mLayout.n1(this);
            dispatchLayoutStep2();
        } else {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            if ((aVar.c.isEmpty() || aVar.b.isEmpty()) && !z && this.mLayout.H == getWidth() && this.mLayout.I == getHeight()) {
                this.mLayout.n1(this);
            } else {
                this.mLayout.n1(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return getScrollingChildHelper().a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i2) {
        e eVar = this.mLayout;
        if (eVar != null) {
            eVar.Y0(i2);
        }
        onScrollStateChanged(i2);
        g gVar = this.mScrollListener;
        if (gVar != null) {
            gVar.onScrollStateChanged(this, i2);
        }
        List<g> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i2);
            }
        }
    }

    public void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        g gVar = this.mScrollListener;
        if (gVar != null) {
            gVar.onScrolled(this, i2, i3);
        }
        List<g> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        int size = this.mPendingAccessibilityImportanceChange.size();
        while (true) {
            size--;
            List<x0> list = this.mPendingAccessibilityImportanceChange;
            if (size < 0) {
                list.clear();
                return;
            }
            x0 x0Var = list.get(size);
            if (x0Var.a.getParent() == this && !x0Var.U() && (i2 = x0Var.J) != -1) {
                x0Var.a.setImportantForAccessibility(i2);
                x0Var.J = -1;
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).e(canvas, this);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.m()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this);
        this.mBottomGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this);
        this.mLeftGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this);
        this.mRightGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this);
        this.mTopGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(k kVar) {
        if (getScrollState() != 2) {
            kVar.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        kVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f2, float f3) {
        for (int e2 = this.mChildHelper.e() - 1; e2 >= 0; e2--) {
            View d2 = this.mChildHelper.d(e2);
            float translationX = d2.getTranslationX();
            float translationY = d2.getTranslationY();
            if (f2 >= d2.getLeft() + translationX && f2 <= d2.getRight() + translationX && f3 >= d2.getTop() + translationY && f3 <= d2.getBottom() + translationY) {
                return d2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public x0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public x0 findViewHolderForAdapterPosition(int i2) {
        x0 x0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h2 = this.mChildHelper.h();
        for (int i3 = 0; i3 < h2; i3++) {
            x0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i3));
            if (childViewHolderInt != null && !childViewHolderInt.N() && getAdapterPositionInRecyclerView(childViewHolderInt) == i2) {
                androidx.recyclerview.widget.d dVar = this.mChildHelper;
                if (!dVar.c.contains(childViewHolderInt.a)) {
                    return childViewHolderInt;
                }
                x0Var = childViewHolderInt;
            }
        }
        return x0Var;
    }

    public x0 findViewHolderForItemId(long j2) {
        Adapter adapter = this.mAdapter;
        x0 x0Var = null;
        if (adapter != null && adapter.hasStableIds()) {
            int h2 = this.mChildHelper.h();
            for (int i2 = 0; i2 < h2; i2++) {
                x0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
                if (childViewHolderInt != null && !childViewHolderInt.N() && childViewHolderInt.x == j2) {
                    androidx.recyclerview.widget.d dVar = this.mChildHelper;
                    if (!dVar.c.contains(childViewHolderInt.a)) {
                        return childViewHolderInt;
                    }
                    x0Var = childViewHolderInt;
                }
            }
        }
        return x0Var;
    }

    public x0 findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x0 findViewHolderForPosition(int i2, boolean z) {
        androidx.recyclerview.widget.d dVar;
        int h2 = this.mChildHelper.h();
        x0 x0Var = null;
        for (int i3 = 0; i3 < h2; i3++) {
            x0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i3));
            if (childViewHolderInt != null && !childViewHolderInt.N()) {
                if (z) {
                    if (childViewHolderInt.c != i2) {
                        continue;
                    }
                    dVar = this.mChildHelper;
                    if (dVar.c.contains(childViewHolderInt.a)) {
                        return childViewHolderInt;
                    }
                    x0Var = childViewHolderInt;
                } else {
                    if (childViewHolderInt.G() != i2) {
                        continue;
                    }
                    dVar = this.mChildHelper;
                    if (dVar.c.contains(childViewHolderInt.a)) {
                    }
                }
            }
        }
        return x0Var;
    }

    public boolean flingNoThresholdCheck(int i2, int i3) {
        return fling(i2, i3, 0, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View focusSearch(View view, int i2) {
        View view2;
        boolean z;
        this.mLayout.getClass();
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (!z2 || (i2 != 2 && i2 != 1)) {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) != null) {
                    startInterceptRequestLayout();
                    view2 = this.mLayout.J0(view, i2, this.mRecycler, this.mState);
                    stopInterceptRequestLayout(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 != null || view2.hasFocusable()) {
                return isPreferredNextFocus(view, view2, i2) ? view2 : super.focusSearch(view, i2);
            }
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i2);
            }
            requestChildOnScreen(view2, null);
            return view;
        }
        if (this.mLayout.J()) {
            if (focusFinder.findNextFocus(this, view, i2 == 2 ? 130 : 33) == null) {
                z = true;
                if (!z && this.mLayout.I()) {
                    z = focusFinder.findNextFocus(this, view, !((this.mLayout.b.getLayoutDirection() != 1) ^ (i2 != 2)) ? 66 : 17) == null;
                }
                if (z) {
                    consumePendingUpdateOperations();
                    if (findContainingItemView(view) != null) {
                        startInterceptRequestLayout();
                        this.mLayout.J0(view, i2, this.mRecycler, this.mState);
                        stopInterceptRequestLayout(false);
                    }
                    return null;
                }
                view2 = focusFinder.findNextFocus(this, view, i2);
                if (view2 != null) {
                }
                if (isPreferredNextFocus(view, view2, i2)) {
                }
            }
        }
        z = false;
        if (!z) {
            z = focusFinder.findNextFocus(this, view, !((this.mLayout.b.getLayoutDirection() != 1) ^ (i2 != 2)) ? 66 : 17) == null;
        }
        if (z) {
        }
        view2 = focusFinder.findNextFocus(this, view, i2);
        if (view2 != null) {
        }
        if (isPreferredNextFocus(view, view2, i2)) {
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        e eVar = this.mLayout;
        if (eVar != null) {
            return eVar.Y();
        }
        ny61.r(b64.g(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        e eVar = this.mLayout;
        if (eVar != null) {
            return eVar.Z(getContext(), attributeSet);
        }
        ny61.r(b64.g(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(x0 x0Var) {
        if ((x0Var.C & 524) == 0 && x0Var.K()) {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            int i2 = x0Var.c;
            ArrayList arrayList = aVar.b;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                u70 u70Var = (u70) arrayList.get(i3);
                int i4 = u70Var.a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = u70Var.b;
                        if (i5 <= i2) {
                            int i6 = u70Var.d;
                            if (i5 + i6 <= i2) {
                                i2 -= i6;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i7 = u70Var.b;
                        if (i7 == i2) {
                            i2 = u70Var.d;
                        } else {
                            if (i7 < i2) {
                                i2--;
                            }
                            if (u70Var.d <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (u70Var.b <= i2) {
                    i2 += u70Var.d;
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        e eVar = this.mLayout;
        if (eVar == null) {
            return super.getBaseline();
        }
        eVar.getClass();
        return -1;
    }

    public long getChangedHolderKey(x0 x0Var) {
        return this.mAdapter.hasStableIds() ? x0Var.x : x0Var.c;
    }

    public int getChildAdapterPosition(View view) {
        x0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.E();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        tji0 tji0Var = this.mChildDrawingOrderCallback;
        return tji0Var == null ? super.getChildDrawingOrder(i2, i3) : tji0Var.c(i2, i3);
    }

    public long getChildItemId(View view) {
        x0 childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.x;
    }

    public int getChildLayoutPosition(View view) {
        x0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.G();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public x0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        w511.l("View ", view, " is not a direct child of ", this);
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public z0 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public b getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public c getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.mInsetsDirty) {
            return layoutParams.mDecorInsets;
        }
        if (this.mState.g && (layoutParams.isItemChanged() || layoutParams.isViewInvalid())) {
            return layoutParams.mDecorInsets;
        }
        Rect rect = layoutParams.mDecorInsets;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i2).c(this.mTempRect, view, this, this.mState);
            int i3 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.mInsetsDirty = false;
        return rect;
    }

    public d getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.mItemDecorations.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public e getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public f getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public h getRecycledViewPool() {
        return this.mRecycler.d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.i();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new k0(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            ny61.g(b64.g(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        } else {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(qwg0.fastscroll_default_thickness), resources.getDimensionPixelSize(qwg0.fastscroll_minimum_range), resources.getDimensionPixelOffset(qwg0.fastscroll_margin));
        }
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        e eVar = this.mLayout;
        if (eVar != null) {
            eVar.H("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        c cVar = this.mItemAnimator;
        return cVar != null && cVar.m();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.l1(i2);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            ((LayoutParams) this.mChildHelper.g(i2).getLayoutParams()).mInsetsDirty = true;
        }
        ArrayList arrayList = this.mRecycler.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            LayoutParams layoutParams = (LayoutParams) ((x0) arrayList.get(i3)).a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.mInsetsDirty = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            x0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (childViewHolderInt != null && !childViewHolderInt.U()) {
                childViewHolderInt.D(6);
            }
        }
        markItemDecorInsetsDirty();
        r0 r0Var = this.mRecycler;
        ArrayList arrayList = r0Var.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            x0 x0Var = (x0) arrayList.get(i3);
            if (x0Var != null) {
                x0Var.D(6);
                x0Var.D(1024);
            }
        }
        Adapter adapter = r0Var.i.mAdapter;
        if (adapter == null || !adapter.hasStableIds()) {
            r0Var.i();
        }
    }

    public void nestedScrollBy(int i2, int i3) {
        nestedScrollByInternal(i2, i3, null, 1);
    }

    public void offsetChildrenHorizontal(int i2) {
        int e2 = this.mChildHelper.e();
        for (int i3 = 0; i3 < e2; i3++) {
            this.mChildHelper.d(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(int i2) {
        int e2 = this.mChildHelper.e();
        for (int i3 = 0; i3 < e2; i3++) {
            this.mChildHelper.d(i3).offsetTopAndBottom(i2);
        }
    }

    public void offsetPositionRecordsForInsert(int i2, int i3) {
        int h2 = this.mChildHelper.h();
        for (int i4 = 0; i4 < h2; i4++) {
            x0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i4));
            if (childViewHolderInt != null && !childViewHolderInt.U() && childViewHolderInt.c >= i2) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                childViewHolderInt.R(i3, false);
                this.mState.f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            x0 x0Var = (x0) arrayList.get(i5);
            if (x0Var != null && x0Var.c >= i2) {
                if (sVerboseLoggingEnabled) {
                    x0Var.toString();
                }
                x0Var.R(i3, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int h2 = this.mChildHelper.h();
        int i11 = -1;
        if (i2 < i3) {
            i5 = i2;
            i4 = i3;
            i6 = -1;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i12 = 0; i12 < h2; i12++) {
            x0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && (i10 = childViewHolderInt.c) >= i5 && i10 <= i4) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                if (childViewHolderInt.c == i2) {
                    childViewHolderInt.R(i3 - i2, false);
                } else {
                    childViewHolderInt.R(i6, false);
                }
                this.mState.f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.c;
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i11 = 1;
            i8 = i3;
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            x0 x0Var = (x0) arrayList.get(i13);
            if (x0Var != null && (i9 = x0Var.c) >= i8 && i9 <= i7) {
                if (i9 == i2) {
                    x0Var.R(i3 - i2, false);
                } else {
                    x0Var.R(i11, false);
                }
                if (sVerboseLoggingEnabled) {
                    x0Var.toString();
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i2, int i3, boolean z) {
        int i4 = i2 + i3;
        int h2 = this.mChildHelper.h();
        for (int i5 = 0; i5 < h2; i5++) {
            x0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i5));
            if (childViewHolderInt != null && !childViewHolderInt.U()) {
                int i6 = childViewHolderInt.c;
                if (i6 >= i4) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.R(-i3, z);
                    this.mState.f = true;
                } else if (i6 >= i2) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.D(8);
                    childViewHolderInt.R(-i3, z);
                    childViewHolderInt.c = i2 - 1;
                    this.mState.f = true;
                }
            }
        }
        r0 r0Var = this.mRecycler;
        ArrayList arrayList = r0Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x0 x0Var = (x0) arrayList.get(size);
            if (x0Var != null) {
                int i7 = x0Var.c;
                if (i7 >= i4) {
                    if (sVerboseLoggingEnabled) {
                        x0Var.toString();
                    }
                    x0Var.R(-i3, z);
                } else if (i7 >= i2) {
                    x0Var.D(8);
                    r0Var.j(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.g();
        e eVar = this.mLayout;
        if (eVar != null) {
            eVar.z = true;
            eVar.H0(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = p.x;
            p pVar = (p) threadLocal.get();
            this.mGapWorker = pVar;
            if (pVar == null) {
                this.mGapWorker = new p();
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f2 = display.getRefreshRate();
                }
                f2 = 60.0f;
                p pVar2 = this.mGapWorker;
                pVar2.c = (long) (1.0E9f / f2);
                threadLocal.set(pVar2);
            }
            ArrayList arrayList = this.mGapWorker.a;
            if (sDebugAssertionsEnabled && arrayList.contains(this)) {
                ny61.r("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        p pVar;
        super.onDetachedFromWindow();
        c cVar = this.mItemAnimator;
        if (cVar != null) {
            cVar.k();
        }
        stopScroll();
        int i2 = 0;
        this.mIsAttached = false;
        e eVar = this.mLayout;
        if (eVar != null) {
            r0 r0Var = this.mRecycler;
            eVar.z = false;
            eVar.I0(this, r0Var);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (h1.d.a() != null) {
        }
        r0 r0Var2 = this.mRecycler;
        ArrayList arrayList = r0Var2.c;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            i6e0.a(((x0) arrayList.get(i3)).a);
        }
        r0Var2.h(r0Var2.i.mAdapter, false);
        int i4 = i6e0.a;
        while (i2 < getChildCount()) {
            int i5 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                ny61.s();
                return;
            }
            ArrayList arrayList2 = i6e0.b(childAt).a;
            for (int f2 = scc.f(arrayList2); -1 < f2; f2--) {
                ((up31) ((j6e0) arrayList2.get(f2))).a.disposeComposition();
            }
            i2 = i5;
        }
        if (!ALLOW_THREAD_GAP_WORK || (pVar = this.mGapWorker) == null) {
            return;
        }
        boolean remove = pVar.a.remove(this);
        if (!sDebugAssertionsEnabled || remove) {
            this.mGapWorker = null;
        } else {
            ny61.r("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).d(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            if (sDebugAssertionsEnabled && i2 < 0) {
                ny61.r(b64.g(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
                return;
            }
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i2;
        boolean z;
        float f2;
        RecyclerView recyclerView;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f3 = this.mLayout.J() ? -motionEvent.getAxisValue(9) : 0.0f;
                z = false;
                f2 = this.mLayout.I() ? motionEvent.getAxisValue(10) : 0.0f;
                r2 = f3;
                i2 = 0;
            } else if ((motionEvent.getSource() & SelfTester_JCP.ENCRYPT_CBC) != 0) {
                i2 = 26;
                f2 = motionEvent.getAxisValue(26);
                if (this.mLayout.J()) {
                    float f4 = -f2;
                    f2 = 0.0f;
                    r2 = f4;
                } else if (!this.mLayout.I()) {
                    f2 = 0.0f;
                }
                z = this.mLowResRotaryEncoderFeature;
            } else {
                i2 = 0;
                z = false;
                f2 = 0.0f;
            }
            int i3 = (int) (r2 * this.mScaledVerticalScrollFactor);
            int i4 = (int) (f2 * this.mScaledHorizontalScrollFactor);
            if (z) {
                OverScroller overScroller = this.mViewFlinger.c;
                recyclerView = this;
                recyclerView.smoothScrollBy((overScroller.getFinalX() - overScroller.getCurrX()) + i4, (overScroller.getFinalY() - overScroller.getCurrY()) + i3, null, Integer.MIN_VALUE, true);
            } else {
                recyclerView = this;
                recyclerView.nestedScrollByInternal(i4, i3, motionEvent, 1);
            }
            if (i2 != 0 && !z) {
                recyclerView.mDifferentialMotionFlingController.a(motionEvent, i2);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        e eVar = this.mLayout;
        if (eVar == null) {
            return false;
        }
        boolean I = eVar.I();
        boolean J = this.mLayout.J();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            startNestedScrollForType(0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!I || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (J && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        e eVar = this.mLayout;
        if (eVar == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z = false;
        if (eVar.getK()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.b.defaultOnMeasure(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.p1(i2, i3);
            this.mState.i = true;
            dispatchLayoutStep2();
            this.mLayout.s1(i2, i3);
            if (this.mLayout.v1()) {
                this.mLayout.p1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.i = true;
                dispatchLayoutStep2();
                this.mLayout.s1(i2, i3);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.b.defaultOnMeasure(i2, i3);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            k kVar = this.mState;
            if (kVar.k) {
                kVar.g = true;
            } else {
                this.mAdapterHelper.e();
                this.mState.g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.mAdapter;
        k kVar2 = this.mState;
        if (adapter != null) {
            kVar2.e = adapter.getItemCount();
        } else {
            kVar2.e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.b.defaultOnMeasure(i2, i3);
        stopInterceptRequestLayout(false);
        this.mState.g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.copyFrom(savedState2);
            return savedState;
        }
        e eVar = this.mLayout;
        if (eVar != null) {
            savedState.mLayoutState = eVar.X0();
            return savedState;
        }
        savedState.mLayoutState = null;
        return savedState;
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(int i2, int i3) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        e eVar = this.mLayout;
        if (eVar == null) {
            return false;
        }
        boolean I = eVar.I();
        boolean J = this.mLayout.J();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        obtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            startNestedScrollForType(0);
        } else {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(obtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f2 = I ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f3 = J ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f2 == 0.0f && f3 == 0.0f) || !fling((int) f2, (int) f3)) {
                    setScrollState(0);
                }
                resetScroll();
                obtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (findPointerIndex < 0) {
                    Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i2 = this.mLastTouchX - x2;
                int i3 = this.mLastTouchY - y2;
                if (this.mScrollState != 1) {
                    if (I) {
                        int i4 = this.mTouchSlop;
                        i2 = i2 > 0 ? Math.max(0, i2 - i4) : Math.min(0, i2 + i4);
                        if (i2 != 0) {
                            z = true;
                            if (J) {
                                int i5 = this.mTouchSlop;
                                i3 = i3 > 0 ? Math.max(0, i3 - i5) : Math.min(0, i3 + i5);
                                if (i3 != 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                    }
                    z = false;
                    if (J) {
                    }
                    if (z) {
                    }
                }
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int releaseHorizontalGlow = i2 - releaseHorizontalGlow(i2, motionEvent.getY());
                    int releaseVerticalGlow = i3 - releaseVerticalGlow(i3, motionEvent.getX());
                    if (dispatchNestedPreScroll(I ? releaseHorizontalGlow : 0, J ? releaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        releaseHorizontalGlow -= iArr4[0];
                        releaseVerticalGlow -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i6 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i6 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x2 - iArr7[0];
                    this.mLastTouchY = y2 - iArr7[1];
                    if (scrollByInternal(I ? releaseHorizontalGlow : 0, J ? releaseVerticalGlow : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    p pVar = this.mGapWorker;
                    if (pVar != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
                        pVar.a(this, releaseHorizontalGlow, releaseVerticalGlow);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x3;
                this.mInitialTouchX = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y3;
                this.mInitialTouchY = y3;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
        }
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(x0 x0Var, c.a aVar) {
        x0Var.C &= -8193;
        if (this.mState.h && x0Var.Q() && !x0Var.N() && !x0Var.U()) {
            this.mViewInfoStore.b.h(getChangedHolderKey(x0Var), x0Var);
        }
        ycs0 ycs0Var = this.mViewInfoStore.a;
        h1 h1Var = (h1) ycs0Var.get(x0Var);
        if (h1Var == null) {
            h1Var = h1.a();
            ycs0Var.put(x0Var, h1Var);
        }
        h1Var.b = aVar;
        h1Var.a |= 4;
    }

    public void removeAndRecycleViews() {
        c cVar = this.mItemAnimator;
        if (cVar != null) {
            cVar.k();
        }
        e eVar = this.mLayout;
        if (eVar != null) {
            eVar.c1(this.mRecycler);
            this.mLayout.d1(this.mRecycler);
        }
        this.mRecycler.b();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        androidx.recyclerview.widget.d dVar = this.mChildHelper;
        jpb jpbVar = dVar.b;
        va90 va90Var = dVar.a;
        int i2 = dVar.d;
        boolean z = false;
        z = false;
        if (i2 == 1) {
            if (dVar.e != view) {
                ny61.r("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return false;
            }
        } else {
            if (i2 == 2) {
                ny61.r("Cannot call removeViewIfHidden within removeViewIfHidden");
                return false;
            }
            try {
                dVar.d = 2;
                int indexOfChild = ((RecyclerView) va90Var.a).indexOfChild(view);
                if (indexOfChild == -1) {
                    dVar.l(view);
                } else if (jpbVar.e(indexOfChild)) {
                    jpbVar.g(indexOfChild);
                    dVar.l(view);
                    va90Var.l(indexOfChild);
                }
                dVar.d = 0;
                z = true;
            } finally {
                dVar.d = 0;
            }
        }
        if (z) {
            x0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.o(childViewHolderInt);
            this.mRecycler.l(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Objects.toString(view);
                toString();
            }
        }
        stopInterceptRequestLayout(!z);
        return z;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        x0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.P()) {
                childViewHolderInt.C &= -257;
            } else if (!childViewHolderInt.U()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                ny61.g(b64.g(this, sb));
                return;
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            ny61.g(b64.g(this, sb2));
            return;
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(d dVar) {
        e eVar = this.mLayout;
        if (eVar != null) {
            eVar.H("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(dVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i2));
            return;
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(uji0 uji0Var) {
        List<uji0> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(uji0Var);
    }

    public void removeOnItemTouchListener(vji0 vji0Var) {
        this.mOnItemTouchListeners.remove(vji0Var);
        if (this.mInterceptingOnItemTouchListener == vji0Var) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(g gVar) {
        List<g> list = this.mScrollListeners;
        if (list != null) {
            list.remove(gVar);
        }
    }

    public void removeRecyclerListener(wji0 wji0Var) {
        this.mRecyclerListeners.remove(wji0Var);
    }

    public void repositionShadowingViews() {
        x0 x0Var;
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            View d2 = this.mChildHelper.d(i2);
            x0 childViewHolder = getChildViewHolder(d2);
            if (childViewHolder != null && (x0Var = childViewHolder.B) != null) {
                View view = x0Var.a;
                int left = d2.getLeft();
                int top = d2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.A0() && !isComputingLayout() && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.h1(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            x0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (sDebugAssertionsEnabled && childViewHolderInt.c == -1 && !childViewHolderInt.N()) {
                ny61.r(b64.g(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                return;
            }
            if (!childViewHolderInt.U() && childViewHolderInt.w == -1) {
                childViewHolderInt.w = childViewHolderInt.c;
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        e eVar = this.mLayout;
        if (eVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean I = eVar.I();
        boolean J = this.mLayout.J();
        if (I || J) {
            if (!I) {
                i2 = 0;
            }
            if (!J) {
                i3 = 0;
            }
            scrollByInternal(i2, i3, null, 0);
        }
    }

    public boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i2, i3, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i7 = i2 - i9;
            i8 = i3 - i10;
            i6 = i10;
            i5 = i9;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i6, i7, i8, this.mScrollOffset, i4, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i11 = iArr4[0];
        int i12 = i7 - i11;
        int i13 = iArr4[1];
        int i14 = i8 - i13;
        boolean z = (i11 == 0 && i13 == 0) ? false : true;
        int i15 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i16 = iArr5[0];
        this.mLastTouchX = i15 - i16;
        int i17 = this.mLastTouchY;
        int i18 = iArr5[1];
        this.mLastTouchY = i17 - i18;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i16;
        iArr6[1] = iArr6[1] + i18;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !fob1.d(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i12, motionEvent.getY(), i14);
                if (Build.VERSION.SDK_INT >= 31 && fob1.d(motionEvent, SelfTester_JCP.ENCRYPT_CBC)) {
                    releaseGlows();
                }
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (i5 != 0 || i6 != 0) {
            dispatchOnScrolled(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i6 == 0) ? false : true;
    }

    public void scrollStep(int i2, int i3, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int k1 = i2 != 0 ? this.mLayout.k1(i2, this.mRecycler, this.mState) : 0;
        int m1 = i3 != 0 ? this.mLayout.m1(i3, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = k1;
            iArr[1] = m1;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    public void scrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        e eVar = this.mLayout;
        if (eVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            eVar.l1(i2);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(z0 z0Var) {
        this.mAccessibilityDelegate = z0Var;
        androidx.core.view.b.p(this, z0Var);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(tji0 tji0Var) {
        if (tji0Var == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = tji0Var;
        setChildrenDrawingOrderEnabled(tji0Var != null);
    }

    public boolean setChildImportantForAccessibilityInternal(x0 x0Var, int i2) {
        if (!isComputingLayout()) {
            x0Var.a.setImportantForAccessibility(i2);
            return true;
        }
        x0Var.J = i2;
        this.mPendingAccessibilityImportanceChange.add(x0Var);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(b bVar) {
        bVar.getClass();
        this.mEdgeEffectFactory = bVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(c cVar) {
        c cVar2 = this.mItemAnimator;
        if (cVar2 != null) {
            cVar2.k();
            this.mItemAnimator.a = null;
        }
        this.mItemAnimator = cVar;
        if (cVar != null) {
            cVar.a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i2) {
        r0 r0Var = this.mRecycler;
        r0Var.e = i2;
        r0Var.p();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(e eVar) {
        RecyclerView recyclerView;
        if (eVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            c cVar = this.mItemAnimator;
            if (cVar != null) {
                cVar.k();
            }
            this.mLayout.c1(this.mRecycler);
            this.mLayout.d1(this.mRecycler);
            this.mRecycler.b();
            if (this.mIsAttached) {
                e eVar2 = this.mLayout;
                r0 r0Var = this.mRecycler;
                eVar2.z = false;
                eVar2.I0(this, r0Var);
            }
            this.mLayout.t1(null);
            this.mLayout = null;
        } else {
            this.mRecycler.b();
        }
        androidx.recyclerview.widget.d dVar = this.mChildHelper;
        dVar.b.h();
        ArrayList arrayList = dVar.c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) dVar.a.a;
            if (size < 0) {
                break;
            }
            x0 childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                recyclerView.setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.I);
                childViewHolderInt.I = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = eVar;
        if (eVar != null) {
            if (eVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(eVar);
                sb.append(" is already attached to a RecyclerView:");
                ny61.g(b64.g(eVar.b, sb));
                return;
            }
            eVar.t1(this);
            if (this.mIsAttached) {
                e eVar3 = this.mLayout;
                eVar3.z = true;
                eVar3.H0(this);
            }
        }
        this.mRecycler.p();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            ny61.g("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().g(z);
    }

    public void setOnFlingListener(f fVar) {
        this.mOnFlingListener = fVar;
    }

    @Deprecated
    public void setOnScrollListener(g gVar) {
        this.mScrollListener = gVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(h hVar) {
        r0 r0Var = this.mRecycler;
        RecyclerView recyclerView = r0Var.i;
        r0Var.h(recyclerView.mAdapter, false);
        if (r0Var.g != null) {
            r1.b--;
        }
        r0Var.g = hVar;
        if (hVar != null && recyclerView.getAdapter() != null) {
            r0Var.g.b++;
        }
        r0Var.g();
    }

    @Deprecated
    public void setRecyclerListener(wji0 wji0Var) {
    }

    public void setScrollState(int i2) {
        if (i2 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            new Exception();
        }
        this.mScrollState = i2;
        if (i2 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(l lVar) {
        this.mRecycler.h = lVar;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4, boolean z) {
        e eVar = this.mLayout;
        if (eVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!eVar.I()) {
            i2 = 0;
        }
        if (!this.mLayout.J()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (i4 != Integer.MIN_VALUE && i4 <= 0) {
            scrollBy(i2, i3);
            return;
        }
        if (z) {
            int i5 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i5 |= 2;
            }
            startNestedScroll(i5, 1);
        }
        this.mViewFlinger.c(i2, i3, interpolator, i4);
    }

    public void smoothScrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        e eVar = this.mLayout;
        if (eVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            eVar.x1(this, this.mState, i2);
        }
    }

    public void startInterceptRequestLayout() {
        int i2 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i2;
        if (i2 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().h(i2, 0);
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                ny61.r(b64.g(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
                return;
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(Adapter adapter, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int i5;
        int h2 = this.mChildHelper.h();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < h2; i7++) {
            View g2 = this.mChildHelper.g(i7);
            x0 childViewHolderInt = getChildViewHolderInt(g2);
            if (childViewHolderInt != null && !childViewHolderInt.U() && (i5 = childViewHolderInt.c) >= i2 && i5 < i6) {
                childViewHolderInt.D(2);
                if (obj == null) {
                    childViewHolderInt.D(1024);
                } else if ((1024 & childViewHolderInt.C) == 0) {
                    if (childViewHolderInt.D == null) {
                        ArrayList arrayList = new ArrayList();
                        childViewHolderInt.D = arrayList;
                        childViewHolderInt.E = Collections.unmodifiableList(arrayList);
                    }
                    childViewHolderInt.D.add(obj);
                }
                ((LayoutParams) g2.getLayoutParams()).mInsetsDirty = true;
            }
        }
        r0 r0Var = this.mRecycler;
        ArrayList arrayList2 = r0Var.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            x0 x0Var = (x0) arrayList2.get(size);
            if (x0Var != null && (i4 = x0Var.c) >= i2 && i4 < i6) {
                x0Var.D(2);
                r0Var.j(size);
            }
        }
    }

    public static abstract class Adapter {
        private final AdapterDataObservable mObservable = new AdapterDataObservable();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class StateRestorationPolicy {
            private static final /* synthetic */ StateRestorationPolicy[] $VALUES;
            public static final StateRestorationPolicy ALLOW;
            public static final StateRestorationPolicy PREVENT;
            public static final StateRestorationPolicy PREVENT_WHEN_EMPTY;

            static {
                StateRestorationPolicy stateRestorationPolicy = new StateRestorationPolicy("ALLOW", 0);
                ALLOW = stateRestorationPolicy;
                StateRestorationPolicy stateRestorationPolicy2 = new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1);
                PREVENT_WHEN_EMPTY = stateRestorationPolicy2;
                StateRestorationPolicy stateRestorationPolicy3 = new StateRestorationPolicy("PREVENT", 2);
                PREVENT = stateRestorationPolicy3;
                $VALUES = new StateRestorationPolicy[]{stateRestorationPolicy, stateRestorationPolicy2, stateRestorationPolicy3};
            }

            public static StateRestorationPolicy valueOf(String str) {
                return (StateRestorationPolicy) Enum.valueOf(StateRestorationPolicy.class, str);
            }

            public static StateRestorationPolicy[] values() {
                return (StateRestorationPolicy[]) $VALUES.clone();
            }
        }

        public void b(int i) {
            notifyItemChanged(i);
        }

        public final void bindViewHolder(x0 x0Var, int i) {
            Adapter adapter = x0Var.L;
            View view = x0Var.a;
            boolean z = adapter == null;
            if (z) {
                x0Var.c = i;
                if (hasStableIds()) {
                    x0Var.x = getItemId(i);
                }
                x0Var.C = (x0Var.C & (-520)) | 1;
                if (Trace.isEnabled()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(x0Var.y)));
                }
            }
            x0Var.L = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (view.getParent() == null && view.isAttachedToWindow() != x0Var.P()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + x0Var.P() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + x0Var);
                }
                if (view.getParent() == null && view.isAttachedToWindow()) {
                    yci0.k(x0Var, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                    return;
                }
            }
            onBindViewHolder(x0Var, i, x0Var.H());
            if (z) {
                ArrayList arrayList = x0Var.D;
                if (arrayList != null) {
                    arrayList.clear();
                }
                x0Var.C &= -1025;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).mInsetsDirty = true;
                }
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int ordinal = this.mStateRestorationPolicy.ordinal();
            return ordinal != 1 ? ordinal != 2 : getItemCount() > 0;
        }

        public final x0 createViewHolder(ViewGroup viewGroup, int i) {
            try {
                if (Trace.isEnabled()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i)));
                }
                x0 onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                onCreateViewHolder.y = i;
                return onCreateViewHolder;
            } finally {
                Trace.endSection();
            }
        }

        public void d(int i) {
            notifyItemInserted(i);
        }

        public void e(int i) {
            notifyItemRemoved(i);
        }

        public int findRelativeAdapterPositionIn(Adapter adapter, x0 x0Var, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.hasObservers();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.notifyItemRangeChanged(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.notifyItemRangeInserted(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.notifyItemMoved(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.notifyItemRangeChanged(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.notifyItemRangeInserted(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.notifyItemRangeRemoved(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.notifyItemRangeRemoved(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(x0 x0Var, int i);

        public void onBindViewHolder(x0 x0Var, int i, List<Object> list) {
            onBindViewHolder(x0Var, i);
        }

        public abstract x0 onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(x0 x0Var) {
            return false;
        }

        public void onViewAttachedToWindow(x0 x0Var) {
        }

        public void onViewDetachedFromWindow(x0 x0Var) {
        }

        public void onViewRecycled(x0 x0Var) {
        }

        public void registerAdapterDataObserver(a aVar) {
            this.mObservable.registerObserver(aVar);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                ny61.r("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            } else {
                this.mHasStableIds = z;
            }
        }

        public void setStateRestorationPolicy(StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.notifyStateRestorationPolicyChanged();
        }

        public void unregisterAdapterDataObserver(a aVar) {
            this.mObservable.unregisterObserver(aVar);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.notifyItemRangeChanged(i, i2, obj);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.notifyItemRangeChanged(i, 1, obj);
        }
    }

    @Override // defpackage.qn50
    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().i(i2);
    }

    @Override // defpackage.qn50
    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().f(i2);
    }

    @Override // defpackage.qn50
    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().h(i2, i3);
    }

    @Override // defpackage.qn50
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        final Rect mDecorInsets;
        boolean mInsetsDirty;
        boolean mPendingInvalidate;
        x0 mViewHolder;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public int getAbsoluteAdapterPosition() {
            return this.mViewHolder.E();
        }

        public int getBindingAdapterPosition() {
            return this.mViewHolder.F();
        }

        @Deprecated
        public int getViewAdapterPosition() {
            return this.mViewHolder.F();
        }

        public int getViewLayoutPosition() {
            return this.mViewHolder.G();
        }

        @Deprecated
        public int getViewPosition() {
            x0 x0Var = this.mViewHolder;
            int i = x0Var.z;
            return i == -1 ? x0Var.c : i;
        }

        public boolean isItemChanged() {
            return this.mViewHolder.Q();
        }

        public boolean isItemRemoved() {
            return this.mViewHolder.N();
        }

        public boolean isViewInvalid() {
            return this.mViewHolder.L();
        }

        public boolean viewNeedsUpdate() {
            return (this.mViewHolder.C & 2) != 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr, i6, null);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.recyclerview.widget.RecyclerView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        Parcelable mLayoutState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.mLayoutState = parcel.readParcelable(classLoader == null ? e.class.getClassLoader() : classLoader);
        }

        public void copyFrom(SavedState savedState) {
            this.mLayoutState = savedState.mLayoutState;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.mLayoutState, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public static class AdapterDataObservable extends Observable<a> {
        public boolean hasObservers() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void notifyChanged() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((a) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void notifyItemMoved(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((a) ((Observable) this).mObservers.get(size)).e(i, i2);
            }
        }

        public void notifyItemRangeChanged(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((a) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
            }
        }

        public void notifyItemRangeInserted(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((a) ((Observable) this).mObservers.get(size)).d(i, i2);
            }
        }

        public void notifyItemRangeRemoved(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((a) ((Observable) this).mObservers.get(size)).f(i, i2);
            }
        }

        public void notifyStateRestorationPolicyChanged() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((a) ((Observable) this).mObservers.get(size)).g();
            }
        }

        public void notifyItemRangeChanged(int i, int i2) {
            notifyItemRangeChanged(i, i2, null);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        e eVar = this.mLayout;
        if (eVar != null) {
            return eVar.a0(layoutParams);
        }
        ny61.r(b64.g(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    public void addItemDecoration(d dVar) {
        addItemDecoration(dVar, -1);
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    @Deprecated
    public x0 findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4) {
        smoothScrollBy(i2, i3, interpolator, i4, false);
    }

    public void smoothScrollBy(int i2, int i3) {
        smoothScrollBy(i2, i3, null);
    }

    public boolean fling(int i2, int i3) {
        return fling(i2, i3, this.mMinFlingVelocity, this.mMaxFlingVelocity);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gog0.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
