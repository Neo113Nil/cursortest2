package xsna;

import android.os.Bundle;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlaybackActionMeta;

/* compiled from: SnippetOrchestralPlayer.kt */
/* loaded from: classes3.dex */
public abstract class zbk0 extends z9 {
    private static final zbk0 STUB = new a(dx40.a.getSTUB(), new fck0(null, null, 7));
    public final dx40 c;
    public bck0 d;

    /* compiled from: SnippetOrchestralPlayer.kt */
    public static final class a extends zbk0 {
        @Override // xsna.zbk0
        public final MusicTrack i() {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zbk0(dx40 dx40Var, fck0 fck0Var) {
        fu80 fu80Var = fck0Var.b;
        go4 go4Var = fck0Var.a;
        e0a e0aVar = new e0a(dx40Var);
        this.b = e0aVar;
        xv40 xv40Var = new xv40(go4Var);
        xv40Var.d(e0aVar);
        this.a = new ko4(xv40Var, fu80Var, 1);
        this.c = dx40Var;
        this.d = new bck0((kx40) null, (Bundle) (0 == true ? 1 : 0), 7);
    }

    public abstract MusicTrack i();

    public final void j(int i) {
        e().m(null, i, false, false);
    }

    public void k(bck0 bck0Var) {
        this.d = bck0Var;
        ((ko4) this.a).I();
        this.c.u(bck0Var.a);
    }

    public void l(int i) {
        this.c.release(i);
        ((ko4) this.a).R();
    }

    public final void m(PlaybackActionMeta playbackActionMeta) {
        e().f(playbackActionMeta);
    }

    public void n(px40 px40Var) {
        this.c.p(px40Var);
    }

    public void o(int i) {
        e().stop(i);
    }
}
