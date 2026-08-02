package xsna;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.StoryProgressView;

/* compiled from: IdeasProgressDelegate.kt */
/* loaded from: classes6.dex */
public final class qsv {
    public final StoryProgressView a;
    public final fbh b;
    public final lrk c;
    public ValueAnimator d;
    public int e = -1;
    public boolean f;

    public qsv(StoryProgressView storyProgressView, fbh fbhVar, lrk lrkVar) {
        this.a = storyProgressView;
        this.b = fbhVar;
        this.c = lrkVar;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator == null) {
            return;
        }
        this.f = true;
        valueAnimator.cancel();
        this.f = false;
        this.d = null;
    }

    public final void b() {
        a();
        this.c.invoke(Integer.valueOf(this.e));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(8000L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new osv(this, 0));
        ofFloat.addListener(new psv(this));
        ofFloat.start();
        this.d = ofFloat;
    }
}
