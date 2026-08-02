package xsna;

import android.view.View;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vkontakte.android.R;

/* compiled from: SimilarVideoHolder.kt */
/* loaded from: classes14.dex */
public final class ioj0 extends vfz<joj0> {
    public final h270 l;
    public final eoj0 m;
    public VideoFile n;

    public ioj0(View view) {
        super(view);
        VKImageView vKImageView = (VKImageView) view.findViewById(R.id.preview);
        VideoOverlayView videoOverlayView = (VideoOverlayView) view.findViewById(R.id.overlay);
        qcy<Object>[] qcyVarArr = bwt0.a;
        h270 h270Var = new h270(vKImageView, videoOverlayView, (int) view.getResources().getDimension(R.dimen.video_similar_corner_radius), null, false, null, null, 248);
        this.l = h270Var;
        this.m = new eoj0(fxc0.B(), h270Var, vKImageView, videoOverlayView, (DurationView) view.findViewById(R.id.duration), (InteractiveDurationView) view.findViewById(R.id.interactive_duration), null);
        jjc.g(view, new w910(this, 27));
    }

    @Override // xsna.vfz
    public final void W5(joj0 joj0Var) {
        joj0 joj0Var2 = joj0Var;
        VideoFile videoFile = joj0Var2.b;
        this.n = videoFile;
        this.m.a(new noj0(videoFile, joj0Var2.c, joj0Var2.d, null), null, false);
    }
}
