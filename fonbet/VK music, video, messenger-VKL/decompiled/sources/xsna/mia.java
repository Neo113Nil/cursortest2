package xsna;

import com.vk.libvideo.api.di.VideoTimerComponent;
import com.vk.voip.stereo.api.common.di.VoipStereoRouterComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class mia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ mia(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (VideoTimerComponent) this.c.a(fpf0.a(VideoTimerComponent.class));
            default:
                return (VoipStereoRouterComponent) this.c.a(fpf0.a(VoipStereoRouterComponent.class));
        }
    }
}
