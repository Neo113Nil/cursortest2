package one.video.player;

import android.os.SystemClock;
import one.video.player.OneVideoPlayer;
import xsna.cms0;
import xsna.hvo0;
import xsna.hzf0;

/* compiled from: BaseVideoPlayer.kt */
/* loaded from: classes8.dex */
public final class a implements f {
    public final /* synthetic */ BaseVideoPlayer a;

    public a(BaseVideoPlayer baseVideoPlayer) {
        this.a = baseVideoPlayer;
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
        cms0 cms0Var;
        BaseVideoPlayer baseVideoPlayer2 = this.a;
        hzf0 hzf0Var = baseVideoPlayer2.e;
        if (hzf0Var != null) {
            hzf0Var.i(baseVideoPlayer2, (cVar == null || (cms0Var = (cms0) cVar.c) == null) ? null : cms0Var.c());
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
        if (state2 != OneVideoPlayer.State.PLAYING) {
            BaseVideoPlayer baseVideoPlayer2 = this.a;
            hvo0 hvo0Var = baseVideoPlayer2.f;
            if (hvo0Var != null) {
                hvo0Var.b.b();
                baseVideoPlayer2.q0(hvo0Var.b.a());
                return;
            }
            return;
        }
        hvo0 hvo0Var2 = this.a.f;
        if (hvo0Var2 != null) {
            hvo0.b bVar = hvo0Var2.b;
            synchronized (bVar) {
                if (bVar.d != -1) {
                    return;
                }
                bVar.d = SystemClock.elapsedRealtime();
                bVar.sendMessage(bVar.obtainMessage(1, bVar));
            }
        }
    }
}
