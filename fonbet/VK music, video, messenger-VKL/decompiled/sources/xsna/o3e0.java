package xsna;

import android.graphics.drawable.AnimationDrawable;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stories.design.view.StoryProgressView;
import com.vkontakte.android.R;
import xsna.umm0;

/* compiled from: ProgressStrategy.kt */
/* loaded from: classes6.dex */
public abstract class o3e0 {
    public final qap a = new qap();

    /* compiled from: ProgressStrategy.kt */
    public static abstract class a extends o3e0 {
        public final umm0.a b;
        public final boolean c;
        public final boolean d;

        /* compiled from: ProgressStrategy.kt */
        /* renamed from: xsna.o3e0$a$a, reason: collision with other inner class name */
        public static final class C3439a extends a {
            @Override // xsna.o3e0
            public final long a() {
                return this.a.a();
            }

            @Override // xsna.o3e0
            public final float b() {
                return this.a.a() / 5000;
            }

            @Override // xsna.o3e0
            public final int c() {
                return 5000;
            }
        }

        /* compiled from: ProgressStrategy.kt */
        public static final class b extends a {
            public final umm0.a e;
            public final x3t0 f;

            public b(umm0.a aVar, x3t0 x3t0Var, boolean z, boolean z2) {
                super(aVar, z, z2);
                this.e = aVar;
                this.f = x3t0Var;
            }

            @Override // xsna.o3e0
            public final long a() {
                return this.f.getCurrentPosition();
            }

            @Override // xsna.o3e0
            public final float b() {
                x3t0 x3t0Var = this.f;
                float currentPosition = x3t0Var.getCurrentPosition();
                float duration = x3t0Var.getDuration();
                return (currentPosition <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || duration <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : currentPosition / duration;
            }

            @Override // xsna.o3e0
            public final int c() {
                VideoFile videoFile;
                StoryEntry currentStory = this.e.getCurrentStory();
                if (currentStory == null || (videoFile = currentStory.n) == null) {
                    return 0;
                }
                return videoFile.getDuration() * 1000;
            }

            @Override // xsna.o3e0
            public final void e(long j) {
                this.e.setCurrentStorySeekMs(j);
            }

            @Override // xsna.o3e0
            public final void f() {
                int q;
                umm0.a aVar = this.e;
                StoryEntry currentStory = aVar.getCurrentStory();
                if ((currentStory != null ? currentStory.n : null) == null || (q = rli0.q(rli0.j(new i5g(aVar.getStoriesContainer().g), new j0r(23)), currentStory)) == -1) {
                    return;
                }
                this.f.seekTo(q);
            }
        }

        public a(umm0.a aVar, boolean z, boolean z2) {
            this.b = aVar;
            this.c = z;
            this.d = z2;
        }

        @Override // xsna.o3e0
        public final void d(StoryProgressView storyProgressView) {
            StoryEntry currentStory;
            if (this.c) {
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                boolean z = this.d;
                if (!z && (currentStory = this.b.getCurrentStory()) != null) {
                    f = Math.min(Math.max((currentStory.i * 1.0f) / 100.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 1.0f);
                }
                long c = (long) (f * c());
                qap qapVar = this.a;
                if (qapVar.d) {
                    qapVar.c = SystemClock.elapsedRealtime() - c;
                } else {
                    qapVar.a = c;
                }
                if (storyProgressView != null) {
                    bwt0.p0(storyProgressView, true);
                }
                if (!z && storyProgressView != null) {
                    storyProgressView.k = true;
                    AnimationDrawable animationDrawable = (AnimationDrawable) m33.a(R.drawable.one_time_sparks, storyProgressView.getContext());
                    storyProgressView.m = animationDrawable;
                    if (animationDrawable != null) {
                        storyProgressView.n = animationDrawable.getDuration(0);
                        storyProgressView.m.start();
                    }
                }
                e(c);
            }
        }

        @Override // xsna.o3e0
        public final void g(int i, StoryProgressView storyProgressView) {
            if (storyProgressView != null) {
                bwt0.p0(storyProgressView, true);
                storyProgressView.setSectionCount(this.b.getSectionsCount());
                storyProgressView.setCurrentSection(i);
            }
        }
    }

    /* compiled from: ProgressStrategy.kt */
    public static final class b extends o3e0 {
        public static final b b = new b();

        @Override // xsna.o3e0
        public final long a() {
            return 0L;
        }

        @Override // xsna.o3e0
        public final float b() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // xsna.o3e0
        public final int c() {
            return 0;
        }

        @Override // xsna.o3e0
        public final void g(int i, StoryProgressView storyProgressView) {
            if (storyProgressView != null) {
                storyProgressView.setSectionCount(0);
                storyProgressView.setCurrentSection(0);
                bwt0.p0(storyProgressView, false);
            }
        }
    }

    public abstract long a();

    public abstract float b();

    public abstract int c();

    public abstract void g(int i, StoryProgressView storyProgressView);

    public void f() {
    }

    public void d(StoryProgressView storyProgressView) {
    }

    public void e(long j) {
    }
}
