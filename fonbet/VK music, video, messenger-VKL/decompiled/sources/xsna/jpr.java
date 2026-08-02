package xsna;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import xsna.dpr;
import xsna.qor;

/* compiled from: FlexLayoutGridDragListener.kt */
/* loaded from: classes18.dex */
public final class jpr implements dpr {
    public final qor b;
    public final qor.f c;
    public final Paint d;
    public final Paint e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public ViewPropertyAnimator m;
    public View n;
    public final pkc0 o;

    public jpr(qor qorVar, qor.f fVar) {
        this.b = qorVar;
        this.c = fVar;
        Paint paint = new Paint();
        paint.setColor(qorVar.getContext().getColor(R.color.transparent));
        this.d = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(qorVar.getContext().getColor(R.color.transparent));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(iah0.a(2));
        this.e = paint2;
        this.f = -1;
        this.g = -2;
        this.h = -1;
        this.o = new pkc0(new m2j(this, 12), new tvj(this, 9));
    }

    @Override // xsna.dpr
    public final void F(Canvas canvas) {
        qor qorVar;
        View childAt;
        View childAt2;
        float right;
        float f;
        float f2;
        int bottom;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float bottom2;
        int right2;
        int i = this.f;
        if (i >= 0 && (childAt = (qorVar = this.b).getChildAt(i)) != null) {
            canvas.drawRect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), this.d);
            int i2 = this.g;
            if (i2 < 0 || i2 == this.f || (childAt2 = qorVar.getChildAt(i2)) == null) {
                return;
            }
            dpr.q7.getClass();
            float spacing = (dpr.a.b / 2.0f) - (qorVar.getSpacing() / 2.0f);
            int i3 = this.h;
            if (i3 != 0) {
                if (i3 == 1) {
                    float left = childAt2.getLeft();
                    f7 = dpr.a.d;
                    f8 = left + f7;
                    bottom2 = childAt2.getBottom() - spacing;
                    right2 = childAt2.getRight();
                } else if (i3 == 2) {
                    right = childAt2.getLeft() + spacing;
                    float top = childAt2.getTop();
                    f = dpr.a.d;
                    f2 = top + f;
                    bottom = childAt2.getBottom();
                } else {
                    if (i3 != 3) {
                        f4 = 0.0f;
                        f6 = 0.0f;
                        f5 = 0.0f;
                        f3 = 0.0f;
                        canvas.drawLine(f4, f6, f5, f3, this.e);
                    }
                    float left2 = childAt2.getLeft();
                    f7 = dpr.a.d;
                    f8 = left2 + f7;
                    bottom2 = spacing + childAt2.getTop();
                    right2 = childAt2.getRight();
                }
                f5 = right2 - f7;
                f4 = f8;
                f6 = bottom2;
                f3 = f6;
                canvas.drawLine(f4, f6, f5, f3, this.e);
            }
            right = childAt2.getRight() - spacing;
            float top2 = childAt2.getTop();
            f = dpr.a.d;
            f2 = top2 + f;
            bottom = childAt2.getBottom();
            f3 = bottom - f;
            f4 = right;
            f5 = f4;
            f6 = f2;
            canvas.drawLine(f4, f6, f5, f3, this.e);
        }
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
            View findViewById = qorVar.getChildAt(i).findViewById(com.vkontakte.android.R.id.posting_attachment_holder_remove);
            if (findViewById != null && (animate = findViewById.animate()) != null) {
                ViewPropertyAnimator alpha = animate.alpha(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (alpha != null) {
                    this.o.getClass();
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

    public final int c(float f, float f2, int i) {
        qor qorVar = this.b;
        View childAt = qorVar.getChildAt(i);
        if (childAt == null) {
            return 2;
        }
        View childAt2 = qorVar.getChildAt(i - 1);
        View childAt3 = qorVar.getChildAt(i + 1);
        return ((childAt2 != null && childAt.getLeft() == childAt2.getLeft() && childAt.getRight() == childAt2.getRight() && childAt.getTop() > childAt2.getBottom()) || (childAt3 != null && childAt.getLeft() == childAt3.getLeft() && childAt.getRight() == childAt3.getRight() && childAt.getBottom() < childAt3.getTop())) ? f2 - ((float) childAt.getTop()) < ((float) (childAt.getHeight() / 2)) ? 3 : 1 : f - childAt.getLeft() < ((float) (childAt.getWidth() / 2)) ? 2 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r13 != 3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0125  */
    @Override // xsna.dpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        View childAt;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationX;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator animate2;
        this.k = motionEvent.getX();
        this.l = motionEvent.getY();
        if (this.n == null || this.f < 0) {
            return false;
        }
        int action = motionEvent.getAction();
        ViewPropertyAnimator viewPropertyAnimator = null;
        qor qorVar = this.b;
        pkc0 pkc0Var = this.o;
        if (action != 1) {
            if (action == 2) {
                View view = this.n;
                if (view != null) {
                    view.setTranslationX(this.k - this.i);
                    view.setTranslationY(this.l - this.j);
                    if (qorVar.x != null) {
                        qorVar.invalidate();
                    }
                }
                int b = b(this.k, this.l);
                if (b != this.f && b != -1) {
                    int c = c(this.k, this.l, b);
                    if (b != this.g || c != this.h) {
                        View childAt2 = qorVar.getChildAt(b);
                        if (childAt2 != null && (animate2 = childAt2.animate()) != null) {
                            pkc0Var.getClass();
                            animate2.setDuration(100L);
                            dpr.a aVar = dpr.q7;
                            if (c == 0) {
                                aVar.getClass();
                                animate2.translationX(-dpr.a.b).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            } else if (c == 1) {
                                aVar.getClass();
                                animate2.translationY(-dpr.a.b).translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            } else if (c == 2) {
                                aVar.getClass();
                                animate2.translationX(dpr.a.b).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            } else if (c == 3) {
                                aVar.getClass();
                                animate2.translationY(dpr.a.b).translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            }
                            animate2.start();
                            viewPropertyAnimator = animate2;
                        }
                        this.m = viewPropertyAnimator;
                        this.h = c;
                        qorVar.invalidate();
                    }
                }
                int i2 = this.g;
                if (b != i2) {
                    if (i2 != this.f && (childAt = qorVar.getChildAt(i2)) != null && (animate = childAt.animate()) != null && (translationX = animate.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null && (translationY = translationX.translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null) {
                        pkc0Var.getClass();
                        ViewPropertyAnimator duration = translationY.setDuration(100L);
                        if (duration != null) {
                            duration.start();
                        }
                    }
                    this.g = b;
                    return true;
                }
            }
            return true;
        }
        a(true);
        View view2 = this.n;
        if (view2 != null) {
            int b2 = b(this.k, this.l);
            int c2 = c(this.k, this.l, b2);
            if (b2 == -1) {
                i = -1;
            } else if (this.f < b2) {
                if (c2 != 0 && c2 != 1) {
                    i = b2 - 1;
                    if (i >= 0) {
                        i = 0;
                    } else if (i >= qorVar.getChildCount()) {
                        i = qorVar.getChildCount() - 1;
                    }
                }
                i = b2;
                if (i >= 0) {
                }
            } else {
                if (c2 == 0 || c2 == 1) {
                    i = b2 + 1;
                    if (i >= 0) {
                    }
                }
                i = b2;
                if (i >= 0) {
                }
            }
            if (b2 < 0 || b2 == this.f) {
                pkc0Var.getClass();
                pkc0Var.f(pkc0.a(view2), true);
                qorVar.invalidate();
            } else {
                ViewPropertyAnimator viewPropertyAnimator2 = this.m;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                }
                View childAt3 = qorVar.getChildAt(b2);
                if (childAt3 != null) {
                    childAt3.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    childAt3.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                float translationX2 = view2.getTranslationX() + view2.getLeft();
                float translationY2 = view2.getTranslationY() + view2.getTop();
                view2.setAlpha(1.0f);
                view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                this.c.a(translationX2, translationY2, this.f, i);
            }
            View[] d = awt0.d(qorVar);
            ArrayList arrayList = new ArrayList();
            for (View view3 : d) {
                if (!epx.f(view3, view2)) {
                    arrayList.add(view3);
                }
            }
            pkc0Var.e(arrayList);
            this.n = null;
            this.f = -1;
            this.g = -1;
            qorVar.requestDisallowInterceptTouchEvent(false);
            return true;
        }
        return true;
    }

    @Override // xsna.dpr
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f;
        return (i3 != -1 && i2 >= i3) ? i2 < i + (-1) ? i2 + 1 : i3 : i2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (view != null) {
            qor qorVar = this.b;
            if (qorVar.g) {
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                pkc0 pkc0Var = this.o;
                if (viewGroup != null) {
                    a(false);
                    qorVar.requestDisallowInterceptTouchEvent(true);
                    view.performHapticFeedback(25);
                    this.f = viewGroup.indexOfChild(view);
                    this.i = this.k;
                    this.j = this.l;
                    this.n = view;
                    pkc0Var.f(pkc0Var.b(view), false);
                    qorVar.requestLayout();
                }
                View[] d = awt0.d(qorVar);
                ArrayList arrayList = new ArrayList();
                for (View view2 : d) {
                    if (!epx.f(view2, view)) {
                        arrayList.add(view2);
                    }
                }
                pkc0Var.d(arrayList);
                return true;
            }
        }
        return false;
    }
}
