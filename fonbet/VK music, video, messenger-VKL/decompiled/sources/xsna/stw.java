package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import com.unity3d.services.UnityAdsConstants;
import xsna.xn6;

/* compiled from: IndeterminateSpinnerDrawable.kt */
/* loaded from: classes.dex */
public final class stw extends xn6 implements Animatable {
    public static final LinearInterpolator h = new LinearInterpolator();
    public static final ilq i = new ilq();
    public final ProgressBar d;
    public float e;
    public float f;
    public final rtw g;

    public stw(ProgressBar progressBar) {
        this.d = progressBar;
        rtw rtwVar = new rtw(this);
        rtwVar.setRepeatCount(-1);
        rtwVar.setRepeatMode(1);
        rtwVar.setInterpolator(h);
        rtwVar.setAnimationListener(new qtw(this));
        this.g = rtwVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        try {
            canvas.rotate(this.e, bounds.exactCenterX(), bounds.exactCenterY());
            this.b.a(canvas, bounds);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return true;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        rtw rtwVar;
        ProgressBar progressBar = this.d;
        if (qq2.d(progressBar.getContext()) || (rtwVar = this.g) == null) {
            return;
        }
        rtwVar.reset();
        xn6.a aVar = this.b;
        aVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rtwVar.setDuration(1332L);
        progressBar.startAnimation(rtwVar);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d.clearAnimation();
        xn6.a aVar = this.b;
        aVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
