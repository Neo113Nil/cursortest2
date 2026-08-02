package xsna;

import android.view.View;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;

/* compiled from: VideoTextureViewHolder.kt */
/* loaded from: classes17.dex */
public final class vjt0 {
    public View a;
    public final VideoTextureView b;

    public vjt0(VideoTextureView videoTextureView) {
        this.b = videoTextureView;
    }

    public final VideoTextureView a() {
        View view = this.a;
        VideoTextureView videoTextureView = this.b;
        if (view != null) {
            videoTextureView.addView(view);
            this.a = null;
        }
        return videoTextureView;
    }
}
