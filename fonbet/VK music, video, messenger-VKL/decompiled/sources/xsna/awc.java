package xsna;

import android.view.View;
import android.widget.ProgressBar;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vkontakte.android.R;

/* compiled from: ClipFeedCommonOverlayContainer.kt */
/* loaded from: classes17.dex */
public final class awc {
    public final VideoTextureView a;
    public final VKImageView b;
    public final ProgressBar c;
    public final VideoErrorView d;
    public final c1u0 e;
    public final View f;

    public awc(twc twcVar) {
        this.a = (VideoTextureView) twcVar.findViewById(R.id.fullscreen_clip_overlay_video_display);
        VKImageView vKImageView = (VKImageView) twcVar.findViewById(R.id.fullscreen_preview_image);
        njt hierarchy = vKImageView.getHierarchy();
        hierarchy.p(hierarchy.b.getDrawable(R.drawable.bg_clip_error), 5);
        this.b = vKImageView;
        ProgressBar progressBar = (ProgressBar) twcVar.findViewById(R.id.fullscreen_clip_overlay_progress);
        progressBar.setIndeterminateDrawable(new m7d());
        this.c = progressBar;
        VideoErrorView videoErrorView = (VideoErrorView) twcVar.findViewById(R.id.fullscreen_clip_overlay_error);
        videoErrorView.setShouldBindOnlyWhenVisible(fxc0.B().J().O());
        this.d = videoErrorView;
        this.e = new c1u0(R.id.fullscreen_clip_overlay_play_pause_button_stub, R.layout.clip_fullscreen_play_pause_button_layout, twcVar);
        this.f = twcVar.findViewById(R.id.fullscreen_clip_overlay_bottom_border);
    }
}
