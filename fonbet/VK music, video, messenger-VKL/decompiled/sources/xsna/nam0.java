package xsna;

import android.animation.ValueAnimator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: StoryProgressAnimator.kt */
/* loaded from: classes4.dex */
public final class nam0 extends ValueAnimator {
    public a c;
    public boolean d;
    public boolean e;
    public final long b = 500;
    public final oam0 f = new oam0(this);

    /* compiled from: StoryProgressAnimator.kt */
    public interface a {
        boolean a();

        void b();

        void c();

        void d(float f, long j);

        void onStart();
    }

    public nam0() {
        setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    }

    public final void a(final long j, final a aVar) {
        addListener(this.f);
        this.c = aVar;
        setDuration(j >= 7000 ? 5000L : 3000L);
        addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.mam0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aVar.d(floatValue, (long) (j * floatValue));
            }
        });
    }
}
