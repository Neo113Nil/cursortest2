package xsna;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import xsna.dv9;
import xsna.epr;
import xsna.ror;

/* compiled from: FlexLayoutCarouselDragListener.kt */
/* loaded from: classes4.dex */
public final class apr implements epr {
    public final ror b;
    public final ror.a c;
    public final Paint d;
    public final boolean e;
    public final lkc0 f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public int m;
    public final int n;
    public final int o;
    public boolean p;
    public ViewPropertyAnimator q;
    public View r;
    public final Path s;
    public final float[] t;
    public final RectF u;
    public final Handler v;
    public final yor w;
    public final dv9 x;

    public apr(ror rorVar, ror.a aVar, ndc0 ndc0Var, k5h k5hVar) {
        this.b = rorVar;
        this.c = aVar;
        Paint paint = new Paint();
        paint.setColor(rorVar.getContext().getColor(R.color.transparent));
        this.d = paint;
        boolean z = ndc0Var.a;
        this.e = z;
        this.f = new lkc0(z ? b4d0.V : b4d0.U, b4d0.V, new m2g(this, 18), new dnh(this, 19), new p5h(this, 16), ndc0Var);
        this.g = -1;
        this.h = -2;
        this.i = -1;
        this.n = 1;
        this.o = (((Number) k5hVar.invoke()).intValue() / 2) - (((Number) k5hVar.invoke()).intValue() / 4);
        this.s = new Path();
        this.t = new float[8];
        this.u = new RectF();
        this.v = new Handler(Looper.getMainLooper());
        this.w = new yor(this);
        this.x = new dv9(rorVar, this);
    }

