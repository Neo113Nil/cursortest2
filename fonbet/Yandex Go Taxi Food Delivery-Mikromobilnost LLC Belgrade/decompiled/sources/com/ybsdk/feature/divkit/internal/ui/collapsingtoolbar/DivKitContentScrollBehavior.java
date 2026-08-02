package com.ybsdk.feature.divkit.internal.ui.collapsingtoolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.c6w;
import defpackage.x43;
import defpackage.y6i0;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/ui/collapsingtoolbar/DivKitContentScrollBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivKitContentScrollBehavior extends AppBarLayout.ScrollingViewBehavior {
    public final int A;
    public final int B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public VelocityTracker G;
    public WeakReference H;
    public final int z;

    public DivKitContentScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.B = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static boolean B(float f, float f2, View view) {
        boolean z;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            Iterable i = y6i0.i(viewGroup.getChildCount() - 1, 0);
            if (!(i instanceof Collection) || !((Collection) i).isEmpty()) {
                c6w it = i.iterator();
                while (it.c) {
                    View childAt = viewGroup.getChildAt(it.nextInt());
                    float left = f - childAt.getLeft();
                    float top = f2 - childAt.getTop();
                    if (left >= 0.0f && left < childAt.getWidth() && top >= 0.0f && top < childAt.getHeight() && B(left, top, childAt)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        return view.isClickable() || z;
    }

    public final RecyclerView A(View view) {
        WeakReference weakReference = this.H;
        RecyclerView recyclerView = weakReference != null ? (RecyclerView) weakReference.get() : null;
        if (recyclerView != null && recyclerView.isAttachedToWindow()) {
            return recyclerView;
        }
        x43 x43Var = new x43();
        x43Var.addLast(view);
        RecyclerView recyclerView2 = null;
        while (!x43Var.isEmpty() && recyclerView2 == null) {
            View view2 = (View) x43Var.removeFirst();
            if (view2 instanceof RecyclerView) {
                recyclerView2 = (RecyclerView) view2;
            } else if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    x43Var.addLast(viewGroup.getChildAt(i));
                }
            }
        }
        this.H = recyclerView2 != null ? new WeakReference(recyclerView2) : null;
        return recyclerView2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r1 != 3) goto L58;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        RecyclerView A = A(view);
        if (A != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        VelocityTracker velocityTracker = this.G;
                        if (velocityTracker != null) {
                            velocityTracker.addMovement(motionEvent);
                        }
                        if (this.F) {
                            return true;
                        }
                        if (this.E) {
                            float abs = Math.abs(motionEvent.getX() - this.C);
                            float abs2 = Math.abs(motionEvent.getY() - this.D);
                            float f = this.z;
                            boolean z = abs2 > f && abs2 >= abs;
                            WeakHashMap weakHashMap = b.a;
                            A.hasNestedScrollingParent(0);
                            if (z) {
                                this.F = true;
                                this.D = motionEvent.getY();
                                A.startNestedScroll(2, 0);
                                return true;
                            }
                            if (abs > f) {
                                this.E = false;
                                return false;
                            }
                        }
                    }
                }
                this.E = false;
                this.F = false;
                VelocityTracker velocityTracker2 = this.G;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                }
                this.G = null;
                return false;
            }
            this.E = false;
            this.F = false;
            VelocityTracker velocityTracker3 = this.G;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.G = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            View view2 = A;
            int i = 0;
            int i2 = 0;
            while (view2 != coordinatorLayout) {
                i += view2.getLeft();
                i2 += view2.getTop();
                Object parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
                if (view2 == null) {
                    break;
                }
            }
            Pair pair = new Pair(Float.valueOf(motionEvent.getX() - i), Float.valueOf(motionEvent.getY() - i2));
            float floatValue = ((Number) pair.getFirst()).floatValue();
            float floatValue2 = ((Number) pair.getSecond()).floatValue();
            View findChildViewUnder = A.findChildViewUnder(floatValue, floatValue2);
            if (findChildViewUnder == null || !B(floatValue - findChildViewUnder.getLeft(), floatValue2 - findChildViewUnder.getTop(), findChildViewUnder)) {
                this.E = true;
                this.C = motionEvent.getX();
                this.D = motionEvent.getY();
                return false;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        RecyclerView A = A(view);
        if (A == null) {
            return false;
        }
        VelocityTracker velocityTracker = this.G;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.G;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(1000, this.B);
                int i = -((int) velocityTracker2.getYVelocity());
                if (Math.abs(i) >= this.A) {
                    A.fling(0, i);
                }
                velocityTracker2.recycle();
                this.G = null;
            }
            this.F = false;
            WeakHashMap weakHashMap = b.a;
            A.stopNestedScroll(0);
            return true;
        }
        if (actionMasked == 2) {
            WeakHashMap weakHashMap2 = b.a;
            A.startNestedScroll(2, 0);
            int y = (int) (this.D - motionEvent.getY());
            this.D = motionEvent.getY();
            int[] iArr = new int[2];
            A.dispatchNestedPreScroll(0, y, iArr, null, 0);
            A.scrollBy(0, y - iArr[1]);
            return true;
        }
        if (actionMasked != 3) {
            return true;
        }
        VelocityTracker velocityTracker3 = this.G;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
        }
        this.G = null;
        this.F = false;
        WeakHashMap weakHashMap3 = b.a;
        A.stopNestedScroll(0);
        return true;
    }
}
