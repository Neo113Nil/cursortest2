package xsna;

import com.vk.music.player.playback.PlaybackLaunchMeta;
import xsna.mb4;

/* compiled from: AudioAdLoader.kt */
/* loaded from: classes3.dex */
public final class ib4 implements izs<Throwable, s3q0> {
    public final /* synthetic */ PlaybackLaunchMeta b;
    public final /* synthetic */ g8x c;

    public ib4(jb4 jb4Var, PlaybackLaunchMeta playbackLaunchMeta, g8x g8xVar) {
        this.b = playbackLaunchMeta;
        this.c = g8xVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        mb4.a.a("not_received", null, this.b.b);
        this.c.e();
        return s3q0.a;
    }
}
