package xsna;

import android.view.Choreographer;
import org.webrtc.RenderSynchronizer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class qyf0 implements Choreographer.FrameCallback {
    public final /* synthetic */ RenderSynchronizer b;

    public /* synthetic */ qyf0(RenderSynchronizer renderSynchronizer) {
        this.b = renderSynchronizer;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.b.onDisplayRefreshCycleBegin(j);
    }
}
