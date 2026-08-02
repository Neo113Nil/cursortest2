package xsna;

import com.vk.toggle.features.VideoFeatures;
import java.util.concurrent.ConcurrentHashMap;
import one.video.player.OneVideoPlayer;
import one.video.player.model.FrameSize;

/* compiled from: OneVideoPlayerExt.kt */
/* loaded from: classes3.dex */
public final class rm80 {
    public static final ConcurrentHashMap<String, String> a = new ConcurrentHashMap<>();

    public static final wgt0 a(d3b0 d3b0Var) {
        one.video.player.tracks.c E;
        cms0 cms0Var;
        OneVideoPlayer a2 = d3b0Var.a();
        return (a2 == null || (E = a2.E()) == null || (cms0Var = (cms0) E.c) == null) ? new wgt0(0, 0) : new wgt0(cms0Var.e, cms0Var.f);
    }

    public static final boolean b(d3b0 d3b0Var, m7q m7qVar) {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        boolean z = false;
        if (!com.vk.toggle.b.A.a(videoFeatures) ? !m7qVar.equals(d3b0Var.c()) : !m7qVar.equals(d3b0Var.c())) {
            z = true;
        }
        a.put(m7qVar.a, String.valueOf(m7qVar.r));
        return z;
    }

    public static final void c(OneVideoPlayer oneVideoPlayer, FrameSize frameSize) {
        if (frameSize == null) {
            frameSize = hk0.e.b;
        }
        oneVideoPlayer.b0(hk0.a(oneVideoPlayer.P(), null, frameSize, false, 13));
    }
}
