package xsna;

import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.player.OneVideoPlayer;
import one.video.player.model.FrameSize;

/* compiled from: PlayerFactory.kt */
/* loaded from: classes3.dex */
public interface o1b0 {
    public static final a a = a.a;

    /* compiled from: PlayerFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final FrameSize b = FrameSize._480p;
    }

    static /* synthetic */ void b(o1b0 o1b0Var, sht0 sht0Var, int i) {
        if ((i & 1) != 0) {
            sht0Var = null;
        }
        o1b0Var.e(sht0Var);
    }

    static d3b0 g(o1b0 o1b0Var, m7q m7qVar, fuk0 fuk0Var, boolean z, boolean z2, izs izsVar, List list, int i) {
        return o1b0Var.i(m7qVar, fuk0Var, z, z2, izsVar, null, (i & 64) != 0 ? EmptyList.b : list, false, null, null);
    }

    OneVideoPlayer a(sht0 sht0Var);

    void c(VideoTextureView videoTextureView, d3b0 d3b0Var);

    int d();

    void e(sht0 sht0Var);

    void f(sht0 sht0Var, boolean z);

    pzf getCodecInfo();

    void h(sht0 sht0Var, sht0 sht0Var2);

    d3b0 i(m7q m7qVar, fuk0 fuk0Var, boolean z, boolean z2, izs izsVar, VideoAutoPlay.j jVar, List list, boolean z3, z0d0 z0d0Var, mm80 mm80Var);

    void j(int i);

    int k();

    d3b0 l(sht0 sht0Var);
}
