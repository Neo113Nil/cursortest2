package xsna;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* compiled from: AutoScrollHelper.java */
/* loaded from: classes12.dex */
public abstract class kj5 implements View.OnTouchListener {
    public static final int r = ViewConfiguration.getTapTimeout();
    public final a b;
    public final AccelerateInterpolator c;
    public final dmo d;
    public b e;
    public final float[] f;
    public final float[] g;
    public final int h;
    public final int i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    /* compiled from: AutoScrollHelper.java */
    public static class a {
        public int a;
        public int b;
        public float c;
        public float d;
        public long e;
        public long f;
        public long g;
        public float h;
        public int i;

        public final float a(long j) {
            if (j < this.e) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            long j2 = this.g;
            if (j2 < 0 || j < j2) {
                return kj5.b((j - r0) / this.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 0.5f;
            }
            float f = this.h;
            return (kj5.b((j - j2) / this.i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * f) + (1.0f - f);
        }
    }

    /* compiled from: AutoScrollHelper.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            kj5 kj5Var = kj5.this;
            dmo dmoVar = kj5Var.d;
            a aVar = kj5Var.b;
            if (kj5Var.p) {
                if (kj5Var.n) {
                    kj5Var.n = false;
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar.e = currentAnimationTimeMillis;
                    aVar.g = -1L;
                    aVar.f = currentAnimationTimeMillis;
                    aVar.h = 0.5f;
                }
                if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + aVar.i) || !kj5Var.e()) {
                    kj5Var.p = false;
                    return;
                }
                if (kj5Var.o) {
                    kj5Var.o = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                    dmoVar.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar.f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float a = aVar.a(currentAnimationTimeMillis2);
                long j = currentAnimationTimeMillis2 - aVar.f;
                aVar.f = currentAnimationTimeMillis2;
                ((igz) kj5Var).s.scrollListBy((int) (j * ((a * 4.0f) + ((-4.0f) * a * a)) * aVar.d));
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                dmoVar.postOnAnimation(this);
            }
        }
    }

    public kj5(dmo dmoVar) {
        a aVar = new a();
        aVar.e = Long.MIN_VALUE;
        aVar.g = -1L;
        aVar.f = 0L;
        this.b = aVar;
        this.c = new AccelerateInterpolator();
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.f = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.g = fArr2;
        float[] fArr3 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.j = fArr3;
        float[] fArr4 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.k = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.l = fArr5;
        this.d = dmoVar;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.i = r;
        aVar.a = 500;
        aVar.b = 500;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f, float f2, float f3, int i) {
        float f4;
        float interpolation;
        float b2 = b(this.f[i] * f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.g[i]);
        float c = c(f2 - f, b2) - c(f, b2);
        AccelerateInterpolator accelerateInterpolator = this.c;
        if (c < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            interpolation = -accelerateInterpolator.getInterpolation(-c);
        } else {
            if (c <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f4 = 0.0f;
                if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                float f5 = this.j[i];
                float f6 = this.k[i];
                float f7 = this.l[i];
                float f8 = f5 * f3;
                return f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? b(f4 * f8, f6, f7) : -b((-f4) * f8, f6, f7);
            }
            interpolation = accelerateInterpolator.getInterpolation(c);
        }
        f4 = b(interpolation, -1.0f, 1.0f);
        if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i = this.h;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        return 1.0f - (f / f2);
                    }
                    if (this.p && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return f / (-f2);
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void d() {
        int i = 0;
        if (this.n) {
            this.p = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.b;
        int i2 = (int) (currentAnimationTimeMillis - aVar.e);
        int i3 = aVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        dmo dmoVar;
        int count;
        a aVar = this.b;
        float f = aVar.d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(aVar.c);
        if (abs != 0 && (count = (dmoVar = ((igz) this).s).getCount()) != 0) {
            int childCount = dmoVar.getChildCount();
            int firstVisiblePosition = dmoVar.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && dmoVar.getChildAt(0).getTop() >= 0)) : !(i >= count && dmoVar.getChildAt(childCount - 1).getBottom() <= dmoVar.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.q) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.o = true;
            this.m = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            dmo dmoVar = this.d;
            float a2 = a(x, width, dmoVar.getWidth(), 0);
            float a3 = a(motionEvent.getY(), view.getHeight(), dmoVar.getHeight(), 1);
            a aVar = this.b;
            aVar.c = a2;
            aVar.d = a3;
            if (!this.p && e()) {
                if (this.e == null) {
                    this.e = new b();
                }
                this.p = true;
                this.n = true;
                if (this.m || (i = this.i) <= 0) {
                    this.e.run();
                } else {
                    b bVar = this.e;
                    long j = i;
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    dmoVar.postOnAnimationDelayed(bVar, j);
                }
                this.m = true;
            }
        }
        return false;
    }
}
