package xsna;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;

/* compiled from: ClipsFeedScrollTooltipDelegate.kt */
/* loaded from: classes17.dex */
public final class w8e {
    public final ClipsWrapperFragment a;
    public boolean b;
    public boolean c;
    public final DecelerateInterpolator d = new DecelerateInterpolator(1.0f);

    /* compiled from: ClipsFeedScrollTooltipDelegate.kt */
    public static final class a {
        public final long a;
        public final int b;
        public final Interpolator c;
        public final Interpolator d;

        public a(long j, int i, DecelerateInterpolator decelerateInterpolator, DecelerateInterpolator decelerateInterpolator2) {
            this.a = j;
            this.b = i;
            this.c = decelerateInterpolator;
            this.d = decelerateInterpolator2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + shy.a(this.b, bh10.a(shy.a(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, Integer.hashCode(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS) * 31, 31), 31, this.a), 31)) * 31);
        }

        public final String toString() {
            return "ScrollParams(scrollAppearingDurationMillis=750, scrollDisappearingDurationMillis=750, holdDurationMillis=" + this.a + ", scrollDist=" + this.b + ", showInterpolator=" + this.c + ", hideInterpolator=" + this.d + ')';
        }
    }

    public w8e(ClipsWrapperFragment clipsWrapperFragment) {
        this.a = clipsWrapperFragment;
    }
}
