package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.customview.view.AbsSavedState;
import defpackage.b2i0;
import defpackage.bog0;
import defpackage.bx60;
import defpackage.elj;
import defpackage.i4i0;
import defpackage.im91;
import defpackage.l6e0;
import defpackage.n6e0;
import defpackage.n751;
import defpackage.np31;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.rr31;
import defpackage.sae;
import defpackage.sp31;
import defpackage.tn50;
import defpackage.un50;
import defpackage.vm7;
import defpackage.vn50;
import defpackage.w511;
import defpackage.y0u;
import defpackage.yci0;
import defpackage.ycs0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements tn50, un50 {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    private static final float KEY_SCROLL_FRACTION_AMOUNT = 0.2f;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<a>>> sConstructors;
    private static final l6e0 sRectPool;
    private bx60 mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final elj mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private final int[] mKeyTriggeredScrollConsumed;
    private int[] mKeylines;
    private n751 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final vn50 mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private OnPreDrawListener mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempList1;

    public class HierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        public HierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class OnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
        public OnPreDrawListener() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    public static abstract class a {
        public boolean a(View view, Rect rect) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public n751 c(View view, n751 n751Var) {
            return n751Var;
        }

        public void d(LayoutParams layoutParams) {
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void f(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void g() {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
            return false;
        }

        public boolean j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            return false;
        }

        public boolean k(float f, float f2, View view) {
            return false;
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        }

        public void m(int i, int i2, View view) {
        }

        public void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            m(i2, i4, view);
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            return false;
        }

        public void p(View view, Parcelable parcelable) {
        }

        public Parcelable q(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return false;
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        }

        public boolean t(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r0 != null ? r0.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new y0u(3);
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new n6e0(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        CoordinatorLayout coordinatorLayout;
        Context context2;
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new elj();
        this.mTempList1 = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mKeyTriggeredScrollConsumed = new int[2];
        this.mNestedScrollingParentHelper = new vn50();
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, i4i0.CoordinatorLayout, 0, b2i0.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, i4i0.CoordinatorLayout, i, 0);
        if (i == 0) {
            int[] iArr = i4i0.CoordinatorLayout;
            int i2 = b2i0.Widget_Support_CoordinatorLayout;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            coordinatorLayout = this;
            context2 = context;
            sp31.b(coordinatorLayout, context2, iArr, attributeSet, obtainStyledAttributes, 0, i2);
        } else {
            coordinatorLayout = this;
            context2 = context;
            int[] iArr2 = i4i0.CoordinatorLayout;
            WeakHashMap weakHashMap2 = androidx.core.view.b.a;
            sp31.b(coordinatorLayout, context2, iArr2, attributeSet, obtainStyledAttributes, i, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(i4i0.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.mKeylines = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.mKeylines.length;
            for (int i3 = 0; i3 < length; i3++) {
                coordinatorLayout.mKeylines[i3] = (int) (r11[i3] * f);
            }
        }
        coordinatorLayout.mStatusBarBackground = obtainStyledAttributes.getDrawable(i4i0.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        coordinatorLayout.setupForInsets();
        super.setOnHierarchyChangeListener(coordinatorLayout.new HierarchyChangeListener());
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }

    private static Rect acquireTempRect() {
        Rect rect = (Rect) sRectPool.a();
        return rect == null ? new Rect() : rect;
    }

    private void cancelInterceptBehaviors() {
        int childCount = getChildCount();
        MotionEvent motionEvent = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            a behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (behavior != null) {
                if (motionEvent == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                behavior.h(this, childAt, motionEvent);
            }
        }
        if (motionEvent != null) {
            motionEvent.recycle();
        }
    }

    private static int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private void constrainChildRect(LayoutParams layoutParams, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    private n751 dispatchApplyWindowInsetsToBehaviors(n751 n751Var) {
        a behavior;
        if (n751Var.a.o()) {
            return n751Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            if (childAt.getFitsSystemWindows() && (behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior()) != null) {
                n751Var = behavior.c(childAt, n751Var);
                if (n751Var.a.o()) {
                    return n751Var;
                }
            }
        }
        return n751Var;
    }

    private int distanceToBottom() {
        return getFullContentHeight() - getHeight();
    }

    private int distanceToTop() {
        return -getFullContentHeight();
    }

    private View findDeepestFocusedChild(View view) {
        while (true) {
            View view2 = null;
            if (view == null) {
                return null;
            }
            if (view.isFocused()) {
                return view;
            }
            if (view instanceof ViewGroup) {
                view2 = ((ViewGroup) view).getFocusedChild();
            }
            view = view2;
        }
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(int i, Rect rect, Rect rect2, LayoutParams layoutParams, int i2, int i3) {
        int absoluteGravity = Gravity.getAbsoluteGravity(resolveAnchoredChildGravity(layoutParams.gravity), i);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(resolveGravity(layoutParams.anchorGravity), i);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int i6 = absoluteGravity2 & 7;
        int i7 = absoluteGravity2 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    private int getFullContentHeight() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            i += childAt.getHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return i;
    }

    private int getKeyline(int i) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e(TAG, "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e(TAG, "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    private void getTopSortedChildren(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean hasDependencies(View view) {
        ycs0 ycs0Var = this.mChildDag.b;
        int i = ycs0Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = (ArrayList) ycs0Var.j(i2);
            if (arrayList != null && arrayList.contains(view)) {
                return true;
            }
        }
        return false;
    }

    private void layoutChild(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect acquireTempRect = acquireTempRect();
        acquireTempRect.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        if (this.mLastInsets != null) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                acquireTempRect.left = this.mLastInsets.b() + acquireTempRect.left;
                acquireTempRect.top = this.mLastInsets.d() + acquireTempRect.top;
                acquireTempRect.right -= this.mLastInsets.c();
                acquireTempRect.bottom -= this.mLastInsets.a();
            }
        }
        Rect acquireTempRect2 = acquireTempRect();
        Gravity.apply(resolveGravity(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), acquireTempRect, acquireTempRect2, i);
        view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
    }

    private void layoutChildWithAnchor(View view, View view2, int i) {
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, acquireTempRect);
            getDesiredAnchoredChildRect(view, i, acquireTempRect, acquireTempRect2);
            view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(resolveKeylineGravity(layoutParams.gravity), i2);
        int i3 = absoluteGravity & 7;
        int i4 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int keyline = getKeyline(i) - measuredWidth;
        if (i3 == 1) {
            keyline += measuredWidth / 2;
        } else if (i3 == 5) {
            keyline += measuredWidth;
        }
        int i5 = i4 != 16 ? i4 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private int lineDelta() {
        return (int) (getHeight() * 0.2f);
    }

    private boolean manuallyTriggersNestedScrollFromKeyEvent(View view, int i) {
        onStartNestedScroll(this, view, 2, 1);
        onNestedPreScroll(view, 0, i, this.mKeyTriggeredScrollConsumed, 1);
        int[] iArr = this.mKeyTriggeredScrollConsumed;
        int i2 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        onNestedScroll(view, 0, i2, 0, i, 1, iArr);
        onStopNestedScroll(view, 1);
        return this.mKeyTriggeredScrollConsumed[1] > 0;
    }

    private boolean moveVertically(int i) {
        return manuallyTriggersNestedScrollFromKeyEvent(findDeepestFocusedChild(this), i);
    }

    private MotionEvent obtainCancelEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    private void offsetChildByInset(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            a behavior = layoutParams.getBehavior();
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            acquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (behavior == null || !behavior.a(view, acquireTempRect)) {
                acquireTempRect.set(acquireTempRect2);
            } else if (!acquireTempRect2.contains(acquireTempRect)) {
                vm7.e("Rect should be within the child's bounds. Rect:", acquireTempRect.toShortString(), " | Bounds:", acquireTempRect2.toShortString());
                return;
            }
            releaseTempRect(acquireTempRect2);
            if (acquireTempRect.isEmpty()) {
                releaseTempRect(acquireTempRect);
                return;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.dodgeInsetEdges, i);
            boolean z3 = true;
            if ((absoluteGravity & 48) != 48 || (i6 = (acquireTempRect.top - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - layoutParams.mInsetOffsetY) >= (i7 = rect.top)) {
                z = false;
            } else {
                setInsetOffsetY(view, i7 - i6);
                z = true;
            }
            if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - acquireTempRect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + layoutParams.mInsetOffsetY) < (i5 = rect.bottom)) {
                setInsetOffsetY(view, height - i5);
                z = true;
            }
            if (!z) {
                setInsetOffsetY(view, 0);
            }
            if ((absoluteGravity & 3) != 3 || (i3 = (acquireTempRect.left - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - layoutParams.mInsetOffsetX) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                setInsetOffsetX(view, i4 - i3);
                z2 = true;
            }
            if ((absoluteGravity & 5) != 5 || (width = ((getWidth() - acquireTempRect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + layoutParams.mInsetOffsetX) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                setInsetOffsetX(view, width - i2);
            }
            if (!z3) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(acquireTempRect);
        }
    }

    private int pageDelta() {
        return getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(Extension.DOT_CHAR)) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = oyr.f('.', str2, str);
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<a>>> threadLocal = sConstructors;
            Map<String, Constructor<a>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<a> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            ny61.n("Could not inflate Behavior subclass ".concat(str), e);
            return null;
        }
    }

    private boolean performEvent(a aVar, View view, MotionEvent motionEvent, int i) {
        if (i == 0) {
            return aVar.h(this, view, motionEvent);
        }
        if (i == 1) {
            return aVar.t(this, view, motionEvent);
        }
        w511.q();
        return false;
    }

    private boolean performIntercept(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            a behavior = layoutParams.getBehavior();
            if (!(z || z2) || actionMasked == 0) {
                if (!z2 && !z && behavior != null && (z = performEvent(behavior, view, motionEvent, i))) {
                    this.mBehaviorTouchView = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i3 = 0; i3 < i2; i3++) {
                            View view2 = list.get(i3);
                            a behavior2 = ((LayoutParams) view2.getLayoutParams()).getBehavior();
                            if (behavior2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = obtainCancelEvent(motionEvent);
                                }
                                performEvent(behavior2, view2, motionEvent2, i);
                            }
                        }
                    }
                }
                boolean didBlockInteraction = layoutParams.didBlockInteraction();
                boolean isBlockingInteractionBelow = layoutParams.isBlockingInteractionBelow(this, view);
                z2 = isBlockingInteractionBelow && !didBlockInteraction;
                if (isBlockingInteractionBelow && !z2) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = obtainCancelEvent(motionEvent);
                }
                performEvent(behavior, view, motionEvent2, i);
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    private void prepareChildren() {
        this.mDependencySortedChildren.clear();
        elj eljVar = this.mChildDag;
        ycs0 ycs0Var = eljVar.b;
        int i = ycs0Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = (ArrayList) ycs0Var.j(i2);
            if (arrayList != null) {
                arrayList.clear();
                eljVar.a.a0(arrayList);
            }
        }
        ycs0Var.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            LayoutParams resolvedLayoutParams = getResolvedLayoutParams(childAt);
            resolvedLayoutParams.findAnchorView(this, childAt);
            ycs0 ycs0Var2 = this.mChildDag.b;
            if (!ycs0Var2.containsKey(childAt)) {
                ycs0Var2.put(childAt, null);
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                if (i4 != i3) {
                    View childAt2 = getChildAt(i4);
                    if (resolvedLayoutParams.dependsOn(this, childAt, childAt2)) {
                        if (!this.mChildDag.b.containsKey(childAt2)) {
                            ycs0 ycs0Var3 = this.mChildDag.b;
                            if (!ycs0Var3.containsKey(childAt2)) {
                                ycs0Var3.put(childAt2, null);
                            }
                        }
                        elj eljVar2 = this.mChildDag;
                        ycs0 ycs0Var4 = eljVar2.b;
                        if (!ycs0Var4.containsKey(childAt2) || !ycs0Var4.containsKey(childAt)) {
                            ny61.g("All nodes must be present in the graph before being added as an edge");
                            return;
                        }
                        ArrayList arrayList2 = (ArrayList) ycs0Var4.get(childAt2);
                        if (arrayList2 == null) {
                            ArrayList arrayList3 = (ArrayList) eljVar2.a.a();
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList2 = arrayList3;
                            ycs0Var4.put(childAt2, arrayList2);
                        }
                        arrayList2.add(childAt);
                    } else {
                        continue;
                    }
                }
            }
        }
        List<View> list = this.mDependencySortedChildren;
        elj eljVar3 = this.mChildDag;
        ArrayList arrayList4 = eljVar3.c;
        arrayList4.clear();
        HashSet hashSet = eljVar3.d;
        hashSet.clear();
        ycs0 ycs0Var5 = eljVar3.b;
        int i5 = ycs0Var5.c;
        for (int i6 = 0; i6 < i5; i6++) {
            eljVar3.a(ycs0Var5.f(i6), arrayList4, hashSet);
        }
        list.addAll(arrayList4);
        Collections.reverse(this.mDependencySortedChildren);
    }

    private static void releaseTempRect(Rect rect) {
        rect.setEmpty();
        sRectPool.a0(rect);
    }

    private void resetTouchBehaviors() {
        View view = this.mBehaviorTouchView;
        if (view != null) {
            a behavior = ((LayoutParams) view.getLayoutParams()).getBehavior();
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                behavior.t(this, this.mBehaviorTouchView, obtain);
                obtain.recycle();
            }
            this.mBehaviorTouchView = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((LayoutParams) getChildAt(i).getLayoutParams()).resetTouchBehaviorTracking();
        }
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    private static int resolveGravity(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int resolveKeylineGravity(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    private void setInsetOffsetX(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i2 = layoutParams.mInsetOffsetX;
        if (i2 != i) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            view.offsetLeftAndRight(i - i2);
            layoutParams.mInsetOffsetX = i;
        }
    }

    private void setInsetOffsetY(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i2 = layoutParams.mInsetOffsetY;
        if (i2 != i) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            view.offsetTopAndBottom(i - i2);
            layoutParams.mInsetOffsetY = i;
        }
    }

    private void setupForInsets() {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (!getFitsSystemWindows()) {
            ViewCompat$Api21Impl.o(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new sae(4, this);
        }
        ViewCompat$Api21Impl.o(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(1280);
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(View view) {
        ArrayList arrayList = (ArrayList) this.mChildDag.b.get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View view2 = (View) arrayList.get(i);
            a behavior = ((LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior != null) {
                behavior.e(this, view2, view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!dispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? moveVertically(-pageDelta()) : moveVertically(-lineDelta());
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? moveVertically(pageDelta()) : moveVertically(lineDelta());
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? moveVertically(distanceToTop()) : moveVertically(distanceToBottom());
            }
            if (keyCode == 92) {
                return moveVertically(-pageDelta());
            }
            if (keyCode == 93) {
                return moveVertically(pageDelta());
            }
            if (keyCode == 122) {
                return moveVertically(distanceToTop());
            }
            if (keyCode == 123) {
                return moveVertically(distanceToBottom());
            }
        }
        return dispatchKeyEvent;
    }

    public boolean doViewsOverlap(View view, View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect acquireTempRect = acquireTempRect();
        getChildRect(view, view.getParent() != this, acquireTempRect);
        Rect acquireTempRect2 = acquireTempRect();
        getChildRect(view2, view2.getParent() != this, acquireTempRect2);
        try {
            if (acquireTempRect.left <= acquireTempRect2.right && acquireTempRect.top <= acquireTempRect2.bottom && acquireTempRect.right >= acquireTempRect2.left) {
                if (acquireTempRect.bottom >= acquireTempRect2.top) {
                    z = true;
                }
            }
            return z;
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        a aVar = ((LayoutParams) view.getLayoutParams()).mBehavior;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (hasDependencies(getChildAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        if (z != this.mNeedsPreDrawListener) {
            if (z) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public void getChildRect(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> getDependencies(View view) {
        ycs0 ycs0Var = this.mChildDag.b;
        int i = ycs0Var.c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ycs0Var.j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ycs0Var.f(i2));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    public List<View> getDependents(View view) {
        ArrayList arrayList = (ArrayList) this.mChildDag.b.get(view);
        ArrayList arrayList2 = arrayList == null ? null : new ArrayList(arrayList);
        return arrayList2 == null ? Collections.EMPTY_LIST : arrayList2;
    }

    public void getDescendantRect(View view, Rect rect) {
        ThreadLocal threadLocal = rr31.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = rr31.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        rr31.a(this, view, matrix);
        ThreadLocal threadLocal3 = rr31.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(i, rect, rect2, layoutParams, measuredWidth, measuredHeight);
        constrainChildRect(layoutParams, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((LayoutParams) view.getLayoutParams()).getLastChildRect());
    }

    public final n751 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutParams getResolvedLayoutParams(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.mBehaviorResolved) {
            if (view instanceof androidx.coordinatorlayout.widget.a) {
                a behavior = ((androidx.coordinatorlayout.widget.a) view).getBehavior();
                if (behavior == null) {
                    Log.e(TAG, "Attached behavior class is null");
                }
                layoutParams.setBehavior(behavior);
                layoutParams.mBehaviorResolved = true;
                return layoutParams;
            }
            b bVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                bVar = (b) cls.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    layoutParams.setBehavior((a) bVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e(TAG, "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            layoutParams.mBehaviorResolved = true;
        }
        return layoutParams;
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public boolean isPointInChildBounds(View view, int i, int i2) {
        Rect acquireTempRect = acquireTempRect();
        getDescendantRect(view, acquireTempRect);
        try {
            return acquireTempRect.contains(i, i2);
        } finally {
            releaseTempRect(acquireTempRect);
        }
    }

    public void offsetChildToAnchor(View view, int i) {
        a behavior;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.mAnchorView != null) {
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            Rect acquireTempRect3 = acquireTempRect();
            getDescendantRect(layoutParams.mAnchorView, acquireTempRect);
            getChildRect(view, false, acquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(i, acquireTempRect, acquireTempRect3, layoutParams, measuredWidth, measuredHeight);
            boolean z = (acquireTempRect3.left == acquireTempRect2.left && acquireTempRect3.top == acquireTempRect2.top) ? false : true;
            constrainChildRect(layoutParams, acquireTempRect3, measuredWidth, measuredHeight);
            int i2 = acquireTempRect3.left - acquireTempRect2.left;
            int i3 = acquireTempRect3.top - acquireTempRect2.top;
            if (i2 != 0) {
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                view.offsetLeftAndRight(i2);
            }
            if (i3 != 0) {
                WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                view.offsetTopAndBottom(i3);
            }
            if (z && (behavior = layoutParams.getBehavior()) != null) {
                behavior.e(this, view, layoutParams.mAnchorView);
            }
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
            releaseTempRect(acquireTempRect3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors();
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            if (getFitsSystemWindows()) {
                np31.c(this);
            }
        }
        this.mIsAttachedToWindow = true;
    }

    public final void onChildViewsChanged(int i) {
        boolean z;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        Rect acquireTempRect3 = acquireTempRect();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.mDependencySortedChildren.get(i2);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (layoutParams.mAnchorDirectChild == this.mDependencySortedChildren.get(i3)) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                getChildRect(view, true, acquireTempRect2);
                if (layoutParams.insetEdge != 0 && !acquireTempRect2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.insetEdge, layoutDirection);
                    int i4 = absoluteGravity & 112;
                    if (i4 == 48) {
                        acquireTempRect.top = Math.max(acquireTempRect.top, acquireTempRect2.bottom);
                    } else if (i4 == 80) {
                        acquireTempRect.bottom = Math.max(acquireTempRect.bottom, getHeight() - acquireTempRect2.top);
                    }
                    int i5 = absoluteGravity & 7;
                    if (i5 == 3) {
                        acquireTempRect.left = Math.max(acquireTempRect.left, acquireTempRect2.right);
                    } else if (i5 == 5) {
                        acquireTempRect.right = Math.max(acquireTempRect.right, getWidth() - acquireTempRect2.left);
                    }
                }
                if (layoutParams.dodgeInsetEdges != 0 && view.getVisibility() == 0) {
                    offsetChildByInset(view, acquireTempRect, layoutDirection);
                }
                if (i != 2) {
                    getLastChildRect(view, acquireTempRect3);
                    if (!acquireTempRect3.equals(acquireTempRect2)) {
                        recordLastChildRect(view, acquireTempRect2);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.mDependencySortedChildren.get(i6);
                    LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                    a behavior = layoutParams2.getBehavior();
                    if (behavior != null && behavior.b(view2, view)) {
                        if (i == 0 && layoutParams2.getChangedAfterNestedScroll()) {
                            layoutParams2.resetChangedAfterNestedScroll();
                        } else {
                            if (i != 2) {
                                z = behavior.e(this, view2, view);
                            } else {
                                behavior.f(this, view);
                                z = true;
                            }
                            if (i == 1) {
                                layoutParams2.setChangedAfterNestedScroll(z);
                            }
                        }
                    }
                }
            }
        }
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
        releaseTempRect(acquireTempRect3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors();
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        n751 n751Var = this.mLastInsets;
        int d = n751Var != null ? n751Var.d() : 0;
        if (d > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), d);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors();
        }
        boolean performIntercept = performIntercept(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return performIntercept;
        }
        this.mBehaviorTouchView = null;
        resetTouchBehaviors();
        return performIntercept;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a behavior;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.mDependencySortedChildren.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((LayoutParams) view.getLayoutParams()).getBehavior()) == null || !behavior.i(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    public void onLayoutChild(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.checkAnchorChanged()) {
            ny61.r("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        View view2 = layoutParams.mAnchorView;
        if (view2 != null) {
            layoutChildWithAnchor(view, view2, i);
            return;
        }
        int i2 = layoutParams.keyline;
        if (i2 >= 0) {
            layoutChildWithKeyline(view, i2, i);
        } else {
            layoutChild(view, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        int size;
        int i3;
        LayoutParams layoutParams;
        int i4;
        int i5;
        int i6;
        a behavior;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        View view;
        LayoutParams layoutParams2;
        int i13;
        int i14;
        int i15;
        int i16;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.prepareChildren();
        coordinatorLayout.ensurePreDrawListener();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z2 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int i17 = paddingLeft + paddingRight;
        int i18 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        if (coordinatorLayout.mLastInsets != null) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            if (coordinatorLayout.getFitsSystemWindows()) {
                z = true;
                size = coordinatorLayout.mDependencySortedChildren.size();
                i3 = 0;
                int i19 = 0;
                while (i3 < size) {
                    View view2 = coordinatorLayout.mDependencySortedChildren.get(i3);
                    int i20 = suggestedMinimumWidth;
                    int i21 = suggestedMinimumHeight;
                    if (view2.getVisibility() == 8) {
                        i13 = size;
                        i8 = i3;
                        i9 = layoutDirection;
                        suggestedMinimumWidth = i20;
                        suggestedMinimumHeight = i21;
                        i7 = paddingLeft;
                        i12 = paddingRight;
                    } else {
                        LayoutParams layoutParams3 = (LayoutParams) view2.getLayoutParams();
                        int i22 = layoutParams3.keyline;
                        if (i22 < 0 || mode == 0) {
                            layoutParams = layoutParams3;
                        } else {
                            int keyline = coordinatorLayout.getKeyline(i22);
                            int absoluteGravity = Gravity.getAbsoluteGravity(resolveKeylineGravity(layoutParams3.gravity), layoutDirection) & 7;
                            layoutParams = layoutParams3;
                            if ((absoluteGravity == 3 && !z2) || (absoluteGravity == 5 && z2)) {
                                i4 = Math.max(0, (size2 - paddingRight) - keyline);
                            } else if ((absoluteGravity == 5 && !z2) || (absoluteGravity == 3 && z2)) {
                                i4 = Math.max(0, keyline - paddingLeft);
                            }
                            if (z) {
                                WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                                if (!view2.getFitsSystemWindows()) {
                                    int c = coordinatorLayout.mLastInsets.c() + coordinatorLayout.mLastInsets.b();
                                    int a2 = coordinatorLayout.mLastInsets.a() + coordinatorLayout.mLastInsets.d();
                                    i5 = View.MeasureSpec.makeMeasureSpec(size2 - c, mode);
                                    i6 = View.MeasureSpec.makeMeasureSpec(size3 - a2, mode2);
                                    behavior = layoutParams.getBehavior();
                                    i7 = paddingLeft;
                                    if (behavior != null) {
                                        i8 = i3;
                                        int i23 = i4;
                                        layoutParams2 = layoutParams;
                                        i13 = size;
                                        int i24 = i5;
                                        i9 = layoutDirection;
                                        i10 = i21;
                                        i12 = paddingRight;
                                        i14 = i19;
                                        int i25 = i6;
                                        boolean j = behavior.j(this, view2, i24, i23, i25);
                                        view = view2;
                                        i16 = i24;
                                        i15 = i23;
                                        i11 = i25;
                                        if (j) {
                                            coordinatorLayout = this;
                                            int max = Math.max(i20, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                                            int max2 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                                            i19 = View.combineMeasuredStates(i14, view.getMeasuredState());
                                            suggestedMinimumWidth = max;
                                            suggestedMinimumHeight = max2;
                                        }
                                    } else {
                                        i8 = i3;
                                        i9 = layoutDirection;
                                        i10 = i21;
                                        i11 = i6;
                                        i12 = paddingRight;
                                        view = view2;
                                        layoutParams2 = layoutParams;
                                        i13 = size;
                                        i14 = i19;
                                        i15 = i4;
                                        i16 = i5;
                                    }
                                    coordinatorLayout = this;
                                    coordinatorLayout.onMeasureChild(view, i16, i15, i11, 0);
                                    int max3 = Math.max(i20, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                                    int max22 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                                    i19 = View.combineMeasuredStates(i14, view.getMeasuredState());
                                    suggestedMinimumWidth = max3;
                                    suggestedMinimumHeight = max22;
                                }
                            }
                            i5 = i;
                            i6 = i2;
                            behavior = layoutParams.getBehavior();
                            i7 = paddingLeft;
                            if (behavior != null) {
                            }
                            coordinatorLayout = this;
                            coordinatorLayout.onMeasureChild(view, i16, i15, i11, 0);
                            int max32 = Math.max(i20, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                            int max222 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                            i19 = View.combineMeasuredStates(i14, view.getMeasuredState());
                            suggestedMinimumWidth = max32;
                            suggestedMinimumHeight = max222;
                        }
                        i4 = 0;
                        if (z) {
                        }
                        i5 = i;
                        i6 = i2;
                        behavior = layoutParams.getBehavior();
                        i7 = paddingLeft;
                        if (behavior != null) {
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.onMeasureChild(view, i16, i15, i11, 0);
                        int max322 = Math.max(i20, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        int max2222 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                        i19 = View.combineMeasuredStates(i14, view.getMeasuredState());
                        suggestedMinimumWidth = max322;
                        suggestedMinimumHeight = max2222;
                    }
                    i3 = i8 + 1;
                    paddingLeft = i7;
                    paddingRight = i12;
                    layoutDirection = i9;
                    size = i13;
                }
                int i26 = i19;
                coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i26), View.resolveSizeAndState(suggestedMinimumHeight, i2, i26 << 16));
            }
        }
        z = false;
        size = coordinatorLayout.mDependencySortedChildren.size();
        i3 = 0;
        int i192 = 0;
        while (i3 < size) {
        }
        int i262 = i192;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i262), View.resolveSizeAndState(suggestedMinimumHeight, i2, i262 << 16));
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(0)) {
                    layoutParams.getBehavior();
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        a behavior;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(0) && (behavior = layoutParams.getBehavior()) != null) {
                    z |= behavior.k(f, f2, view);
                }
            }
        }
        return z;
    }

    @Override // defpackage.tn50
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        a behavior;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(i3) && (behavior = layoutParams.getBehavior()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.l(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // defpackage.un50
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        a behavior;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(i5) && (behavior = layoutParams.getBehavior()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.n(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i7 = i4 > 0 ? Math.max(i7, iArr4[1]) : Math.min(i7, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // defpackage.tn50
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        vn50 vn50Var = this.mNestedScrollingParentHelper;
        if (i2 == 1) {
            vn50Var.b = i;
        } else {
            vn50Var.a = i;
        }
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
            if (layoutParams.isNestedScrollAccepted(i2)) {
                layoutParams.getBehavior();
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.behaviorStates;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            a behavior = getResolvedLayoutParams(childAt).getBehavior();
            if (id != -1 && behavior != null && (parcelable2 = sparseArray.get(id)) != null) {
                behavior.p(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable q;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            a behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (id != -1 && behavior != null && (q = behavior.q(childAt)) != null) {
                sparseArray.append(id, q);
            }
        }
        savedState.behaviorStates = sparseArray;
        return savedState;
    }

    @Override // defpackage.tn50
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                a behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    boolean r = behavior.r(this, childAt, view, view2, i, i2);
                    z |= r;
                    layoutParams.setNestedScrollAccepted(i2, r);
                } else {
                    layoutParams.setNestedScrollAccepted(i2, false);
                }
            }
        }
        return z;
    }

    @Override // defpackage.tn50
    public void onStopNestedScroll(View view, int i) {
        vn50 vn50Var = this.mNestedScrollingParentHelper;
        if (i == 1) {
            vn50Var.b = 0;
        } else {
            vn50Var.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.isNestedScrollAccepted(i)) {
                a behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    behavior.s(this, childAt, view, i);
                }
                layoutParams.resetNestedScroll(i);
                layoutParams.resetChangedAfterNestedScroll();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean performIntercept;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.mBehaviorTouchView;
        boolean z = false;
        if (view != null) {
            a behavior = ((LayoutParams) view.getLayoutParams()).getBehavior();
            performIntercept = behavior != null ? behavior.t(this, this.mBehaviorTouchView, motionEvent) : false;
        } else {
            performIntercept = performIntercept(motionEvent, 1);
            if (actionMasked != 0 && performIntercept) {
                z = true;
            }
        }
        if (this.mBehaviorTouchView == null || actionMasked == 3) {
            performIntercept |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent obtainCancelEvent = obtainCancelEvent(motionEvent);
            super.onTouchEvent(obtainCancelEvent);
            obtainCancelEvent.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return performIntercept;
        }
        this.mBehaviorTouchView = null;
        resetTouchBehaviors();
        return performIntercept;
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((LayoutParams) view.getLayoutParams()).setLastChildRect(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        a behavior = ((LayoutParams) view.getLayoutParams()).getBehavior();
        if (behavior == null || !behavior.o(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.mDisallowInterceptReset) {
            return;
        }
        if (this.mBehaviorTouchView == null) {
            cancelInterceptBehaviors();
        }
        resetTouchBehaviors();
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        setupForInsets();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                im91.i(this.mStatusBarBackground, getLayoutDirection());
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.mStatusBarBackground.setVisible(z, false);
    }

    public final n751 setWindowInsets(n751 n751Var) {
        if (Objects.equals(this.mLastInsets, n751Var)) {
            return n751Var;
        }
        this.mLastInsets = n751Var;
        boolean z = false;
        boolean z2 = n751Var != null && n751Var.d() > 0;
        this.mDrawStatusBarBackground = z2;
        if (!z2 && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        n751 dispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(n751Var);
        requestLayout();
        return dispatchApplyWindowInsetsToBehaviors;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.1
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
        SparseArray<Parcelable> behaviorStates;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.behaviorStates = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.behaviorStates.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.behaviorStates;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.behaviorStates.keyAt(i2);
                parcelableArr[i2] = this.behaviorStates.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int anchorGravity;
        public int dodgeInsetEdges;
        public int gravity;
        public int insetEdge;
        public int keyline;
        View mAnchorDirectChild;
        int mAnchorId;
        View mAnchorView;
        a mBehavior;
        boolean mBehaviorResolved;
        Object mBehaviorTag;
        private boolean mDidAcceptNestedScrollNonTouch;
        private boolean mDidAcceptNestedScrollTouch;
        private boolean mDidBlockInteraction;
        private boolean mDidChangeAfterNestedScroll;
        int mInsetOffsetX;
        int mInsetOffsetY;
        final Rect mLastChildRect;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i4i0.CoordinatorLayout_Layout);
            this.gravity = obtainStyledAttributes.getInteger(i4i0.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.mAnchorId = obtainStyledAttributes.getResourceId(i4i0.CoordinatorLayout_Layout_layout_anchor, -1);
            this.anchorGravity = obtainStyledAttributes.getInteger(i4i0.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.keyline = obtainStyledAttributes.getInteger(i4i0.CoordinatorLayout_Layout_layout_keyline, -1);
            this.insetEdge = obtainStyledAttributes.getInt(i4i0.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.dodgeInsetEdges = obtainStyledAttributes.getInt(i4i0.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(i4i0.CoordinatorLayout_Layout_layout_behavior);
            this.mBehaviorResolved = hasValue;
            if (hasValue) {
                this.mBehavior = CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(i4i0.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            a aVar = this.mBehavior;
            if (aVar != null) {
                aVar.d(this);
            }
        }

        private void resolveAnchorView(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.mAnchorId);
            this.mAnchorView = findViewById;
            if (findViewById == null) {
                if (!coordinatorLayout.isInEditMode()) {
                    yci0.o("Could not find CoordinatorLayout descendant view with id ", coordinatorLayout.getResources().getResourceName(this.mAnchorId), " to anchor view ", view);
                    return;
                } else {
                    this.mAnchorDirectChild = null;
                    this.mAnchorView = null;
                    return;
                }
            }
            if (findViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    ny61.r("View can not be anchored to the the parent CoordinatorLayout");
                    return;
                } else {
                    this.mAnchorDirectChild = null;
                    this.mAnchorView = null;
                    return;
                }
            }
            for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        ny61.r("Anchor must not be a descendant of the anchored view");
                        return;
                    } else {
                        this.mAnchorDirectChild = null;
                        this.mAnchorView = null;
                        return;
                    }
                }
                if (parent instanceof View) {
                    findViewById = parent;
                }
            }
            this.mAnchorDirectChild = findViewById;
        }

        private boolean shouldDodge(View view, int i) {
            int absoluteGravity = Gravity.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).insetEdge, i);
            return absoluteGravity != 0 && (Gravity.getAbsoluteGravity(this.dodgeInsetEdges, i) & absoluteGravity) == absoluteGravity;
        }

        private boolean verifyAnchorView(View view, CoordinatorLayout coordinatorLayout) {
            if (this.mAnchorView.getId() != this.mAnchorId) {
                return false;
            }
            View view2 = this.mAnchorView;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.mAnchorDirectChild = null;
                    this.mAnchorView = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.mAnchorDirectChild = view2;
            return true;
        }

        public boolean checkAnchorChanged() {
            return this.mAnchorView == null && this.mAnchorId != -1;
        }

        public boolean dependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.mAnchorDirectChild || shouldDodge(view2, coordinatorLayout.getLayoutDirection())) {
                return true;
            }
            a aVar = this.mBehavior;
            return aVar != null && aVar.b(view, view2);
        }

        public boolean didBlockInteraction() {
            if (this.mBehavior == null) {
                this.mDidBlockInteraction = false;
            }
            return this.mDidBlockInteraction;
        }

        public View findAnchorView(CoordinatorLayout coordinatorLayout, View view) {
            if (this.mAnchorId == -1) {
                this.mAnchorDirectChild = null;
                this.mAnchorView = null;
                return null;
            }
            if (this.mAnchorView == null || !verifyAnchorView(view, coordinatorLayout)) {
                resolveAnchorView(view, coordinatorLayout);
            }
            return this.mAnchorView;
        }

        public int getAnchorId() {
            return this.mAnchorId;
        }

        public a getBehavior() {
            return this.mBehavior;
        }

        public boolean getChangedAfterNestedScroll() {
            return this.mDidChangeAfterNestedScroll;
        }

        public Rect getLastChildRect() {
            return this.mLastChildRect;
        }

        public void invalidateAnchor() {
            this.mAnchorDirectChild = null;
            this.mAnchorView = null;
        }

        public boolean isBlockingInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.mDidBlockInteraction;
            if (z) {
                return true;
            }
            a aVar = this.mBehavior;
            if (aVar != null) {
                aVar.getClass();
            }
            this.mDidBlockInteraction = z;
            return z;
        }

        public boolean isNestedScrollAccepted(int i) {
            if (i == 0) {
                return this.mDidAcceptNestedScrollTouch;
            }
            if (i != 1) {
                return false;
            }
            return this.mDidAcceptNestedScrollNonTouch;
        }

        public void resetChangedAfterNestedScroll() {
            this.mDidChangeAfterNestedScroll = false;
        }

        public void resetNestedScroll(int i) {
            setNestedScrollAccepted(i, false);
        }

        public void resetTouchBehaviorTracking() {
            this.mDidBlockInteraction = false;
        }

        public void setAnchorId(int i) {
            invalidateAnchor();
            this.mAnchorId = i;
        }

        public void setBehavior(a aVar) {
            a aVar2 = this.mBehavior;
            if (aVar2 != aVar) {
                if (aVar2 != null) {
                    aVar2.g();
                }
                this.mBehavior = aVar;
                this.mBehaviorTag = null;
                this.mBehaviorResolved = true;
                if (aVar != null) {
                    aVar.d(this);
                }
            }
        }

        public void setChangedAfterNestedScroll(boolean z) {
            this.mDidChangeAfterNestedScroll = z;
        }

        public void setLastChildRect(Rect rect) {
            this.mLastChildRect.set(rect);
        }

        public void setNestedScrollAccepted(int i, boolean z) {
            if (i == 0) {
                this.mDidAcceptNestedScrollTouch = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.mDidAcceptNestedScrollNonTouch = z;
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // defpackage.tn50
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bog0.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }
}
