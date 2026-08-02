package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.editor.common.cadre.CadreTarget;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.stories.design.view.viewer.StoryUploadIndicatorView;
import one.video.view.OneVideoPlayerView;

/* compiled from: CadreSizeStoryViewDelegate.kt */
/* loaded from: classes6.dex */
public final class jz8 {
    public final q7r a;
    public final Rect b = new Rect(cn70.b(12), cn70.b(6), cn70.b(12), cn70.b(6));

    public jz8(q7r q7rVar) {
        this.a = q7rVar;
    }

    public final void a(iz8 iz8Var) {
        float f = iz8Var.d;
        q7r q7rVar = this.a;
        StoryBottomViewGroup storyBottomViewGroup = q7rVar.G;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float controlsHeight = storyBottomViewGroup != null ? storyBottomViewGroup.getControlsHeight() : 0.0f;
        float a = cn70.a() * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f >= controlsHeight + a) {
            a = -((f - controlsHeight) - a);
        } else if (f >= controlsHeight) {
            a = 0.0f;
        } else if (f < controlsHeight - a) {
            a = -f;
        }
        StoryBottomViewGroup storyBottomViewGroup2 = q7rVar.G;
        if (storyBottomViewGroup2 != null) {
            storyBottomViewGroup2.setCadreBottomOffset((int) f);
        }
        StoryBottomViewGroup storyBottomViewGroup3 = q7rVar.G;
        if (storyBottomViewGroup3 != null) {
            storyBottomViewGroup3.setTranslationY(a);
        }
        StoryUploadIndicatorView storyUploadIndicatorView = q7rVar.H;
        if (storyUploadIndicatorView != null) {
            storyUploadIndicatorView.setTranslationY(a);
        }
        View view = q7rVar.F;
        if (view != null) {
            view.setTranslationY(a);
        }
        ImageView imageView = q7rVar.C;
        if (imageView != null) {
            int i = 0;
            imageView.setOutlineProvider(new hz8(false, iz8Var.f));
            imageView.setClipToOutline(true);
            boolean z = a == (-f);
            Rect rect = this.b;
            if (z) {
                StoryBottomViewGroup storyBottomViewGroup4 = q7rVar.G;
                rect.bottom = Math.max(storyBottomViewGroup4 != null ? storyBottomViewGroup4.getControlsHeight() : 0, rect.bottom);
                f2 = a;
            } else {
                i = Math.round(f);
            }
            imageView.setTranslationY(f2);
            imageView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            f4m.q(i, imageView);
        }
    }

    public final void b(View view, iz8 iz8Var) {
        if (view == null) {
            return;
        }
        hz8 c = this.a.i0.getDependencies().j.c(iz8Var);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i = iz8Var.a;
        float f = iz8Var.c;
        layoutParams.width = i;
        layoutParams.height = iz8Var.b;
        view.setLayoutParams(layoutParams);
        if (view instanceof OneVideoPlayerView) {
            f4m.t((int) f, view);
        } else {
            view.setTranslationY((int) f);
        }
        f4m.s((int) iz8Var.h, view);
        view.setOutlineProvider(c);
        view.setClipToOutline(true);
    }

    public final iz8 c(int i, int i2, boolean z) {
        mkm0 mkm0Var = this.a.i0;
        kz8 kz8Var = mkm0Var.getDependencies().j;
        iz8 d = kz8Var.d(mkm0Var, kz8Var.a(mkm0Var.getContext()), CadreTarget.VIEWER, false);
        return (!z || ((float) d.b) <= ((float) i2) * 1.1f) ? d : new iz8(i, i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
    }
}
