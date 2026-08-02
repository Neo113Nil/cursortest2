package xsna;

import com.vk.libvideo.design.view.video.VideoView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.transform.TransformController;

/* compiled from: VideoView.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class gqt0 extends FunctionReferenceImpl implements izs<TransformController.ScaleType, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(TransformController.ScaleType scaleType) {
        TransformController.ScaleType scaleType2 = scaleType;
        VideoView videoView = (VideoView) this.receiver;
        qcy<Object>[] qcyVarArr = VideoView.T0;
        videoView.setVideoScaleType(scaleType2);
        videoView.j0(scaleType2);
        return s3q0.a;
    }
}
