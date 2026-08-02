package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.StoryProgressView;

/* compiled from: FadeAnimationDelegate.kt */
/* loaded from: classes4.dex */
public final class eiq {
    public final StoryProgressView a;
    public final diq b = new diq(this);
    public gzs<s3q0> c;
    public gzs<s3q0> d;

    public eiq(StoryProgressView storyProgressView) {
        this.a = storyProgressView;
    }

    public final void a(gzs<s3q0> gzsVar) {
        this.d = null;
        this.c = gzsVar;
        this.a.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).setListener(this.b).start();
    }

    public final void b(gzs<s3q0> gzsVar) {
        this.d = gzsVar;
        this.c = null;
        this.a.animate().alpha(1.0f).setDuration(300L).setListener(this.b).start();
    }
}
