package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventScreenMode;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventSource;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarView2;
import java.util.concurrent.TimeUnit;
import xsna.z3s0;

/* compiled from: VideoAutoPlaySeekBarControllerLazy.kt */
/* loaded from: classes16.dex */
public final class y3s0 implements VideoAutoPlaySeekBarView2.b {
    public final /* synthetic */ gh5 a;

    public y3s0(gh5 gh5Var) {
        this.a = gh5Var;
    }

    @Override // com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarView2.b
    public final void b(VideoAutoPlaySeekBarView2 videoAutoPlaySeekBarView2, int i) {
        z3s0.a b;
        fh5 fh5Var = this.a.a;
        if (i != videoAutoPlaySeekBarView2.getProgress()) {
            float w0 = bwt0.w0(videoAutoPlaySeekBarView2, i);
            yg5 yg5Var = fh5Var.j;
            if (yg5Var == null) {
                yg5Var = null;
            }
            long c = an10.c(yg5Var.getDuration() * w0);
            j3i0 j3i0Var = fh5Var.F;
            if (j3i0Var != null && (b = j3i0Var.b()) != null) {
                yg5 yg5Var2 = fh5Var.j;
                if (yg5Var2 == null) {
                    yg5Var2 = null;
                }
                VideoFile A = yg5Var2.A();
                z3s0.this.b.a(new yet0(Long.valueOf(A.o0()), A.I0(), A.r()), VideoSeekEventSource.Slider, VideoSeekEventScreenMode.Preview, TimeUnit.MILLISECONDS.toSeconds(c));
            }
            yg5 yg5Var3 = fh5Var.j;
            if (yg5Var3 == null) {
                yg5Var3 = null;
            }
            yg5Var3.seek(c);
        }
        yg5 yg5Var4 = fh5Var.j;
        (yg5Var4 != null ? yg5Var4 : null).play();
    }

    @Override // com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarView2.b
    public final void c(VideoAutoPlaySeekBarView2 videoAutoPlaySeekBarView2, int i) {
        yg5 yg5Var = this.a.a.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        yg5Var.C(true);
    }

    @Override // com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarView2.b
    public final void a(VideoAutoPlaySeekBarView2 videoAutoPlaySeekBarView2, int i) {
    }
}
