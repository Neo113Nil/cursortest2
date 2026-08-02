package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VisibilityGate.kt */
/* loaded from: classes6.dex */
public final class w4u0 implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final View b;
    public final float c;
    public final boolean d;
    public final gzs<s3q0> e;
    public final gzs<s3q0> f;
    public final Rect g;
    public boolean h;
    public boolean i;

    public w4u0(View view, gzs gzsVar, gzs gzsVar2, int i) {
        boolean z = (i & 4) != 0;
        this.b = view;
        this.c = 0.9f;
        this.d = z;
        this.e = gzsVar;
        this.f = gzsVar2;
        this.g = new Rect();
    }

    public final void a() {
        View view = this.b;
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
                viewTreeObserver.addOnGlobalLayoutListener(this);
            }
        }
        view.post(new id(this, 15));
    }

    public final void b() {
        boolean z = c() >= this.c;
        if (!z || !this.i || this.h) {
            if (z || !this.h) {
                return;
            }
            this.h = false;
            gzs<s3q0> gzsVar = this.f;
            if (gzsVar != null) {
                gzsVar.invoke();
                return;
            }
            return;
        }
        this.h = true;
        this.e.invoke();
        if (this.d) {
            View view = this.b;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
                viewTreeObserver.removeOnScrollChangedListener(this);
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public final float c() {
        View view = this.b;
        if (!view.isShown() || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (!view.getGlobalVisibleRect(this.g)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float height = view.getHeight() * view.getWidth();
        if (height < 1.0f) {
            height = 1.0f;
        }
        return swe0.f((r1.height() * r1.width()) / height, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        b();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        b();
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(this);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
