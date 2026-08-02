package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.models.history.ForceLogReason;
import com.vk.media.player.VideoMode;
import java.util.ArrayList;
import java.util.List;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: AutoPlay.kt */
/* loaded from: classes2.dex */
public interface yg5 {
    static /* synthetic */ void o0(yg5 yg5Var, String str, String str2, String str3, boolean z, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            z = yg5Var.V();
        }
        yg5Var.n0(str, str2, str3, z);
    }

    VideoFile A();

    void A0(boolean z);

    boolean B();

    q7s0 B0();

    void C(boolean z);

    default boolean C0() {
        return false;
    }

    void D();

    boolean D0();

    void E();

    void F();

    void F0();

    boolean G();

    void G0(boolean z);

    void H();

    void I();

    boolean I0();

    boolean J();

    boolean J0();

    void K();

    void K0(boolean z);

    void L(VideoMode videoMode);

    boolean M();

    boolean M0();

    void N(VideoFile videoFile);

    je0 N0();

    void O();

    List<one.video.player.tracks.b> O0();

    default long P() {
        return 0L;
    }

    boolean P0();

    void Q(boolean z);

    void R();

    AutoPlayMinifiedState R0();

    void S(boolean z);

    void T(hnt0 hnt0Var);

    void U();

    boolean V();

    OneVideoPlaybackException.ErrorCode W();

    void X();

    void Y(String str);

    void Z(int i);

    boolean a();

    void a0(com.vk.libvideo.autoplay.a aVar);

    float b();

    void b0(VideoTextureView videoTextureView);

    void c();

    boolean d();

    String d0();

    void e();

    void e0(ArrayList arrayList);

    void f();

    void f0(hnt0 hnt0Var);

    int g0();

    com.vk.libvideo.autoplay.a getConfig();

    long getDuration();

    long getPosition();

    float getVolume();

    wgt0 h0();

    int i0();

    boolean isPaused();

    boolean isPlaying();

    boolean isPrepared();

    boolean isReady();

    boolean j0(VideoTextureView videoTextureView);

    void k0();

    void l0();

    rlt0 m0();

    void n0(String str, String str2, String str3, boolean z);

    boolean p();

    boolean p0();

    void pause();

    void play();

    String q();

    void q0(String str);

    void r0(boolean z);

    void release();

    void s0(String str);

    void seek(long j);

    void setMediaRouteConnectStatus(MediaRouteConnectStatus mediaRouteConnectStatus);

    void setPlaybackSpeed(float f);

    void setVolume(float f);

    void stop();

    boolean t0();

    boolean u0();

    boolean v();

    d3b0 v0();

    boolean w0();

    void x0(ForceLogReason forceLogReason);

    void y0(long j);

    void z0(VideoTextureView videoTextureView, com.vk.libvideo.autoplay.a aVar, RecyclerView.e0 e0Var);

    default void c0() {
    }
}
