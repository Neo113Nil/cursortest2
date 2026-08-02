package xsna;

import android.util.Size;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.di.VideoPlaybackSpeedComponentImpl;
import kotlinx.serialization.KSerializer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j1t0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ j1t0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                bpn0 bpn0Var = VideoOverlayView.I;
                return Integer.valueOf(iah0.a(28));
            case 1:
                qcy<Object>[] qcyVarArr = VideoPlaybackSpeedComponentImpl.b;
                return fxc0.B().J().I1() ? new u3t0() : new t3t0();
            case 2:
                return new z6t0();
            case 3:
                return Boolean.valueOf(fxc0.B().i().f());
            case 4:
                return new rpj(fpf0.a(Size.class), null, new KSerializer[0]);
            default:
                return com.vk.voip.ui.c.K0;
        }
    }
}
