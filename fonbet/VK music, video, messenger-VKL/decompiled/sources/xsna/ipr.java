package xsna;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import xsna.epr;
import xsna.ror;

/* compiled from: FlexLayoutGridDragListener.kt */
/* loaded from: classes4.dex */
public final class ipr implements epr {
    public final ror b;
    public final ror.a c;
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
    public final Path o;
    public final float[] p;
    public final RectF q;
    public final kho r;

    public ipr(ror rorVar, ror.a aVar, boolean z) {
        this.b = rorVar;
        this.c = aVar;
        Paint paint = new Paint();
        paint.setColor(z ? rorVar.getContext().getColor(R.color.transparent) : dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_separator_secondary));
        this.d = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(z ? rorVar.getContext().getColor(R.color.transparent) : dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_stroke_accent));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(iah0.a(2));
        this.e = paint2;
        this.f = -1;
        this.g = -2;
        this.h = -1;
        this.o = new Path();
        this.p = new float[8];
        this.q = new RectF();
        this.r = z ? new okc0(b4d0.R, b4d0.T, new qbj(this, 8), new qzg(this, 15), new ozf(this, 28)) : new rdi();
    }

    @Override // xsna.epr
    public final void F(Canvas canvas) {
        ror rorVar;
        View childAt;
        Canvas canvas2;
        a6t a6tVar;
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
        if (i >= 0 && (childAt = (rorVar = this.b).getChildAt(i)) != null) {
            float childInnerRadius = rorVar.getChildInnerRadius();
            Paint paint = this.d;
            if (childInnerRadius == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                canvas.drawRect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), paint);
                canvas2 = canvas;
            } else {
                Path path = this.o;
                path.reset();
                float[] fArr = this.p;
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
                if (uzt0Var != null && uzt0Var.a) {
                    fArr[0] = rorVar.getChildOuterRadius();
                    fArr[1] = rorVar.getChildOuterRadius();
                }
                if (uzt0Var != null && uzt0Var.b) {
                    fArr[2] = rorVar.getChildOuterRadius();
                    fArr[3] = rorVar.getChildOuterRadius();
                }
                if (uzt0Var != null && uzt0Var.c) {
                    fArr[4] = rorVar.getChildOuterRadius();
                    fArr[5] = rorVar.getChildOuterRadius();
                }
                if (uzt0Var != null && uzt0Var.d) {
                    fArr[6] = rorVar.getChildOuterRadius();
                    fArr[7] = rorVar.getChildOuterRadius();
                }
                float left = childAt.getLeft();
                float top = childAt.getTop();
                float right3 = childAt.getRight();
                float bottom3 = childAt.getBottom();
                RectF rectF = this.q;
                rectF.set(left, top, right3, bottom3);
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            }
            int i3 = this.g;
            if (i3 < 0 || i3 == this.f || (childAt2 = rorVar.getChildAt(i3)) == null) {
                return;
            }
            epr.p7.getClass();
            float spacing = (epr.a.b / 2.0f) - (rorVar.getSpacing() / 2.0f);
            int i4 = this.h;
            if (i4 != 0) {
                if (i4 == 1) {
                    float left2 = childAt2.getLeft();
                    f7 = epr.a.d;
                    f8 = left2 + f7;
                    bottom2 = childAt2.getBottom() - spacing;
                    right2 = childAt2.getRight();
                } else if (i4 == 2) {
                    right = childAt2.getLeft() + spacing;
                    float top2 = childAt2.getTop();
                    f = epr.a.d;
                    f2 = top2 + f;
                    bottom = childAt2.getBottom();
                } else {
                    if (i4 != 3) {
                        f5 = 0.0f;
                        f4 = 0.0f;
                        f6 = 0.0f;
                        f3 = 0.0f;
                        canvas2.drawLine(f5, f4, f6, f3, this.e);
                    }
                    float left3 = childAt2.getLeft();
                    f7 = epr.a.d;
                    f8 = left3 + f7;
                    bottom2 = spacing + childAt2.getTop();
                    right2 = childAt2.getRight();
                }
                f5 = f8;
                f4 = bottom2;
                f3 = f4;
                f6 = right2 - f7;
                canvas2.drawLine(f5, f4, f6, f3, this.e);
            }
            right = childAt2.getRight() - spacing;
            float top3 = childAt2.getTop();
            f = epr.a.d;
            f2 = top3 + f;
            bottom = childAt2.getBottom();
            f3 = bottom - f;
            f4 = f2;
            f5 = right;
            f6 = f5;
            canvas2.drawLine(f5, f4, f6, f3, this.e);
        }
    }

    @Override // xsna.epr
    public final boolean R2(View view) {
        return this.n == view;
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
                    this.r.getClass();
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

    public final int c(float f, float f2, int i) {
        ror rorVar = this.b;
        View childAt = rorVar.getChildAt(i);
        if (childAt == null) {
            return 2;
        }
        View childAt2 = rorVar.getChildAt(i - 1);
        View childAt3 = rorVar.getChildAt(i + 1);
        return ((childAt2 != null && childAt.getLeft() == childAt2.getLeft() && childAt.getRight() == childAt2.getRight() && childAt.getTop() > childAt2.getBottom()) || (childAt3 != null && childAt.getLeft() == childAt3.getLeft() && childAt.getRight() == childAt3.getRight() && childAt.getBottom() < childAt3.getTop())) ? f2 - ((float) childAt.getTop()) < ((float) (childAt.getHeight() / 2)) ? 3 : 1 : f - childAt.getLeft() < ((float) (childAt.getWidth() / 2)) ? 2 : 0;
    }

    public final int d(int i, int i2) {
        if (i == -1) {
            return -1;
        }
        if (this.f < i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r14 != 3) goto L62;
     */
    @Override // xsna.epr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View childAt;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationX;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator animate2;
        ror.a aVar = this.c;
        ror rorVar = ror.this;
        this.k = motionEvent.getX();
        this.l = motionEvent.getY();
        if (this.n == null || this.f < 0) {
            return false;
        }
        int action = motionEvent.getAction();
        ViewPropertyAnimator viewPropertyAnimator = null;
        ror rorVar2 = this.b;
        kho khoVar = this.r;
        if (action != 1) {
            if (action == 2) {
                View view = this.n;
                if (view != null) {
                    view.setTranslationX(this.k - this.i);
                    view.setTranslationY(this.l - this.j);
                    rorVar2.getCornersStateKeeper().g(view);
                    rorVar2.invalidate();
                }
                int b = b(this.k, this.l);
                if (b != this.f && b != -1) {
                    int c = c(this.k, this.l, b);
                    int d = d(b, c);
                    ror.d dVar = rorVar.n;
                    if (dVar == null || dVar.e(this.f, d)) {
                        if (b != this.g || c != this.h) {
                            final View childAt2 = rorVar2.getChildAt(b);
                            if (childAt2 != null && (animate2 = childAt2.animate()) != null) {
                                khoVar.getClass();
                                animate2.setDuration(100L);
                                epr.a aVar2 = epr.p7;
                                if (c == 0) {
                                    aVar2.getClass();
                                    animate2.translationX(-epr.a.b).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                } else if (c == 1) {
                                    aVar2.getClass();
                                    animate2.translationY(-epr.a.b).translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                } else if (c == 2) {
                                    aVar2.getClass();
                                    animate2.translationX(epr.a.b).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                } else if (c == 3) {
                                    aVar2.getClass();
                                    animate2.translationY(epr.a.b).translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                animate2.setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.hpr
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        ipr iprVar = ipr.this;
                                        iprVar.b.getCornersStateKeeper().g(childAt2);
                                        iprVar.b.invalidate();
                                    }
                                });
                                animate2.start();
                                viewPropertyAnimator = animate2;
                            }
                            this.m = viewPropertyAnimator;
                            this.h = c;
                            rorVar2.invalidate();
                        }
                    }
                }
                int i = this.g;
                if (b != i) {
                    if (i != this.f && (childAt = rorVar2.getChildAt(i)) != null && (animate = childAt.animate()) != null && (translationX = animate.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null && (translationY = translationX.translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null) {
                        khoVar.getClass();
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
            int d2 = d(b2, c(this.k, this.l, b2));
            ror.d dVar2 = rorVar.n;
            if ((dVar2 == null || dVar2.e(this.f, d2)) && b2 >= 0 && b2 != this.f) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.m;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                }
                View childAt3 = rorVar2.getChildAt(b2);
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
                aVar.a(translationX2, translationY2, this.f, d2);
            } else {
                khoVar.b(view2);
                rorVar2.invalidate();
            }
            View[] d3 = awt0.d(rorVar2);
            ArrayList arrayList = new ArrayList();
            for (View view3 : d3) {
                if (!epx.f(view3, view2)) {
                    arrayList.add(view3);
                }
            }
            khoVar.c(arrayList);
            this.n = null;
            this.f = -1;
            this.g = -1;
            rorVar2.requestDisallowInterceptTouchEvent(false);
            return true;
        }
        return true;
    }

    @Override // xsna.epr
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f;
        return (i3 != -1 && i2 >= i3) ? i2 < i + (-1) ? i2 + 1 : i3 : i2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (view != null) {
            ror rorVar = this.b;
            if (rorVar.h) {
                a(false);
                rorVar.requestDisallowInterceptTouchEvent(true);
                vvr0.c();
                this.f = ((ViewGroup) view.getParent()).indexOfChild(view);
                this.i = this.k;
                this.j = this.l;
                this.n = view;
                kho khoVar = this.r;
                khoVar.d(view);
                rorVar.requestLayout();
                View[] d = awt0.d(rorVar);
                ArrayList arrayList = new ArrayList();
                for (View view2 : d) {
                    if (!epx.f(view2, view)) {
                        arrayList.add(view2);
                    }
                }
                khoVar.a(arrayList);
                return true;
            }
        }
        return false;
    }

    @Override // xsna.epr
    public final boolean t() {
        return this.f >= 0;
    }
}
