package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: ButtonsSwipeView.kt */
/* loaded from: classes6.dex */
public final class ps8 extends HorizontalScrollView {
    public final bpn0 b;
    public int c;
    public final int d;
    public boolean e;
    public int f;
    public boolean g;
    public final ArrayList<a> h;
    public boolean i;
    public final Rect j;
    public final GestureDetector k;
    public final LinearLayout l;
    public View m;
    public final ArrayList<View> n;
    public final ArrayList<View> o;
    public int p;
    public int q;

    /* compiled from: ButtonsSwipeView.kt */
    public interface a {
        void a(int i, int i2, View view);

        void c();
    }

    public ps8(Context context) {
        super(context, null, 0);
        this.b = new bpn0(new uz(2));
        this.c = -1;
        this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f = -1;
        this.g = true;
        this.h = new ArrayList<>();
        this.j = new Rect();
        this.k = new GestureDetector(context, new qs8(this));
        LinearLayout a2 = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
        this.l = a2;
        this.n = new ArrayList<>(2);
        this.o = new ArrayList<>(2);
        addView(a2);
    }

    private final VelocityTracker getVelocityTracker() {
        return (VelocityTracker) this.b.getValue();
    }

    public final void a() {
        ArrayList<a> arrayList = this.h;
        if (arrayList == null || arrayList == null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).c();
            }
        } else {
            Iterator<a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().c();
            }
        }
    }

    public final LinearLayout getContainer() {
        return this.l;
    }

    public final int getContentMeasuredWidth() {
        View view = this.m;
        if (view != null) {
            return view.getMeasuredWidth();
        }
        return 0;
    }

    public final int getEndMeasuredWidth() {
        return this.q;
    }

    public final int getInitialScrollOffset() {
        return this.p;
    }

    public final int getLeftMeasuredWidth() {
        return this.p;
    }

    public final int getMaxEndScrollOffset() {
        return this.p + this.q;
    }

    public final int getMaxLeftScrollOffset() {
        return getMaxStartScrollOffset();
    }

    public final int getMaxRightScrollOffset() {
        return getMaxEndScrollOffset();
    }

    public final int getMaxStartScrollOffset() {
        return 0;
    }

    public final int getRightMeasuredWidth() {
        return this.q;
    }

    public final ArrayList<View> getRightViews() {
        return this.o;
    }

    public final int getStartMeasuredWidth() {
        return this.p;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.g) {
            return false;
        }
        boolean z2 = motionEvent.getPointerId(0) != 0;
        this.e = z2;
        if (z2) {
            return true;
        }
        if (motionEvent.getActionMasked() == 0 && getScrollX() != getInitialScrollOffset()) {
            View view = this.m;
            Rect rect = this.j;
            if (view != null) {
                view.getGlobalVisibleRect(rect);
            }
            z = rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        this.i = z;
        if (z) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        scrollTo(getInitialScrollOffset(), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072 A[LOOP:0: B:16:0x006c->B:18:0x0072, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[LOOP:1: B:21:0x0086->B:23:0x008c, LOOP_END] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int max;
        View view;
        Iterator<T> it;
        Iterator<T> it2;
        ViewGroup.LayoutParams layoutParams;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int mode = View.MeasureSpec.getMode(i);
        int i3 = 0;
        int max2 = Math.max(0, Math.min(View.MeasureSpec.getSize(i), 1073741823));
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                max = Math.max(0, Integer.MAX_VALUE - paddingRight);
                view = this.m;
                if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                    layoutParams.width = max;
                }
                super.onMeasure(i, i2);
                it = this.n.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    i4 += ((View) it.next()).getMeasuredWidth();
                }
                this.p = i4;
                it2 = this.o.iterator();
                while (it2.hasNext()) {
                    i3 += ((View) it2.next()).getMeasuredWidth();
                }
                this.q = i3;
            }
            if (mode != 1073741824) {
                throw new IllegalArgumentException(lhg.a(mode, "Unknown specMode: "));
            }
        }
        max = max2 < suggestedMinimumWidth ? Math.max(0, suggestedMinimumWidth - paddingRight) : max2 > Integer.MAX_VALUE ? Math.max(0, Integer.MAX_VALUE - paddingRight) : Math.max(0, max2 - paddingRight);
        view = this.m;
        if (view != null) {
            layoutParams.width = max;
        }
        super.onMeasure(i, i2);
        it = this.n.iterator();
        int i42 = 0;
        while (it.hasNext()) {
        }
        this.p = i42;
        it2 = this.o.iterator();
        while (it2.hasNext()) {
        }
        this.q = i3;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i3 != this.f) {
            ArrayList<a> arrayList = this.h;
            if (arrayList != null) {
                Iterator<a> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().a(i, i3, this);
                }
            } else {
                Iterator<a> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().a(i, i3, this);
                }
            }
        }
        this.f = i3;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e || (this.i && this.k.onTouchEvent(motionEvent))) {
            return true;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            Rect rect = this.j;
            if (actionMasked == 1) {
                getVelocityTracker().addMovement(obtain);
                getVelocityTracker().computeCurrentVelocity(1000, this.d);
                if ((-getVelocityTracker().getXVelocity(this.c)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    a();
                }
                rect.setEmpty();
                this.i = false;
                getVelocityTracker().clear();
                a();
                obtain.recycle();
                return super.onTouchEvent(motionEvent);
            }
            if (actionMasked == 3) {
                rect.setEmpty();
                this.i = false;
                getVelocityTracker().clear();
                a();
                a();
            } else if (actionMasked == 5) {
                this.c = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                int actionIndex2 = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex2) == this.c) {
                    this.c = motionEvent.getPointerId(actionIndex2 != 0 ? 0 : 1);
                }
            }
        } else {
            this.c = motionEvent.getPointerId(0);
        }
        getVelocityTracker().addMovement(obtain);
        obtain.recycle();
        return super.onTouchEvent(motionEvent);
    }

    public final void setContentView(View view) {
        View view2 = this.m;
        LinearLayout linearLayout = this.l;
        if (view2 != null) {
            linearLayout.removeView(view2);
        }
        if (view != null) {
            this.m = view;
            linearLayout.addView(view, this.n.size());
        }
    }

    public final void setRightViews(List<? extends View> list) {
        LinearLayout linearLayout = this.l;
        ArrayList<View> arrayList = this.o;
        if (arrayList == null || arrayList == null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                linearLayout.removeView((View) it.next());
            }
        } else {
            Iterator<View> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linearLayout.removeView(it2.next());
            }
        }
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list != null) {
            List<? extends View> list2 = list;
            if (list2 instanceof RandomAccess) {
                Iterator<? extends View> it3 = list2.iterator();
                while (it3.hasNext()) {
                    linearLayout.addView(it3.next());
                }
            } else {
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    linearLayout.addView((View) it4.next());
                }
            }
        }
    }

    public final void setViewScrollable(boolean z) {
        this.g = z;
    }
}
