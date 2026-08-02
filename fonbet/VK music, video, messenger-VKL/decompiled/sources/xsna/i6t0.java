package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vkontakte.android.R;

/* compiled from: VideoPreviewView.kt */
/* loaded from: classes2.dex */
public final class i6t0 extends FrameLayout {
    public final VkEnhancedImageView b;
    public final TextView c;
    public final InteractiveDurationView d;
    public final ViewGroup e;
    public final VideoOverlayView f;

    public i6t0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.im_video_attach_preview, this);
        VkEnhancedImageView vkEnhancedImageView = (VkEnhancedImageView) findViewById(R.id.image);
        this.b = vkEnhancedImageView;
        this.c = (TextView) findViewById(R.id.duration);
        this.d = (InteractiveDurationView) findViewById(R.id.interactive_duration);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.history_attach_video_restriction_container);
        this.e = viewGroup;
        VideoOverlayView videoOverlayView = new VideoOverlayView(context, null, new VideoOverlayView.d(cn70.b(8)), 6);
        this.f = videoOverlayView;
        viewGroup.addView(videoOverlayView);
        vkEnhancedImageView.setCornerRadius(cn70.c(2));
    }

    public final TextView getDurationView() {
        return this.c;
    }

    public final VkEnhancedImageView getImageView() {
        return this.b;
    }

    public final InteractiveDurationView getInteractiveDurationView() {
        return this.d;
    }

    public final VideoOverlayView getOverlayView() {
        return this.f;
    }

    public final ViewGroup getOverlayViewContainer() {
        return this.e;
    }
}
