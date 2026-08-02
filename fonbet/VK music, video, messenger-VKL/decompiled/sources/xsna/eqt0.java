package xsna;

import com.vk.libvideo.design.view.video.VideoView;

/* compiled from: VideoView.kt */
/* loaded from: classes2.dex */
public final class eqt0 implements ebs0 {
    public final /* synthetic */ VideoView b;

    public eqt0(VideoView videoView) {
        this.b = videoView;
    }

    @Override // xsna.ebs0
    public final void bk(dbs0 dbs0Var) {
        ebs0 videoClickActionCallback = this.b.getVideoClickActionCallback();
        if (videoClickActionCallback != null) {
            videoClickActionCallback.bk(dbs0Var);
        }
    }
}
