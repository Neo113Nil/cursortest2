package xsna;

import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.bu;

/* compiled from: ActionHandler.kt */
/* loaded from: classes8.dex */
public final class k10 implements OneVideoPlayer.d {
    public final /* synthetic */ i10 a;

    public k10(i10 i10Var) {
        this.a = i10Var;
    }

    @Override // one.video.player.OneVideoPlayer.d
    public final void C(BaseVideoPlayer baseVideoPlayer, long j) {
        g2b0 g2b0Var;
        i10 i10Var = this.a;
        g2b0 g2b0Var2 = i10Var.e;
        if (g2b0Var2 == null || j != g2b0Var2.e) {
            if (g2b0Var2 != null) {
                g2b0Var = g2b0.a(g2b0Var2, null, j, baseVideoPlayer.getBufferedPosition(), 0L, baseVideoPlayer.i(), 1487);
            } else {
                g2b0Var = null;
            }
            i10Var.e = g2b0Var;
            i10Var.c(bu.c.C2623c.a);
        }
    }
}
