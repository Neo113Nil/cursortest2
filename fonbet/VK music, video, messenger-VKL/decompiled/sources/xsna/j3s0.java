package xsna;

import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import java.util.Objects;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.player.OneVideoPlayer;

/* compiled from: VideoAutoPlay.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class j3s0 extends FunctionReferenceImpl implements wzs<com.vk.libvideo.autoplay.a, com.vk.libvideo.autoplay.a, s3q0> {
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final s3q0 invoke(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
        d3b0 d3b0Var;
        OneVideoPlayer a;
        com.vk.libvideo.autoplay.a aVar3 = aVar;
        com.vk.libvideo.autoplay.a aVar4 = aVar2;
        VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.receiver;
        VideoAutoPlay.a aVar5 = VideoAutoPlay.q0;
        if (videoAutoPlay.g1()) {
            d3b0 d3b0Var2 = videoAutoPlay.p0;
            if (d3b0Var2 != null) {
                d3b0Var2.a();
            }
            Objects.toString(aVar3);
            Objects.toString(aVar4);
            new Exception();
        }
        boolean z = aVar3.a;
        boolean z2 = aVar4.a;
        SubtitlesConfigurationMode subtitlesConfigurationMode = aVar4.m;
        if (z != z2) {
            if (z2) {
                rzr0 d1 = videoAutoPlay.d1();
                if (d1 != null) {
                    d1.G();
                }
            } else {
                rzr0 d12 = videoAutoPlay.d1();
                if (d12 != null) {
                    d12.F();
                }
            }
        }
        videoAutoPlay.y.K0(aVar3, aVar4);
        if (aVar3.m != subtitlesConfigurationMode && (d3b0Var = videoAutoPlay.p0) != null && (a = d3b0Var.a()) != null) {
            videoAutoPlay.E1(a, subtitlesConfigurationMode);
        }
        videoAutoPlay.setVolume(videoAutoPlay.e1());
        if (((Boolean) videoAutoPlay.i0.getValue()).booleanValue() && aVar3.r != aVar4.r) {
            videoAutoPlay.y1();
        }
        return s3q0.a;
    }
}
