package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.tracker.VideoPlayerMode;
import com.vk.media.player.VideoMode;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoMiniPlayerHolder.kt */
/* loaded from: classes3.dex */
public final class rts0 implements w8i {
    public static final rts0 b;
    public static yg5 c;
    public static final bpn0 d;

    /* compiled from: VideoMiniPlayerHolder.kt */
    public static final class a {
        public static void a(yg5 yg5Var, VideoMinimizableState videoMinimizableState) {
            if (yg5Var != null) {
                if (!(videoMinimizableState instanceof VideoMinimizableState.Pip)) {
                    c63 c63Var = c63.a;
                    if (!c63.f) {
                        return;
                    }
                }
                VideoPlayerMode videoPlayerMode = videoMinimizableState instanceof VideoMinimizableState.Collapsed ? VideoPlayerMode.MINIMIZED : videoMinimizableState instanceof VideoMinimizableState.Expanded ? VideoPlayerMode.DISCOVERY : videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal ? VideoPlayerMode.FULLSCREEN_LANDSCAPE : videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical ? VideoPlayerMode.FULLSCREEN_PORTRAIT : (videoMinimizableState.equals(VideoMinimizableState.Pip.b) && BuildInfo.q()) ? VideoPlayerMode.PIP_EXTERNAL : null;
                if (videoPlayerMode == null || !(yg5Var instanceof VideoAutoPlay)) {
                    return;
                }
                i0q0.j(new tou(5, videoPlayerMode, yg5Var));
            }
        }
    }

    static {
        rts0 rts0Var = new rts0();
        b = rts0Var;
        d = new bpn0(new w5k0(5));
        ver0.a(rts0Var.a().y(500L, TimeUnit.MILLISECONDS).subscribe(new fv70(new nc90(26), 28)));
        ver0.a(rts0Var.a().subscribe(new u0o0(new i0r(27), 5)));
    }

    public final io.reactivex.rxjava3.subjects.d<VideoMinimizableState> a() {
        return (io.reactivex.rxjava3.subjects.d) d.getValue();
    }

    public final void b(yg5 yg5Var) {
        c = yg5Var;
        VideoMinimizableState P0 = a().P0();
        VideoMode videoMode = com.vk.libvideo.api.minimizable.a.g(P0) ? VideoMode.FULLSCREEN : P0 instanceof VideoMinimizableState.Expanded ? VideoMode.EMPTY : P0 instanceof VideoMinimizableState.Collapsed ? VideoMode.MINIMIZED : null;
        if (yg5Var != null && videoMode != null) {
            yg5Var.L(videoMode);
        }
        a.a(yg5Var, a().P0());
    }
}
