package xsna;

import java.util.Set;
import one.video.player.OneVideoPlayer;

/* compiled from: CancelLongRequestForbiddenProvider.kt */
/* loaded from: classes8.dex */
public final class op9 implements one.video.player.f {
    public static final Set<OneVideoPlayer.DiscontinuityReason> c = rl3.y0(new OneVideoPlayer.DiscontinuityReason[]{OneVideoPlayer.DiscontinuityReason.SEEK_ADJUSTMENT, OneVideoPlayer.DiscontinuityReason.SEEK});
    public final long a;
    public volatile Long b;

    public op9(long j) {
        this.a = j;
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
        if (c.contains(discontinuityReason)) {
            this.b = Long.valueOf(System.currentTimeMillis());
        }
    }
}