    @Override // xsna.epr
    public final void F(Canvas canvas) {
        ror rorVar;
        View childAt;
        a6t a6tVar;
        int i = this.g;
        if (i >= 0 && (childAt = (rorVar = this.b).getChildAt(i)) != null) {
            float childInnerRadius = rorVar.getChildInnerRadius();
            Paint paint = this.d;
            if (childInnerRadius == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                canvas.drawRect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), paint);
                return;
            }
            Path path = this.s;
            path.reset();
            float[] fArr = this.t;
            int length = fArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                fArr[i2] = rorVar.getChildInnerRadius();
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            uzt0 uzt0Var = null;
            ror.c cVar = layoutParams instanceof ror.c ? (ror.c) layoutParams : null;
            if (cVar != null && (a6tVar = cVar.a) != null) {
                uzt0Var = a6tVar.a;
            }
            if (uzt0Var != null) {
                if (uzt0Var.a) {
                    fArr[0] = rorVar.getChildOuterRadius();
                    fArr[1] = rorVar.getChildOuterRadius();
                }
                if (uzt0Var.b) {
                    fArr[2] = rorVar.getChildOuterRadius();
                    fArr[3] = rorVar.getChildOuterRadius();
                }
                if (uzt0Var.c) {
                    fArr[4] = rorVar.getChildOuterRadius();
                    fArr[5] = rorVar.getChildOuterRadius();
                }
                if (uzt0Var.d) {
                    fArr[6] = rorVar.getChildOuterRadius();
                    fArr[7] = rorVar.getChildOuterRadius();
                }
            }
            float left = childAt.getLeft();
            float top = childAt.getTop();
            float right = childAt.getRight();
            float bottom = childAt.getBottom();
            RectF rectF = this.u;
            rectF.set(left, top, right, bottom);
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            path.close();
            canvas.drawPath(path, paint);
        }
    }

    @Override // xsna.epr
    public final boolean R2(View view) {
        return this.r == view;
    }

    public final void a(boolean z) {
        ViewPropertyAnimator animate;
        int i = 0;
        while (true) {
            ror rorVar = this.b;
            if (i >= rorVar.getChildCount()) {
                return;
            }
            int i2 = i + 1;
            View findViewById = rorVar.getChildAt(i).findViewById(com.vkontakte.android.R.id.posting_attachment_holder_remove);
            if (findViewById != null && (animate = findViewById.animate()) != null) {
                ViewPropertyAnimator alpha = animate.alpha(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (alpha != null) {
                    this.f.getClass();
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
        ror rorVar = this.b;
        int childCount = rorVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = rorVar.getChildAt(i);
            rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            if (rect.contains(an10.b(f), an10.b(f2))) {
                return i;
            }
        }
        return -1;
    }

    public final int c(int i, int i2) {
        if (i == -1) {
            return -1;
        }
        if (this.g < i) {
            if (i2 != 0 && i2 != 1) {
                i--;
            }
        } else if (i2 == 0 || i2 == 1) {
            i++;
        }
        if (i < 0) {
            return 0;
        }
        ror rorVar = this.b;
        return i >= rorVar.getChildCount() ? rorVar.getChildCount() - 1 : i;
    }

    public final boolean d(View view) {
        if (view != null) {
            ror rorVar = this.b;
            if (!rorVar.h) {
                rorVar.requestDisallowInterceptTouchEvent(true);
                vvr0.c();
                a(false);
                this.g = ((ViewGroup) view.getParent()).indexOfChild(view);
                this.j = this.k;
                this.r = view;
                ViewParent parent = rorVar.getParent();
                zfc0 zfc0Var = parent instanceof zfc0 ? (zfc0) parent : null;
                this.m = zfc0Var != null ? zfc0Var.getScrollX() : 0;
                lkc0 lkc0Var = this.f;
                lkc0Var.d(view);
                rorVar.requestLayout();
                View[] d = awt0.d(rorVar);
                ArrayList arrayList = new ArrayList();
                for (View view2 : d) {
                    if (!epx.f(view2, view)) {
                        arrayList.add(view2);
                    }
                }
                lkc0Var.a(arrayList);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00cc, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ca, code lost:
    
        if (r13 != 3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r8 != 5) goto L59;
     */
    @Override // xsna.epr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        this.k = motionEvent.getX();
        this.l = motionEvent.getY();
        if (!this.e) {
            if (this.r != null && this.g >= 0) {
                int action = motionEvent.getAction();
                if (action != 1) {
                    if (action == 2) {
                        f();
                        return true;
                    }
                }
                e();
                return true;
            }
            return false;
        }
        dv9 dv9Var = this.x;
        tw3 tw3Var = dv9Var.f;
        apr aprVar = dv9Var.b;
        ror rorVar = dv9Var.a;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                rorVar.removeCallbacks(tw3Var);
                rorVar.requestDisallowInterceptTouchEvent(false);
                if (dv9Var.e == dv9.a.DRAGGING && aprVar.r != null && aprVar.g >= 0) {
                    aprVar.e();
                }
                dv9Var.e = dv9.a.NONE;
                return false;
            }
            if (actionMasked == 2) {
                if (dv9Var.e == dv9.a.DRAGGING && aprVar.r != null && aprVar.g >= 0) {
                    aprVar.f();
                    return false;
                }
                return false;
            }
            if (actionMasked == 3) {
                rorVar.removeCallbacks(tw3Var);
                rorVar.requestDisallowInterceptTouchEvent(false);
                if (dv9Var.e == dv9.a.DRAGGING && aprVar.r != null && aprVar.g >= 0) {
                    aprVar.e();
                }
                dv9Var.e = dv9.a.NONE;
                return false;
            }
        }
        PointF pointF = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        int childCount = rorVar.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                view = null;
                break;
            }
            view = rorVar.getChildAt(i);
            if (f4m.e(view).contains((int) pointF.x, (int) pointF.y)) {
                break;
            }
            i++;
        }
        dv9Var.d = view;
        if (motionEvent.getPointerCount() <= 1) {
            rorVar.postDelayed(tw3Var, dv9Var.c);
            return false;
        }
        rorVar.requestDisallowInterceptTouchEvent(true);
        rorVar.removeCallbacks(tw3Var);
        return false;
    }

    public final void e() {
        a(true);
        View view = this.r;
        if (view == null) {
            return;
        }
        this.v.removeCallbacks(this.w);
        int b = b(this.k, this.l);
        float f = this.k;
        ror rorVar = this.b;
        int i = 2;
        if (rorVar.getChildAt(b) != null && f - r4.getLeft() >= r4.getWidth() / 2) {
            i = 0;
        }
        int c = c(b, i);
        ror.a aVar = this.c;
        ror.d dVar = ror.this.n;
        lkc0 lkc0Var = this.f;
        if ((dVar == null || dVar.e(this.g, c)) && b >= 0 && b != this.g) {
            ViewPropertyAnimator viewPropertyAnimator = this.q;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            View childAt = rorVar.getChildAt(b);
            if (childAt != null) {
                childAt.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                childAt.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            float translationX = view.getTranslationX() + view.getLeft();
            float translationY = view.getTranslationY() + view.getTop();
            view.setAlpha(1.0f);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            aVar.a(translationX, translationY, this.g, c);
        } else {
            lkc0Var.b(view);
            rorVar.invalidate();
        }
        View[] d = awt0.d(rorVar);
        ArrayList arrayList = new ArrayList();
        for (View view2 : d) {
            if (!epx.f(view2, view)) {
                arrayList.add(view2);
            }
        }
        lkc0Var.c(arrayList);
        this.r = null;
        this.g = -1;
        this.h = -1;
        rorVar.requestDisallowInterceptTouchEvent(false);
    }

    public final void f() {
        View childAt;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationX;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator animate2;
        ror rorVar = this.b;
        ViewParent parent = rorVar.getParent();
        ViewPropertyAnimator viewPropertyAnimator = null;
        if ((parent instanceof zfc0 ? (zfc0) parent : null) != null && this.r != null) {
            float scrollX = (this.k + (this.m - r1.getScrollX())) - this.j;
            float abs = Math.abs(scrollX);
            float f = this.o;
            yor yorVar = this.w;
            Handler handler = this.v;
            if (abs > f) {
                this.p = scrollX < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                handler.post(yorVar);
            } else {
                View view = this.r;
                if (view != null) {
                    view.setTranslationX(this.k - this.j);
                }
                handler.removeCallbacks(yorVar);
            }
        }
        View view2 = this.r;
        if (view2 != null) {
            rorVar.getCornersStateKeeper().g(view2);
            rorVar.invalidate();
        }
        int b = b(this.k, this.l);
        int i = this.g;
        lkc0 lkc0Var = this.f;
        if (b != i && b != -1) {
            float f2 = this.k;
            View childAt2 = rorVar.getChildAt(b);
            int i2 = (childAt2 == null || f2 - ((float) childAt2.getLeft()) < ((float) (childAt2.getWidth() / 2))) ? 2 : 0;
            int c = c(b, i2);
            ror.d dVar = ror.this.n;
            if (dVar != null && !dVar.e(this.g, c)) {
                return;
            }
            if (b != this.h || i2 != this.i) {
                final View childAt3 = rorVar.getChildAt(b);
                if (childAt3 != null && (animate2 = childAt3.animate()) != null) {
                    lkc0Var.getClass();
                    animate2.setDuration(100L);
                    epr.a aVar = epr.p7;
                    if (i2 == 0) {
                        aVar.getClass();
                        animate2.translationX(-epr.a.c).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    } else if (i2 == 1) {
                        aVar.getClass();
                        animate2.translationY(-epr.a.c).translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    } else if (i2 == 2) {
                        aVar.getClass();
                        animate2.translationX(epr.a.c).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    } else if (i2 == 3) {
                        aVar.getClass();
                        animate2.translationY(epr.a.c).translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    animate2.setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.wor
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            apr aprVar = apr.this;
                            aprVar.b.getCornersStateKeeper().g(childAt3);
                            aprVar.b.invalidate();
                        }
                    });
                    animate2.start();
                    viewPropertyAnimator = animate2;
                }
                this.q = viewPropertyAnimator;
                this.i = i2;
                rorVar.invalidate();
            }
        }
        int i3 = this.h;
        if (b != i3) {
            if (i3 != this.g && (childAt = rorVar.getChildAt(i3)) != null && (animate = childAt.animate()) != null && (translationX = animate.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null && (translationY = translationX.translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null) {
                lkc0Var.getClass();
                ViewPropertyAnimator duration = translationY.setDuration(100L);
                if (duration != null) {
                    duration.start();
                }
            }
            this.h = b;
        }
    }

    @Override // xsna.epr
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.g;
        return (i3 != -1 && i2 >= i3) ? i2 < i + (-1) ? i2 + 1 : i3 : i2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return d(view);
    }

    @Override // xsna.epr
    public final boolean t() {
        return this.g >= 0;
    }
}
