package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.ui.CircularProgressView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.newsfeed.common.views.video.VideoAutoPlayHolderView;
import com.vk.stories.design.view.StoryProgressView;
import com.vkontakte.android.R;

/* compiled from: InterestingStoriesBlockVideoItemHolderView.kt */
/* loaded from: classes4.dex */
public final class xex extends RatioFrameLayout implements cex {
    public final VideoTextureView e;
    public final FrescoImageView f;
    public final VideoOverlayView g;
    public final VideoErrorView h;
    public final CircularProgressView i;
    public final StoryProgressView j;
    public final AppCompatImageView k;
    public final TextView l;

    public xex(Context context) {
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
        ImageView b2 = super.b(context);
        this.k = (AppCompatImageView) b2;
        addView(b2);
        TextView d2 = super.d(context);
        this.l = d2;
        addView(d2);
    }

    public final TextView getVideoAuthor() {
        return this.l;
    }

    public final VideoTextureView getVideoDisplay() {
        return this.e;
    }

    public final VideoErrorView getVideoError() {
        return this.h;
    }

    public final ImageView getVideoLike() {
        return this.k;
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
