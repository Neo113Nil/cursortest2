package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.ui.CircularProgressView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.userstack.VkMiniUserStack;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.newsfeed.common.views.video.VideoAutoPlayHolderView;
import com.vk.stories.design.view.StoryProgressView;
import com.vkontakte.android.R;

/* compiled from: PhoneBookStoriesVideoItemHolderView.kt */
/* loaded from: classes4.dex */
public final class y2a0 extends RatioFrameLayout implements cex, s2a0 {
    public final VideoTextureView e;
    public final FrescoImageView f;
    public final VideoOverlayView g;
    public final VideoErrorView h;
    public final CircularProgressView i;
    public final StoryProgressView j;
    public final TextView k;
    public final VkButton l;
    public final VkText m;
    public final VkMiniUserStack n;
    public final VkText o;
    public final ConstraintLayout p;

    public y2a0(Context context) {
        super(context, null, 0);
        setId(R.id.video_wrap);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setContentDescription(context.getString(R.string.accessibility_video));
        setOrientation(0);
        VideoTextureView b = VideoAutoPlayHolderView.a.b(context);
        this.e = b;
        addView(b);
        FrescoImageView g = VideoAutoPlayHolderView.a.g(context);
        this.f = g;
        addView(g);
        VideoOverlayView e = VideoAutoPlayHolderView.a.e(context);
        this.g = e;
        addView(e);
        VideoErrorView c = VideoAutoPlayHolderView.a.c(context);
        this.h = c;
        addView(c);
        CircularProgressView d = VideoAutoPlayHolderView.a.d(context);
        this.i = d;
        addView(d);
        addView(super.c(context));
        StoryProgressView a = super.a(context);
        this.j = a;
        addView(a);
        addView(super.e(context));
        TextView d2 = super.d(context);
        this.k = d2;
        addView(d2);
        rud0 f = super.f(context);
        this.l = f.d;
        this.m = f.c;
        xzq0 xzq0Var = f.b;
        this.n = xzq0Var.b;
        this.o = xzq0Var.c;
        this.p = xzq0Var.a;
        addView(f.a);
    }

    @Override // xsna.s2a0
    public VkText getCountFriendsTextView() {
        return this.o;
    }

    @Override // xsna.s2a0
    public VkButton getProfileButton() {
        return this.l;
    }

    @Override // xsna.s2a0
    public VkText getUserNameView() {
        return this.m;
    }

    @Override // xsna.s2a0
    public VkMiniUserStack getUserStack() {
        return this.n;
    }

    @Override // xsna.s2a0
    public View getUserStackViewsContainer() {
        return this.p;
    }

    public final TextView getVideoAuthor() {
        return this.k;
    }

    public final VideoTextureView getVideoDisplay() {
        return this.e;
    }

    public final VideoErrorView getVideoError() {
        return this.h;
    }

    public final CircularProgressView getVideoLoader() {
        return this.i;
    }

    public final VideoOverlayView getVideoOverlay() {
        return this.g;
    }

    public final FrescoImageView getVideoPreview() {
        return this.f;
    }

    public final StoryProgressView getVideoProgress() {
        return this.j;
    }
}
