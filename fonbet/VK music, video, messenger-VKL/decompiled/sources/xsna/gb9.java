package xsna;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* compiled from: CallZoomHelper.kt */
/* loaded from: classes7.dex */
public final class gb9 {
    public nt8 A;
    public final FrameLayout a;
    public final jb9 b = new jb9(this);
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public final zzz h;
    public TextureViewRenderer i;
    public final Matrix j;
    public final Matrix k;
    public final ScaleGestureDetector l;
    public boolean m;
    public boolean n;
    public final GestureDetector o;
    public final float[] p;
    public final float[] q;
    public final float[] r;
    public final float[] s;
    public final float[] t;
    public final Matrix u;
    public ValueAnimator v;
    public boolean w;
    public boolean x;
    public boolean y;
    public volatile float z;

    /* compiled from: CallZoomHelper.kt */
    public final class a {
        public final float a;
        public final float b;
        public final boolean c;

        public a(gb9 gb9Var, float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f3;
            this.c = Math.abs(f - f2) > 0.01f || Math.abs(f3 - f4) > 0.01f;
        }
    }

    public gb9(FrameLayout frameLayout) {
        this.a = frameLayout;
        com.vk.voip.ui.c.b.getClass();
        this.h = (a000) com.vk.voip.ui.c.T().a;
        this.j = new Matrix();
        this.k = new Matrix();
        this.l = new ScaleGestureDetector(frameLayout.getContext(), new ib9(this));
        this.o = new GestureDetector(frameLayout.getContext(), new hb9(this));
        this.p = new float[2];
        this.q = new float[2];
        this.r = new float[4];
        this.s = new float[4];
        this.t = new float[4];
        this.u = new Matrix();
        this.x = true;
    }

