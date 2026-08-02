package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.api.utils.ClipFeedScreenType;
import com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.picture.VkPicture;
import com.vkontakte.android.R;

/* compiled from: VideoBaseViewsContainerImpl.kt */
/* loaded from: classes17.dex */
public final class p5s0 implements o5s0 {
    public final ViewGroup a;
    public final VideoTextureViewAdapter b;
    public final VkBlurContentView c;
    public final RatioFrameLayout d;
    public final VkPicture e;
    public final vcg0 f;
    public final ProgressBar g;

    public p5s0(sjt0 sjt0Var, wcg0 wcg0Var, ViewGroup viewGroup) {
        this.a = viewGroup;
        tjt0 create = sjt0Var.create(viewGroup.getContext());
        this.b = create;
        VkBlurContentView vkBlurContentView = (VkBlurContentView) viewGroup.findViewById(R.id.fullscreen_video_base_blur_content);
        vkBlurContentView.setCaptureEnabled(false);
        this.c = vkBlurContentView;
        RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) viewGroup.findViewById(R.id.fullscreen_video_base_video_container);
        Context context = viewGroup.getContext();
        ClipFeedScreenType.Companion.getClass();
        ratioFrameLayout.setRatio(((ClipFeedScreenType.a.a(context, false) == ClipFeedScreenType.SQUARE) && (iah0.f().densityDpi >= 320)) ? 0.5625f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ratioFrameLayout.addView(create.getView(), 0);
        this.d = ratioFrameLayout;
        this.e = (VkPicture) viewGroup.findViewById(R.id.fullscreen_video_base_preview);
        otc0 create2 = wcg0Var.create(viewGroup.getContext());
        this.f = create2;
        ProgressBar progressBar = (ProgressBar) viewGroup.findViewById(R.id.fullscreen_video_base_loader);
        progressBar.setIndeterminateDrawable(new m7d());
        this.g = progressBar;
        ((VKReplacerView) viewGroup.findViewById(R.id.fullscreen_video_base_restriction_cover)).a(create2.b);
    }

    @Override // xsna.o5s0
    public final ViewGroup a() {
        return this.a;
    }

    @Override // xsna.o5s0
    public final vcg0 b() {
        return this.f;
    }

    @Override // xsna.o5s0
    public final VkPicture c() {
        return this.e;
    }

    @Override // xsna.o5s0
    public final RatioFrameLayout d() {
        return this.d;
    }

    @Override // xsna.o5s0
    public final VkBlurContentView e() {
        return this.c;
    }

    @Override // xsna.o5s0
    public final VideoTextureViewAdapter getVideoTextureViewAdapter() {
        return this.b;
    }

    @Override // xsna.o5s0
    public final ProgressBar m() {
        return this.g;
    }
}
