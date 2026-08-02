package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.log.L;
import org.webrtc.VideoFrame;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.screenshare.recv.DecoderWrapper$DecodedFrameCallback;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareReceiver;
import ru.ok.gl.util.FrameHolder;
import ru.ok.segmentation_full.pipeline.PipelineFull;
import ru.ok.tensorflow.util.Producer;
import xsna.r100;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class j1d implements u6d, Producer, b680, DecoderWrapper$DecodedFrameCallback, yads.og1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j1d(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // yads.og1
    public void a(Object obj, yads.ew0 ew0Var) {
        ((yads.kb0) this.b).a((yads.pf2) this.c, (yads.af) obj, ew0Var);
    }

    @Override // ru.ok.tensorflow.util.Producer
    public Object apply() {
        Bitmap lambda$process$0;
        lambda$process$0 = ((PipelineFull) this.b).lambda$process$0((FrameHolder) this.c);
        return lambda$process$0;
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.recv.DecoderWrapper$DecodedFrameCallback
    public void deliver(VideoFrame videoFrame) {
        ((ScreenshareReceiver) this.b).a((CallParticipant.ParticipantId) this.c, videoFrame);
    }

    @Override // xsna.b680
    public void onFailure(Throwable th) {
        arg0 arg0Var = (arg0) this.b;
        io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) this.c;
        L.l("InAppReview", fo8.a(arg0Var.f, ": Review flow completed with error"), mnh0.A(new r100.a("InAppReviewException", th)));
        yVar.onError(arg0.a(th));
    }

    @Override // xsna.u6d
    public void a(ClipItemViewEvent clipItemViewEvent) {
        o1d.t((o1d) this.b, (Context) this.c, clipItemViewEvent);
    }
}