    public final void a() {
        TextureViewRenderer textureViewRenderer = this.i;
        if (textureViewRenderer != null) {
            textureViewRenderer.setTransform(this.u);
            if (textureViewRenderer.isAttachedToWindow()) {
                textureViewRenderer.invalidate();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent) {
        boolean z;
        float f;
        float f2;
        ValueAnimator valueAnimator;
        e();
        boolean z2 = this.w;
        FrameLayout frameLayout = this.a;
        ScaleGestureDetector scaleGestureDetector = this.l;
        if (z2) {
            z = scaleGestureDetector.onTouchEvent(motionEvent);
        } else {
            frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
            scaleGestureDetector.onTouchEvent(motionEvent);
            if (!this.w) {
                if (!this.o.onTouchEvent(motionEvent)) {
                    z = false;
                } else if (this.m) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            z = true;
        }
        if (!mnh0.q(motionEvent) || scaleGestureDetector.isInProgress()) {
            return z;
        }
        boolean z3 = this.w;
        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
        this.w = false;
        boolean z4 = this.n;
        this.n = false;
        Matrix matrix = this.u;
        float[] fArr = this.s;
        float[] fArr2 = this.r;
        matrix.mapPoints(fArr, fArr2);
        float[] fArr3 = this.t;
        Matrix matrix2 = this.j;
        matrix2.mapPoints(fArr3, fArr2);
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        float f3 = this.c;
        float f4 = 2;
        float f5 = (f3 - width) / f4;
        float f6 = this.d;
        float f7 = (f6 - height) / f4;
        float f8 = (f3 + width) / f4;
        float f9 = (f6 + height) / f4;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        if (f10 >= f5 || f12 <= f8) {
            if (f14 <= width) {
                f5 = (f3 - f14) / f4;
            } else if (f10 <= f5) {
                if (f12 < f8) {
                    f5 = f8;
                    f = f12;
                    if (f11 < f7 || f13 <= f9) {
                        if (f15 <= height) {
                            f7 = (f6 - f15) / f4;
                        } else if (f11 <= f7) {
                            if (f13 < f9) {
                                f2 = f13;
                                f7 = f9;
                                float f16 = f5;
                                float f17 = f7;
                                a aVar = new a(this, f, f16, f2, f17);
                                if (ln10.b(matrix) >= ln10.b(matrix2) && !aVar.c) {
                                    return !z || z3 || z4;
                                }
                                if (ln10.b(matrix) < ln10.b(matrix2)) {
                                    valueAnimator = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    valueAnimator.addUpdateListener(new eb9(this));
                                } else {
                                    ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofMultiFloat("", new float[][]{new float[]{f, f2}, new float[]{f16, f17}}));
                                    ofPropertyValuesHolder.addUpdateListener(new fb9(aVar, this));
                                    valueAnimator = ofPropertyValuesHolder;
                                }
                                valueAnimator.setInterpolator(new db9());
                                valueAnimator.setDuration(400L);
                                this.v = valueAnimator;
                                valueAnimator.start();
                                return true;
                            }
                            f2 = f13;
                        }
                        f2 = f11;
                        float f162 = f5;
                        float f172 = f7;
                        a aVar2 = new a(this, f, f162, f2, f172);
                        if (ln10.b(matrix) >= ln10.b(matrix2)) {
                            if (z) {
                            }
                        }
                        if (ln10.b(matrix) < ln10.b(matrix2)) {
                        }
                        valueAnimator.setInterpolator(new db9());
                        valueAnimator.setDuration(400L);
                        this.v = valueAnimator;
                        valueAnimator.start();
                        return true;
                    }
                    f2 = f11;
                    f7 = f2;
                    float f1622 = f5;
                    float f1722 = f7;
                    a aVar22 = new a(this, f, f1622, f2, f1722);
                    if (ln10.b(matrix) >= ln10.b(matrix2)) {
                    }
                    if (ln10.b(matrix) < ln10.b(matrix2)) {
                    }
                    valueAnimator.setInterpolator(new db9());
                    valueAnimator.setDuration(400L);
                    this.v = valueAnimator;
                    valueAnimator.start();
                    return true;
                }
                f = f12;
            }
            f = f10;
            if (f11 < f7) {
            }
            if (f15 <= height) {
            }
            f2 = f11;
            float f16222 = f5;
            float f17222 = f7;
            a aVar222 = new a(this, f, f16222, f2, f17222);
            if (ln10.b(matrix) >= ln10.b(matrix2)) {
            }
            if (ln10.b(matrix) < ln10.b(matrix2)) {
            }
            valueAnimator.setInterpolator(new db9());
            valueAnimator.setDuration(400L);
            this.v = valueAnimator;
            valueAnimator.start();
            return true;
        }
        f = f10;
        f5 = f;
        if (f11 < f7) {
        }
        if (f15 <= height) {
        }
        f2 = f11;
        float f162222 = f5;
        float f172222 = f7;
        a aVar2222 = new a(this, f, f162222, f2, f172222);
        if (ln10.b(matrix) >= ln10.b(matrix2)) {
        }
        if (ln10.b(matrix) < ln10.b(matrix2)) {
        }
        valueAnimator.setInterpolator(new db9());
        valueAnimator.setDuration(400L);
        this.v = valueAnimator;
        valueAnimator.start();
        return true;
    }

    public final void c(boolean z) {
        int i;
        int i2;
        int i3;
        e();
        int i4 = this.e;
        if (i4 == 0 || (i = this.f) == 0) {
            return;
        }
        float f = i4 / i;
        nt8 nt8Var = this.A;
        boolean z2 = false;
        if (nt8Var != null && f != this.z) {
            mjw0 mjw0Var = (mjw0) nt8Var.b;
            if (mjw0Var.y.f.a && !com.vk.voip.ui.c.b.s0()) {
                mjw0Var.x(f, false);
                mjw0Var.y();
                mjw0Var.X0.onNext(Float.valueOf(f));
            }
        }
        this.z = f;
        if (!z || epx.f(this.u, this.j)) {
            f();
            this.u.set(this.j);
        } else {
            Matrix matrix = this.u;
            float[] fArr = this.s;
            float[] fArr2 = this.r;
            matrix.mapPoints(fArr, fArr2);
            float f2 = fArr[2];
            float f3 = fArr[0];
            float f4 = f2 - f3;
            float f5 = fArr[3];
            float f6 = fArr[1];
            float f7 = f5 - f6;
            float f8 = 1.0f;
            float f9 = (f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (i3 = this.c) <= 0) ? 1.0f : f4 / i3;
            if (f7 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i2 = this.d) > 0) {
                f8 = f7 / i2;
            }
            float max = Math.max(f9, f8);
            double d = max;
            if (0.2d <= d && d <= 20.0d) {
                matrix.reset();
                matrix.postScale(max, max, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                matrix.mapPoints(fArr, fArr2);
                float f10 = f3 - fArr[0];
                float f11 = f6 - fArr[1];
                if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    matrix.postTranslate(f10, f11);
                }
                z2 = true;
            }
            f();
            if (!z2) {
                this.u.set(this.j);
            }
        }
        a();
    }

    public final void d(TextureViewRenderer textureViewRenderer) {
        if (epx.f(textureViewRenderer, this.i)) {
            return;
        }
        TextureViewRenderer textureViewRenderer2 = this.i;
        if (textureViewRenderer2 != null) {
            textureViewRenderer2.setSizeChangeListener(null);
        }
        if (textureViewRenderer != null) {
            textureViewRenderer.setSizeChangeListener(this.b);
        }
        this.i = textureViewRenderer;
        a();
    }

    public final void e() {
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            this.v = null;
        }
    }

    public final void f() {
        int i;
        float f = 1.0f;
        if (this.e != 0 && this.f != 0 && this.d != 0 && this.c != 0) {
            float width = this.a.getWidth();
            float height = this.a.getHeight();
            if (this.x) {
                boolean isHorizontal = this.h.isHorizontal();
                if (this.z > width / height && this.z >= 1.0f) {
                    i = this.c;
                } else if (isHorizontal) {
                    i = this.c;
                } else {
                    f = this.d / height;
                }
                f = i / width;
            } else {
                f = Math.max(this.c / width, this.d / height);
            }
        }
        float k = 1 / i35.k(f, 2);
        this.j.reset();
        this.j.postScale(k, k, this.c / 2.0f, this.d / 2.0f);
    }
}
