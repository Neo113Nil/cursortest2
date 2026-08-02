package xsna;

import com.ironsource.X3;
import com.vk.music.common.MusicPlaybackLaunchContext;
import kotlin.Pair;

/* compiled from: PodcastStatSenderWrapper.java */
/* loaded from: classes3.dex */
public final class kjb0 {
    public long a;
    public boolean b;
    public jjb0 c;
    public e2b0 d;

    public final void a(MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        e2b0 e2b0Var = this.d;
        jjb0 jjb0Var = this.c;
        if (jjb0Var != null) {
            float l = e2b0Var.q.l();
            com.vk.music.player.f fVar = e2b0Var.e;
            jjb0Var.c("podcast_play", true, musicPlaybackLaunchContext, l, pn00.k(new Pair("action", "pause"), new Pair(X3.i.L, Integer.valueOf(fVar != null ? fVar.h() / 1000 : 0))));
        }
    }
}
