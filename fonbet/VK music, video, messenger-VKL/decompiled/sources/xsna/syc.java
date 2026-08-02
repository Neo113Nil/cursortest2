package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.syc;

/* compiled from: ClipFeedOnboardingDelegate.kt */
/* loaded from: classes17.dex */
public final class syc {
    public final w8e a;
    public final bd80 b;
    public final boolean c;
    public View d;
    public oyc e;
    public boolean f;
    public a g;
    public FeedItem.d h;
    public boolean i;

    /* compiled from: ClipFeedOnboardingDelegate.kt */
    public static abstract class a {
        public final int a;
        public final long b;

        /* compiled from: ClipFeedOnboardingDelegate.kt */
        /* renamed from: xsna.syc$a$a, reason: collision with other inner class name */
        public static final class C3705a extends a {
            public static final C3705a c = new C3705a(R.layout.clip_onboarding_author, 500);
        }

        /* compiled from: ClipFeedOnboardingDelegate.kt */
        public static final class b extends a {
        }

        /* compiled from: ClipFeedOnboardingDelegate.kt */
        public static final class c extends a {
            public final long c;

            public c(long j) {
                super(R.layout.clips_fast_forward_onboarding, 0L);
                this.c = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.c == ((c) obj).c;
            }

            public final int hashCode() {
                return Long.hashCode(this.c);
            }

            public final String toString() {
                return vu5.a(')', this.c, new StringBuilder("FastForward(sessionId="));
            }
        }

        /* compiled from: ClipFeedOnboardingDelegate.kt */
        public static final class d extends a {
            public static final d c = new d(R.layout.clip_onboarding_double_tap_view, 0);
        }

        /* compiled from: ClipFeedOnboardingDelegate.kt */
        public static final class e extends a {
            public e() {
                super(R.layout.clip_onboarding_scroll_animation, 0L);
            }
        }

        /* compiled from: ClipFeedOnboardingDelegate.kt */
        public static final class f extends a {
            public static final f c = new f(R.layout.clip_onboarding_viewer, 500);
        }

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public syc(w8e w8eVar, bd80 bd80Var, boolean z) {
        this.a = w8eVar;
        this.b = bd80Var;
        this.c = z;
    }

    public static AnimatorSet a(View view, Property property) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f).setDuration(0L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.77f).setDuration(250L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.92f).setDuration(200L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.77f).setDuration(130L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f).setDuration(250L));
        return animatorSet;
    }

    public static AnimatorSet b(View view, Property property, float f) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(0L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f).setDuration(250L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.85f * f).setDuration(200L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f).setDuration(130L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(250L));
        return animatorSet;
    }

    public final void c(ViewGroup viewGroup) {
        View view = this.d;
        if (view != null) {
            cp2.d(view, 250L, null, null, 30);
            if (viewGroup != null) {
                viewGroup.removeView(this.d);
            }
            this.d = null;
        }
        if (this.f) {
            oyc oycVar = this.e;
            if (oycVar != null) {
                if (viewGroup != null) {
                    viewGroup.removeCallbacks(oycVar);
                }
                this.e = null;
            }
            this.a.a.uo(true);
            this.f = false;
        }
    }

    public final void d() {
        View view = this.d;
        if (view != null) {
            cp2.d(view, 250L, new jk9(this, 1), null, 26);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Runnable, xsna.oyc] */
    public final void e(final ViewGroup viewGroup, final q8e q8eVar, final a aVar) {
        if (this.f) {
            return;
        }
        this.f = true;
        this.g = aVar;
        ?? r0 = new Runnable() { // from class: xsna.oyc
            @Override // java.lang.Runnable
            public final void run() {
                ViewGroup viewGroup2 = viewGroup;
                LayoutInflater from = LayoutInflater.from(viewGroup2.getContext());
                syc.a aVar2 = aVar;
                View inflate = from.inflate(aVar2.a, (ViewGroup) null);
                inflate.setId(View.generateViewId());
                inflate.setLayoutParams(new ConstraintLayout.b(-1, -1));
                syc sycVar = this;
                sycVar.d = inflate;
                viewGroup2.addView(inflate);
                viewGroup2.post(new pyc(aVar2, sycVar, viewGroup2, q8eVar, inflate, 0));
            }
        };
        this.e = r0;
        viewGroup.postDelayed(r0, aVar.b);
    }

    public final void f(View view, long j, Integer num) {
        ((VkText) view.findViewById(R.id.title)).setText(num.intValue());
        cp2.c(view, 250L, j, new qyc(0, view, this), null, 8);
    }
}
