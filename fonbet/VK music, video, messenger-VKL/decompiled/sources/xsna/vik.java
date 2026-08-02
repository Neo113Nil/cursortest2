package xsna;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.clips.VideoTransform;
import kotlin.Pair;
import xsna.lc30;
import xsna.ymg0;

/* compiled from: CropperGesturesDetectorDelegate.kt */
/* loaded from: classes16.dex */
public final class vik implements View.OnTouchListener, ScaleGestureDetector.OnScaleGestureListener, GestureDetector.OnGestureListener, lc30.b, ymg0.a {
    public final gzs<Float> b;
    public final m0e c;
    public final a d;
    public boolean e = true;
    public final fot f;
    public final ScaleGestureDetector g;
    public final lc30 h;
    public final ymg0 i;
    public int j;
    public boolean k;

    /* compiled from: CropperGesturesDetectorDelegate.kt */
    public interface a {
        void a(int i, int i2, boolean z);

        void b();

        void c(VideoTransform videoTransform);
    }

    public vik(Context context, gzs<Float> gzsVar, m0e m0eVar, a aVar) {
        this.b = gzsVar;
        this.c = m0eVar;
        this.d = aVar;
        fot fotVar = new fot(context, this, null);
        fotVar.a.setIsLongpressEnabled(false);
        this.f = fotVar;
        this.g = new ScaleGestureDetector(context, this);
        lc30 lc30Var = new lc30(this);
        lc30Var.f = context.getResources().getInteger(R.integer.config_shortAnimTime);
        this.h = lc30Var;
        this.i = new ymg0(this);
    }

    @Override // xsna.ymg0.a
    public final void a(float f, float f2, float f3) {
        if (this.e) {
            if (d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && Math.abs(f) > 0.005f) {
                m0e m0eVar = this.c;
                float f4 = 90;
                float stickerRotation = m0eVar.getStickerRotation() % f4;
                m0eVar.k((Math.abs(stickerRotation) >= 45.0f || Math.abs(stickerRotation) < 2.0f || Math.abs(stickerRotation + f) >= 2.0f) ? (Math.abs(stickerRotation) < 45.0f || Math.abs(stickerRotation) > 88.0f || Math.abs(stickerRotation + f) <= 88.0f) ? -f : (Math.abs(stickerRotation) - f4) * Math.signum(m0eVar.getStickerRotation()) : m0eVar.getStickerRotation() % f4, m0eVar.getCenterX(), m0eVar.getCenterY());
            }
            f();
        }
    }

    @Override // xsna.lc30.b
    public final void b(float f, float f2) {
        if (this.j == 2 && this.e) {
            boolean d = d(f);
            m0e m0eVar = this.c;
            if (d && e(f2)) {
                m0eVar.e(f, f2);
            } else if (d(f)) {
                m0eVar.e(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else if (e(f2)) {
                m0eVar.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
            }
            f();
        }
    }

    public final boolean d(float f) {
        m0e m0eVar = this.c;
        if (m0eVar.getRight() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        if (m0eVar.getLeft() <= m0eVar.b() || f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return m0eVar.getRight() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && m0eVar.getLeft() < m0eVar.b();
        }
        return true;
    }

    public final boolean e(float f) {
        m0e m0eVar = this.c;
        if (m0eVar.getBottom() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        if (m0eVar.getTop() <= m0eVar.f() || f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return m0eVar.getBottom() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && m0eVar.getTop() < m0eVar.f();
        }
        return true;
    }

    public final void f() {
        boolean z = this.k;
        a aVar = this.d;
        if (!z) {
            this.k = true;
            aVar.b();
        }
        m0e m0eVar = this.c;
        aVar.a(m0eVar.g(), (int) m0eVar.getStickerRotation(), m0eVar.j());
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.k = true;
        this.d.b();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        if (d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            m0e m0eVar = this.c;
            m0eVar.a(swe0.f(scaleFactor, 0.3f / m0eVar.getStickerScale(), 7.0f / m0eVar.getStickerScale()), m0eVar.getCenterX(), m0eVar.getCenterY());
        }
        f();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.e) {
            return false;
        }
        this.k = true;
        this.d.b();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        m0e m0eVar = this.c;
        double originalStickerScale = m0eVar.getOriginalStickerScale() - (m0eVar.getOriginalStickerScale() * 0.01d);
        double originalStickerScale2 = (m0eVar.getOriginalStickerScale() * 0.01d) + m0eVar.getOriginalStickerScale();
        double stickerScale = m0eVar.getStickerScale();
        if (stickerScale >= originalStickerScale && stickerScale <= originalStickerScale2) {
            m0eVar.a(m0eVar.getOriginalStickerScale() / m0eVar.getStickerScale(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.j = motionEvent.getPointerCount();
        if (this.k && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            m0e m0eVar = this.c;
            if (pov.b(m0eVar.getStickerMatrix()) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                double originalStickerScale = m0eVar.getOriginalStickerScale() - (m0eVar.getOriginalStickerScale() * 0.01d);
                double originalStickerScale2 = (m0eVar.getOriginalStickerScale() * 0.01d) + m0eVar.getOriginalStickerScale();
                double stickerScale = m0eVar.getStickerScale();
                if (stickerScale >= originalStickerScale && stickerScale <= originalStickerScale2) {
                    float f = 2;
                    double b = (m0eVar.b() / f) - (m0eVar.b() * 0.02d);
                    double b2 = (m0eVar.b() * 0.02d) + (m0eVar.b() / f);
                    double centerX = m0eVar.getCenterX();
                    if (centerX >= b && centerX <= b2) {
                        m0eVar.i();
                    }
                    double f2 = (m0eVar.f() / f) - (m0eVar.f() * 0.02d);
                    double f3 = (m0eVar.f() * 0.02d) + (m0eVar.f() / f);
                    double centerY = m0eVar.getCenterY();
                    if (centerY >= f2 && centerY <= f3) {
                        m0eVar.h();
                    }
                }
            }
            laf lafVar = laf.a;
            float floatValue = this.b.invoke().floatValue();
            lafVar.getClass();
            float b3 = pov.b(m0eVar.getStickerMatrix());
            m0eVar.k(b3, m0eVar.getCenterX(), m0eVar.getCenterY());
            Pair pair = new Pair(Float.valueOf(pov.e(m0eVar.getStickerMatrix())), Float.valueOf(pov.f(m0eVar.getStickerMatrix())));
            VideoTransform videoTransform = new VideoTransform((int) b3, (((Number) pair.i()).floatValue() - ((m0eVar.b() / 2.0f) - ((m0eVar.getOriginalWidth() * pov.c(m0eVar.getStickerMatrix())) / 2.0f))) / m0eVar.b(), (((Number) pair.j()).floatValue() - ((m0eVar.f() / 2.0f) - ((m0eVar.getOriginalHeight() * pov.d(m0eVar.getStickerMatrix())) / 2.0f))) / m0eVar.f(), floatValue, Float.valueOf((m0eVar.getOriginalWidth() * pov.c(m0eVar.getStickerMatrix())) / m0eVar.b()), null, 32, null);
            m0eVar.k(-b3, m0eVar.getCenterX(), m0eVar.getCenterY());
            this.k = false;
            this.d.c(videoTransform);
        }
        this.f.a.onTouchEvent(motionEvent);
        this.g.onTouchEvent(motionEvent);
        this.h.a(motionEvent);
        this.i.a(motionEvent);
        return true;
    }

    @Override // xsna.ymg0.a
    public final void c() {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
