package xsna;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cv9;
import xsna.dpr;
import xsna.qor;

/* compiled from: FlexLayoutCarouselDragListener.kt */
/* loaded from: classes18.dex */
public final class xor implements dpr {
    public final qor b;
    public final qor.f c;
    public float h;
    public boolean i;
    public float j;
    public float k;
    public final int m;
    public final int n;
    public ViewPropertyAnimator p;
    public View q;
    public final cv9 t;
    public final mkc0 d = new mkc0(new pff(this, 21), new fbh(this, 16));
    public int e = -1;
    public int f = -2;
    public int g = -1;
    public final int l = 1;
    public a o = a.C4030a.a;
    public final Handler r = new Handler(Looper.getMainLooper());
    public final zor s = new zor(this);

    /* compiled from: FlexLayoutCarouselDragListener.kt */
    public static abstract class a {

        /* compiled from: FlexLayoutCarouselDragListener.kt */
        /* renamed from: xsna.xor$a$a, reason: collision with other inner class name */
        public static final class C4030a extends a {
            public static final C4030a a = new C4030a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4030a);
            }

            public final int hashCode() {
                return 283760577;
            }

            public final String toString() {
                return "Left";
            }
        }

        /* compiled from: FlexLayoutCarouselDragListener.kt */
        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 212304290;
            }

            public final String toString() {
                return "Right";
            }
        }
    }

    public xor(qor qorVar, qor.f fVar, myh myhVar) {
        this.b = qorVar;
        this.c = fVar;
        this.m = ((Number) myhVar.invoke()).intValue() / 4;
        this.n = (((Number) myhVar.invoke()).intValue() * 3) / 4;
        this.t = new cv9(qorVar, this);
    }

    public final void a(boolean z) {
        ViewPropertyAnimator animate;
        int i = 0;
        while (true) {
            qor qorVar = this.b;
            if (i >= qorVar.getChildCount()) {
                return;
            }
            int i2 = i + 1;
            View findViewById = qorVar.getChildAt(i).findViewById(R.id.posting_attachment_holder_remove);
            if (findViewById != null && (animate = findViewById.animate()) != null) {
                ViewPropertyAnimator alpha = animate.alpha(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (alpha != null) {
                    this.d.getClass();
                    ViewPropertyAnimator duration = alpha.setDuration(100L);
                    if (duration != null) {
                        duration.start();
                    }
                }
            }
            i = i2;
        }
    }

    public final int b(float f, float f2) {
        Rect rect = new Rect();
        qor qorVar = this.b;
        int childCount = qorVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = qorVar.getChildAt(i);
            rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            if (rect.contains(an10.b(f), an10.b(f2))) {
                return i;
            }
        }
        return -1;
    }

    public final boolean c(View view) {
        if (view != null) {
            qor qorVar = this.b;
            if (!qorVar.g) {
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                mkc0 mkc0Var = this.d;
                if (viewGroup != null) {
                    qorVar.requestDisallowInterceptTouchEvent(true);
                    view.performHapticFeedback(25);
                    a(false);
                    this.e = viewGroup.indexOfChild(view);
                    this.h = this.j;
                    this.i = false;
                    this.q = view;
                    ViewParent parent2 = qorVar.getParent();
                    yfc0 yfc0Var = parent2 instanceof yfc0 ? (yfc0) parent2 : null;
                    if (yfc0Var != null) {
                        yfc0Var.getScrollX();
                    }
                    mkc0Var.f(mkc0Var.b(view), false);
                    qorVar.requestLayout();
                }
                View[] d = awt0.d(qorVar);
                ArrayList arrayList = new ArrayList();
                for (View view2 : d) {
                    if (!epx.f(view2, view)) {
                        arrayList.add(view2);
                    }
                }
                mkc0Var.d(arrayList);
                return true;
            }
        }
        return false;
    }

    @Override // xsna.dpr
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View childAt;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationX;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator animate2;
        View view;
        this.j = motionEvent.getX();
        this.k = motionEvent.getY();
        cv9 cv9Var = this.t;
        bv9 bv9Var = cv9Var.f;
        qor qorVar = cv9Var.a;
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        r4 = null;
        ViewPropertyAnimator viewPropertyAnimator = null;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                qorVar.removeCallbacks(bv9Var);
                qorVar.requestDisallowInterceptTouchEvent(false);
                cv9Var.a();
                cv9Var.e = cv9.a.NONE;
                return false;
            }
            if (actionMasked == 2) {
                if (cv9Var.e == cv9.a.DRAGGING) {
                    xor xorVar = cv9Var.b;
                    qor qorVar2 = xorVar.b;
                    if (xorVar.q != null && xorVar.e >= 0) {
                        mkc0 mkc0Var = xorVar.d;
                        zor zorVar = xorVar.s;
                        Handler handler = xorVar.r;
                        ViewParent parent = qorVar2.getParent();
                        if ((parent instanceof yfc0 ? (yfc0) parent : null) != null && (view = xorVar.q) != null) {
                            xorVar.i = xorVar.i || xorVar.j < ((float) view.getLeft()) || xorVar.j > ((float) view.getRight());
                            float scrollX = xorVar.j - r9.getScrollX();
                            a aVar = scrollX < ((float) xorVar.m) ? a.C4030a.a : scrollX > ((float) xorVar.n) ? a.b.a : null;
                            if (!xorVar.i || aVar == null) {
                                View view3 = xorVar.q;
                                if (view3 != null) {
                                    view3.setTranslationX(xorVar.j - xorVar.h);
                                }
                                handler.removeCallbacks(zorVar);
                            } else {
                                xorVar.o = aVar;
                                handler.post(zorVar);
                            }
                        }
                        if (xorVar.q != null && qorVar2.x != null) {
                            qorVar2.invalidate();
                        }
                        int b = xorVar.b(xorVar.j, xorVar.k);
                        if (b != xorVar.e && b != -1) {
                            float f = xorVar.j;
                            View childAt2 = qorVar2.getChildAt(b);
                            int i = (childAt2 != null && f - ((float) childAt2.getLeft()) >= ((float) (childAt2.getWidth() / 2))) ? 0 : 2;
                            if (b != xorVar.f || i != xorVar.g) {
                                View childAt3 = qorVar2.getChildAt(b);
                                if (childAt3 != null && (animate2 = childAt3.animate()) != null) {
                                    mkc0Var.getClass();
                                    animate2.setDuration(100L);
                                    dpr.a aVar2 = dpr.q7;
                                    if (i == 0) {
                                        aVar2.getClass();
                                        animate2.translationX(-dpr.a.c).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    } else if (i == 1) {
                                        aVar2.getClass();
                                        animate2.translationY(-dpr.a.c).translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    } else if (i == 2) {
                                        aVar2.getClass();
                                        animate2.translationX(dpr.a.c).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    } else if (i == 3) {
                                        aVar2.getClass();
                                        animate2.translationY(dpr.a.c).translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    }
                                    animate2.start();
                                    viewPropertyAnimator = animate2;
                                }
                                xorVar.p = viewPropertyAnimator;
                                xorVar.g = i;
                                qorVar2.invalidate();
                            }
                        }
                        int i2 = xorVar.f;
                        if (b != i2) {
                            if (i2 != xorVar.e && (childAt = qorVar2.getChildAt(i2)) != null && (animate = childAt.animate()) != null && (translationX = animate.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null && (translationY = translationX.translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null) {
                                mkc0Var.getClass();
                                ViewPropertyAnimator duration = translationY.setDuration(100L);
                                if (duration != null) {
                                    duration.start();
                                }
                            }
                            xorVar.f = b;
                        }
                    }
                }
                return false;
            }
            if (actionMasked == 3) {
                qorVar.removeCallbacks(bv9Var);
                qorVar.requestDisallowInterceptTouchEvent(false);
                cv9Var.a();
                cv9Var.e = cv9.a.NONE;
                return false;
            }
            if (actionMasked != 5) {
                return true;
            }
        }
        PointF pointF = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        int childCount = qorVar.getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt4 = qorVar.getChildAt(i3);
            if (f4m.e(childAt4).contains((int) pointF.x, (int) pointF.y)) {
                view2 = childAt4;
                break;
            }
            i3++;
        }
        cv9Var.d = view2;
        if (motionEvent.getPointerCount() <= 1) {
            qorVar.postDelayed(bv9Var, cv9Var.c);
            return false;
        }
        qorVar.requestDisallowInterceptTouchEvent(true);
        qorVar.removeCallbacks(bv9Var);
        return false;
    }

    @Override // xsna.dpr
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.e;
        return (i3 != -1 && i2 >= i3) ? i2 < i + (-1) ? i2 + 1 : i3 : i2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return c(view);
    }

    @Override // xsna.dpr
    public final void F(Canvas canvas) {
    }
}
