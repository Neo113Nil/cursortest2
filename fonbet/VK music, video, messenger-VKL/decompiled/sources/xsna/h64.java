package xsna;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.OverScroller;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKImageView;
import java.lang.ref.WeakReference;
import xsna.f5h0;

/* compiled from: Attacher.java */
/* loaded from: classes2.dex */
public class h64 implements View.OnTouchListener, bb80 {
    public final l4h0 i;
    public final fot j;
    public c r;
    public final WeakReference<VKImageView> s;
    public i64 t;
    public View.OnLongClickListener u;
    public final float[] b = new float[9];
    public final RectF c = new RectF();
    public final AccelerateDecelerateInterpolator d = new AccelerateDecelerateInterpolator();
    public float e = 1.0f;
    public float f = 1.75f;
    public float g = 3.0f;
    public long h = 200;
    public boolean k = false;
    public boolean l = true;
    public int m = 2;
    public boolean n = true;
    public final Matrix o = new Matrix();
    public int p = -1;
    public int q = -1;

    /* compiled from: Attacher.java */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            h64 h64Var = h64.this;
            View.OnLongClickListener onLongClickListener = h64Var.u;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(h64Var.g());
            }
        }
    }

    /* compiled from: Attacher.java */
    public class b implements Runnable {
        public final float b;
        public final float c;
        public final long d = System.currentTimeMillis();
        public final float e;
        public final float f;

        public b(float f, float f2, float f3, float f4) {
            this.b = f3;
            this.c = f4;
            this.e = f;
            this.f = f2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h64 h64Var = h64.this;
            VKImageView g = h64Var.g();
            if (g == null) {
                return;
            }
            float interpolation = h64Var.d.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.d) * 1.0f) / h64Var.h));
            float f = this.e;
            h64Var.onScale(u11.b(this.f, f, interpolation, f) / h64Var.h(), this.b, this.c);
            if (interpolation < 1.0f) {
                g.postOnAnimation(this);
            }
        }
    }

    /* compiled from: Attacher.java */
    public class c implements Runnable {
        public final rhh0 b;
        public int c;
        public int d;
        public final /* synthetic */ h64 e;

        public c(Context context, h64 h64Var) {
            this.e = h64Var;
            rhh0 rhh0Var = new rhh0();
            rhh0Var.b = new OverScroller(context);
            this.b = rhh0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h64 h64Var;
            VKImageView g;
            rhh0 rhh0Var = this.b;
            if (((OverScroller) rhh0Var.b).isFinished() || (g = (h64Var = this.e).g()) == null || !((OverScroller) rhh0Var.b).computeScrollOffset()) {
                return;
            }
            int currX = ((OverScroller) rhh0Var.b).getCurrX();
            int currY = ((OverScroller) rhh0Var.b).getCurrY();
            h64Var.o.postTranslate(this.c - currX, this.d - currY);
            g.invalidate();
            this.c = currX;
            this.d = currY;
            g.postOnAnimation(this);
        }
    }

    public h64(VKImageView vKImageView) {
        this.s = new WeakReference<>(vKImageView);
        vKImageView.getHierarchy().o(f5h0.i.a);
        vKImageView.setOnTouchListener(this);
        this.i = new l4h0(vKImageView.getContext(), this);
        fot fotVar = new fot(vKImageView.getContext(), new a(), null);
        this.j = fotVar;
        fotVar.a.setOnDoubleTapListener(new sjl(this));
    }

    public static void d(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
        }
    }

    @Override // xsna.bb80
    public void a(float f, float f2) {
        VKImageView g = g();
        if (g != null) {
            l4h0 l4h0Var = this.i;
            if (l4h0Var.d.isInProgress()) {
                return;
            }
            this.o.postTranslate(f, f2);
            VKImageView g2 = g();
            if (g2 != null && c()) {
                g2.invalidate();
            }
            ViewParent parent = g.getParent();
            if (parent == null) {
                return;
            }
            if (!this.l || l4h0Var.d.isInProgress() || this.k) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            int i = this.m;
            if (i == 2 || ((i == 0 && f >= 1.0f) || (i == 1 && f <= -1.0f))) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    public final void b() {
        c cVar = this.r;
        if (cVar != null) {
            ((OverScroller) cVar.b.b).abortAnimation();
            this.r = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        float f;
        float f2;
        float width;
        Matrix matrix = this.o;
        RectF f3 = f(matrix);
        if (f3 == null) {
            return false;
        }
        float height = f3.height();
        float width2 = f3.width();
        VKImageView g = g();
        float height2 = g != null ? (g.getHeight() - g.getPaddingTop()) - g.getPaddingBottom() : 0;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (height > height2) {
            float f5 = f3.top;
            if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = -f5;
            } else {
                f = f3.bottom;
                if (f >= height2) {
                    f2 = 0.0f;
                }
            }
            VKImageView g2 = g();
            width = g2 == null ? (g2.getWidth() - g2.getPaddingLeft()) - g2.getPaddingRight() : 0;
            if (width2 > width) {
                f4 = ((width - width2) / 2.0f) - f3.left;
                this.m = 2;
            } else {
                float f6 = f3.left;
                if (f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f4 = -f6;
                    this.m = 0;
                } else {
                    float f7 = f3.right;
                    if (f7 < width) {
                        f4 = width - f7;
                        this.m = 1;
                    } else {
                        this.m = -1;
                    }
                }
            }
            matrix.postTranslate(f4, f2);
            return true;
        }
        height2 = (height2 - height) / 2.0f;
        f = f3.top;
        f2 = height2 - f;
        VKImageView g22 = g();
        width = g22 == null ? (g22.getWidth() - g22.getPaddingLeft()) - g22.getPaddingRight() : 0;
        if (width2 > width) {
        }
        matrix.postTranslate(f4, f2);
        return true;
    }

    public RectF e() {
        c();
        return f(this.o);
    }

    public final RectF f(Matrix matrix) {
        VKImageView g = g();
        if (g == null) {
            return null;
        }
        int i = this.q;
        if (i == -1 && this.p == -1) {
            return null;
        }
        float f = this.p;
        RectF rectF = this.c;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, f);
        j9s j9sVar = g.getHierarchy().f;
        Matrix matrix2 = j9s.e;
        j9sVar.o(matrix2);
        rectF.set(j9sVar.getBounds());
        matrix2.mapRect(rectF);
        matrix.mapRect(rectF);
        return rectF;
    }

    @Nullable
    public final VKImageView g() {
        return this.s.get();
    }

    public final float h() {
        Matrix matrix = this.o;
        float[] fArr = this.b;
        matrix.getValues(fArr);
        float pow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(pow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    public final void i(float f) {
        if (g() != null) {
            j(f, r0.getRight() / 2, r0.getBottom() / 2, false);
        }
    }

    public final void j(float f, float f2, float f3, boolean z) {
        VKImageView g = g();
        if (g == null || f < this.e || f > this.g) {
            return;
        }
        if (z) {
            g.post(new b(h(), f, f2, f3));
            return;
        }
        this.o.setScale(f, f, f2, f3);
        VKImageView g2 = g();
        if (g2 != null && c()) {
            g2.invalidate();
        }
    }

    @Override // xsna.bb80
    public void onFling(float f, float f2) {
        int i;
        int i2;
        int i3;
        int i4;
        VKImageView g = g();
        if (g == null) {
            return;
        }
        c cVar = new c(g.getContext(), this);
        this.r = cVar;
        VKImageView g2 = g();
        int width = g2 != null ? (g2.getWidth() - g2.getPaddingLeft()) - g2.getPaddingRight() : 0;
        VKImageView g3 = g();
        int height = g3 != null ? (g3.getHeight() - g3.getPaddingTop()) - g3.getPaddingBottom() : 0;
        int i5 = (int) f;
        int i6 = (int) f2;
        RectF e = e();
        if (e != null) {
            int round = Math.round(-e.left);
            float f3 = width;
            if (f3 < e.width()) {
                i = 0;
                i2 = Math.round(e.width() - f3);
            } else {
                i = round;
                i2 = i;
            }
            int round2 = Math.round(-e.top);
            float f4 = height;
            if (f4 < e.height()) {
                i4 = Math.round(e.height() - f4);
                i3 = 0;
            } else {
                i3 = round2;
                i4 = i3;
            }
            cVar.c = round;
            cVar.d = round2;
            if (round != i2 || round2 != i4) {
                ((OverScroller) cVar.b.b).fling(round, round2, i5, i6, i, i2, i3, i4, 0, 0);
            }
        }
        g.post(this.r);
    }

    @Override // xsna.bb80
    public void onScale(float f, float f2, float f3) {
        float abs = Math.abs(f);
        this.o.postScale(abs, abs, f2, f3);
        VKImageView g = g();
        if (g != null && c()) {
            g.invalidate();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float x;
        float y;
        float x2;
        float y2;
        float x3;
        float y3;
        VelocityTracker velocityTracker;
        ViewParent parent;
        boolean z3 = false;
        if (!this.n) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            b();
        } else if ((actionMasked == 1 || actionMasked == 3) && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        l4h0 l4h0Var = this.i;
        ScaleGestureDetector scaleGestureDetector = l4h0Var.d;
        ScaleGestureDetector scaleGestureDetector2 = l4h0Var.d;
        boolean isInProgress = scaleGestureDetector.isInProgress();
        boolean z4 = l4h0Var.g;
        scaleGestureDetector2.onTouchEvent(motionEvent);
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            l4h0Var.j = motionEvent.getPointerId(0);
        } else if (actionMasked2 == 1 || actionMasked2 == 3) {
            l4h0Var.j = -1;
        } else if (actionMasked2 == 6) {
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) == l4h0Var.j) {
                int i = actionIndex == 0 ? 1 : 0;
                l4h0Var.j = motionEvent.getPointerId(i);
                l4h0Var.h = motionEvent.getX(i);
                l4h0Var.i = motionEvent.getY(i);
            }
        }
        int i2 = l4h0Var.j;
        if (i2 == -1) {
            i2 = 0;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        l4h0Var.k = findPointerIndex;
        h64 h64Var = l4h0Var.e;
        if (actionMasked2 == 0) {
            z = true;
            z2 = isInProgress;
            VelocityTracker obtain = VelocityTracker.obtain();
            l4h0Var.f = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x = motionEvent.getX(l4h0Var.k);
            } catch (Exception unused) {
                x = motionEvent.getX();
            }
            l4h0Var.h = x;
            try {
                y = motionEvent.getY(l4h0Var.k);
            } catch (Exception unused2) {
                y = motionEvent.getY();
            }
            l4h0Var.i = y;
            l4h0Var.g = false;
        } else if (actionMasked2 == 1) {
            z = true;
            z2 = isInProgress;
            if (l4h0Var.g && l4h0Var.f != null) {
                try {
                    x2 = motionEvent.getX(findPointerIndex);
                } catch (Exception unused3) {
                    x2 = motionEvent.getX();
                }
                l4h0Var.h = x2;
                try {
                    y2 = motionEvent.getY(l4h0Var.k);
                } catch (Exception unused4) {
                    y2 = motionEvent.getY();
                }
                l4h0Var.i = y2;
                l4h0Var.f.addMovement(motionEvent);
                l4h0Var.f.computeCurrentVelocity(1000);
                float xVelocity = l4h0Var.f.getXVelocity();
                float yVelocity = l4h0Var.f.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= l4h0Var.c) {
                    h64Var.onFling(-xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = l4h0Var.f;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                l4h0Var.f = null;
            }
        } else if (actionMasked2 != 2) {
            if (actionMasked2 == 3 && (velocityTracker = l4h0Var.f) != null) {
                velocityTracker.recycle();
                l4h0Var.f = null;
            }
            z = true;
            z2 = isInProgress;
        } else {
            try {
                x3 = motionEvent.getX(findPointerIndex);
            } catch (Exception unused5) {
                x3 = motionEvent.getX();
            }
            try {
                y3 = motionEvent.getY(l4h0Var.k);
            } catch (Exception unused6) {
                y3 = motionEvent.getY();
            }
            float f = x3 - l4h0Var.h;
            float f2 = y3 - l4h0Var.i;
            if (l4h0Var.g) {
                z = true;
                z2 = isInProgress;
            } else {
                z = true;
                z2 = isInProgress;
                l4h0Var.g = Math.sqrt((double) ((f2 * f2) + (f * f))) >= ((double) l4h0Var.b);
            }
            if (l4h0Var.g) {
                h64Var.a(f, f2);
                l4h0Var.h = x3;
                l4h0Var.i = y3;
                VelocityTracker velocityTracker3 = l4h0Var.f;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            }
        }
        boolean z5 = (z2 || scaleGestureDetector2.isInProgress()) ? false : z;
        boolean z6 = (z4 || l4h0Var.g) ? false : z;
        if (z5 && z6) {
            z3 = z;
        }
        this.k = z3;
        this.j.a.onTouchEvent(motionEvent);
        return z;
    }
}
