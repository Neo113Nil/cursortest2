package xsna;

import android.graphics.Bitmap;
import com.vk.libvideo.design.view.video.VideoView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bqt0 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ VideoView c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ bqt0(VideoView videoView, boolean z, boolean z2) {
        this.b = z;
        this.c = videoView;
        this.d = z2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        qcy<Object>[] qcyVarArr = VideoView.T0;
        boolean z = this.b;
        VideoView videoView = this.c;
        if (z) {
            videoView.getViewBinding().d.setColorFilter(videoView.getContext().getColor(this.d ? R.color.video_restriction_blur_color_filter : R.color.vk_black_alpha60));
        }
        videoView.post(new oo6(videoView, 13));
        videoView.getViewBinding().d.setImageBitmap(bitmap);
        return s3q0.a;
    }
}
