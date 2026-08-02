package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import one.video.player.OneVideoPlayer;

/* compiled from: AutoPlayState.kt */
/* loaded from: classes16.dex */
public final class ii5 {
    public static final gi5 a(yg5 yg5Var) {
        OneVideoPlayer a;
        VideoFile A = yg5Var.A();
        d3b0 v0 = yg5Var.v0();
        one.video.player.tracks.b Q = (v0 == null || (a = v0.a()) == null) ? null : a.Q();
        boolean z = !yg5Var.O0().isEmpty();
        boolean isPlaying = yg5Var.isPlaying();
        boolean w0 = yg5Var.w0();
        AutoPlayMinifiedState R0 = yg5Var.R0();
        boolean v = yg5Var.v();
        return new gi5(A, yg5Var.B(), v, yg5Var.p0(), false, R0, yg5Var.J(), yg5Var.W(), yg5Var.a(), yg5Var.d(), isPlaying, yg5Var.M(), yg5Var.isPaused(), yg5Var.p(), yg5Var.getPosition(), yg5Var.getDuration(), yg5Var.i0(), Q, z, yg5Var.getVolume(), yg5Var.P0(), w0, 235405318);
    }

    public static final gi5 b(gi5 gi5Var, yg5 yg5Var) {
        VideoFile A = yg5Var.A();
        boolean isPlaying = yg5Var.isPlaying();
        boolean w0 = yg5Var.w0();
        AutoPlayMinifiedState R0 = yg5Var.R0();
        boolean v = yg5Var.v();
        boolean B = yg5Var.B();
        boolean J = yg5Var.J();
        boolean a = yg5Var.a();
        boolean P0 = yg5Var.P0();
        boolean M = yg5Var.M();
        boolean isPaused = yg5Var.isPaused();
        boolean p = yg5Var.p();
        boolean d = yg5Var.d();
        return gi5.a(gi5Var, A, null, null, B, v, yg5Var.p0(), false, R0, J, yg5Var.W(), a, d, isPlaying, M, isPaused, p, yg5Var.getPosition(), yg5Var.getDuration(), yg5Var.i0(), null, null, yg5Var.getVolume(), P0, w0, null, null, false, 238551046);
    }
}
