package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.views.RotatingView;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: CropContentOverlayView.kt */
/* loaded from: classes4.dex */
public final class hfk extends FrameLayout implements afk {
    public static final int S = alk.p(280);
    public static final int T;
    public static final int U;
    public static final int V;
    public static final int W;
    public static final int a0;
    public static final int b0;
    public static final int c0;
    public static final int d0;
    public final float A;
    public final float B;
    public final float C;
    public final float D;
    public final RotatingView E;
    public a F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public c290 K;
    public final h28 L;
    public final o290 M;
    public final og0 N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public final RectF f;
    public final RectF g;
    public final RectF h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final RectF n;
    public final RectF o;
    public final Paint p;
    public final Paint q;
    public final Paint r;
    public final Paint s;
    public final Paint t;
    public int u;
    public float v;
    public float w;
    public float x;
    public float y;
    public int z;

    /* compiled from: CropContentOverlayView.kt */
    public interface a {
        void a(boolean z);

        void b();

        void d(float f, boolean z);
    }

    /* compiled from: CropContentOverlayView.kt */
    public final class b extends hk {
        public final Rect b = new Rect();

        @Override // xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            AccessibilityNodeInfo accessibilityNodeInfo = amVar.a;
            Rect rect = this.b;
            accessibilityNodeInfo.getBoundsInScreen(rect);
            rect.bottom = rect.top + hfk.T;
            amVar.k(rect);
        }
    }

    static {
        int p = alk.p(68);
        T = p;
        int p2 = alk.p(48);
        U = p2;
        V = p + p2;
        W = p2;
        a0 = alk.p(94);
        b0 = alk.p(2.0f);
        c0 = alk.p(1.0f);
        d0 = alk.p(2.0f);
    }

    public hfk(Context context) {
        super(context, null, 0);
        this.c = 1.0f;
        this.f = new RectF();
        this.g = new RectF();
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new RectF();
        this.o = new RectF();
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAlpha(0);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(d0);
        this.p = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAlpha(0);
        paint2.setStyle(style);
        paint2.setStrokeWidth(b0);
        this.q = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setAlpha(0);
        paint3.setStrokeWidth(c0);
        paint3.setStyle(style);
        this.r = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(-1);
        paint4.setAlpha(0);
        Paint.Style style2 = Paint.Style.FILL;
        paint4.setStyle(style2);
        this.s = paint4;
        Paint paint5 = new Paint();
        paint5.setColor(-16777216);
        paint5.setStyle(style2);
        this.t = paint5;
        float f = 0;
        this.A = f;
        this.B = f;
        this.C = f;
        this.D = f;
        this.G = true;
        this.H = true;
        this.L = new h28(context);
        this.M = new o290();
        og0 og0Var = new og0();
        og0Var.b = new Path();
        og0Var.c = new Path();
        this.N = og0Var;
        RotatingView rotatingView = (RotatingView) LayoutInflater.from(context).inflate(R.layout.rotation_view, (ViewGroup) this, false);
        this.E = rotatingView;
        rotatingView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        addView(rotatingView);
        rotatingView.w.add(new gfk(this));
        iut0.q(rotatingView, new b());
        this.Q = Resources.getSystem().getDisplayMetrics().widthPixels;
        this.R = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public final RectF a(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f6 = (measuredWidth - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f7 = (measuredHeight - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f8 = f6 > f7 ? f7 : f6;
        float f9 = f6 / f7;
        float f10 = 2;
        float f11 = f6 / f10;
        float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + f11;
        float f13 = f7 / f10;
        float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + f13;
        if (Math.abs(1 - f) < 1.0E-4f) {
            float f15 = f8 / f10;
            f2 = f12 - f15;
            f3 = f14 - f15;
            f4 = f12 + f15;
            f5 = f14 + f15;
        } else if (f > f9) {
            float f16 = f12 - f11;
            float f17 = (f6 / f) / f10;
            float f18 = f14 - f17;
            f4 = f12 + f11;
            f5 = f14 + f17;
            f3 = f18;
            f2 = f16;
        } else {
            float f19 = (f7 * f) / f10;
            f2 = f12 - f19;
            f3 = f14 - f13;
            f4 = f12 + f19;
            f5 = f14 + f13;
        }
        return new RectF(f2, f3, f4, f5);
    }

    public final float b(float f) {
        float x1;
        float m;
        if (f <= getX1() && getX1() - f >= m()) {
            if (getX1() - f > i()) {
                x1 = getX1();
                m = i();
            }
            float measuredWidth = getMeasuredWidth();
            return swe0.f(f, Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth));
        }
        x1 = getX1();
        m = m();
        f = x1 - m;
        float measuredWidth2 = getMeasuredWidth();
        return swe0.f(f, Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth2), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth2));
    }

    public final float c(float f) {
        float y0;
        float n;
        if (f >= getY0() && f - getY0() >= n()) {
            if (f - getY0() > h()) {
                y0 = getY0();
                n = h();
            }
            float measuredHeight = getMeasuredHeight();
            return swe0.f(f, Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight));
        }
        y0 = getY0();
        n = n();
        f = y0 + n;
        float measuredHeight2 = getMeasuredHeight();
        return swe0.f(f, Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight2), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight2));
    }

    public final void d(float f, float f2) {
        if (this.d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            setx0(getX0() + f);
            sety0(getY0() + f2);
            return;
        }
        if (Math.abs(f) <= Math.abs(f2)) {
            sety0(getY0() + f2);
            setx0(getX1() + ((getY0() - getY1()) * this.d));
            return;
        }
        setx0(getX0() + f);
        float x0 = getX0() - getX1();
        float y1 = getY1();
        float f3 = this.d;
        sety0(((y1 * f3) + x0) / f3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.e) {
            float x0 = getX0() + this.A;
            float y0 = getY0() + this.B;
            float x1 = getX1() - this.C;
            float y1 = getY1() - this.D;
            RectF rectF = this.o;
            rectF.set(x0, y0, x1, y1);
            canvas.rotate(this.b, getWidth() / 2.0f, getHeight() / 2.0f);
            float f = this.c;
            canvas.scale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
            float fullWidth = getFullWidth();
            float fullHeight = getFullHeight();
            Path path = this.M.a;
            int i = Resources.getSystem().getDisplayMetrics().widthPixels;
            int i2 = Resources.getSystem().getDisplayMetrics().heightPixels;
            if (i > i2) {
                i = i2;
            }
            float f2 = fullWidth / i;
            int i3 = Resources.getSystem().getDisplayMetrics().widthPixels;
            int i4 = Resources.getSystem().getDisplayMetrics().heightPixels;
            if (i3 < i4) {
                i3 = i4;
            }
            float max = Math.max(f2, fullHeight / i3);
            float f3 = U;
            if (max < 1.0f) {
                max = 1.0f;
            }
            float f4 = f3 * max * 20.0f;
            path.reset();
            float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f4;
            float f6 = fullWidth + f4;
            float f7 = rectF.top;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(f5, f5, f6, f7, direction);
            float f8 = fullHeight + f4;
            path.addRect(f5, rectF.bottom, f6, f8, direction);
            path.addRect(f5, f5, rectF.left, f8, direction);
            path.addRect(rectF.right, f5, f6, f8, direction);
            canvas.drawPath(path, this.t);
            og0 og0Var = this.N;
            Path path2 = (Path) og0Var.b;
            path2.reset();
            Path path3 = (Path) og0Var.c;
            path3.reset();
            float f9 = 9;
            float width = rectF.width() / f9;
            float f10 = rectF.left + width;
            int i5 = 0;
            int i6 = 0;
            while (i6 < 8) {
                float f11 = (i6 * width) + f10;
                i6++;
                Path path4 = i6 % 3 == 0 ? path2 : path3;
                path4.moveTo(f11, rectF.top);
                path4.lineTo(f11, rectF.bottom);
            }
            float height = rectF.height() / f9;
            float f12 = rectF.top + height;
            while (i5 < 8) {
                float f13 = (i5 * height) + f12;
                i5++;
                Path path5 = i5 % 3 == 0 ? path2 : path3;
                path5.moveTo(rectF.left, f13);
                path5.lineTo(rectF.right, f13);
            }
            canvas.drawPath(path2, this.q);
            canvas.drawPath(path3, this.r);
            h28 h28Var = this.L;
            Drawable drawable = h28Var.b;
            Drawable drawable2 = h28Var.d;
            Drawable drawable3 = h28Var.c;
            int i7 = h28.f;
            int i8 = h28.e;
            int i9 = (int) rectF.left;
            int i10 = (int) rectF.right;
            int i11 = (int) rectF.top;
            int i12 = (int) rectF.bottom;
            canvas.drawRect(rectF, this.p);
            Drawable drawable4 = h28Var.a;
            if (drawable4 != null) {
                drawable4.setBounds(i9 - i8, i11 - i8, i9 + i7, i11 + i7);
            }
            Paint paint = this.s;
            if (drawable4 != null) {
                drawable4.setAlpha(paint.getAlpha());
            }
            if (drawable4 != null) {
                drawable4.draw(canvas);
            }
            if (drawable3 != null) {
                drawable3.setBounds(i10 - i7, i11 - i8, i10 + i8, i11 + i7);
            }
            if (drawable3 != null) {
                drawable3.setAlpha(paint.getAlpha());
            }
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
            if (drawable2 != null) {
                drawable2.setBounds(i10 - i7, i12 - i7, i10 + i8, i12 + i8);
            }
            if (drawable2 != null) {
                drawable2.setAlpha(paint.getAlpha());
            }
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
            if (drawable != null) {
                drawable.setBounds(i9 - i8, i12 - i7, i9 + i7, i12 + i8);
            }
            if (drawable != null) {
                drawable.setAlpha(paint.getAlpha());
            }
            if (drawable != null) {
                drawable.draw(canvas);
            }
            float centerX = getCenterX() - (S / 2);
            RotatingView rotatingView = this.E;
            rotatingView.setX(centerX);
            rotatingView.setY(getY1());
            rotatingView.invalidate();
            super.dispatchDraw(canvas);
        }
    }

    public final void e(float f, float f2) {
        if (this.d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            setx1(getX1() + f);
            sety1(getY1() + f2);
        } else {
            if (Math.abs(f) > Math.abs(f2)) {
                setx1(getX1() + f);
                sety1((getX1() + ((getY0() * this.d) - getX0())) / this.d);
                return;
            }
            sety1(getY1() + f2);
            setx1(getX0() + ((getY1() - getY0()) * this.d));
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        l();
        int i = this.f.contains(x, y) ? 1 : this.g.contains(x, y) ? 2 : this.i.contains(x, y) ? 3 : this.h.contains(x, y) ? 4 : this.j.contains(x, y) ? 5 : this.k.contains(x, y) ? 6 : this.l.contains(x, y) ? 7 : this.m.contains(x, y) ? 8 : 0;
        this.u = i;
        if (i == 0) {
            return true;
        }
        this.z = motionEvent.getPointerId(0);
        this.v = x;
        this.w = y;
        return false;
    }

    public final void g(float f) {
        this.e = true;
        float f2 = this.d;
        RectF a2 = f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? a(f2) : a(f);
        this.O = a2.left;
        this.P = a2.top;
        this.Q = a2.right;
        this.R = a2.bottom;
        l();
        invalidate();
    }

    public final Paint getBigLinePaint$android_release() {
        return this.q;
    }

    public final Paint getBorderLinePaint$android_release() {
        return this.p;
    }

    @Override // xsna.afk
    public float getCenterX() {
        return ((getX1() - getX0()) / 2) + getX0();
    }

    @Override // xsna.afk
    public float getCenterY() {
        return ((getY1() - getY0()) / 2) + getY0();
    }

    public final Paint getCornersPaint$android_release() {
        return this.s;
    }

    public float getCropAspectRatio() {
        return (getX1() - getX0()) / (getY1() - getY0());
    }

    @Override // xsna.afk
    public float getCropHeight() {
        return getY1() - getY0();
    }

    @Override // xsna.afk
    public RectF getCropRect() {
        return new RectF(getX0(), getY0(), getX1(), getY1());
    }

    public float getCropScale() {
        float y1;
        int fullHeight;
        if (getFullWidth() < getFullHeight()) {
            y1 = getX1() - getX0();
            fullHeight = getFullWidth();
        } else {
            y1 = getY1() - getY0();
            fullHeight = getFullHeight();
        }
        return y1 / fullHeight;
    }

    @Override // xsna.afk
    public float getCropWidth() {
        return getX1() - getX0();
    }

    public final Paint getDarkOverlayPaint$android_release() {
        return this.t;
    }

    @Override // xsna.afk
    public int getFullHeight() {
        return getMeasuredHeight();
    }

    @Override // xsna.afk
    public int getFullWidth() {
        return getMeasuredWidth();
    }

    public final RotatingView getRotatingView() {
        return this.E;
    }

    public final Paint getTinyLinePaint$android_release() {
        return this.r;
    }

    @Override // xsna.afk
    public float getX0() {
        return this.O;
    }

    @Override // xsna.afk
    public float getX1() {
        return this.Q;
    }

    @Override // xsna.afk
    public float getY0() {
        return this.P;
    }

    @Override // xsna.afk
    public float getY1() {
        return this.R;
    }

    public final float h() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = measuredWidth / measuredHeight;
        float f2 = this.d;
        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return measuredHeight;
        }
        if (f2 == 1.0f) {
            if (measuredWidth <= measuredHeight) {
                return measuredWidth;
            }
        } else if (f2 > 1.0f) {
            if (f <= f2) {
                return measuredWidth / f2;
            }
        } else if (f < f2) {
            return measuredWidth / f2;
        }
        return measuredHeight;
    }

    public final float i() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = measuredWidth / measuredHeight;
        float f2 = this.d;
        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return measuredWidth;
        }
        if (f2 == 1.0f) {
            if (measuredWidth > measuredHeight) {
                return measuredHeight;
            }
        } else if (f2 > 1.0f) {
            if (f > f2) {
                return measuredHeight * f2;
            }
        } else if (f >= f2) {
            return measuredHeight * f2;
        }
        return measuredWidth;
    }

    public final void j(boolean z) {
        c290 c290Var;
        AnimatorSet animatorSet;
        if (!this.H || (c290Var = this.K) == null) {
            return;
        }
        hfk hfkVar = c290Var.a;
        if (c290Var.b) {
            AnimatorSet animatorSet2 = c290Var.g;
            if (animatorSet2 != null) {
                if (z == c290Var.h) {
                    return;
                }
                animatorSet2.cancel();
                c290Var.g = null;
            }
            ObjectAnimator objectAnimator = c290Var.c;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            c290Var.c = null;
            AnimatorSet animatorSet3 = c290Var.e;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
                c290Var.e = null;
            }
            AnimatorSet animatorSet4 = c290Var.i;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                c290Var.i = null;
            }
            c290Var.h = z;
            c290Var.g = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            ObjectAnimator a2 = c290.a(hfkVar, true, z);
            if (a2 != null) {
                arrayList.add(a2);
            }
            arrayList.add(c290.e(hfkVar, false));
            c290Var.c = c290.c(hfkVar, !z, false);
            AnimatorSet animatorSet5 = c290Var.g;
            if (animatorSet5 != null) {
                animatorSet5.playTogether(arrayList);
            }
            if (!z && (animatorSet = c290Var.g) != null) {
                animatorSet.setStartDelay(800L);
            }
            AnimatorSet animatorSet6 = c290Var.g;
            if (animatorSet6 != null) {
                c290.d(animatorSet6, z, new w4u(c290Var, 26));
            }
            ObjectAnimator objectAnimator2 = c290Var.c;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
        }
    }

    public final void k(boolean z) {
        AnimatorSet animatorSet;
        c290 c290Var = this.K;
        if (c290Var != null) {
            boolean z2 = this.u == 0;
            hfk hfkVar = c290Var.a;
            if (c290Var.b && z2) {
                AnimatorSet animatorSet2 = c290Var.i;
                if (animatorSet2 != null) {
                    if (z == c290Var.j) {
                        return;
                    }
                    animatorSet2.cancel();
                    c290Var.i = null;
                }
                AnimatorSet animatorSet3 = c290Var.e;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    c290Var.e = null;
                }
                AnimatorSet animatorSet4 = c290Var.g;
                if (animatorSet4 != null) {
                    animatorSet4.cancel();
                    c290Var.g = null;
                }
                ValueAnimator valueAnimator = c290Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    c290Var.d = null;
                }
                c290Var.j = z;
                c290Var.i = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                ObjectAnimator a2 = c290.a(hfkVar, true, z);
                if (a2 != null) {
                    arrayList.add(a2);
                }
                arrayList.add(c290.e(hfkVar, z));
                AnimatorSet animatorSet5 = c290Var.i;
                if (animatorSet5 != null) {
                    animatorSet5.playTogether(arrayList);
                }
                if (!z && (animatorSet = c290Var.i) != null) {
                    animatorSet.setStartDelay(800L);
                }
                AnimatorSet animatorSet6 = c290Var.i;
                if (animatorSet6 != null) {
                    c290.d(animatorSet6, z, new in60(c290Var, 3));
                }
                RotatingView rotatingView = hfkVar.getRotatingView();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(rotatingView.n, z ? rotatingView.i : rotatingView.h);
                ofFloat.addUpdateListener(new iex(rotatingView, 2));
                c290Var.d = ofFloat;
                ofFloat.start();
                if (z) {
                    ObjectAnimator objectAnimator = c290Var.c;
                    if (objectAnimator != null) {
                        objectAnimator.cancel();
                    }
                    c290Var.c = null;
                    ObjectAnimator c = c290.c(hfkVar, true, true);
                    c290Var.c = c;
                    c.start();
                }
            }
        }
    }

    public final void l() {
        if (getX1() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || getY1() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float x0 = getX0();
        int i = U;
        this.f.set(x0 - i, getY0() - i, getX0() + i, getY0() + i);
        this.g.set(getX1() - i, getY0() - i, getX1() + i, getY0() + i);
        this.i.set(getX1() - i, getY1() - i, getX1() + i, getY1() + i);
        this.h.set(getX0() - i, getY1() - i, getX0() + i, getY1() + i);
        this.j.set(getX0() - i, getY0(), getX0() + i, getY1());
        this.k.set(getX0(), getY0() - i, getX1(), getY0() + i);
        this.l.set(getX1() - i, getY0(), getX1() + i, getY1());
        this.m.set(getX0(), getY1() - i, getX1(), getY1() + i);
        this.n.set(getX0() - i, getY1(), getX1() + i, getY1() + i);
        invalidate();
    }

    public final float m() {
        float f = this.d;
        int i = a0;
        return f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f <= 1.0f ? i : i * f : i;
    }

    public final float n() {
        float f = this.d;
        int i = a0;
        return f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f <= 1.0f ? i / f : i : i;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.G) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        l();
        if (this.n.contains(x, y)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                this.x = x2;
                this.y = y2;
                this.J = false;
                this.I = false;
                f(motionEvent);
            } else if (motionEvent.getAction() == 2 && !this.J && !this.I) {
                float abs = Math.abs(this.x - x2);
                float abs2 = Math.abs(this.y - y2);
                if (abs != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || abs2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    boolean z = abs2 > abs;
                    this.I = z;
                    this.J = true;
                    if (z) {
                        j(true);
                    } else {
                        this.u = 0;
                        k(true);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.J = false;
                this.I = false;
            }
        }
        return this.I;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.G) {
            return false;
        }
        boolean z = this.z == motionEvent.getPointerId(0);
        if (motionEvent.getAction() == 0) {
            if (f(motionEvent)) {
                return false;
            }
            j(true);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.u = 0;
            a aVar = this.F;
            if (aVar != null) {
                aVar.b();
            }
            j(false);
            l();
            this.J = false;
            this.I = false;
            return true;
        }
        if (motionEvent.getAction() != 2 || this.u == 0 || !z) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float f = x - this.v;
        float f2 = y - this.w;
        switch (this.u) {
            case 1:
                d(f, f2);
                break;
            case 2:
                if (this.d != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (Math.abs(f) <= Math.abs(f2)) {
                        sety0(getY0() + f2);
                        setx1(getX0() + ((getY1() - getY0()) * this.d));
                        break;
                    } else {
                        setx1(getX1() + f);
                        float x0 = getX0() - getX1();
                        float y1 = getY1();
                        float f3 = this.d;
                        sety0(((y1 * f3) + x0) / f3);
                        break;
                    }
                } else {
                    setx1(getX1() + f);
                    sety0(getY0() + f2);
                    break;
                }
            case 3:
                e(f, f2);
                break;
            case 4:
                if (this.d != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (Math.abs(f) <= Math.abs(f2)) {
                        sety1(getY1() + f2);
                        float f4 = this.d;
                        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            setx0(b(getX1() + ((getY0() - getY1()) * f4)));
                            break;
                        }
                    } else {
                        setx0(getX0() + f);
                        float f5 = this.d;
                        if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            sety1(c((getX1() + ((getY0() * f5) - getX0())) / this.d));
                            break;
                        }
                    }
                } else {
                    setx0(getX0() + f);
                    sety1(getY1() + f2);
                    break;
                }
                break;
            case 5:
                if (this.d != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    d(f, f2);
                    break;
                } else {
                    setx0(getX0() + f);
                    break;
                }
            case 6:
                if (this.d != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    d(f, f2);
                    break;
                } else {
                    sety0(getY0() + f2);
                    break;
                }
            case 7:
                if (this.d != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    e(f, f2);
                    break;
                } else {
                    setx1(getX1() + f);
                    break;
                }
            case 8:
                if (this.d != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    e(f, f2);
                    break;
                } else {
                    sety1(getY1() + f2);
                    break;
                }
        }
        this.v = x;
        this.w = y;
        a aVar2 = this.F;
        if (aVar2 != null) {
            aVar2.a(false);
        }
        return true;
    }

    public final void setContentRotation(float f) {
        this.b = f;
        invalidate();
    }

    public final void setContentScale(float f) {
        this.c = f;
        invalidate();
    }

    public final void setCropping(boolean z) {
        this.H = z;
        c290 c290Var = this.K;
        if (c290Var != null) {
            hfk hfkVar = c290Var.a;
            c290Var.b = z;
            AnimatorSet animatorSet = c290Var.k;
            if (animatorSet != null) {
                if (z == c290Var.l) {
                    return;
                }
                animatorSet.cancel();
                c290Var.k = null;
            }
            ObjectAnimator objectAnimator = c290Var.c;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            c290Var.c = null;
            AnimatorSet animatorSet2 = c290Var.e;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                c290Var.e = null;
            }
            AnimatorSet animatorSet3 = c290Var.g;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
                c290Var.g = null;
            }
            AnimatorSet animatorSet4 = c290Var.i;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                c290Var.i = null;
            }
            c290Var.l = z;
            c290Var.k = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            arrayList.add(c290.b(hfkVar, hfkVar.getCornersPaint$android_release(), z ? 1.0f : 0.0f));
            ObjectAnimator a2 = c290.a(hfkVar, !z, z);
            if (a2 != null) {
                arrayList.add(a2);
            }
            arrayList.add(c290.b(hfkVar, hfkVar.getBorderLinePaint$android_release(), z ? 0.6f : 0.0f));
            if (z) {
                f = 0.6f;
            }
            arrayList.add(c290.b(hfkVar, hfkVar.getBigLinePaint$android_release(), f));
            arrayList.add(c290.e(hfkVar, false));
            c290Var.c = c290.c(hfkVar, z, true);
            AnimatorSet animatorSet5 = c290Var.k;
            if (animatorSet5 != null) {
                animatorSet5.playTogether(arrayList);
            }
            AnimatorSet animatorSet6 = c290Var.k;
            if (animatorSet6 != null) {
                c290.d(animatorSet6, z, new b290(c290Var, 0));
            }
            ObjectAnimator objectAnimator2 = c290Var.c;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
        }
    }

    public final void setForcedAspectRatio(float f) {
        this.d = f;
    }

    public final void setOnCropChangeListener(a aVar) {
        this.F = aVar;
    }

    public final void setOverlayAnimator(c290 c290Var) {
        this.K = c290Var;
    }

    public final void setRawRect(RectF rectF) {
        this.O = rectF.left;
        this.P = rectF.top;
        this.Q = rectF.right;
        this.R = rectF.bottom;
        invalidate();
    }

    public final void setRawX0$android_release(float f) {
        this.O = f;
        invalidate();
    }

    public final void setRawX1$android_release(float f) {
        this.Q = f;
        invalidate();
    }

    public final void setRawY0$android_release(float f) {
        this.P = f;
        invalidate();
    }

    public final void setRawY1$android_release(float f) {
        this.R = f;
        invalidate();
    }

    public final void setTouchEnabled(boolean z) {
        this.G = z;
    }

    public void setx0(float f) {
        this.O = b(f);
        invalidate();
    }

    public void setx1(float f) {
        float x0;
        float m;
        if (f >= getX0() && f - getX0() >= m()) {
            if (f - getX0() > i()) {
                x0 = getX0();
                m = i();
            }
            float measuredWidth = getMeasuredWidth();
            this.Q = swe0.f(f, Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth));
            invalidate();
        }
        x0 = getX0();
        m = m();
        f = x0 + m;
        float measuredWidth2 = getMeasuredWidth();
        this.Q = swe0.f(f, Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth2), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth2));
        invalidate();
    }

    public void sety0(float f) {
        float y1;
        float n;
        if (f <= getY1() && getY1() - f >= n()) {
            if (getY1() - f > h()) {
                y1 = getY1();
                n = h();
            }
            float measuredHeight = getMeasuredHeight();
            this.P = swe0.f(f, Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight));
            invalidate();
        }
        y1 = getY1();
        n = n();
        f = y1 - n;
        float measuredHeight2 = getMeasuredHeight();
        this.P = swe0.f(f, Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight2), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight2));
        invalidate();
    }

    public void sety1(float f) {
        this.R = c(f);
        invalidate();
    }
}
